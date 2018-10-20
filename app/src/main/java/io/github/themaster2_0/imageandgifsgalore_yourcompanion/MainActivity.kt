package io.github.themaster2_0.imageandgifsgalore_yourcompanion

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val foodButton = findViewById<Button>(R.id.foodButton)
        foodButton.setOnClickListener {
            val intent = Intent(this, FoodActivity::class.java)
            startActivity(intent)
        }

        val funnyFailsButton = findViewById<Button>(R.id.funnyFailsButton)
        funnyFailsButton.setOnClickListener {
            val intent = Intent(this, FunnyFailsActivity::class.java)
            startActivity(intent)
        }

        val catsButton = findViewById<Button>(R.id.catsButton)
        catsButton.setOnClickListener {
            val intent = Intent(this, CatsActivity::class.java)
            startActivity(intent)
        }

        val emojisButton = findViewById<Button>(R.id.emojisButton)
        emojisButton.setOnClickListener {
            val intent = Intent(this, EmojisActivity::class.java)
            startActivity(intent)
        }

        val dogsButton = findViewById<Button>(R.id.dogsButton)
        dogsButton.setOnClickListener {
            val intent = Intent(this, DogsActivity::class.java)
            startActivity(intent)
        }

        val sportButton = findViewById<Button>(R.id.sportButton)
        sportButton.setOnClickListener {
            val intent = Intent(this, SportActivity::class.java)
            startActivity(intent)
        }

        var test = 1
    }
}
