package com.example.mistaxis;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Prueba extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);
    }

    public void irActividadRegistro(View vista){
        Intent intent = new Intent(Prueba.this, RegisterActivity.class);
        startActivity(intent);
    }

    public void irActividadRegistroTaxista(View vista){
        Intent intent = new Intent(Prueba.this,ActivityRegisterTaxista.class);
        startActivity(intent);
    }

    public void irActividadLogin(View vista){
        Intent intent = new Intent(Prueba.this, ActivityLogin.class);
        startActivity(intent);
    }
}