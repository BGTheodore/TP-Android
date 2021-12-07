package com.example.travauxpratiquesandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var clickButton: Button
    private var nbClick = 0
    private lateinit var nbreClick_txtView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clickButton = findViewById(R.id.btn_click_me)
        nbreClick_txtView = findViewById(R.id.nbreClick_txtView)
        //nbreClick_txtView.visibility = INVISIBLE

        clickButton.setOnClickListener {
           // if (nbreClic_txtView.visibility == INVISIBLE)
              //  nbreClic_txtView.visibility = VISIBLE
             //Toast.makeText(baseContext, "Tu m'as cliqué", Toast.LENGTH_LONG).show()
            nbClick++
            val newText = "Vous avez cliqué $nbClick fois"
            clickButton.text = "Cliquez-moi"
            nbreClick_txtView.text = newText
            if (nbClick == 5)
                clickButton.isEnabled = false
        }
    }
}