package com.example.drawtesting

import android.content.Context
import android.content.res.Resources
import android.graphics.*
import android.graphics.Paint.ANTI_ALIAS_FLAG
import android.util.AttributeSet
import android.util.DisplayMetrics
import android.view.SurfaceView
import android.view.View
import android.view.WindowManager
import java.util.*
import kotlin.collections.ArrayList

class TestingClass(context: Context, attrs: AttributeSet)
    : View(context,attrs){



    override fun draw(canvas: Canvas){
        var points = ArrayList<Int>()
        val random = Random()
        for(i in 0 .. 100){
            points.add(random.nextInt(100))
        }
        super.draw(canvas)
        val red = Paint()
        red.setARGB(255,255,0,0)

        canvas.drawLine(100f,100f,100f,500f,red)
        canvas.drawLine(100f,500f,600f,500f,red)
        for (i in 0 until points.size-1){
            val startX = 100f + 5*i
            val startY = 500f - 4*points[i]
            val stopX = 100f + 5*(i+1)
            val stopY = 500f - 4*points[i+1]
            canvas.drawLine(startX,startY,stopX,stopY,red)
        }
    }
}