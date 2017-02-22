package com.wangxiandeng.floatball;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

import java.util.Map;

/**
 * @作者 a3266
 * @版本
 * @包名 com.wangxiandeng.floatball
 * @待完成
 * @创建时间 2016/11/30
 * @功能描述 TODO
 * @更新人 $
 * @更新时间 $
 * @更新版本 $
 */
public class CoverView extends View {

    private View mView;
    private Paint mPaint;
    private int mAlpha;
    private int mRed;
    private int mGreen;
    private int mBlue;

    public CoverView(Context context) {
        this(context,null);
    }

    public CoverView(Context context, AttributeSet attrs) {
        super(context, attrs);
//        mView = LayoutInflater.from(context).inflate(R.layout.layout_cover, this);
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.parseColor("#66ff0000"));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawRect(0,0,getWidth(),getHeight(),mPaint);
    }

    public void setViewAlpha(int alpha){
        mAlpha = alpha;
        mPaint.setAlpha(alpha);
        invalidate();
    }

    public void setRedColor(int red){
        mRed = red;
        mPaint.setARGB(mAlpha,red, mGreen,mBlue);
        invalidate();
    }
}
