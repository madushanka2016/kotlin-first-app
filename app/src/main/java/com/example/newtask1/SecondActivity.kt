package com.example.newtask1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    private var BtnFbLogin: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        BtnFbLogin=findViewById<View>(R.id.btnFbLoginPage) as Button
        BtnFbLogin!!.setOnClickListener {
            startActivity(Intent(this@SecondActivity,ThirdActivity::class.java))
        }
    }
}
