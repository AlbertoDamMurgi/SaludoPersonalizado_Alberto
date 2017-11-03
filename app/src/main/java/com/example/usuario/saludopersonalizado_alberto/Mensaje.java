package com.example.usuario.saludopersonalizado_alberto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Mensaje extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje);

        Bundle aux = new Bundle();

        TextView saludo = (TextView) findViewById(R.id.tv_saludo);

        saludo.setText("Saludos!! "+getIntent().getExtras().getString("NOMBRE"));

       // Log.e("error",aux.getString("NOMBRE").toString());

    }
}
