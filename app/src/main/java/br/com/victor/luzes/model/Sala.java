package br.com.victor.luzes.model;

public class Sala {

    int numero;

    boolean lampadaAcesa;

    public Sala(int numero) {
        this.numero = numero;
        this.lampadaAcesa = false;
    }

    protected void apagaLampada() {
        this.lampadaAcesa = false;
    }

    protected void acendeLampada() {
        this.lampadaAcesa = true;
    }

    protected boolean getEstadoLampada() {
        return this.lampadaAcesa;
    }

}
