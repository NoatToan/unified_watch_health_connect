package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.d0;
import androidx.transition.t;

/* JADX INFO: loaded from: classes14.dex */
public final class Hold extends d0 {
    @Override // androidx.transition.d0
    public Animator onAppear(ViewGroup viewGroup, View view2, t tVar, t tVar2) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // androidx.transition.d0
    public Animator onDisappear(ViewGroup viewGroup, View view2, t tVar, t tVar2) {
        return ValueAnimator.ofFloat(0.0f);
    }
}
