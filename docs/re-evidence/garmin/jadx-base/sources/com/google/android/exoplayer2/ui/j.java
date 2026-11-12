package com.google.android.exoplayer2.ui;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class j implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53121b;

    public /* synthetic */ j(Object obj, int i14) {
        this.f53120a = i14;
        this.f53121b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f53120a) {
            case 0:
                ((StyledPlayerControlViewLayoutManager) this.f53121b).lambda$new$1(valueAnimator);
                break;
            case 1:
                ((StyledPlayerControlViewLayoutManager) this.f53121b).lambda$new$2(valueAnimator);
                break;
            case 2:
                ((StyledPlayerControlViewLayoutManager) this.f53121b).lambda$new$3(valueAnimator);
                break;
            case 3:
                ((StyledPlayerControlViewLayoutManager) this.f53121b).lambda$new$0(valueAnimator);
                break;
            default:
                ((DefaultTimeBar) this.f53121b).lambda$new$1(valueAnimator);
                break;
        }
    }
}
