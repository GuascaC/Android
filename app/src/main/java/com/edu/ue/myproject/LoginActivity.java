package com.edu.ue.myproject;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText EtUser, EtPass;
    Button btnLogin , btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.EtUser = findViewById(R.id.EtUser);
        this.EtPass = findViewById(R.id.EtPass);
        this.btnRegister = findViewById(R.id.btnRegister);
        this.btnLogin = findViewById(R.id.btnLogin);
    }
    public void Login(View view){
        String user = EtUser.getText().toString();
        String pass = EtPass.getText().toString();

        if(user.equals("")||pass.equals(""))
            Toast.makeText(LoginActivity.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
        else{/*
            Boolean checkuserpass = .checkusernamepassword(user, pass);
            if(checkuserpass==true){
                Toast.makeText(LoginActivity.this, "Sign in successfull", Toast.LENGTH_SHORT).show();
                Intent intent  = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
            }else{
                Toast.makeText(LoginActivity.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
            }
        */}
    }
public void Register(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}