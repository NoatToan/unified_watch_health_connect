package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.a0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f[] f10348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f10349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f10350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f10353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10354h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10355i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BitSet f10356j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10357k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10358l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f10359m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f10360n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f10361o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f10362p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public e f10363q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f10364r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f10365t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f10366v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int[] f10367w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a f10368x;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.a();
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f10372c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f10373d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f10374e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int[] f10375f;

        public b() {
            a();
        }

        public final void a() {
            this.f10370a = -1;
            this.f10371b = Integer.MIN_VALUE;
            this.f10372c = false;
            this.f10373d = false;
            this.f10374e = false;
            int[] iArr = this.f10375f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<View> f10394a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10395b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10396c = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f10397d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f10398e;

        public f(int i14) {
            this.f10398e = i14;
        }

        public final void a() {
            View view2 = (View) am.j.f(1, this.f10394a);
            c cVar = (c) view2.getLayoutParams();
            this.f10396c = StaggeredGridLayoutManager.this.f10349c.b(view2);
            cVar.getClass();
        }

        public final void b() {
            this.f10394a.clear();
            this.f10395b = Integer.MIN_VALUE;
            this.f10396c = Integer.MIN_VALUE;
            this.f10397d = 0;
        }

        public final int c() {
            boolean z14 = StaggeredGridLayoutManager.this.f10354h;
            ArrayList<View> arrayList = this.f10394a;
            return z14 ? e(arrayList.size() - 1, -1, false, false, true) : e(0, arrayList.size(), false, false, true);
        }

        public final int d() {
            boolean z14 = StaggeredGridLayoutManager.this.f10354h;
            ArrayList<View> arrayList = this.f10394a;
            return z14 ? e(0, arrayList.size(), false, false, true) : e(arrayList.size() - 1, -1, false, false, true);
        }

        public final int e(int i14, int i15, boolean z14, boolean z15, boolean z16) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int iK = staggeredGridLayoutManager.f10349c.k();
            int iG = staggeredGridLayoutManager.f10349c.g();
            int i16 = i15 > i14 ? 1 : -1;
            while (i14 != i15) {
                View view2 = this.f10394a.get(i14);
                int iE = staggeredGridLayoutManager.f10349c.e(view2);
                int iB = staggeredGridLayoutManager.f10349c.b(view2);
                boolean z17 = false;
                boolean z18 = !z16 ? iE >= iG : iE > iG;
                if (!z16 ? iB > iK : iB >= iK) {
                    z17 = true;
                }
                if (z18 && z17) {
                    if (z14 && z15) {
                        if (iE >= iK && iB <= iG) {
                            return staggeredGridLayoutManager.getPosition(view2);
                        }
                    } else {
                        if (z15) {
                            return staggeredGridLayoutManager.getPosition(view2);
                        }
                        if (iE < iK || iB > iG) {
                            return staggeredGridLayoutManager.getPosition(view2);
                        }
                    }
                }
                i14 += i16;
            }
            return -1;
        }

        public final int f(int i14) {
            int i15 = this.f10396c;
            if (i15 != Integer.MIN_VALUE) {
                return i15;
            }
            if (this.f10394a.size() == 0) {
                return i14;
            }
            a();
            return this.f10396c;
        }

        public final View g(int i14, int i15) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            View view2 = null;
            ArrayList<View> arrayList = this.f10394a;
            if (i15 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view3 = arrayList.get(size);
                    if ((staggeredGridLayoutManager.f10354h && staggeredGridLayoutManager.getPosition(view3) >= i14) || ((!staggeredGridLayoutManager.f10354h && staggeredGridLayoutManager.getPosition(view3) <= i14) || !view3.hasFocusable())) {
                        break;
                    }
                    size--;
                    view2 = view3;
                }
                return view2;
            }
            int size2 = arrayList.size();
            int i16 = 0;
            while (i16 < size2) {
                View view4 = arrayList.get(i16);
                if ((staggeredGridLayoutManager.f10354h && staggeredGridLayoutManager.getPosition(view4) <= i14) || ((!staggeredGridLayoutManager.f10354h && staggeredGridLayoutManager.getPosition(view4) >= i14) || !view4.hasFocusable())) {
                    break;
                }
                i16++;
                view2 = view4;
            }
            return view2;
        }

        public final int h(int i14) {
            int i15 = this.f10395b;
            if (i15 != Integer.MIN_VALUE) {
                return i15;
            }
            ArrayList<View> arrayList = this.f10394a;
            if (arrayList.size() == 0) {
                return i14;
            }
            View view2 = arrayList.get(0);
            c cVar = (c) view2.getLayoutParams();
            this.f10395b = StaggeredGridLayoutManager.this.f10349c.e(view2);
            cVar.getClass();
            return this.f10395b;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i14, int i15) {
        this.f10347a = -1;
        this.f10354h = false;
        this.f10355i = false;
        this.f10357k = -1;
        this.f10358l = Integer.MIN_VALUE;
        this.f10359m = new d();
        this.f10360n = 2;
        this.f10364r = new Rect();
        this.f10365t = new b();
        this.f10366v = true;
        this.f10368x = new a();
        RecyclerView.p.d properties = RecyclerView.p.getProperties(context, attributeSet, i14, i15);
        int i16 = properties.f10325a;
        if (i16 != 0 && i16 != 1) {
            vb.h.s("invalid orientation.");
            throw null;
        }
        assertNotInLayoutOrScroll(null);
        if (i16 != this.f10351e) {
            this.f10351e = i16;
            d0 d0Var = this.f10349c;
            this.f10349c = this.f10350d;
            this.f10350d = d0Var;
            requestLayout();
        }
        u(properties.f10326b);
        boolean z14 = properties.f10327c;
        assertNotInLayoutOrScroll(null);
        e eVar = this.f10363q;
        if (eVar != null && eVar.f10391h != z14) {
            eVar.f10391h = z14;
        }
        this.f10354h = z14;
        requestLayout();
        this.f10353g = new v();
        this.f10349c = d0.a(this, this.f10351e);
        this.f10350d = d0.a(this, 1 - this.f10351e);
    }

    public static int x(int i14, int i15, int i16) {
        int mode;
        return (!(i15 == 0 && i16 == 0) && ((mode = View.MeasureSpec.getMode(i14)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i14) - i15) - i16), mode) : i14;
    }

    public final boolean a() {
        int iG;
        if (getChildCount() != 0 && this.f10360n != 0 && isAttachedToWindow()) {
            if (this.f10355i) {
                iG = h();
                g();
            } else {
                iG = g();
                h();
            }
            if (iG == 0 && l() != null) {
                this.f10359m.a();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.f10363q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean, int] */
    public final int b(RecyclerView.w wVar, v vVar, RecyclerView.b0 b0Var) {
        f fVar;
        ?? r14;
        int iH;
        int iC;
        int iK;
        int iC2;
        int i14;
        int i15;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        int i16 = 0;
        int i17 = 1;
        staggeredGridLayoutManager.f10356j.set(0, staggeredGridLayoutManager.f10347a, true);
        v vVar2 = staggeredGridLayoutManager.f10353g;
        int i18 = vVar2.f10697i ? vVar.f10693e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : vVar.f10693e == 1 ? vVar.f10695g + vVar.f10690b : vVar.f10694f - vVar.f10690b;
        int i19 = vVar.f10693e;
        for (int i24 = 0; i24 < staggeredGridLayoutManager.f10347a; i24++) {
            if (!staggeredGridLayoutManager.f10348b[i24].f10394a.isEmpty()) {
                staggeredGridLayoutManager.w(staggeredGridLayoutManager.f10348b[i24], i19, i18);
            }
        }
        boolean z14 = staggeredGridLayoutManager.f10355i;
        d0 d0Var = staggeredGridLayoutManager.f10349c;
        int iG = z14 ? d0Var.g() : d0Var.k();
        boolean z15 = false;
        while (true) {
            int i25 = vVar.f10691c;
            int i26 = -1;
            if (i25 < 0 || i25 >= b0Var.b() || (!vVar2.f10697i && staggeredGridLayoutManager.f10356j.isEmpty())) {
                break;
            }
            View viewE = wVar.e(vVar.f10691c);
            vVar.f10691c += vVar.f10692d;
            c cVar = (c) viewE.getLayoutParams();
            int viewLayoutPosition = cVar.getViewLayoutPosition();
            d dVar = staggeredGridLayoutManager.f10359m;
            int[] iArr = dVar.f10378a;
            int i27 = (iArr == null || viewLayoutPosition >= iArr.length) ? -1 : iArr[viewLayoutPosition];
            if (i27 == -1) {
                boolean zO = staggeredGridLayoutManager.o(vVar.f10693e);
                int i28 = staggeredGridLayoutManager.f10347a;
                if (zO) {
                    i15 = i28 - 1;
                    i14 = -1;
                } else {
                    i14 = i17;
                    i26 = i28;
                    i15 = i16;
                }
                int i29 = vVar.f10693e;
                f fVar2 = null;
                d0 d0Var2 = staggeredGridLayoutManager.f10349c;
                if (i29 == i17) {
                    int iK2 = d0Var2.k();
                    int i30 = Integer.MAX_VALUE;
                    while (i15 != i26) {
                        f fVar3 = staggeredGridLayoutManager.f10348b[i15];
                        int i34 = i14;
                        int iF = fVar3.f(iK2);
                        if (iF < i30) {
                            fVar2 = fVar3;
                            i30 = iF;
                        }
                        i15 += i34;
                        i14 = i34;
                    }
                } else {
                    int i35 = i14;
                    int iG2 = d0Var2.g();
                    int i36 = Integer.MIN_VALUE;
                    while (i15 != i26) {
                        f fVar4 = staggeredGridLayoutManager.f10348b[i15];
                        int iH2 = fVar4.h(iG2);
                        if (iH2 > i36) {
                            fVar2 = fVar4;
                            i36 = iH2;
                        }
                        i15 += i35;
                    }
                }
                fVar = fVar2;
                dVar.b(viewLayoutPosition);
                dVar.f10378a[viewLayoutPosition] = fVar.f10398e;
            } else {
                fVar = staggeredGridLayoutManager.f10348b[i27];
            }
            f fVar5 = fVar;
            cVar.f10377a = fVar5;
            if (vVar.f10693e == 1) {
                staggeredGridLayoutManager.addView(viewE);
                r14 = 0;
            } else {
                r14 = 0;
                staggeredGridLayoutManager.addView(viewE, 0);
            }
            if (staggeredGridLayoutManager.f10351e == 1) {
                staggeredGridLayoutManager.m(viewE, RecyclerView.p.getChildMeasureSpec(staggeredGridLayoutManager.f10352f, staggeredGridLayoutManager.getWidthMode(), r14, ((ViewGroup.MarginLayoutParams) cVar).width, r14), RecyclerView.p.getChildMeasureSpec(staggeredGridLayoutManager.getHeight(), staggeredGridLayoutManager.getHeightMode(), staggeredGridLayoutManager.getPaddingBottom() + staggeredGridLayoutManager.getPaddingTop(), ((ViewGroup.MarginLayoutParams) cVar).height, true));
            } else {
                staggeredGridLayoutManager.m(viewE, RecyclerView.p.getChildMeasureSpec(staggeredGridLayoutManager.getWidth(), staggeredGridLayoutManager.getWidthMode(), staggeredGridLayoutManager.getPaddingRight() + staggeredGridLayoutManager.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.p.getChildMeasureSpec(staggeredGridLayoutManager.f10352f, staggeredGridLayoutManager.getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false));
            }
            if (vVar.f10693e == 1) {
                iC = fVar5.f(iG);
                iH = staggeredGridLayoutManager.f10349c.c(viewE) + iC;
            } else {
                iH = fVar5.h(iG);
                iC = iH - staggeredGridLayoutManager.f10349c.c(viewE);
            }
            int i37 = vVar.f10693e;
            f fVar6 = cVar.f10377a;
            if (i37 == 1) {
                fVar6.getClass();
                c cVar2 = (c) viewE.getLayoutParams();
                cVar2.f10377a = fVar6;
                ArrayList<View> arrayList = fVar6.f10394a;
                arrayList.add(viewE);
                fVar6.f10396c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    fVar6.f10395b = Integer.MIN_VALUE;
                }
                if (cVar2.isItemRemoved() || cVar2.isItemChanged()) {
                    fVar6.f10397d = StaggeredGridLayoutManager.this.f10349c.c(viewE) + fVar6.f10397d;
                }
            } else {
                fVar6.getClass();
                c cVar3 = (c) viewE.getLayoutParams();
                cVar3.f10377a = fVar6;
                ArrayList<View> arrayList2 = fVar6.f10394a;
                arrayList2.add(0, viewE);
                fVar6.f10395b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    fVar6.f10396c = Integer.MIN_VALUE;
                }
                if (cVar3.isItemRemoved() || cVar3.isItemChanged()) {
                    fVar6.f10397d = StaggeredGridLayoutManager.this.f10349c.c(viewE) + fVar6.f10397d;
                }
            }
            if (staggeredGridLayoutManager.isLayoutRTL() && staggeredGridLayoutManager.f10351e == 1) {
                iC2 = staggeredGridLayoutManager.f10350d.g() - (((staggeredGridLayoutManager.f10347a - 1) - fVar5.f10398e) * staggeredGridLayoutManager.f10352f);
                iK = iC2 - staggeredGridLayoutManager.f10350d.c(viewE);
            } else {
                iK = staggeredGridLayoutManager.f10350d.k() + (fVar5.f10398e * staggeredGridLayoutManager.f10352f);
                iC2 = staggeredGridLayoutManager.f10350d.c(viewE) + iK;
            }
            int i38 = iK;
            int i39 = iC2;
            if (staggeredGridLayoutManager.f10351e == 1) {
                staggeredGridLayoutManager.layoutDecoratedWithMargins(viewE, i38, iC, i39, iH);
                staggeredGridLayoutManager = this;
            } else {
                staggeredGridLayoutManager.layoutDecoratedWithMargins(viewE, iC, i38, iH, i39);
            }
            staggeredGridLayoutManager.w(fVar5, vVar2.f10693e, i18);
            staggeredGridLayoutManager.q(wVar, vVar2);
            if (vVar2.f10696h && viewE.hasFocusable()) {
                staggeredGridLayoutManager.f10356j.set(fVar5.f10398e, false);
            }
            z15 = true;
            i17 = 1;
            i16 = 0;
        }
        if (!z15) {
            staggeredGridLayoutManager.q(wVar, vVar2);
        }
        int i44 = vVar2.f10693e;
        d0 d0Var3 = staggeredGridLayoutManager.f10349c;
        int iK3 = i44 == -1 ? staggeredGridLayoutManager.f10349c.k() - staggeredGridLayoutManager.j(d0Var3.k()) : staggeredGridLayoutManager.i(d0Var3.g()) - staggeredGridLayoutManager.f10349c.g();
        if (iK3 > 0) {
            return Math.min(vVar.f10690b, iK3);
        }
        return 0;
    }

    public final View c(boolean z14) {
        int iK = this.f10349c.k();
        int iG = this.f10349c.g();
        View view2 = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iE = this.f10349c.e(childAt);
            int iB = this.f10349c.b(childAt);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z14) {
                    return childAt;
                }
                if (view2 == null) {
                    view2 = childAt;
                }
            }
        }
        return view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean canScrollHorizontally() {
        return this.f10351e == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean canScrollVertically() {
        return this.f10351e == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean checkLayoutParams(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void collectAdjacentPrefetchPositions(int i14, int i15, RecyclerView.b0 b0Var, RecyclerView.p.c cVar) {
        v vVar;
        int iF;
        int iH;
        if (this.f10351e != 0) {
            i14 = i15;
        }
        if (getChildCount() == 0 || i14 == 0) {
            return;
        }
        p(i14, b0Var);
        int[] iArr = this.f10367w;
        if (iArr == null || iArr.length < this.f10347a) {
            this.f10367w = new int[this.f10347a];
        }
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int i18 = this.f10347a;
            vVar = this.f10353g;
            if (i16 >= i18) {
                break;
            }
            if (vVar.f10692d == -1) {
                iF = vVar.f10694f;
                iH = this.f10348b[i16].h(iF);
            } else {
                iF = this.f10348b[i16].f(vVar.f10695g);
                iH = vVar.f10695g;
            }
            int i19 = iF - iH;
            if (i19 >= 0) {
                this.f10367w[i17] = i19;
                i17++;
            }
            i16++;
        }
        Arrays.sort(this.f10367w, 0, i17);
        for (int i24 = 0; i24 < i17; i24++) {
            int i25 = vVar.f10691c;
            if (i25 < 0 || i25 >= b0Var.b()) {
                return;
            }
            ((r.b) cVar).a(vVar.f10691c, this.f10367w[i24]);
            vVar.f10691c += vVar.f10692d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int computeHorizontalScrollExtent(RecyclerView.b0 b0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z14 = !this.f10366v;
        return g0.a(b0Var, this.f10349c, d(z14), c(z14), this, this.f10366v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int computeHorizontalScrollOffset(RecyclerView.b0 b0Var) {
        return computeScrollOffset(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int computeHorizontalScrollRange(RecyclerView.b0 b0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z14 = !this.f10366v;
        return g0.c(b0Var, this.f10349c, d(z14), c(z14), this, this.f10366v);
    }

    public final int computeScrollOffset(RecyclerView.b0 b0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z14 = !this.f10366v;
        return g0.b(b0Var, this.f10349c, d(z14), c(z14), this, this.f10366v, this.f10355i);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public final PointF computeScrollVectorForPosition(int i14) {
        int i15 = -1;
        if (getChildCount() != 0) {
            if ((i14 < g()) == this.f10355i) {
                i15 = 1;
            }
        } else if (this.f10355i) {
            i15 = 1;
        }
        PointF pointF = new PointF();
        if (i15 == 0) {
            return null;
        }
        if (this.f10351e == 0) {
            pointF.x = i15;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i15;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int computeVerticalScrollExtent(RecyclerView.b0 b0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z14 = !this.f10366v;
        return g0.a(b0Var, this.f10349c, d(z14), c(z14), this, this.f10366v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int computeVerticalScrollOffset(RecyclerView.b0 b0Var) {
        return computeScrollOffset(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int computeVerticalScrollRange(RecyclerView.b0 b0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z14 = !this.f10366v;
        return g0.c(b0Var, this.f10349c, d(z14), c(z14), this, this.f10366v);
    }

    public final View d(boolean z14) {
        int iK = this.f10349c.k();
        int iG = this.f10349c.g();
        int childCount = getChildCount();
        View view2 = null;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            int iE = this.f10349c.e(childAt);
            if (this.f10349c.b(childAt) > iK && iE < iG) {
                if (iE >= iK || !z14) {
                    return childAt;
                }
                if (view2 == null) {
                    view2 = childAt;
                }
            }
        }
        return view2;
    }

    public final void e(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z14) {
        int iG;
        int i14 = i(Integer.MIN_VALUE);
        if (i14 != Integer.MIN_VALUE && (iG = this.f10349c.g() - i14) > 0) {
            int i15 = iG - (-scrollBy(-iG, wVar, b0Var));
            if (!z14 || i15 <= 0) {
                return;
            }
            this.f10349c.p(i15);
        }
    }

    public final void f(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z14) {
        int iK;
        int iJ = j(Integer.MAX_VALUE);
        if (iJ != Integer.MAX_VALUE && (iK = iJ - this.f10349c.k()) > 0) {
            int iScrollBy = iK - scrollBy(iK, wVar, b0Var);
            if (!z14 || iScrollBy <= 0) {
                return;
            }
            this.f10349c.p(-iScrollBy);
        }
    }

    public final int g() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final RecyclerView.q generateDefaultLayoutParams() {
        return this.f10351e == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final RecyclerView.q generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public final int h() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    public final int i(int i14) {
        int iF = this.f10348b[0].f(i14);
        for (int i15 = 1; i15 < this.f10347a; i15++) {
            int iF2 = this.f10348b[i15].f(i14);
            if (iF2 > iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean isAutoMeasureEnabled() {
        return this.f10360n != 0;
    }

    public final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public final int j(int i14) {
        int iH = this.f10348b[0].h(i14);
        for (int i15 = 1; i15 < this.f10347a; i15++) {
            int iH2 = this.f10348b[i15].h(i14);
            if (iH2 < iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0030  */
    /* JADX WARN: Code duplicated, block: B:22:0x0032 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0035  */
    /* JADX WARN: Code duplicated, block: B:26:0x003d  */
    /* JADX WARN: Code duplicated, block: B:29:0x004a A[LOOP:0: B:25:0x003b->B:29:0x004a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x004d A[EDGE_INSN: B:30:0x004d->B:31:0x004e BREAK  A[LOOP:0: B:25:0x003b->B:29:0x004a]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0050  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b A[LOOP:1: B:34:0x005c->B:38:0x006b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x009b  */
    /* JADX WARN: Code duplicated, block: B:50:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:64:0x004d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x004e A[EDGE_INSN: B:65:0x004e->B:31:0x004e BREAK  A[LOOP:0: B:25:0x003b->B:29:0x004a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x006f A[EDGE_INSN: B:67:0x006f->B:40:0x006f BREAK  A[LOOP:1: B:34:0x005c->B:38:0x006b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public final void k(int i14, int i15, int i16) {
        int i17;
        int i18;
        d dVar;
        int[] iArr;
        int iH;
        ArrayList arrayList;
        d.a aVar;
        int size;
        int i19;
        int i24;
        int size2;
        int[] iArr2;
        int iH2 = this.f10355i ? h() : g();
        if (i16 == 8) {
            if (i14 < i15) {
                i17 = i15 + 1;
            } else {
                i17 = i14 + 1;
                i18 = i15;
            }
            dVar = this.f10359m;
            iArr = dVar.f10378a;
            if (iArr != null && i18 < iArr.length) {
                arrayList = dVar.f10379b;
                if (arrayList != null) {
                    if (arrayList == null) {
                        size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                aVar = null;
                                break;
                            }
                            aVar = (d.a) dVar.f10379b.get(size2);
                            if (aVar.f10380a == i18) {
                                break;
                            } else {
                                size2--;
                            }
                        }
                    } else {
                        aVar = null;
                        break;
                    }
                    if (aVar != null) {
                        dVar.f10379b.remove(aVar);
                    }
                    size = dVar.f10379b.size();
                    i19 = 0;
                    while (true) {
                        if (i19 < size) {
                            i19 = -1;
                            break;
                        } else if (((d.a) dVar.f10379b.get(i19)).f10380a >= i18) {
                            break;
                        } else {
                            i19++;
                        }
                    }
                    if (i19 != -1) {
                        d.a aVar2 = (d.a) dVar.f10379b.get(i19);
                        dVar.f10379b.remove(i19);
                        i24 = aVar2.f10380a;
                    } else {
                        i24 = -1;
                    }
                } else {
                    i24 = -1;
                }
                iArr2 = dVar.f10378a;
                if (i24 == -1) {
                    Arrays.fill(iArr2, i18, iArr2.length, -1);
                    int length = dVar.f10378a.length;
                } else {
                    Arrays.fill(dVar.f10378a, i18, Math.min(i24 + 1, iArr2.length), -1);
                }
            }
            if (i16 != 1) {
                dVar.c(i14, i15);
            } else if (i16 != 2) {
                dVar.d(i14, i15);
            } else if (i16 == 8) {
                dVar.d(i14, 1);
                dVar.c(i15, 1);
            }
            if (i17 <= iH2) {
                return;
            }
            if (this.f10355i) {
                iH = g();
            } else {
                iH = h();
            }
            if (i18 <= iH) {
                requestLayout();
            }
        }
        i17 = i14 + i15;
        i18 = i14;
        dVar = this.f10359m;
        iArr = dVar.f10378a;
        if (iArr != null) {
            arrayList = dVar.f10379b;
            if (arrayList != null) {
                if (arrayList == null) {
                    size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 >= 0) {
                            aVar = null;
                            break;
                        }
                        aVar = (d.a) dVar.f10379b.get(size2);
                        if (aVar.f10380a == i18) {
                            break;
                            break;
                        }
                        size2--;
                    }
                } else {
                    aVar = null;
                    break;
                }
                if (aVar != null) {
                    dVar.f10379b.remove(aVar);
                }
                size = dVar.f10379b.size();
                i19 = 0;
                while (true) {
                    if (i19 < size) {
                        i19 = -1;
                        break;
                    } else {
                        if (((d.a) dVar.f10379b.get(i19)).f10380a >= i18) {
                            break;
                            break;
                        }
                        i19++;
                    }
                }
                if (i19 != -1) {
                    d.a aVar3 = (d.a) dVar.f10379b.get(i19);
                    dVar.f10379b.remove(i19);
                    i24 = aVar3.f10380a;
                } else {
                    i24 = -1;
                }
            } else {
                i24 = -1;
            }
            iArr2 = dVar.f10378a;
            if (i24 == -1) {
                Arrays.fill(iArr2, i18, iArr2.length, -1);
                int length2 = dVar.f10378a.length;
            } else {
                Arrays.fill(dVar.f10378a, i18, Math.min(i24 + 1, iArr2.length), -1);
            }
        }
        if (i16 != 1) {
            dVar.c(i14, i15);
        } else if (i16 != 2) {
            dVar.d(i14, i15);
        } else if (i16 == 8) {
            dVar.d(i14, 1);
            dVar.c(i15, 1);
        }
        if (i17 <= iH2) {
            return;
        }
        if (this.f10355i) {
            iH = g();
        } else {
            iH = h();
        }
        if (i18 <= iH) {
            requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002c A[SYNTHETIC] */
    public final View l() {
        boolean z14;
        boolean z15;
        int childCount = getChildCount();
        int i14 = childCount - 1;
        BitSet bitSet = new BitSet(this.f10347a);
        bitSet.set(0, this.f10347a, true);
        byte b14 = (this.f10351e == 1 && isLayoutRTL()) ? (byte) 1 : (byte) -1;
        if (this.f10355i) {
            childCount = -1;
        } else {
            i14 = 0;
        }
        int i15 = i14 < childCount ? 1 : -1;
        while (i14 != childCount) {
            View childAt = getChildAt(i14);
            c cVar = (c) childAt.getLayoutParams();
            if (bitSet.get(cVar.f10377a.f10398e)) {
                f fVar = cVar.f10377a;
                if (this.f10355i) {
                    int i16 = fVar.f10396c;
                    if (i16 == Integer.MIN_VALUE) {
                        fVar.a();
                        i16 = fVar.f10396c;
                    }
                    if (i16 < this.f10349c.g()) {
                        ((c) ((View) am.j.f(1, fVar.f10394a)).getLayoutParams()).getClass();
                        return childAt;
                    }
                } else {
                    int i17 = fVar.f10395b;
                    ArrayList<View> arrayList = fVar.f10394a;
                    if (i17 == Integer.MIN_VALUE) {
                        View view2 = arrayList.get(0);
                        c cVar2 = (c) view2.getLayoutParams();
                        fVar.f10395b = StaggeredGridLayoutManager.this.f10349c.e(view2);
                        cVar2.getClass();
                        i17 = fVar.f10395b;
                    }
                    if (i17 > this.f10349c.k()) {
                        ((c) arrayList.get(0).getLayoutParams()).getClass();
                        return childAt;
                    }
                }
                bitSet.clear(cVar.f10377a.f10398e);
            }
            i14 += i15;
            if (i14 != childCount) {
                View childAt2 = getChildAt(i14);
                boolean z16 = this.f10355i;
                d0 d0Var = this.f10349c;
                if (z16) {
                    int iB = d0Var.b(childAt);
                    int iB2 = this.f10349c.b(childAt2);
                    if (iB >= iB2) {
                        if (iB == iB2) {
                            if (cVar.f10377a.f10398e - ((c) childAt2.getLayoutParams()).f10377a.f10398e < 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (b14 < 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z14 != z15) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return childAt;
                }
                int iE = d0Var.e(childAt);
                int iE2 = this.f10349c.e(childAt2);
                if (iE <= iE2) {
                    if (iE == iE2) {
                        if (cVar.f10377a.f10398e - ((c) childAt2.getLayoutParams()).f10377a.f10398e < 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (b14 < 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z14 != z15) {
                        }
                    } else {
                        continue;
                    }
                }
                return childAt;
            }
        }
        return null;
    }

    public final void m(View view2, int i14, int i15) {
        Rect rect = this.f10364r;
        calculateItemDecorationsForChild(view2, rect);
        c cVar = (c) view2.getLayoutParams();
        int iX = x(i14, ((ViewGroup.MarginLayoutParams) cVar).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int iX2 = x(i15, ((ViewGroup.MarginLayoutParams) cVar).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect.bottom);
        if (shouldMeasureChild(view2, iX, iX2, cVar)) {
            view2.measure(iX, iX2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:123:0x01db  */
    /* JADX WARN: Code duplicated, block: B:125:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:131:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:133:0x0203  */
    /* JADX WARN: Code duplicated, block: B:251:0x040b  */
    /* JADX WARN: Code duplicated, block: B:262:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x01f6 A[SYNTHETIC] */
    public final void n(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z14) {
        boolean z15;
        e eVar;
        f[] fVarArr;
        int childCount;
        int i14;
        int position;
        int position2;
        int childCount2;
        int i15;
        boolean z16;
        e eVar2 = this.f10363q;
        b bVar = this.f10365t;
        if (!(eVar2 == null && this.f10357k == -1) && b0Var.b() == 0) {
            removeAndRecycleAllViews(wVar);
            bVar.a();
            return;
        }
        boolean z17 = bVar.f10374e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
        boolean z18 = (z17 && this.f10357k == -1 && this.f10363q == null) ? false : true;
        d dVar = this.f10359m;
        if (z18) {
            bVar.a();
            e eVar3 = this.f10363q;
            if (eVar3 != null) {
                int i16 = eVar3.f10386c;
                if (i16 > 0) {
                    if (i16 == this.f10347a) {
                        for (int i17 = 0; i17 < this.f10347a; i17++) {
                            this.f10348b[i17].b();
                            e eVar4 = this.f10363q;
                            int iG = eVar4.f10387d[i17];
                            if (iG != Integer.MIN_VALUE) {
                                boolean z19 = eVar4.f10392i;
                                d0 d0Var = this.f10349c;
                                iG += z19 ? d0Var.g() : d0Var.k();
                            }
                            f fVar = this.f10348b[i17];
                            fVar.f10395b = iG;
                            fVar.f10396c = iG;
                        }
                    } else {
                        eVar3.f10387d = null;
                        eVar3.f10386c = 0;
                        eVar3.f10388e = 0;
                        eVar3.f10389f = null;
                        eVar3.f10390g = null;
                        eVar3.f10384a = eVar3.f10385b;
                    }
                }
                e eVar5 = this.f10363q;
                this.f10362p = eVar5.f10393j;
                boolean z24 = eVar5.f10391h;
                assertNotInLayoutOrScroll(null);
                e eVar6 = this.f10363q;
                if (eVar6 != null && eVar6.f10391h != z24) {
                    eVar6.f10391h = z24;
                }
                this.f10354h = z24;
                requestLayout();
                resolveShouldLayoutReverse();
                e eVar7 = this.f10363q;
                int i18 = eVar7.f10384a;
                if (i18 != -1) {
                    this.f10357k = i18;
                    bVar.f10372c = eVar7.f10392i;
                } else {
                    bVar.f10372c = this.f10355i;
                }
                if (eVar7.f10388e > 1) {
                    dVar.f10378a = eVar7.f10389f;
                    dVar.f10379b = eVar7.f10390g;
                }
            } else {
                resolveShouldLayoutReverse();
                bVar.f10372c = this.f10355i;
            }
            if (b0Var.f10291g || (i15 = this.f10357k) == -1) {
                if (this.f10361o) {
                    int iB = b0Var.b();
                    childCount2 = getChildCount() - 1;
                    while (true) {
                        if (childCount2 < 0) {
                            position2 = 0;
                            break;
                        }
                        position2 = getPosition(getChildAt(childCount2));
                        if (position2 < 0 && position2 < iB) {
                            break;
                        } else {
                            childCount2--;
                        }
                    }
                } else {
                    int iB2 = b0Var.b();
                    childCount = getChildCount();
                    i14 = 0;
                    while (true) {
                        if (i14 >= childCount) {
                            position2 = 0;
                            break;
                        }
                        position = getPosition(getChildAt(i14));
                        if (position < 0 && position < iB2) {
                            position2 = position;
                            break;
                        }
                        i14++;
                    }
                }
                bVar.f10370a = position2;
                bVar.f10371b = Integer.MIN_VALUE;
            } else if (i15 < 0 || i15 >= b0Var.b()) {
                this.f10357k = -1;
                this.f10358l = Integer.MIN_VALUE;
                if (this.f10361o) {
                    int iB3 = b0Var.b();
                    childCount2 = getChildCount() - 1;
                    while (true) {
                        if (childCount2 < 0) {
                            position2 = 0;
                            break;
                        } else {
                            position2 = getPosition(getChildAt(childCount2));
                            if (position2 < 0) {
                            }
                            childCount2--;
                        }
                    }
                } else {
                    int iB4 = b0Var.b();
                    childCount = getChildCount();
                    i14 = 0;
                    while (true) {
                        if (i14 >= childCount) {
                            position2 = 0;
                            break;
                        } else {
                            position = getPosition(getChildAt(i14));
                            if (position < 0) {
                            }
                            i14++;
                        }
                    }
                }
                bVar.f10370a = position2;
                bVar.f10371b = Integer.MIN_VALUE;
            } else {
                e eVar8 = this.f10363q;
                if (eVar8 == null || eVar8.f10384a == -1 || eVar8.f10386c < 1) {
                    View viewFindViewByPosition = findViewByPosition(this.f10357k);
                    if (viewFindViewByPosition != null) {
                        bVar.f10370a = this.f10355i ? h() : g();
                        if (this.f10358l != Integer.MIN_VALUE) {
                            boolean z25 = bVar.f10372c;
                            d0 d0Var2 = this.f10349c;
                            if (z25) {
                                bVar.f10371b = (d0Var2.g() - this.f10358l) - this.f10349c.b(viewFindViewByPosition);
                            } else {
                                bVar.f10371b = (d0Var2.k() + this.f10358l) - this.f10349c.e(viewFindViewByPosition);
                            }
                        } else if (this.f10349c.c(viewFindViewByPosition) > this.f10349c.l()) {
                            boolean z26 = bVar.f10372c;
                            d0 d0Var3 = this.f10349c;
                            bVar.f10371b = z26 ? d0Var3.g() : d0Var3.k();
                        } else {
                            int iE = this.f10349c.e(viewFindViewByPosition) - this.f10349c.k();
                            if (iE < 0) {
                                bVar.f10371b = -iE;
                            } else {
                                int iG2 = this.f10349c.g() - this.f10349c.b(viewFindViewByPosition);
                                if (iG2 < 0) {
                                    bVar.f10371b = iG2;
                                } else {
                                    bVar.f10371b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i19 = this.f10357k;
                        bVar.f10370a = i19;
                        int i24 = this.f10358l;
                        if (i24 == Integer.MIN_VALUE) {
                            if (getChildCount() != 0) {
                                if ((i19 < g()) != this.f10355i) {
                                    z16 = false;
                                } else {
                                    z16 = true;
                                }
                            } else if (this.f10355i) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            bVar.f10372c = z16;
                            bVar.f10371b = z16 ? staggeredGridLayoutManager.f10349c.g() : staggeredGridLayoutManager.f10349c.k();
                        } else if (bVar.f10372c) {
                            bVar.f10371b = staggeredGridLayoutManager.f10349c.g() - i24;
                        } else {
                            bVar.f10371b = staggeredGridLayoutManager.f10349c.k() + i24;
                        }
                        bVar.f10373d = true;
                    }
                } else {
                    bVar.f10371b = Integer.MIN_VALUE;
                    bVar.f10370a = this.f10357k;
                }
            }
            bVar.f10374e = true;
        }
        if (this.f10363q == null && this.f10357k == -1 && (bVar.f10372c != this.f10361o || isLayoutRTL() != this.f10362p)) {
            dVar.a();
            bVar.f10373d = true;
        }
        if (getChildCount() > 0 && ((eVar = this.f10363q) == null || eVar.f10386c < 1)) {
            if (bVar.f10373d) {
                for (int i25 = 0; i25 < this.f10347a; i25++) {
                    this.f10348b[i25].b();
                    int i26 = bVar.f10371b;
                    if (i26 != Integer.MIN_VALUE) {
                        f fVar2 = this.f10348b[i25];
                        fVar2.f10395b = i26;
                        fVar2.f10396c = i26;
                    }
                }
            } else if (z18 || bVar.f10375f == null) {
                int i27 = 0;
                while (true) {
                    int i28 = this.f10347a;
                    fVarArr = this.f10348b;
                    if (i27 >= i28) {
                        break;
                    }
                    f fVar3 = fVarArr[i27];
                    boolean z27 = this.f10355i;
                    int i29 = bVar.f10371b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    int iF = z27 ? fVar3.f(Integer.MIN_VALUE) : fVar3.h(Integer.MIN_VALUE);
                    fVar3.b();
                    if (iF != Integer.MIN_VALUE && ((!z27 || iF >= staggeredGridLayoutManager2.f10349c.g()) && (z27 || iF <= staggeredGridLayoutManager2.f10349c.k()))) {
                        if (i29 != Integer.MIN_VALUE) {
                            iF += i29;
                        }
                        fVar3.f10396c = iF;
                        fVar3.f10395b = iF;
                    }
                    i27++;
                }
                int length = fVarArr.length;
                int[] iArr = bVar.f10375f;
                if (iArr == null || iArr.length < length) {
                    bVar.f10375f = new int[staggeredGridLayoutManager.f10348b.length];
                }
                for (int i30 = 0; i30 < length; i30++) {
                    bVar.f10375f[i30] = fVarArr[i30].h(Integer.MIN_VALUE);
                }
            } else {
                for (int i34 = 0; i34 < this.f10347a; i34++) {
                    f fVar4 = this.f10348b[i34];
                    fVar4.b();
                    int i35 = bVar.f10375f[i34];
                    fVar4.f10395b = i35;
                    fVar4.f10396c = i35;
                }
            }
        }
        detachAndScrapAttachedViews(wVar);
        v vVar = this.f10353g;
        vVar.f10689a = false;
        int iL = this.f10350d.l();
        this.f10352f = iL / this.f10347a;
        View.MeasureSpec.makeMeasureSpec(iL, this.f10350d.i());
        v(bVar.f10370a, b0Var);
        if (bVar.f10372c) {
            t(-1);
            b(wVar, vVar, b0Var);
            t(1);
            vVar.f10691c = bVar.f10370a + vVar.f10692d;
            b(wVar, vVar, b0Var);
        } else {
            t(1);
            b(wVar, vVar, b0Var);
            t(-1);
            vVar.f10691c = bVar.f10370a + vVar.f10692d;
            b(wVar, vVar, b0Var);
        }
        if (this.f10350d.i() != 1073741824) {
            int childCount3 = getChildCount();
            float fMax = 0.0f;
            for (int i36 = 0; i36 < childCount3; i36++) {
                View childAt = getChildAt(i36);
                float fC = this.f10350d.c(childAt);
                if (fC >= fMax) {
                    ((c) childAt.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fC);
                }
            }
            int i37 = this.f10352f;
            int iRound = Math.round(fMax * this.f10347a);
            if (this.f10350d.i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f10350d.l());
            }
            this.f10352f = iRound / this.f10347a;
            View.MeasureSpec.makeMeasureSpec(iRound, this.f10350d.i());
            if (this.f10352f != i37) {
                for (int i38 = 0; i38 < childCount3; i38++) {
                    View childAt2 = getChildAt(i38);
                    c cVar = (c) childAt2.getLayoutParams();
                    cVar.getClass();
                    if (isLayoutRTL() && this.f10351e == 1) {
                        int i39 = -((this.f10347a - 1) - cVar.f10377a.f10398e);
                        childAt2.offsetLeftAndRight((this.f10352f * i39) - (i39 * i37));
                    } else {
                        int i44 = cVar.f10377a.f10398e;
                        int i45 = this.f10352f * i44;
                        int i46 = i44 * i37;
                        if (this.f10351e == 1) {
                            childAt2.offsetLeftAndRight(i45 - i46);
                        } else {
                            childAt2.offsetTopAndBottom(i45 - i46);
                        }
                    }
                }
            }
        }
        if (getChildCount() > 0) {
            if (this.f10355i) {
                e(wVar, b0Var, true);
                f(wVar, b0Var, false);
            } else {
                f(wVar, b0Var, true);
                e(wVar, b0Var, false);
            }
        }
        if (z14 && !b0Var.f10291g && this.f10360n != 0 && getChildCount() > 0 && l() != null) {
            removeCallbacks(this.f10368x);
            z15 = a();
        }
        if (b0Var.f10291g) {
            bVar.a();
        }
        this.f10361o = bVar.f10372c;
        this.f10362p = isLayoutRTL();
        if (z15) {
            bVar.a();
            n(wVar, b0Var, false);
        }
    }

    public final boolean o(int i14) {
        if (this.f10351e == 0) {
            return (i14 == -1) != this.f10355i;
        }
        return ((i14 == -1) == this.f10355i) == isLayoutRTL();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void offsetChildrenHorizontal(int i14) {
        super.offsetChildrenHorizontal(i14);
        for (int i15 = 0; i15 < this.f10347a; i15++) {
            f fVar = this.f10348b[i15];
            int i16 = fVar.f10395b;
            if (i16 != Integer.MIN_VALUE) {
                fVar.f10395b = i16 + i14;
            }
            int i17 = fVar.f10396c;
            if (i17 != Integer.MIN_VALUE) {
                fVar.f10396c = i17 + i14;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void offsetChildrenVertical(int i14) {
        super.offsetChildrenVertical(i14);
        for (int i15 = 0; i15 < this.f10347a; i15++) {
            f fVar = this.f10348b[i15];
            int i16 = fVar.f10395b;
            if (i16 != Integer.MIN_VALUE) {
                fVar.f10395b = i16 + i14;
            }
            int i17 = fVar.f10396c;
            if (i17 != Integer.MIN_VALUE) {
                fVar.f10396c = i17 + i14;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onAdapterChanged(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.f10359m.a();
        for (int i14 = 0; i14 < this.f10347a; i14++) {
            this.f10348b[i14].b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.onDetachedFromWindow(recyclerView, wVar);
        removeCallbacks(this.f10368x);
        for (int i14 = 0; i14 < this.f10347a; i14++) {
            this.f10348b[i14].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0031  */
    /* JADX WARN: Code duplicated, block: B:29:0x003c  */
    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final View onFocusSearchFailed(View view2, int i14, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        View viewFindContainingItemView;
        int i15;
        if (getChildCount() == 0 || (viewFindContainingItemView = findContainingItemView(view2)) == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 != 17) {
                    if (i14 != 33) {
                        if (i14 == 66 ? this.f10351e == 0 : !(i14 != 130 || this.f10351e != 1)) {
                            i15 = 1;
                        }
                    } else if (this.f10351e == 1) {
                        i15 = -1;
                    }
                    i15 = Integer.MIN_VALUE;
                } else if (this.f10351e == 0) {
                    i15 = -1;
                } else {
                    i15 = Integer.MIN_VALUE;
                }
            } else if (this.f10351e != 1 && isLayoutRTL()) {
                i15 = -1;
            } else {
                i15 = 1;
            }
        } else if (this.f10351e != 1 && isLayoutRTL()) {
            i15 = 1;
        } else {
            i15 = -1;
        }
        if (i15 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) viewFindContainingItemView.getLayoutParams();
        cVar.getClass();
        f fVar = cVar.f10377a;
        int iH = i15 == 1 ? h() : g();
        v(iH, b0Var);
        t(i15);
        v vVar = this.f10353g;
        vVar.f10691c = vVar.f10692d + iH;
        vVar.f10690b = (int) (this.f10349c.l() * 0.33333334f);
        vVar.f10696h = true;
        vVar.f10689a = false;
        b(wVar, vVar, b0Var);
        this.f10361o = this.f10355i;
        View viewG = fVar.g(iH, i15);
        if (viewG != null && viewG != viewFindContainingItemView) {
            return viewG;
        }
        if (o(i15)) {
            for (int i16 = this.f10347a - 1; i16 >= 0; i16--) {
                View viewG2 = this.f10348b[i16].g(iH, i15);
                if (viewG2 != null && viewG2 != viewFindContainingItemView) {
                    return viewG2;
                }
            }
        } else {
            for (int i17 = 0; i17 < this.f10347a; i17++) {
                View viewG3 = this.f10348b[i17].g(iH, i15);
                if (viewG3 != null && viewG3 != viewFindContainingItemView) {
                    return viewG3;
                }
            }
        }
        boolean z14 = (this.f10354h ^ true) == (i15 == -1);
        View viewFindViewByPosition = findViewByPosition(z14 ? fVar.c() : fVar.d());
        if (viewFindViewByPosition != null && viewFindViewByPosition != viewFindContainingItemView) {
            return viewFindViewByPosition;
        }
        if (o(i15)) {
            for (int i18 = this.f10347a - 1; i18 >= 0; i18--) {
                if (i18 != fVar.f10398e) {
                    f[] fVarArr = this.f10348b;
                    View viewFindViewByPosition2 = findViewByPosition(z14 ? fVarArr[i18].c() : fVarArr[i18].d());
                    if (viewFindViewByPosition2 != null && viewFindViewByPosition2 != viewFindContainingItemView) {
                        return viewFindViewByPosition2;
                    }
                }
            }
        } else {
            for (int i19 = 0; i19 < this.f10347a; i19++) {
                f[] fVarArr2 = this.f10348b;
                View viewFindViewByPosition3 = findViewByPosition(z14 ? fVarArr2[i19].c() : fVarArr2[i19].d());
                if (viewFindViewByPosition3 != null && viewFindViewByPosition3 != viewFindContainingItemView) {
                    return viewFindViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewD = d(false);
            View viewC = c(false);
            if (viewD == null || viewC == null) {
                return;
            }
            int position = getPosition(viewD);
            int position2 = getPosition(viewC);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onItemsAdded(RecyclerView recyclerView, int i14, int i15) {
        k(i14, i15, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.f10359m.a();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onItemsMoved(RecyclerView recyclerView, int i14, int i15, int i16) {
        k(i14, i15, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onItemsRemoved(RecyclerView recyclerView, int i14, int i15) {
        k(i14, i15, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onItemsUpdated(RecyclerView recyclerView, int i14, int i15, Object obj) {
        k(i14, i15, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onLayoutChildren(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        n(wVar, b0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onLayoutCompleted(RecyclerView.b0 b0Var) {
        super.onLayoutCompleted(b0Var);
        this.f10357k = -1;
        this.f10358l = Integer.MIN_VALUE;
        this.f10363q = null;
        this.f10365t.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.f10363q = eVar;
            if (this.f10357k != -1) {
                eVar.f10384a = -1;
                eVar.f10385b = -1;
                eVar.f10387d = null;
                eVar.f10386c = 0;
                eVar.f10388e = 0;
                eVar.f10389f = null;
                eVar.f10390g = null;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final Parcelable onSaveInstanceState() {
        int iH;
        int iK;
        int[] iArr;
        if (this.f10363q != null) {
            return new e(this.f10363q);
        }
        e eVar = new e();
        eVar.f10391h = this.f10354h;
        eVar.f10392i = this.f10361o;
        eVar.f10393j = this.f10362p;
        d dVar = this.f10359m;
        if (dVar == null || (iArr = dVar.f10378a) == null) {
            eVar.f10388e = 0;
        } else {
            eVar.f10389f = iArr;
            eVar.f10388e = iArr.length;
            eVar.f10390g = dVar.f10379b;
        }
        if (getChildCount() <= 0) {
            eVar.f10384a = -1;
            eVar.f10385b = -1;
            eVar.f10386c = 0;
            return eVar;
        }
        eVar.f10384a = this.f10361o ? h() : g();
        View viewC = this.f10355i ? c(true) : d(true);
        eVar.f10385b = viewC != null ? getPosition(viewC) : -1;
        int i14 = this.f10347a;
        eVar.f10386c = i14;
        eVar.f10387d = new int[i14];
        for (int i15 = 0; i15 < this.f10347a; i15++) {
            boolean z14 = this.f10361o;
            f[] fVarArr = this.f10348b;
            if (z14) {
                iH = fVarArr[i15].f(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iK = this.f10349c.g();
                    iH -= iK;
                }
            } else {
                iH = fVarArr[i15].h(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iK = this.f10349c.k();
                    iH -= iK;
                }
            }
            eVar.f10387d[i15] = iH;
        }
        return eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onScrollStateChanged(int i14) {
        if (i14 == 0) {
            a();
        }
    }

    public final void p(int i14, RecyclerView.b0 b0Var) {
        int iG;
        int i15;
        if (i14 > 0) {
            iG = h();
            i15 = 1;
        } else {
            iG = g();
            i15 = -1;
        }
        v vVar = this.f10353g;
        vVar.f10689a = true;
        v(iG, b0Var);
        t(i15);
        vVar.f10691c = iG + vVar.f10692d;
        vVar.f10690b = Math.abs(i14);
    }

    public final void q(RecyclerView.w wVar, v vVar) {
        if (!vVar.f10689a || vVar.f10697i) {
            return;
        }
        int i14 = vVar.f10690b;
        int i15 = vVar.f10693e;
        if (i14 == 0) {
            if (i15 == -1) {
                r(wVar, vVar.f10695g);
                return;
            } else {
                s(wVar, vVar.f10694f);
                return;
            }
        }
        int i16 = 1;
        if (i15 == -1) {
            int i17 = vVar.f10694f;
            int iH = this.f10348b[0].h(i17);
            while (i16 < this.f10347a) {
                int iH2 = this.f10348b[i16].h(i17);
                if (iH2 > iH) {
                    iH = iH2;
                }
                i16++;
            }
            int i18 = i17 - iH;
            int iMin = vVar.f10695g;
            if (i18 >= 0) {
                iMin -= Math.min(i18, vVar.f10690b);
            }
            r(wVar, iMin);
            return;
        }
        int i19 = vVar.f10695g;
        int iF = this.f10348b[0].f(i19);
        while (i16 < this.f10347a) {
            int iF2 = this.f10348b[i16].f(i19);
            if (iF2 < iF) {
                iF = iF2;
            }
            i16++;
        }
        int i24 = iF - vVar.f10695g;
        int iMin2 = vVar.f10694f;
        if (i24 >= 0) {
            iMin2 += Math.min(i24, vVar.f10690b);
        }
        s(wVar, iMin2);
    }

    public final void r(RecyclerView.w wVar, int i14) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f10349c.e(childAt) < i14 || this.f10349c.o(childAt) < i14) {
                return;
            }
            c cVar = (c) childAt.getLayoutParams();
            cVar.getClass();
            if (cVar.f10377a.f10394a.size() == 1) {
                return;
            }
            f fVar = cVar.f10377a;
            ArrayList<View> arrayList = fVar.f10394a;
            int size = arrayList.size();
            View viewRemove = arrayList.remove(size - 1);
            c cVar2 = (c) viewRemove.getLayoutParams();
            cVar2.f10377a = null;
            if (cVar2.isItemRemoved() || cVar2.isItemChanged()) {
                fVar.f10397d -= StaggeredGridLayoutManager.this.f10349c.c(viewRemove);
            }
            if (size == 1) {
                fVar.f10395b = Integer.MIN_VALUE;
            }
            fVar.f10396c = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, wVar);
        }
    }

    public final void resolveShouldLayoutReverse() {
        if (this.f10351e == 1 || !isLayoutRTL()) {
            this.f10355i = this.f10354h;
        } else {
            this.f10355i = !this.f10354h;
        }
    }

    public final void s(RecyclerView.w wVar, int i14) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f10349c.b(childAt) > i14 || this.f10349c.n(childAt) > i14) {
                return;
            }
            c cVar = (c) childAt.getLayoutParams();
            cVar.getClass();
            if (cVar.f10377a.f10394a.size() == 1) {
                return;
            }
            f fVar = cVar.f10377a;
            ArrayList<View> arrayList = fVar.f10394a;
            View viewRemove = arrayList.remove(0);
            c cVar2 = (c) viewRemove.getLayoutParams();
            cVar2.f10377a = null;
            if (arrayList.size() == 0) {
                fVar.f10396c = Integer.MIN_VALUE;
            }
            if (cVar2.isItemRemoved() || cVar2.isItemChanged()) {
                fVar.f10397d -= StaggeredGridLayoutManager.this.f10349c.c(viewRemove);
            }
            fVar.f10395b = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, wVar);
        }
    }

    public final int scrollBy(int i14, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (getChildCount() == 0 || i14 == 0) {
            return 0;
        }
        p(i14, b0Var);
        v vVar = this.f10353g;
        int iB = b(wVar, vVar, b0Var);
        if (vVar.f10690b >= iB) {
            i14 = i14 < 0 ? -iB : iB;
        }
        this.f10349c.p(-i14);
        this.f10361o = this.f10355i;
        vVar.f10690b = 0;
        q(wVar, vVar);
        return i14;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int scrollHorizontallyBy(int i14, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        return scrollBy(i14, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void scrollToPosition(int i14) {
        e eVar = this.f10363q;
        if (eVar != null && eVar.f10384a != i14) {
            eVar.f10387d = null;
            eVar.f10386c = 0;
            eVar.f10384a = -1;
            eVar.f10385b = -1;
        }
        this.f10357k = i14;
        this.f10358l = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int scrollVerticallyBy(int i14, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        return scrollBy(i14, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void setMeasuredDimension(Rect rect, int i14, int i15) {
        int iChooseSize;
        int iChooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f10351e == 1) {
            iChooseSize2 = RecyclerView.p.chooseSize(i15, rect.height() + paddingBottom, getMinimumHeight());
            iChooseSize = RecyclerView.p.chooseSize(i14, (this.f10352f * this.f10347a) + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.p.chooseSize(i14, rect.width() + paddingRight, getMinimumWidth());
            iChooseSize2 = RecyclerView.p.chooseSize(i15, (this.f10352f * this.f10347a) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i14) {
        w wVar = new w(recyclerView.getContext());
        wVar.setTargetPosition(i14);
        startSmoothScroll(wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean supportsPredictiveItemAnimations() {
        return this.f10363q == null;
    }

    public final void t(int i14) {
        v vVar = this.f10353g;
        vVar.f10693e = i14;
        vVar.f10692d = this.f10355i != (i14 == -1) ? -1 : 1;
    }

    public final void u(int i14) {
        assertNotInLayoutOrScroll(null);
        if (i14 != this.f10347a) {
            this.f10359m.a();
            requestLayout();
            this.f10347a = i14;
            this.f10356j = new BitSet(this.f10347a);
            this.f10348b = new f[this.f10347a];
            for (int i15 = 0; i15 < this.f10347a; i15++) {
                this.f10348b[i15] = new f(i15);
            }
            requestLayout();
        }
    }

    public final void v(int i14, RecyclerView.b0 b0Var) {
        int iL;
        int iL2;
        int i15;
        v vVar = this.f10353g;
        boolean z14 = false;
        vVar.f10690b = 0;
        vVar.f10691c = i14;
        if (!isSmoothScrolling() || (i15 = b0Var.f10285a) == -1) {
            iL = 0;
            iL2 = 0;
        } else {
            boolean z15 = this.f10355i;
            boolean z16 = i15 < i14;
            d0 d0Var = this.f10349c;
            if (z15 == z16) {
                iL = d0Var.l();
                iL2 = 0;
            } else {
                iL2 = d0Var.l();
                iL = 0;
            }
        }
        if (getClipToPadding()) {
            vVar.f10694f = this.f10349c.k() - iL2;
            vVar.f10695g = this.f10349c.g() + iL;
        } else {
            vVar.f10695g = this.f10349c.f() + iL;
            vVar.f10694f = -iL2;
        }
        vVar.f10696h = false;
        vVar.f10689a = true;
        if (this.f10349c.i() == 0 && this.f10349c.f() == 0) {
            z14 = true;
        }
        vVar.f10697i = z14;
    }

    public final void w(f fVar, int i14, int i15) {
        int i16 = fVar.f10397d;
        int i17 = fVar.f10398e;
        if (i14 != -1) {
            int i18 = fVar.f10396c;
            if (i18 == Integer.MIN_VALUE) {
                fVar.a();
                i18 = fVar.f10396c;
            }
            if (i18 - i16 >= i15) {
                this.f10356j.set(i17, false);
                return;
            }
            return;
        }
        int i19 = fVar.f10395b;
        if (i19 == Integer.MIN_VALUE) {
            View view2 = fVar.f10394a.get(0);
            c cVar = (c) view2.getLayoutParams();
            fVar.f10395b = StaggeredGridLayoutManager.this.f10349c.e(view2);
            cVar.getClass();
            i19 = fVar.f10395b;
        }
        if (i19 + i16 <= i15) {
            this.f10356j.set(i17, false);
        }
    }

    public static class c extends RecyclerView.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f10377a;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(int i14, int i15) {
            super(i14, i15);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(RecyclerView.q qVar) {
            super(qVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final RecyclerView.q generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f10378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f10379b;

        public final void a() {
            int[] iArr = this.f10378a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f10379b = null;
        }

        public final void b(int i14) {
            int[] iArr = this.f10378a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i14, 10) + 1];
                this.f10378a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i14 >= iArr.length) {
                int length = iArr.length;
                while (length <= i14) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f10378a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f10378a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public final void c(int i14, int i15) {
            int[] iArr = this.f10378a;
            if (iArr == null || i14 >= iArr.length) {
                return;
            }
            int i16 = i14 + i15;
            b(i16);
            int[] iArr2 = this.f10378a;
            System.arraycopy(iArr2, i14, iArr2, i16, (iArr2.length - i14) - i15);
            Arrays.fill(this.f10378a, i14, i16, -1);
            ArrayList arrayList = this.f10379b;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f10379b.get(size);
                int i17 = aVar.f10380a;
                if (i17 >= i14) {
                    aVar.f10380a = i17 + i15;
                }
            }
        }

        public final void d(int i14, int i15) {
            int[] iArr = this.f10378a;
            if (iArr == null || i14 >= iArr.length) {
                return;
            }
            int i16 = i14 + i15;
            b(i16);
            int[] iArr2 = this.f10378a;
            System.arraycopy(iArr2, i16, iArr2, i14, (iArr2.length - i14) - i15);
            int[] iArr3 = this.f10378a;
            Arrays.fill(iArr3, iArr3.length - i15, iArr3.length, -1);
            ArrayList arrayList = this.f10379b;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f10379b.get(size);
                int i17 = aVar.f10380a;
                if (i17 >= i14) {
                    if (i17 < i16) {
                        this.f10379b.remove(size);
                    } else {
                        aVar.f10380a = i17 - i15;
                    }
                }
            }
        }

        @SuppressLint({"BanParcelableUsage"})
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0143a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f10380a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f10381b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int[] f10382c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final boolean f10383d;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            public class C0143a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i14) {
                    return new a[i14];
                }
            }

            public a(Parcel parcel) {
                this.f10380a = parcel.readInt();
                this.f10381b = parcel.readInt();
                this.f10383d = parcel.readInt() == 1;
                int i14 = parcel.readInt();
                if (i14 > 0) {
                    int[] iArr = new int[i14];
                    this.f10382c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.f10380a + ", mGapDir=" + this.f10381b + ", mHasUnwantedGapAfter=" + this.f10383d + ", mGapPerSpan=" + Arrays.toString(this.f10382c) + CoreConstants.CURLY_RIGHT;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.writeInt(this.f10380a);
                parcel.writeInt(this.f10381b);
                parcel.writeInt(this.f10383d ? 1 : 0);
                int[] iArr = this.f10382c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f10382c);
                }
            }

            public a() {
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10386c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int[] f10387d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f10388e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int[] f10389f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ArrayList f10390g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f10391h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f10392i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f10393j;

        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i14) {
                return new e[i14];
            }
        }

        public e(Parcel parcel) {
            this.f10384a = parcel.readInt();
            this.f10385b = parcel.readInt();
            int i14 = parcel.readInt();
            this.f10386c = i14;
            if (i14 > 0) {
                int[] iArr = new int[i14];
                this.f10387d = iArr;
                parcel.readIntArray(iArr);
            }
            int i15 = parcel.readInt();
            this.f10388e = i15;
            if (i15 > 0) {
                int[] iArr2 = new int[i15];
                this.f10389f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f10391h = parcel.readInt() == 1;
            this.f10392i = parcel.readInt() == 1;
            this.f10393j = parcel.readInt() == 1;
            this.f10390g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.writeInt(this.f10384a);
            parcel.writeInt(this.f10385b);
            parcel.writeInt(this.f10386c);
            if (this.f10386c > 0) {
                parcel.writeIntArray(this.f10387d);
            }
            parcel.writeInt(this.f10388e);
            if (this.f10388e > 0) {
                parcel.writeIntArray(this.f10389f);
            }
            parcel.writeInt(this.f10391h ? 1 : 0);
            parcel.writeInt(this.f10392i ? 1 : 0);
            parcel.writeInt(this.f10393j ? 1 : 0);
            parcel.writeList(this.f10390g);
        }

        public e() {
        }

        public e(e eVar) {
            this.f10386c = eVar.f10386c;
            this.f10384a = eVar.f10384a;
            this.f10385b = eVar.f10385b;
            this.f10387d = eVar.f10387d;
            this.f10388e = eVar.f10388e;
            this.f10389f = eVar.f10389f;
            this.f10391h = eVar.f10391h;
            this.f10392i = eVar.f10392i;
            this.f10393j = eVar.f10393j;
            this.f10390g = eVar.f10390g;
        }
    }

    public StaggeredGridLayoutManager(int i14, int i15) {
        this.f10347a = -1;
        this.f10354h = false;
        this.f10355i = false;
        this.f10357k = -1;
        this.f10358l = Integer.MIN_VALUE;
        this.f10359m = new d();
        this.f10360n = 2;
        this.f10364r = new Rect();
        this.f10365t = new b();
        this.f10366v = true;
        this.f10368x = new a();
        this.f10351e = i15;
        u(i14);
        this.f10353g = new v();
        this.f10349c = d0.a(this, this.f10351e);
        this.f10350d = d0.a(this, 1 - this.f10351e);
    }
}
