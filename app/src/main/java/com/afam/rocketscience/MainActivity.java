package com.afam.rocketscience;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.afam.rocketscience.model.User;
import com.afam.rocketscience.model.UserFactory;

public class MainActivity extends AppCompatActivity {

    Button loginButton, callSignUp;
    EditText usernameInput, passwordInput;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        setBtnLogin();

//        callSignUp = findViewById(R.id.signup_screen);

    }

    public void setBtnLogin() {
        usernameInput = ((EditText) findViewById(R.id.etUsername));
        passwordInput = ((EditText) findViewById(R.id.etPassword));
        loginButton = (Button) findViewById(R.id.btnSignIn);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("info","username::: " + usernameInput + " & password::: " + passwordInput);
                if(usernameInput.getText().toString().equals("admin") && passwordInput.getText().toString().equals("admin")){
                    //correct password
                    Toast.makeText(MainActivity.this,"Username and Password is correct",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,Dashboard.class);
                    intent.putExtra("username",usernameInput.getText().toString());
                    startActivity(intent);
                }else {
                    //wrong password
                    Toast.makeText(MainActivity.this,"Wrong credentials",Toast.LENGTH_SHORT).show();
                }
            }
        });



    }


}