package com.xiaomi.hm.health.device.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.huami.devicex.R;
import com.huami.lib.view.ViewUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class HMLoadingView extends View {
    private static final float A = 2.5f;
    public static final int STYLE_CIRCLE = 1;
    public static final int STYLE_RIPPLE = 0;
    private static final int x = 4000;
    private static final int y = 5;
    private static final int z = 1;
    private Context a;
    private AnimatorSet b;
    private ArrayList<Animator> c;
    private Paint d;
    private Matrix e;
    private int[] f;
    private int[] g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private SweepGradient p;
    private int q;
    private int r;
    private float s;
    private ValueAnimator t;
    private int u;
    private int v;
    private int w;

    public HMLoadingView(Context context) {
        this(context, null);
    }

    private void e() {
        this.j = ContextCompat.getColor(this.a, R.color.s14);
        Context context = this.a;
        int i = R.color.transparent_color;
        this.k = ContextCompat.getColor(context, i);
        this.c = new ArrayList<>();
        this.v = (int) ViewUtils.dp2px(this.a, A);
        this.o = (int) ViewUtils.dp2px(this.a, 1.0f);
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.d.setStrokeCap(Paint.Cap.ROUND);
        this.d.setStrokeWidth(this.o);
        int i2 = this.h;
        this.f = new int[i2];
        this.g = new int[i2];
        this.r = ContextCompat.getColor(this.a, R.color.s16);
        this.q = ContextCompat.getColor(this.a, i);
        this.u = (int) ViewUtils.dp2px(this.a, 90.0f);
    }

    private void f() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.t = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: e03
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.h(valueAnimator);
            }
        });
        this.t.setDuration(3000L);
        this.t.setInterpolator(new LinearInterpolator());
        this.t.setRepeatMode(1);
        this.t.setRepeatCount(-1);
        this.t.start();
    }

    private void g() {
        if (this.p == null) {
            int i = this.m;
            SweepGradient sweepGradient = new SweepGradient(i / 2, i / 2, new int[]{this.q, this.r}, (float[]) null);
            this.p = sweepGradient;
            this.d.setShader(sweepGradient);
        }
        this.e.setRotate(this.s, this.m / 2, this.l / 2);
        this.p.setLocalMatrix(this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(ValueAnimator valueAnimator) {
        this.s = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 360.0f;
        postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(int i, ValueAnimator valueAnimator) {
        this.f[i] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (i == 0) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(int i, ValueAnimator valueAnimator) {
        this.g[i] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.w == 0) {
            initRipple();
        } else {
            f();
        }
    }

    public void cancelAnimator() {
        AnimatorSet animatorSet = this.b;
        if (animatorSet == null || this.c == null) {
            return;
        }
        animatorSet.cancel();
        for (Animator animator : this.c) {
            animator.cancel();
            animator.end();
        }
        this.c.clear();
        this.b = null;
    }

    public void initRipple() {
        cancelAnimator();
        this.b = new AnimatorSet();
        for (final int i = 0; i < this.h; i++) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, this.n);
            valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
            valueAnimatorOfInt.setDuration(this.i);
            valueAnimatorOfInt.setRepeatMode(1);
            valueAnimatorOfInt.setRepeatCount(-1);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: g03
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.i(i, valueAnimator);
                }
            });
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(this.j, this.k);
            valueAnimatorOfInt2.setEvaluator(new ArgbEvaluator());
            valueAnimatorOfInt2.setInterpolator(new AccelerateInterpolator());
            valueAnimatorOfInt2.setDuration(this.i);
            valueAnimatorOfInt2.setRepeatMode(1);
            valueAnimatorOfInt2.setRepeatCount(-1);
            valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: f03
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.j(i, valueAnimator);
                }
            });
            valueAnimatorOfInt.setStartDelay((this.i / this.h) * i);
            valueAnimatorOfInt2.setStartDelay((this.i / this.h) * i);
            this.c.add(valueAnimatorOfInt);
            this.c.add(valueAnimatorOfInt2);
        }
        this.b.playTogether(this.c);
        this.b.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.w == 1) {
            g();
            canvas.drawCircle(this.m / 2, this.l / 2, ((this.u * 2) - this.v) / 2, this.d);
            return;
        }
        for (int i = 0; i < this.h; i++) {
            this.d.setColor(this.g[i]);
            canvas.drawCircle(this.m / 2, this.l / 2, this.f[i], this.d);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.l = i2;
        this.m = i;
        this.n = Math.min(i2, i) / 2;
    }

    public void setEndColor(int i) {
        this.k = i;
    }

    public void setProgressColor(int i) {
        this.r = i;
    }

    public void setStartColor(int i) {
        this.j = i;
    }

    public void setStyle(int i) {
        this.w = i;
        this.d.setStrokeWidth(i == 1 ? this.v : this.o);
    }

    public void startLoading() {
        if (this.l == 0) {
            post(new Runnable() { // from class: h03
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.k();
                }
            });
        } else {
            k();
        }
    }

    public void stopLoading() {
        if (this.w == 1) {
            ValueAnimator valueAnimator = this.t;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            this.t.end();
            this.t.cancel();
            this.t = null;
            return;
        }
        AnimatorSet animatorSet = this.b;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.b.end();
            this.b.cancel();
            this.b = null;
        }
        cancelAnimator();
    }

    public HMLoadingView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HMLoadingView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new Matrix();
        this.h = 5;
        this.i = 4000;
        this.w = 0;
        this.a = context;
        e();
    }
}
