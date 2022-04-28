package com.example.movierecs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recbutton = findViewById<Button>(R.id.RecsButton)
        recbutton.setOnClickListener{
            val intent = Intent(this, ShowRecs::class.java)
            startActivity(intent)
        }

        val searchbutton = findViewById<Button>(R.id.searchbutton)
        searchbutton.setOnClickListener{
            val intent = Intent(this, search::class.java)
            startActivity(intent)
        }
    }
}