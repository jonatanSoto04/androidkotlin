package com.example.aplicacionmovilkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ingre = findViewById<Button>(R.id.volver)
        ingre.setOnClickListener {
            val calcula = Intent(
                this@MainActivity,
                Resultado::class.java
            )
            startActivity(calcula)
        }
    }
}