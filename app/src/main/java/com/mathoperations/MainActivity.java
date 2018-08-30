package com.mathoperations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mathoperations.arithmetics.MyMath;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyMath.Plus(10,10);
    }
}
