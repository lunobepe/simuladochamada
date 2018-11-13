package com.example.tecinfo.simulandochamada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView txtnumero = findViewById(R.id.display);
        Button btnapagar = findViewById(R.id.btn_apagar);
        Button btnligar = findViewById(R.id.btn_ligar);
        Button n0 = findViewById(R.id.btn_0);
        Button n1 = findViewById(R.id.btn_1);
        Button n2 = findViewById(R.id.btn_2);
        Button n3 = findViewById(R.id.btn_3);
        Button n4 = findViewById(R.id.btn_4);
        Button n5 = findViewById(R.id.btn_5);
        Button n6 = findViewById(R.id.btn_6);
        Button n7 = findViewById(R.id.btn_7);
        Button n8 = findViewById(R.id.btn_8);
        Button n9 = findViewById(R.id.btn_9);
        Button asteristico = findViewById(R.id.btnasteristico);
        Button velha = findViewById(R.id.btnvelha);


    }
}
