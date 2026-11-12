package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.c;
import defpackage.p3b;
import defpackage.r8f;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {
    public final Rect d;
    public final Rect e;
    public int f;
    public int g;

    public HeaderScrollingViewBehavior() {
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }

    public static int j(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public void b(CoordinatorLayout coordinatorLayout, View view, int i) {
        View viewD = d(coordinatorLayout.p(view));
        if (viewD == null) {
            super.b(coordinatorLayout, view, i);
            this.f = 0;
            return;
        }
        CoordinatorLayout.e eVar = (CoordinatorLayout.e) view.getLayoutParams();
        Rect rect = this.d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, viewD.getBottom() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, ((coordinatorLayout.getHeight() + viewD.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && c.x(coordinatorLayout) && !c.x(view)) {
            rect.left += lastWindowInsets.k();
            rect.right -= lastWindowInsets.l();
        }
        Rect rect2 = this.e;
        p3b.a(j(eVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int iE = e(viewD);
        view.layout(rect2.left, rect2.top - iE, rect2.right, rect2.bottom - iE);
        this.f = rect2.top - viewD.getBottom();
    }

    public abstract View d(List<View> list);

    public final int e(View view) {
        if (this.g == 0) {
            return 0;
        }
        float f = f(view);
        int i = this.g;
        return r8f.b((int) (f * i), 0, i);
    }

    public float f(View view) {
        return 1.0f;
    }

    public final int g() {
        return this.g;
    }

    public int h(View view) {
        return view.getMeasuredHeight();
    }

    public final int i() {
        return this.f;
    }

    public final void k(int i) {
        this.g = i;
    }

    public boolean l() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View viewD;
        WindowInsetsCompat lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (viewD = d(coordinatorLayout.p(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (c.x(viewD) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.m() + lastWindowInsets.j();
        }
        int iH = size + h(viewD);
        int measuredHeight = viewD.getMeasuredHeight();
        if (l()) {
            view.setTranslationY(-measuredHeight);
        } else {
            iH -= measuredHeight;
        }
        coordinatorLayout.H(view, i, i2, View.MeasureSpec.makeMeasureSpec(iH, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }
}
