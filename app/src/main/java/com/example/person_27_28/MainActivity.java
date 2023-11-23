package com.example.person_27_28;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.BT);
        EditText editText1 = (EditText) findViewById(R.id.ET1);
        EditText editText2 = (EditText) findViewById(R.id.ET2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("name", editText1.getText().toString());
                i.putExtra("lastName", editText2.getText().toString());
                startActivity(i);
            }
        });
    }
}