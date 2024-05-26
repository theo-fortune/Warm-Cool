package com.example.travelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide();
        val buttonHot = findViewById<Button>(R.id.btnHot);
        val buttonCool = findViewById<Button>(R.id.btnCool);
        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout);

        buttonHot.setOnClickListener() {
            //* I want to change the background color of the app to red
            linearLayout.setBackgroundColor(R.color.black)
        }
        buttonCool.setOnClickListener() {
            //* I want to change the background color of the app to blue
            linearLayout.setBackgroundColor(com.google.android.material.R.color.material_blue_grey_800);
        }
    }
}