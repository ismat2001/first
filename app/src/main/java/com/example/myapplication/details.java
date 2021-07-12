package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class details extends AppCompatActivity {
    Intent previewintent;
    String fetchedname,fetchedage,fetchedaddress;
    TextView previewing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        previewing = findViewById(R.id.previewing);
        fetchedname=getIntent().getExtras().getString("sname");
        fetchedage=getIntent().getExtras().getString("sage");
        fetchedaddress=getIntent().getExtras().getString("saddress");

    previewing.setText("NAME:"+fetchedname+"\n AGE:"+fetchedage+"\n ADDRESS:"+fetchedaddress);
    }
}