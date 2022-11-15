package com.example.cobex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        var transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragCondtainer,SplashFragment())
        transaction.commit()

        transaction = supportFragmentManager.beginTransaction()

        Handler(Looper.getMainLooper()).postDelayed({
           transaction.replace(R.id.fragCondtainer , PassengerActivity())
            transaction.commit()
        },3000)
    }
}