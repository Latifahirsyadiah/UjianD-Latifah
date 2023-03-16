package com.example.ujiand_latifah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imgBtn1 = findViewById<ImageButton>(R.id.imageButton)
        val imgBtn2 = findViewById<ImageButton>(R.id.imageButton2)
        val imgBtn3 = findViewById<ImageButton>(R.id.imageButton3)

        imgBtn1.setOnClickListener {
            val latifah = Intent(this, NextActivity2::class.java)
            startActivity(latifah)
        }
        imgBtn2.setOnClickListener {
            val latifah = Intent(this, NextActivity::class.java)
            startActivity(latifah)
        }
        imgBtn3.setOnClickListener {
            val latifah = Intent(this, NextActivity3::class.java)
            startActivity(latifah)
        }
    }
}