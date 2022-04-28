package com.example.movierecs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MoviePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_page)

        val button = findViewById<Button>(R.id.button4)
        button.setOnClickListener{
            val intent = Intent(this, ShowRecs::class.java)
            startActivity(intent)
        }
    }
}