package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.PathInterpolator;
import android.view.animation.TranslateAnimation;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;

/* JADX INFO: loaded from: classes10.dex */
public class jqr {
    public static AnimatorSet d() {
        PathInterpolator pathInterpolatorD = jqi.d();
        ObjectAnimator objectAnimatorB = b(0.0f, 1.0f, 200L);
        objectAnimatorB.setInterpolator(pathInterpolatorD);
        ObjectAnimator objectAnimatorB2 = b(1.0f, 0.5f, 1000L);
        objectAnimatorB2.setInterpolator(pathInterpolatorD);
        objectAnimatorB2.setRepeatCount(-1);
        objectAnimatorB2.setRepeatMode(2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorB).before(objectAnimatorB2);
        return animatorSet;
    }

    private static ObjectAnimator b(float f, float f2, long j) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.setPropertyName("alpha");
        objectAnimator.setFloatValues(f, f2);
        objectAnimator.setDuration(j);
        return objectAnimator;
    }

    public static AnimatorSet c(int i, boolean z) {
        PathInterpolator pathInterpolatorD = jqi.d();
        ObjectAnimator objectAnimatorB = b(0.0f, 1.0f, 150L);
        objectAnimatorB.setInterpolator(pathInterpolatorD);
        ObjectAnimator objectAnimatorB2 = b(1.0f, 1.0f, 450L);
        objectAnimatorB2.setInterpolator(pathInterpolatorD);
        ObjectAnimator objectAnimatorB3 = b(1.0f, 0.0f, 400L);
        objectAnimatorB3.setInterpolator(pathInterpolatorD);
        objectAnimatorB3.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(objectAnimatorB, objectAnimatorB2, objectAnimatorB3);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(d(i, z), animatorSet);
        return animatorSet2;
    }

    private static ObjectAnimator d(int i, boolean z) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        if (z) {
            objectAnimator.setPropertyName("translationY");
            if (i == 1) {
                objectAnimator.setFloatValues(200.0f);
            } else {
                objectAnimator.setFloatValues(-200.0f);
            }
        } else {
            objectAnimator.setPropertyName("translationX");
            if (i == 1) {
                objectAnimator.setFloatValues(-200.0f);
            } else {
                objectAnimator.setFloatValues(200.0f);
            }
        }
        objectAnimator.setDuration(1000L);
        objectAnimator.setRepeatCount(-1);
        objectAnimator.setInterpolator(new FastOutSlowInInterpolator());
        return objectAnimator;
    }

    public static AlphaAnimation c() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setInterpolator(new FastOutSlowInInterpolator());
        alphaAnimation.setRepeatCount(-1);
        alphaAnimation.setRepeatMode(2);
        return alphaAnimation;
    }

    public static AnimationSet b(int i) {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 0, 0.0f, 0, i);
        translateAnimation.setDuration(2000L);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(2000L);
        alphaAnimation.setFillAfter(false);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }
}
