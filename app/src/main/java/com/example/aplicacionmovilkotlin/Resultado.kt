package com.example.aplicacionmovilkotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val pantalla = findViewById<TextView>(R.id.pantalla)
        val sum = findViewById<Button>(R.id.sum)
        val multi = findViewById<Button>(R.id.multi)
        val divi = findViewById<Button>(R.id.divi)
        val res = findViewById<Button>(R.id.res)
        val n1 = findViewById<Button>(R.id.n1)
        val n2 = findViewById<Button>(R.id.n2)
        val n3 = findViewById<Button>(R.id.n3)
        val n4 = findViewById<Button>(R.id.n4)
        val n5 = findViewById<Button>(R.id.n5)
        val n6 = findViewById<Button>(R.id.n6)
        val n7 = findViewById<Button>(R.id.n7)
        val n8 = findViewById<Button>(R.id.n8)
        val n9 = findViewById<Button>(R.id.n9)
        val n0 = findViewById<Button>(R.id.n0)
        val resultado = findViewById<Button>(R.id.resultado)
        val fibo = findViewById<Button>(R.id.fibo)
        val facto = findViewById<Button>(R.id.factor)
        fibo.setOnClickListener {
            val fibon = Intent(
                this@Resultado,
                MainActivity::class.java
            )
            startActivity(fibon)
        }
        facto.setOnClickListener {
            val facto = Intent(this@Resultado, calculadora::class.java)
            startActivity(facto)
        }
        sum.setOnClickListener {
            val button = sum.getText().toString()
            val currentText = pantalla.getText().toString()
            pantalla.text = currentText + button
        }
        res.setOnClickListener {
            val button = res.getText().toString()
            val currentText = pantalla.getText().toString()
            pantalla.text = currentText + button
        }
        multi.setOnClickListener {
            val button = multi.getText().toString()
            val currentText = pantalla.getText().toString()
            pantalla.text = currentText + button
        }
        divi.setOnClickListener {
            val button = divi.getText().toString()
            val currentText = pantalla.getText().toString()
            pantalla.text = currentText + button
        }
        n1.setOnClickListener {
            val button = n1.getText().toString()
            val currentText = pantalla.getText().toString()
            pantalla.text = currentText + button
        }
        n2.setOnClickListener {
            val button = n2.getText().toString()
            val currentText = pantalla.getText().toString()
            pantalla.text = currentText + button
        }
        n3.setOnClickListener {
            val button = n3.getText().toString()
            val currentText = pantalla.getText().toString()
            pantalla.text = currentText + button
        }
        n4.setOnClickListener {
            val button = n4.getText().toString()
            val currentText = pantalla.getText().toString()
            pantalla.text = currentText + button
        }
        n5.setOnClickListener {
            val button = n5.getText().toString()
            val currentText = pantalla.getText().toString()
            pantalla.text = currentText + button
        }
        n6.setOnClickListener {
            val button = n6.getText().toString()
            val currentText = pantalla.getText().toString()
            pantalla.text = currentText + button
        }
        n7.setOnClickListener {
            val button = n7.getText().toString()
            val currentText = pantalla.getText().toString()
            pantalla.text = currentText + button
        }
        n8.setOnClickListener {
            val button = n8.getText().toString()
            val currentText = pantalla.getText().toString()
            pantalla.text = currentText + button
        }
        n8.setOnClickListener {
            val button = n8.getText().toString()
            val currentText = pantalla.getText().toString()
            pantalla.text = currentText + button
        }
        n9.setOnClickListener {
            val button = n9.getText().toString()
            val currentText = pantalla.getText().toString()
            pantalla.text = currentText + button
        }
        n0.setOnClickListener {
            val button = n0.getText().toString()
            val currentText = pantalla.getText().toString()
            pantalla.text = currentText + button
        }
        resultado.setOnClickListener(View.OnClickListener {
            val input = pantalla.getText().toString() // Obtén el texto de la pantalla
            val values = input.split("[+\\-*/]".toRegex()).dropLastWhile { it.isEmpty() }
                .toTypedArray() // Separa los valores basados en operadores matemáticos
            if (values.size == 2) { // Verifica que se ingresó una operación válida
                val num1 = values[0].toDouble()
                val num2 = values[1].toDouble()
                val operator = input[values[0].length] // Captura el operador
                var result = 0.0
                when (operator) {
                    '+' -> result = num1 + num2
                    '-' -> result = num1 - num2
                    '*' -> result = num1 * num2
                    '/' -> if (num2 != 0.0) {
                        result = num1 / num2
                    } else {
                        pantalla.text =
                            "Error: División entre cero" // Manejo de división entre cero
                        return@OnClickListener
                    }

                    else -> {
                        pantalla.text = "Error: Operador inválido"
                        return@OnClickListener
                    }
                }
                pantalla.text = result.toString() // Muestra el resultado en el TextView
            } else {
                pantalla.text = "Error: Entrada inválida"
            }
        })
    }
}