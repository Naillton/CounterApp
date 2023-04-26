package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tView: TextView = findViewById(R.id.textview)
        val btn: Button = findViewById(R.id.button)
        var count: Int = 0

        btn.setOnClickListener {
            count++
            tView.text = count.toString()
        }
    }
}