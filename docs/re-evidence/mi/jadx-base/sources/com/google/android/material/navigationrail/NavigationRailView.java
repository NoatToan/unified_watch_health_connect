package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.c;
import com.google.android.material.navigation.NavigationBarView;
import defpackage.ayq;
import defpackage.b4j;
import defpackage.c9p;
import defpackage.k3j;
import defpackage.pii;
import defpackage.pmi;
import defpackage.xfp;

/* JADX INFO: loaded from: classes5.dex */
public class NavigationRailView extends NavigationBarView {
    public final int g;
    public View h;
    public Boolean i;
    public Boolean j;

    public class a implements ayq.e {
        public a() {
        }

        @Override // ayq.e
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, ayq.f fVar) {
            NavigationRailView navigationRailView = NavigationRailView.this;
            if (navigationRailView.p(navigationRailView.i)) {
                fVar.f3589b += windowInsetsCompat.f(WindowInsetsCompat.m.h()).f32379b;
            }
            NavigationRailView navigationRailView2 = NavigationRailView.this;
            if (navigationRailView2.p(navigationRailView2.j)) {
                fVar.d += windowInsetsCompat.f(WindowInsetsCompat.m.h()).d;
            }
            boolean z = c.A(view) == 1;
            int iK = windowInsetsCompat.k();
            int iL = windowInsetsCompat.l();
            int i = fVar.f3588a;
            if (z) {
                iK = iL;
            }
            fVar.f3588a = i + iK;
            fVar.a(view);
            return windowInsetsCompat;
        }
    }

    public NavigationRailView(Context context) {
        this(context, null);
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    private void k() {
        ayq.b(this, new a());
    }

    public View getHeaderView() {
        return this.h;
    }

    public int getItemMinimumHeight() {
        return ((NavigationRailMenuView) getMenuView()).getItemMinimumHeight();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    public void i(int i) {
        j(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this, false));
    }

    public void j(View view) {
        o();
        this.h = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = this.g;
        addView(view, 0, layoutParams);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public NavigationRailMenuView d(Context context) {
        return new NavigationRailMenuView(context);
    }

    public final boolean m() {
        View view = this.h;
        return (view == null || view.getVisibility() == 8) ? false : true;
    }

    public final int n(int i) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumWidth <= 0) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), suggestedMinimumWidth + getPaddingLeft() + getPaddingRight()), 1073741824);
    }

    public void o() {
        View view = this.h;
        if (view != null) {
            removeView(view);
            this.h = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        NavigationRailMenuView navigationRailMenuView = getNavigationRailMenuView();
        int i5 = 0;
        if (m()) {
            int bottom = this.h.getBottom() + this.g;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i5 = bottom - top;
            }
        } else if (navigationRailMenuView.n()) {
            i5 = this.g;
        }
        if (i5 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i5, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i5);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iN = n(i);
        super.onMeasure(iN, i2);
        if (m()) {
            measureChild(getNavigationRailMenuView(), iN, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.h.getMeasuredHeight()) - this.g, Integer.MIN_VALUE));
        }
    }

    public final boolean p(Boolean bool) {
        return bool != null ? bool.booleanValue() : c.x(this);
    }

    public void setItemMinimumHeight(int i) {
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i);
    }

    public void setMenuGravity(int i) {
        getNavigationRailMenuView().setMenuGravity(i);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pii.P);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, k3j.G);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.i = null;
        this.j = null;
        this.g = getResources().getDimensionPixelSize(pmi.o0);
        xfp xfpVarI = c9p.i(getContext(), attributeSet, b4j.h6, i, i2, new int[0]);
        int iN = xfpVarI.n(b4j.i6, 0);
        if (iN != 0) {
            i(iN);
        }
        setMenuGravity(xfpVarI.k(b4j.k6, 49));
        if (xfpVarI.s(b4j.j6)) {
            setItemMinimumHeight(xfpVarI.f(b4j.j6, -1));
        }
        if (xfpVarI.s(b4j.m6)) {
            this.i = Boolean.valueOf(xfpVarI.a(b4j.m6, false));
        }
        if (xfpVarI.s(b4j.l6)) {
            this.j = Boolean.valueOf(xfpVarI.a(b4j.l6, false));
        }
        xfpVarI.w();
        k();
    }
}
