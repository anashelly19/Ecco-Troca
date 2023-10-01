package com.projeto.ecotroca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class formLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        getSupportActionBar().hide();
    }
}