package com.mjolnir.uisigninsignout

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var btnSignIn=findViewById<Button>(R.id.btnSignIn)
        var tvsignup=findViewById<TextView>(R.id.tvSignUp)
        var tvforgetpassword=findViewById<TextView>(R.id.tvforgetPassword)

        tvsignup.setOnClickListener {
            intent= Intent(this,SignUp::class.java)
            startActivity(intent)
        }

        tvforgetpassword.setOnClickListener {
             intent=Intent(this,forgetPassword::class.java)
            startActivity(intent)
        }
    }
}