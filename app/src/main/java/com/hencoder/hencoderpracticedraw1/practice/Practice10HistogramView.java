package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    private Paint mPaint = new Paint();

    private int[] mDataRatio = {5, 10, 12, 40, 60, 80, 50};
    private String[] mDataName = {"Froyo", "GB", "ICS", "JB", "KITKAT", "L", "M"};

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        int coordinateX = getWidth() / 8;
        int coordinateHighest = getHeight() / 8;
        int coordinateY = coordinateHighest * 7;
        int coordinateLongest = coordinateX * 7;
        mPaint.setColor(Color.WHITE);
        // 先绘制坐标系
        canvas.drawLine(coordinateX, coordinateY, coordinateX, coordinateHighest, mPaint);
        canvas.drawLine(coordinateX, coordinateY, coordinateLongest, coordinateY, mPaint);

        // 绘制第一个图形
        mPaint.setColor(Color.BLUE);
        int rotateY = coordinateY / 100;
        int mDistance = 20;
        int x1 = coordinateX + mDistance;
        int y1 = coordinateY - (rotateY * mDataRatio[0]);
        int mDataWidth = 80;
        canvas.drawRect(x1, coordinateY, x1 + mDataWidth, y1, mPaint);
        mPaint.setTextSize(24);
        mPaint.setColor(Color.WHITE);
        canvas.drawText(mDataName[0], x1, coordinateY + 40, mPaint);

        // 绘制第二个图形
        mPaint.setColor(Color.BLUE);
        int x2 = x1 + mDataWidth + mDistance;
        int y2 = coordinateY - (rotateY * mDataRatio[1]);
        canvas.drawRect(x2, coordinateY, x2 + mDataWidth, y2, mPaint);
        mPaint.setColor(Color.WHITE);
        canvas.drawText(mDataName[1], x2, coordinateY + 40, mPaint);

        // 绘制第三个图形
        mPaint.setColor(Color.BLUE);
        int x3 = x2 + mDataWidth + mDistance;
        int y3 = coordinateY - (rotateY * mDataRatio[2]);
        canvas.drawRect(x3, coordinateY, x3 + mDataWidth, y3, mPaint);
        mPaint.setColor(Color.WHITE);
        canvas.drawText(mDataName[2], x3, coordinateY + 40, mPaint);

        // 绘制第四个图形
        mPaint.setColor(Color.BLUE);
        int x4 = x3 + mDataWidth + mDistance;
        int y4 = coordinateY - (rotateY * mDataRatio[3]);
        canvas.drawRect(x4, coordinateY, x4 + mDataWidth, y4, mPaint);
        mPaint.setColor(Color.WHITE);
        canvas.drawText(mDataName[3], x4, coordinateY + 40, mPaint);

        // 绘制第五个图形
        mPaint.setColor(Color.BLUE);
        int x5 = x4 + mDataWidth + mDistance;
        int y5 = coordinateY - (rotateY * mDataRatio[4]);
        canvas.drawRect(x5, coordinateY, x5 + mDataWidth, y5, mPaint);
        mPaint.setColor(Color.WHITE);
        canvas.drawText(mDataName[4], x5, coordinateY + 40, mPaint);

        // 绘制第六个图形
        mPaint.setColor(Color.BLUE);
        int x6 = x5 + mDataWidth + mDistance;
        int y6 = coordinateY - (rotateY * mDataRatio[5]);
        canvas.drawRect(x6, coordinateY, x6 + mDataWidth, y6, mPaint);
        mPaint.setColor(Color.WHITE);
        canvas.drawText(mDataName[5], x6, coordinateY + 40, mPaint);

        // 绘制第七个图形
        mPaint.setColor(Color.BLUE);
        int x7 = x6 + mDataWidth + mDistance;
        int y7 = coordinateY - (rotateY * mDataRatio[6]);
        canvas.drawRect(x7, coordinateY, x7 + mDataWidth, y7, mPaint);
        mPaint.setColor(Color.WHITE);
        canvas.drawText(mDataName[6], x7, coordinateY + 40, mPaint);

        mPaint.setTextSize(36);
        canvas.drawText("直方图", 200, 100, mPaint);
    }
}
