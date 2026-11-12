package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import defpackage.ayq;
import defpackage.b4j;
import defpackage.h2j;
import defpackage.k3j;
import defpackage.k8f;
import defpackage.l8f;
import defpackage.m80;
import defpackage.pii;
import defpackage.pmi;
import defpackage.psq;
import defpackage.q80;
import defpackage.r2m;
import defpackage.r8f;
import defpackage.rbd;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public static final int d0 = k3j.j;
    public ValueAnimator A;
    public int B;
    public int C;
    public int D;
    public float E;
    public int F;
    public float G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public psq M;
    public boolean N;
    public int O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public WeakReference<V> T;
    public WeakReference<View> U;
    public final ArrayList<f> V;
    public VelocityTracker W;
    public int X;
    public int Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8569a;
    public Map<View, Integer> a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8570b;
    public int b0;
    public boolean c;
    public final psq.c c0;
    public float d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public l8f i;
    public ColorStateList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8571k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8572r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public r2m x;
    public boolean y;
    public final BottomSheetBehavior<V>.g z;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f8574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f8575b;

        public a(View view, int i) {
            this.f8574a = view;
            this.f8575b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.h0(this.f8574a, this.f8575b, false);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.i != null) {
                BottomSheetBehavior.this.i.c0(fFloatValue);
            }
        }
    }

    public class c implements ayq.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f8577a;

        public c(boolean z) {
            this.f8577a = z;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0080  */
        /* JADX WARN: Code duplicated, block: B:28:0x0092  */
        /* JADX WARN: Code duplicated, block: B:34:0x00a4 A[DONT_INVERT] */
        @Override // ayq.e
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, ayq.f fVar) {
            boolean z;
            rbd rbdVarF = windowInsetsCompat.f(WindowInsetsCompat.m.h());
            rbd rbdVarF2 = windowInsetsCompat.f(WindowInsetsCompat.m.e());
            BottomSheetBehavior.this.w = rbdVarF.f32379b;
            boolean zJ = ayq.j(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.o) {
                BottomSheetBehavior.this.v = windowInsetsCompat.j();
                paddingBottom = fVar.d + BottomSheetBehavior.this.v;
            }
            if (BottomSheetBehavior.this.p) {
                paddingLeft = (zJ ? fVar.c : fVar.f3588a) + rbdVarF.f32378a;
            }
            if (BottomSheetBehavior.this.q) {
                paddingRight = (zJ ? fVar.f3588a : fVar.c) + rbdVarF.c;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z2 = true;
            if (BottomSheetBehavior.this.s) {
                int i = marginLayoutParams.leftMargin;
                int i2 = rbdVarF.f32378a;
                if (i != i2) {
                    marginLayoutParams.leftMargin = i2;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (BottomSheetBehavior.this.t) {
                int i3 = marginLayoutParams.rightMargin;
                int i4 = rbdVarF.c;
                if (i3 != i4) {
                    marginLayoutParams.rightMargin = i4;
                } else {
                    z2 = z;
                }
            } else {
                z2 = z;
            }
            if (BottomSheetBehavior.this.u) {
                int i5 = marginLayoutParams.topMargin;
                int i6 = rbdVarF.f32379b;
                if (i5 != i6) {
                    marginLayoutParams.topMargin = i6;
                } else if (z2) {
                }
                view.setLayoutParams(marginLayoutParams);
            } else if (z2) {
                view.setLayoutParams(marginLayoutParams);
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f8577a) {
                BottomSheetBehavior.this.m = rbdVarF2.d;
            }
            if (BottomSheetBehavior.this.o || this.f8577a) {
                BottomSheetBehavior.this.l0(false);
            }
            return windowInsetsCompat;
        }
    }

    public class d extends psq.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f8579a;

        public d() {
        }

        public final boolean a(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.S + bottomSheetBehavior.D()) / 2;
        }

        @Override // psq.c
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // psq.c
        public int clampViewPositionVertical(View view, int i, int i2) {
            int iD = BottomSheetBehavior.this.D();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return r8f.b(i, iD, bottomSheetBehavior.H ? bottomSheetBehavior.S : bottomSheetBehavior.F);
        }

        @Override // psq.c
        public int getViewVerticalDragRange(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.H ? bottomSheetBehavior.S : bottomSheetBehavior.F;
        }

        @Override // psq.c
        public void onViewDragStateChanged(int i) {
            if (i == 1 && BottomSheetBehavior.this.J) {
                BottomSheetBehavior.this.a0(1);
            }
        }

        @Override // psq.c
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.z(i2);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:6:0x0010  */
        @Override // psq.c
        public void onViewReleased(View view, float f, float f2) {
            int i = 6;
            if (f2 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.H && bottomSheetBehavior.e0(view, f2)) {
                    if ((Math.abs(f) < Math.abs(f2) && f2 > 500.0f) || a(view)) {
                        i = 5;
                    } else if (BottomSheetBehavior.this.f8570b || Math.abs(view.getTop() - BottomSheetBehavior.this.D()) < Math.abs(view.getTop() - BottomSheetBehavior.this.D)) {
                        i = 3;
                    }
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top = view.getTop();
                    if (!BottomSheetBehavior.this.f8570b) {
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int i2 = bottomSheetBehavior2.D;
                        if (top < i2) {
                            if (top < Math.abs(top - bottomSheetBehavior2.F)) {
                                i = 3;
                            } else if (BottomSheetBehavior.this.f0()) {
                                i = 4;
                            }
                        } else if (Math.abs(top - i2) >= Math.abs(top - BottomSheetBehavior.this.F) || BottomSheetBehavior.this.f0()) {
                            i = 4;
                        }
                    } else if (Math.abs(top - BottomSheetBehavior.this.C) < Math.abs(top - BottomSheetBehavior.this.F)) {
                        i = 3;
                    } else {
                        i = 4;
                    }
                } else if (BottomSheetBehavior.this.f8570b) {
                    i = 4;
                } else {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - BottomSheetBehavior.this.D) >= Math.abs(top2 - BottomSheetBehavior.this.F) || BottomSheetBehavior.this.f0()) {
                        i = 4;
                    }
                }
            } else if (BottomSheetBehavior.this.f8570b) {
                i = 3;
            } else {
                int top3 = view.getTop();
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f8579a;
                if (BottomSheetBehavior.this.f0()) {
                    BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                    if (!bottomSheetBehavior3.c0(jCurrentTimeMillis, (top3 * 100.0f) / bottomSheetBehavior3.S)) {
                        i = 4;
                    }
                } else if (top3 <= BottomSheetBehavior.this.D) {
                }
                i = 3;
            }
            BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
            bottomSheetBehavior4.h0(view, i, bottomSheetBehavior4.g0());
        }

        @Override // psq.c
        public boolean tryCaptureView(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.K;
            if (i2 == 1 || bottomSheetBehavior.Z) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.X == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.U;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f8579a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.T;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    public class e implements q80 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f8581a;

        public e(int i) {
            this.f8581a = i;
        }

        @Override // defpackage.q80
        public boolean a(View view, q80.a aVar) {
            BottomSheetBehavior.this.setState(this.f8581a);
            return true;
        }
    }

    public static abstract class f {
        public void onLayout(View view) {
        }

        public abstract void onSlide(View view, float f);

        public abstract void onStateChanged(View view, int i);
    }

    public BottomSheetBehavior() {
        this.f8569a = 0;
        this.f8570b = true;
        this.c = false;
        this.f8571k = -1;
        this.l = -1;
        this.z = new g(this, null);
        this.E = 0.5f;
        this.G = -1.0f;
        this.J = true;
        this.K = 4;
        this.L = 4;
        this.V = new ArrayList<>();
        this.b0 = -1;
        this.c0 = new d();
    }

    public static <V extends View> BottomSheetBehavior<V> B(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.e)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behaviorF = ((CoordinatorLayout.e) layoutParams).f();
        if (behaviorF instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behaviorF;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    @VisibleForTesting
    public View A(View view) {
        if (androidx.core.view.c.V(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewA = A(viewGroup.getChildAt(i));
            if (viewA != null) {
                return viewA;
            }
        }
        return null;
    }

    public final int C(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public int D() {
        if (this.f8570b) {
            return this.C;
        }
        return Math.max(this.B, this.f8572r ? 0 : this.w);
    }

    public l8f E() {
        return this.i;
    }

    public int F() {
        if (this.f) {
            return -1;
        }
        return this.e;
    }

    public final int G(int i) {
        if (i == 3) {
            return D();
        }
        if (i == 4) {
            return this.F;
        }
        if (i == 5) {
            return this.S;
        }
        if (i == 6) {
            return this.D;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i);
    }

    public final float H() {
        VelocityTracker velocityTracker = this.W;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.d);
        return this.W.getYVelocity(this.X);
    }

    public boolean I() {
        return this.n;
    }

    public final boolean J(V v) {
        ViewParent parent = v.getParent();
        return parent != null && parent.isLayoutRequested() && androidx.core.view.c.T(v);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean K() {
        return true;
    }

    public void L(f fVar) {
        this.V.remove(fVar);
    }

    public final void M(V v, m80.a aVar, int i) {
        androidx.core.view.c.m0(v, aVar, null, w(i));
    }

    public final void N() {
        this.X = -1;
        VelocityTracker velocityTracker = this.W;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.W = null;
        }
    }

    public final void O(SavedState savedState) {
        int i = this.f8569a;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.e = savedState.c;
        }
        if (i == -1 || (i & 2) == 2) {
            this.f8570b = savedState.d;
        }
        if (i == -1 || (i & 4) == 4) {
            this.H = savedState.e;
        }
        if (i == -1 || (i & 8) == 8) {
            this.I = savedState.f;
        }
    }

    public final void P(V v, Runnable runnable) {
        if (J(v)) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    public void Q(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.B = i;
    }

    public void R(boolean z) {
        if (this.f8570b == z) {
            return;
        }
        this.f8570b = z;
        if (this.T != null) {
            t();
        }
        a0((this.f8570b && this.K == 6) ? 3 : this.K);
        i0();
    }

    public void S(boolean z) {
        this.n = z;
    }

    public void T(@FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.E = f2;
        if (this.T != null) {
            u();
        }
    }

    public void U(int i) {
        this.l = i;
    }

    public void V(int i) {
        this.f8571k = i;
    }

    public void W(int i) {
        X(i, false);
    }

    public final void X(int i, boolean z) {
        if (i == -1) {
            if (this.f) {
                return;
            } else {
                this.f = true;
            }
        } else {
            if (!this.f && this.e == i) {
                return;
            }
            this.f = false;
            this.e = Math.max(0, i);
        }
        l0(z);
    }

    public void Y(int i) {
        this.f8569a = i;
    }

    public void Z(boolean z) {
        this.I = z;
    }

    public void a0(int i) {
        V v;
        if (this.K == i) {
            return;
        }
        this.K = i;
        if (i == 4 || i == 3 || i == 6 || (this.H && i == 5)) {
            this.L = i;
        }
        WeakReference<V> weakReference = this.T;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            k0(true);
        } else if (i == 6 || i == 5 || i == 4) {
            k0(false);
        }
        j0(i);
        for (int i2 = 0; i2 < this.V.size(); i2++) {
            this.V.get(i2).onStateChanged(v, i);
        }
        i0();
    }

    public final void b0(View view) {
        boolean z = (Build.VERSION.SDK_INT < 29 || I() || this.f) ? false : true;
        if (this.o || this.p || this.q || this.s || this.t || this.u || z) {
            ayq.b(view, new c(z));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean c0(long j, @FloatRange(from = 0.0d, to = 100.0d) float f2) {
        return false;
    }

    public final boolean d0() {
        return this.M != null && (this.J || this.K == 1);
    }

    public boolean e0(View view, float f2) {
        if (this.I) {
            return true;
        }
        if (view.getTop() < this.F) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.F)) / ((float) v()) > 0.5f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean f0() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean g0() {
        return true;
    }

    public int getState() {
        return this.K;
    }

    public final void h0(View view, int i, boolean z) {
        int iG = G(i);
        psq psqVar = this.M;
        if (psqVar == null || (!z ? psqVar.R(view, view.getLeft(), iG) : psqVar.P(view.getLeft(), iG))) {
            a0(i);
            return;
        }
        a0(2);
        j0(i);
        this.z.c(i);
    }

    public final void i0() {
        V v;
        WeakReference<V> weakReference = this.T;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        androidx.core.view.c.k0(v, 524288);
        androidx.core.view.c.k0(v, 262144);
        androidx.core.view.c.k0(v, EventRecurrence.TH);
        int i = this.b0;
        if (i != -1) {
            androidx.core.view.c.k0(v, i);
        }
        if (!this.f8570b && this.K != 6) {
            this.b0 = r(v, h2j.f19615a, 6);
        }
        if (this.H && this.K != 5) {
            M(v, m80.a.y, 5);
        }
        int i2 = this.K;
        if (i2 == 3) {
            M(v, m80.a.x, this.f8570b ? 4 : 6);
            return;
        }
        if (i2 == 4) {
            M(v, m80.a.w, this.f8570b ? 3 : 6);
        } else {
            if (i2 != 6) {
                return;
            }
            M(v, m80.a.x, 4);
            M(v, m80.a.w, 3);
        }
    }

    public boolean isHideable() {
        return this.H;
    }

    public final void j0(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.y != z) {
            this.y = z;
            if (this.i == null || (valueAnimator = this.A) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.A.reverse();
                return;
            }
            float f2 = z ? 0.0f : 1.0f;
            this.A.setFloatValues(1.0f - f2, f2);
            this.A.start();
        }
    }

    public final void k0(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.T;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.a0 != null) {
                    return;
                } else {
                    this.a0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.T.get()) {
                    if (z) {
                        this.a0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.c) {
                            androidx.core.view.c.C0(childAt, 4);
                        }
                    } else if (this.c && (map = this.a0) != null && map.containsKey(childAt)) {
                        androidx.core.view.c.C0(childAt, this.a0.get(childAt).intValue());
                    }
                }
            }
            if (!z) {
                this.a0 = null;
            } else if (this.c) {
                this.T.get().sendAccessibilityEvent(8);
            }
        }
    }

    public final void l0(boolean z) {
        V v;
        if (this.T != null) {
            t();
            if (this.K != 4 || (v = this.T.get()) == null) {
                return;
            }
            if (z) {
                setState(4);
            } else {
                v.requestLayout();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(CoordinatorLayout.e eVar) {
        super.onAttachedToLayoutParams(eVar);
        this.T = null;
        this.M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.T = null;
        this.M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        psq psqVar;
        if (!v.isShown() || !this.J) {
            this.N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            N();
        }
        if (this.W == null) {
            this.W = VelocityTracker.obtain();
        }
        this.W.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.Y = (int) motionEvent.getY();
            if (this.K != 2) {
                WeakReference<View> weakReference = this.U;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.z(view, x, this.Y)) {
                    this.X = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.Z = true;
                }
            }
            this.N = this.X == -1 && !coordinatorLayout.z(v, x, this.Y);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.Z = false;
            this.X = -1;
            if (this.N) {
                this.N = false;
                return false;
            }
        }
        if (!this.N && (psqVar = this.M) != null && psqVar.Q(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.U;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.N || this.K == 1 || coordinatorLayout.z(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.M == null || Math.abs(((float) this.Y) - motionEvent.getY()) <= ((float) this.M.A())) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (androidx.core.view.c.x(coordinatorLayout) && !androidx.core.view.c.x(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.T == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(pmi.h);
            b0(v);
            this.T = new WeakReference<>(v);
            l8f l8fVar = this.i;
            if (l8fVar != null) {
                androidx.core.view.c.v0(v, l8fVar);
                l8f l8fVar2 = this.i;
                float fV = this.G;
                if (fV == -1.0f) {
                    fV = androidx.core.view.c.v(v);
                }
                l8fVar2.a0(fV);
                boolean z = this.K == 3;
                this.y = z;
                this.i.c0(z ? 0.0f : 1.0f);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    androidx.core.view.c.w0(v, colorStateList);
                }
            }
            i0();
            if (androidx.core.view.c.y(v) == 0) {
                androidx.core.view.c.C0(v, 1);
            }
        }
        if (this.M == null) {
            this.M = psq.p(coordinatorLayout, this.c0);
        }
        int top = v.getTop();
        coordinatorLayout.G(v, i);
        this.R = coordinatorLayout.getWidth();
        this.S = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.Q = height;
        int i2 = this.S;
        int i3 = i2 - height;
        int i4 = this.w;
        if (i3 < i4) {
            if (this.f8572r) {
                this.Q = i2;
            } else {
                this.Q = i2 - i4;
            }
        }
        this.C = Math.max(0, i2 - this.Q);
        u();
        t();
        int i5 = this.K;
        if (i5 == 3) {
            androidx.core.view.c.b0(v, D());
        } else if (i5 == 6) {
            androidx.core.view.c.b0(v, this.D);
        } else if (this.H && i5 == 5) {
            androidx.core.view.c.b0(v, this.S);
        } else if (i5 == 4) {
            androidx.core.view.c.b0(v, this.F);
        } else if (i5 == 1 || i5 == 2) {
            androidx.core.view.c.b0(v, top - v.getTop());
        }
        this.U = new WeakReference<>(A(v));
        for (int i6 = 0; i6 < this.V.size(); i6++) {
            this.V.get(i6).onLayout(v);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(C(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f8571k, marginLayoutParams.width), C(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.l, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
        WeakReference<View> weakReference;
        if (K() && (weakReference = this.U) != null && view == weakReference.get()) {
            return this.K != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f2, f3);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.U;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!K() || view == view2) {
            int top = v.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                if (i4 < D()) {
                    int iD = top - D();
                    iArr[1] = iD;
                    androidx.core.view.c.b0(v, -iD);
                    a0(3);
                } else {
                    if (!this.J) {
                        return;
                    }
                    iArr[1] = i2;
                    androidx.core.view.c.b0(v, -i2);
                    a0(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                int i5 = this.F;
                if (i4 > i5 && !this.H) {
                    int i6 = top - i5;
                    iArr[1] = i6;
                    androidx.core.view.c.b0(v, -i6);
                    a0(4);
                } else {
                    if (!this.J) {
                        return;
                    }
                    iArr[1] = i2;
                    androidx.core.view.c.b0(v, -i2);
                    a0(1);
                }
            }
            z(v.getTop());
            this.O = i2;
            this.P = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.a());
        O(savedState);
        int i = savedState.f8573b;
        if (i == 1 || i == 2) {
            this.K = 4;
            this.L = 4;
        } else {
            this.K = i;
            this.L = i;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.O = 0;
        this.P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        WeakReference<View> weakReference;
        int i2 = 3;
        if (v.getTop() == D()) {
            a0(3);
            return;
        }
        if (!K() || ((weakReference = this.U) != null && view == weakReference.get() && this.P)) {
            if (this.O > 0) {
                if (!this.f8570b && v.getTop() > this.D) {
                    i2 = 6;
                }
            } else if (this.H && e0(v, H())) {
                i2 = 5;
            } else if (this.O == 0) {
                int top = v.getTop();
                if (!this.f8570b) {
                    int i3 = this.D;
                    if (top < i3) {
                        if (top >= Math.abs(top - this.F)) {
                            if (f0()) {
                                i2 = 4;
                            } else {
                                i2 = 6;
                            }
                        }
                    } else if (Math.abs(top - i3) < Math.abs(top - this.F)) {
                        i2 = 6;
                    } else {
                        i2 = 4;
                    }
                } else if (Math.abs(top - this.C) >= Math.abs(top - this.F)) {
                    i2 = 4;
                }
            } else {
                if (!this.f8570b) {
                    int top2 = v.getTop();
                    if (Math.abs(top2 - this.D) < Math.abs(top2 - this.F)) {
                        i2 = 6;
                    }
                }
                i2 = 4;
            }
            h0(v, i2, false);
            this.P = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.K == 1 && actionMasked == 0) {
            return true;
        }
        if (d0()) {
            this.M.G(motionEvent);
        }
        if (actionMasked == 0) {
            N();
        }
        if (this.W == null) {
            this.W = VelocityTracker.obtain();
        }
        this.W.addMovement(motionEvent);
        if (d0() && actionMasked == 2 && !this.N && Math.abs(this.Y - motionEvent.getY()) > this.M.A()) {
            this.M.c(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.N;
    }

    public final int r(V v, int i, int i2) {
        return androidx.core.view.c.c(v, v.getResources().getString(i), w(i2));
    }

    public void s(f fVar) {
        if (this.V.contains(fVar)) {
            return;
        }
        this.V.add(fVar);
    }

    public void setDraggable(boolean z) {
        this.J = z;
    }

    public void setHideable(boolean z) {
        if (this.H != z) {
            this.H = z;
            if (!z && this.K == 5) {
                setState(4);
            }
            i0();
        }
    }

    public void setState(int i) {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.H && i == 5) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot set state: ");
            sb2.append(i);
            return;
        }
        int i2 = (i == 6 && this.f8570b && G(i) <= this.C) ? 3 : i;
        WeakReference<V> weakReference = this.T;
        if (weakReference == null || weakReference.get() == null) {
            a0(i);
        } else {
            V v = this.T.get();
            P(v, new a(v, i2));
        }
    }

    public final void t() {
        int iV = v();
        if (this.f8570b) {
            this.F = Math.max(this.S - iV, this.C);
        } else {
            this.F = this.S - iV;
        }
    }

    public final void u() {
        this.D = (int) (this.S * (1.0f - this.E));
    }

    public final int v() {
        int i;
        if (this.f) {
            return Math.min(Math.max(this.g, this.S - ((this.R * 9) / 16)), this.Q) + this.v;
        }
        return (this.n || this.o || (i = this.m) <= 0) ? this.e + this.v : Math.max(this.e, i + this.h);
    }

    public final q80 w(int i) {
        return new e(i);
    }

    public final void x(Context context) {
        if (this.x == null) {
            return;
        }
        l8f l8fVar = new l8f(this.x);
        this.i = l8fVar;
        l8fVar.Q(context);
        ColorStateList colorStateList = this.j;
        if (colorStateList != null) {
            this.i.b0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.i.setTint(typedValue.data);
    }

    public final void y() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.A.addUpdateListener(new b());
    }

    public void z(int i) {
        float f2;
        float fD;
        V v = this.T.get();
        if (v == null || this.V.isEmpty()) {
            return;
        }
        int i2 = this.F;
        if (i > i2 || i2 == D()) {
            int i3 = this.F;
            f2 = i3 - i;
            fD = this.S - i3;
        } else {
            int i4 = this.F;
            f2 = i4 - i;
            fD = i4 - D();
        }
        float f3 = f2 / fD;
        for (int i5 = 0; i5 < this.V.size(); i5++) {
            this.V.get(i5).onSlide(v, f3);
        }
    }

    public class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f8584b;
        public final Runnable c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.f8584b = false;
                psq psqVar = BottomSheetBehavior.this.M;
                if (psqVar != null && psqVar.n(true)) {
                    g gVar = g.this;
                    gVar.c(gVar.f8583a);
                    return;
                }
                g gVar2 = g.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.K == 2) {
                    bottomSheetBehavior.a0(gVar2.f8583a);
                }
            }
        }

        public g() {
            this.c = new a();
        }

        public void c(int i) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.T;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f8583a = i;
            if (this.f8584b) {
                return;
            }
            androidx.core.view.c.i0(BottomSheetBehavior.this.T.get(), this.c);
            this.f8584b = true;
        }

        public /* synthetic */ g(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8573b;
        public int c;
        public boolean d;
        public boolean e;
        public boolean f;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
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
            this.f8573b = parcel.readInt();
            this.c = parcel.readInt();
            this.d = parcel.readInt() == 1;
            this.e = parcel.readInt() == 1;
            this.f = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f8573b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f8573b = bottomSheetBehavior.K;
            this.c = bottomSheetBehavior.e;
            this.d = bottomSheetBehavior.f8570b;
            this.e = bottomSheetBehavior.H;
            this.f = bottomSheetBehavior.I;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.f8569a = 0;
        this.f8570b = true;
        this.c = false;
        this.f8571k = -1;
        this.l = -1;
        this.z = new g(this, null);
        this.E = 0.5f;
        this.G = -1.0f;
        this.J = true;
        this.K = 4;
        this.L = 4;
        this.V = new ArrayList<>();
        this.b0 = -1;
        this.c0 = new d();
        this.h = context.getResources().getDimensionPixelSize(pmi.k0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b4j.p0);
        if (typedArrayObtainStyledAttributes.hasValue(b4j.t0)) {
            this.j = k8f.b(context, typedArrayObtainStyledAttributes, b4j.t0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(b4j.K0)) {
            this.x = r2m.e(context, attributeSet, pii.g, d0).m();
        }
        x(context);
        y();
        this.G = typedArrayObtainStyledAttributes.getDimension(b4j.s0, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(b4j.q0)) {
            V(typedArrayObtainStyledAttributes.getDimensionPixelSize(b4j.q0, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(b4j.r0)) {
            U(typedArrayObtainStyledAttributes.getDimensionPixelSize(b4j.r0, -1));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(b4j.z0);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            W(i);
        } else {
            W(typedArrayObtainStyledAttributes.getDimensionPixelSize(b4j.z0, -1));
        }
        setHideable(typedArrayObtainStyledAttributes.getBoolean(b4j.y0, false));
        S(typedArrayObtainStyledAttributes.getBoolean(b4j.C0, false));
        R(typedArrayObtainStyledAttributes.getBoolean(b4j.w0, true));
        Z(typedArrayObtainStyledAttributes.getBoolean(b4j.B0, false));
        setDraggable(typedArrayObtainStyledAttributes.getBoolean(b4j.u0, true));
        Y(typedArrayObtainStyledAttributes.getInt(b4j.A0, 0));
        T(typedArrayObtainStyledAttributes.getFloat(b4j.x0, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(b4j.v0);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            Q(typedValuePeekValue2.data);
        } else {
            Q(typedArrayObtainStyledAttributes.getDimensionPixelOffset(b4j.v0, 0));
        }
        this.o = typedArrayObtainStyledAttributes.getBoolean(b4j.G0, false);
        this.p = typedArrayObtainStyledAttributes.getBoolean(b4j.H0, false);
        this.q = typedArrayObtainStyledAttributes.getBoolean(b4j.I0, false);
        this.f8572r = typedArrayObtainStyledAttributes.getBoolean(b4j.J0, true);
        this.s = typedArrayObtainStyledAttributes.getBoolean(b4j.D0, false);
        this.t = typedArrayObtainStyledAttributes.getBoolean(b4j.E0, false);
        this.u = typedArrayObtainStyledAttributes.getBoolean(b4j.F0, false);
        typedArrayObtainStyledAttributes.recycle();
        this.d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
