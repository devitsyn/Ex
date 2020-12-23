package com.example.session1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignInActivity extends AppCompatActivity { // Класс SignInActivity используется для входа пользователя в приложение

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_Session1); // Отображает загрузочный экран
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
    }

    public void onCreateAccount(View view) {
        startActivity(new Intent(this, SignUpActivity.class)); // Метод переводит пользоаптеля на экран регистрации
    }

    public void onSignUp(View view) {

    }

    public void onForgotPassword(View view) {
    }

    public void onSignIn(View view) {
        startActivity(new Intent(this, MapsActivity.class));
    }

}
