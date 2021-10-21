package com.example.doctour

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.halaman_login)

            val intentButton: Button = findViewById(R.id.button2)
            intentButton.setOnClickListener { viewDetail2() }

        }
    private fun viewDetail2() {
        val intent = Intent(this, Dashboard::class.java)
        startActivity(intent)
    }

}

