package com.kogitune.activity_transition.fragment;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.Fragment;
import com.kogitune.activity_transition.core.MoveData;
import com.kogitune.activity_transition.core.TransitionAnimation;

/* JADX INFO: loaded from: classes18.dex */
public class FragmentTransition {
    private static TimeInterpolator f;
    private Animator.AnimatorListener a;
    private int b = 1000;
    private View c;
    private Fragment d;
    private android.app.Fragment e;

    private FragmentTransition(android.app.Fragment fragment) {
        this.e = fragment;
    }

    public static FragmentTransition with(android.app.Fragment fragment) {
        return new FragmentTransition(fragment);
    }

    public FragmentTransition duration(int i) {
        this.b = i;
        return this;
    }

    public FragmentTransition enterListener(Animator.AnimatorListener animatorListener) {
        this.a = animatorListener;
        return this;
    }

    public FragmentTransition interpolator(TimeInterpolator timeInterpolator) {
        f = timeInterpolator;
        return this;
    }

    public ExitFragmentTransition start(Bundle bundle) {
        Bundle bundle2;
        if (f == null) {
            f = new DecelerateInterpolator();
        }
        Context context = this.c.getContext();
        android.app.Fragment fragment = this.e;
        if (fragment == null) {
            if (this.d.getArguments() == null) {
                throw new IllegalStateException("you should call FragmentTransitionLauncher.prepare() at first ");
            }
            bundle2 = this.d.getArguments().getBundle(FragmentTransitionLauncher.e);
        } else {
            if (fragment.getArguments() == null) {
                throw new IllegalStateException("you should call FragmentTransitionLauncher.prepare() at first ");
            }
            bundle2 = this.e.getArguments().getBundle(FragmentTransitionLauncher.e);
        }
        MoveData moveDataStartAnimation = TransitionAnimation.startAnimation(context, this.c, bundle2, bundle, this.b, f, this.a);
        android.app.Fragment fragment2 = this.e;
        return fragment2 == null ? new ExitFragmentTransition(this.d, moveDataStartAnimation) : new ExitFragmentTransition(fragment2, moveDataStartAnimation);
    }

    public FragmentTransition to(View view) {
        this.c = view;
        return this;
    }

    public static FragmentTransition with(Fragment fragment) {
        return new FragmentTransition(fragment);
    }

    private FragmentTransition(Fragment fragment) {
        this.d = fragment;
    }
}
