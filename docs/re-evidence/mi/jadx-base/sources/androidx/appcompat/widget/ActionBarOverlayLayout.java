package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.i;
import androidx.core.view.WindowInsetsCompat;
import defpackage.cqi;
import defpackage.fjg;
import defpackage.gjg;
import defpackage.hjg;
import defpackage.qii;
import defpackage.rbd;
import defpackage.vs5;
import defpackage.ws5;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarOverlayLayout extends ViewGroup implements vs5, fjg, gjg {
    public static final int[] F = {qii.f31549b, R.attr.windowContentOverlay};
    public ViewPropertyAnimator A;
    public final AnimatorListenerAdapter B;
    public final Runnable C;
    public final Runnable D;
    public final hjg E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1529b;
    public ContentFrameLayout c;
    public ActionBarContainer d;
    public ws5 e;
    public Drawable f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1530k;
    public int l;
    public int m;
    public final Rect n;
    public final Rect o;
    public final Rect p;
    public final Rect q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f1531r;
    public final Rect s;
    public final Rect t;
    public WindowInsetsCompat u;
    public WindowInsetsCompat v;
    public WindowInsetsCompat w;
    public WindowInsetsCompat x;
    public d y;
    public OverScroller z;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.f1530k = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.f1530k = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.B);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = actionBarOverlayLayout.d.animate().translationY(-ActionBarOverlayLayout.this.d.getHeight()).setListener(ActionBarOverlayLayout.this.B);
        }
    }

    public interface d {
        void a();

        void b();

        void c();

        void d();

        void e(int i);

        void f(boolean z);
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    private void p(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(F);
        this.f1528a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.g = context.getApplicationInfo().targetSdkVersion < 19;
        this.z = new OverScroller(context);
    }

    @Override // defpackage.vs5
    public boolean a() {
        u();
        return this.e.a();
    }

    @Override // defpackage.vs5
    public boolean b() {
        u();
        return this.e.b();
    }

    @Override // defpackage.vs5
    public boolean c() {
        u();
        return this.e.c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // defpackage.vs5
    public boolean d() {
        u();
        return this.e.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f == null || this.g) {
            return;
        }
        int bottom = this.d.getVisibility() == 0 ? (int) (this.d.getBottom() + this.d.getTranslationY() + 0.5f) : 0;
        this.f.setBounds(0, bottom, getWidth(), this.f.getIntrinsicHeight() + bottom);
        this.f.draw(canvas);
    }

    @Override // defpackage.vs5
    public void e(Menu menu, i.a aVar) {
        u();
        this.e.e(menu, aVar);
    }

    @Override // defpackage.vs5
    public void f() {
        u();
        this.e.f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // defpackage.vs5
    public boolean g() {
        u();
        return this.e.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.E.a();
    }

    public CharSequence getTitle() {
        u();
        return this.e.getTitle();
    }

    @Override // defpackage.vs5
    public void h(int i) {
        u();
        if (i == 2) {
            this.e.p();
        } else if (i == 5) {
            this.e.w();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // defpackage.vs5
    public void i() {
        u();
        this.e.s();
    }

    public final void j() {
        o();
        this.D.run();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final boolean k(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (z) {
            int i = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            int i2 = rect.left;
            if (i != i2) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i2;
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            z5 = false;
        }
        if (z2) {
            int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            int i4 = rect.top;
            if (i3 != i4) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i4;
                z5 = true;
            }
        }
        if (z4) {
            int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            int i6 = rect.right;
            if (i5 != i6) {
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i6;
                z5 = true;
            }
        }
        if (z3) {
            int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i8;
                return true;
            }
        }
        return z5;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ws5 n(View view) {
        if (view instanceof ws5) {
            return (ws5) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void o() {
        removeCallbacks(this.C);
        removeCallbacks(this.D);
        ViewPropertyAnimator viewPropertyAnimator = this.A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        u();
        WindowInsetsCompat windowInsetsCompatY = WindowInsetsCompat.y(windowInsets, this);
        boolean zK = k(this.d, new Rect(windowInsetsCompatY.k(), windowInsetsCompatY.m(), windowInsetsCompatY.l(), windowInsetsCompatY.j()), true, true, false, true);
        androidx.core.view.c.f(this, windowInsetsCompatY, this.n);
        Rect rect = this.n;
        WindowInsetsCompat windowInsetsCompatO = windowInsetsCompatY.o(rect.left, rect.top, rect.right, rect.bottom);
        this.u = windowInsetsCompatO;
        if (!this.v.equals(windowInsetsCompatO)) {
            this.v = this.u;
            zK = true;
        }
        if (this.o.equals(this.n)) {
            if (zK) {
            }
            return windowInsetsCompatY.a().c().b().w();
        }
        this.o.set(this.n);
        requestLayout();
        return windowInsetsCompatY.a().c().b().w();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p(getContext());
        androidx.core.view.c.n0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        u();
        measureChildWithMargins(this.d, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.d.getLayoutParams();
        int iMax = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
        int iMax2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        boolean z = (androidx.core.view.c.M(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f1528a;
            if (this.i && this.d.getTabContainer() != null) {
                measuredHeight += this.f1528a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        this.p.set(this.n);
        WindowInsetsCompat windowInsetsCompat = this.u;
        this.w = windowInsetsCompat;
        if (this.h || z) {
            this.w = new WindowInsetsCompat.b(this.w).c(rbd.b(windowInsetsCompat.k(), this.w.m() + measuredHeight, this.w.l(), this.w.j())).a();
        } else {
            Rect rect = this.p;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.w = windowInsetsCompat.o(0, measuredHeight, 0, 0);
        }
        k(this.c, this.p, true, true, true, true);
        if (!this.x.equals(this.w)) {
            WindowInsetsCompat windowInsetsCompat2 = this.w;
            this.x = windowInsetsCompat2;
            androidx.core.view.c.g(this.c, windowInsetsCompat2);
        }
        measureChildWithMargins(this.c, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
        int iMax4 = Math.max(iMax2, this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.j || !z) {
            return false;
        }
        if (w(f2)) {
            j();
        } else {
            v();
        }
        this.f1530k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // defpackage.gjg
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }

    @Override // defpackage.fjg
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.fjg
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // defpackage.fjg
    public void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        u();
        int i2 = this.m ^ i;
        this.m = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        d dVar = this.y;
        if (dVar != null) {
            dVar.f(!z2);
            if (z || !z2) {
                this.y.a();
            } else {
                this.y.c();
            }
        }
        if ((i2 & 256) == 0 || this.y == null) {
            return;
        }
        androidx.core.view.c.n0(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1529b = i;
        d dVar = this.y;
        if (dVar != null) {
            dVar.e(i);
        }
    }

    public boolean q() {
        return this.j;
    }

    public boolean r() {
        return this.h;
    }

    public final void s() {
        o();
        postDelayed(this.D, 600L);
    }

    public void setActionBarHideOffset(int i) {
        o();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.y = dVar;
        if (getWindowToken() != null) {
            this.y.e(this.f1529b);
            int i = this.m;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                androidx.core.view.c.n0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.i = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.j) {
            this.j = z;
            if (z) {
                return;
            }
            o();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        u();
        this.e.setIcon(i);
    }

    public void setLogo(int i) {
        u();
        this.e.F(i);
    }

    public void setOverlayMode(boolean z) {
        this.h = z;
        this.g = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // defpackage.vs5
    public void setWindowCallback(Window.Callback callback) {
        u();
        this.e.setWindowCallback(callback);
    }

    @Override // defpackage.vs5
    public void setWindowTitle(CharSequence charSequence) {
        u();
        this.e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t() {
        o();
        postDelayed(this.C, 600L);
    }

    public void u() {
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(cqi.f14620b);
            this.d = (ActionBarContainer) findViewById(cqi.c);
            this.e = n(findViewById(cqi.f14619a));
        }
    }

    public final void v() {
        o();
        this.C.run();
    }

    public final boolean w(float f) {
        this.z.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.z.getFinalY() > this.d.getHeight();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1529b = 0;
        this.n = new Rect();
        this.o = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        this.f1531r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.f2098b;
        this.u = windowInsetsCompat;
        this.v = windowInsetsCompat;
        this.w = windowInsetsCompat;
        this.x = windowInsetsCompat;
        this.B = new a();
        this.C = new b();
        this.D = new c();
        p(context);
        this.E = new hjg(this);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // defpackage.fjg
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // defpackage.fjg
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.E.b(view, view2, i);
        this.l = getActionBarHideOffset();
        o();
        d dVar = this.y;
        if (dVar != null) {
            dVar.d();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.j && !this.f1530k) {
            if (this.l <= this.d.getHeight()) {
                t();
            } else {
                s();
            }
        }
        d dVar = this.y;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.l + i2;
        this.l = i5;
        setActionBarHideOffset(i5);
    }

    public void setIcon(Drawable drawable) {
        u();
        this.e.setIcon(drawable);
    }
}
