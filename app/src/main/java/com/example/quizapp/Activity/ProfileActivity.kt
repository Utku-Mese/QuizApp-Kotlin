package com.example.quizapp.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import androidx.core.content.ContextCompat
import com.example.quizapp.R

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val window: Window = this@ProfileActivity.window
        window.statusBarColor = ContextCompat.getColor(this@ProfileActivity, R.color.grey)
    }
}