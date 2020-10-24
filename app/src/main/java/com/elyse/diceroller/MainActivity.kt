package com.elyse.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's Roll!"
        rollButton.setOnClickListener{
            // Method that will be called when the button is clicked
            rollDice()
        }
    }

    private fun rollDice() {
        // Make the result_text TextView show the random integer
        val resultText: TextView = findViewById(R.id.result_text)
        // Get a random integer from 1-6 in rollDice
        val randomInt = Random().nextInt(6) + 1

        resultText.text = randomInt.toString()
    }


}