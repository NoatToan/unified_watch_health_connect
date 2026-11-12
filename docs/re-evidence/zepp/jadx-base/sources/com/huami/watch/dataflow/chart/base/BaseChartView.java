package com.huami.watch.dataflow.chart.base;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import com.huami.watch.dataflow.chart.base.BaseChart;
import com.huami.watch.dataflow.chart.data.ChartDataLoader;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseChartView<T extends BaseChart<? extends Chart.Item>> extends View {
    private static final String a = "Chart.BaseView";
    public Animator mAnim;
    public float mAnimFactor;
    public T mChart;
    public long mDuration;
    public Interpolator mInterpolator;
    public boolean mIsAttached;
    public boolean mIsScrollingPerformed;
    public ChartDataLoader mLoader;
    public boolean mNotDrawBars;
    public boolean mScrollable;
    public ChartScroller mScroller;
    public int mScrollingOffset;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        @SuppressLint({"NewApi"})
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseChartView.this.mAnimFactor = valueAnimator.getAnimatedFraction();
            BaseChartView.this.postInvalidateOnAnimation();
        }
    }

    public BaseChartView(Context context) {
        this(context, null);
    }

    @SuppressLint({"NewApi"})
    private void a(float f, boolean z) {
        if (!z) {
            this.mAnimFactor = f;
            postInvalidateOnAnimation();
        } else {
            animRefresh();
            if (this.mAnim.isStarted()) {
                return;
            }
            this.mAnim.start();
        }
    }

    public Animator animRefresh() {
        if (this.mAnim == null) {
            this.mAnim = animRefresh(this.mDuration);
        }
        return this.mAnim;
    }

    public void attach() {
        this.mIsAttached = true;
    }

    public void detach() {
        this.mIsAttached = false;
    }

    public long getAnimDuration() {
        return this.mDuration;
    }

    public RectF getChartRectF() {
        return this.mChart.getRect();
    }

    public ChartDataLoader getDataLoader() {
        return this.mLoader;
    }

    public boolean isAttached() {
        return this.mIsAttached;
    }

    public boolean notDrawBars() {
        return this.mNotDrawBars;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        T t = this.mChart;
        if (t != null) {
            t.draw(canvas, this.mAnimFactor);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Rect rect = new Rect();
        rect.left = getPaddingLeft();
        rect.top = getPaddingTop();
        rect.right = i - getPaddingRight();
        rect.bottom = i2 - getPaddingBottom();
        T t = this.mChart;
        if (t != null) {
            t.setRect(rect);
        }
    }

    public void refresh(float f) {
        a(f, false);
    }

    public void setChartRectF(RectF rectF) {
        this.mChart.setRect(rectF);
        postInvalidateOnAnimation();
    }

    public void setDataLoader(ChartDataLoader chartDataLoader) {
        this.mLoader = chartDataLoader;
    }

    public void setNotDrawBars(boolean z) {
        this.mNotDrawBars = z;
    }

    public void setScrollable(boolean z) {
        this.mScrollable = z;
    }

    public BaseChartView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void refresh(boolean z) {
        a(z ? 0.0f : 1.0f, z);
    }

    public BaseChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIsAttached = true;
        this.mAnimFactor = 1.0f;
        this.mInterpolator = new AccelerateDecelerateInterpolator();
        this.mDuration = 500L;
    }

    public void refresh() {
        a(1.0f, false);
    }

    public Animator animRefresh(long j) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(this.mInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new a());
        return valueAnimatorOfFloat;
    }
}
