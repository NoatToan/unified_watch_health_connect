package com.google.android.material.search;

import android.animation.Animator;
import android.view.View;
import androidx.core.view.m1;
import com.google.android.material.animation.AnimatableView;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class b implements l7.d, AnimatableView.Listener, ViewUtils.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f53216a;

    public /* synthetic */ b(Object obj) {
        this.f53216a = obj;
    }

    @Override // com.google.android.material.animation.AnimatableView.Listener
    public void onAnimationEnd() {
        ((Animator) this.f53216a).start();
    }

    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
    public m1 onApplyWindowInsets(View view2, m1 m1Var, ViewUtils.RelativePadding relativePadding) {
        return ((SearchView) this.f53216a).lambda$setUpToolbarInsetListener$4(view2, m1Var, relativePadding);
    }

    @Override // l7.d
    public void onTouchExplorationStateChanged(boolean z14) {
        ((SearchBar) this.f53216a).lambda$new$0(z14);
    }
}
