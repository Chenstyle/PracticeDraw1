package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    private Paint mPaint = new Paint();

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        mPaint.setColor(Color.BLACK);
        // 实心圆
        mPaint.setStyle(Paint.Style.FILL);
        int circle1X = getWidth() / 4;
        int circle1Y = getHeight() / 4;
        int circleRadius = getWidth() / 8;
        canvas.drawCircle(circle1X, circle1Y, circleRadius, mPaint);
        // 空心圆
        mPaint.setStyle(Paint.Style.STROKE);
        int circle2X = circle1X * 3;
        canvas.drawCircle(circle2X, circle1Y, circleRadius, mPaint);
        // 蓝色实心圆
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.BLUE);
        int circle3Y = circle1Y * 3;
        canvas.drawCircle(circle1X, circle3Y, circleRadius, mPaint);
        // 线宽为20的空心圆
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(20);
        mPaint.setColor(Color.BLACK);
        int circle4X = circle1X *3;
        canvas.drawCircle(circle4X, circle3Y, circleRadius, mPaint);
    }
}
