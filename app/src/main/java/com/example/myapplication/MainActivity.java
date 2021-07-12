
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button previewbtn;
    EditText name,age,address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        address = findViewById(R.id.address);
        previewbtn = findViewById(R.id.previewbtn);
        previewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sname = name.getText().toString();
                String sage = age.getText().toString();
                String saddress = address.getText().toString();
                Intent previewintent = new Intent(MainActivity.this,details.class);
                previewintent.putExtra("sname", sname);
                previewintent.putExtra("sage", sage);
                previewintent.putExtra("saddress", saddress);
                startActivity(previewintent);
            }
        });
    }

}