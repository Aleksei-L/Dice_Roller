package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val rollButton: Button = findViewById(R.id.button)
		val myDice = Dice(6)

		rollButton.setOnClickListener {
			Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()

			val resultTextView: TextView = findViewById(R.id.textView)
			resultTextView.text = myDice.roll().toString()
		}
	}
}
