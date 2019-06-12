package com.example.sundeiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button Login;
    EditText fname,lname,password,cpassword;
    TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fname =(EditText)findViewById(R.id.Fname);
        lname = (EditText)findViewById(R.id.Lastname);
        password = (EditText)findViewById(R.id.Password);
        cpassword = (EditText)findViewById(R.id.ConfirmPassword);
        register = (TextView)findViewById(R.id.Register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

    }
    public void openActivity2()
    {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);

    }

}
