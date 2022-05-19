package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        val userName = intent.getStringExtra(findViewById(R.id.input1))
        val score = intent.getStringExtra(setdata.score)
        val totalQuestion = intent.getStringExtra("total size")

        congo.text = "હું અંશ કેવડિયા ❤️\n" + "આ અદ્ભુત સ્કોર માટે તમને અભિનંદન"
        Score.text = "${score} / ${totalQuestion}"
        button.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}