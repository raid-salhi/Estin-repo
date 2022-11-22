package com.example.estinrepository

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        supportActionBar!!.title="About"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        contactButton.setOnClickListener {

            val intent = Intent(this, Contact::class.java)
            startActivity(intent)
        }
        homeButton.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}