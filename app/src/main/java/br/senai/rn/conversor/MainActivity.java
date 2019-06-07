package br.senai.rn.conversor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText C;
    private TextView F;
    private TextView K;
    private Button FA;
    private Button KE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciarComponentes();
        definirEventos();
    }
    private void iniciarComponentes() {
        C = findViewById(R.id.Campo_C);
        F = findViewById(R.id.Campo_F);
        K = findViewById(R.id.Campo_K);
        FA = findViewById(R.id.Bt_F);
        KE = findViewById(R.id.Bt_K);

    }


    private void definirEventos() {
        FA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conversorF();

            }
        });
        KE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conversorK();

            }
        });


    }

    private void conversorK() {
        float converter = Float.valueOf(C.getText().toString());
        float v = (float)(converter + 273.15);
        K.setText(v + "K");

    }

    private void conversorF() {
        float converter = Float.valueOf(C.getText().toString());
        float v = (float)(converter * 9 / 5 )+32;
        F.setText(v + "ºF");

    }


}
