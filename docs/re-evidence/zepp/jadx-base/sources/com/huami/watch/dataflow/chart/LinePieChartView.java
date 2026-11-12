package com.huami.watch.dataflow.chart;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.huami.watch.companionlib.R;
import com.huami.watch.dataflow.chart.base.BaseChartView;

/* JADX INFO: loaded from: classes16.dex */
public class LinePieChartView extends BaseChartView<LinePieChart> {
    private static final String e = "LinePieChartView";
    private Bitmap b;
    private float c;
    private Animator d;

    public class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ((LinePieChart) LinePieChartView.this.mChart).dismissLoading();
            ((LinePieChart) LinePieChartView.this.mChart).rotate(0.0f);
            LinePieChartView.this.postInvalidateOnAnimation();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ((LinePieChart) LinePieChartView.this.mChart).showLoading();
            ((LinePieChart) LinePieChartView.this.mChart).rotate(0.0f);
            LinePieChartView.this.postInvalidateOnAnimation();
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((LinePieChart) LinePieChartView.this.mChart).rotate(((Float) valueAnimator.getAnimatedValue()).floatValue());
            LinePieChartView.this.postInvalidateOnAnimation();
        }
    }

    public LinePieChartView(Context context) {
        this(context, null);
    }

    @SuppressLint({"NewApi"})
    private Animator g() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addListener(new a());
        valueAnimatorOfFloat.addUpdateListener(new b());
        valueAnimatorOfFloat.setDuration(3500L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setRepeatCount(-1);
        return valueAnimatorOfFloat;
    }

    private void h() {
        float maxValue = this.c / ((LinePieChart) this.mChart).getMaxValue();
        if (maxValue > 1.0f) {
            maxValue = 1.0f;
        }
        long jSqrt = (long) (Math.sqrt(maxValue) * 800.0d);
        this.mDuration = jSqrt;
        if (jSqrt == 0) {
            this.mDuration = 1L;
        }
    }

    public void dismissLoading() {
        Animator animator = this.d;
        if (animator != null) {
            animator.end();
            ((LinePieChart) this.mChart).dismissLoading();
        }
    }

    public int getMaxProgress() {
        return ((LinePieChart) this.mChart).getMaxProgress();
    }

    public int getProgress() {
        return ((LinePieChart) this.mChart).getProgress();
    }

    @Override // com.huami.watch.dataflow.chart.base.BaseChartView, android.view.View
    public void onDraw(Canvas canvas) {
        float f = this.mAnimFactor;
        if (f < 1.0f) {
            ((LinePieChart) this.mChart).setValue(this.c * f);
            ((LinePieChart) this.mChart).draw(canvas, 1.0f);
        } else {
            ((LinePieChart) this.mChart).setValue(this.c);
            ((LinePieChart) this.mChart).draw(canvas, this.mAnimFactor);
        }
    }

    public void setMaxProgress(int i) {
        ((LinePieChart) this.mChart).setMaxProgress(i);
    }

    public void setMaxValue(long j) {
        ((LinePieChart) this.mChart).setMaxValue(j);
    }

    public void setMode(int i) {
        ((LinePieChart) this.mChart).setMode(i);
        invalidate();
    }

    public void setProgress(int i) {
        ((LinePieChart) this.mChart).setProgress(i);
        postInvalidate();
    }

    public void setRectF(RectF rectF) {
        ((LinePieChart) this.mChart).setRect(rectF);
    }

    public void setValue(long j) {
        this.c = j;
        h();
    }

    public void showLoading() {
        showLoading(0L);
    }

    public void showNormalLine() {
        ((LinePieChart) this.mChart).setMode(0);
        refresh(false);
    }

    public LinePieChartView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void showLoading(long j) {
        if (this.d == null) {
            this.d = g();
        }
        if (this.d.isStarted()) {
            return;
        }
        if (j > 0) {
            this.d.setStartDelay(j);
        }
        this.d.start();
    }

    public LinePieChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChart = new LinePieChart(context);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.LinePieChartView);
        setMode(typedArrayObtainStyledAttributes.getInt(R.styleable.LinePieChartView_line_mode, 0));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.LinePieChartView_center_img, -1);
        if (resourceId != -1) {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), resourceId);
            this.b = bitmapDecodeResource;
            if (bitmapDecodeResource != null) {
                ((LinePieChart) this.mChart).setCenterBmp(bitmapDecodeResource);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        this.mInterpolator = new DecelerateInterpolator();
        this.mDuration = 1L;
    }
}
