package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import defpackage.m80;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2786b;
    public int[] c;
    public View[] d;
    public final SparseIntArray e;
    public final SparseIntArray f;
    public b g;
    public final Rect h;
    public boolean i;

    public static final class a extends b {
        @Override // androidx.recyclerview.widget.GridLayoutManager.b
        public int getSpanIndex(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.b
        public int getSpanSize(int i) {
            return 1;
        }
    }

    public static abstract class b {
        final SparseIntArray mSpanIndexCache = new SparseIntArray();
        final SparseIntArray mSpanGroupIndexCache = new SparseIntArray();
        private boolean mCacheSpanIndices = false;
        private boolean mCacheSpanGroupIndices = false;

        public static int findFirstKeyLessThan(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        public int getCachedSpanGroupIndex(int i, int i2) {
            if (!this.mCacheSpanGroupIndices) {
                return getSpanGroupIndex(i, i2);
            }
            int i3 = this.mSpanGroupIndexCache.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int spanGroupIndex = getSpanGroupIndex(i, i2);
            this.mSpanGroupIndexCache.put(i, spanGroupIndex);
            return spanGroupIndex;
        }

        public int getCachedSpanIndex(int i, int i2) {
            if (!this.mCacheSpanIndices) {
                return getSpanIndex(i, i2);
            }
            int i3 = this.mSpanIndexCache.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int spanIndex = getSpanIndex(i, i2);
            this.mSpanIndexCache.put(i, spanIndex);
            return spanIndex;
        }

        public int getSpanGroupIndex(int i, int i2) {
            int i3;
            int i4;
            int cachedSpanIndex;
            int iFindFirstKeyLessThan;
            if (!this.mCacheSpanGroupIndices || (iFindFirstKeyLessThan = findFirstKeyLessThan(this.mSpanGroupIndexCache, i)) == -1) {
                i3 = 0;
                i4 = 0;
                cachedSpanIndex = 0;
            } else {
                i3 = this.mSpanGroupIndexCache.get(iFindFirstKeyLessThan);
                i4 = iFindFirstKeyLessThan + 1;
                cachedSpanIndex = getCachedSpanIndex(iFindFirstKeyLessThan, i2) + getSpanSize(iFindFirstKeyLessThan);
                if (cachedSpanIndex == i2) {
                    i3++;
                    cachedSpanIndex = 0;
                }
            }
            int spanSize = getSpanSize(i);
            while (i4 < i) {
                int spanSize2 = getSpanSize(i4);
                cachedSpanIndex += spanSize2;
                if (cachedSpanIndex == i2) {
                    i3++;
                    cachedSpanIndex = 0;
                } else if (cachedSpanIndex > i2) {
                    i3++;
                    cachedSpanIndex = spanSize2;
                }
                i4++;
            }
            return cachedSpanIndex + spanSize > i2 ? i3 + 1 : i3;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0024  */
        /* JADX WARN: Code duplicated, block: B:14:0x002b  */
        /* JADX WARN: Code duplicated, block: B:15:0x002d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:16:0x002f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public int getSpanIndex(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.getSpanSize(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.mCacheSpanIndices
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.mSpanIndexCache
                int r2 = findFirstKeyLessThan(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.mSpanIndexCache
                int r3 = r3.get(r2)
                int r4 = r5.getSpanSize(r2)
                int r3 = r3 + r4
                goto L30
            L20:
                r2 = r1
                r3 = r2
            L22:
                if (r2 >= r6) goto L33
                int r4 = r5.getSpanSize(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L2d
                r3 = r1
                goto L30
            L2d:
                if (r3 <= r7) goto L30
                r3 = r4
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r3
                if (r0 > r7) goto L37
                return r3
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.b.getSpanIndex(int, int):int");
        }

        public abstract int getSpanSize(int i);

        public void invalidateSpanGroupIndexCache() {
            this.mSpanGroupIndexCache.clear();
        }

        public void invalidateSpanIndexCache() {
            this.mSpanIndexCache.clear();
        }

        public boolean isSpanGroupIndexCacheEnabled() {
            return this.mCacheSpanGroupIndices;
        }

        public boolean isSpanIndexCacheEnabled() {
            return this.mCacheSpanIndices;
        }

        public void setSpanGroupIndexCacheEnabled(boolean z) {
            if (!z) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanGroupIndices = z;
        }

        public void setSpanIndexCacheEnabled(boolean z) {
            if (!z) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanIndices = z;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f2785a = false;
        this.f2786b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new a();
        this.h = new Rect();
        C(RecyclerView.o.getProperties(context, attributeSet, i, i2).f2815b);
    }

    public static int[] n(int[] iArr, int i, int i2) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    public final void A(View view, int i, boolean z) {
        int childMeasureSpec;
        int childMeasureSpec2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f2797b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int iT = t(layoutParams.e, layoutParams.f);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = RecyclerView.o.getChildMeasureSpec(iT, i, i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
            childMeasureSpec = RecyclerView.o.getChildMeasureSpec(this.mOrientationHelper.n(), getHeightMode(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
        } else {
            int childMeasureSpec3 = RecyclerView.o.getChildMeasureSpec(iT, i, i2, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
            int childMeasureSpec4 = RecyclerView.o.getChildMeasureSpec(this.mOrientationHelper.n(), getWidthMode(), i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        B(view, childMeasureSpec2, childMeasureSpec, z);
    }

    public final void B(View view, int i, int i2, boolean z) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z ? shouldReMeasureChild(view, i, i2, layoutParams) : shouldMeasureChild(view, i, i2, layoutParams)) {
            view.measure(i, i2);
        }
    }

    public void C(int i) {
        if (i == this.f2786b) {
            return;
        }
        this.f2785a = true;
        if (i >= 1) {
            this.f2786b = i;
            this.g.invalidateSpanIndexCache();
            requestLayout();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    public void D(b bVar) {
        this.g = bVar;
    }

    public final void E() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        m(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void collectPrefetchPositionsForLayoutState(RecyclerView.z zVar, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int spanSize = this.f2786b;
        for (int i = 0; i < this.f2786b && cVar.c(zVar) && spanSize > 0; i++) {
            int i2 = cVar.d;
            cVar2.a(i2, Math.max(0, cVar.g));
            spanSize -= this.g.getSpanSize(i2);
            cVar.d += cVar.e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollOffset(RecyclerView.z zVar) {
        return this.i ? p(zVar) : super.computeHorizontalScrollOffset(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollRange(RecyclerView.z zVar) {
        return this.i ? q(zVar) : super.computeHorizontalScrollRange(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollOffset(RecyclerView.z zVar) {
        return this.i ? p(zVar) : super.computeVerticalScrollOffset(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollRange(RecyclerView.z zVar) {
        return this.i ? q(zVar) : super.computeVerticalScrollRange(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View findReferenceChild(RecyclerView.u uVar, RecyclerView.z zVar, boolean z, boolean z2) {
        int i;
        int childCount;
        int childCount2 = getChildCount();
        int i2 = 1;
        if (z2) {
            childCount = getChildCount() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = childCount2;
            childCount = 0;
        }
        int iC = zVar.c();
        ensureLayoutState();
        int iM = this.mOrientationHelper.m();
        int i3 = this.mOrientationHelper.i();
        View view = null;
        View view2 = null;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < iC && w(uVar, zVar, position) == 0) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).e()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.g(childAt) < i3 && this.mOrientationHelper.d(childAt) >= iM) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int getColumnCountForAccessibility(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.mOrientation == 1) {
            return this.f2786b;
        }
        if (zVar.c() < 1) {
            return 0;
        }
        return v(uVar, zVar, zVar.c() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int getRowCountForAccessibility(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.mOrientation == 0) {
            return this.f2786b;
        }
        if (zVar.c() < 1) {
            return 0;
        }
        return v(uVar, zVar, zVar.c() - 1) + 1;
    }

    public final void k(RecyclerView.u uVar, RecyclerView.z zVar, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (z) {
            i4 = 1;
            i3 = i;
            i2 = 0;
        } else {
            i2 = i - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View view = this.d[i2];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int iX = x(uVar, zVar, getPosition(view));
            layoutParams.f = iX;
            layoutParams.e = i5;
            i5 += iX;
            i2 += i4;
        }
    }

    public final void l() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int iC = layoutParams.c();
            this.e.put(iC, layoutParams.h());
            this.f.put(iC, layoutParams.g());
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void layoutChunk(RecyclerView.u uVar, RecyclerView.z zVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int iF;
        int i6;
        int iF2;
        int iF3;
        int i7;
        int childMeasureSpec;
        int childMeasureSpec2;
        View viewD;
        int iL = this.mOrientationHelper.l();
        boolean z = iL != 1073741824;
        int i8 = getChildCount() > 0 ? this.c[this.f2786b] : 0;
        if (z) {
            E();
        }
        boolean z2 = cVar.e == 1;
        int iW = this.f2786b;
        if (!z2) {
            iW = w(uVar, zVar, cVar.d) + x(uVar, zVar, cVar.d);
        }
        int i9 = 0;
        while (i9 < this.f2786b && cVar.c(zVar) && iW > 0) {
            int i10 = cVar.d;
            int iX = x(uVar, zVar, i10);
            if (iX > this.f2786b) {
                throw new IllegalArgumentException("Item at position " + i10 + " requires " + iX + " spans but GridLayoutManager has only " + this.f2786b + " spans.");
            }
            iW -= iX;
            if (iW < 0 || (viewD = cVar.d(uVar)) == null) {
                break;
            }
            this.d[i9] = viewD;
            i9++;
        }
        if (i9 == 0) {
            bVar.f2792b = true;
            return;
        }
        k(uVar, zVar, i9, z2);
        float f = 0.0f;
        int i11 = 0;
        for (int i12 = 0; i12 < i9; i12++) {
            View view = this.d[i12];
            if (cVar.l == null) {
                if (z2) {
                    addView(view);
                } else {
                    addView(view, 0);
                }
            } else if (z2) {
                addDisappearingView(view);
            } else {
                addDisappearingView(view, 0);
            }
            calculateItemDecorationsForChild(view, this.h);
            A(view, iL, false);
            int iE = this.mOrientationHelper.e(view);
            if (iE > i11) {
                i11 = iE;
            }
            float f2 = (this.mOrientationHelper.f(view) * 1.0f) / ((LayoutParams) view.getLayoutParams()).f;
            if (f2 > f) {
                f = f2;
            }
        }
        if (z) {
            z(f, i8);
            i11 = 0;
            for (int i13 = 0; i13 < i9; i13++) {
                View view2 = this.d[i13];
                A(view2, 1073741824, true);
                int iE2 = this.mOrientationHelper.e(view2);
                if (iE2 > i11) {
                    i11 = iE2;
                }
            }
        }
        for (int i14 = 0; i14 < i9; i14++) {
            View view3 = this.d[i14];
            if (this.mOrientationHelper.e(view3) != i11) {
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                Rect rect = layoutParams.f2797b;
                int i15 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                int i16 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                int iT = t(layoutParams.e, layoutParams.f);
                if (this.mOrientation == 1) {
                    childMeasureSpec2 = RecyclerView.o.getChildMeasureSpec(iT, 1073741824, i16, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11 - i15, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11 - i16, 1073741824);
                    childMeasureSpec = RecyclerView.o.getChildMeasureSpec(iT, 1073741824, i15, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                B(view3, childMeasureSpec2, childMeasureSpec, true);
            }
        }
        bVar.f2791a = i11;
        if (this.mOrientation == 1) {
            if (cVar.f == -1) {
                iF = cVar.f2794b;
                i7 = iF - i11;
            } else {
                i7 = cVar.f2794b;
                iF = i7 + i11;
            }
            i4 = i7;
            i5 = 0;
            i3 = 0;
        } else {
            if (cVar.f == -1) {
                i2 = cVar.f2794b;
                i = i2 - i11;
            } else {
                i = cVar.f2794b;
                i2 = i + i11;
            }
            i3 = i;
            i4 = 0;
            i5 = i2;
            iF = 0;
        }
        int i17 = 0;
        while (i17 < i9) {
            View view4 = this.d[i17];
            LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
            if (this.mOrientation == 1) {
                if (isLayoutRTL()) {
                    int paddingLeft = getPaddingLeft() + this.c[this.f2786b - layoutParams2.e];
                    iF2 = paddingLeft;
                    iF3 = paddingLeft - this.mOrientationHelper.f(view4);
                } else {
                    int paddingLeft2 = getPaddingLeft() + this.c[layoutParams2.e];
                    iF3 = paddingLeft2;
                    iF2 = this.mOrientationHelper.f(view4) + paddingLeft2;
                }
                i6 = i4;
            } else {
                int paddingTop = getPaddingTop() + this.c[layoutParams2.e];
                i6 = paddingTop;
                iF2 = i5;
                iF3 = i3;
                iF = this.mOrientationHelper.f(view4) + paddingTop;
            }
            layoutDecoratedWithMargins(view4, iF3, i6, iF2, iF);
            if (layoutParams2.e() || layoutParams2.d()) {
                bVar.c = true;
            }
            bVar.d |= view4.hasFocusable();
            i17++;
            iF = iF;
            i5 = iF2;
            i3 = iF3;
            i4 = i6;
        }
        Arrays.fill(this.d, (Object) null);
    }

    public final void m(int i) {
        this.c = n(this.c, this.f2786b, i);
    }

    public final void o() {
        this.e.clear();
        this.f.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void onAnchorReady(RecyclerView.u uVar, RecyclerView.z zVar, LinearLayoutManager.a aVar, int i) {
        super.onAnchorReady(uVar, zVar, aVar, i);
        E();
        if (zVar.c() > 0 && !zVar.f()) {
            r(uVar, zVar, aVar, i);
        }
        s();
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:73:0x010f  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d1, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.u r26, androidx.recyclerview.widget.RecyclerView.z r27) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onInitializeAccessibilityNodeInfo(RecyclerView.u uVar, RecyclerView.z zVar, m80 m80Var) {
        super.onInitializeAccessibilityNodeInfo(uVar, zVar, m80Var);
        m80Var.i0(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.u uVar, RecyclerView.z zVar, View view, m80 m80Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, m80Var);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int iV = v(uVar, zVar, layoutParams2.c());
        if (this.mOrientation == 0) {
            m80Var.l0(m80.f.b(layoutParams2.g(), layoutParams2.h(), iV, 1, false, false));
        } else {
            m80Var.l0(m80.f.b(iV, 1, layoutParams2.g(), layoutParams2.h(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.g.invalidateSpanIndexCache();
        this.g.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsChanged(RecyclerView recyclerView) {
        this.g.invalidateSpanIndexCache();
        this.g.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.g.invalidateSpanIndexCache();
        this.g.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.g.invalidateSpanIndexCache();
        this.g.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.g.invalidateSpanIndexCache();
        this.g.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutChildren(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (zVar.f()) {
            l();
        }
        super.onLayoutChildren(uVar, zVar);
        o();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutCompleted(RecyclerView.z zVar) {
        super.onLayoutCompleted(zVar);
        this.f2785a = false;
    }

    public final int p(RecyclerView.z zVar) {
        if (getChildCount() != 0 && zVar.c() != 0) {
            ensureLayoutState();
            boolean zIsSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            View viewFindFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!zIsSmoothScrollbarEnabled, true);
            View viewFindFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!zIsSmoothScrollbarEnabled, true);
            if (viewFindFirstVisibleChildClosestToStart != null && viewFindFirstVisibleChildClosestToEnd != null) {
                int cachedSpanGroupIndex = this.g.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToStart), this.f2786b);
                int cachedSpanGroupIndex2 = this.g.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToEnd), this.f2786b);
                int iMax = this.mShouldReverseLayout ? Math.max(0, ((this.g.getCachedSpanGroupIndex(zVar.c() - 1, this.f2786b) + 1) - Math.max(cachedSpanGroupIndex, cachedSpanGroupIndex2)) - 1) : Math.max(0, Math.min(cachedSpanGroupIndex, cachedSpanGroupIndex2));
                if (zIsSmoothScrollbarEnabled) {
                    return Math.round((iMax * (Math.abs(this.mOrientationHelper.d(viewFindFirstVisibleChildClosestToEnd) - this.mOrientationHelper.g(viewFindFirstVisibleChildClosestToStart)) / ((this.g.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToEnd), this.f2786b) - this.g.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToStart), this.f2786b)) + 1))) + (this.mOrientationHelper.m() - this.mOrientationHelper.g(viewFindFirstVisibleChildClosestToStart)));
                }
                return iMax;
            }
        }
        return 0;
    }

    public final int q(RecyclerView.z zVar) {
        if (getChildCount() != 0 && zVar.c() != 0) {
            ensureLayoutState();
            View viewFindFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
            View viewFindFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
            if (viewFindFirstVisibleChildClosestToStart != null && viewFindFirstVisibleChildClosestToEnd != null) {
                if (!isSmoothScrollbarEnabled()) {
                    return this.g.getCachedSpanGroupIndex(zVar.c() - 1, this.f2786b) + 1;
                }
                return (int) (((this.mOrientationHelper.d(viewFindFirstVisibleChildClosestToEnd) - this.mOrientationHelper.g(viewFindFirstVisibleChildClosestToStart)) / ((this.g.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToEnd), this.f2786b) - this.g.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToStart), this.f2786b)) + 1)) * (this.g.getCachedSpanGroupIndex(zVar.c() - 1, this.f2786b) + 1));
            }
        }
        return 0;
    }

    public final void r(RecyclerView.u uVar, RecyclerView.z zVar, LinearLayoutManager.a aVar, int i) {
        boolean z = i == 1;
        int iW = w(uVar, zVar, aVar.f2790b);
        if (z) {
            while (iW > 0) {
                int i2 = aVar.f2790b;
                if (i2 <= 0) {
                    return;
                }
                int i3 = i2 - 1;
                aVar.f2790b = i3;
                iW = w(uVar, zVar, i3);
            }
            return;
        }
        int iC = zVar.c() - 1;
        int i4 = aVar.f2790b;
        while (i4 < iC) {
            int i5 = i4 + 1;
            int iW2 = w(uVar, zVar, i5);
            if (iW2 <= iW) {
                break;
            }
            i4 = i5;
            iW = iW2;
        }
        aVar.f2790b = i4;
    }

    public final void s() {
        View[] viewArr = this.d;
        if (viewArr == null || viewArr.length != this.f2786b) {
            this.d = new View[this.f2786b];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int scrollHorizontallyBy(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        E();
        s();
        return super.scrollHorizontallyBy(i, uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int scrollVerticallyBy(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        E();
        s();
        return super.scrollVerticallyBy(i, uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int iChooseSize;
        int iChooseSize2;
        if (this.c == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            iChooseSize2 = RecyclerView.o.chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.c;
            iChooseSize = RecyclerView.o.chooseSize(i, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.o.chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.c;
            iChooseSize2 = RecyclerView.o.chooseSize(i2, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f2785a;
    }

    public int t(int i, int i2) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.c;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.c;
        int i3 = this.f2786b;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public int u() {
        return this.f2786b;
    }

    public final int v(RecyclerView.u uVar, RecyclerView.z zVar, int i) {
        if (!zVar.f()) {
            return this.g.getCachedSpanGroupIndex(i, this.f2786b);
        }
        int iF = uVar.f(i);
        if (iF != -1) {
            return this.g.getCachedSpanGroupIndex(iF, this.f2786b);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. ");
        sb.append(i);
        return 0;
    }

    public final int w(RecyclerView.u uVar, RecyclerView.z zVar, int i) {
        if (!zVar.f()) {
            return this.g.getCachedSpanIndex(i, this.f2786b);
        }
        int i2 = this.f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iF = uVar.f(i);
        if (iF != -1) {
            return this.g.getCachedSpanIndex(iF, this.f2786b);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        return 0;
    }

    public final int x(RecyclerView.u uVar, RecyclerView.z zVar, int i) {
        if (!zVar.f()) {
            return this.g.getSpanSize(i);
        }
        int i2 = this.e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iF = uVar.f(i);
        if (iF != -1) {
            return this.g.getSpanSize(iF);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        return 1;
    }

    public b y() {
        return this.g;
    }

    public final void z(float f, int i) {
        m(Math.max(Math.round(f * this.f2786b), i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {
        public int e;
        public int f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.e = -1;
            this.f = 0;
        }

        public int g() {
            return this.e;
        }

        public int h() {
            return this.f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.e = -1;
            this.f = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.e = -1;
            this.f = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.e = -1;
            this.f = 0;
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.f2785a = false;
        this.f2786b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new a();
        this.h = new Rect();
        C(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.f2785a = false;
        this.f2786b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new a();
        this.h = new Rect();
        C(i);
    }
}
