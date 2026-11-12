package androidx.appcompat.widget;

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
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.view.g1;
import androidx.core.view.m1;
import com.garmin.android.apps.connectmobile.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements a0, androidx.core.view.w, androidx.core.view.x {
    public static final int[] E = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final m1 F;
    public static final Rect I;
    public final b A;
    public final c B;
    public final androidx.core.view.y C;
    public final f D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f4872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContainer f4873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b0 f4874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f4875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4877h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4878i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4879j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4880k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4881l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Rect f4882m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Rect f4883n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f4884o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f4885p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public m1 f4886q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public m1 f4887r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public m1 f4888t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public m1 f4889v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public d f4890w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public OverScroller f4891x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ViewPropertyAnimator f4892y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a f4893z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f4892y = null;
            actionBarOverlayLayout.f4879j = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f4892y = null;
            actionBarOverlayLayout.f4879j = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.k();
            actionBarOverlayLayout.f4892y = actionBarOverlayLayout.f4873d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f4893z);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.k();
            actionBarOverlayLayout.f4892y = actionBarOverlayLayout.f4873d.animate().translationY(-actionBarOverlayLayout.f4873d.getHeight()).setListener(actionBarOverlayLayout.f4893z);
        }
    }

    public interface d {
    }

    public static final class f extends View {
        public f(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        @Override // android.view.View
        public final int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    static {
        m1.a aVar = new m1.a();
        c7.e eVarC = c7.e.c(0, 1, 0, 1);
        m1.i iVar = aVar.f6509a;
        iVar.h(eVarC);
        F = iVar.b();
        I = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4871b = 0;
        this.f4882m = new Rect();
        this.f4883n = new Rect();
        this.f4884o = new Rect();
        this.f4885p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        m1 m1Var = m1.f6507b;
        this.f4886q = m1Var;
        this.f4887r = m1Var;
        this.f4888t = m1Var;
        this.f4889v = m1Var;
        this.f4893z = new a();
        this.A = new b();
        this.B = new c();
        l(context);
        this.C = new androidx.core.view.y(this);
        f fVar = new f(context);
        this.D = fVar;
        addView(fVar);
    }

    public static boolean j(View view2, Rect rect, boolean z14) {
        boolean z15;
        e eVar = (e) view2.getLayoutParams();
        int i14 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i15 = rect.left;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i15;
            z15 = true;
        } else {
            z15 = false;
        }
        int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i17 = rect.top;
        if (i16 != i17) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i17;
            z15 = true;
        }
        int i18 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i19 = rect.right;
        if (i18 != i19) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i19;
            z15 = true;
        }
        if (z14) {
            int i24 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i25 = rect.bottom;
            if (i24 != i25) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i25;
                return true;
            }
        }
        return z15;
    }

    @Override // androidx.appcompat.widget.a0
    public final boolean a() {
        m();
        return this.f4874e.a();
    }

    @Override // androidx.appcompat.widget.a0
    public final void b(Menu menu, androidx.appcompat.view.menu.n.a aVar) {
        m();
        this.f4874e.b(menu, aVar);
    }

    @Override // androidx.appcompat.widget.a0
    public final boolean c() {
        m();
        return this.f4874e.c();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.a0
    public final boolean d() {
        m();
        return this.f4874e.d();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f4875f != null) {
            if (this.f4873d.getVisibility() == 0) {
                translationY = (int) (this.f4873d.getTranslationY() + this.f4873d.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f4875f.setBounds(0, translationY, getWidth(), this.f4875f.getIntrinsicHeight() + translationY);
            this.f4875f.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.a0
    public final boolean e() {
        m();
        return this.f4874e.e();
    }

    @Override // androidx.appcompat.widget.a0
    public final boolean f() {
        m();
        return this.f4874e.f();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.a0
    public final void g() {
        m();
        this.f4874e.g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f4873d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        androidx.core.view.y yVar = this.C;
        return yVar.f6588b | yVar.f6587a;
    }

    public CharSequence getTitle() {
        m();
        return this.f4874e.getTitle();
    }

    @Override // androidx.appcompat.widget.a0
    public final void h(int i14) {
        m();
        if (i14 == 2) {
            this.f4874e.getClass();
        } else if (i14 == 5) {
            this.f4874e.getClass();
        } else {
            if (i14 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.a0
    public final void i() {
        m();
        this.f4874e.l();
    }

    public final void k() {
        removeCallbacks(this.A);
        removeCallbacks(this.B);
        ViewPropertyAnimator viewPropertyAnimator = this.f4892y;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void l(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(E);
        this.f4870a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f4875f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f4891x = new OverScroller(context);
    }

    public final void m() {
        b0 wrapper;
        if (this.f4872c == null) {
            this.f4872c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f4873d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof b0) {
                wrapper = (b0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    vb.h.z("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f4874e = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m();
        m1 m1VarG = m1.g(this, windowInsets);
        boolean zJ = j(this.f4873d, new Rect(m1VarG.b(), m1VarG.d(), m1VarG.c(), m1VarG.a()), false);
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        Rect rect = this.f4882m;
        androidx.core.view.s0.d.b(this, m1VarG, rect);
        int i14 = rect.left;
        int i15 = rect.top;
        int i16 = rect.right;
        int i17 = rect.bottom;
        m1.r rVar = m1VarG.f6508a;
        m1 m1VarR = rVar.r(i14, i15, i16, i17);
        this.f4886q = m1VarR;
        boolean z14 = true;
        if (!this.f4887r.equals(m1VarR)) {
            this.f4887r = this.f4886q;
            zJ = true;
        }
        Rect rect2 = this.f4883n;
        if (rect2.equals(rect)) {
            z14 = zJ;
        } else {
            rect2.set(rect);
        }
        if (z14) {
            requestLayout();
        }
        return rVar.a().f6508a.c().f6508a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        l(getContext());
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i19 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i24 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i19, i24, measuredWidth + i19, measuredHeight + i24);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    @Override // android.view.View
    public final void onMeasure(int i14, int i15) {
        int measuredHeight;
        m();
        measureChildWithMargins(this.f4873d, i14, 0, i15, 0);
        e eVar = (e) this.f4873d.getLayoutParams();
        int iMax = Math.max(0, this.f4873d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f4873d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f4873d.getMeasuredState());
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        boolean z14 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z14) {
            measuredHeight = this.f4870a;
            if (this.f4877h && this.f4873d.getTabContainer() != null) {
                measuredHeight += this.f4870a;
            }
        } else {
            measuredHeight = this.f4873d.getVisibility() != 8 ? this.f4873d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f4882m;
        Rect rect2 = this.f4884o;
        rect2.set(rect);
        this.f4888t = this.f4886q;
        if (this.f4876g || z14) {
            c7.e eVarC = c7.e.c(this.f4888t.b(), this.f4888t.d() + measuredHeight, this.f4888t.c(), this.f4888t.a());
            m1.i iVar = new m1.a(this.f4888t).f6509a;
            iVar.h(eVarC);
            this.f4888t = iVar.b();
        } else {
            f fVar = this.D;
            m1 m1Var = F;
            Rect rect3 = this.f4885p;
            androidx.core.view.s0.d.b(fVar, m1Var, rect3);
            if (rect3.equals(I)) {
                c7.e eVarC2 = c7.e.c(this.f4888t.b(), this.f4888t.d() + measuredHeight, this.f4888t.c(), this.f4888t.a());
                m1.i iVar2 = new m1.a(this.f4888t).f6509a;
                iVar2.h(eVarC2);
                this.f4888t = iVar2.b();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f4888t = this.f4888t.f6508a.r(0, measuredHeight, 0, 0);
            }
        }
        j(this.f4872c, rect2, true);
        if (!this.f4889v.equals(this.f4888t)) {
            m1 m1Var2 = this.f4888t;
            this.f4889v = m1Var2;
            androidx.core.view.s0.d(this.f4872c, m1Var2);
        }
        measureChildWithMargins(this.f4872c, i14, 0, i15, 0);
        e eVar2 = (e) this.f4872c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f4872c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f4872c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f4872c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i14, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i15, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view2, float f14, float f15, boolean z14) {
        if (!this.f4878i || !z14) {
            return false;
        }
        this.f4891x.fling(0, 0, 0, (int) f15, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f4891x.getFinalY() > this.f4873d.getHeight()) {
            k();
            this.B.run();
        } else {
            k();
            this.A.run();
        }
        this.f4879j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view2, float f14, float f15) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view2, int i14, int i15, int[] iArr) {
    }

    @Override // androidx.core.view.w
    public final void onNestedPreScroll(View view2, int i14, int i15, int[] iArr, int i16) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view2, int i14, int i15, int i16, int i17) {
        int i18 = this.f4880k + i15;
        this.f4880k = i18;
        setActionBarHideOffset(i18);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view2, View view3, int i14) {
        i.t tVar;
        m.h hVar;
        this.C.f6587a = i14;
        this.f4880k = getActionBarHideOffset();
        k();
        d dVar = this.f4890w;
        if (dVar == null || (hVar = (tVar = (i.t) dVar).f86692x) == null) {
            return;
        }
        hVar.a();
        tVar.f86692x = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view2, View view3, int i14) {
        if ((i14 & 2) == 0 || this.f4873d.getVisibility() != 0) {
            return false;
        }
        return this.f4878i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view2) {
        if (!this.f4878i || this.f4879j) {
            return;
        }
        if (this.f4880k <= this.f4873d.getHeight()) {
            k();
            postDelayed(this.A, 600L);
        } else {
            k();
            postDelayed(this.B, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i14) {
        super.onWindowSystemUiVisibilityChanged(i14);
        m();
        int i15 = this.f4881l ^ i14;
        this.f4881l = i14;
        boolean z14 = (i14 & 4) == 0;
        boolean z15 = (i14 & 256) != 0;
        d dVar = this.f4890w;
        if (dVar != null) {
            i.t tVar = (i.t) dVar;
            tVar.f86687s = !z15;
            if (z14 || !z15) {
                if (tVar.f86689u) {
                    tVar.f86689u = false;
                    tVar.K(true);
                }
            } else if (!tVar.f86689u) {
                tVar.f86689u = true;
                tVar.K(true);
            }
        }
        if ((i15 & 256) == 0 || this.f4890w == null) {
            return;
        }
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i14) {
        super.onWindowVisibilityChanged(i14);
        this.f4871b = i14;
        d dVar = this.f4890w;
        if (dVar != null) {
            ((i.t) dVar).f86686r = i14;
        }
    }

    public void setActionBarHideOffset(int i14) {
        k();
        this.f4873d.setTranslationY(-Math.max(0, Math.min(i14, this.f4873d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f4890w = dVar;
        if (getWindowToken() != null) {
            ((i.t) this.f4890w).f86686r = this.f4871b;
            int i14 = this.f4881l;
            if (i14 != 0) {
                onWindowSystemUiVisibilityChanged(i14);
                WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z14) {
        this.f4877h = z14;
    }

    public void setHideOnContentScrollEnabled(boolean z14) {
        if (z14 != this.f4878i) {
            this.f4878i = z14;
            if (z14) {
                return;
            }
            k();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i14) {
        m();
        this.f4874e.setIcon(i14);
    }

    public void setLogo(int i14) {
        m();
        this.f4874e.z(i14);
    }

    public void setOverlayMode(boolean z14) {
        this.f4876g = z14;
    }

    public void setShowingForActionMode(boolean z14) {
    }

    public void setUiOptions(int i14) {
    }

    @Override // androidx.appcompat.widget.a0
    public void setWindowCallback(Window.Callback callback) {
        m();
        this.f4874e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.a0
    public void setWindowTitle(CharSequence charSequence) {
        m();
        this.f4874e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i14, int i15) {
            super(i14, i15);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @Override // androidx.core.view.w
    public final void onNestedScroll(View view2, int i14, int i15, int i16, int i17, int i18) {
        if (i18 == 0) {
            onNestedScroll(view2, i14, i15, i16, i17);
        }
    }

    public void setIcon(Drawable drawable) {
        m();
        this.f4874e.setIcon(drawable);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    @Override // androidx.core.view.x
    public final void onNestedScroll(View view2, int i14, int i15, int i16, int i17, int i18, int[] iArr) {
        onNestedScroll(view2, i14, i15, i16, i17, i18);
    }

    @Override // androidx.core.view.w
    public final boolean onStartNestedScroll(View view2, View view3, int i14, int i15) {
        return i15 == 0 && onStartNestedScroll(view2, view3, i14);
    }

    @Override // androidx.core.view.w
    public final void onNestedScrollAccepted(View view2, View view3, int i14, int i15) {
        if (i15 == 0) {
            onNestedScrollAccepted(view2, view3, i14);
        }
    }

    @Override // androidx.core.view.w
    public final void onStopNestedScroll(View view2, int i14) {
        if (i14 == 0) {
            onStopNestedScroll(view2);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }
}
