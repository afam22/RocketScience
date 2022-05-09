package com.afam.rocketscience;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    EditText firstName;
    EditText lastName;
    EditText username;
    EditText password;
    Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        firstName = findViewById(R.id.signup_first_name);
        lastName = findViewById(R.id.signup_last_name);
        username = findViewById(R.id.signup_username);
        password = findViewById(R.id.signup_password);
        submit = findViewById(R.id.submit_btn);

//        submit.setOnClickListener();

    }
}