package com.example.saitarun.firsthelloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    int c=0;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button) findViewById(R.id.button2);
        text=(TextView) findViewById(R.id.textview1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c++;
                text.setText(String.valueOf(c));

            }
        });


    }

    public void printToast(View view) {
        Toast.makeText(MainActivity.this, R.string.tMsg, Toast.LENGTH_SHORT).show();
    }
}
