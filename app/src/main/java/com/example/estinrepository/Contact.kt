package com.example.estinrepository

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.ActionBar
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_main.*

class Contact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title="Contact"
        setContentView(R.layout.activity_contact)
        val button = findViewById<Button>(R.id.sendButton)
        val etSubject = findViewById<TextInputEditText>(R.id.etsubject)
        val etBody = findViewById<EditText>(R.id.body)
        val email= "salhiraid2003@gmail.com"
        button.setOnClickListener {
            val subject = etSubject.text.toString()
            val body = etBody.text.toString()

            intent = Intent(Intent.ACTION_SEND)
            intent.apply {
                data = Uri.parse("mailto:salhiraid2003@gmail.com")
                putExtra(Intent.EXTRA_EMAIL,arrayOf("salhiraid2003@gmail.com"))
                putExtra(Intent.EXTRA_SUBJECT, subject)
                putExtra(Intent.EXTRA_TEXT, body)
                type ="text/plain"

            }
            startActivity(intent)
        }
        homeButton.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        aboutButton.setOnClickListener {

            val intent = Intent(this, About::class.java)
            startActivity(intent)
        }

    }

}