package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.WindowInsetsCompat;
import defpackage.b44;
import defpackage.b4j;
import defpackage.c9p;
import defpackage.iqi;
import defpackage.jz5;
import defpackage.k3j;
import defpackage.k47;
import defpackage.k8f;
import defpackage.kvq;
import defpackage.l4h;
import defpackage.n3j;
import defpackage.n8f;
import defpackage.ni4;
import defpackage.o7h;
import defpackage.pii;
import defpackage.pmi;
import defpackage.r8f;
import defpackage.v68;
import defpackage.wc1;

/* JADX INFO: loaded from: classes5.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public static final int D = k3j.f23394k;
    public boolean A;
    public int B;
    public boolean C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8519b;
    public ViewGroup c;
    public View d;
    public View e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final Rect j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b44 f8520k;
    public final v68 l;
    public boolean m;
    public boolean n;
    public Drawable o;
    public Drawable p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8521r;
    public ValueAnimator s;
    public long t;
    public int u;
    public AppBarLayout.g v;
    public int w;
    public int x;
    public WindowInsetsCompat y;
    public int z;

    public class a implements o7h {
        public a() {
        }

        @Override // defpackage.o7h
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
            return CollapsingToolbarLayout.this.n(windowInsetsCompat);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public class c implements AppBarLayout.g {
        public c() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.c
        public void a(AppBarLayout appBarLayout, int i) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.w = i;
            WindowInsetsCompat windowInsetsCompat = collapsingToolbarLayout.y;
            int iM = windowInsetsCompat != null ? windowInsetsCompat.m() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                kvq kvqVarJ = CollapsingToolbarLayout.j(childAt);
                int i3 = layoutParams.f8522a;
                if (i3 == 1) {
                    kvqVarJ.f(r8f.b(-i, 0, CollapsingToolbarLayout.this.h(childAt)));
                } else if (i3 == 2) {
                    kvqVarJ.f(Math.round((-i) * layoutParams.f8523b));
                }
            }
            CollapsingToolbarLayout.this.u();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.p != null && iM > 0) {
                androidx.core.view.c.h0(collapsingToolbarLayout2);
            }
            int height = CollapsingToolbarLayout.this.getHeight();
            int iB = (height - androidx.core.view.c.B(CollapsingToolbarLayout.this)) - iM;
            float f = iB;
            CollapsingToolbarLayout.this.f8520k.w0(Math.min(1.0f, (height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger()) / f));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.f8520k.j0(collapsingToolbarLayout3.w + iB);
            CollapsingToolbarLayout.this.f8520k.u0(Math.abs(i) / f);
        }
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    public static int g(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static CharSequence i(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    public static kvq j(View view) {
        kvq kvqVar = (kvq) view.getTag(iqi.h0);
        if (kvqVar != null) {
            return kvqVar;
        }
        kvq kvqVar2 = new kvq(view);
        view.setTag(iqi.h0, kvqVar2);
        return kvqVar2;
    }

    public static boolean l(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    public final void a(int i) {
        c();
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.s = valueAnimator2;
            valueAnimator2.setInterpolator(i > this.q ? wc1.c : wc1.d);
            this.s.addUpdateListener(new b());
        } else if (valueAnimator.isRunning()) {
            this.s.cancel();
        }
        this.s.setDuration(this.t);
        this.s.setIntValues(this.q, i);
        this.s.start();
    }

    public final void b(AppBarLayout appBarLayout) {
        if (k()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    public final void c() {
        if (this.f8518a) {
            ViewGroup viewGroup = null;
            this.c = null;
            this.d = null;
            int i = this.f8519b;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.c = viewGroup2;
                if (viewGroup2 != null) {
                    this.d = d(viewGroup2);
                }
            }
            if (this.c == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if (l(childAt)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.c = viewGroup;
            }
            t();
            this.f8518a = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final View d(View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        c();
        if (this.c == null && (drawable = this.o) != null && this.q > 0) {
            drawable.mutate().setAlpha(this.q);
            this.o.draw(canvas);
        }
        if (this.m && this.n) {
            if (this.c == null || this.o == null || this.q <= 0 || !k() || this.f8520k.D() >= this.f8520k.E()) {
                this.f8520k.l(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.o.getBounds(), Region.Op.DIFFERENCE);
                this.f8520k.l(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.p == null || this.q <= 0) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.y;
        int iM = windowInsetsCompat != null ? windowInsetsCompat.m() : 0;
        if (iM > 0) {
            this.p.setBounds(0, -this.w, getWidth(), iM - this.w);
            this.p.mutate().setAlpha(this.q);
            this.p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.o == null || this.q <= 0 || !m(view)) {
            z = false;
        } else {
            s(this.o, view, getWidth(), getHeight());
            this.o.mutate().setAlpha(this.q);
            this.o.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.p;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.o;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        b44 b44Var = this.f8520k;
        if (b44Var != null) {
            state |= b44Var.E0(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int getCollapsedTitleGravity() {
        return this.f8520k.q();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.f8520k.u();
    }

    public Drawable getContentScrim() {
        return this.o;
    }

    public int getExpandedTitleGravity() {
        return this.f8520k.A();
    }

    public int getExpandedTitleMarginBottom() {
        return this.i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f;
    }

    public int getExpandedTitleMarginTop() {
        return this.g;
    }

    public Typeface getExpandedTitleTypeface() {
        return this.f8520k.C();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getHyphenationFrequency() {
        return this.f8520k.F();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLineCount() {
        return this.f8520k.G();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingAdd() {
        return this.f8520k.H();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingMultiplier() {
        return this.f8520k.I();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getMaxLines() {
        return this.f8520k.J();
    }

    public int getScrimAlpha() {
        return this.q;
    }

    public long getScrimAnimationDuration() {
        return this.t;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.u;
        if (i >= 0) {
            return i + this.z + this.B;
        }
        WindowInsetsCompat windowInsetsCompat = this.y;
        int iM = windowInsetsCompat != null ? windowInsetsCompat.m() : 0;
        int iB = androidx.core.view.c.B(this);
        return iB > 0 ? Math.min((iB * 2) + iM, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.p;
    }

    public CharSequence getTitle() {
        if (this.m) {
            return this.f8520k.M();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.x;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f8520k.L();
    }

    public final int h(View view) {
        return ((getHeight() - j(view).b()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    public final boolean k() {
        return this.x == 1;
    }

    public final boolean m(View view) {
        View view2 = this.d;
        if (view2 == null || view2 == this) {
            if (view != this.c) {
                return false;
            }
        } else if (view != view2) {
            return false;
        }
        return true;
    }

    public WindowInsetsCompat n(WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2 = androidx.core.view.c.x(this) ? windowInsetsCompat : null;
        if (!l4h.a(this.y, windowInsetsCompat2)) {
            this.y = windowInsetsCompat2;
            requestLayout();
        }
        return windowInsetsCompat.c();
    }

    public void o(boolean z, boolean z2) {
        if (this.f8521r != z) {
            if (z2) {
                a(z ? 255 : 0);
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.f8521r = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            b(appBarLayout);
            androidx.core.view.c.A0(this, androidx.core.view.c.x(appBarLayout));
            if (this.v == null) {
                this.v = new c();
            }
            appBarLayout.addOnOffsetChangedListener(this.v);
            androidx.core.view.c.n0(this);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f8520k.V(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.g gVar = this.v;
        if (gVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).removeOnOffsetChangedListener(gVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WindowInsetsCompat windowInsetsCompat = this.y;
        if (windowInsetsCompat != null) {
            int iM = windowInsetsCompat.m();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!androidx.core.view.c.x(childAt) && childAt.getTop() < iM) {
                    androidx.core.view.c.b0(childAt, iM);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            j(getChildAt(i6)).d();
        }
        v(i, i2, i3, i4, false);
        w();
        u();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            j(getChildAt(i7)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        c();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        WindowInsetsCompat windowInsetsCompat = this.y;
        int iM = windowInsetsCompat != null ? windowInsetsCompat.m() : 0;
        if ((mode == 0 || this.A) && iM > 0) {
            this.z = iM;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iM, 1073741824));
        }
        if (this.C && this.f8520k.J() > 1) {
            w();
            v(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int iY = this.f8520k.y();
            if (iY > 1) {
                this.B = Math.round(this.f8520k.z()) * (iY - 1);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.B, 1073741824));
            }
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            View view = this.d;
            if (view == null || view == this) {
                setMinimumHeight(g(viewGroup));
            } else {
                setMinimumHeight(g(view));
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.o;
        if (drawable != null) {
            r(drawable, i, i2);
        }
    }

    public final void p(boolean z) {
        int titleMarginStart;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        View view = this.d;
        if (view == null) {
            view = this.c;
        }
        int iH = h(view);
        jz5.a(this, this.e, this.j);
        ViewGroup viewGroup = this.c;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            titleMarginStart = toolbar.getTitleMarginStart();
            titleMarginEnd = toolbar.getTitleMarginEnd();
            titleMarginTop = toolbar.getTitleMarginTop();
            titleMarginBottom = toolbar.getTitleMarginBottom();
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            titleMarginStart = toolbar2.getTitleMarginStart();
            titleMarginEnd = toolbar2.getTitleMarginEnd();
            titleMarginTop = toolbar2.getTitleMarginTop();
            titleMarginBottom = toolbar2.getTitleMarginBottom();
        } else {
            titleMarginStart = 0;
            titleMarginBottom = 0;
            titleMarginEnd = 0;
            titleMarginTop = 0;
        }
        b44 b44Var = this.f8520k;
        Rect rect = this.j;
        int i = rect.left + (z ? titleMarginEnd : titleMarginStart);
        int i2 = rect.top + iH + titleMarginTop;
        int i3 = rect.right;
        if (!z) {
            titleMarginStart = titleMarginEnd;
        }
        b44Var.b0(i, i2, i3 - titleMarginStart, (rect.bottom + iH) - titleMarginBottom);
    }

    public final void q() {
        setContentDescription(getTitle());
    }

    public final void r(Drawable drawable, int i, int i2) {
        s(drawable, this.c, i, i2);
    }

    public final void s(Drawable drawable, View view, int i, int i2) {
        if (k() && view != null && this.m) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    public void setCollapsedTitleGravity(int i) {
        this.f8520k.g0(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.f8520k.d0(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.f8520k.h0(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.o;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.o = drawableMutate;
            if (drawableMutate != null) {
                r(drawableMutate, getWidth(), getHeight());
                this.o.setCallback(this);
                this.o.setAlpha(this.q);
            }
            androidx.core.view.c.h0(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(ni4.e(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.f8520k.q0(i);
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.i = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.h = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.g = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.f8520k.n0(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.f8520k.p0(colorStateList);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.f8520k.s0(typeface);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setExtraMultilineHeightEnabled(boolean z) {
        this.C = z;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.A = z;
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setHyphenationFrequency(int i) {
        this.f8520k.x0(i);
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingAdd(float f) {
        this.f8520k.z0(f);
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingMultiplier(@FloatRange(from = 0.0d) float f) {
        this.f8520k.A0(f);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setMaxLines(int i) {
        this.f8520k.B0(i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.f8520k.D0(z);
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.q) {
            if (this.o != null && (viewGroup = this.c) != null) {
                androidx.core.view.c.h0(viewGroup);
            }
            this.q = i;
            androidx.core.view.c.h0(this);
        }
    }

    public void setScrimAnimationDuration(@IntRange(from = 0) long j) {
        this.t = j;
    }

    public void setScrimVisibleHeightTrigger(@IntRange(from = 0) int i) {
        if (this.u != i) {
            this.u = i;
            u();
        }
    }

    public void setScrimsShown(boolean z) {
        o(z, androidx.core.view.c.U(this) && !isInEditMode());
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.p = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.p.setState(getDrawableState());
                }
                k47.m(this.p, androidx.core.view.c.A(this));
                this.p.setVisible(getVisibility() == 0, false);
                this.p.setCallback(this);
                this.p.setAlpha(this.q);
            }
            androidx.core.view.c.h0(this);
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(ni4.e(getContext(), i));
    }

    public void setTitle(CharSequence charSequence) {
        this.f8520k.F0(charSequence);
        q();
    }

    public void setTitleCollapseMode(int i) {
        this.x = i;
        boolean zK = k();
        this.f8520k.v0(zK);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            b((AppBarLayout) parent);
        }
        if (zK && this.o == null) {
            setContentScrimColor(this.l.d(getResources().getDimension(pmi.f30542a)));
        }
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.m) {
            this.m = z;
            q();
            t();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        this.f8520k.C0(timeInterpolator);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.p;
        if (drawable != null && drawable.isVisible() != z) {
            this.p.setVisible(z, false);
        }
        Drawable drawable2 = this.o;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.o.setVisible(z, false);
    }

    public final void t() {
        View view;
        if (!this.m && (view = this.e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.e);
            }
        }
        if (!this.m || this.c == null) {
            return;
        }
        if (this.e == null) {
            this.e = new View(getContext());
        }
        if (this.e.getParent() == null) {
            this.c.addView(this.e, -1, -1);
        }
    }

    public final void u() {
        if (this.o == null && this.p == null) {
            return;
        }
        setScrimsShown(getHeight() + this.w < getScrimVisibleHeightTrigger());
    }

    public final void v(int i, int i2, int i3, int i4, boolean z) {
        View view;
        if (!this.m || (view = this.e) == null) {
            return;
        }
        boolean z2 = androidx.core.view.c.T(view) && this.e.getVisibility() == 0;
        this.n = z2;
        if (z2 || z) {
            boolean z3 = androidx.core.view.c.A(this) == 1;
            p(z3);
            this.f8520k.k0(z3 ? this.h : this.f, this.j.top + this.g, (i3 - i) - (z3 ? this.f : this.h), (i4 - i2) - this.i);
            this.f8520k.Z(z);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.o || drawable == this.p;
    }

    public final void w() {
        if (this.c != null && this.m && TextUtils.isEmpty(this.f8520k.M())) {
            setTitle(i(this.c));
        }
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pii.l);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f8520k.f0(colorStateList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        int i2 = D;
        super(n8f.c(context, attributeSet, i, i2), attributeSet, i);
        this.f8518a = true;
        this.j = new Rect();
        this.u = -1;
        this.z = 0;
        this.B = 0;
        Context context2 = getContext();
        b44 b44Var = new b44(this);
        this.f8520k = b44Var;
        b44Var.G0(wc1.e);
        b44Var.D0(false);
        this.l = new v68(context2);
        TypedArray typedArrayH = c9p.h(context2, attributeSet, b4j.W1, i, i2, new int[0]);
        b44Var.q0(typedArrayH.getInt(b4j.b2, 8388691));
        b44Var.g0(typedArrayH.getInt(b4j.X1, 8388627));
        int dimensionPixelSize = typedArrayH.getDimensionPixelSize(b4j.c2, 0);
        this.i = dimensionPixelSize;
        this.h = dimensionPixelSize;
        this.g = dimensionPixelSize;
        this.f = dimensionPixelSize;
        if (typedArrayH.hasValue(b4j.f2)) {
            this.f = typedArrayH.getDimensionPixelSize(b4j.f2, 0);
        }
        if (typedArrayH.hasValue(b4j.e2)) {
            this.h = typedArrayH.getDimensionPixelSize(b4j.e2, 0);
        }
        if (typedArrayH.hasValue(b4j.g2)) {
            this.g = typedArrayH.getDimensionPixelSize(b4j.g2, 0);
        }
        if (typedArrayH.hasValue(b4j.d2)) {
            this.i = typedArrayH.getDimensionPixelSize(b4j.d2, 0);
        }
        this.m = typedArrayH.getBoolean(b4j.r2, true);
        setTitle(typedArrayH.getText(b4j.p2));
        b44Var.n0(k3j.c);
        b44Var.d0(n3j.f27509b);
        if (typedArrayH.hasValue(b4j.h2)) {
            b44Var.n0(typedArrayH.getResourceId(b4j.h2, 0));
        }
        if (typedArrayH.hasValue(b4j.Y1)) {
            b44Var.d0(typedArrayH.getResourceId(b4j.Y1, 0));
        }
        if (typedArrayH.hasValue(b4j.i2)) {
            b44Var.p0(k8f.b(context2, typedArrayH, b4j.i2));
        }
        if (typedArrayH.hasValue(b4j.Z1)) {
            b44Var.f0(k8f.b(context2, typedArrayH, b4j.Z1));
        }
        this.u = typedArrayH.getDimensionPixelSize(b4j.n2, -1);
        if (typedArrayH.hasValue(b4j.l2)) {
            b44Var.B0(typedArrayH.getInt(b4j.l2, 1));
        }
        if (typedArrayH.hasValue(b4j.s2)) {
            b44Var.C0(AnimationUtils.loadInterpolator(context2, typedArrayH.getResourceId(b4j.s2, 0)));
        }
        this.t = typedArrayH.getInt(b4j.m2, 600);
        setContentScrim(typedArrayH.getDrawable(b4j.a2));
        setStatusBarScrim(typedArrayH.getDrawable(b4j.o2));
        setTitleCollapseMode(typedArrayH.getInt(b4j.q2, 0));
        this.f8519b = typedArrayH.getResourceId(b4j.t2, -1);
        this.A = typedArrayH.getBoolean(b4j.k2, false);
        this.C = typedArrayH.getBoolean(b4j.j2, false);
        typedArrayH.recycle();
        setWillNotDraw(false);
        androidx.core.view.c.H0(this, new a());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f8523b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8522a = 0;
            this.f8523b = 0.5f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b4j.u2);
            this.f8522a = typedArrayObtainStyledAttributes.getInt(b4j.v2, 0);
            a(typedArrayObtainStyledAttributes.getFloat(b4j.w2, 0.5f));
            typedArrayObtainStyledAttributes.recycle();
        }

        public void a(float f) {
            this.f8523b = f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f8522a = 0;
            this.f8523b = 0.5f;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8522a = 0;
            this.f8523b = 0.5f;
        }
    }
}
