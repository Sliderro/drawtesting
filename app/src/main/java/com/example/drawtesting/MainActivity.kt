package com.example.drawtesting

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    var points = ArrayList<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        var width = displayMetrics.widthPixels
        var height = displayMetrics.heightPixels

    }
}
