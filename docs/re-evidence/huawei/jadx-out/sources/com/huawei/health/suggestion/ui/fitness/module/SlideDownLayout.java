package com.huawei.health.suggestion.ui.fitness.module;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.customview.widget.ViewDragHelper;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;

/* JADX INFO: loaded from: classes9.dex */
public class SlideDownLayout extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Point f9400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewDragHelper f9401c;
    private OnSlidingListener d;
    private View e;

    private void b(Context context) {
    }

    public SlideDownLayout(Context context) {
        super(context);
        b(context);
    }

    public SlideDownLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context);
    }

    public SlideDownLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(context);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.e = getChildAt(0);
        this.f9401c = ViewDragHelper.create(this, new ViewDragHelper.Callback() { // from class: com.huawei.health.suggestion.ui.fitness.module.SlideDownLayout.5
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(View view, int i) {
                return true;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(View view, int i, int i2) {
                return SlideDownLayout.this.e.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(View view, int i, int i2) {
                if (i > 0) {
                    if (SlideDownLayout.this.d != null) {
                        SlideDownLayout.this.d.onSliding(i);
                    }
                    return i;
                }
                return SlideDownLayout.this.e.getTop();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(View view, float f, float f2) {
                if (Math.abs(SlideDownLayout.this.e.getTop() - SlideDownLayout.this.f9400b.y) < SlideDownLayout.this.f9399a / 3) {
                    SlideDownLayout.this.f9401c.settleCapturedViewAt(SlideDownLayout.this.f9400b.x, SlideDownLayout.this.f9400b.y);
                } else {
                    SlideDownLayout.this.f9401c.settleCapturedViewAt(SlideDownLayout.this.f9400b.x, SlideDownLayout.this.f9399a);
                }
                SlideDownLayout.this.postInvalidate();
            }
        });
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f9399a = i2;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f9400b = new Point(this.e.getLeft(), this.e.getTop());
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return this.f9401c.shouldInterceptTouchEvent(motionEvent);
        } catch (Exception e) {
            LogUtil.e("Suggestion_SlideDownLayout", LogAnonymous.b(e));
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            this.f9401c.processTouchEvent(motionEvent);
            return true;
        } catch (Exception e) {
            LogUtil.e("Suggestion_SlideDownLayout", LogAnonymous.b(e));
            return false;
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f9401c.continueSettling(true)) {
            postInvalidate();
            OnSlidingListener onSlidingListener = this.d;
            if (onSlidingListener != null) {
                onSlidingListener.onSliding(this.e.getTop());
                if (this.e.getTop() == this.f9399a) {
                    this.d.onSlidingFinish(true);
                } else if (this.e.getTop() == 0) {
                    this.d.onSlidingFinish(false);
                }
            }
        }
    }

    public void setOnSlidingListener(OnSlidingListener onSlidingListener) {
        this.d = onSlidingListener;
    }
}
