package com.example.barbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        TextView getdata1= findViewById(R.id.text_email);
        getdata1.setText("Email Anda: "+"\n"+getIntent().getStringExtra("Data1"));

        TextView getdata2= findViewById(R.id.text_password);
        getdata2.setText("Password Anda: "+"\n"+getIntent().getStringExtra("Data2"));

    }
}