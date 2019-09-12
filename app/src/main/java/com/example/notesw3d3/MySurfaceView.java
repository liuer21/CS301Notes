package com.example.w3d2notes;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

import com.example.notesw3d3.R;

public class MySurfaceView extends SurfaceView {

    private int radius;

    public MySurfaceView(Context context, AttributeSet attrs) {
        //Tell android to call my draw function, so I can actually draw something
        super(context, attrs);
        setWillNotDraw(false); //# IMPORTANT
        radius = 0;
    }

    public void onDraw(Canvas canvas){
        Paint paint = new Paint();
        paint.setColor(Color.MAGENTA);
        //paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5.0f);

        canvas.drawRect(20, 50, 40, 100, paint);

        Bitmap myImageBMP = BitmapFactory.decodeResource(getResources(), R.drawable.realdog);
        canvas.drawBitmap(myImageBMP, 100, 10, null);
    }

}
