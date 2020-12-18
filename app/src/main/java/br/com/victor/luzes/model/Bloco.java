package br.com.victor.luzes.model;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Bloco {

    ArrayList<Sala> salas;

    String nome;

    boolean lampadaAcesa;

    public Bloco(ArrayList<Sala> salas, String nome) {
        this.salas = salas;
        this.nome = nome;
        this.lampadaAcesa = false;
    }

    public void apagaLampada() {
        this.salas.forEach(Sala::apagaLampada);
    }

    public void acendeLampada() {
        this.salas.forEach(Sala::acendeLampada);
    }

    public boolean getEstadoLampada() {
        return this.salas.stream().map(Sala::getEstadoLampada).collect(Collectors.toList()).contains(true);
    }

    public static Bloco createBloco(String nome) {
        Sala sala1 = new Sala(101);
        Sala sala2 = new Sala(102);
        Sala sala3 = new Sala(103);
        //apenas uma sala com a luz ligada
        sala1.acendeLampada();
        ArrayList<Sala> salas = new ArrayList<>();
        salas.add(sala1);
        salas.add(sala2);
        salas.add(sala3);

        return new Bloco(salas, nome);
    }
}
