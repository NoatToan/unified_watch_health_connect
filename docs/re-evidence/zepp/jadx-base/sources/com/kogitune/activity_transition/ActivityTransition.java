package com.kogitune.activity_transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.kogitune.activity_transition.core.TransitionAnimation;

/* JADX INFO: loaded from: classes18.dex */
public class ActivityTransition {
    private int a = 1000;
    private View b;
    private TimeInterpolator c;
    private Animator.AnimatorListener d;
    private Intent e;

    private ActivityTransition(Intent intent) {
        this.e = intent;
    }

    public static ActivityTransition with(Intent intent) {
        return new ActivityTransition(intent);
    }

    public ActivityTransition duration(int i) {
        this.a = i;
        return this;
    }

    public ActivityTransition enterListener(Animator.AnimatorListener animatorListener) {
        this.d = animatorListener;
        return this;
    }

    public ActivityTransition interpolator(TimeInterpolator timeInterpolator) {
        this.c = timeInterpolator;
        return this;
    }

    public ExitActivityTransition start(Bundle bundle) {
        if (this.c == null) {
            this.c = new DecelerateInterpolator();
        }
        return new ExitActivityTransition(TransitionAnimation.startAnimation(this.b.getContext(), this.b, this.e.getExtras(), bundle, this.a, this.c, this.d));
    }

    public ActivityTransition to(View view) {
        this.b = view;
        return this;
    }
}
