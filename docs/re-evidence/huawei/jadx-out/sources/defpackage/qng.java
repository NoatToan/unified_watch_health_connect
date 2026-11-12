package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes16.dex */
public class qng {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f46524c = 1.0f;
    private float e = 1.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f46523a = 1.0f;

    public void c(final ValueAnimator.AnimatorUpdateListener animatorUpdateListener, int i) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: qng.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                qng.this.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                animatorUpdateListener.onAnimationUpdate(valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(i);
        valueAnimatorOfFloat.start();
    }

    public void e(final ValueAnimator.AnimatorUpdateListener animatorUpdateListener, int i) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: qng.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                qng.this.c(((Float) valueAnimator.getAnimatedValue()).floatValue());
                animatorUpdateListener.onAnimationUpdate(valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(i);
        valueAnimatorOfFloat.start();
    }

    public void d(final ValueAnimator.AnimatorUpdateListener animatorUpdateListener, int i) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: qng.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                qng.this.d(((Float) valueAnimator.getAnimatedValue()).floatValue());
                animatorUpdateListener.onAnimationUpdate(valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(i);
        valueAnimatorOfFloat.start();
    }

    public void c(float f) {
        this.f46524c = f;
    }

    public float c() {
        return this.f46524c;
    }

    public void a(float f) {
        this.e = f;
    }

    public float a() {
        return this.e;
    }

    public void d(float f) {
        this.f46523a = f;
    }

    public float d() {
        return this.f46523a;
    }
}
