package com.huami.lib.view.widget;

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
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import com.huami.lib.view.R;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.log.HMLog;

/* JADX INFO: loaded from: classes10.dex */
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
            LoadingView.this.q();
            LoadingView.this.t();
            return true;
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            LoadingView.this.m.getPosTan(((Float) valueAnimator.getAnimatedValue()).floatValue(), LoadingView.this.o, null);
            LoadingView.this.postInvalidateOnAnimation();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            LoadingView.this.n.getPosTan(((Float) valueAnimator.getAnimatedValue()).floatValue(), LoadingView.this.p, null);
            LoadingView.this.postInvalidateOnAnimation();
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

    public class e implements ValueAnimator.AnimatorUpdateListener {
        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            LoadingView.this.f = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 360.0f;
            LoadingView.this.postInvalidateOnAnimation();
        }
    }

    public class f implements ValueAnimator.AnimatorUpdateListener {
        public f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            LoadingView.this.g = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 90.0f;
            LoadingView.this.postInvalidateOnAnimation();
            HMLog.d(LoadingView.u, "chaseAnim anim", new Object[0]);
        }
    }

    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LoadingView.this.stopLoading();
        }
    }

    public class h extends AnimatorListenerAdapter {
        public h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (LoadingView.this.t != null) {
                LoadingView.this.t.onAnimEnd();
            }
        }
    }

    public class i implements ValueAnimator.AnimatorUpdateListener {
        public i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            LoadingView.this.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            LoadingView.this.postInvalidateOnAnimation();
        }
    }

    public LoadingView(Context context) {
        this(context, null);
    }

    private Animator l() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new e());
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setRepeatCount(-1);
        return valueAnimatorOfFloat;
    }

    private Animator m() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new f());
        valueAnimatorOfFloat.addListener(new g());
        valueAnimatorOfFloat.setDuration(250);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        return valueAnimatorOfFloat;
    }

    private void n() {
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

    private boolean o() {
        float[] fArr = this.p;
        return (fArr[0] == 0.0f || fArr[1] == 0.0f) ? false : true;
    }

    private void p(AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = this.s.obtainStyledAttributes(attributeSet, R.styleable.loading, 0, i2);
        setStrokeWidth(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.loading_stroke, (int) ViewUtils.dp2px(this.s, 3.0f)));
        setCycleColor(typedArrayObtainStyledAttributes.getColor(R.styleable.loading_cycleColor, -1));
        setCorrectColor(typedArrayObtainStyledAttributes.getColor(R.styleable.loading_correctColor, -1));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        if (getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.k = measuredWidth / 2;
        this.j = measuredHeight / 2;
        this.l = ((Math.min(measuredWidth, measuredHeight) - 4.5f) / 4.0f) * 0.8f;
        Path path = new Path();
        float f2 = this.k;
        float f3 = this.l;
        path.moveTo(f2 - f3, this.j - f3);
        float f4 = this.k;
        float f5 = this.l;
        path.lineTo(f4 + f5, this.j + f5);
        this.m = new PathMeasure(path, false);
        float[] fArr = this.o;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        Path path2 = new Path();
        float f6 = this.k;
        float f7 = this.l;
        path2.moveTo(f6 + f7, this.j - f7);
        float f8 = this.k;
        float f9 = this.l;
        path2.lineTo(f8 - f9, this.j + f9);
        this.n = new PathMeasure(path2, false);
        float[] fArr2 = this.p;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
    }

    private void r() {
        if (this.e == null) {
            this.e = m();
        }
        if (this.e.isStarted() || this.e.isRunning()) {
            return;
        }
        this.e.start();
    }

    private void s() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(500);
        duration.setInterpolator(new LinearInterpolator());
        duration.start();
        duration.addListener(new h());
        duration.addUpdateListener(new i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            return;
        }
        long j = 250;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, this.m.getLength()).setDuration(j);
        duration.setInterpolator(new LinearInterpolator());
        duration.addUpdateListener(new b());
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, this.n.getLength()).setDuration(j);
        duration2.setInterpolator(new LinearInterpolator());
        duration2.addUpdateListener(new c());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(duration2).after(duration);
        animatorSet.addListener(new d());
        animatorSet.start();
    }

    private void u() {
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
            float f2 = this.h;
            if (f2 > 0.0f) {
                if (f2 < 0.33333334f) {
                    float[] fArr = this.i;
                    canvas.drawLine(fArr[0], fArr[1], fArr[0] + ((fArr[2] - fArr[0]) * f2), fArr[1] + ((fArr[3] - fArr[1]) * f2), this.b);
                } else {
                    float[] fArr2 = this.i;
                    float f3 = fArr2[4] + ((fArr2[6] - fArr2[4]) * f2);
                    float f4 = fArr2[5] + ((fArr2[7] - fArr2[5]) * f2);
                    canvas.drawLine(fArr2[0], fArr2[1], fArr2[2], fArr2[3], this.b);
                    float[] fArr3 = this.i;
                    canvas.drawLine(fArr3[4], fArr3[5], f3, f4, this.b);
                }
            }
        }
        if (this.r) {
            float f5 = this.k;
            float f6 = this.l;
            float f7 = f5 - f6;
            float f8 = this.j - f6;
            float[] fArr4 = this.o;
            canvas.drawLine(f7, f8, fArr4[0], fArr4[1], this.b);
            if (o()) {
                float f9 = this.k;
                float f10 = this.l;
                float f11 = f9 + f10;
                float f12 = this.j - f10;
                float[] fArr5 = this.p;
                canvas.drawLine(f11, f12, fArr5[0], fArr5[1], this.b);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int iResolveSize = View.resolveSize(getPaddingLeft() + getPaddingRight() + 300, i2);
        int iResolveSize2 = View.resolveSize(getPaddingBottom() + getPaddingTop() + 300, i3);
        setMeasuredDimension(iResolveSize, iResolveSize2);
        this.c.set(9.0f, 9.0f, iResolveSize - 9.0f, iResolveSize2 - 9.0f);
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        float fMax = Math.max(i2, i3);
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

    public void setCorrectColor(int i2) {
        this.b.setColor(i2);
        invalidate();
    }

    public void setCycleColor(int i2) {
        this.a.setColor(i2);
        invalidate();
    }

    public void setFailed(OnAnimEndListener onAnimEndListener) {
        setOnAnimEndListener(onAnimEndListener);
        setFailed();
    }

    public void setOnAnimEndListener(OnAnimEndListener onAnimEndListener) {
        this.t = onAnimEndListener;
    }

    public void setStrokeWidth(float f2) {
        this.a.setStrokeWidth(f2);
        this.b.setStrokeWidth(f2);
        invalidate();
    }

    public void setSuccess(OnAnimEndListener onAnimEndListener) {
        setOnAnimEndListener(onAnimEndListener);
        setSuccess();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        if (i2 == 8 || i2 == 4) {
            stopLoading();
            u();
        } else {
            startLoading();
        }
        super.setVisibility(i2);
    }

    public void startLoading() {
        this.q = false;
        this.r = false;
        if (this.d == null) {
            this.d = l();
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

    public LoadingView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.i = new float[8];
        this.o = new float[2];
        this.p = new float[2];
        this.q = false;
        this.r = false;
        this.s = context;
        n();
        p(attributeSet, i2);
        getViewTreeObserver().addOnPreDrawListener(new a());
    }

    public void setFailed() {
        this.q = false;
        this.r = true;
        q();
        r();
        t();
    }

    public void setSuccess() {
        this.q = true;
        this.r = false;
        r();
        s();
    }
}
