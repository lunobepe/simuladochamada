package com.example.tecinfo.simulandochamada;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.net.sip.SipSession;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    String memoria = "";
    TextView txtnumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        txtnumero = findViewById(R.id.display);

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

        n0.setOnClickListener(myListener);
        n1.setOnClickListener(myListener);
        n2.setOnClickListener(myListener);
        n3.setOnClickListener(myListener);
        n4.setOnClickListener(myListener);
        n5.setOnClickListener(myListener);
        n6.setOnClickListener(myListener);
        n7.setOnClickListener(myListener);
        n8.setOnClickListener(myListener);
        n9.setOnClickListener(myListener);
        velha.setOnClickListener(myListener);
        asteristico.setOnClickListener(myListener);
        btnapagar.setOnClickListener(myListener);
        btnligar.setOnClickListener(myListener);

    }

    private View.OnClickListener myListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case  R.id.btn_0:
                    setDisplayText("0");
                    break;
                case  R.id.btn_1:
                    setDisplayText("1");
                    break;
                case  R.id.btn_2:
                    setDisplayText("2");
                    break;
                case  R.id.btn_3:
                    setDisplayText("3");
                    break;
                case  R.id.btn_4:
                    setDisplayText("4");
                    break;
                case  R.id.btn_5:
                    setDisplayText("5");
                    break;
                case  R.id.btn_6:
                    setDisplayText("6");
                    break;
                case  R.id.btn_7:
                    setDisplayText("7");
                    break;
                case  R.id.btn_8:
                    setDisplayText("8");
                    break;
                case  R.id.btn_9:
                    setDisplayText("9");
                    break;
                case  R.id.btnasteristico:
                    setDisplayText("*");
                    break;
                case  R.id.btnvelha:
                    setDisplayText("#");
                    break;
                case R.id.btn_apagar:
                    if(memoria.length() > 0){
                        memoria = memoria.substring(0, memoria.length() -1);
                        txtnumero.setText(memoria);
                    }
                    break;
                case R.id.btn_ligar:
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + memoria));

                    if(ActivityCompat.checkSelfPermission(Main3Activity.this, Manifest.permission.CALL_PHONE)
                            != PackageManager.PERMISSION_GRANTED){

                        ActivityCompat.requestPermissions(Main3Activity.this,
                                new String[]{Manifest.permission.CALL_PHONE}, 0);
                    }

                    startActivity(intent);
                    break;
            }
        }
    };

    private void setDisplayText(String valor) {
        memoria = memoria + valor;
        txtnumero.setText(memoria);
    }
}
