package com.example.a29april2024imad5112assignment2thivarmunienst10271490

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {
    //declare
    private lateinit var textView: TextView
    private lateinit var imageView: ImageView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //initialise
        textView =findViewById(/* id = */ (R.id.textViewIntro)
        ImageView2 = findViewById(R.id.imageView2)
        button =findViewById(R.id.button)

        button.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
            finish()
            //Image Linke: 1. https://www.housedigest.com/771625/how-to-properly-clean-your-dog/
            //Image Linke: 2.https://be.chewy.com/nutrition-pet-diet-tips-7-ways-to-slow-your-dogs-eating/
            //Image Linke: 3.https://howimetmydog.com/index.php/blog/play-pals-understanding-how-and-why-our-dogs-play
        }
    }
}