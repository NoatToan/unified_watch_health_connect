package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes41.dex */
public class ozh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f45009c = 1.0f;

    public void e(final ValueAnimator.AnimatorUpdateListener animatorUpdateListener, int i) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ozh.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ozh.this.d(((Float) valueAnimator.getAnimatedValue()).floatValue());
                animatorUpdateListener.onAnimationUpdate(valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(i);
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(float f) {
        this.f45009c = f;
    }

    public float e() {
        return this.f45009c;
    }
}
