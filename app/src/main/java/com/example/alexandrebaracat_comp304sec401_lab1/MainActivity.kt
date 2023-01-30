package com.example.alexandrebaracat_comp304sec401_lab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var loginButton: Button
    lateinit var lifeCycleButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usernameTXT = findViewById<EditText>(R.id.username_field)
        val passwordTXT = findViewById<EditText>(R.id.password_field)
        loginButton = findViewById(R.id.sign_in_button)
        lifeCycleButton = findViewById(R.id.lifecycle_button)

        loginButton.setOnClickListener {
            val username = usernameTXT.text.toString()
            val password = passwordTXT.text.toString()
            when (username) {
                "Username" -> {
                    if (password == "Password") {
                        Toast.makeText(this, "Welcome, $username !", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, ProfileScreen::class.java)
                        intent.putExtra("username", username)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, "Incorrect username/password", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, ProfileScreen::class.java)
                        startActivity(intent)
                    }
                }
                "jakePeralta" -> {
                    if (password == "BrooklynNine9") {
                        Toast.makeText(this, "Welcome, $username !", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, ProfileScreen::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, "Incorrect username/password", Toast.LENGTH_SHORT).show()
                    }
                }
                "NarutoUzumaki" -> {
                    if (password == "Dattebayo") {
                        Toast.makeText(this, "Welcome, $username !", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, ProfileScreen::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, "Incorrect username/password", Toast.LENGTH_SHORT).show()
                    }
                }
                "CarlJohnson" -> {
                    if (password == "SanAndreas") {
                        Toast.makeText(this, "Welcome, $username !", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, ProfileScreen::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, "Incorrect username/password", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
        lifeCycleButton.setOnClickListener{
            val intent = Intent(this, LifeCycleActivity::class.java)
            startActivity(intent)
        }
    }
}
