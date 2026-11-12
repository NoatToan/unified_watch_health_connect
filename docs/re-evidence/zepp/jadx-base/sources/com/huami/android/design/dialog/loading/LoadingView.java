package com.huami.android.design.dialog.loading;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes5.dex */
public class LoadingView extends View {
    private static final String u = "LoadingView";
    private static final int v = 1000;
    private static final float w = 0.8f;
    private static final float x = 9.0f;
    private Paint a;
    private Paint b;
    private RectF c;
    private Animator d;
    private Animator e;
    private float f;
    private float g;
    private float h;
    private float[] i;
    private float j;
    private float k;
    private float l;
    private PathMeasure m;
    private PathMeasure n;
    private float[] o;
    private float[] p;
    private boolean q;
    private boolean r;
    private Context s;
    private OnAnimEndListener t;

    public interface OnAnimEndListener {
        void onAnimEnd();
    }

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            LoadingView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            if (!LoadingView.this.r) {
                return true;
            }
            LoadingView.this.t();
            LoadingView.this.w();
            return true;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (LoadingView.this.t != null) {
                LoadingView.this.t.onAnimEnd();
            }
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LoadingView.this.stopLoading();
        }
    }

    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (LoadingView.this.t != null) {
                LoadingView.this.t.onAnimEnd();
            }
        }
    }

    public LoadingView(Context context) {
        this(context, null);
    }

    public static float dp2px(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    private Animator j() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: eq4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.n(valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setRepeatCount(-1);
        return valueAnimatorOfFloat;
    }

    private Animator k() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fq4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.o(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.setDuration(250);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        return valueAnimatorOfFloat;
    }

    private void l() {
        Paint paint = new Paint();
        this.a = paint;
        paint.setAntiAlias(true);
        this.a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setAntiAlias(true);
        this.b.setStyle(Paint.Style.STROKE);
        this.c = new RectF();
    }

    private boolean m() {
        float[] fArr = this.p;
        return (fArr[0] == 0.0f || fArr[1] == 0.0f) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(ValueAnimator valueAnimator) {
        this.f = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 360.0f;
        postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(ValueAnimator valueAnimator) {
        this.g = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 90.0f;
        postInvalidateOnAnimation();
        Log.i(u, "chaseAnim anim");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(ValueAnimator valueAnimator) {
        this.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(ValueAnimator valueAnimator) {
        this.m.getPosTan(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.o, null);
        postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(ValueAnimator valueAnimator) {
        this.n.getPosTan(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.p, null);
        postInvalidateOnAnimation();
    }

    private void s(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.s.obtainStyledAttributes(attributeSet, R.styleable.LoadingView, 0, i);
        setStrokeWidth(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.LoadingView_lv_stroke, (int) dp2px(this.s, 3.0f)));
        setCycleColor(typedArrayObtainStyledAttributes.getColor(R.styleable.LoadingView_lv_cycleColor, -1));
        setCorrectColor(typedArrayObtainStyledAttributes.getColor(R.styleable.LoadingView_lv_correctColor, -1));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.k = measuredWidth / 2;
        this.j = measuredHeight / 2;
        this.l = ((Math.min(measuredWidth, measuredHeight) - 4.5f) / 4.0f) * 0.8f;
        Path path = new Path();
        float f = this.k;
        float f2 = this.l;
        path.moveTo(f - f2, this.j - f2);
        float f3 = this.k;
        float f4 = this.l;
        path.lineTo(f3 + f4, this.j + f4);
        this.m = new PathMeasure(path, false);
        float[] fArr = this.o;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        Path path2 = new Path();
        float f5 = this.k;
        float f6 = this.l;
        path2.moveTo(f5 + f6, this.j - f6);
        float f7 = this.k;
        float f8 = this.l;
        path2.lineTo(f7 - f8, this.j + f8);
        this.n = new PathMeasure(path2, false);
        float[] fArr2 = this.p;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
    }

    private void u() {
        if (this.e == null) {
            this.e = k();
        }
        if (this.e.isStarted() || this.e.isRunning()) {
            return;
        }
        this.e.start();
    }

    private void v() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(500);
        duration.setInterpolator(new LinearInterpolator());
        duration.start();
        duration.addListener(new d());
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: hq4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.p(valueAnimator);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            return;
        }
        long j = 250;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, this.m.getLength()).setDuration(j);
        duration.setInterpolator(new LinearInterpolator());
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dq4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.q(valueAnimator);
            }
        });
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, this.n.getLength()).setDuration(j);
        duration2.setInterpolator(new LinearInterpolator());
        duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: gq4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.r(valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(duration2).after(duration);
        animatorSet.addListener(new b());
        animatorSet.start();
    }

    private void x() {
        Animator animator = this.e;
        if (animator == null || !animator.isRunning()) {
            return;
        }
        this.e.end();
        this.e.cancel();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopLoading();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.drawArc(this.c, 90.0f + this.f, 270.0f + this.g, false, this.a);
        if (this.q) {
            float f = this.h;
            if (f > 0.0f) {
                if (f < 0.33333334f) {
                    float[] fArr = this.i;
                    canvas.drawLine(fArr[0], fArr[1], fArr[0] + ((fArr[2] - fArr[0]) * f), fArr[1] + ((fArr[3] - fArr[1]) * f), this.b);
                } else {
                    float[] fArr2 = this.i;
                    float f2 = fArr2[4] + ((fArr2[6] - fArr2[4]) * f);
                    float f3 = fArr2[5] + ((fArr2[7] - fArr2[5]) * f);
                    canvas.drawLine(fArr2[0], fArr2[1], fArr2[2], fArr2[3], this.b);
                    float[] fArr3 = this.i;
                    canvas.drawLine(fArr3[4], fArr3[5], f2, f3, this.b);
                }
            }
        }
        if (this.r) {
            float f4 = this.k;
            float f5 = this.l;
            float f6 = f4 - f5;
            float f7 = this.j - f5;
            float[] fArr4 = this.o;
            canvas.drawLine(f6, f7, fArr4[0], fArr4[1], this.b);
            if (m()) {
                float f8 = this.k;
                float f9 = this.l;
                float f10 = f8 + f9;
                float f11 = this.j - f9;
                float[] fArr5 = this.p;
                canvas.drawLine(f10, f11, fArr5[0], fArr5[1], this.b);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iResolveSize = View.resolveSize(getPaddingLeft() + getPaddingRight() + 300, i);
        int iResolveSize2 = View.resolveSize(getPaddingBottom() + getPaddingTop() + 300, i2);
        setMeasuredDimension(iResolveSize, iResolveSize2);
        this.c.set(9.0f, 9.0f, iResolveSize - 9.0f, iResolveSize2 - 9.0f);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float fMax = Math.max(i, i2);
        float[] fArr = this.i;
        fArr[0] = 0.26719576f * fMax;
        fArr[1] = 0.5f * fMax;
        fArr[2] = 0.43121693f * fMax;
        fArr[3] = 0.66402113f * fMax;
        fArr[4] = 0.39417988f * fMax;
        fArr[5] = 0.66137564f * fMax;
        fArr[6] = 0.73544973f * fMax;
        fArr[7] = fMax * 0.3227513f;
    }

    public void reset() {
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.r = false;
        this.q = false;
        invalidate();
    }

    public void setCorrectColor(int i) {
        this.b.setColor(i);
        invalidate();
    }

    public void setCycleColor(int i) {
        this.a.setColor(i);
        invalidate();
    }

    public void setFailed(OnAnimEndListener onAnimEndListener) {
        setOnAnimEndListener(onAnimEndListener);
        setFailed();
    }

    public void setOnAnimEndListener(OnAnimEndListener onAnimEndListener) {
        this.t = onAnimEndListener;
    }

    public void setStrokeWidth(float f) {
        this.a.setStrokeWidth(f);
        this.b.setStrokeWidth(f);
        invalidate();
    }

    public void setSuccess(OnAnimEndListener onAnimEndListener) {
        setOnAnimEndListener(onAnimEndListener);
        setSuccess();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i == 8 || i == 4) {
            stopLoading();
            x();
        } else {
            startLoading();
        }
        super.setVisibility(i);
    }

    public void startLoading() {
        this.q = false;
        this.r = false;
        if (this.d == null) {
            this.d = j();
        }
        if (this.d.isStarted()) {
            return;
        }
        this.d.start();
    }

    public void stopLoading() {
        Animator animator = this.d;
        if (animator == null || !animator.isRunning()) {
            return;
        }
        this.d.end();
        this.d.cancel();
        this.d = null;
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new float[8];
        this.o = new float[2];
        this.p = new float[2];
        this.q = false;
        this.r = false;
        this.s = context;
        l();
        s(attributeSet, i);
        getViewTreeObserver().addOnPreDrawListener(new a());
    }

    public void setFailed() {
        this.q = false;
        this.r = true;
        t();
        u();
        w();
    }

    public void setSuccess() {
        this.q = true;
        this.r = false;
        u();
        v();
    }
}
