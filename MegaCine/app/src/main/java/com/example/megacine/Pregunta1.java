package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Pregunta1 extends AppCompatActivity {

    private Button btnAsk_1, btnAsk_2, btnAsk_3, btnAsk_4;
    private TextView txtPregunta;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta1);

        btnAsk_1 = findViewById(R.id.btnAsk_1);
        btnAsk_2 = findViewById(R.id.btnAsk_2);
        btnAsk_3 = findViewById(R.id.btnAsk_3);
        btnAsk_4 = findViewById(R.id.btnAsk_4);
        txtPregunta = findViewById(R.id.textPregunta);

        i = getIntent().getIntExtra("i",0);

    }

    public void btn_Pregunta (View view){
        Random rand = new Random();
        int n = rand.nextInt(4)+1;

        if (view.getId()==R.id.btnAsk_4){
            i+=1;
            if( i==5){
                Intent intent = new Intent(this, pantallaFinal.class);
                startActivity(intent);
            }else{
                otraActivity(n);
            }


        }else{
            Intent intent = new Intent(this, PantallaPerdido.class);
            intent.putExtra("i", i);
            startActivity(intent);
        }

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
