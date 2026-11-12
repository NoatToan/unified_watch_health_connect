package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.exh;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ValidFragment"})
public class ScreenStackFragment extends ScreenFragment {
    public static final float e = exh.c(4.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AppBarLayout f10674b;
    public Toolbar c;
    public boolean d;

    @SuppressLint({"ValidFragment"})
    public ScreenStackFragment(Screen screen) {
        super(screen);
    }

    @Override // com.swmansion.rnscreens.ScreenFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext());
        CoordinatorLayout.e eVar = new CoordinatorLayout.e(-1, -1);
        eVar.o(new AppBarLayout.ScrollingViewBehavior());
        this.f10667a.setLayoutParams(eVar);
        coordinatorLayout.addView(this.f10667a);
        AppBarLayout appBarLayout = new AppBarLayout(getContext());
        this.f10674b = appBarLayout;
        appBarLayout.setBackgroundColor(0);
        this.f10674b.setLayoutParams(new AppBarLayout.LayoutParams(-1, -2));
        coordinatorLayout.addView(this.f10674b);
        Toolbar toolbar = this.c;
        if (toolbar != null) {
            this.f10674b.addView(toolbar);
        }
        return coordinatorLayout;
    }

    public boolean t() {
        View childAt = this.f10667a.getChildAt(0);
        if (childAt instanceof ScreenStackHeaderConfig) {
            return ((ScreenStackHeaderConfig) childAt).e();
        }
        return true;
    }

    public void u() {
        View childAt = this.f10667a.getChildAt(0);
        if (childAt instanceof ScreenStackHeaderConfig) {
            ((ScreenStackHeaderConfig) childAt).g();
        }
    }

    public void v() {
        if (this.f10674b != null) {
            ((CoordinatorLayout) getView()).removeView(this.f10674b);
        }
    }

    public void w(Toolbar toolbar) {
        AppBarLayout appBarLayout = this.f10674b;
        if (appBarLayout != null) {
            appBarLayout.addView(toolbar);
        }
        this.c = toolbar;
        AppBarLayout.LayoutParams layoutParams = new AppBarLayout.LayoutParams(-1, -2);
        layoutParams.g(0);
        this.c.setLayoutParams(layoutParams);
    }

    public void x(boolean z) {
        if (this.d != z) {
            this.f10674b.setTargetElevation(z ? 0.0f : e);
            this.d = z;
        }
    }
}
