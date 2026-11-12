package com.huawei.uikit.hwprogressindicator.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.animation.CycleInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import defpackage.xdd;

/* JADX INFO: loaded from: classes20.dex */
public class HwLoadingDrawable extends Drawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ValueAnimator f29533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f29534c;
    private CycleInterpolator d;
    private Interpolator e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f29532a = false;
    private float j = 0.0f;
    private float g = 0.0f;
    private float f = 0.0f;
    private OnLoadingListener h = null;

    public interface OnLoadingListener {
        void onLoadingFinish();

        void onLoadingStart();
    }

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            if (HwLoadingDrawable.this.d()) {
                if (HwLoadingDrawable.this.h != null) {
                    HwLoadingDrawable.this.h.onLoadingFinish();
                }
                HwLoadingDrawable.this.f29533b.end();
                HwLoadingDrawable.this.f29532a = false;
                HwLoadingDrawable.this.f = 0.0f;
            }
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                Log.e("HwLoadingDrawable", "onAnimationUpdate: animation is null.");
                return;
            }
            HwLoadingDrawable.this.f = valueAnimator.getAnimatedFraction();
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            HwLoadingDrawable hwLoadingDrawable = HwLoadingDrawable.this;
            hwLoadingDrawable.a(fFloatValue, hwLoadingDrawable.f);
            HwLoadingDrawable.this.f29534c.a(HwLoadingDrawable.this.j, HwLoadingDrawable.this.g);
            HwLoadingDrawable.this.invalidateSelf();
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f29537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f29538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f29539c;
        private RectF f;
        private final a g;
        private final b[] i;
        private final FloatEvaluator e = new FloatEvaluator();
        private final ArgbEvaluator d = new ArgbEvaluator();
        private final Paint j = new Paint(1);
        private float h = 0.0f;

        static class a {
            private PointF d;
            private final Paint e = new Paint(1);

            a(PointF pointF, int i) {
                this.d = pointF;
                e(i);
            }

            private void e(int i) {
                this.e.setStyle(Paint.Style.FILL);
                this.e.setColor(i);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void c(PointF pointF) {
                this.d = pointF;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void d(Canvas canvas, float f) {
                PointF pointF = this.d;
                canvas.drawCircle(pointF.x, pointF.y, f, this.e);
            }
        }

        static class b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f29540b;
            private PointF d;
            private int e;

            b(PointF pointF) {
                this.d = pointF;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void b(Canvas canvas, Paint paint, float f) {
                if (this.f29540b == 0) {
                    return;
                }
                paint.setColor(this.e);
                paint.setAlpha(this.f29540b);
                PointF pointF = this.d;
                canvas.drawCircle(pointF.x, pointF.y, f, paint);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void e(int i, int i2) {
                this.e = i;
                this.f29540b = i2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void e(PointF pointF) {
                this.d = pointF;
            }
        }

        e(RectF rectF, int i, int i2, float f) {
            this.f29539c = f;
            this.f29537a = i;
            this.f29538b = i2;
            this.f = rectF;
            PointF pointF = new PointF(rectF.right, rectF.centerY());
            this.g = new a(pointF, this.f29538b);
            this.i = new b[50];
            int i3 = 0;
            while (true) {
                b[] bVarArr = this.i;
                if (i3 >= bVarArr.length) {
                    e(i);
                    return;
                } else {
                    bVarArr[i3] = new b(pointF);
                    i3++;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(float f) {
            this.f29539c = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(float f, float f2) {
            this.h = Math.min(f2, 90.0f);
            this.g.c(d(0.0f, f));
            int i = 0;
            while (i < 50) {
                int i2 = i + 1;
                float f3 = i2 / 50.0f;
                int iB = b(f3);
                int iC = c(f3);
                PointF pointFD = d(f3, f);
                b bVar = this.i[i];
                bVar.e(iB, iC);
                bVar.e(pointFD);
                i = i2;
            }
        }

        private void e(int i) {
            this.j.setColor(i);
            this.j.setStyle(Paint.Style.FILL);
        }

        private int c(float f) {
            if (Float.compare(f, 1.0f) >= 0) {
                return 0;
            }
            return (int) ((1.0f - f) * 255.0f);
        }

        private PointF d(float f, float f2) {
            double dE = e(f, f2, f2 - this.h);
            double dSin = Math.sin(Math.toRadians(dE));
            double dCos = Math.cos(Math.toRadians(dE));
            double dWidth = this.f.width() / 2.0f;
            return new PointF((float) (((double) this.f.centerX()) + (dCos * dWidth)), (float) (((double) this.f.centerY()) + (dWidth * dSin)));
        }

        private float e(float f, float f2, float f3) {
            return Float.compare(f, 1.0f) >= 0 ? f3 : this.e.evaluate(f, (Number) Float.valueOf(f2), (Number) Float.valueOf(f3)).floatValue();
        }

        private int b(float f) {
            if (Float.compare(f, 1.0f) >= 0) {
                return this.f29537a;
            }
            return ((Integer) this.d.evaluate(f, Integer.valueOf(this.f29538b), Integer.valueOf(this.f29537a))).intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Canvas canvas) {
            for (int i = 49; i >= 0; i--) {
                this.i[i].b(canvas, this.j, this.f29539c);
            }
            this.g.d(canvas, this.f29539c);
        }
    }

    public HwLoadingDrawable(RectF rectF, int i, int i2, float f) {
        this.f29534c = new e(rectF, i, i2, f);
        e();
    }

    public boolean a() {
        return this.f29533b.isRunning();
    }

    public void b() {
        if (a()) {
            this.f29532a = false;
            return;
        }
        OnLoadingListener onLoadingListener = this.h;
        if (onLoadingListener != null) {
            onLoadingListener.onLoadingStart();
        }
        this.f29533b.start();
        this.f29533b.setRepeatCount(-1);
    }

    public void b(float f) {
        e eVar = this.f29534c;
        if (eVar != null) {
            eVar.a(f);
            this.f29534c.a(this.j, this.g);
        }
    }

    public void b(OnLoadingListener onLoadingListener) {
        this.h = onLoadingListener;
    }

    public void c() {
        if (a()) {
            this.f29532a = true;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f29534c.a(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        return a() && this.f29532a;
    }

    private void e() {
        this.d = new CycleInterpolator(0.5f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f29533b = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(2000L);
        this.f29533b.setInterpolator(new LinearInterpolator());
        this.e = xdd.d();
        this.f29533b.addUpdateListener(new b());
        this.f29533b.addListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f, float f2) {
        double interpolation = this.d.getInterpolation(f);
        double dSqrt = Math.sqrt(1.0d - (interpolation * interpolation));
        if (Float.compare(f2, 0.5f) > 0) {
            dSqrt = -dSqrt;
        }
        this.j = (((1.0f - ((float) dSqrt)) + (f * 3.1415927f)) * 360.0f) / 5.141593f;
        this.g = Math.min(this.j, this.e.getInterpolation(Float.compare(f2, 0.5f) < 0 ? f2 * 2.0f : (1.0f - f2) * 2.0f) * 90.0f);
    }
}
