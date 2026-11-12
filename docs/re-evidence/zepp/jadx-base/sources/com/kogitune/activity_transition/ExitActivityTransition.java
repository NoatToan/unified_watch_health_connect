package com.kogitune.activity_transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.view.animation.DecelerateInterpolator;
import com.kogitune.activity_transition.core.MoveData;
import com.kogitune.activity_transition.core.TransitionAnimation;

/* JADX INFO: loaded from: classes18.dex */
public class ExitActivityTransition {
    private final MoveData a;
    private TimeInterpolator b;
    private Animator.AnimatorListener c;

    public class a implements Runnable {
        public final /* synthetic */ Activity a;

        public a(Activity activity) {
            this.a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.finish();
            this.a.overridePendingTransition(0, 0);
        }
    }

    public ExitActivityTransition(MoveData moveData) {
        this.a = moveData;
    }

    public void exit(Activity activity) {
        if (this.b == null) {
            this.b = new DecelerateInterpolator();
        }
        TransitionAnimation.startExitAnimation(this.a, this.b, new a(activity), this.c);
    }

    public ExitActivityTransition exitListener(Animator.AnimatorListener animatorListener) {
        this.c = animatorListener;
        return this;
    }

    public ExitActivityTransition interpolator(TimeInterpolator timeInterpolator) {
        this.b = timeInterpolator;
        return this;
    }
}
