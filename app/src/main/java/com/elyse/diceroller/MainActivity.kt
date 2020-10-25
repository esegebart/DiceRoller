package com.elyse.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's Roll!"
        rollButton.setOnClickListener{
            // Method that will be called when the button is clicked
            rollDice()
        }
        // Make the dice_image ImageView show the dice image
        diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice() {
        // Get a random integer from 1-6 in rollDice
        val randomInt = Random().nextInt(6) + 1
        // Choose the correct image based on the number using a when expression
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        // Set the image of the dice of drawable resource
        diceImage.setImageResource(drawableResource)
    }


}