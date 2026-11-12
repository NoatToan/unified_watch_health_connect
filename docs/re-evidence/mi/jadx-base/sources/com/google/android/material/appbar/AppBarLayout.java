package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.annotation.Dimension;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import defpackage.b4j;
import defpackage.c9p;
import defpackage.cjg;
import defpackage.k3j;
import defpackage.k47;
import defpackage.kti;
import defpackage.l4h;
import defpackage.l8f;
import defpackage.m80;
import defpackage.m8f;
import defpackage.n8f;
import defpackage.o7h;
import defpackage.of1;
import defpackage.pii;
import defpackage.pmi;
import defpackage.q80;
import defpackage.r8f;
import defpackage.syq;
import defpackage.wc1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    public static final int t = k3j.h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8499b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public WindowInsetsCompat g;
    public List<c> h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8500k;
    public boolean l;
    public int m;
    public WeakReference<View> n;
    public ValueAnimator o;
    public final List<f> p;
    public int[] q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f8501r;
    public Behavior s;

    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f8502k;
        public int l;
        public ValueAnimator m;
        public SavedState n;
        public WeakReference<View> o;
        public boolean p;

        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CoordinatorLayout f8504a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppBarLayout f8505b;

            public a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f8504a = coordinatorLayout;
                this.f8505b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.l(this.f8504a, this.f8505b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        public class b extends androidx.core.view.a {
            public b() {
            }

            @Override // androidx.core.view.a
            public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
                super.onInitializeAccessibilityNodeInfo(view, m80Var);
                m80Var.F0(BaseBehavior.this.p);
                m80Var.i0(ScrollView.class.getName());
            }
        }

        public class c implements q80 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CoordinatorLayout f8507a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppBarLayout f8508b;
            public final /* synthetic */ View c;
            public final /* synthetic */ int d;

            public c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
                this.f8507a = coordinatorLayout;
                this.f8508b = appBarLayout;
                this.c = view;
                this.d = i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.q80
            public boolean a(View view, q80.a aVar) {
                BaseBehavior.this.onNestedPreScroll(this.f8507a, this.f8508b, this.c, 0, this.d, new int[]{0, 0}, 1);
                return true;
            }
        }

        public class d implements q80 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AppBarLayout f8509a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f8510b;

            public d(AppBarLayout appBarLayout, boolean z) {
                this.f8509a = appBarLayout;
                this.f8510b = z;
            }

            @Override // defpackage.q80
            public boolean a(View view, q80.a aVar) {
                this.f8509a.setExpanded(this.f8510b);
                return true;
            }
        }

        public BaseBehavior() {
        }

        public static boolean w(int i, int i2) {
            return (i & i2) == i2;
        }

        public static View z(AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        public final int A(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (w(layoutParams.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        public final View B(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.e) childAt.getLayoutParams()).f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public int g(T t) {
            return -t.getDownNestedScrollRange();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public int h(T t) {
            return t.getTotalScrollRange();
        }

        public final int E(T t, int i) {
            int iAbs = Math.abs(i);
            int childCount = t.getChildCount();
            int topInset = 0;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator interpolatorD = layoutParams.d();
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    if (interpolatorD == null) {
                        break;
                    }
                    int iC = layoutParams.c();
                    if ((iC & 1) != 0) {
                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        if ((iC & 2) != 0) {
                            topInset -= androidx.core.view.c.B(childAt);
                        }
                    }
                    if (androidx.core.view.c.x(childAt)) {
                        topInset -= t.getTopInset();
                    }
                    if (topInset <= 0) {
                        break;
                    }
                    float f = topInset;
                    return Integer.signum(i) * (childAt.getTop() + Math.round(f * interpolatorD.getInterpolation((iAbs - childAt.getTop()) / f)));
                }
            }
            return i;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void j(CoordinatorLayout coordinatorLayout, T t) {
            S(coordinatorLayout, t);
            if (t.l()) {
                t.s(t.v(y(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, T t, int i) {
            boolean zOnLayoutChild = super.onLayoutChild(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            SavedState savedState = this.n;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -t.getUpNestedPreScrollRange();
                        if (z) {
                            r(coordinatorLayout, t, i2, 0.0f);
                        } else {
                            l(coordinatorLayout, t, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            r(coordinatorLayout, t, 0, 0.0f);
                        } else {
                            l(coordinatorLayout, t, 0);
                        }
                    }
                }
            } else if (savedState.f8503b) {
                l(coordinatorLayout, t, -t.getTotalScrollRange());
            } else if (savedState.c) {
                l(coordinatorLayout, t, 0);
            } else {
                View childAt = t.getChildAt(savedState.d);
                l(coordinatorLayout, t, (-childAt.getBottom()) + (this.n.f ? androidx.core.view.c.B(childAt) + t.getTopInset() : Math.round(childAt.getHeight() * this.n.e)));
            }
            t.o();
            this.n = null;
            c(r8f.b(a(), -t.getTotalScrollRange(), 0));
            U(coordinatorLayout, t, a(), 0, true);
            t.m(a());
            T(coordinatorLayout, t);
            return zOnLayoutChild;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.e) t.getLayoutParams())).height != -2) {
                return super.onMeasureChild(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.H(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int downNestedPreScrollRange;
            if (i2 != 0) {
                if (i2 < 0) {
                    i4 = -t.getTotalScrollRange();
                    downNestedPreScrollRange = t.getDownNestedPreScrollRange() + i4;
                } else {
                    i4 = -t.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i5 = i4;
                int i6 = downNestedPreScrollRange;
                if (i5 != i6) {
                    iArr[1] = k(coordinatorLayout, t, i2, i5, i6);
                }
            }
            if (t.l()) {
                t.s(t.v(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = k(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                T(coordinatorLayout, t);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                O((SavedState) parcelable, true);
                super.onRestoreInstanceState(coordinatorLayout, t, this.n.a());
            } else {
                super.onRestoreInstanceState(coordinatorLayout, t, parcelable);
                this.n = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, t);
            SavedState savedStateP = P(parcelableOnSaveInstanceState, t);
            return savedStateP == null ? parcelableOnSaveInstanceState : savedStateP;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.l() || v(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.m) != null) {
                valueAnimator.cancel();
            }
            this.o = null;
            this.l = i2;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.l == 0 || i == 1) {
                S(coordinatorLayout, t);
                if (t.l()) {
                    t.s(t.v(view));
                }
            }
            this.o = new WeakReference<>(view);
        }

        public void O(SavedState savedState, boolean z) {
            if (this.n == null || z) {
                this.n = savedState;
            }
        }

        public SavedState P(Parcelable parcelable, T t) {
            int iA = a();
            int childCount = t.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + iA;
                if (childAt.getTop() + iA <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.EMPTY_STATE;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z = iA == 0;
                    savedState.c = z;
                    savedState.f8503b = !z && (-iA) >= t.getTotalScrollRange();
                    savedState.d = i;
                    savedState.f = bottom == androidx.core.view.c.B(childAt) + t.getTopInset();
                    savedState.e = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public int m(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int i4 = i();
            int i5 = 0;
            if (i2 == 0 || i4 < i2 || i4 > i3) {
                this.f8502k = 0;
            } else {
                int iB = r8f.b(i, i2, i3);
                if (i4 != iB) {
                    int iE = t.h() ? E(t, iB) : iB;
                    boolean zC = c(iE);
                    int i6 = i4 - iB;
                    this.f8502k = iB - iE;
                    if (zC) {
                        while (i5 < t.getChildCount()) {
                            LayoutParams layoutParams = (LayoutParams) t.getChildAt(i5).getLayoutParams();
                            d dVarB = layoutParams.b();
                            if (dVarB != null && (layoutParams.c() & 1) != 0) {
                                dVarB.a(t, t.getChildAt(i5), a());
                            }
                            i5++;
                        }
                    }
                    if (!zC && t.h()) {
                        coordinatorLayout.j(t);
                    }
                    t.m(a());
                    U(coordinatorLayout, t, iB, iB < i4 ? -1 : 1, false);
                    i5 = i6;
                }
            }
            T(coordinatorLayout, t);
            return i5;
        }

        public final boolean R(CoordinatorLayout coordinatorLayout, T t) {
            List<View> listQ = coordinatorLayout.q(t);
            int size = listQ.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.Behavior behaviorF = ((CoordinatorLayout.e) listQ.get(i).getLayoutParams()).f();
                if (behaviorF instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) behaviorF).g() != 0;
                }
            }
            return false;
        }

        public final void S(CoordinatorLayout coordinatorLayout, T t) {
            int topInset = t.getTopInset() + t.getPaddingTop();
            int i = i() - topInset;
            int iA = A(t, i);
            if (iA >= 0) {
                View childAt = t.getChildAt(iA);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int iC = layoutParams.c();
                if ((iC & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int iB = -childAt.getBottom();
                    if (iA == 0 && androidx.core.view.c.x(t) && androidx.core.view.c.x(childAt)) {
                        topInset2 -= t.getTopInset();
                    }
                    if (w(iC, 2)) {
                        iB += androidx.core.view.c.B(childAt);
                    } else if (w(iC, 5)) {
                        int iB2 = androidx.core.view.c.B(childAt) + iB;
                        if (i < iB2) {
                            topInset2 = iB2;
                        } else {
                            iB = iB2;
                        }
                    }
                    if (w(iC, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        iB -= ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    }
                    r(coordinatorLayout, t, r8f.b(t(i, iB, topInset2) + topInset, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        public final void T(CoordinatorLayout coordinatorLayout, T t) {
            View viewB;
            androidx.core.view.c.k0(coordinatorLayout, m80.a.q.b());
            androidx.core.view.c.k0(coordinatorLayout, m80.a.f25864r.b());
            if (t.getTotalScrollRange() == 0 || (viewB = B(coordinatorLayout)) == null || !x(t)) {
                return;
            }
            if (!androidx.core.view.c.O(coordinatorLayout)) {
                androidx.core.view.c.r0(coordinatorLayout, new b());
            }
            this.p = p(coordinatorLayout, t, viewB);
        }

        public final void U(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View viewZ = z(t, i);
            boolean zV = false;
            if (viewZ != null) {
                int iC = ((LayoutParams) viewZ.getLayoutParams()).c();
                if ((iC & 1) != 0) {
                    int iB = androidx.core.view.c.B(viewZ);
                    if (i2 <= 0 || (iC & 12) == 0 ? !((iC & 2) == 0 || (-i) < (viewZ.getBottom() - iB) - t.getTopInset()) : (-i) >= (viewZ.getBottom() - iB) - t.getTopInset()) {
                        zV = true;
                    }
                }
            }
            if (t.l()) {
                zV = t.v(y(coordinatorLayout));
            }
            boolean zS = t.s(zV);
            if (z || (zS && R(coordinatorLayout, t))) {
                t.jumpDrawablesToCurrentState();
            }
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public int i() {
            return a() + this.f8502k;
        }

        public final boolean p(CoordinatorLayout coordinatorLayout, T t, View view) {
            boolean z = false;
            if (i() != (-t.getTotalScrollRange())) {
                q(coordinatorLayout, t, m80.a.q, false);
                z = true;
            }
            if (i() != 0) {
                if (!view.canScrollVertically(-1)) {
                    q(coordinatorLayout, t, m80.a.f25864r, true);
                    return true;
                }
                int i = -t.getDownNestedPreScrollRange();
                if (i != 0) {
                    androidx.core.view.c.m0(coordinatorLayout, m80.a.f25864r, null, new c(coordinatorLayout, t, view, i));
                    return true;
                }
            }
            return z;
        }

        public final void q(CoordinatorLayout coordinatorLayout, T t, m80.a aVar, boolean z) {
            androidx.core.view.c.m0(coordinatorLayout, aVar, null, new d(t, z));
        }

        public final void r(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int iAbs = Math.abs(i() - i);
            float fAbs = Math.abs(f);
            s(coordinatorLayout, t, i, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / t.getHeight()) + 1.0f) * 150.0f));
        }

        public final void s(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int i3 = i();
            if (i3 == i) {
                ValueAnimator valueAnimator = this.m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.m = valueAnimator3;
                valueAnimator3.setInterpolator(wc1.e);
                this.m.addUpdateListener(new a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.m.setDuration(Math.min(i2, 600));
            this.m.setIntValues(i3, i);
            this.m.start();
        }

        public final int t(int i, int i2, int i3) {
            return i < (i2 + i3) / 2 ? i2 : i3;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public boolean d(T t) {
            WeakReference<View> weakReference = this.o;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        public final boolean v(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.j() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        public final boolean x(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((LayoutParams) appBarLayout.getChildAt(i).getLayoutParams()).f8511a != 0) {
                    return true;
                }
            }
            return false;
        }

        public final View y(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof cjg) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f8503b;
            public boolean c;
            public int d;
            public float e;
            public boolean f;

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
                this.f8503b = parcel.readByte() != 0;
                this.c = parcel.readByte() != 0;
                this.d = parcel.readInt();
                this.e = parcel.readFloat();
                this.f = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.f8503b ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.d);
                parcel.writeFloat(this.e);
                parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: G */
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.onLayoutChild(coordinatorLayout, appBarLayout, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: H */
        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: I */
        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: J */
        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.onNestedScroll(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: K */
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: L */
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.onSaveInstanceState(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: M */
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: N */
        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int a() {
            return super.a();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean c(int i) {
            return super.c(i);
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.onTouchEvent(coordinatorLayout, view, motionEvent);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        public static int n(AppBarLayout appBarLayout) {
            CoordinatorLayout.Behavior behaviorF = ((CoordinatorLayout.e) appBarLayout.getLayoutParams()).f();
            if (behaviorF instanceof BaseBehavior) {
                return ((BaseBehavior) behaviorF).i();
            }
            return 0;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public float f(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iN = n(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iN > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iN / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public int h(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.h(view);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public AppBarLayout d(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public final void o(View view, View view2) {
            CoordinatorLayout.Behavior behaviorF = ((CoordinatorLayout.e) view2.getLayoutParams()).f();
            if (behaviorF instanceof BaseBehavior) {
                androidx.core.view.c.b0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) behaviorF).f8502k) + i()) - e(view2));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            o(view, view2);
            p(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                androidx.core.view.c.k0(coordinatorLayout, m80.a.q.b());
                androidx.core.view.c.k0(coordinatorLayout, m80.a.f25864r.b());
                androidx.core.view.c.r0(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.onLayoutChild(coordinatorLayout, view, i);
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, view, i, i2, i3, i4);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutD = d(coordinatorLayout.p(view));
            if (appBarLayoutD != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    appBarLayoutD.p(false, !z);
                    return true;
                }
            }
            return false;
        }

        public final void p(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.l()) {
                    appBarLayout.s(appBarLayout.v(view));
                }
            }
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b4j.j7);
            k(typedArrayObtainStyledAttributes.getDimensionPixelSize(b4j.k7, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public class a implements o7h {
        public a() {
        }

        @Override // defpackage.o7h
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
            return AppBarLayout.this.n(windowInsetsCompat);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l8f f8514a;

        public b(l8f l8fVar) {
            this.f8514a = l8fVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f8514a.a0(fFloatValue);
            if (AppBarLayout.this.f8501r instanceof l8f) {
                ((l8f) AppBarLayout.this.f8501r).a0(fFloatValue);
            }
            Iterator it = AppBarLayout.this.p.iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(fFloatValue, this.f8514a.A());
            }
        }
    }

    public interface c<T extends AppBarLayout> {
        void a(T t, int i);
    }

    public static abstract class d {
        public abstract void a(AppBarLayout appBarLayout, View view, float f);
    }

    public static class e extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f8516a = new Rect();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f8517b = new Rect();

        public static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.d
        public void a(AppBarLayout appBarLayout, View view, float f) {
            b(this.f8516a, appBarLayout, view);
            float fAbs = this.f8516a.top - Math.abs(f);
            if (fAbs > 0.0f) {
                androidx.core.view.c.y0(view, null);
                view.setTranslationY(0.0f);
                return;
            }
            float fA = 1.0f - r8f.a(Math.abs(fAbs / this.f8516a.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.f8516a.height() * 0.3f) * (1.0f - (fA * fA)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.f8517b);
            this.f8517b.offset(0, (int) (-fHeight));
            androidx.core.view.c.y0(view, this.f8517b);
        }
    }

    public interface f {
        void a(@Dimension float f, int i);
    }

    public interface g extends c<AppBarLayout> {
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public void addLiftOnScrollListener(f fVar) {
        this.p.add(fVar);
    }

    public void addOnOffsetChangedListener(c cVar) {
        if (this.h == null) {
            this.h = new ArrayList();
        }
        if (cVar == null || this.h.contains(cVar)) {
            return;
        }
        this.h.add(cVar);
    }

    public final void c() {
        WeakReference<View> weakReference = this.n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.n = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final View d(View view) {
        int i;
        if (this.n == null && (i = this.m) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.m);
            }
            if (viewFindViewById != null) {
                this.n = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.n;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (u()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f8498a);
            this.f8501r.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f8501r;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.s = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int iB;
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = layoutParams.f8511a;
            if ((i3 & 5) != 5) {
                if (i2 > 0) {
                    break;
                }
            } else {
                int i4 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                if ((i3 & 8) != 0) {
                    iB = androidx.core.view.c.B(childAt);
                } else {
                    if ((i3 & 2) != 0) {
                        iB = measuredHeight - androidx.core.view.c.B(childAt);
                    } else {
                        iMin = i4 + measuredHeight;
                    }
                    if (childCount == 0 && androidx.core.view.c.x(childAt)) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i2 += iMin;
                }
                iMin = i4 + iB;
                if (childCount == 0) {
                    iMin = Math.min(iMin, measuredHeight - getTopInset());
                }
                i2 += iMin;
            }
        }
        int iMax = Math.max(0, i2);
        this.c = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int iB = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
            int i3 = layoutParams.f8511a;
            if ((i3 & 1) == 0) {
                break;
            }
            iB += measuredHeight;
            if ((i3 & 2) != 0) {
                iB -= androidx.core.view.c.B(childAt);
                break;
            }
        }
        int iMax = Math.max(0, iB);
        this.d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.m;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int iB = androidx.core.view.c.B(this);
        if (iB == 0) {
            int childCount = getChildCount();
            iB = childCount >= 1 ? androidx.core.view.c.B(getChildAt(childCount - 1)) : 0;
            if (iB == 0) {
                return getHeight() / 3;
            }
        }
        return (iB * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f;
    }

    public Drawable getStatusBarForeground() {
        return this.f8501r;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @VisibleForTesting
    public final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.g;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.m();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f8499b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int iB = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = layoutParams.f8511a;
            if ((i3 & 1) == 0) {
                break;
            }
            iB += measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
            if (i2 == 0 && androidx.core.view.c.x(childAt)) {
                iB -= getTopInset();
            }
            if ((i3 & 2) != 0) {
                iB -= androidx.core.view.c.B(childAt);
                break;
            }
        }
        int iMax = Math.max(0, iB);
        this.f8499b = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public boolean h() {
        return this.e;
    }

    public final boolean i() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        return getTotalScrollRange() != 0;
    }

    public final void k() {
        Behavior behavior = this.s;
        BaseBehavior.SavedState savedStateP = (behavior == null || this.f8499b == -1 || this.f != 0) ? null : behavior.P(AbsSavedState.EMPTY_STATE, this);
        this.f8499b = -1;
        this.c = -1;
        this.d = -1;
        if (savedStateP != null) {
            this.s.O(savedStateP, false);
        }
    }

    public boolean l() {
        return this.l;
    }

    public void m(int i) {
        this.f8498a = i;
        if (!willNotDraw()) {
            androidx.core.view.c.h0(this);
        }
        List<c> list = this.h;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                c cVar = this.h.get(i2);
                if (cVar != null) {
                    cVar.a(this, i);
                }
            }
        }
    }

    public WindowInsetsCompat n(WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2 = androidx.core.view.c.x(this) ? windowInsetsCompat : null;
        if (!l4h.a(this.g, windowInsetsCompat2)) {
            this.g = windowInsetsCompat2;
            y();
            requestLayout();
        }
        return windowInsetsCompat;
    }

    public void o() {
        this.f = 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m8f.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.q == null) {
            this.q = new int[4];
        }
        int[] iArr = this.q;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.j;
        int i2 = pii.a0;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (z && this.f8500k) ? pii.b0 : -pii.b0;
        int i3 = pii.Y;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (z && this.f8500k) ? pii.X : -pii.X;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (androidx.core.view.c.x(this) && w()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                androidx.core.view.c.b0(getChildAt(childCount), topInset);
            }
        }
        k();
        this.e = false;
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            if (((LayoutParams) getChildAt(i5).getLayoutParams()).d() != null) {
                this.e = true;
                break;
            }
        }
        Drawable drawable = this.f8501r;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.i) {
            return;
        }
        if (!this.l && !i()) {
            z2 = false;
        }
        r(z2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && androidx.core.view.c.x(this) && w()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = r8f.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        k();
    }

    public void p(boolean z, boolean z2) {
        q(z, z2, true);
    }

    public final void q(boolean z, boolean z2, boolean z3) {
        this.f = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    public final boolean r(boolean z) {
        if (this.j == z) {
            return false;
        }
        this.j = z;
        refreshDrawableState();
        return true;
    }

    public void removeOnOffsetChangedListener(c cVar) {
        List<c> list = this.h;
        if (list == null || cVar == null) {
            return;
        }
        list.remove(cVar);
    }

    public boolean s(boolean z) {
        return t(z, !this.i);
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f2) {
        super.setElevation(f2);
        m8f.d(this, f2);
    }

    public void setExpanded(boolean z) {
        p(z, androidx.core.view.c.U(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.l = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.m = i;
        c();
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.i = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f8501r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f8501r = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f8501r.setState(getDrawableState());
                }
                k47.m(this.f8501r, androidx.core.view.c.A(this));
                this.f8501r.setVisible(getVisibility() == 0, false);
                this.f8501r.setCallback(this);
            }
            y();
            androidx.core.view.c.h0(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(of1.b(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        syq.b(this, f2);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f8501r;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    public boolean t(boolean z, boolean z2) {
        if (!z2 || this.f8500k == z) {
            return false;
        }
        this.f8500k = z;
        refreshDrawableState();
        if (!this.l || !(getBackground() instanceof l8f)) {
            return true;
        }
        x((l8f) getBackground(), z);
        return true;
    }

    public final boolean u() {
        return this.f8501r != null && getTopInset() > 0;
    }

    public boolean v(View view) {
        View viewD = d(view);
        if (viewD != null) {
            view = viewD;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f8501r;
    }

    public final boolean w() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || androidx.core.view.c.x(childAt)) ? false : true;
    }

    public final void x(l8f l8fVar, boolean z) {
        float dimension = getResources().getDimension(pmi.f30542a);
        float f2 = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, dimension);
        this.o = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(getResources().getInteger(kti.f24281a));
        this.o.setInterpolator(wc1.f37826a);
        this.o.addUpdateListener(new b(l8fVar));
        this.o.start();
    }

    public final void y() {
        setWillNotDraw(!u());
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pii.f30431a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        int i2 = t;
        super(n8f.c(context, attributeSet, i, i2), attributeSet, i);
        this.f8499b = -1;
        this.c = -1;
        this.d = -1;
        this.f = 0;
        this.p = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            syq.a(this);
        }
        syq.c(this, attributeSet, i, i2);
        TypedArray typedArrayH = c9p.h(context2, attributeSet, b4j.f3794k, i, i2, new int[0]);
        androidx.core.view.c.v0(this, typedArrayH.getDrawable(b4j.l));
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            l8f l8fVar = new l8f();
            l8fVar.b0(ColorStateList.valueOf(colorDrawable.getColor()));
            l8fVar.Q(context2);
            androidx.core.view.c.v0(this, l8fVar);
        }
        if (typedArrayH.hasValue(b4j.p)) {
            q(typedArrayH.getBoolean(b4j.p, false), false, false);
        }
        if (typedArrayH.hasValue(b4j.o)) {
            syq.b(this, typedArrayH.getDimensionPixelSize(b4j.o, 0));
        }
        if (typedArrayH.hasValue(b4j.n)) {
            setKeyboardNavigationCluster(typedArrayH.getBoolean(b4j.n, false));
        }
        if (typedArrayH.hasValue(b4j.m)) {
            setTouchscreenBlocksFocus(typedArrayH.getBoolean(b4j.m, false));
        }
        this.l = typedArrayH.getBoolean(b4j.q, false);
        this.m = typedArrayH.getResourceId(b4j.f3795r, -1);
        setStatusBarForeground(typedArrayH.getDrawable(b4j.s));
        typedArrayH.recycle();
        androidx.core.view.c.H0(this, new a());
    }

    public void removeOnOffsetChangedListener(g gVar) {
        removeOnOffsetChangedListener((c) gVar);
    }

    public void addOnOffsetChangedListener(g gVar) {
        addOnOffsetChangedListener((c) gVar);
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d f8512b;
        public Interpolator c;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8511a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b4j.u);
            this.f8511a = typedArrayObtainStyledAttributes.getInt(b4j.w, 0);
            f(a(typedArrayObtainStyledAttributes.getInt(b4j.v, 0)));
            if (typedArrayObtainStyledAttributes.hasValue(b4j.x)) {
                this.c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(b4j.x, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final d a(int i) {
            if (i != 1) {
                return null;
            }
            return new e();
        }

        public d b() {
            return this.f8512b;
        }

        public int c() {
            return this.f8511a;
        }

        public Interpolator d() {
            return this.c;
        }

        public boolean e() {
            int i = this.f8511a;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        public void f(d dVar) {
            this.f8512b = dVar;
        }

        public void g(int i) {
            this.f8511a = i;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f8511a = 1;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8511a = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f8511a = 1;
        }

        @RequiresApi(19)
        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8511a = 1;
        }
    }
}
