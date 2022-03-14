package com.example.androiddemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class NextActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            Log.d("--next", "calling onCreate Next")
            setContentView(R.layout.activity_next)

            val inputValue = intent.getStringExtra("inputValue")
            val tvDisplay = findViewById<TextView>(R.id.tvDisplay).apply {
                text = inputValue
            }
        }

}