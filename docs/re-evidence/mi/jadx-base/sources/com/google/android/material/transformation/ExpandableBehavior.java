package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.c;
import defpackage.yi8;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8963a;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f8964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f8965b;
        public final /* synthetic */ yi8 c;

        public a(View view, int i, yi8 yi8Var) {
            this.f8964a = view;
            this.f8965b = i;
            this.c = yi8Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f8964a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f8963a == this.f8965b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                yi8 yi8Var = this.c;
                expandableBehavior.d((View) yi8Var, this.f8964a, yi8Var.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f8963a = 0;
    }

    public final boolean b(boolean z) {
        if (!z) {
            return this.f8963a == 1;
        }
        int i = this.f8963a;
        return i == 0 || i == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yi8 c(CoordinatorLayout coordinatorLayout, View view) {
        List<View> listP = coordinatorLayout.p(view);
        int size = listP.size();
        for (int i = 0; i < size; i++) {
            View view2 = listP.get(i);
            if (layoutDependsOn(coordinatorLayout, view, view2)) {
                return (yi8) view2;
            }
        }
        return null;
    }

    public abstract boolean d(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        yi8 yi8Var = (yi8) view2;
        if (!b(yi8Var.a())) {
            return false;
        }
        this.f8963a = yi8Var.a() ? 1 : 2;
        return d((View) yi8Var, view, yi8Var.a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        yi8 yi8VarC;
        if (c.U(view) || (yi8VarC = c(coordinatorLayout, view)) == null || !b(yi8VarC.a())) {
            return false;
        }
        int i2 = yi8VarC.a() ? 1 : 2;
        this.f8963a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i2, yi8VarC));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8963a = 0;
    }
}
