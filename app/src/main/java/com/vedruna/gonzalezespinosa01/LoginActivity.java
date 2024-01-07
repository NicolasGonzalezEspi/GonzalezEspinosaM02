package com.vedruna.gonzalezespinosa01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private TextView mensajeBienvenida;

    private static final String USUARIO_CORRECTO = "admin";
    private static final String CONTRASENA_CORRECTA = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mensajeBienvenida = findViewById(R.id.textView);
    }

    public void login(View view) {
        EditText nombreEditText = findViewById(R.id.editTextTextPassword);
        EditText contrasenaEditText = findViewById(R.id.editTextTextPassword2);

        String nombre = nombreEditText.getText().toString();
        String contrasena = contrasenaEditText.getText().toString();

        if (nombre.equals(USUARIO_CORRECTO) && contrasena.equals(CONTRASENA_CORRECTA)) {
            String valor = "Hola " + USUARIO_CORRECTO;
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("valor", valor);
            startActivity(intent);
        } else {
            mensajeBienvenida.setText("Usuario o contraseña incorrecta");
        }
    }
}
