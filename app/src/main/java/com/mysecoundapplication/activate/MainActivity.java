package com.mysecoundapplication.activate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText first_name,last_name,phone,address,DOB;
    Button button_register;
    RadioButton radioButton;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first_name = findViewById(R.id.edit_text1);
        last_name = findViewById(R.id.edit_text2);
        phone = findViewById(R.id.edit_text3);
        address = findViewById(R.id.edit_text4);
        DOB = findViewById(R.id.edit_text5);
        button_register = findViewById(R.id.button_register);
        radioGroup = findViewById(R.id.radio_group);

        button_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name1 = first_name.getText().toString();
                String name2 = last_name.getText().toString();
                String number = phone.getText().toString();
                String addre = address.getText().toString();
                String date = DOB.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("key_name1",name1);
                intent.putExtra("key_name2",name2);
                intent.putExtra("key_name3",number);
                intent.putExtra("key_name4",addre);
                intent.putExtra("key_name5",date);
                startActivity(intent);
            }
        });

    }
}