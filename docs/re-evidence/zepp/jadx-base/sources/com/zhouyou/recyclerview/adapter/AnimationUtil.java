package com.zhouyou.recyclerview.adapter;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes22.dex */
public class AnimationUtil {
    private Animator b;
    private View c;
    private Interpolator d;
    private AnimationType a = AnimationType.ALPHA;
    private int e = 300;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AnimationType.values().length];
            a = iArr;
            try {
                iArr[AnimationType.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AnimationType.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AnimationType.SLIDE_FROM_BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[AnimationType.SLIDE_FROM_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[AnimationType.SLIDE_FROM_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private void a(AnimationType animationType) {
        AnimatorSet animatorSet = new AnimatorSet();
        int i = a.a[animationType.ordinal()];
        if (i == 1) {
            animatorSet.play(ObjectAnimator.ofFloat(this.c, "alpha", 0.7f, 1.0f));
        } else if (i == 2) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.c, "scaleX", 0.6f, 1.0f), ObjectAnimator.ofFloat(this.c, "scaleY", 0.6f, 1.0f));
        } else if (i == 3) {
            View view = this.c;
            animatorSet.play(ObjectAnimator.ofFloat(view, "translationY", view.getMeasuredHeight(), 0.0f));
        } else if (i == 4) {
            View view2 = this.c;
            animatorSet.play(ObjectAnimator.ofFloat(view2, "translationX", -view2.getRootView().getWidth(), 0.0f));
        } else if (i == 5) {
            View view3 = this.c;
            animatorSet.play(ObjectAnimator.ofFloat(view3, "translationX", view3.getRootView().getWidth(), 0.0f));
        }
        Interpolator interpolator = this.d;
        if (interpolator != null) {
            animatorSet.setInterpolator(interpolator);
        }
        animatorSet.setDuration(this.e);
        animatorSet.start();
    }

    public AnimationUtil setAnimationType(AnimationType animationType) {
        this.a = animationType;
        return this;
    }

    public AnimationUtil setCustomAnimation(Animator animator) {
        this.b = animator;
        return this;
    }

    public AnimationUtil setDuration(int i) {
        this.e = i;
        return this;
    }

    public AnimationUtil setInterpolator(Interpolator interpolator) {
        this.d = interpolator;
        return this;
    }

    public AnimationUtil setTargetView(View view) {
        this.c = view;
        return this;
    }

    public void start() {
        Animator animator = this.b;
        if (animator != null) {
            animator.start();
        } else {
            if (this.c == null) {
                throw new IllegalArgumentException("You must set a target view!");
            }
            a(this.a);
        }
    }
}
