package com.huami.moving.ui.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public class RunningEffectCircleView extends View {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private float g;
    private float h;
    private int i;
    private float j;
    private int k;
    private float l;
    private int m;
    private int n;
    private int o;
    private int p;
    private float q;
    private float r;
    private Paint s;
    private RectF t;
    private int u;
    private int[] v;
    private boolean w;
    private float x;
    private String y;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            RunningEffectCircleView.this.postInvalidate();
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            RunningEffectCircleView.this.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            RunningEffectCircleView.this.w = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            RunningEffectCircleView.this.w = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            RunningEffectCircleView.this.w = false;
        }
    }

    public RunningEffectCircleView(Context context) {
        this(context, null);
    }

    private float c(float f) {
        float f2 = (this.c * 1.0f) / this.f;
        float f3 = 5.0f;
        if (f <= 5.0f) {
            f3 = 4.0f;
            if (f <= 4.0f) {
                f3 = 3.0f;
                if (f <= 3.0f) {
                    f3 = 2.0f;
                    if (f <= 2.0f) {
                        return f > 1.0f ? (f2 * 1.0f) + (f2 * (f - 1.0f)) : f2 * f;
                    }
                }
            }
        }
        return (f2 * f3) + (f2 * (f - f3));
    }

    private int d(int i) {
        return (int) TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics());
    }

    private void e(Canvas canvas) {
        if (this.v == null) {
            return;
        }
        float[] fArrF = f((this.a - this.j) + d(2), this.x);
        float[] fArrF2 = f((this.a - this.j) + d(6), this.x + 2.0f);
        float[] fArrF3 = f((this.a - this.j) + d(6), this.x - 2.0f);
        this.s.setStyle(Paint.Style.FILL);
        float f = this.h;
        if (f > 5.0f) {
            this.s.setColor(this.v[5]);
        } else if (f > 4.0f) {
            this.s.setColor(this.v[4]);
        } else if (f > 3.0f) {
            this.s.setColor(this.v[3]);
        } else if (f > 2.0f) {
            this.s.setColor(this.v[2]);
        } else if (f > 1.0f) {
            this.s.setColor(this.v[1]);
        } else {
            this.s.setColor(this.v[0]);
        }
        Path path = new Path();
        path.moveTo(fArrF[0], fArrF[1]);
        path.lineTo(fArrF2[0], fArrF2[1]);
        path.lineTo(fArrF3[0], fArrF3[1]);
        path.close();
        canvas.drawPath(path, this.s);
    }

    private float[] f(float f, float f2) {
        float[] fArr = new float[2];
        double radians = Math.toRadians(f2);
        if (f2 < 90.0f) {
            double d = f;
            fArr[0] = (float) (((double) this.q) + (Math.cos(radians) * d));
            fArr[1] = (float) (((double) this.r) + (Math.sin(radians) * d));
        } else if (f2 == 90.0f) {
            fArr[0] = this.q;
            fArr[1] = this.r + f;
        } else if (f2 > 90.0f && f2 < 180.0f) {
            double d2 = (((double) (180.0f - f2)) * 3.141592653589793d) / 180.0d;
            double d3 = f;
            fArr[0] = (float) (((double) this.q) - (Math.cos(d2) * d3));
            fArr[1] = (float) (((double) this.r) + (Math.sin(d2) * d3));
        } else if (f2 == 180.0f) {
            fArr[0] = this.q - f;
            fArr[1] = this.r;
        } else if (f2 > 180.0f && f2 < 270.0f) {
            double d4 = (((double) (f2 - 180.0f)) * 3.141592653589793d) / 180.0d;
            double d5 = f;
            fArr[0] = (float) (((double) this.q) - (Math.cos(d4) * d5));
            fArr[1] = (float) (((double) this.r) - (Math.sin(d4) * d5));
        } else if (f2 == 270.0f) {
            fArr[0] = this.q;
            fArr[1] = this.r - f;
        } else {
            double d6 = (((double) (360.0f - f2)) * 3.141592653589793d) / 180.0d;
            double d7 = f;
            fArr[0] = (float) (((double) this.q) + (Math.cos(d6) * d7));
            fArr[1] = (float) (((double) this.r) - (Math.sin(d6) * d7));
        }
        return fArr;
    }

    private void g() {
        this.i = d(6);
        this.k = d(4);
        Paint paint = new Paint();
        this.s = paint;
        paint.setAntiAlias(true);
        this.t = new RectF();
    }

    private int h(int i) {
        return (int) TypedValue.applyDimension(2, i, Resources.getSystem().getDisplayMetrics());
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(this.u);
        this.s.reset();
        this.s.setAlpha(255);
        this.s.setAntiAlias(true);
        if (this.w) {
            e(canvas);
        } else {
            e(canvas);
        }
        this.s.setShader(null);
        this.s.setStyle(Paint.Style.STROKE);
        this.s.setAntiAlias(true);
        this.s.setColor(this.n);
        this.s.setStrokeWidth(this.k);
        canvas.drawArc(this.t, this.b, 360.0f, false, this.s);
        if (this.v != null) {
            for (int i = 0; i < this.f; i++) {
                this.s.setColor(this.v[i]);
                float f = this.c / this.f;
                if (i == 0) {
                    RectF rectF = this.t;
                    float f2 = this.b;
                    float f3 = this.l;
                    canvas.drawArc(rectF, f2 + f3, f - f3, false, this.s);
                } else if (i == this.v.length - 1) {
                    RectF rectF2 = this.t;
                    float f4 = this.b + (i * f);
                    float f5 = this.l;
                    canvas.drawArc(rectF2, f4 + f5, f - f5, false, this.s);
                } else {
                    RectF rectF3 = this.t;
                    float f6 = this.b + (i * f);
                    float f7 = this.l;
                    canvas.drawArc(rectF3, f6 + f7, f - f7, false, this.s);
                }
            }
        }
        this.s.setStyle(Paint.Style.FILL);
        this.s.setAlpha(255);
        this.s.setColor(this.o);
        this.s.setTextSize(h(40));
        this.s.setTextAlign(Paint.Align.CENTER);
        float f8 = this.g;
        canvas.drawText(f8 > 10.0f ? String.valueOf((int) f8) : String.valueOf(f8), this.q, this.r + d(10), this.s);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iMax = Math.max(Math.max(getPaddingLeft(), getPaddingTop()), Math.max(getPaddingRight(), getPaddingBottom()));
        this.p = iMax;
        setPadding(iMax, iMax, iMax, iMax);
        this.j = this.p + (this.i / 2.0f) + d(2);
        int iResolveSize = View.resolveSize(d(getMeasuredWidth()), i);
        this.a = (iResolveSize - (this.p * 2)) / 2;
        setMeasuredDimension(iResolveSize, iResolveSize);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        this.r = measuredWidth;
        this.q = measuredWidth;
        RectF rectF = this.t;
        float f = this.j;
        int i3 = this.k;
        rectF.set((i3 / 2.0f) + f, f + (i3 / 2.0f), (getMeasuredWidth() - this.j) - (this.k / 2.0f), (getMeasuredWidth() - this.j) - (this.k / 2.0f));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.u = i;
    }

    public void setColors(int[] iArr) {
        this.v = iArr;
    }

    public void setCreditValueWithAnim(float f) {
        if (f < this.d || f > this.e || !this.w) {
            return;
        }
        this.h = f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, f);
        valueAnimatorOfFloat.addUpdateListener(new a());
        float fC = c(this.h);
        int i = this.b;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(i, i + fC);
        valueAnimatorOfFloat2.addUpdateListener(new b());
        long j = 200;
        float f2 = this.h;
        if (f2 >= 5.0f) {
            j = 1400;
        } else if (f2 >= 4.0f) {
            j = 1200;
        } else if (f2 >= 3.0f) {
            j = 1000;
        } else if (f2 >= 2.0f) {
            j = 800;
        } else if (f2 >= 1.0f) {
            j = 600;
        } else if (f2 >= 0.0f) {
            j = 400;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(j).playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.addListener(new c());
        animatorSet.start();
    }

    public void setDividerColor(int i) {
        this.m = i;
    }

    public void setEffectDesc(String str) {
        this.y = str;
    }

    public void setOriginDataConvertToshowUserData(float f) {
        this.g = f;
    }

    public void setSelects(int i) {
        this.f = i;
    }

    public void setTextColor(int i) {
        this.o = i;
    }

    public void setUselessArcColor(int i) {
        this.n = i;
    }

    public RunningEffectCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RunningEffectCircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = 150;
        this.c = 240;
        this.d = 0;
        this.e = 6;
        this.f = 0;
        this.l = 3.0f;
        this.w = true;
        g();
    }
}
