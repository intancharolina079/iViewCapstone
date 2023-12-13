package com.project.iviewcapstone.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.project.iviewcapstone.R
import com.project.iviewcapstone.signup.SignUpActivity
import com.project.iviewcapstone.ui.screen.ScreenActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()
        Handler().postDelayed(Runnable {
            val intent = Intent(this@SplashActivity, SignUpActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000L)
    }
}