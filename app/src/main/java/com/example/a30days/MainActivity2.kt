package com.example.a30days

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        val BackButton=findViewById<Button>(R.id.btn2)
    BackButton.setOnClickListener {
        val intent=Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
    }
}