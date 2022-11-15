package com.example.primera;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto= findViewById(R.id.textoId);
        texto.setText("Hola");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("inicio", "Estoy en onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("inicio", "mensaje OnResumen");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("inicio", "mensaje OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("inicio", "mensaje OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("inicio", "mensaje OnDestroy");
    }

    public void darmensaje(View view) {
        Toast.makeText(getApplicationContext(),"Mensaje", Toast.LENGTH_SHORT).show();
    }

    public void cambiartexto(View view) {
        texto= findViewById(R.id.textoId);
        texto.setText("Adios");
    }


    public void abrirsegunda(View view) {
        Intent i= new Intent(getApplicationContext(), segundaActividad.class);
        startActivity(i);
    }
}