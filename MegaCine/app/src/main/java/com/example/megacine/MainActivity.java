package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
        Intent intent = new Intent(this,Pregunta1.class);
        intent.putExtra("i",i);
        startActivity(intent);
    }

    public void ventanaPoliticas(View view){
        Intent a2 = new Intent(this , politicas.class);
        startActivity(a2);

    }
    public void ventanaPerdido(View view){
        Intent a3 = new Intent(this,PantallaPerdido.class);
        startActivity(a3);
    }


}
