package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.project1.accountTest.AccountTestActivity
import com.example.project1.counter.CounterActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aactivity_main)
    }

    fun activityToCounter (view: View) {
        val changeActivity = Intent (this, CounterActivity::class.java)
        startActivity(changeActivity)

    }
    fun activityToAccountTest (view: View) {
        val changeActivity = Intent (this, AccountTestActivity::class.java)
        startActivity(changeActivity)

    }


}