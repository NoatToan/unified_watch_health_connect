package defpackage;

import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;

/* JADX INFO: loaded from: classes41.dex */
public class oyw {
    public static AnimationSet e(int i) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 2.0f, 1.0f, 2.0f, 1, 0.5f, 1, 0.5f);
        long j = i;
        scaleAnimation.setDuration(j);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setDuration(j);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    public static AnimationSet d(int i, int i2) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(2.0f, 1.0f, 2.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(i);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(i2);
        alphaAnimation.setFillAfter(true);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    public static AnimationSet b(int i) {
        AnimationSet animationSet = new AnimationSet(true);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(i);
        alphaAnimation.setFillAfter(true);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }
}
