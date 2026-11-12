package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import defpackage.ayq;
import defpackage.b4j;
import defpackage.c9p;
import defpackage.k3j;
import defpackage.ni4;
import defpackage.pii;
import defpackage.pmi;
import defpackage.xfp;
import defpackage.xki;

/* JADX INFO: loaded from: classes5.dex */
public class BottomNavigationView extends NavigationBarView {

    public class a implements ayq.e {
        public a() {
        }

        @Override // ayq.e
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, ayq.f fVar) {
            fVar.d += windowInsetsCompat.j();
            boolean z = androidx.core.view.c.A(view) == 1;
            int iK = windowInsetsCompat.k();
            int iL = windowInsetsCompat.l();
            fVar.f3588a += z ? iL : iK;
            int i = fVar.c;
            if (!z) {
                iK = iL;
            }
            fVar.c = i + iK;
            fVar.a(view);
            return windowInsetsCompat;
        }
    }

    @Deprecated
    public interface b extends NavigationBarView.b {
    }

    @Deprecated
    public interface c extends NavigationBarView.c {
    }

    public BottomNavigationView(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavigationBarMenuView d(Context context) {
        return new BottomNavigationMenuView(context);
    }

    public final void f(Context context) {
        View view = new View(context);
        view.setBackgroundColor(ni4.c(context, xki.f39216a));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(pmi.g)));
        addView(view);
    }

    public final void g() {
        ayq.b(this, new a());
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 5;
    }

    public final int h(int i) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), 1073741824);
    }

    public final boolean i() {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, h(i2));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) getMenuView();
        if (bottomNavigationMenuView.n() != z) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z);
            getPresenter().updateMenuView(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(b bVar) {
        setOnItemReselectedListener(bVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(c cVar) {
        setOnItemSelectedListener(cVar);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pii.e);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, k3j.i);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Context context2 = getContext();
        xfp xfpVarI = c9p.i(context2, attributeSet, b4j.m0, i, i2, new int[0]);
        setItemHorizontalTranslationEnabled(xfpVarI.a(b4j.o0, true));
        if (xfpVarI.s(b4j.n0)) {
            setMinimumHeight(xfpVarI.f(b4j.n0, 0));
        }
        xfpVarI.w();
        if (i()) {
            f(context2);
        }
        g();
    }
}
