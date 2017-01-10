package com.example.teo.a21startactivityforresult;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //khái báo Button và textView
    Button button1;
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ánh xạ
        textView1 = (TextView) findViewById(R.id.textView1);
        button1 = (Button) findViewById(R.id.button1);
    }
}
