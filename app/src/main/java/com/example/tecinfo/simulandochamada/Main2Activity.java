package com.example.tecinfo.simulandochamada;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    SharedPreferences meusDados;
    public static final String mypreference = "call";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        meusDados = getSharedPreferences(mypreference, Context.MODE_PRIVATE);

        Button btncadastrar = findViewById(R.id.btn_cadastrar);
        final EditText novoemail = findViewById(R.id.edt_email1);
        final EditText novasenha = findViewById(R.id.edt_senha1);
        final EditText confirmarsenha = findViewById(R.id.edt_senha2);

        btncadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (novasenha.getText().toString().equals(confirmarsenha.getText().toString())) {
                    SharedPreferences.Editor editor = meusDados.edit();
                    editor.putString("email", novoemail.getText().toString());
                    editor.putString("senha", novasenha.getText().toString());
                    editor.commit();

                    Toast.makeText(getApplicationContext(), "Dados salvos", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "As senhas não conferem", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
