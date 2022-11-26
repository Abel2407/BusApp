package com.example.busapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.busapp.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            this.supportActionBar!!.hide()
        } // catch block to handle NullPointerException
        catch (e: NullPointerException) {
        }


        setContentView(R.layout.activity_login)
    }
}