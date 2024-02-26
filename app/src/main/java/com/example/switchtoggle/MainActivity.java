 package com.example.switchtoggle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;

 public class MainActivity extends AppCompatActivity
 {
     Switch sw;
     ToggleButton tb;
     Button bt;
     ConstraintLayout back;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw = findViewById(R.id.sw);
        tb = findViewById(R.id.tb);
        bt = findViewById(R.id.bt);

        back = findViewById(R.id.cl);



    }



     public void clicked3(View view)
     {
         if (sw.isChecked() && tb.isChecked())
             back.setBackgroundColor(0xFF03FF0D);
         else if (sw.isChecked() && (!tb.isChecked()))
             back.setBackgroundColor(0xFF0027FF);
         else if ((!sw.isChecked()) && tb.isChecked())
             back.setBackgroundColor(0XFFDA00FF);
         else
             back.setBackgroundColor(0xFFFF1100);
     }

     public void clicked1(View view) {
     }

     public void clicked2(View view) {
     }
 }