package com.example.session1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpActivity extends AppCompatActivity { // Класс SignUpActivity используется для регистрации пользователя в приложении

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void onSignUp(View view) {
        startActivity(new Intent(this, MapsActivity.class));
    }
}