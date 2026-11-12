package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes20.dex */
public class xeb {
    public static AnimatorSet a(View view, int i) {
        return d(view, i, (i == 0 || i == 1 || i != 2) ? 0.95f : 0.9f);
    }

    public static AnimatorSet b(View view, int i) {
        return d(view, i, 1.0f);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0006 A[PHI: r0
      0x0006: PHI (r0v5 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0004, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    private static AnimatorSet d(View view, int i, float f) {
        float f2 = 1.0f;
        if (f > 1.0f) {
            f = f2;
        } else {
            f2 = 0.0f;
            if (f < 0.0f) {
                f = f2;
            }
        }
        crd crdVarE = e(view.getScaleX(), f, i);
        long duration = (long) crdVarE.getDuration();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), f);
        objectAnimatorOfFloat.setInterpolator(crdVarE);
        objectAnimatorOfFloat.setDuration(duration);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", view.getScaleY(), f);
        objectAnimatorOfFloat2.setInterpolator(crdVarE);
        objectAnimatorOfFloat2.setDuration(duration);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        return animatorSet;
    }

    public static crd e(float f, float f2, int i) {
        float fAbs = Math.abs(f - f2);
        if (Float.compare(fAbs, 0.0f) == 0) {
            fAbs = 0.050000012f;
        }
        float f3 = fAbs;
        if (i == 0) {
            return new crd(240.0f, 28.0f, f3, 0.0f, 0.002f);
        }
        if (i != 1) {
            return i != 2 ? new crd(350.0f, 35.0f, f3, 0.5f, 0.002f) : new crd(410.0f, 38.0f, f3, 1.0f, 0.002f);
        }
        return new crd(350.0f, 35.0f, f3, 0.5f, 0.002f);
    }
}
