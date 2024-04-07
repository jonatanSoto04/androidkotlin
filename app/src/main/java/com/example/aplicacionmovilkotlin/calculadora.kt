package com.example.aplicacionmovilkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class calculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)
        val vol = findViewById<Button>(R.id.volver)
        vol.setOnClickListener {
            val calcula: Intent = Intent(
                this@calculadora,
                Resultado::class.java
            )
            startActivity(calcula)
        }
    }
}