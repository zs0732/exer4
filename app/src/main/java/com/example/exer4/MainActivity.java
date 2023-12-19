package com.example.exer4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn4;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn4 = findViewById(R.id.btn4);

    }

    public void lol(View view) {
        x++;
        btn4.setText("This is a click number:" + x);
        if (x==7)
        {
            btn4.setText("BOOM!");
            x=0;
        }

    }
}