package com.ankitapunekar.gstcalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var button : Button
    lateinit var amount : EditText
    lateinit var result : TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        amount = findViewById(R.id.amount)
        result = findViewById(R.id.result)
        var amountf : Float
        button.setOnClickListener {
            amountf = amount.text.toString().toFloat()
            amountf = amountf * 0.18f
            result.text = amountf.toString()
        }

    }
}