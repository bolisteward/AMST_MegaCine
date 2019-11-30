package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnEmpezar;
    Button btnPoliticas;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.btnEmpezar);
        Button btn2 = (Button)findViewById(R.id.btnPoliticas);
    }

    public void cambiarVentana(View view){

        Random rand = new Random();
        int n = rand.nextInt(4)+1;
        otraActivity(n);
    }

    public void ventanaPoliticas(View view){
        Intent a2 = new Intent(this , politicas.class);
        startActivity(a2);

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
