package br.com.victor.luzes;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import br.com.victor.luzes.model.Bloco;

import static br.com.victor.luzes.model.Bloco.createBloco;

public class MainActivity extends AppCompatActivity {
    private final int VERDE = Color.GREEN;
    private final int VERMELHO = Color.RED;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Bloco bloco1 = createBloco("Bloco 1");
        Bloco bloco2 = createBloco("Bloco 2");
        Bloco bloco3 = createBloco("Bloco 3");

        TextView cor1 = findViewById(R.id.cor1);
        TextView cor2 = findViewById(R.id.cor2);
        TextView cor3 = findViewById(R.id.cor3);

        Switch switch1 = findViewById(R.id.switch1);
        Switch switch2 = findViewById(R.id.switch2);
        Switch switch3 = findViewById(R.id.switch3);

        if (bloco1.getEstadoLampada()) {
            cor1.setBackgroundColor(VERMELHO);
            switch1.setChecked(true);
        } else {
            cor1.setBackgroundColor(VERDE);
        }

        if (bloco2.getEstadoLampada()) {
            cor2.setBackgroundColor(VERMELHO);
            switch2.setChecked(true);
        } else {
            cor2.setBackgroundColor(VERDE);
        }

        if (bloco3.getEstadoLampada()) {
            cor3.setBackgroundColor(VERMELHO);
            switch3.setChecked(true);
        } else {
            cor3.setBackgroundColor(VERDE);
        }


        switch1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                bloco1.acendeLampada();
                cor1.setBackgroundColor(VERMELHO);
            } else {
                bloco1.apagaLampada();
                cor1.setBackgroundColor(VERDE);
            }
        });

        switch2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                bloco2.acendeLampada();
                cor2.setBackgroundColor(VERMELHO);
            } else {
                bloco2.apagaLampada();
                cor2.setBackgroundColor(VERDE);
            }
        });

        switch3.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                bloco3.acendeLampada();
                cor3.setBackgroundColor(VERMELHO);
            } else {
                bloco3.apagaLampada();
                cor3.setBackgroundColor(VERDE);
            }
        });


    }
}