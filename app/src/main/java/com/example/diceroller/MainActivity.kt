package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val rollButton: Button = findViewById(R.id.button)

		rollButton.setOnClickListener { rollDices() }

		rollDices()
	}
	private fun rollDices() {
		val myFirstDice = Dice(6)
		val mySecondDice = Dice(6)
		val firstDiceImage: ImageView = findViewById(R.id.imageView)
		val secondDiceImage: ImageView = findViewById(R.id.imageView2)
		val firstDiceRoll = myFirstDice.roll()
		val secondDiceRoll = mySecondDice.roll()

		val firstDrawableResource = when (firstDiceRoll) {
			1 -> R.drawable.dice_1
			2 -> R.drawable.dice_2
			3 -> R.drawable.dice_3
			4 -> R.drawable.dice_4
			5 -> R.drawable.dice_5
			else -> R.drawable.dice_6
		}

		val secondDrawableResource = when (secondDiceRoll) {
			1 -> R.drawable.dice_1
			2 -> R.drawable.dice_2
			3 -> R.drawable.dice_3
			4 -> R.drawable.dice_4
			5 -> R.drawable.dice_5
			else -> R.drawable.dice_6
		}

		firstDiceImage.setImageResource(firstDrawableResource)
		firstDiceImage.contentDescription = firstDiceRoll.toString()

		secondDiceImage.setImageResource(secondDrawableResource)
		secondDiceImage.contentDescription = secondDiceRoll.toString()
	}
}

