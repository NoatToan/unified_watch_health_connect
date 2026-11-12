package miuix.nestedheader.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import defpackage.bjg;
import defpackage.djg;
import defpackage.ejg;
import defpackage.gjg;
import defpackage.hjg;
import defpackage.hsq;
import defpackage.k5j;
import defpackage.whl;
import defpackage.yig;
import defpackage.zig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class NestedScrollingLayout extends FrameLayout implements gjg, bjg, zig, yig {
    public long A;
    public long B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public hsq I;
    public List<b> J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f26694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f26695b;
    public boolean c;
    public Boolean d;
    public boolean e;
    public int f;
    public View g;
    public int h;
    public int i;
    public final int[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f26696k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;
    public float p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f26697r;
    public int s;
    public int t;
    public final hjg u;
    public final ejg v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public class a implements hsq {
        public a() {
        }

        @Override // defpackage.hsq
        public void a(int i, int i2, boolean z) {
        }

        @Override // defpackage.hsq
        public void onScrollChange(View view, int i, int i2, int i3, int i4) {
            NestedScrollingLayout nestedScrollingLayout = NestedScrollingLayout.this;
            if (nestedScrollingLayout.o) {
                NestedScrollingLayout.c(nestedScrollingLayout, i2 - i4);
                if (NestedScrollingLayout.this.f26696k < NestedScrollingLayout.this.m || NestedScrollingLayout.this.q < 0) {
                    return;
                }
                NestedScrollingLayout nestedScrollingLayout2 = NestedScrollingLayout.this;
                nestedScrollingLayout2.f26697r = nestedScrollingLayout2.v(nestedScrollingLayout2.q);
                NestedScrollingLayout.this.l();
            }
        }
    }

    public interface b {
        void a(int i);

        void b(int i);

        void c(int i);
    }

    public NestedScrollingLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ int c(NestedScrollingLayout nestedScrollingLayout, int i) {
        int i2 = nestedScrollingLayout.q - i;
        nestedScrollingLayout.q = i2;
        return i2;
    }

    private float u(float f, int i) {
        double dMin = Math.min(f, 1.0f);
        return ((float) (((Math.pow(dMin, 3.0d) / 3.0d) - Math.pow(dMin, 2.0d)) + dMin)) * i;
    }

    public void A(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        if (i > i2) {
            i = i2;
        }
        this.l = i;
        this.m = i2;
        this.D = z;
        this.F = z2;
        this.E = z3;
        if (this.f26696k < i) {
            this.f26696k = i;
        }
        if (this.f26696k > i2 && i2 >= 0) {
            this.f26696k = i2;
        }
        boolean z8 = z4 && this.z;
        if ((z8 || z5 || z7) && z) {
            if (this.z && this.n) {
                this.f26696k = getHeaderCloseProgress();
            } else {
                this.f26696k = 0;
            }
            this.z = false;
        } else if (z8 || z5) {
            this.f26696k = 0;
            this.z = false;
        }
        l();
    }

    public boolean B(int i, int i2) {
        return this.v.q(i, i2);
    }

    public void C(int i) {
        this.v.s(i);
    }

    public void D(boolean z) {
        if (!this.C && z) {
            this.A = SystemClock.elapsedRealtime();
        }
        this.C = z;
    }

    public void E(int i) {
        this.f26696k = i;
    }

    public void a(int i, int i2) {
        this.s = i;
        this.t = i2;
    }

    public void addOnScrollListener(b bVar) {
        this.J.add(bVar);
    }

    public boolean getAcceptedNestedFlingInConsumedProgress() {
        return this.w;
    }

    public int getHeaderCloseProgress() {
        return this.c ? this.l + this.h : this.l;
    }

    public int getHeaderProgressFrom() {
        return this.c ? this.l + this.h : this.l;
    }

    public int getHeaderProgressTo() {
        return this.c ? this.l + this.h : this.l;
    }

    public int getNestedScrollableValue() {
        return getScrollingFrom();
    }

    public int getScrollType() {
        return this.H;
    }

    public int getScrollableViewMaxHeightWithoutOverlay() {
        return getMeasuredHeight() < this.h ? getMeasuredHeight() : getMeasuredHeight() - this.h;
    }

    public int getScrollingFrom() {
        return this.l;
    }

    public int getScrollingProgress() {
        return this.f26696k;
    }

    public int getScrollingTo() {
        return this.m;
    }

    public int getStickyScrollToOnNested() {
        return this.l + this.h;
    }

    public boolean i(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.v.d(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.v.m();
    }

    public void j(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.v.e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public boolean k(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.v.g(i, i2, i3, i4, iArr, i5);
    }

    public final void l() {
        w(this.f26696k);
    }

    public final void m(int i, int i2, int[] iArr) {
        if (this.f26696k >= getHeaderCloseProgress() && i2 > iArr[1]) {
            int iMax = Math.max(getHeaderCloseProgress(), this.f26696k - i2);
            int i3 = this.f26696k - iMax;
            this.f26696k = iMax;
            l();
            iArr[1] = iArr[1] + i3;
        }
    }

    public final void n(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        if (i(i - iArr[0], i2 - iArr[1], iArr2, null, i3)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public final void o(int i, int i2, int[] iArr) {
        if (i2 > iArr[1]) {
            int iMax = Math.max(getScrollingFrom(), Math.min(this.m, this.f26696k - i2));
            int i3 = this.f26696k - iMax;
            this.f26696k = iMax;
            l();
            iArr[1] = iArr[1] + i3;
        }
    }

    @Override // defpackage.yig
    public void onContentInsetChanged(Rect rect) {
        int i = this.h;
        int i2 = rect.top;
        if (i == i2 && this.i == rect.bottom) {
            return;
        }
        this.h = Math.max(0, i2);
        this.i = Math.max(0, rect.bottom);
        requestLayout();
    }

    @Override // android.view.View
    @RequiresApi(api = 21)
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(this.f);
        this.g = viewFindViewById;
        if (viewFindViewById == null) {
            throw new IllegalArgumentException("The scrollableView attribute is required and must refer to a valid child.");
        }
        if (viewFindViewById instanceof whl) {
            a aVar = new a();
            this.I = aVar;
            ((whl) this.g).addOnScrollChangeListener(aVar);
        } else {
            this.o = false;
        }
        this.g.setNestedScrollingEnabled(true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        x(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.g.getLayoutParams().height == -1) {
            if (this.c) {
                if (getClipToPadding()) {
                    return;
                }
                this.g.measure(View.MeasureSpec.makeMeasureSpec(this.g.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            }
            this.g.measure(View.MeasureSpec.makeMeasureSpec(this.g.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getScrollableViewMaxHeightWithoutOverlay(), 1073741824));
            StringBuilder sb = new StringBuilder();
            sb.append("onMeasure in NoOverlayMode mScrollableView ");
            sb.append(this.g.getMeasuredHeight());
            sb.append(" viewHeight ");
            sb.append(getMeasuredHeight());
        }
    }

    @Override // defpackage.fjg
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 != 0) {
            if (!this.w) {
                this.B = SystemClock.elapsedRealtime();
            }
            this.w = true;
        } else {
            this.x = true;
        }
        p(i, i2, iArr);
        if (this.G) {
            m(i, i2, iArr);
        }
        n(i, i2, iArr, this.j, i3);
        o(i, i2, iArr);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    @Override // defpackage.fjg
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        onNestedScrollAccepted(view, view2, i);
        if (i2 != 0) {
            this.y = true;
        } else {
            this.y = false;
        }
    }

    @Override // defpackage.fjg
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        y(i2);
        return this.v.q(i, i2) || onStartNestedScroll(view, view, i);
    }

    @Override // defpackage.fjg
    public void onStopNestedScroll(View view, int i) {
        this.u.e(view, i);
        z(i);
        C(i);
        if (this.x) {
            this.x = false;
            if (this.w || this.y) {
                return;
            }
        } else if (this.w) {
            this.w = false;
        }
        t(i);
    }

    public final void p(int i, int i2, int[] iArr) {
        if (i2 > iArr[1]) {
            int iMax = Math.max(0, Math.min(this.m, this.f26696k - i2));
            int i3 = this.f26696k;
            int i4 = i3 - iMax;
            if (i3 == iMax || i3 < 0) {
                return;
            }
            this.f26696k = iMax;
            l();
            iArr[1] = iArr[1] + i4;
        }
    }

    public final void q(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        int i6;
        boolean z;
        int i7;
        if (i2 >= 0 || i4 == 0) {
            return;
        }
        int i8 = this.f26696k;
        int i9 = i8 - i4;
        boolean z2 = i5 == 0;
        int i10 = this.l;
        boolean z3 = i9 > i10;
        boolean z4 = this.F;
        boolean z5 = z4 && !this.D && !z2 && z3 && i8 == i10;
        boolean z6 = z4 && !this.D && !z2 && i8 >= (i7 = this.m) && i9 >= i7;
        boolean z7 = z4 && !z2 && this.D && ((!(z = this.C) && i9 < 0) || (z && this.A <= this.B));
        if (z2 || !z4 || z6 || z7) {
            i6 = this.m;
        } else {
            i6 = z5 ? i10 : 0;
        }
        if (this.e) {
            i6 = this.m;
        }
        int iMax = Math.max(i10, Math.min(i6, i9));
        int i11 = this.f26696k - iMax;
        this.f26696k = iMax;
        l();
        iArr[0] = iArr[0];
        iArr[1] = iArr[1] + i11;
    }

    public final void r(int i, int i2, int[] iArr, int i3) {
        if (i2 >= 0 || this.f26696k >= getHeaderProgressTo()) {
            return;
        }
        int iMax = Math.max(this.l, Math.min(getHeaderProgressTo(), this.f26696k - i2));
        int i4 = this.f26696k - iMax;
        this.f26696k = iMax;
        l();
        iArr[1] = iArr[1] + i4;
    }

    public void removeOnScrollListener(b bVar) {
        this.J.remove(bVar);
    }

    public final void s(int i, int i2, int[] iArr, int i3) {
        if (i2 >= 0 || this.f26696k >= getStickyScrollToOnNested() || !this.c) {
            return;
        }
        int iMax = Math.max(this.l, Math.min(getStickyScrollToOnNested(), this.f26696k - i2));
        int i4 = this.f26696k - iMax;
        this.f26696k = iMax;
        l();
        iArr[1] = iArr[1] + i4;
    }

    public void setEnableOverScrollTo(boolean z) {
        if (this.g instanceof whl) {
            this.o = z;
        }
    }

    public void setHeaderCloseOnInit(boolean z) {
        this.n = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.v.n(z);
    }

    public void setOverScrollToRatio(float f) {
        this.p = f;
    }

    public void setScrollType(int i) {
        this.H = i;
    }

    public void setSelfScrollFirst(boolean z) {
        this.G = z;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.v.p(i);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.v.r();
    }

    public final void t(int i) {
        Iterator<b> it = this.J.iterator();
        while (it.hasNext()) {
            it.next().a(i);
        }
    }

    public final int v(int i) {
        int measuredHeight = getMeasuredHeight();
        return (int) (u(Math.min((Math.abs(i) * 1.0f) / measuredHeight, 1.0f), measuredHeight) * this.p);
    }

    public void w(int i) {
    }

    public void x(boolean z, int i, int i2, int i3, int i4) {
        l();
    }

    public final void y(int i) {
        Iterator<b> it = this.J.iterator();
        while (it.hasNext()) {
            it.next().b(i);
        }
    }

    public final void z(int i) {
        Iterator<b> it = this.J.iterator();
        while (it.hasNext()) {
            it.next().c(i);
        }
    }

    public NestedScrollingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // defpackage.fjg
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.f26694a);
    }

    public NestedScrollingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26694a = new int[2];
        this.f26695b = new int[2];
        this.d = null;
        this.j = new int[2];
        this.q = 0;
        this.f26697r = 0;
        this.s = 0;
        this.t = 0;
        this.z = true;
        this.A = 0L;
        this.B = 0L;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.I = null;
        this.J = new ArrayList();
        this.u = new hjg(this);
        this.v = djg.t(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k5j.y);
        this.f = typedArrayObtainStyledAttributes.getResourceId(k5j.D, R.id.list);
        this.G = typedArrayObtainStyledAttributes.getBoolean(k5j.E, true);
        this.n = typedArrayObtainStyledAttributes.getBoolean(k5j.z, false);
        this.o = typedArrayObtainStyledAttributes.getBoolean(k5j.A, false);
        this.p = typedArrayObtainStyledAttributes.getFloat(k5j.B, 0.5f);
        this.H = typedArrayObtainStyledAttributes.getInt(k5j.C, 0);
        typedArrayObtainStyledAttributes.recycle();
        setNestedScrollingEnabled(true);
    }

    @Override // defpackage.gjg
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (!this.G && !this.e) {
            r(i3, i4, iArr, i5);
        }
        if (this.E) {
            s(i3, i4, iArr, i5);
        }
        int i6 = iArr[0];
        int i7 = iArr[1];
        j(i6, i7, i3 - i6, i4 - i7, this.f26695b, i5, iArr);
        q(i3, i4, i3, i4 - iArr[1], iArr, i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return this.v.p(i) || (isEnabled() && ((i & 2) != 0));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.u.b(view, view2, i);
        startNestedScroll(i & 2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }
}
