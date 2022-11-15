package com.example.primera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class segundaActividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);
    }

    public void siquienteActividad(View view) {
        Intent i= new Intent(getApplicationContext(), MainActivity3.class);
        startActivity(i);
    }
}