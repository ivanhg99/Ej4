package com.example.ej1inter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    var randomInt = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val rollButton1: Button = findViewById(R.id.roll_button1)
        rollButton1.setOnClickListener { rollDi() }
    }

    private fun rollDice() {
        randomInt = Random().nextInt(6) + 1
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    private fun rollDi() {
        val resultText: TextView = findViewById(R.id.result_text)
        if (randomInt != 6 && randomInt != 0) {
            val randomInt = randomInt + 1
            resultText.text = randomInt.toString()
        }
    }
}