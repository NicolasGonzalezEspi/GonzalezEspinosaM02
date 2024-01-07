package com.vedruna.gonzalezespinosa01;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String valorRecibido = intent.getStringExtra("valor");

        TextView textViewBienvenida = findViewById(R.id.textView3);

        if (valorRecibido != null && !valorRecibido.isEmpty()) {
            textViewBienvenida.setText(valorRecibido);
        }
    }
}
