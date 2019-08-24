package com.example.hardmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class Ejemplo3 extends AppCompatActivity {
    Button btn;
    LinearLayout line;
    TextView texto;
    int numero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo3);
        btn = findViewById(R.id.btn_contador);
        //line = findViewById(R.id.line);
        texto = new TextView(getApplicationContext());
        texto.setText("marco");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (numero < 20){
                    numero++;
                    texto = new TextView(getApplicationContext());
                    texto.setText("hola " + numero);
                    texto.setTextSize(20);
                    line.addView(texto);
                }else{
                    Toast.makeText(Ejemplo3.this,"Hasta aqui llego", Toast.LENGTH_LONG).show();
                }


            }
        });
    }
}
