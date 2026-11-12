package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.Dimension;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.wc1;

/* JADX INFO: loaded from: classes5.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8544b;
    public int c;
    public ViewPropertyAnimator d;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f8543a = 0;
        this.f8544b = 2;
        this.c = 0;
    }

    public final void b(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.d = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new a());
    }

    public boolean c() {
        return this.f8544b == 1;
    }

    public boolean d() {
        return this.f8544b == 2;
    }

    public void e(V v, @Dimension int i) {
        this.c = i;
        if (this.f8544b == 1) {
            v.setTranslationY(this.f8543a + i);
        }
    }

    public void f(V v) {
        g(v, true);
    }

    public void g(V v, boolean z) {
        if (c()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f8544b = 1;
        int i = this.f8543a + this.c;
        if (z) {
            b(v, i, 175L, wc1.c);
        } else {
            v.setTranslationY(i);
        }
    }

    public void h(V v) {
        i(v, true);
    }

    public void i(V v, boolean z) {
        if (d()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f8544b = 2;
        if (z) {
            b(v, 0, 225L, wc1.d);
        } else {
            v.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f8543a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.onLayoutChild(coordinatorLayout, v, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            f(v);
        } else if (i2 < 0) {
            h(v);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8543a = 0;
        this.f8544b = 2;
        this.c = 0;
    }
}
