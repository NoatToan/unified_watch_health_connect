package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import defpackage.bjg;
import defpackage.cjg;
import defpackage.ejg;
import defpackage.fjg;
import defpackage.gjg;
import defpackage.hjg;
import defpackage.khe;
import defpackage.ni4;
import defpackage.pw3;
import defpackage.vw3;

/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements gjg, fjg, bjg, cjg {
    public static final int[] P = {R.attr.enabled};
    public int A;
    public int B;
    public vw3 C;
    public Animation D;
    public Animation E;
    public Animation F;
    public Animation G;
    public Animation H;
    public boolean I;
    public int J;
    public boolean K;
    public boolean L;
    public Animation.AnimationListener M;
    public final Animation N;
    public final Animation O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f3008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f3009b;
    public boolean c;
    public int d;
    public float e;
    public float f;
    public final hjg g;
    public final ejg h;
    public final int[] i;
    public final int[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int[] f3010k;
    public boolean l;
    public int m;
    public int n;
    public float o;
    public float p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3011r;
    public boolean s;
    public boolean t;
    public final DecelerateInterpolator u;
    public pw3 v;
    public int w;
    public int x;
    public float y;
    public int z;

    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.c) {
                swipeRefreshLayout.m();
                return;
            }
            swipeRefreshLayout.C.setAlpha(255);
            SwipeRefreshLayout.this.C.start();
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            if (swipeRefreshLayout2.I && (jVar = swipeRefreshLayout2.f3009b) != null) {
                jVar.onRefresh();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
            swipeRefreshLayout3.n = swipeRefreshLayout3.v.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class b extends Animation {
        public b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f);
        }
    }

    public class c extends Animation {
        public c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    public class d extends Animation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f3016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f3017b;

        public d(int i, int i2) {
            this.f3016a = i;
            this.f3017b = i2;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            vw3 vw3Var = SwipeRefreshLayout.this.C;
            int i = this.f3016a;
            vw3Var.setAlpha((int) (i + ((this.f3017b - i) * f)));
        }
    }

    public class e implements Animation.AnimationListener {
        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.s) {
                return;
            }
            swipeRefreshLayout.t(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class f extends Animation {
        public f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int iAbs = !swipeRefreshLayout.K ? swipeRefreshLayout.A - Math.abs(swipeRefreshLayout.z) : swipeRefreshLayout.A;
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i = swipeRefreshLayout2.x;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i + ((int) ((iAbs - i) * f))) - swipeRefreshLayout2.v.getTop());
            SwipeRefreshLayout.this.C.h(1.0f - f);
        }
    }

    public class g extends Animation {
        public g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.k(f);
        }
    }

    public class h extends Animation {
        public h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f2 = swipeRefreshLayout.y;
            swipeRefreshLayout.setAnimationProgress(f2 + ((-f2) * f));
            SwipeRefreshLayout.this.k(f);
        }
    }

    public interface i {
    }

    public interface j {
        void onRefresh();
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    private void setColorViewAlpha(int i2) {
        this.v.getBackground().setAlpha(i2);
        this.C.setAlpha(i2);
    }

    public final void a(int i2, Animation.AnimationListener animationListener) {
        this.x = i2;
        this.N.reset();
        this.N.setDuration(200L);
        this.N.setInterpolator(this.u);
        if (animationListener != null) {
            this.v.b(animationListener);
        }
        this.v.clearAnimation();
        this.v.startAnimation(this.N);
    }

    public final void b(int i2, Animation.AnimationListener animationListener) {
        if (this.s) {
            u(i2, animationListener);
            return;
        }
        this.x = i2;
        this.O.reset();
        this.O.setDuration(200L);
        this.O.setInterpolator(this.u);
        if (animationListener != null) {
            this.v.b(animationListener);
        }
        this.v.clearAnimation();
        this.v.startAnimation(this.O);
    }

    public boolean c() {
        View view = this.f3008a;
        return view instanceof ListView ? khe.a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    public final void d() {
        this.v = new pw3(getContext());
        vw3 vw3Var = new vw3(getContext());
        this.C = vw3Var;
        vw3Var.r(1);
        this.v.setImageDrawable(this.C);
        this.v.setVisibility(8);
        addView(this.v);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return this.h.a(f2, f3, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.h.b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.h.c(i2, i3, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.h.f(i2, i3, i4, i5, iArr);
    }

    public void e(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        if (i6 == 0) {
            this.h.e(i2, i3, i4, i5, iArr, i6, iArr2);
        }
    }

    public final void f() {
        if (this.f3008a == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(this.v)) {
                    this.f3008a = childAt;
                    return;
                }
            }
        }
    }

    public final void g(float f2) {
        if (f2 > this.e) {
            o(true, true);
            return;
        }
        this.c = false;
        this.C.o(0.0f, 0.0f);
        b(this.n, !this.s ? new e() : null);
        this.C.g(false);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        int i4 = this.w;
        if (i4 < 0) {
            return i3;
        }
        if (i3 == i2 - 1) {
            return i4;
        }
        return i3 >= i4 ? i3 + 1 : i3;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.g.a();
    }

    public int getProgressCircleDiameter() {
        return this.J;
    }

    public int getProgressViewEndOffset() {
        return this.A;
    }

    public int getProgressViewStartOffset() {
        return this.z;
    }

    public final boolean h(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.h.k();
    }

    public boolean i() {
        return this.c;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.h.m();
    }

    public final void j(float f2) {
        this.C.g(true);
        float fMin = Math.min(1.0f, Math.abs(f2 / this.e));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f2) - this.e;
        int i2 = this.B;
        if (i2 <= 0) {
            i2 = this.K ? this.A - this.z : this.A;
        }
        float f3 = i2;
        double dMax = Math.max(0.0f, Math.min(fAbs, f3 * 2.0f) / f3) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i3 = this.z + ((int) ((f3 * fMin) + (f3 * fPow * 2.0f)));
        if (this.v.getVisibility() != 0) {
            this.v.setVisibility(0);
        }
        if (!this.s) {
            this.v.setScaleX(1.0f);
            this.v.setScaleY(1.0f);
        }
        if (this.s) {
            setAnimationProgress(Math.min(1.0f, f2 / this.e));
        }
        if (f2 < this.e) {
            if (this.C.getAlpha() > 76 && !h(this.F)) {
                s();
            }
        } else if (this.C.getAlpha() < 255 && !h(this.G)) {
            r();
        }
        this.C.o(0.0f, Math.min(0.8f, fMax * 0.8f));
        this.C.h(Math.min(1.0f, fMax));
        this.C.l((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i3 - this.n);
    }

    public void k(float f2) {
        int i2 = this.x;
        setTargetOffsetTopAndBottom((i2 + ((int) ((this.z - i2) * f2))) - this.v.getTop());
    }

    public final void l(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3011r) {
            this.f3011r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    public void m() {
        this.v.clearAnimation();
        this.C.stop();
        this.v.setVisibility(8);
        setColorViewAlpha(255);
        if (this.s) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.z - this.n);
        }
        this.n = this.v.getTop();
    }

    public void n(boolean z, int i2, int i3) {
        this.s = z;
        this.z = i2;
        this.A = i3;
        this.K = true;
        m();
        this.c = false;
    }

    public final void o(boolean z, boolean z2) {
        if (this.c != z) {
            this.I = z2;
            f();
            this.c = z;
            if (z) {
                a(this.n, this.M);
            } else {
                t(this.M);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0051  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        f();
        int actionMasked = motionEvent.getActionMasked();
        if (this.t && actionMasked == 0) {
            this.t = false;
        }
        if (!isEnabled() || this.t || c() || this.c || this.l) {
            return false;
        }
        if (actionMasked == 0) {
            setTargetOffsetTopAndBottom(this.z - this.v.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f3011r = pointerId;
            this.q = false;
            int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            this.p = motionEvent.getY(iFindPointerIndex2);
        } else if (actionMasked == 1) {
            this.q = false;
            this.f3011r = -1;
        } else if (actionMasked == 2) {
            int i2 = this.f3011r;
            if (i2 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i2)) < 0) {
                return false;
            }
            q(motionEvent.getY(iFindPointerIndex));
        } else if (actionMasked == 3) {
            this.q = false;
            this.f3011r = -1;
        } else if (actionMasked == 6) {
            l(motionEvent);
        }
        return this.q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f3008a == null) {
            f();
        }
        View view = this.f3008a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.v.getMeasuredWidth();
        int measuredHeight2 = this.v.getMeasuredHeight();
        int i6 = measuredWidth / 2;
        int i7 = measuredWidth2 / 2;
        int i8 = this.n;
        this.v.layout(i6 - i7, i8, i6 + i7, measuredHeight2 + i8);
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f3008a == null) {
            f();
        }
        View view = this.f3008a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.v.measure(View.MeasureSpec.makeMeasureSpec(this.J, 1073741824), View.MeasureSpec.makeMeasureSpec(this.J, 1073741824));
        this.w = -1;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if (getChildAt(i4) == this.v) {
                this.w = i4;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        return dispatchNestedFling(f2, f3, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // defpackage.fjg
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    @Override // defpackage.gjg
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (i6 != 0) {
            return;
        }
        int i7 = iArr[1];
        e(i2, i3, i4, i5, this.j, i6, iArr);
        int i8 = i5 - (iArr[1] - i7);
        int i9 = i8 == 0 ? i5 + this.j[1] : i8;
        if (i9 >= 0 || c()) {
            return;
        }
        float fAbs = this.f + Math.abs(i9);
        this.f = fAbs;
        j(fAbs);
        iArr[1] = iArr[1] + i8;
    }

    @Override // defpackage.fjg
    public void onNestedScrollAccepted(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.f3012a);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.c);
    }

    @Override // defpackage.fjg
    public boolean onStartNestedScroll(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            return onStartNestedScroll(view, view2, i2);
        }
        return false;
    }

    @Override // defpackage.fjg
    public void onStopNestedScroll(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.t && actionMasked == 0) {
            this.t = false;
        }
        if (!isEnabled() || this.t || c() || this.c || this.l) {
            return false;
        }
        if (actionMasked == 0) {
            this.f3011r = motionEvent.getPointerId(0);
            this.q = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f3011r);
                if (iFindPointerIndex < 0) {
                    return false;
                }
                if (this.q) {
                    float y = (motionEvent.getY(iFindPointerIndex) - this.o) * 0.5f;
                    this.q = false;
                    g(y);
                }
                this.f3011r = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f3011r);
                if (iFindPointerIndex2 < 0) {
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                q(y2);
                if (this.q) {
                    float f2 = (y2 - this.o) * 0.5f;
                    if (f2 <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    j(f2);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        return false;
                    }
                    this.f3011r = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    l(motionEvent);
                }
            }
        }
        return true;
    }

    public final Animation p(int i2, int i3) {
        d dVar = new d(i2, i3);
        dVar.setDuration(300L);
        this.v.b(null);
        this.v.clearAnimation();
        this.v.startAnimation(dVar);
        return dVar;
    }

    public final void q(float f2) {
        float f3 = this.p;
        float f4 = f2 - f3;
        int i2 = this.d;
        if (f4 <= i2 || this.q) {
            return;
        }
        this.o = f3 + i2;
        this.q = true;
        this.C.setAlpha(76);
    }

    public final void r() {
        this.G = p(this.C.getAlpha(), 255);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent;
        View view = this.f3008a;
        if (view == null || androidx.core.view.c.V(view)) {
            super.requestDisallowInterceptTouchEvent(z);
        } else {
            if (this.L || (parent = getParent()) == null) {
                return;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public final void s() {
        this.F = p(this.C.getAlpha(), 76);
    }

    public void setAnimationProgress(float f2) {
        this.v.setScaleX(f2);
        this.v.setScaleY(f2);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        f();
        this.C.k(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = ni4.c(context, iArr[i2]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i2) {
        this.e = i2;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        m();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.L = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.h.n(z);
    }

    public void setOnChildScrollUpCallback(i iVar) {
    }

    public void setOnRefreshListener(j jVar) {
        this.f3009b = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i2) {
        setProgressBackgroundColorSchemeResource(i2);
    }

    public void setProgressBackgroundColorSchemeColor(int i2) {
        this.v.setBackgroundColor(i2);
    }

    public void setProgressBackgroundColorSchemeResource(int i2) {
        setProgressBackgroundColorSchemeColor(ni4.c(getContext(), i2));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.c == z) {
            o(z, false);
            return;
        }
        this.c = z;
        setTargetOffsetTopAndBottom((!this.K ? this.A + this.z : this.A) - this.n);
        this.I = false;
        v(this.M);
    }

    public void setSize(int i2) {
        if (i2 == 0 || i2 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i2 == 0) {
                this.J = (int) (displayMetrics.density * 56.0f);
            } else {
                this.J = (int) (displayMetrics.density * 40.0f);
            }
            this.v.setImageDrawable(null);
            this.C.r(i2);
            this.v.setImageDrawable(this.C);
        }
    }

    public void setSlingshotDistance(int i2) {
        this.B = i2;
    }

    public void setTargetOffsetTopAndBottom(int i2) {
        this.v.bringToFront();
        androidx.core.view.c.b0(this.v, i2);
        this.n = this.v.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return this.h.p(i2);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.h.r();
    }

    public void t(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.E = cVar;
        cVar.setDuration(150L);
        this.v.b(animationListener);
        this.v.clearAnimation();
        this.v.startAnimation(this.E);
    }

    public final void u(int i2, Animation.AnimationListener animationListener) {
        this.x = i2;
        this.y = this.v.getScaleX();
        h hVar = new h();
        this.H = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.v.b(animationListener);
        }
        this.v.clearAnimation();
        this.v.startAnimation(this.H);
    }

    public final void v(Animation.AnimationListener animationListener) {
        this.v.setVisibility(0);
        this.C.setAlpha(255);
        b bVar = new b();
        this.D = bVar;
        bVar.setDuration(this.m);
        if (animationListener != null) {
            this.v.b(animationListener);
        }
        this.v.clearAnimation();
        this.v.startAnimation(this.D);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f3012a;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.f3012a = z;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f3012a ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f3012a = parcel.readByte() != 0;
        }
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = false;
        this.e = -1.0f;
        this.i = new int[2];
        this.j = new int[2];
        this.f3010k = new int[2];
        this.f3011r = -1;
        this.w = -1;
        this.M = new a();
        this.N = new f();
        this.O = new g();
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.u = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.J = (int) (displayMetrics.density * 40.0f);
        d();
        setChildrenDrawingOrderEnabled(true);
        int i2 = (int) (displayMetrics.density * 64.0f);
        this.A = i2;
        this.e = i2;
        this.g = new hjg(this);
        this.h = new ejg(this);
        setNestedScrollingEnabled(true);
        int i3 = -this.J;
        this.n = i3;
        this.z = i3;
        k(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, P);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        if (i3 > 0) {
            float f2 = this.f;
            if (f2 > 0.0f) {
                float f3 = i3;
                if (f3 > f2) {
                    iArr[1] = (int) f2;
                    this.f = 0.0f;
                } else {
                    this.f = f2 - f3;
                    iArr[1] = i3;
                }
                j(this.f);
            }
        }
        if (this.K && i3 > 0 && this.f == 0.0f && Math.abs(i3 - iArr[1]) > 0) {
            this.v.setVisibility(8);
        }
        int[] iArr2 = this.i;
        if (dispatchNestedPreScroll(i2 - iArr[0], i3 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.g.b(view, view2, i2);
        startNestedScroll(i2 & 2);
        this.f = 0.0f;
        this.l = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return (!isEnabled() || this.t || this.c || (i2 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.g.d(view);
        this.l = false;
        float f2 = this.f;
        if (f2 > 0.0f) {
            g(f2);
            this.f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // defpackage.fjg
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6) {
        onNestedScroll(view, i2, i3, i4, i5, i6, this.f3010k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i2, i3, i4, i5, 0, this.f3010k);
    }
}
