package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.s;
import defpackage.kx9;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class FlexboxLayoutManager extends RecyclerView.o implements kx9, RecyclerView.y.b {
    public static final Rect A = new Rect();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8478b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public List<com.google.android.flexbox.a> h;
    public final com.google.android.flexbox.b i;
    public RecyclerView.u j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RecyclerView.z f8479k;
    public c l;
    public b m;
    public s n;
    public s o;
    public SavedState p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8480r;
    public int s;
    public int t;
    public boolean u;
    public SparseArray<View> v;
    public final Context w;
    public View x;
    public int y;
    public com.google.android.flexbox.b.C0209b z;

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8485b;
        public int c;
        public int d;
        public boolean e;
        public boolean f;
        public boolean g;

        public b() {
            this.d = 0;
        }

        public static /* synthetic */ int l(b bVar, int i) {
            int i2 = bVar.d + i;
            bVar.d = i2;
            return i2;
        }

        public final void r() {
            if (FlexboxLayoutManager.this.j() || !FlexboxLayoutManager.this.f) {
                this.c = this.e ? FlexboxLayoutManager.this.n.i() : FlexboxLayoutManager.this.n.m();
            } else {
                this.c = this.e ? FlexboxLayoutManager.this.n.i() : FlexboxLayoutManager.this.getWidth() - FlexboxLayoutManager.this.n.m();
            }
        }

        public final void s(View view) {
            s sVar = FlexboxLayoutManager.this.f8478b == 0 ? FlexboxLayoutManager.this.o : FlexboxLayoutManager.this.n;
            if (FlexboxLayoutManager.this.j() || !FlexboxLayoutManager.this.f) {
                if (this.e) {
                    this.c = sVar.d(view) + sVar.o();
                } else {
                    this.c = sVar.g(view);
                }
            } else if (this.e) {
                this.c = sVar.g(view) + sVar.o();
            } else {
                this.c = sVar.d(view);
            }
            this.f8484a = FlexboxLayoutManager.this.getPosition(view);
            this.g = false;
            int[] iArr = FlexboxLayoutManager.this.i.c;
            int i = this.f8484a;
            if (i == -1) {
                i = 0;
            }
            int i2 = iArr[i];
            this.f8485b = i2 != -1 ? i2 : 0;
            if (FlexboxLayoutManager.this.h.size() > this.f8485b) {
                this.f8484a = ((com.google.android.flexbox.a) FlexboxLayoutManager.this.h.get(this.f8485b)).o;
            }
        }

        public final void t() {
            this.f8484a = -1;
            this.f8485b = -1;
            this.c = Integer.MIN_VALUE;
            this.f = false;
            this.g = false;
            if (FlexboxLayoutManager.this.j()) {
                if (FlexboxLayoutManager.this.f8478b == 0) {
                    this.e = FlexboxLayoutManager.this.f8477a == 1;
                    return;
                } else {
                    this.e = FlexboxLayoutManager.this.f8478b == 2;
                    return;
                }
            }
            if (FlexboxLayoutManager.this.f8478b == 0) {
                this.e = FlexboxLayoutManager.this.f8477a == 3;
            } else {
                this.e = FlexboxLayoutManager.this.f8478b == 2;
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f8484a + ", mFlexLinePosition=" + this.f8485b + ", mCoordinate=" + this.c + ", mPerpendicularCoordinate=" + this.d + ", mLayoutFromEnd=" + this.e + ", mValid=" + this.f + ", mAssignedFromSavedState=" + this.g + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f8487b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public boolean j;

        public c() {
            this.h = 1;
            this.i = 1;
        }

        public static /* synthetic */ int c(c cVar, int i) {
            int i2 = cVar.e + i;
            cVar.e = i2;
            return i2;
        }

        public static /* synthetic */ int d(c cVar, int i) {
            int i2 = cVar.e - i;
            cVar.e = i2;
            return i2;
        }

        public static /* synthetic */ int i(c cVar, int i) {
            int i2 = cVar.f8486a - i;
            cVar.f8486a = i2;
            return i2;
        }

        public static /* synthetic */ int l(c cVar) {
            int i = cVar.c;
            cVar.c = i + 1;
            return i;
        }

        public static /* synthetic */ int m(c cVar) {
            int i = cVar.c;
            cVar.c = i - 1;
            return i;
        }

        public static /* synthetic */ int n(c cVar, int i) {
            int i2 = cVar.c + i;
            cVar.c = i2;
            return i2;
        }

        public static /* synthetic */ int q(c cVar, int i) {
            int i2 = cVar.f + i;
            cVar.f = i2;
            return i2;
        }

        public static /* synthetic */ int u(c cVar, int i) {
            int i2 = cVar.d + i;
            cVar.d = i2;
            return i2;
        }

        public static /* synthetic */ int v(c cVar, int i) {
            int i2 = cVar.d - i;
            cVar.d = i2;
            return i2;
        }

        public final boolean D(RecyclerView.z zVar, List<com.google.android.flexbox.a> list) {
            int i;
            int i2 = this.d;
            return i2 >= 0 && i2 < zVar.c() && (i = this.c) >= 0 && i < list.size();
        }

        public String toString() {
            return "LayoutState{mAvailable=" + this.f8486a + ", mFlexLinePosition=" + this.c + ", mPosition=" + this.d + ", mOffset=" + this.e + ", mScrollingOffset=" + this.f + ", mLastScrollDelta=" + this.g + ", mItemDirection=" + this.h + ", mLayoutDirection=" + this.i + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0, 1);
    }

    private void ensureLayoutState() {
        if (this.l == null) {
            this.l = new c();
        }
    }

    public static boolean isMeasurementUpToDate(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    private boolean shouldMeasureChild(View view, int i, int i2, RecyclerView.LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && isMeasurementCacheEnabled() && isMeasurementUpToDate(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    public final View A(int i, int i2, boolean z) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View childAt = getChildAt(i);
            if (I(childAt, z)) {
                return childAt;
            }
            i += i3;
        }
        return null;
    }

    public final View B(int i, int i2, int i3) {
        int position;
        u();
        ensureLayoutState();
        int iM = this.n.m();
        int i4 = this.n.i();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            if (childAt != null && (position = getPosition(childAt)) >= 0 && position < i3) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).e()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.n.g(childAt) >= iM && this.n.d(childAt) <= i4) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i5;
        }
        return view != null ? view : view2;
    }

    public final int C(View view) {
        return getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    public final int D(View view) {
        return getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
    }

    public final int E(View view) {
        return getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
    }

    public final int F(View view) {
        return getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
    }

    public final int G(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        u();
        int i2 = 1;
        this.l.j = true;
        boolean z = !j() && this.f;
        if (!z ? i <= 0 : i >= 0) {
            i2 = -1;
        }
        int iAbs = Math.abs(i);
        a0(i2, iAbs);
        int iV = this.l.f + v(uVar, zVar, this.l);
        if (iV < 0) {
            return 0;
        }
        if (z) {
            if (iAbs > iV) {
                i = (-i2) * iV;
            }
        } else if (iAbs > iV) {
            i = i2 * iV;
        }
        this.n.r(-i);
        this.l.g = i;
        return i;
    }

    public final int H(int i) {
        int iMin;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        u();
        boolean zJ = j();
        View view = this.x;
        int width = zJ ? view.getWidth() : view.getHeight();
        int width2 = zJ ? getWidth() : getHeight();
        if (getLayoutDirection() == 1) {
            int iAbs = Math.abs(i);
            if (i < 0) {
                iMin = Math.min((width2 + this.m.d) - width, iAbs);
            } else {
                if (this.m.d + i <= 0) {
                    return i;
                }
                iMin = this.m.d;
            }
        } else {
            if (i > 0) {
                return Math.min((width2 - this.m.d) - width, i);
            }
            if (this.m.d + i >= 0) {
                return i;
            }
            iMin = this.m.d;
        }
        return -iMin;
    }

    public final boolean I(View view, boolean z) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int iD = D(view);
        int iF = F(view);
        int iE = E(view);
        int iC = C(view);
        boolean z2 = paddingLeft <= iD && width >= iE;
        boolean z3 = iD >= width || iE >= paddingLeft;
        boolean z4 = paddingTop <= iF && height >= iC;
        boolean z5 = iF >= height || iC >= paddingTop;
        if (z) {
            return z2 && z4;
        }
        return z3 && z5;
    }

    public final int J(com.google.android.flexbox.a aVar, c cVar) {
        return j() ? K(aVar, cVar) : L(aVar, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00de  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:50:0x0111  */
    /* JADX WARN: Code duplicated, block: B:53:0x0132  */
    /* JADX WARN: Code duplicated, block: B:54:0x0152  */
    /* JADX WARN: Code duplicated, block: B:61:0x0195 A[SYNTHETIC] */
    public final int K(com.google.android.flexbox.a aVar, c cVar) {
        float f;
        float f2;
        float f3;
        float measuredWidth;
        float measuredWidth2;
        float fMax;
        int iB;
        int i;
        int i2;
        View viewB;
        int iY;
        int iX;
        LayoutParams layoutParams;
        float leftDecorationWidth;
        float rightDecorationWidth;
        int topDecorationHeight;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int width = getWidth();
        int i3 = cVar.e;
        if (cVar.i == -1) {
            i3 -= aVar.g;
        }
        int i4 = i3;
        int i5 = cVar.d;
        int i6 = this.c;
        int i7 = 1;
        if (i6 != 0) {
            if (i6 == 1) {
                int i8 = aVar.e;
                float f4 = (width - i8) + paddingRight;
                f3 = 0.0f;
                f2 = i8 - paddingLeft;
                f = f4;
            } else if (i6 == 2) {
                int i9 = aVar.e;
                f = paddingLeft + ((width - i9) / 2.0f);
                f2 = (width - paddingRight) - ((width - i9) / 2.0f);
            } else if (i6 == 3) {
                f = paddingLeft;
                int i10 = aVar.h;
                f3 = (width - aVar.e) / (i10 != 1 ? i10 - 1 : 1.0f);
                f2 = width - paddingRight;
            } else if (i6 == 4) {
                int i11 = aVar.h;
                f3 = i11 != 0 ? (width - aVar.e) / i11 : 0.0f;
                float f5 = f3 / 2.0f;
                f = paddingLeft + f5;
                f2 = (width - paddingRight) - f5;
            } else {
                if (i6 != 5) {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.c);
                }
                int i12 = aVar.h;
                f3 = i12 != 0 ? (width - aVar.e) / (i12 + 1) : 0.0f;
                f = paddingLeft + f3;
                f2 = (width - paddingRight) - f3;
            }
            measuredWidth = f - this.m.d;
            measuredWidth2 = f2 - this.m.d;
            fMax = Math.max(f3, 0.0f);
            iB = aVar.b();
            i = 0;
            i2 = i5;
            while (i2 < i5 + iB) {
                viewB = b(i2);
                if (viewB != null) {
                    if (cVar.i == i7) {
                        calculateItemDecorationsForChild(viewB, A);
                        addView(viewB);
                    } else {
                        calculateItemDecorationsForChild(viewB, A);
                        addView(viewB, i);
                        i++;
                    }
                    int i13 = i;
                    com.google.android.flexbox.b bVar = this.i;
                    long j = bVar.d[i2];
                    iY = bVar.y(j);
                    iX = this.i.x(j);
                    layoutParams = (LayoutParams) viewB.getLayoutParams();
                    if (shouldMeasureChild(viewB, iY, iX, layoutParams)) {
                        viewB.measure(iY, iX);
                    }
                    leftDecorationWidth = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + getLeftDecorationWidth(viewB);
                    rightDecorationWidth = measuredWidth2 - (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + getRightDecorationWidth(viewB));
                    topDecorationHeight = i4 + getTopDecorationHeight(viewB);
                    if (this.f) {
                        this.i.Q(viewB, aVar, Math.round(rightDecorationWidth) - viewB.getMeasuredWidth(), topDecorationHeight, Math.round(rightDecorationWidth), topDecorationHeight + viewB.getMeasuredHeight());
                    } else {
                        this.i.Q(viewB, aVar, Math.round(leftDecorationWidth), topDecorationHeight, Math.round(leftDecorationWidth) + viewB.getMeasuredWidth(), topDecorationHeight + viewB.getMeasuredHeight());
                    }
                    i = i13;
                    measuredWidth = leftDecorationWidth + viewB.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + getRightDecorationWidth(viewB) + fMax;
                    measuredWidth2 = rightDecorationWidth - (((viewB.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + getLeftDecorationWidth(viewB)) + fMax);
                }
                i2++;
                i7 = 1;
            }
            c.n(cVar, this.l.i);
            return aVar.a();
        }
        f = paddingLeft;
        f2 = width - paddingRight;
        f3 = 0.0f;
        measuredWidth = f - this.m.d;
        measuredWidth2 = f2 - this.m.d;
        fMax = Math.max(f3, 0.0f);
        iB = aVar.b();
        i = 0;
        i2 = i5;
        while (i2 < i5 + iB) {
            viewB = b(i2);
            if (viewB != null) {
                if (cVar.i == i7) {
                    calculateItemDecorationsForChild(viewB, A);
                    addView(viewB);
                } else {
                    calculateItemDecorationsForChild(viewB, A);
                    addView(viewB, i);
                    i++;
                }
                int i14 = i;
                com.google.android.flexbox.b bVar2 = this.i;
                long j2 = bVar2.d[i2];
                iY = bVar2.y(j2);
                iX = this.i.x(j2);
                layoutParams = (LayoutParams) viewB.getLayoutParams();
                if (shouldMeasureChild(viewB, iY, iX, layoutParams)) {
                    viewB.measure(iY, iX);
                }
                leftDecorationWidth = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + getLeftDecorationWidth(viewB);
                rightDecorationWidth = measuredWidth2 - (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + getRightDecorationWidth(viewB));
                topDecorationHeight = i4 + getTopDecorationHeight(viewB);
                if (this.f) {
                    this.i.Q(viewB, aVar, Math.round(rightDecorationWidth) - viewB.getMeasuredWidth(), topDecorationHeight, Math.round(rightDecorationWidth), topDecorationHeight + viewB.getMeasuredHeight());
                } else {
                    this.i.Q(viewB, aVar, Math.round(leftDecorationWidth), topDecorationHeight, Math.round(leftDecorationWidth) + viewB.getMeasuredWidth(), topDecorationHeight + viewB.getMeasuredHeight());
                }
                i = i14;
                measuredWidth = leftDecorationWidth + viewB.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + getRightDecorationWidth(viewB) + fMax;
                measuredWidth2 = rightDecorationWidth - (((viewB.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + getLeftDecorationWidth(viewB)) + fMax);
            }
            i2++;
            i7 = 1;
        }
        c.n(cVar, this.l.i);
        return aVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:45:0x0103  */
    /* JADX WARN: Code duplicated, block: B:48:0x0121  */
    /* JADX WARN: Code duplicated, block: B:50:0x012c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0147  */
    /* JADX WARN: Code duplicated, block: B:55:0x014b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0175  */
    /* JADX WARN: Code duplicated, block: B:57:0x019b  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x01c3  */
    public final int L(com.google.android.flexbox.a aVar, c cVar) {
        float f;
        float f2;
        float f3;
        float measuredHeight;
        float measuredHeight2;
        float fMax;
        int iB;
        int i;
        int i2;
        View viewB;
        float f4;
        int iY;
        int iX;
        LayoutParams layoutParams;
        float topDecorationHeight;
        float bottomDecorationHeight;
        int leftDecorationWidth;
        int rightDecorationWidth;
        boolean z;
        boolean z2;
        View view;
        int i3;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = cVar.e;
        int i5 = cVar.e;
        if (cVar.i == -1) {
            int i6 = aVar.g;
            i4 -= i6;
            i5 += i6;
        }
        int i7 = i4;
        int i8 = i5;
        int i9 = cVar.d;
        int i10 = this.c;
        boolean z3 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                int i11 = aVar.e;
                float f5 = (height - i11) + paddingBottom;
                f3 = 0.0f;
                f2 = i11 - paddingTop;
                f = f5;
            } else if (i10 == 2) {
                int i12 = aVar.e;
                f = paddingTop + ((height - i12) / 2.0f);
                f2 = (height - paddingBottom) - ((height - i12) / 2.0f);
            } else if (i10 == 3) {
                f = paddingTop;
                int i13 = aVar.h;
                f3 = (height - aVar.e) / (i13 != 1 ? i13 - 1 : 1.0f);
                f2 = height - paddingBottom;
            } else if (i10 == 4) {
                int i14 = aVar.h;
                f3 = i14 != 0 ? (height - aVar.e) / i14 : 0.0f;
                float f6 = f3 / 2.0f;
                f = paddingTop + f6;
                f2 = (height - paddingBottom) - f6;
            } else {
                if (i10 != 5) {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.c);
                }
                int i15 = aVar.h;
                f3 = i15 != 0 ? (height - aVar.e) / (i15 + 1) : 0.0f;
                f = paddingTop + f3;
                f2 = (height - paddingBottom) - f3;
            }
            measuredHeight = f - this.m.d;
            measuredHeight2 = f2 - this.m.d;
            fMax = Math.max(f3, 0.0f);
            iB = aVar.b();
            i = 0;
            i2 = i9;
            while (i2 < i9 + iB) {
                viewB = b(i2);
                if (viewB == null) {
                    i3 = i2;
                    z2 = z3;
                    f4 = fMax;
                } else {
                    com.google.android.flexbox.b bVar = this.i;
                    f4 = fMax;
                    long j = bVar.d[i2];
                    iY = bVar.y(j);
                    iX = this.i.x(j);
                    layoutParams = (LayoutParams) viewB.getLayoutParams();
                    if (shouldMeasureChild(viewB, iY, iX, layoutParams)) {
                        viewB.measure(iY, iX);
                    }
                    topDecorationHeight = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + getTopDecorationHeight(viewB);
                    bottomDecorationHeight = measuredHeight2 - (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + getBottomDecorationHeight(viewB));
                    if (cVar.i == 1) {
                        calculateItemDecorationsForChild(viewB, A);
                        addView(viewB);
                    } else {
                        calculateItemDecorationsForChild(viewB, A);
                        addView(viewB, i);
                        i++;
                    }
                    int i16 = i;
                    leftDecorationWidth = i7 + getLeftDecorationWidth(viewB);
                    rightDecorationWidth = i8 - getRightDecorationWidth(viewB);
                    z = this.f;
                    if (z) {
                        z2 = true;
                        view = viewB;
                        i3 = i2;
                        if (this.g) {
                            this.i.R(view, aVar, z, leftDecorationWidth, Math.round(bottomDecorationHeight) - view.getMeasuredHeight(), leftDecorationWidth + view.getMeasuredWidth(), Math.round(bottomDecorationHeight));
                        } else {
                            this.i.R(view, aVar, z, leftDecorationWidth, Math.round(topDecorationHeight), leftDecorationWidth + view.getMeasuredWidth(), Math.round(topDecorationHeight) + view.getMeasuredHeight());
                        }
                    } else if (this.g) {
                        z2 = true;
                        view = viewB;
                        i3 = i2;
                        this.i.R(viewB, aVar, z, rightDecorationWidth - viewB.getMeasuredWidth(), Math.round(bottomDecorationHeight) - viewB.getMeasuredHeight(), rightDecorationWidth, Math.round(bottomDecorationHeight));
                    } else {
                        z2 = true;
                        view = viewB;
                        i3 = i2;
                        this.i.R(view, aVar, z, rightDecorationWidth - view.getMeasuredWidth(), Math.round(topDecorationHeight), rightDecorationWidth, Math.round(topDecorationHeight) + view.getMeasuredHeight());
                    }
                    View view2 = view;
                    measuredHeight = topDecorationHeight + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + getBottomDecorationHeight(view2) + f4;
                    i = i16;
                    measuredHeight2 = bottomDecorationHeight - (((view2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) + getTopDecorationHeight(view2)) + f4);
                }
                i2 = i3 + 1;
                fMax = f4;
                z3 = z2;
            }
            c.n(cVar, this.l.i);
            return aVar.a();
        }
        f = paddingTop;
        f2 = height - paddingBottom;
        f3 = 0.0f;
        measuredHeight = f - this.m.d;
        measuredHeight2 = f2 - this.m.d;
        fMax = Math.max(f3, 0.0f);
        iB = aVar.b();
        i = 0;
        i2 = i9;
        while (i2 < i9 + iB) {
            viewB = b(i2);
            if (viewB == null) {
                i3 = i2;
                z2 = z3;
                f4 = fMax;
            } else {
                com.google.android.flexbox.b bVar2 = this.i;
                f4 = fMax;
                long j2 = bVar2.d[i2];
                iY = bVar2.y(j2);
                iX = this.i.x(j2);
                layoutParams = (LayoutParams) viewB.getLayoutParams();
                if (shouldMeasureChild(viewB, iY, iX, layoutParams)) {
                    viewB.measure(iY, iX);
                }
                topDecorationHeight = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + getTopDecorationHeight(viewB);
                bottomDecorationHeight = measuredHeight2 - (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + getBottomDecorationHeight(viewB));
                if (cVar.i == 1) {
                    calculateItemDecorationsForChild(viewB, A);
                    addView(viewB);
                } else {
                    calculateItemDecorationsForChild(viewB, A);
                    addView(viewB, i);
                    i++;
                }
                int i17 = i;
                leftDecorationWidth = i7 + getLeftDecorationWidth(viewB);
                rightDecorationWidth = i8 - getRightDecorationWidth(viewB);
                z = this.f;
                if (z) {
                    z2 = true;
                    view = viewB;
                    i3 = i2;
                    if (this.g) {
                        this.i.R(view, aVar, z, leftDecorationWidth, Math.round(bottomDecorationHeight) - view.getMeasuredHeight(), leftDecorationWidth + view.getMeasuredWidth(), Math.round(bottomDecorationHeight));
                    } else {
                        this.i.R(view, aVar, z, leftDecorationWidth, Math.round(topDecorationHeight), leftDecorationWidth + view.getMeasuredWidth(), Math.round(topDecorationHeight) + view.getMeasuredHeight());
                    }
                } else if (this.g) {
                    z2 = true;
                    view = viewB;
                    i3 = i2;
                    this.i.R(viewB, aVar, z, rightDecorationWidth - viewB.getMeasuredWidth(), Math.round(bottomDecorationHeight) - viewB.getMeasuredHeight(), rightDecorationWidth, Math.round(bottomDecorationHeight));
                } else {
                    z2 = true;
                    view = viewB;
                    i3 = i2;
                    this.i.R(view, aVar, z, rightDecorationWidth - view.getMeasuredWidth(), Math.round(topDecorationHeight), rightDecorationWidth, Math.round(topDecorationHeight) + view.getMeasuredHeight());
                }
                View view3 = view;
                measuredHeight = topDecorationHeight + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + getBottomDecorationHeight(view3) + f4;
                i = i17;
                measuredHeight2 = bottomDecorationHeight - (((view3.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) + getTopDecorationHeight(view3)) + f4);
            }
            i2 = i3 + 1;
            fMax = f4;
            z3 = z2;
        }
        c.n(cVar, this.l.i);
        return aVar.a();
    }

    public final void M(RecyclerView.u uVar, c cVar) {
        if (cVar.j) {
            if (cVar.i == -1) {
                N(uVar, cVar);
            } else {
                O(uVar, cVar);
            }
        }
    }

    public final void N(RecyclerView.u uVar, c cVar) {
        int childCount;
        int i;
        View childAt;
        int i2;
        if (cVar.f < 0 || (childCount = getChildCount()) == 0 || (childAt = getChildAt((i = childCount - 1))) == null || (i2 = this.i.c[getPosition(childAt)]) == -1) {
            return;
        }
        com.google.android.flexbox.a aVar = this.h.get(i2);
        for (int i3 = i; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            if (childAt2 != null) {
                if (!r(childAt2, cVar.f)) {
                    break;
                }
                if (aVar.o != getPosition(childAt2)) {
                    continue;
                } else if (i2 <= 0) {
                    childCount = i3;
                    break;
                } else {
                    i2 += cVar.i;
                    aVar = this.h.get(i2);
                    childCount = i3;
                }
            }
        }
        recycleChildren(uVar, childCount, i);
    }

    public final void O(RecyclerView.u uVar, c cVar) {
        int childCount;
        View childAt;
        if (cVar.f < 0 || (childCount = getChildCount()) == 0 || (childAt = getChildAt(0)) == null) {
            return;
        }
        int i = this.i.c[getPosition(childAt)];
        int i2 = -1;
        if (i == -1) {
            return;
        }
        com.google.android.flexbox.a aVar = this.h.get(i);
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            if (childAt2 != null) {
                if (!s(childAt2, cVar.f)) {
                    break;
                }
                if (aVar.p != getPosition(childAt2)) {
                    continue;
                } else if (i >= this.h.size() - 1) {
                    i2 = i3;
                    break;
                } else {
                    i += cVar.i;
                    aVar = this.h.get(i);
                    i2 = i3;
                }
            }
        }
        recycleChildren(uVar, 0, i2);
    }

    public final void P() {
        int heightMode = j() ? getHeightMode() : getWidthMode();
        this.l.f8487b = heightMode == 0 || heightMode == Integer.MIN_VALUE;
    }

    public final void Q() {
        int layoutDirection = getLayoutDirection();
        int i = this.f8477a;
        if (i == 0) {
            this.f = layoutDirection == 1;
            this.g = this.f8478b == 2;
            return;
        }
        if (i == 1) {
            this.f = layoutDirection != 1;
            this.g = this.f8478b == 2;
            return;
        }
        if (i == 2) {
            boolean z = layoutDirection == 1;
            this.f = z;
            if (this.f8478b == 2) {
                this.f = !z;
            }
            this.g = false;
            return;
        }
        if (i != 3) {
            this.f = false;
            this.g = false;
            return;
        }
        boolean z2 = layoutDirection == 1;
        this.f = z2;
        if (this.f8478b == 2) {
            this.f = !z2;
        }
        this.g = true;
    }

    public void R(int i) {
        int i2 = this.d;
        if (i2 != i) {
            if (i2 == 4 || i == 4) {
                removeAllViews();
                t();
            }
            this.d = i;
            requestLayout();
        }
    }

    public void S(int i) {
        if (this.f8477a != i) {
            removeAllViews();
            this.f8477a = i;
            this.n = null;
            this.o = null;
            t();
            requestLayout();
        }
    }

    public void T(int i) {
        if (i == 2) {
            throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
        }
        int i2 = this.f8478b;
        if (i2 != i) {
            if (i2 == 0 || i == 0) {
                removeAllViews();
                t();
            }
            this.f8478b = i;
            this.n = null;
            this.o = null;
            requestLayout();
        }
    }

    public void U(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }

    public final boolean V(RecyclerView.z zVar, b bVar) {
        if (getChildCount() == 0) {
            return false;
        }
        View viewY = bVar.e ? y(zVar.c()) : w(zVar.c());
        if (viewY == null) {
            return false;
        }
        bVar.s(viewY);
        if (zVar.f() || !supportsPredictiveItemAnimations()) {
            return true;
        }
        if (this.n.g(viewY) < this.n.i() && this.n.d(viewY) >= this.n.m()) {
            return true;
        }
        bVar.c = bVar.e ? this.n.i() : this.n.m();
        return true;
    }

    public final boolean W(RecyclerView.z zVar, b bVar, SavedState savedState) {
        int i;
        View childAt;
        if (!zVar.f() && (i = this.q) != -1) {
            if (i >= 0 && i < zVar.c()) {
                bVar.f8484a = this.q;
                bVar.f8485b = this.i.c[bVar.f8484a];
                SavedState savedState2 = this.p;
                if (savedState2 != null && savedState2.h(zVar.c())) {
                    bVar.c = this.n.m() + savedState.f8483b;
                    bVar.g = true;
                    bVar.f8485b = -1;
                    return true;
                }
                if (this.f8480r != Integer.MIN_VALUE) {
                    if (j() || !this.f) {
                        bVar.c = this.n.m() + this.f8480r;
                    } else {
                        bVar.c = this.f8480r - this.n.j();
                    }
                    return true;
                }
                View viewFindViewByPosition = findViewByPosition(this.q);
                if (viewFindViewByPosition == null) {
                    if (getChildCount() > 0 && (childAt = getChildAt(0)) != null) {
                        bVar.e = this.q < getPosition(childAt);
                    }
                    bVar.r();
                } else {
                    if (this.n.e(viewFindViewByPosition) > this.n.n()) {
                        bVar.r();
                        return true;
                    }
                    if (this.n.g(viewFindViewByPosition) - this.n.m() < 0) {
                        bVar.c = this.n.m();
                        bVar.e = false;
                        return true;
                    }
                    if (this.n.i() - this.n.d(viewFindViewByPosition) < 0) {
                        bVar.c = this.n.i();
                        bVar.e = true;
                        return true;
                    }
                    bVar.c = bVar.e ? this.n.d(viewFindViewByPosition) + this.n.o() : this.n.g(viewFindViewByPosition);
                }
                return true;
            }
            this.q = -1;
            this.f8480r = Integer.MIN_VALUE;
        }
        return false;
    }

    public final void X(RecyclerView.z zVar, b bVar) {
        if (W(zVar, bVar, this.p) || V(zVar, bVar)) {
            return;
        }
        bVar.r();
        bVar.f8484a = 0;
        bVar.f8485b = 0;
    }

    public final void Y(int i) {
        if (i >= findLastVisibleItemPosition()) {
            return;
        }
        int childCount = getChildCount();
        this.i.t(childCount);
        this.i.u(childCount);
        this.i.s(childCount);
        if (i >= this.i.c.length) {
            return;
        }
        this.y = i;
        View childClosestToStart = getChildClosestToStart();
        if (childClosestToStart == null) {
            return;
        }
        this.q = getPosition(childClosestToStart);
        if (j() || !this.f) {
            this.f8480r = this.n.g(childClosestToStart) - this.n.m();
        } else {
            this.f8480r = this.n.d(childClosestToStart) + this.n.j();
        }
    }

    public final void Z(int i) {
        int i2;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        int width = getWidth();
        int height = getHeight();
        boolean z = false;
        if (j()) {
            int i3 = this.s;
            if (i3 != Integer.MIN_VALUE && i3 != width) {
                z = true;
            }
            i2 = this.l.f8487b ? this.w.getResources().getDisplayMetrics().heightPixels : this.l.f8486a;
        } else {
            int i4 = this.t;
            if (i4 != Integer.MIN_VALUE && i4 != height) {
                z = true;
            }
            i2 = this.l.f8487b ? this.w.getResources().getDisplayMetrics().widthPixels : this.l.f8486a;
        }
        int i5 = i2;
        this.s = width;
        this.t = height;
        int i6 = this.y;
        if (i6 == -1 && (this.q != -1 || z)) {
            if (this.m.e) {
                return;
            }
            this.h.clear();
            this.z.a();
            if (j()) {
                this.i.e(this.z, iMakeMeasureSpec, iMakeMeasureSpec2, i5, this.m.f8484a, this.h);
            } else {
                this.i.h(this.z, iMakeMeasureSpec, iMakeMeasureSpec2, i5, this.m.f8484a, this.h);
            }
            this.h = this.z.f8494a;
            this.i.p(iMakeMeasureSpec, iMakeMeasureSpec2);
            this.i.X();
            b bVar = this.m;
            bVar.f8485b = this.i.c[bVar.f8484a];
            this.l.c = this.m.f8485b;
            return;
        }
        int iMin = i6 != -1 ? Math.min(i6, this.m.f8484a) : this.m.f8484a;
        this.z.a();
        if (j()) {
            if (this.h.size() > 0) {
                this.i.j(this.h, iMin);
                this.i.b(this.z, iMakeMeasureSpec, iMakeMeasureSpec2, i5, iMin, this.m.f8484a, this.h);
            } else {
                this.i.s(i);
                this.i.d(this.z, iMakeMeasureSpec, iMakeMeasureSpec2, i5, 0, this.h);
            }
        } else if (this.h.size() > 0) {
            this.i.j(this.h, iMin);
            this.i.b(this.z, iMakeMeasureSpec2, iMakeMeasureSpec, i5, iMin, this.m.f8484a, this.h);
        } else {
            this.i.s(i);
            this.i.g(this.z, iMakeMeasureSpec, iMakeMeasureSpec2, i5, 0, this.h);
        }
        this.h = this.z.f8494a;
        this.i.q(iMakeMeasureSpec, iMakeMeasureSpec2, iMin);
        this.i.Y(iMin);
    }

    @Override // defpackage.kx9
    public void a(View view, int i, int i2, com.google.android.flexbox.a aVar) {
        calculateItemDecorationsForChild(view, A);
        if (j()) {
            int leftDecorationWidth = getLeftDecorationWidth(view) + getRightDecorationWidth(view);
            aVar.e += leftDecorationWidth;
            aVar.f += leftDecorationWidth;
        } else {
            int topDecorationHeight = getTopDecorationHeight(view) + getBottomDecorationHeight(view);
            aVar.e += topDecorationHeight;
            aVar.f += topDecorationHeight;
        }
    }

    public final void a0(int i, int i2) {
        this.l.i = i;
        boolean zJ = j();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        boolean z = !zJ && this.f;
        if (i == 1) {
            View childAt = getChildAt(getChildCount() - 1);
            if (childAt == null) {
                return;
            }
            this.l.e = this.n.d(childAt);
            int position = getPosition(childAt);
            View viewZ = z(childAt, this.h.get(this.i.c[position]));
            this.l.h = 1;
            c cVar = this.l;
            cVar.d = position + cVar.h;
            if (this.i.c.length <= this.l.d) {
                this.l.c = -1;
            } else {
                c cVar2 = this.l;
                cVar2.c = this.i.c[cVar2.d];
            }
            if (z) {
                this.l.e = this.n.g(viewZ);
                this.l.f = (-this.n.g(viewZ)) + this.n.m();
                c cVar3 = this.l;
                cVar3.f = Math.max(cVar3.f, 0);
            } else {
                this.l.e = this.n.d(viewZ);
                this.l.f = this.n.d(viewZ) - this.n.i();
            }
            if ((this.l.c == -1 || this.l.c > this.h.size() - 1) && this.l.d <= getFlexItemCount()) {
                int i3 = i2 - this.l.f;
                this.z.a();
                if (i3 > 0) {
                    if (zJ) {
                        this.i.d(this.z, iMakeMeasureSpec, iMakeMeasureSpec2, i3, this.l.d, this.h);
                    } else {
                        this.i.g(this.z, iMakeMeasureSpec, iMakeMeasureSpec2, i3, this.l.d, this.h);
                    }
                    this.i.q(iMakeMeasureSpec, iMakeMeasureSpec2, this.l.d);
                    this.i.Y(this.l.d);
                }
            }
        } else {
            View childAt2 = getChildAt(0);
            if (childAt2 == null) {
                return;
            }
            this.l.e = this.n.g(childAt2);
            int position2 = getPosition(childAt2);
            View viewX = x(childAt2, this.h.get(this.i.c[position2]));
            this.l.h = 1;
            int i4 = this.i.c[position2];
            if (i4 == -1) {
                i4 = 0;
            }
            if (i4 > 0) {
                this.l.d = position2 - this.h.get(i4 - 1).b();
            } else {
                this.l.d = -1;
            }
            this.l.c = i4 > 0 ? i4 - 1 : 0;
            if (z) {
                this.l.e = this.n.d(viewX);
                this.l.f = this.n.d(viewX) - this.n.i();
                c cVar4 = this.l;
                cVar4.f = Math.max(cVar4.f, 0);
            } else {
                this.l.e = this.n.g(viewX);
                this.l.f = (-this.n.g(viewX)) + this.n.m();
            }
        }
        c cVar5 = this.l;
        cVar5.f8486a = i2 - cVar5.f;
    }

    @Override // defpackage.kx9
    public View b(int i) {
        View view = this.v.get(i);
        return view != null ? view : this.j.o(i);
    }

    public final void b0(b bVar, boolean z, boolean z2) {
        if (z2) {
            P();
        } else {
            this.l.f8487b = false;
        }
        if (j() || !this.f) {
            this.l.f8486a = this.n.i() - bVar.c;
        } else {
            this.l.f8486a = bVar.c - getPaddingRight();
        }
        this.l.d = bVar.f8484a;
        this.l.h = 1;
        this.l.i = 1;
        this.l.e = bVar.c;
        this.l.f = Integer.MIN_VALUE;
        this.l.c = bVar.f8485b;
        if (!z || this.h.size() <= 1 || bVar.f8485b < 0 || bVar.f8485b >= this.h.size() - 1) {
            return;
        }
        com.google.android.flexbox.a aVar = this.h.get(bVar.f8485b);
        c.l(this.l);
        c.u(this.l, aVar.b());
    }

    @Override // defpackage.kx9
    public int c(int i, int i2, int i3) {
        return RecyclerView.o.getChildMeasureSpec(getHeight(), getHeightMode(), i2, i3, canScrollVertically());
    }

    public final void c0(b bVar, boolean z, boolean z2) {
        if (z2) {
            P();
        } else {
            this.l.f8487b = false;
        }
        if (j() || !this.f) {
            this.l.f8486a = bVar.c - this.n.m();
        } else {
            this.l.f8486a = (this.x.getWidth() - bVar.c) - this.n.m();
        }
        this.l.d = bVar.f8484a;
        this.l.h = 1;
        this.l.i = -1;
        this.l.e = bVar.c;
        this.l.f = Integer.MIN_VALUE;
        this.l.c = bVar.f8485b;
        if (!z || bVar.f8485b <= 0 || this.h.size() <= bVar.f8485b) {
            return;
        }
        com.google.android.flexbox.a aVar = this.h.get(bVar.f8485b);
        c.m(this.l);
        c.v(this.l, aVar.b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollHorizontally() {
        if (this.f8478b == 0) {
            return j();
        }
        if (j()) {
            int width = getWidth();
            View view = this.x;
            if (width <= (view != null ? view.getWidth() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollVertically() {
        if (this.f8478b == 0) {
            return !j();
        }
        if (j()) {
            return true;
        }
        int height = getHeight();
        View view = this.x;
        return height > (view != null ? view.getHeight() : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollExtent(RecyclerView.z zVar) {
        return computeScrollExtent(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollOffset(RecyclerView.z zVar) {
        return computeScrollOffset(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollRange(RecyclerView.z zVar) {
        return computeScrollRange(zVar);
    }

    public final int computeScrollExtent(RecyclerView.z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iC = zVar.c();
        u();
        View viewW = w(iC);
        View viewY = y(iC);
        if (zVar.c() == 0 || viewW == null || viewY == null) {
            return 0;
        }
        return Math.min(this.n.n(), this.n.d(viewY) - this.n.g(viewW));
    }

    public final int computeScrollOffset(RecyclerView.z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iC = zVar.c();
        View viewW = w(iC);
        View viewY = y(iC);
        if (zVar.c() != 0 && viewW != null && viewY != null) {
            int position = getPosition(viewW);
            int position2 = getPosition(viewY);
            int iAbs = Math.abs(this.n.d(viewY) - this.n.g(viewW));
            int[] iArr = this.i.c;
            int i = iArr[position];
            if (i != 0 && i != -1) {
                return Math.round((i * (iAbs / ((iArr[position2] - i) + 1))) + (this.n.m() - this.n.g(viewW)));
            }
        }
        return 0;
    }

    public final int computeScrollRange(RecyclerView.z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iC = zVar.c();
        View viewW = w(iC);
        View viewY = y(iC);
        if (zVar.c() == 0 || viewW == null || viewY == null) {
            return 0;
        }
        return (int) ((Math.abs(this.n.d(viewY) - this.n.g(viewW)) / ((findLastVisibleItemPosition() - findFirstVisibleItemPosition()) + 1)) * zVar.c());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF computeScrollVectorForPosition(int i) {
        View childAt;
        if (getChildCount() == 0 || (childAt = getChildAt(0)) == null) {
            return null;
        }
        int i2 = i < getPosition(childAt) ? -1 : 1;
        return j() ? new PointF(0.0f, i2) : new PointF(i2, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollExtent(RecyclerView.z zVar) {
        return computeScrollExtent(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollOffset(RecyclerView.z zVar) {
        return computeScrollOffset(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollRange(RecyclerView.z zVar) {
        return computeScrollRange(zVar);
    }

    @Override // defpackage.kx9
    public int d(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (j()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return leftDecorationWidth + rightDecorationWidth;
    }

    @Override // defpackage.kx9
    public View e(int i) {
        return b(i);
    }

    @Override // defpackage.kx9
    public int f(View view, int i, int i2) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (j()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return topDecorationHeight + bottomDecorationHeight;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewA = A(0, getChildCount(), true);
        if (viewA == null) {
            return -1;
        }
        return getPosition(viewA);
    }

    public int findFirstVisibleItemPosition() {
        View viewA = A(0, getChildCount(), false);
        if (viewA == null) {
            return -1;
        }
        return getPosition(viewA);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewA = A(getChildCount() - 1, -1, true);
        if (viewA == null) {
            return -1;
        }
        return getPosition(viewA);
    }

    public int findLastVisibleItemPosition() {
        View viewA = A(getChildCount() - 1, -1, false);
        if (viewA == null) {
            return -1;
        }
        return getPosition(viewA);
    }

    public final int fixLayoutEndGap(int i, RecyclerView.u uVar, RecyclerView.z zVar, boolean z) {
        int iG;
        int i2;
        if (j() || !this.f) {
            int i3 = this.n.i() - i;
            if (i3 <= 0) {
                return 0;
            }
            iG = -G(-i3, uVar, zVar);
        } else {
            int iM = i - this.n.m();
            if (iM <= 0) {
                return 0;
            }
            iG = G(iM, uVar, zVar);
        }
        int i4 = i + iG;
        if (!z || (i2 = this.n.i() - i4) <= 0) {
            return iG;
        }
        this.n.r(i2);
        return i2 + iG;
    }

    public final int fixLayoutStartGap(int i, RecyclerView.u uVar, RecyclerView.z zVar, boolean z) {
        int iG;
        int iM;
        if (j() || !this.f) {
            int iM2 = i - this.n.m();
            if (iM2 <= 0) {
                return 0;
            }
            iG = -G(iM2, uVar, zVar);
        } else {
            int i2 = this.n.i() - i;
            if (i2 <= 0) {
                return 0;
            }
            iG = G(-i2, uVar, zVar);
        }
        int i3 = i + iG;
        if (!z || (iM = i3 - this.n.m()) <= 0) {
            return iG;
        }
        this.n.r(-iM);
        return iG - iM;
    }

    @Override // defpackage.kx9
    public int g(int i, int i2, int i3) {
        return RecyclerView.o.getChildMeasureSpec(getWidth(), getWidthMode(), i2, i3, canScrollHorizontally());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // defpackage.kx9
    public int getAlignContent() {
        return 5;
    }

    @Override // defpackage.kx9
    public int getAlignItems() {
        return this.d;
    }

    public final View getChildClosestToStart() {
        return getChildAt(0);
    }

    @Override // defpackage.kx9
    public int getFlexDirection() {
        return this.f8477a;
    }

    @Override // defpackage.kx9
    public int getFlexItemCount() {
        return this.f8479k.c();
    }

    @Override // defpackage.kx9
    public List<com.google.android.flexbox.a> getFlexLinesInternal() {
        return this.h;
    }

    @Override // defpackage.kx9
    public int getFlexWrap() {
        return this.f8478b;
    }

    @Override // defpackage.kx9
    public int getLargestMainSize() {
        if (this.h.size() == 0) {
            return 0;
        }
        int size = this.h.size();
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, this.h.get(i).e);
        }
        return iMax;
    }

    @Override // defpackage.kx9
    public int getMaxLine() {
        return this.e;
    }

    @Override // defpackage.kx9
    public int getSumOfCrossSize() {
        int size = this.h.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.h.get(i2).g;
        }
        return i;
    }

    @Override // defpackage.kx9
    public void h(com.google.android.flexbox.a aVar) {
    }

    @Override // defpackage.kx9
    public void i(int i, View view) {
        this.v.put(i, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // defpackage.kx9
    public boolean j() {
        int i = this.f8477a;
        return i == 0 || i == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.x = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.onDetachedFromWindow(recyclerView, uVar);
        if (this.u) {
            removeAndRecycleAllViews(uVar);
            uVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        super.onItemsAdded(recyclerView, i, i2);
        Y(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        super.onItemsMoved(recyclerView, i, i2, i3);
        Y(Math.min(i, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
        Y(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.onItemsUpdated(recyclerView, i, i2, obj);
        Y(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutChildren(RecyclerView.u uVar, RecyclerView.z zVar) {
        int i;
        int i2;
        this.j = uVar;
        this.f8479k = zVar;
        int iC = zVar.c();
        if (iC == 0 && zVar.f()) {
            return;
        }
        Q();
        u();
        ensureLayoutState();
        this.i.t(iC);
        this.i.u(iC);
        this.i.s(iC);
        this.l.j = false;
        SavedState savedState = this.p;
        if (savedState != null && savedState.h(iC)) {
            this.q = this.p.f8482a;
        }
        if (!this.m.f || this.q != -1 || this.p != null) {
            this.m.t();
            X(zVar, this.m);
            this.m.f = true;
        }
        detachAndScrapAttachedViews(uVar);
        if (this.m.e) {
            c0(this.m, false, true);
        } else {
            b0(this.m, false, true);
        }
        Z(iC);
        v(uVar, zVar, this.l);
        if (this.m.e) {
            i2 = this.l.e;
            b0(this.m, true, false);
            v(uVar, zVar, this.l);
            i = this.l.e;
        } else {
            i = this.l.e;
            c0(this.m, true, false);
            v(uVar, zVar, this.l);
            i2 = this.l.e;
        }
        if (getChildCount() > 0) {
            if (this.m.e) {
                fixLayoutStartGap(i2 + fixLayoutEndGap(i, uVar, zVar, true), uVar, zVar, false);
            } else {
                fixLayoutEndGap(i + fixLayoutStartGap(i2, uVar, zVar, true), uVar, zVar, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutCompleted(RecyclerView.z zVar) {
        super.onLayoutCompleted(zVar);
        this.p = null;
        this.q = -1;
        this.f8480r = Integer.MIN_VALUE;
        this.y = -1;
        this.m.t();
        this.v.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.p = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable onSaveInstanceState() {
        if (this.p != null) {
            return new SavedState(this.p);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() > 0) {
            View childClosestToStart = getChildClosestToStart();
            savedState.f8482a = getPosition(childClosestToStart);
            savedState.f8483b = this.n.g(childClosestToStart) - this.n.m();
        } else {
            savedState.i();
        }
        return savedState;
    }

    public final boolean r(View view, int i) {
        if (j() || !this.f) {
            return this.n.g(view) >= this.n.h() - i;
        }
        return this.n.d(view) <= i;
    }

    public final void recycleChildren(RecyclerView.u uVar, int i, int i2) {
        while (i2 >= i) {
            removeAndRecycleViewAt(i2, uVar);
            i2--;
        }
    }

    public final boolean s(View view, int i) {
        if (j() || !this.f) {
            return this.n.d(view) <= i;
        }
        return this.n.h() - this.n.g(view) <= i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int scrollHorizontallyBy(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (!j() || this.f8478b == 0) {
            int iG = G(i, uVar, zVar);
            this.v.clear();
            return iG;
        }
        int iH = H(i);
        b.l(this.m, iH);
        this.o.r(-iH);
        return iH;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void scrollToPosition(int i) {
        this.q = i;
        this.f8480r = Integer.MIN_VALUE;
        SavedState savedState = this.p;
        if (savedState != null) {
            savedState.i();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int scrollVerticallyBy(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (j() || (this.f8478b == 0 && !j())) {
            int iG = G(i, uVar, zVar);
            this.v.clear();
            return iG;
        }
        int iH = H(i);
        b.l(this.m, iH);
        this.o.r(-iH);
        return iH;
    }

    @Override // defpackage.kx9
    public void setFlexLines(List<com.google.android.flexbox.a> list) {
        this.h = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.z zVar, int i) {
        n nVar = new n(recyclerView.getContext());
        nVar.setTargetPosition(i);
        startSmoothScroll(nVar);
    }

    public final void t() {
        this.h.clear();
        this.m.t();
        this.m.d = 0;
    }

    public final void u() {
        if (this.n != null) {
            return;
        }
        if (j()) {
            if (this.f8478b == 0) {
                this.n = s.a(this);
                this.o = s.c(this);
                return;
            } else {
                this.n = s.c(this);
                this.o = s.a(this);
                return;
            }
        }
        if (this.f8478b == 0) {
            this.n = s.c(this);
            this.o = s.a(this);
        } else {
            this.n = s.a(this);
            this.o = s.c(this);
        }
    }

    public final int v(RecyclerView.u uVar, RecyclerView.z zVar, c cVar) {
        if (cVar.f != Integer.MIN_VALUE) {
            if (cVar.f8486a < 0) {
                c.q(cVar, cVar.f8486a);
            }
            M(uVar, cVar);
        }
        int i = cVar.f8486a;
        int iA = cVar.f8486a;
        boolean zJ = j();
        int iJ = 0;
        while (true) {
            if ((iA <= 0 && !this.l.f8487b) || !cVar.D(zVar, this.h)) {
                break;
            }
            com.google.android.flexbox.a aVar = this.h.get(cVar.c);
            cVar.d = aVar.o;
            iJ += J(aVar, cVar);
            if (zJ || !this.f) {
                c.c(cVar, aVar.a() * cVar.i);
            } else {
                c.d(cVar, aVar.a() * cVar.i);
            }
            iA -= aVar.a();
        }
        c.i(cVar, iJ);
        if (cVar.f != Integer.MIN_VALUE) {
            c.q(cVar, iJ);
            if (cVar.f8486a < 0) {
                c.q(cVar, cVar.f8486a);
            }
            M(uVar, cVar);
        }
        return i - cVar.f8486a;
    }

    public final View w(int i) {
        View viewB = B(0, getChildCount(), i);
        if (viewB == null) {
            return null;
        }
        int i2 = this.i.c[getPosition(viewB)];
        if (i2 == -1) {
            return null;
        }
        return x(viewB, this.h.get(i2));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    public final View x(View view, com.google.android.flexbox.a aVar) {
        boolean zJ = j();
        int i = aVar.h;
        for (int i2 = 1; i2 < i; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.f || zJ) {
                    if (this.n.g(view) > this.n.g(childAt)) {
                        view = childAt;
                    }
                } else if (this.n.d(view) < this.n.d(childAt)) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final View y(int i) {
        View viewB = B(getChildCount() - 1, -1, i);
        if (viewB == null) {
            return null;
        }
        return z(viewB, this.h.get(this.i.c[getPosition(viewB)]));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    public final View z(View view, com.google.android.flexbox.a aVar) {
        boolean zJ = j();
        int childCount = (getChildCount() - aVar.h) - 1;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.f || zJ) {
                    if (this.n.d(view) < this.n.d(childAt)) {
                        view = childAt;
                    }
                } else if (this.n.g(view) > this.n.g(childAt)) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8483b;

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

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean h(int i) {
            int i2 = this.f8482a;
            return i2 >= 0 && i2 < i;
        }

        public final void i() {
            this.f8482a = -1;
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.f8482a + ", mAnchorOffset=" + this.f8483b + AbstractJsonLexerKt.END_OBJ;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f8482a);
            parcel.writeInt(this.f8483b);
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f8482a = parcel.readInt();
            this.f8483b = parcel.readInt();
        }

        public SavedState(SavedState savedState) {
            this.f8482a = savedState.f8482a;
            this.f8483b = savedState.f8483b;
        }
    }

    public FlexboxLayoutManager(Context context, int i) {
        this(context, i, 1);
    }

    public FlexboxLayoutManager(Context context, int i, int i2) {
        this.e = -1;
        this.h = new ArrayList();
        this.i = new com.google.android.flexbox.b(this);
        this.m = new b();
        this.q = -1;
        this.f8480r = Integer.MIN_VALUE;
        this.s = Integer.MIN_VALUE;
        this.t = Integer.MIN_VALUE;
        this.v = new SparseArray<>();
        this.y = -1;
        this.z = new com.google.android.flexbox.b.C0209b();
        S(i);
        T(i2);
        R(4);
        this.w = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        super.onItemsUpdated(recyclerView, i, i2);
        Y(i);
    }

    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();
        public float e;
        public float f;
        public int g;
        public float h;
        public int i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f8481k;
        public int l;
        public boolean m;

        public class a implements Parcelable.Creator<LayoutParams> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = -1;
            this.h = -1.0f;
            this.f8481k = 16777215;
            this.l = 16777215;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int D() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int S() {
            return this.g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float T() {
            return this.f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void Z(int i) {
            this.j = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float b0() {
            return this.e;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float c0() {
            return this.h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean d0() {
            return this.m;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int f0() {
            return this.f8481k;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void m0(int i) {
            this.i = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int n0() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int p() {
            return this.i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int r0() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int s() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int s0() {
            return this.j;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int t0() {
            return this.l;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.e);
            parcel.writeFloat(this.f);
            parcel.writeInt(this.g);
            parcel.writeFloat(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.f8481k);
            parcel.writeInt(this.l);
            parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = -1;
            this.h = -1.0f;
            this.f8481k = 16777215;
            this.l = 16777215;
        }

        public LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = -1;
            this.h = -1.0f;
            this.f8481k = 16777215;
            this.l = 16777215;
            this.e = parcel.readFloat();
            this.f = parcel.readFloat();
            this.g = parcel.readInt();
            this.h = parcel.readFloat();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.f8481k = parcel.readInt();
            this.l = parcel.readInt();
            this.m = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.e = -1;
        this.h = new ArrayList();
        this.i = new com.google.android.flexbox.b(this);
        this.m = new b();
        this.q = -1;
        this.f8480r = Integer.MIN_VALUE;
        this.s = Integer.MIN_VALUE;
        this.t = Integer.MIN_VALUE;
        this.v = new SparseArray<>();
        this.y = -1;
        this.z = new com.google.android.flexbox.b.C0209b();
        RecyclerView.o.d properties = RecyclerView.o.getProperties(context, attributeSet, i, i2);
        int i3 = properties.f2814a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (properties.c) {
                    S(3);
                } else {
                    S(2);
                }
            }
        } else if (properties.c) {
            S(1);
        } else {
            S(0);
        }
        T(1);
        R(4);
        this.w = context;
    }
}
