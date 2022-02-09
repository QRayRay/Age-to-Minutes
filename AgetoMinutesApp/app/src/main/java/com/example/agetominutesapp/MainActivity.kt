package com.example.agetominutesapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.ClickMeButton)
        val tvMyTextView = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        btnClickMe.setOnClickListener {
           timesClicked += 1

            tvMyTextView.text = timesClicked.toString()
            Toast.makeText(this, "NEW PR!" , Toast.LENGTH_LONG).show()
        }

    }
}
