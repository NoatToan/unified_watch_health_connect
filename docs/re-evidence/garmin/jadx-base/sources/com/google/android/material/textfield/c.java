package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EndIconDelegate f53256b;

    public /* synthetic */ c(EndIconDelegate endIconDelegate, int i14) {
        this.f53255a = i14;
        this.f53256b = endIconDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f53255a) {
            case 0:
                ((ClearTextEndIconDelegate) this.f53256b).lambda$getAlphaAnimator$3(valueAnimator);
                break;
            case 1:
                ((ClearTextEndIconDelegate) this.f53256b).lambda$getScaleAnimator$4(valueAnimator);
                break;
            default:
                ((DropdownMenuEndIconDelegate) this.f53256b).lambda$getAlphaAnimator$6(valueAnimator);
                break;
        }
    }
}
