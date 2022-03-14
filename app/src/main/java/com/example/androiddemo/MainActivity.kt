package com.example.androiddemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var etInput : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("--demo", "calling onCreate")
        setContentView(R.layout.activity_main)

        etInput = findViewById<EditText>(R.id.etInput)
    }

    override fun onStart() {
        // call superclass constructor
        super.onStart();
        Log.d("--demo", "calling onSart")
    }

    override fun onRestart() {
        // call superclass constructor
        super.onRestart();
        Log.d("--demo", "calling onRestart")
    }

    override fun onResume() {
        // call superclass constructor
        super.onResume();
        Log.d("--demo", "calling onResume")
    }

    override fun onPause() {
        // call superclass constructor
        super.onPause();
        Log.d("--demo", "calling onPause")
    }

    override fun onStop() {
        // call superclass constructor
        super.onStop();
        Log.d("--demo", "calling onStop")
    }

    override fun onDestroy() {
        // call superclass constructor
        super.onDestroy();
        Log.d("--demo", "calling onDestroy")
    }

    fun nextActivity(view: View) {
        val input = etInput.text.toString()
        val intent = Intent(this, NextActivity::class.java).apply {
            putExtra("inputValue", input)
        }
        startActivity(intent)
    }

}