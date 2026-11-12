package com.huami.watchfacesstore.view.recycleview.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes17.dex */
public class AlphaInAnimation implements BaseAnimation {
    private final float a;

    public AlphaInAnimation() {
        this(0.0f);
    }

    @Override // com.huami.watchfacesstore.view.recycleview.animation.BaseAnimation
    public Animator[] getAnimators(View view) {
        return new Animator[]{ObjectAnimator.ofFloat(view, "alpha", this.a, 1.0f)};
    }

    public AlphaInAnimation(float from) {
        this.a = from;
    }
}
