package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.kvq;

/* JADX INFO: loaded from: classes5.dex */
class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kvq f8529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8530b;
    public int c;

    public ViewOffsetBehavior() {
        this.f8530b = 0;
        this.c = 0;
    }

    public int a() {
        kvq kvqVar = this.f8529a;
        if (kvqVar != null) {
            return kvqVar.c();
        }
        return 0;
    }

    public void b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.G(v, i);
    }

    public boolean c(int i) {
        kvq kvqVar = this.f8529a;
        if (kvqVar != null) {
            return kvqVar.f(i);
        }
        this.f8530b = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        b(coordinatorLayout, v, i);
        if (this.f8529a == null) {
            this.f8529a = new kvq(v);
        }
        this.f8529a.d();
        this.f8529a.a();
        int i2 = this.f8530b;
        if (i2 != 0) {
            this.f8529a.f(i2);
            this.f8530b = 0;
        }
        int i3 = this.c;
        if (i3 == 0) {
            return true;
        }
        this.f8529a.e(i3);
        this.c = 0;
        return true;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8530b = 0;
        this.c = 0;
    }
}
