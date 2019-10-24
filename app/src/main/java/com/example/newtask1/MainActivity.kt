package com.example.newtask1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private  var btnLogin: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin=findViewById<View>(R.id.btnLogin) as Button
        btnLogin!!.setOnClickListener {
            startActivity(Intent(this@MainActivity,SecondActivity::class.java))
        }
    }
}
