package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {
    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.FILL);
        int left = getWidth() / 4;
        int top = getHeight() / 4;
        int right = left * 3;
        int bottom = top * 3;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            // Note: startAngle（绘制开始的角度）按照弧形和扇形对应的椭圆中心坐标系来确定
            // Note: sweepAngle（绘制角度）就是从初始角度开始，展开多大的角度范围。
            // Note: 一定要理解这两个参数。后面的参数是圆心的部分。如果连接到圆心，就是扇形，不连接就是弧形
            canvas.drawArc(left, top, right, bottom, -100, 90, true, mPaint);
            canvas.drawArc(left, top, right, bottom, 20, 140, false, mPaint);
            mPaint.setStyle(Paint.Style.STROKE);
            canvas.drawArc(left, top, right, bottom, 200, 40, false, mPaint);
        }

    }
}
