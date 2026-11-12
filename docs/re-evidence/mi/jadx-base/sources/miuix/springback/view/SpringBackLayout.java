package miuix.springback.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ListView;
import androidx.core.widget.NestedScrollView;
import defpackage.ajg;
import defpackage.b63;
import defpackage.bjg;
import defpackage.djg;
import defpackage.ejg;
import defpackage.gjg;
import defpackage.hjg;
import defpackage.hsq;
import defpackage.khe;
import defpackage.qc1;
import defpackage.r5j;
import defpackage.s7o;
import defpackage.tc8;
import defpackage.whl;
import defpackage.x7o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SpringBackLayout extends ViewGroup implements gjg, bjg, ajg, whl {
    public x7o A;
    public s7o B;
    public int C;
    public int D;
    public float E;
    public float F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public List<hsq> K;
    public a L;
    public int M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f26889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26890b;
    public int c;
    public float d;
    public float e;
    public float f;
    public float g;
    public boolean h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final hjg f26891k;
    public final ejg l;
    public final int[] m;
    public final int[] n;
    public final int[] o;
    public boolean p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f26892r;
    public boolean s;
    public float t;
    public float u;
    public float v;
    public int w;
    public int x;
    public int y;
    public int z;

    public interface a {
        boolean a();
    }

    public SpringBackLayout(Context context) {
        this(context, null);
    }

    private void B(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.i) {
            this.i = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private int getFakeScrollX() {
        return this.I;
    }

    private int getFakeScrollY() {
        return this.J;
    }

    private void k() {
        if (this.f26889a == null) {
            int i = this.f26890b;
            if (i == -1) {
                throw new IllegalArgumentException("invalid target Id");
            }
            this.f26889a = findViewById(i);
        }
        if (this.f26889a == null) {
            throw new IllegalArgumentException("fail to get target");
        }
        if (isEnabled()) {
            View view = this.f26889a;
            if ((view instanceof bjg) && !view.isNestedScrollingEnabled()) {
                this.f26889a.setNestedScrollingEnabled(true);
            }
        }
        if (this.f26889a.getOverScrollMode() == 2 || !this.H) {
            return;
        }
        this.f26889a.setOverScrollMode(2);
    }

    public final boolean A(MotionEvent motionEvent, int i, int i2) {
        float fSignum;
        float fT;
        int actionIndex;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.i);
                    if (iFindPointerIndex < 0) {
                        return false;
                    }
                    if (this.h) {
                        if (i2 == 2) {
                            float y = motionEvent.getY(iFindPointerIndex);
                            fSignum = Math.signum(this.e - y);
                            fT = t(this.e - y, i2);
                        } else {
                            float x = motionEvent.getX(iFindPointerIndex);
                            fSignum = Math.signum(this.g - x);
                            fT = t(this.g - x, i2);
                        }
                        float f = fSignum * fT;
                        if (f <= 0.0f) {
                            q(0.0f, i2);
                            return false;
                        }
                        E(true);
                        q(-f, i2);
                    }
                } else if (i != 3) {
                    if (i == 5) {
                        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.i);
                        if (iFindPointerIndex2 < 0) {
                            return false;
                        }
                        if (i2 == 2) {
                            float y2 = motionEvent.getY(iFindPointerIndex2) - this.d;
                            actionIndex = motionEvent.getActionIndex();
                            if (actionIndex < 0) {
                                return false;
                            }
                            float y3 = motionEvent.getY(actionIndex) - y2;
                            this.d = y3;
                            this.e = y3;
                        } else {
                            float x2 = motionEvent.getX(iFindPointerIndex2) - this.f;
                            actionIndex = motionEvent.getActionIndex();
                            if (actionIndex < 0) {
                                return false;
                            }
                            float x3 = motionEvent.getX(actionIndex) - x2;
                            this.f = x3;
                            this.g = x3;
                        }
                        this.i = motionEvent.getPointerId(actionIndex);
                    } else if (i == 6) {
                        B(motionEvent);
                    }
                }
            }
            if (motionEvent.findPointerIndex(this.i) < 0) {
                return false;
            }
            if (this.h) {
                this.h = false;
                H(i2);
            }
            this.i = -1;
            return false;
        }
        this.i = motionEvent.getPointerId(0);
        d(i2);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    public final boolean C(MotionEvent motionEvent) {
        int iFindPointerIndex;
        boolean z = false;
        if (!p(2) && !o(2)) {
            return false;
        }
        if (p(2) && !M()) {
            return false;
        }
        if (o(2) && !L()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            int pointerId = motionEvent.getPointerId(0);
            this.i = pointerId;
            int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            this.d = motionEvent.getY(iFindPointerIndex2);
            if (getScrollY() != 0) {
                this.h = true;
                this.e = this.d;
            } else {
                this.h = false;
            }
        } else if (actionMasked == 1) {
            this.h = false;
            this.i = -1;
        } else if (actionMasked == 2) {
            int i = this.i;
            if (i == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i)) < 0) {
                return false;
            }
            float y = motionEvent.getY(iFindPointerIndex);
            if (o(2) && p(2)) {
                z = true;
            }
            if ((z || !p(2)) && (!z || y <= this.d)) {
                if (this.d - y > this.c && !this.h) {
                    this.h = true;
                    j(1);
                    this.e = y;
                }
            } else if (y - this.d > this.c && !this.h) {
                this.h = true;
                j(1);
                this.e = y;
            }
        } else if (actionMasked == 3) {
            this.h = false;
            this.i = -1;
        } else if (actionMasked == 6) {
            B(motionEvent);
        }
        return this.h;
    }

    public final boolean D(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (p(2) || o(2)) {
            return o(2) ? A(motionEvent, actionMasked, 2) : y(motionEvent, actionMasked, 2);
        }
        return z(motionEvent, actionMasked, 2);
    }

    public void E(boolean z) {
        ViewParent parent = getParent();
        parent.requestDisallowInterceptTouchEvent(z);
        while (parent != null) {
            if (parent instanceof SpringBackLayout) {
                ((SpringBackLayout) parent).m(z);
            }
            parent = parent.getParent();
        }
    }

    public void F(int i, int i2) {
        if (i - getScrollX() == 0 && i2 - getScrollY() == 0) {
            return;
        }
        this.A.b();
        this.A.g(getScrollX(), i, getScrollY(), i2, 0.0f, 2, true);
        j(2);
        qc1.a(this);
    }

    public final void G(float f, int i, boolean z) {
        a aVar = this.L;
        if (aVar == null || !aVar.a()) {
            this.A.b();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            this.A.g(scrollX, 0.0f, scrollY, 0.0f, f, i, false);
            if (scrollX == 0 && scrollY == 0 && f == 0.0f) {
                j(0);
            } else {
                j(2);
            }
            if (z) {
                qc1.a(this);
            }
        }
    }

    public final void H(int i) {
        G(0.0f, i, true);
    }

    public boolean I() {
        return this.H;
    }

    public final void J(int i) {
        this.f26892r = false;
        if (!this.G) {
            H(i);
            return;
        }
        if (this.A.f()) {
            G(i == 2 ? this.F : this.E, i, false);
        }
        qc1.a(this);
    }

    public void K(int i) {
        this.l.s(i);
    }

    public final boolean L() {
        return (this.z & 2) != 0;
    }

    public final boolean M() {
        return (this.z & 1) != 0;
    }

    @Override // defpackage.ajg
    public boolean a(float f, float f2) {
        this.E = f;
        this.F = f2;
        return true;
    }

    @Override // defpackage.whl
    public void addOnScrollChangeListener(hsq hsqVar) {
        this.K.add(hsqVar);
    }

    public final void b(int i) {
        if (getScrollX() == 0) {
            this.h = false;
            return;
        }
        this.h = true;
        float fU = u(Math.abs(getScrollX()), Math.abs(s(i)), 2);
        if (getScrollX() < 0) {
            this.f -= fU;
        } else {
            this.f += fU;
        }
        this.g = this.f;
    }

    public final void c(MotionEvent motionEvent) {
        int i;
        this.B.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            s7o s7oVar = this.B;
            this.d = s7oVar.f33385b;
            this.f = s7oVar.c;
            this.i = s7oVar.d;
            if (getScrollY() != 0) {
                this.x = 2;
                E(true);
            } else if (getScrollX() != 0) {
                this.x = 1;
                E(true);
            } else {
                this.x = 0;
            }
            if ((this.y & 2) != 0) {
                d(2);
                return;
            } else {
                d(1);
                return;
            }
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.x != 0 || (i = this.B.e) == 0) {
                    return;
                }
                this.x = i;
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                B(motionEvent);
                return;
            }
        }
        g(false);
        if ((this.y & 2) != 0) {
            H(2);
        } else {
            H(1);
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.A.a()) {
            scrollTo(this.A.c(), this.A.d());
            if (!this.A.f()) {
                qc1.a(this);
                return;
            }
            if (getSpringScrollX() != 0 || getSpringScrollY() != 0) {
                if (this.M != 2) {
                    H(this.w != 2 ? 1 : 2);
                    return;
                }
            }
            j(0);
        }
    }

    public final void d(int i) {
        if (i == 2) {
            e(i);
        } else {
            b(i);
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.l.a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.l.b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.l.c(i, i2, iArr, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 && this.M == 2 && this.B.b(motionEvent)) {
            j(1);
        }
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1 && this.M != 2) {
            j(0);
        }
        return zDispatchTouchEvent;
    }

    public final void e(int i) {
        if (getScrollY() == 0) {
            this.h = false;
            return;
        }
        this.h = true;
        float fU = u(Math.abs(getScrollY()), Math.abs(s(i)), 2);
        if (getScrollY() < 0) {
            this.d -= fU;
        } else {
            this.d += fU;
        }
        this.e = this.d;
    }

    public final void f(int i, int[] iArr, int i2) {
        if (i2 == 2) {
            iArr[1] = i;
        } else {
            iArr[0] = i;
        }
    }

    public final void g(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public int getSpringBackMode() {
        return this.z;
    }

    public int getSpringScrollX() {
        return this.H ? getScrollX() : getFakeScrollX();
    }

    public int getSpringScrollY() {
        return this.H ? getScrollY() : getFakeScrollY();
    }

    public View getTarget() {
        return this.f26889a;
    }

    public boolean h(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.l.d(i, i2, iArr, iArr2, i3);
    }

    public void i(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.l.e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.l.m();
    }

    public final void j(int i) {
        int i2 = this.M;
        if (i2 != i) {
            this.M = i;
            Iterator<hsq> it = this.K.iterator();
            while (it.hasNext()) {
                it.next().a(i2, i, this.A.f());
            }
        }
    }

    public int l(int i) {
        return i == 2 ? this.D : this.C;
    }

    public void m(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final boolean n(int i) {
        return this.x == i;
    }

    public final boolean o(int i) {
        if (i != 2) {
            return !this.f26889a.canScrollHorizontally(1);
        }
        View view = this.f26889a;
        return view instanceof ListView ? !khe.a((ListView) view, 1) : !view.canScrollVertically(1);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Point pointF = tc8.f(getContext());
        this.C = pointF.x;
        this.D = pointF.y;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.q = getPaddingTop();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.H || !isEnabled() || this.f26892r || this.s || this.f26889a.isNestedScrollingEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (!this.A.f() && actionMasked == 0) {
            this.A.b();
        }
        if (!M() && !L()) {
            return false;
        }
        int i = this.y;
        if ((i & 4) != 0) {
            c(motionEvent);
            if (n(2) && (this.y & 1) != 0 && getScrollX() == 0.0f) {
                return false;
            }
            if (n(1) && (this.y & 2) != 0 && getScrollY() == 0.0f) {
                return false;
            }
            if (n(2) || n(1)) {
                g(true);
            }
        } else {
            this.x = i;
        }
        if (n(2)) {
            return C(motionEvent);
        }
        if (n(1)) {
            return v(motionEvent);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f26889a.getVisibility() != 8) {
            int measuredWidth = this.f26889a.getMeasuredWidth();
            int measuredHeight = this.f26889a.getMeasuredHeight();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.f26889a.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size;
        int size2;
        k();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        measureChild(this.f26889a, i, i2);
        if (mode == 0) {
            size = this.f26889a.getMeasuredWidth() + getPaddingLeft() + getPaddingRight();
        } else {
            size = mode == 1073741824 ? View.MeasureSpec.getSize(i) : Math.min(View.MeasureSpec.getSize(i), this.f26889a.getMeasuredWidth() + getPaddingLeft() + getPaddingRight());
        }
        if (mode2 == 0) {
            size2 = this.f26889a.getMeasuredHeight() + getPaddingTop() + getPaddingBottom();
        } else {
            size2 = mode2 == 1073741824 ? View.MeasureSpec.getSize(i2) : Math.min(View.MeasureSpec.getSize(i2), this.f26889a.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // defpackage.fjg
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (this.H) {
            if (this.w == 2) {
                x(i2, iArr, i3);
            } else {
                x(i, iArr, i3);
            }
        }
        int[] iArr2 = this.m;
        if (h(i - iArr[0], i2 - iArr[1], iArr2, null, i3)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // defpackage.gjg
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        boolean z = this.w == 2;
        int i6 = z ? i2 : i;
        int i7 = z ? iArr[1] : iArr[0];
        i(i, i2, i3, i4, this.n, i5, iArr);
        if (this.H) {
            int i8 = (z ? iArr[1] : iArr[0]) - i7;
            int i9 = z ? i4 - i8 : i3 - i8;
            int i10 = i9 != 0 ? i9 : 0;
            int i11 = z ? 2 : 1;
            if (i10 < 0 && p(i11) && M()) {
                if (i5 == 0) {
                    if (this.A.f()) {
                        this.u += Math.abs(i10);
                        j(1);
                        q(t(this.u, i11), i11);
                        iArr[1] = iArr[1] + i9;
                        return;
                    }
                    return;
                }
                float fS = s(i11);
                if (this.F != 0.0f || this.E != 0.0f) {
                    this.G = true;
                    if (i6 != 0 && (-i10) <= fS) {
                        this.A.h(i10);
                    }
                    j(2);
                    return;
                }
                if (this.u != 0.0f) {
                    return;
                }
                float f = fS - this.t;
                if (this.j < 4) {
                    if (f <= Math.abs(i10)) {
                        this.t += f;
                        iArr[1] = (int) (iArr[1] + f);
                    } else {
                        this.t += Math.abs(i10);
                        iArr[1] = iArr[1] + i9;
                    }
                    j(2);
                    q(t(this.t, i11), i11);
                    this.j++;
                    return;
                }
                return;
            }
            if (i10 > 0 && o(i11) && L()) {
                if (i5 == 0) {
                    if (this.A.f()) {
                        this.v += Math.abs(i10);
                        j(1);
                        q(-t(this.v, i11), i11);
                        iArr[1] = iArr[1] + i9;
                        return;
                    }
                    return;
                }
                float fS2 = s(i11);
                if (this.F != 0.0f || this.E != 0.0f) {
                    this.G = true;
                    if (i6 != 0 && i10 <= fS2) {
                        this.A.h(i10);
                    }
                    j(2);
                    return;
                }
                if (this.v != 0.0f) {
                    return;
                }
                float f2 = fS2 - this.t;
                if (this.j < 4) {
                    if (f2 <= Math.abs(i10)) {
                        this.t += f2;
                        iArr[1] = (int) (iArr[1] + f2);
                    } else {
                        this.t += Math.abs(i10);
                        iArr[1] = iArr[1] + i9;
                    }
                    j(2);
                    q(-t(this.t, i11), i11);
                    this.j++;
                }
            }
        }
    }

    @Override // defpackage.fjg
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (this.H) {
            boolean z = this.w == 2;
            int i3 = z ? 2 : 1;
            float scrollY = z ? getScrollY() : getScrollX();
            if (i2 != 0) {
                if (scrollY == 0.0f) {
                    this.t = 0.0f;
                } else {
                    this.t = u(Math.abs(scrollY), Math.abs(s(i3)), i3);
                }
                this.f26892r = true;
                this.j = 0;
            } else {
                if (scrollY == 0.0f) {
                    this.u = 0.0f;
                    this.v = 0.0f;
                } else if (scrollY < 0.0f) {
                    this.u = u(Math.abs(scrollY), Math.abs(s(i3)), i3);
                    this.v = 0.0f;
                } else {
                    this.u = 0.0f;
                    this.v = u(Math.abs(scrollY), Math.abs(s(i3)), i3);
                }
                this.s = true;
            }
            this.F = 0.0f;
            this.E = 0.0f;
            this.G = false;
            this.A.b();
        }
        onNestedScrollAccepted(view, view2, i);
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        Iterator<hsq> it = this.K.iterator();
        while (it.hasNext()) {
            it.next().onScrollChange(this, i, i2, i3, i4);
        }
    }

    @Override // defpackage.fjg
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        this.w = i;
        boolean z = i == 2;
        if (((z ? 2 : 1) & this.y) == 0) {
            return false;
        }
        if (this.H) {
            if (!onStartNestedScroll(view, view, i)) {
                return false;
            }
            float scrollY = z ? getScrollY() : getScrollX();
            if (i2 != 0 && scrollY != 0.0f && (this.f26889a instanceof NestedScrollView)) {
                return false;
            }
        }
        this.l.q(i, i2);
        return true;
    }

    @Override // defpackage.fjg
    public void onStopNestedScroll(View view, int i) {
        this.f26891k.e(view, i);
        K(i);
        if (this.H) {
            boolean z = this.w == 2;
            int i2 = z ? 2 : 1;
            if (!this.s) {
                if (this.f26892r) {
                    J(i2);
                    return;
                }
                return;
            }
            this.s = false;
            float scrollY = z ? getScrollY() : getScrollX();
            if (!this.f26892r && scrollY != 0.0f) {
                H(i2);
            } else if (scrollY != 0.0f) {
                J(i2);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || this.f26892r || this.s || this.f26889a.isNestedScrollingEnabled()) {
            return false;
        }
        if (!this.A.f() && actionMasked == 0) {
            this.A.b();
        }
        if (n(2)) {
            return D(motionEvent);
        }
        if (n(1)) {
            return w(motionEvent);
        }
        return false;
    }

    public final boolean p(int i) {
        if (i != 2) {
            return !this.f26889a.canScrollHorizontally(-1);
        }
        View view = this.f26889a;
        return view instanceof ListView ? !khe.a((ListView) view, -1) : !view.canScrollVertically(-1);
    }

    public final void q(float f, int i) {
        if (i == 2) {
            scrollTo(0, (int) (-f));
        } else {
            scrollTo((int) (-f), 0);
        }
    }

    public float r(float f, int i) {
        double dMin = Math.min(f, 1.0f);
        return ((float) (((Math.pow(dMin, 3.0d) / 3.0d) - Math.pow(dMin, 2.0d)) + dMin)) * i;
    }

    @Override // defpackage.whl
    public void removeOnScrollChangeListener(hsq hsqVar) {
        this.K.remove(hsqVar);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (isEnabled() && this.H) {
            return;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public float s(int i) {
        return r(1.0f, l(i));
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (this.H) {
            super.scrollTo(i, i2);
            return;
        }
        int i3 = this.I;
        if (i3 == i && this.J == i2) {
            return;
        }
        int i4 = this.J;
        this.I = i;
        this.J = i2;
        onScrollChanged(i, i2, i3, i4);
        if (!awakenScrollBars()) {
            postInvalidateOnAnimation();
        }
        requestLayout();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        View view = this.f26889a;
        if (view == null || !(view instanceof bjg) || z == view.isNestedScrollingEnabled()) {
            return;
        }
        this.f26889a.setNestedScrollingEnabled(z);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.l.n(z);
    }

    public void setOnSpringListener(a aVar) {
        this.L = aVar;
    }

    public void setScrollOrientation(int i) {
        this.y = i;
        this.B.f = i;
    }

    public void setSpringBackEnable(boolean z) {
        if (this.p) {
            return;
        }
        this.H = z;
    }

    public void setSpringBackEnableOnTriggerAttached(boolean z) {
        this.H = z;
    }

    public void setSpringBackMode(int i) {
        this.z = i;
    }

    public void setTarget(View view) {
        this.f26889a = view;
        if ((view instanceof bjg) && !view.isNestedScrollingEnabled()) {
            this.f26889a.setNestedScrollingEnabled(true);
        }
        if (this.f26889a.getOverScrollMode() == 2 || !this.H) {
            return;
        }
        this.f26889a.setOverScrollMode(2);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.l.p(i);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.l.r();
    }

    public float t(float f, int i) {
        int iL = l(i);
        return r(Math.min(Math.abs(f) / iL, 1.0f), iL);
    }

    public float u(float f, float f2, int i) {
        int iL = l(i);
        if (Math.abs(f) >= Math.abs(f2)) {
            f = f2;
        }
        double d = iL;
        return (float) (d - (Math.pow(d, 0.6666666666666666d) * Math.pow(iL - (f * 3.0f), 0.3333333333333333d)));
    }

    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    public final boolean v(MotionEvent motionEvent) {
        int iFindPointerIndex;
        boolean z = false;
        if (!p(1) && !o(1)) {
            return false;
        }
        if (p(1) && !M()) {
            return false;
        }
        if (o(1) && !L()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            int pointerId = motionEvent.getPointerId(0);
            this.i = pointerId;
            int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            this.f = motionEvent.getX(iFindPointerIndex2);
            if (getScrollX() != 0) {
                this.h = true;
                this.g = this.f;
            } else {
                this.h = false;
            }
        } else if (actionMasked == 1) {
            this.h = false;
            this.i = -1;
        } else if (actionMasked == 2) {
            int i = this.i;
            if (i == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i)) < 0) {
                return false;
            }
            float x = motionEvent.getX(iFindPointerIndex);
            if (o(1) && p(1)) {
                z = true;
            }
            if ((z || !p(1)) && (!z || x <= this.f)) {
                if (this.f - x > this.c && !this.h) {
                    this.h = true;
                    j(1);
                    this.g = x;
                }
            } else if (x - this.f > this.c && !this.h) {
                this.h = true;
                j(1);
                this.g = x;
            }
        } else if (actionMasked == 3) {
            this.h = false;
            this.i = -1;
        } else if (actionMasked == 6) {
            B(motionEvent);
        }
        return this.h;
    }

    public final boolean w(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (p(1) || o(1)) {
            return o(1) ? A(motionEvent, actionMasked, 1) : y(motionEvent, actionMasked, 1);
        }
        return z(motionEvent, actionMasked, 1);
    }

    public final void x(int i, int[] iArr, int i2) {
        boolean z = this.w == 2;
        int i3 = z ? 2 : 1;
        int iAbs = Math.abs(z ? getScrollY() : getScrollX());
        float f = 0.0f;
        if (i2 == 0) {
            if (i > 0) {
                float f2 = this.u;
                if (f2 > 0.0f) {
                    float f3 = i;
                    if (f3 > f2) {
                        f((int) f2, iArr, i3);
                        this.u = 0.0f;
                    } else {
                        this.u = f2 - f3;
                        f(i, iArr, i3);
                    }
                    j(1);
                    q(t(this.u, i3), i3);
                    return;
                }
            }
            if (i < 0) {
                float f4 = this.v;
                if ((-f4) < 0.0f) {
                    float f5 = i;
                    if (f5 < (-f4)) {
                        f((int) f4, iArr, i3);
                        this.v = 0.0f;
                    } else {
                        this.v = f4 + f5;
                        f(i, iArr, i3);
                    }
                    j(1);
                    q(-t(this.v, i3), i3);
                    return;
                }
                return;
            }
            return;
        }
        float f6 = i3 == 2 ? this.F : this.E;
        if (i > 0) {
            float f7 = this.u;
            if (f7 > 0.0f) {
                if (f6 <= 2000.0f) {
                    if (!this.G) {
                        this.G = true;
                        G(f6, i3, false);
                    }
                    if (this.A.a()) {
                        scrollTo(this.A.c(), this.A.d());
                        this.u = u(iAbs, Math.abs(s(i3)), i3);
                    } else {
                        this.u = 0.0f;
                    }
                    f(i, iArr, i3);
                    return;
                }
                float fT = t(f7, i3);
                float f8 = i;
                if (f8 > fT) {
                    f((int) fT, iArr, i3);
                    this.u = 0.0f;
                } else {
                    f(i, iArr, i3);
                    f = fT - f8;
                    this.u = u(f, Math.signum(f) * Math.abs(s(i3)), i3);
                }
                q(f, i3);
                j(1);
                return;
            }
        }
        if (i < 0) {
            float f9 = this.v;
            if ((-f9) < 0.0f) {
                if (f6 >= -2000.0f) {
                    if (!this.G) {
                        this.G = true;
                        G(f6, i3, false);
                    }
                    if (this.A.a()) {
                        scrollTo(this.A.c(), this.A.d());
                        this.v = u(iAbs, Math.abs(s(i3)), i3);
                    } else {
                        this.v = 0.0f;
                    }
                    f(i, iArr, i3);
                    return;
                }
                float fT2 = t(f9, i3);
                float f10 = i;
                if (f10 < (-fT2)) {
                    f((int) fT2, iArr, i3);
                    this.v = 0.0f;
                } else {
                    f(i, iArr, i3);
                    f = fT2 + f10;
                    this.v = u(f, Math.signum(f) * Math.abs(s(i3)), i3);
                }
                j(1);
                q(-f, i3);
                return;
            }
        }
        if (i != 0) {
            if ((this.v == 0.0f || this.u == 0.0f) && this.G && getScrollY() == 0) {
                f(i, iArr, i3);
            }
        }
    }

    public final boolean y(MotionEvent motionEvent, int i, int i2) {
        float fSignum;
        float fT;
        int actionIndex;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.i);
                    if (iFindPointerIndex < 0) {
                        return false;
                    }
                    if (this.h) {
                        if (i2 == 2) {
                            float y = motionEvent.getY(iFindPointerIndex);
                            fSignum = Math.signum(y - this.e);
                            fT = t(y - this.e, i2);
                        } else {
                            float x = motionEvent.getX(iFindPointerIndex);
                            fSignum = Math.signum(x - this.g);
                            fT = t(x - this.g, i2);
                        }
                        float f = fSignum * fT;
                        if (f <= 0.0f) {
                            q(0.0f, i2);
                            return false;
                        }
                        E(true);
                        q(f, i2);
                    }
                } else if (i != 3) {
                    if (i == 5) {
                        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.i);
                        if (iFindPointerIndex2 < 0) {
                            return false;
                        }
                        if (i2 == 2) {
                            float y2 = motionEvent.getY(iFindPointerIndex2) - this.d;
                            actionIndex = motionEvent.getActionIndex();
                            if (actionIndex < 0) {
                                return false;
                            }
                            float y3 = motionEvent.getY(actionIndex) - y2;
                            this.d = y3;
                            this.e = y3;
                        } else {
                            float x2 = motionEvent.getX(iFindPointerIndex2) - this.f;
                            actionIndex = motionEvent.getActionIndex();
                            if (actionIndex < 0) {
                                return false;
                            }
                            float x3 = motionEvent.getX(actionIndex) - x2;
                            this.f = x3;
                            this.g = x3;
                        }
                        this.i = motionEvent.getPointerId(actionIndex);
                    } else if (i == 6) {
                        B(motionEvent);
                    }
                }
            }
            if (motionEvent.findPointerIndex(this.i) < 0) {
                return false;
            }
            if (this.h) {
                this.h = false;
                H(i2);
            }
            this.i = -1;
            return false;
        }
        this.i = motionEvent.getPointerId(0);
        d(i2);
        return true;
    }

    public final boolean z(MotionEvent motionEvent, int i, int i2) {
        float fSignum;
        float fT;
        int actionIndex;
        if (i == 0) {
            this.i = motionEvent.getPointerId(0);
            d(i2);
        } else {
            if (i == 1) {
                if (motionEvent.findPointerIndex(this.i) < 0) {
                    return false;
                }
                if (this.h) {
                    this.h = false;
                    H(i2);
                }
                this.i = -1;
                return false;
            }
            if (i == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.i);
                if (iFindPointerIndex < 0) {
                    return false;
                }
                if (this.h) {
                    if (i2 == 2) {
                        float y = motionEvent.getY(iFindPointerIndex);
                        fSignum = Math.signum(y - this.e);
                        fT = t(y - this.e, i2);
                    } else {
                        float x = motionEvent.getX(iFindPointerIndex);
                        fSignum = Math.signum(x - this.g);
                        fT = t(x - this.g, i2);
                    }
                    float f = fSignum * fT;
                    E(true);
                    q(f, i2);
                }
            } else {
                if (i == 3) {
                    return false;
                }
                if (i == 5) {
                    int iFindPointerIndex2 = motionEvent.findPointerIndex(this.i);
                    if (iFindPointerIndex2 < 0) {
                        return false;
                    }
                    if (i2 == 2) {
                        float y2 = motionEvent.getY(iFindPointerIndex2) - this.d;
                        actionIndex = motionEvent.getActionIndex();
                        if (actionIndex < 0) {
                            return false;
                        }
                        float y3 = motionEvent.getY(actionIndex) - y2;
                        this.d = y3;
                        this.e = y3;
                    } else {
                        float x2 = motionEvent.getX(iFindPointerIndex2) - this.f;
                        actionIndex = motionEvent.getActionIndex();
                        if (actionIndex < 0) {
                            return false;
                        }
                        float x3 = motionEvent.getX(actionIndex) - x2;
                        this.f = x3;
                        this.g = x3;
                    }
                    this.i = motionEvent.getPointerId(actionIndex);
                } else if (i == 6) {
                    B(motionEvent);
                }
            }
        }
        return true;
    }

    public SpringBackLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = -1;
        this.j = 0;
        this.m = new int[2];
        this.n = new int[2];
        this.o = new int[2];
        this.K = new ArrayList();
        this.M = 0;
        this.f26891k = new hjg(this);
        this.l = djg.t(this);
        this.c = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r5j.n);
        this.f26890b = typedArrayObtainStyledAttributes.getResourceId(r5j.p, -1);
        this.y = typedArrayObtainStyledAttributes.getInt(r5j.o, 2);
        this.z = typedArrayObtainStyledAttributes.getInt(r5j.q, 3);
        typedArrayObtainStyledAttributes.recycle();
        this.A = new x7o();
        this.B = new s7o(this, this.y);
        setNestedScrollingEnabled(true);
        Point pointF = tc8.f(context);
        this.C = pointF.x;
        this.D = pointF.y;
        boolean z = b63.f3842a;
        this.p = z;
        if (z) {
            this.H = false;
        } else {
            this.H = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f26891k.b(view, view2, i);
        startNestedScroll(i & 2);
    }

    @Override // defpackage.fjg
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, i5, this.o);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.o);
    }
}
