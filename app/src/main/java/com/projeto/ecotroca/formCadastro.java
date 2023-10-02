package com.projeto.ecotroca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class formCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);

        getSupportActionBar().hide();
    }
}