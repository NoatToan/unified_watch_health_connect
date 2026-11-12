package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class a implements MultiViewUpdateListener.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53210a;

    public /* synthetic */ a(int i14) {
        this.f53210a = i14;
    }

    @Override // com.google.android.material.internal.MultiViewUpdateListener.Listener
    public final void onAnimationUpdate(ValueAnimator valueAnimator, View view2) {
        switch (this.f53210a) {
            case 0:
                MultiViewUpdateListener.setTranslationX(valueAnimator, view2);
                break;
            case 1:
                MultiViewUpdateListener.setScale(valueAnimator, view2);
                break;
            case 2:
                MultiViewUpdateListener.setTranslationY(valueAnimator, view2);
                break;
            default:
                MultiViewUpdateListener.setAlpha(valueAnimator, view2);
                break;
        }
    }
}
