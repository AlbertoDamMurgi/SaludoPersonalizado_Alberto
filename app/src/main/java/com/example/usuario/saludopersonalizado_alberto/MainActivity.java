package com.example.usuario.saludopersonalizado_alberto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private boolean primeravez = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonsaludo = (Button) findViewById(R.id.botonevento);

        botonsaludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView nombre = (TextView) findViewById(R.id.cajatextouno);

                TextView saludo = (TextView) findViewById(R.id.textosaludo);

                if(nombre.getText().toString().equals("")){

                    saludo.setText(R.string.introduce);

                }else {
                    saludo.setText("Hola, " + nombre.getText() + "!!");
                }



            }
        });

        TextView nombre = (TextView) findViewById(R.id.cajatextouno);

        nombre.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(primeravez){
                    TextView nombre = (TextView) findViewById(R.id.cajatextouno);
                    nombre.setText("");
                    primeravez=false;
                }
            }
        });


        Button iraotra = (Button) findViewById(R.id.btn_otraactivity);

        iraotra.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                TextView nombre = (TextView) findViewById(R.id.cajatextouno);

                Bundle mibundle = new Bundle();

                mibundle.putString("NOMBRE",nombre.getText().toString());

                Intent enviar = new Intent(MainActivity.this,Mensaje.class);

                enviar.putExtras(mibundle);



                startActivity(enviar);
            }
        });



    }






    public void saludar(View view){


        TextView nombre = (TextView) findViewById(R.id.cajatextouno);

        TextView saludo = (TextView) findViewById(R.id.textosaludo);





        saludo.setText("Hola, "+nombre.getText().toString()+"!!");



    }


}
