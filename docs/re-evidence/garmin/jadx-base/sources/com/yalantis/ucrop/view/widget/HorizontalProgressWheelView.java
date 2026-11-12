package com.yalantis.ucrop.view.widget;

import a7.b;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.yalantis.ucrop.R;

/* JADX INFO: loaded from: classes3.dex */
public class HorizontalProgressWheelView extends View {
    private final Rect mCanvasClipBounds;
    private float mLastTouchedPosition;
    private int mMiddleLineColor;
    private int mProgressLineHeight;
    private int mProgressLineMargin;
    private Paint mProgressLinePaint;
    private int mProgressLineWidth;
    private Paint mProgressMiddleLinePaint;
    private boolean mScrollStarted;
    private ScrollingListener mScrollingListener;
    private float mTotalScrollDistance;

    public interface ScrollingListener {
        void onScroll(float f14, float f15);

        void onScrollEnd();

        void onScrollStart();
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.mCanvasClipBounds = new Rect();
        init();
    }

    private void init() {
        this.mMiddleLineColor = b.getColor(getContext(), R.color.ucrop_color_widget_rotate_mid_line);
        this.mProgressLineWidth = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_width_horizontal_wheel_progress_line);
        this.mProgressLineHeight = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_height_horizontal_wheel_progress_line);
        this.mProgressLineMargin = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_margin_horizontal_wheel_progress_line);
        Paint paint = new Paint(1);
        this.mProgressLinePaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.mProgressLinePaint.setStrokeWidth(this.mProgressLineWidth);
        this.mProgressLinePaint.setColor(getResources().getColor(R.color.ucrop_color_progress_wheel_line));
        Paint paint2 = new Paint(this.mProgressLinePaint);
        this.mProgressMiddleLinePaint = paint2;
        paint2.setColor(this.mMiddleLineColor);
        this.mProgressMiddleLinePaint.setStrokeCap(Paint.Cap.ROUND);
        this.mProgressMiddleLinePaint.setStrokeWidth(getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_width_middle_wheel_progress_line));
    }

    private void onScrollEvent(MotionEvent motionEvent, float f14) {
        this.mTotalScrollDistance -= f14;
        postInvalidate();
        this.mLastTouchedPosition = motionEvent.getX();
        ScrollingListener scrollingListener = this.mScrollingListener;
        if (scrollingListener != null) {
            scrollingListener.onScroll(-f14, this.mTotalScrollDistance);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.getClipBounds(this.mCanvasClipBounds);
        int iWidth = this.mCanvasClipBounds.width();
        int i14 = this.mProgressLineWidth;
        int i15 = this.mProgressLineMargin;
        int i16 = iWidth / (i14 + i15);
        float f14 = this.mTotalScrollDistance % (i15 + i14);
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = i16 / 4;
            if (i17 < i18) {
                this.mProgressLinePaint.setAlpha((int) ((i17 / i18) * 255.0f));
            } else {
                int i19 = (i16 * 3) / 4;
                Paint paint = this.mProgressLinePaint;
                if (i17 > i19) {
                    paint.setAlpha((int) (((i16 - i17) / i18) * 255.0f));
                } else {
                    paint.setAlpha(255);
                }
            }
            float f15 = -f14;
            Rect rect = this.mCanvasClipBounds;
            float f16 = rect.left + f15 + ((this.mProgressLineWidth + this.mProgressLineMargin) * i17);
            float fCenterY = rect.centerY() - (this.mProgressLineHeight / 4.0f);
            Rect rect2 = this.mCanvasClipBounds;
            canvas.drawLine(f16, fCenterY, f15 + rect2.left + ((this.mProgressLineWidth + this.mProgressLineMargin) * i17), rect2.centerY() + (this.mProgressLineHeight / 4.0f), this.mProgressLinePaint);
        }
        canvas.drawLine(this.mCanvasClipBounds.centerX(), this.mCanvasClipBounds.centerY() - (this.mProgressLineHeight / 2.0f), this.mCanvasClipBounds.centerX(), (this.mProgressLineHeight / 2.0f) + this.mCanvasClipBounds.centerY(), this.mProgressMiddleLinePaint);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mLastTouchedPosition = motionEvent.getX();
        } else if (action == 1) {
            ScrollingListener scrollingListener = this.mScrollingListener;
            if (scrollingListener != null) {
                this.mScrollStarted = false;
                scrollingListener.onScrollEnd();
            }
        } else if (action == 2) {
            float x14 = motionEvent.getX() - this.mLastTouchedPosition;
            if (x14 != 0.0f) {
                if (!this.mScrollStarted) {
                    this.mScrollStarted = true;
                    ScrollingListener scrollingListener2 = this.mScrollingListener;
                    if (scrollingListener2 != null) {
                        scrollingListener2.onScrollStart();
                    }
                }
                onScrollEvent(motionEvent, x14);
            }
        }
        return true;
    }

    public void setMiddleLineColor(int i14) {
        this.mMiddleLineColor = i14;
        this.mProgressMiddleLinePaint.setColor(i14);
        invalidate();
    }

    public void setScrollingListener(ScrollingListener scrollingListener) {
        this.mScrollingListener = scrollingListener;
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalProgressWheelView(Context context) {
        this(context, null);
    }

    @TargetApi(21)
    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        this.mCanvasClipBounds = new Rect();
    }
}
