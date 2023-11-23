package com.example.person_27_28;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = (TextView) findViewById(R.id.TW);
        String name = getIntent().getStringExtra("name").toString();
        String lastName = getIntent().getStringExtra("lastName").toString();

        textView.setText("Ваше имя: " + name + "\n Ваша фамилия: " + lastName);
    }
}