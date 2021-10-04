package com.mysecoundapplication.activate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity2 extends AppCompatActivity {

    EditText first_name,last_name,phone,address,DOB,gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        first_name = findViewById(R.id.edit_text1);
        last_name = findViewById(R.id.edit_text2);
        phone = findViewById(R.id.edit_text3);
        address = findViewById(R.id.edit_text4);
        DOB = findViewById(R.id.edit_text5);
        gender = findViewById(R.id.edit_text6);

        String name1 = getIntent().getStringExtra("key_name1");
        String name2 = getIntent().getStringExtra("key_name2");
        String number = getIntent().getStringExtra("key_name3");
        String addre = getIntent().getStringExtra("key_name4");
        String date = getIntent().getStringExtra("key_name5");
        String dateg = getIntent().getStringExtra("key_name6");

        first_name.setText(name1);
        last_name.setText(name2);
        phone.setText(number);
        address.setText(addre);
        DOB.setText(date);
        gender.setText(dateg);

    }
}
