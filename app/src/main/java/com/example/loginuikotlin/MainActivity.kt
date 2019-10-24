package com.example.loginuikotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.newtask1.SecondActivity

class MainActivity : AppCompatActivity() {
    var btnLogin: Button? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.id)

        btnLogin = findViewById(R.id.Main_logIn_btn);
        btnLogin?.setOnClickListener {
            startActivity(Intent(this@MainActivity,SecondActivity::class.java))
        }
    }
}
