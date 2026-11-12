package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes20.dex */
public class xcv {
    public static Animator a(View view, float f) {
        Interpolator interpolatorB = xdd.b();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), f);
        objectAnimatorOfFloat.setInterpolator(interpolatorB);
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.setAutoCancel(true);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", view.getScaleY(), f);
        objectAnimatorOfFloat2.setInterpolator(interpolatorB);
        objectAnimatorOfFloat2.setDuration(250L);
        objectAnimatorOfFloat2.setAutoCancel(true);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        return animatorSet;
    }

    public static ValueAnimator b(int i, boolean z) {
        return a(i, z ? 0 : 255);
    }

    public static ValueAnimator a(int i, int i2) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setInterpolator(xdd.b());
        valueAnimatorOfInt.setDuration(250L);
        return valueAnimatorOfInt;
    }
}
