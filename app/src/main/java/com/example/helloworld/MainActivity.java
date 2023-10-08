package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView helloText;
    private Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloText=(TextView) findViewById(R.id.helloText);
        btnStart=(Button) findViewById(R.id.btnStart);
    }

    public void onBtnStartClick(View view) {
        helloText.setVisibility(View.VISIBLE);
        btnStart.setVisibility(View.INVISIBLE);
        btnStart.setClickable(false);
    }
}