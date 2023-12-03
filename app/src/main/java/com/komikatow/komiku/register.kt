package com.komikatow.komiku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        findViewById<Button>(R.id.btnRegister).setOnClickListener {

            // Jika data berhasil ditambahkan, pindah ke halaman login
            val intent = Intent(this@register, MainActivity::class.java)
            startActivity(intent)


        }
    }
}