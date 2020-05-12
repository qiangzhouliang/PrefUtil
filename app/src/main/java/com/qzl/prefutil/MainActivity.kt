package com.qzl.prefutil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.qzl.prefutils.PrefUtils

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        PrefUtils.init(this)
        PrefUtils.setString("111","123")
        println(PrefUtils.getString("111","222"))
    }
}
