package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public class dd1 {
    public static ValueAnimator c(final View view, long j, long j2, int... iArr) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iArr);
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.setStartDelay(j2);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: bd1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                dd1.e(view, valueAnimator);
            }
        });
        return valueAnimatorOfInt;
    }

    public static ValueAnimator d(final View view, long j, long j2, int... iArr) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iArr);
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.setStartDelay(j2);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cd1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                dd1.f(view, valueAnimator);
            }
        });
        return valueAnimatorOfInt;
    }

    public static /* synthetic */ void e(View view, ValueAnimator valueAnimator) {
        view.setTranslationX(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static /* synthetic */ void f(View view, ValueAnimator valueAnimator) {
        view.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
