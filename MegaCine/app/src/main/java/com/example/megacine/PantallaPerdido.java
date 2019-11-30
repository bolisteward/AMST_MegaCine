package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class PantallaPerdido extends AppCompatActivity {

    Button btnJugar;
    Button btnSalir;
    TextView textView3;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_perdido);
        btnJugar = (Button)findViewById(R.id.btnVolverJugar);
        btnSalir = (Button)findViewById(R.id.btnSalir);
        textView3= (TextView) findViewById(R.id.textView3);

        i = getIntent().getIntExtra("i",0);
        textView3.setText("Has logrado alcanzar "+i+ " aciertos");

    }

    public void salir(View view){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void volverJugar(View view){
        i=0;
        Random rand = new Random();
        int n = rand.nextInt(4)+1;
        otraActivity(n);
    }


    public void otraActivity(int n){
        if (n==1) {
            Intent intent = new Intent(this, Pregunta1.class);
            intent.putExtra("i", i);
            startActivity(intent);
        }
        if (n==2) {
            Intent intent = new Intent(this, Pregunta2.class);
            intent.putExtra("i", i);
            startActivity(intent);
        }
        if (n==3) {
            Intent intent = new Intent(this, Pregunta3.class);
            intent.putExtra("i", i);
            startActivity(intent);
        }
        if (n==4) {
            Intent intent = new Intent(this, Pregunta4.class);
            intent.putExtra("i", i);
            startActivity(intent);
        }
        if (n==5) {
            Intent intent = new Intent(this, Pregunta5.class);
            intent.putExtra("i", i);
            startActivity(intent);
        }
    }




}