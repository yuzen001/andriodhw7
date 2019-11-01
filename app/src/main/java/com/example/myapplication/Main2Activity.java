package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        String string=intent.getStringExtra("level");
        TextView text2=(TextView)findViewById(R.id.tv1);
        final Button button = (Button) findViewById(R.id.button);
        text2.setText(string);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText edittext = (EditText) findViewById(R.id.editText);
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                intent.putExtra("level", edittext .getText().toString());
                startActivity(intent);
            }
        });

    }
}