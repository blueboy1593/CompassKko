package com.kkobook.compasskko

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import androidx.core.view.marginStart
import androidx.core.view.marginTop

class CompassView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    var azimuth: Float = 0F
    var roll: Float = 0F
    var pitch: Float = 0F
    val compassImage: Bitmap = BitmapFactory.decodeResource(resources, R.drawable.compass_background2)

    @SuppressLint("DrawAllocation")
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val paint = Paint(Paint.ANTI_ALIAS_FLAG)
        paint.color = Color.YELLOW

        canvas.save()
        canvas.rotate(-azimuth, 500F, 900F)
//        canvas.drawCircle(600F, 600F, 400F, paint)
        canvas.drawBitmap(compassImage, 20F, 400F, null)

//        paint.color = Color.GREEN
//        paint.textSize = 100F
//        canvas.drawText("N", 500F, 160F, paint)
//        canvas.drawText("S", 500F, 860F, paint)
//        canvas.drawRect(480F, 160F, 520F, 860F, paint)
        canvas.restore()
    }
}