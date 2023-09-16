package com.akash.myfirstdemoapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button);
        val text = findViewById<TextView>(R.id.textView);
        var counter =0;
        button.setOnClickListener {
            counter = counter + 1;
            text.text=counter.toString();
            Toast.makeText(this,"Button Clicked",Toast.LENGTH_LONG).show();
        }

    }
}