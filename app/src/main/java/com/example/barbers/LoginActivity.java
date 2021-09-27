package com.example.barbers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText Input_Email,Input_Password;
    Button kirimintent, kirimbundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Input_Email = findViewById(R.id.email);
        Input_Password = findViewById(R.id.password);
        kirimintent = findViewById(R.id.btn_login);

        kirimintent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendData1 = new Intent(LoginActivity.this,Dashboard.class);
                sendData1.putExtra("Data1",Input_Email.getText().toString());
                sendData1.putExtra("Data2",Input_Password.getText().toString());
                startActivity(sendData1);

            }
        });

    }
}