package com.huawei.health.recognizekit.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.qrs;

/* JADX INFO: loaded from: classes8.dex */
public class LoadingCircleView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f8682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f8684c;
    private int d;
    public boolean e;
    private float f;
    private Paint g;
    private AnimatorSet h;
    private boolean i;
    private RectF j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;

    public LoadingCircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -1;
        this.f8683b = 200;
        this.m = 360.0f;
        this.o = 0.0f;
        this.i = false;
        this.n = 9.0f;
        this.l = 0.6f;
        this.e = false;
        d(context);
    }

    private void d(Context context) {
        Paint paint = new Paint(1);
        this.f8682a = paint;
        paint.setColor(this.d);
        this.k = qrs.d(context, 7.0f);
        Paint paint2 = new Paint(1);
        this.g = paint2;
        paint2.setColor(-1);
        this.g.setStyle(Paint.Style.STROKE);
        this.j = new RectF();
        this.g.setStrokeWidth(qrs.d(context, 2.0f));
        this.g.setStrokeCap(Paint.Cap.ROUND);
        float fD = qrs.d(context, 24.0f);
        this.f = fD;
        this.f8684c = fD;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i / 2.0f;
        float f2 = i2 / 2.0f;
        RectF rectF = this.j;
        float f3 = this.f;
        float f4 = this.k;
        rectF.set((f - f3) - f4, (f2 - f3) - f4, f + f3 + f4, f2 + f3 + f4);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        this.f8682a.setColor(this.d);
        canvas.drawCircle(width, height, this.f8684c, this.f8682a);
        if (this.e) {
            canvas.drawArc(this.j, this.o, this.m, false, this.g);
            this.o = (this.o + 12.0f) % 360.0f;
            if (this.i) {
                float f = this.m + this.n;
                this.m = f;
                if (f >= 360.0f) {
                    this.m = 360.0f;
                    this.i = false;
                }
            } else {
                float f2 = this.m - this.n;
                this.m = f2;
                if (f2 <= 10.0f) {
                    this.m = 10.0f;
                    this.i = true;
                }
            }
            postInvalidateOnAnimation();
            return;
        }
        canvas.drawCircle(width, height, this.f + this.k, this.g);
    }

    public void b() {
        if (this.e) {
            return;
        }
        float f = this.f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, this.l * f);
        valueAnimatorOfFloat.setDuration(this.f8683b);
        final ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: guv
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.e.e(argbEvaluator, valueAnimator);
            }
        });
        float f2 = this.f;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.l * f2, f2);
        valueAnimatorOfFloat2.setDuration(this.f8683b);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: guu
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f36067c.b(valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() { // from class: com.huawei.health.recognizekit.view.LoadingCircleView.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                LoadingCircleView.this.e = true;
                LoadingCircleView.this.postInvalidateOnAnimation();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.h = animatorSet;
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.h.start();
    }

    public /* synthetic */ void e(ArgbEvaluator argbEvaluator, ValueAnimator valueAnimator) {
        this.f8684c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.d = ((Integer) argbEvaluator.evaluate(valueAnimator.getAnimatedFraction(), -1, Integer.valueOf(Color.argb(127, 255, 255, 255)))).intValue();
        postInvalidateOnAnimation();
    }

    public /* synthetic */ void b(ValueAnimator valueAnimator) {
        this.f8684c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        postInvalidateOnAnimation();
    }

    public void e() {
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.e = false;
        this.d = -1;
        this.f8684c = this.f;
        this.o = 0.0f;
        this.m = 360.0f;
        this.i = false;
        postInvalidateOnAnimation();
    }
}
