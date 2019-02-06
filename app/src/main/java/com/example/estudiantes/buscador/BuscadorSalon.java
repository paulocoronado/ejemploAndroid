package com.example.estudiantes.buscador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class BuscadorSalon extends AppCompatActivity {

    int adivina;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscador_salon);

        Random miRandom=new Random();
        adivina=miRandom.nextInt();

    }

    public void ejemplo(View miVista){

        EditText miTexto=(EditText) findViewById(R.id.cuadro);
        TextView etiqueta=(TextView) findViewById(R.id.texto);

        int numero=Integer.parseInt(miTexto.getText().toString());

        if(numero==adivina){
            etiqueta.setText("Has Ganado!!!");
        }else{
            if(numero>adivina){
                etiqueta.setText("Número mayor!!!");
            }else{
                etiqueta.setText("Número menor!!!");
            }
        }
    }

}
