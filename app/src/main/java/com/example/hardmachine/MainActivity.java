package com.example.hardmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_toast;
    TextView txt_contador;
    Button btn_contador;
    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_toast = (Button) findViewById(R.id.btn_toast);
        txt_contador = findViewById(R.id.txt_contador);
        btn_contador = (Button) findViewById(R.id.btn_contador);
        btn_contador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AumentarContador();
            }
        });
        btn_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hola Codigo 07", Toast.LENGTH_SHORT).show();
            }
        });


    }

    void AumentarContador() {
        contador++;
        txt_contador.setText(String.valueOf(contador));
    }
}
