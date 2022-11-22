package com.example.estinrepository

import android.content.Intent
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()

        setContentView(R.layout.activity_main)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }


        Cp1Tag.setOnClickListener {
            showHide(cp1Layout)
        }
        Cp2Tag.setOnClickListener {
            showHide(cp2Layout)
        }
        Cs1Tag.setOnClickListener {
            Toast.makeText(this, "We're still working on it", Toast.LENGTH_LONG).show()
        }
        contactButton.setOnClickListener {

            val intent = Intent(this, Contact::class.java)
            startActivity(intent)
        }
        aboutButton.setOnClickListener {

            val intent = Intent(this, About::class.java)
            startActivity(intent)
        }
    }

    fun moduleClicked(view: View) {
        val but = view as TextView
        if (but.id == R.id.moduleS1_2cp7 || but.id == R.id.moduleS2_2cp7) {
            Toast.makeText(this, "We're still working on it", Toast.LENGTH_LONG).show()
        } else {

            but.movementMethod = LinkMovementMethod.getInstance()
        }
    }

    fun showHide(view: View) {
        view.visibility = if (view.visibility == View.VISIBLE) {
            View.GONE
        } else {
            View.VISIBLE
        }
    }

}

