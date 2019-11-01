package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent=getIntent();
        String string=intent.getStringExtra("level");
        TextView text2=(TextView)findViewById(R.id.textView2);
        text2.setText(string);
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                EditText edittext = (EditText) findViewById(R.id.editText);
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("level", edittext .getText().toString());
                startActivity(intent);
            }
        });

    }
}
