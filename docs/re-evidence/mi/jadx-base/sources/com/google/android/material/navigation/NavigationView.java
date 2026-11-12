package com.google.android.material.navigation;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.Dimension;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import defpackage.auk;
import defpackage.b4j;
import defpackage.c9p;
import defpackage.k3j;
import defpackage.k8f;
import defpackage.l8f;
import defpackage.m8f;
import defpackage.n8f;
import defpackage.ni4;
import defpackage.of1;
import defpackage.oig;
import defpackage.p3b;
import defpackage.pig;
import defpackage.pii;
import defpackage.qii;
import defpackage.r2m;
import defpackage.s2m;
import defpackage.wi4;
import defpackage.wpo;
import defpackage.xfp;

/* JADX INFO: loaded from: classes5.dex */
public class NavigationView extends ScrimInsetsFrameLayout {
    public static final int[] s = {R.attr.state_checked};
    public static final int[] t = {-16842910};
    public static final int u = k3j.m;
    public final oig f;
    public final pig g;
    public c h;
    public final int i;
    public final int[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MenuInflater f8770k;
    public ViewTreeObserver.OnGlobalLayoutListener l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public Path q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RectF f8771r;

    public class a implements e.a {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(e eVar, MenuItem menuItem) {
            c cVar = NavigationView.this.h;
            return cVar != null && cVar.a(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(e eVar) {
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.j);
            boolean z = NavigationView.this.j[1] == 0;
            NavigationView.this.g.y(z);
            NavigationView navigationView2 = NavigationView.this;
            navigationView2.setDrawTopInsetForeground(z && navigationView2.k());
            Activity activityA = wi4.a(NavigationView.this.getContext());
            if (activityA != null) {
                boolean z2 = activityA.findViewById(R.id.content).getHeight() == NavigationView.this.getHeight();
                boolean z3 = Color.alpha(activityA.getWindow().getNavigationBarColor()) != 0;
                NavigationView navigationView3 = NavigationView.this;
                navigationView3.setDrawBottomInsetForeground(z2 && z3 && navigationView3.j());
            }
        }
    }

    public interface c {
        boolean a(MenuItem menuItem);
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    private MenuInflater getMenuInflater() {
        if (this.f8770k == null) {
            this.f8770k = new wpo(getContext());
        }
        return this.f8770k;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void a(WindowInsetsCompat windowInsetsCompat) {
        this.g.i(windowInsetsCompat);
    }

    public final ColorStateList d(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListA = of1.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(qii.z, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateListA.getDefaultColor();
        int[] iArr = t;
        return new ColorStateList(new int[][]{iArr, s, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListA.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.q == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.q);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    public final Drawable e(xfp xfpVar) {
        return f(xfpVar, k8f.a(getContext(), xfpVar, b4j.H6));
    }

    public final Drawable f(xfp xfpVar, ColorStateList colorStateList) {
        l8f l8fVar = new l8f(r2m.b(getContext(), xfpVar.n(b4j.F6, 0), xfpVar.n(b4j.G6, 0)).m());
        l8fVar.b0(colorStateList);
        return new InsetDrawable((Drawable) l8fVar, xfpVar.f(b4j.K6, 0), xfpVar.f(b4j.L6, 0), xfpVar.f(b4j.J6, 0), xfpVar.f(b4j.I6, 0));
    }

    public final boolean g(xfp xfpVar) {
        return xfpVar.s(b4j.F6) || xfpVar.s(b4j.G6);
    }

    public MenuItem getCheckedItem() {
        return this.g.j();
    }

    public int getDividerInsetEnd() {
        return this.g.k();
    }

    public int getDividerInsetStart() {
        return this.g.l();
    }

    public int getHeaderCount() {
        return this.g.m();
    }

    public Drawable getItemBackground() {
        return this.g.n();
    }

    @Dimension
    public int getItemHorizontalPadding() {
        return this.g.o();
    }

    @Dimension
    public int getItemIconPadding() {
        return this.g.p();
    }

    public ColorStateList getItemIconTintList() {
        return this.g.s();
    }

    public int getItemMaxLines() {
        return this.g.q();
    }

    public ColorStateList getItemTextColor() {
        return this.g.r();
    }

    public int getItemVerticalPadding() {
        return this.g.t();
    }

    public Menu getMenu() {
        return this.f;
    }

    public int getSubheaderInsetEnd() {
        return this.g.v();
    }

    public int getSubheaderInsetStart() {
        return this.g.w();
    }

    public View h(int i) {
        return this.g.x(i);
    }

    public void i(int i) {
        this.g.R(true);
        getMenuInflater().inflate(i, this.f);
        this.g.R(false);
        this.g.updateMenuView(false);
    }

    public boolean j() {
        return this.n;
    }

    public boolean k() {
        return this.m;
    }

    public final void l(int i, int i2) {
        if (!(getParent() instanceof DrawerLayout) || this.p <= 0 || !(getBackground() instanceof l8f)) {
            this.q = null;
            this.f8771r.setEmpty();
            return;
        }
        l8f l8fVar = (l8f) getBackground();
        r2m.b bVarV = l8fVar.E().v();
        if (p3b.b(this.o, androidx.core.view.c.A(this)) == 3) {
            bVarV.I(this.p);
            bVarV.z(this.p);
        } else {
            bVarV.E(this.p);
            bVarV.v(this.p);
        }
        l8fVar.setShapeAppearanceModel(bVarV.m());
        if (this.q == null) {
            this.q = new Path();
        }
        this.q.reset();
        this.f8771r.set(0.0f, 0.0f, i, i2);
        s2m.k().e(l8fVar.E(), l8fVar.y(), this.f8771r, this.q);
        invalidate();
    }

    public final void m() {
        this.l = new b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.l);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m8f.e(this);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.l);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.i), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.i, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.f.S(savedState.f8772b);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f8772b = bundle;
        this.f.U(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        l(i, i2);
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.n = z;
    }

    public void setCheckedItem(int i) {
        MenuItem menuItemFindItem = this.f.findItem(i);
        if (menuItemFindItem != null) {
            this.g.z((g) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(int i) {
        this.g.A(i);
    }

    public void setDividerInsetStart(int i) {
        this.g.B(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m8f.d(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.g.D(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(ni4.e(getContext(), i));
    }

    public void setItemHorizontalPadding(@Dimension int i) {
        this.g.F(i);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.g.F(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(@Dimension int i) {
        this.g.G(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.g.G(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(@Dimension int i) {
        this.g.H(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.g.I(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.g.J(i);
    }

    public void setItemTextAppearance(int i) {
        this.g.K(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.g.L(colorStateList);
    }

    public void setItemVerticalPadding(int i) {
        this.g.M(i);
    }

    public void setItemVerticalPaddingResource(int i) {
        this.g.M(getResources().getDimensionPixelSize(i));
    }

    public void setNavigationItemSelectedListener(c cVar) {
        this.h = cVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        pig pigVar = this.g;
        if (pigVar != null) {
            pigVar.N(i);
        }
    }

    public void setSubheaderInsetEnd(int i) {
        this.g.P(i);
    }

    public void setSubheaderInsetStart(int i) {
        this.g.P(i);
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.m = z;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Bundle f8772b;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8772b = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f8772b);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pii.Q);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListD;
        int i2 = u;
        super(n8f.c(context, attributeSet, i, i2), attributeSet, i);
        pig pigVar = new pig();
        this.g = pigVar;
        this.j = new int[2];
        this.m = true;
        this.n = true;
        this.o = 0;
        this.p = 0;
        this.f8771r = new RectF();
        Context context2 = getContext();
        oig oigVar = new oig(context2);
        this.f = oigVar;
        xfp xfpVarI = c9p.i(context2, attributeSet, b4j.n6, i, i2, new int[0]);
        if (xfpVarI.s(b4j.p6)) {
            androidx.core.view.c.v0(this, xfpVarI.g(b4j.p6));
        }
        this.p = xfpVarI.f(b4j.v6, 0);
        this.o = xfpVarI.k(b4j.o6, 0);
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            r2m r2mVarM = r2m.e(context2, attributeSet, i, i2).m();
            Drawable background = getBackground();
            l8f l8fVar = new l8f(r2mVarM);
            if (background instanceof ColorDrawable) {
                l8fVar.b0(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            l8fVar.Q(context2);
            androidx.core.view.c.v0(this, l8fVar);
        }
        if (xfpVarI.s(b4j.w6)) {
            setElevation(xfpVarI.f(b4j.w6, 0));
        }
        setFitsSystemWindows(xfpVarI.a(b4j.q6, false));
        this.i = xfpVarI.f(b4j.r6, 0);
        ColorStateList colorStateListC = xfpVarI.s(b4j.Q6) ? xfpVarI.c(b4j.Q6) : null;
        int iN = xfpVarI.s(b4j.T6) ? xfpVarI.n(b4j.T6, 0) : 0;
        if (iN == 0 && colorStateListC == null) {
            colorStateListC = d(R.attr.textColorSecondary);
        }
        if (xfpVarI.s(b4j.C6)) {
            colorStateListD = xfpVarI.c(b4j.C6);
        } else {
            colorStateListD = d(R.attr.textColorSecondary);
        }
        int iN2 = xfpVarI.s(b4j.M6) ? xfpVarI.n(b4j.M6, 0) : 0;
        if (xfpVarI.s(b4j.B6)) {
            setItemIconSize(xfpVarI.f(b4j.B6, 0));
        }
        ColorStateList colorStateListC2 = xfpVarI.s(b4j.N6) ? xfpVarI.c(b4j.N6) : null;
        if (iN2 == 0 && colorStateListC2 == null) {
            colorStateListC2 = d(R.attr.textColorPrimary);
        }
        Drawable drawableG = xfpVarI.g(b4j.y6);
        if (drawableG == null && g(xfpVarI)) {
            drawableG = e(xfpVarI);
            ColorStateList colorStateListA = k8f.a(context2, xfpVarI, b4j.E6);
            if (colorStateListA != null) {
                pigVar.E(new RippleDrawable(auk.d(colorStateListA), null, f(xfpVarI, null)));
            }
        }
        if (xfpVarI.s(b4j.z6)) {
            setItemHorizontalPadding(xfpVarI.f(b4j.z6, 0));
        }
        if (xfpVarI.s(b4j.O6)) {
            setItemVerticalPadding(xfpVarI.f(b4j.O6, 0));
        }
        setDividerInsetStart(xfpVarI.f(b4j.u6, 0));
        setDividerInsetEnd(xfpVarI.f(b4j.t6, 0));
        setSubheaderInsetStart(xfpVarI.f(b4j.S6, 0));
        setSubheaderInsetEnd(xfpVarI.f(b4j.R6, 0));
        setTopInsetScrimEnabled(xfpVarI.a(b4j.U6, this.m));
        setBottomInsetScrimEnabled(xfpVarI.a(b4j.s6, this.n));
        int iF = xfpVarI.f(b4j.A6, 0);
        setItemMaxLines(xfpVarI.k(b4j.D6, 1));
        oigVar.V(new a());
        pigVar.C(1);
        pigVar.e(context2, oigVar);
        if (iN != 0) {
            pigVar.Q(iN);
        }
        pigVar.O(colorStateListC);
        pigVar.I(colorStateListD);
        pigVar.N(getOverScrollMode());
        if (iN2 != 0) {
            pigVar.K(iN2);
        }
        pigVar.L(colorStateListC2);
        pigVar.D(drawableG);
        pigVar.G(iF);
        oigVar.b(pigVar);
        addView((View) pigVar.u(this));
        if (xfpVarI.s(b4j.P6)) {
            i(xfpVarI.n(b4j.P6, 0));
        }
        if (xfpVarI.s(b4j.x6)) {
            h(xfpVarI.n(b4j.x6, 0));
        }
        xfpVarI.w();
        m();
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.f.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.g.z((g) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
