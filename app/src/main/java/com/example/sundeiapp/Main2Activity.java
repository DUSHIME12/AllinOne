package com.example.sundeiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    Button login;
    EditText username,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        login =(Button)findViewById(R.id.etlogin);
        username =(EditText)findViewById(R.id.etusername);
        password = (EditText)findViewById(R.id.etPassword);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }
    public void openActivity2()
    {
        if(username.getText().toString().equalsIgnoreCase("musa")&&password.getText().toString().equalsIgnoreCase("zaburi146"))
        {
            Intent intent = new Intent(this,Main3Activity.class);
            startActivity(intent);


        }
    }
}
