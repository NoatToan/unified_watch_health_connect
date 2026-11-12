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
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FlexboxLayoutManager extends RecyclerView.LayoutManager implements com.google.android.flexbox.a, RecyclerView.SmoothScroller.ScrollVectorProvider {
    private static final String A = "FlexboxLayoutManager";
    private static final Rect B = new Rect();
    private static final boolean C = false;
    public static final /* synthetic */ boolean D = false;
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private List<FlexLine> h;
    private final com.google.android.flexbox.b i;
    private RecyclerView.Recycler j;
    private RecyclerView.State k;
    private c l;
    private b m;
    private OrientationHelper n;
    private OrientationHelper o;
    private SavedState p;
    private int q;
    private int r;
    private int s;
    private int t;
    private boolean u;
    private SparseArray<View> v;
    private final Context w;
    private View x;
    private int y;
    private com.google.android.flexbox.b.C0157b z;

    public class b {
        public static final /* synthetic */ boolean i = false;
        private int a;
        private int b;
        private int c;
        private int d;
        private boolean e;
        private boolean f;
        private boolean g;

        private b() {
            this.d = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q() {
            if (FlexboxLayoutManager.this.isMainAxisDirectionHorizontal() || !FlexboxLayoutManager.this.f) {
                this.c = this.e ? FlexboxLayoutManager.this.n.getEndAfterPadding() : FlexboxLayoutManager.this.n.getStartAfterPadding();
            } else {
                this.c = this.e ? FlexboxLayoutManager.this.n.getEndAfterPadding() : FlexboxLayoutManager.this.getWidth() - FlexboxLayoutManager.this.n.getStartAfterPadding();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r(View view) {
            OrientationHelper orientationHelper = FlexboxLayoutManager.this.b == 0 ? FlexboxLayoutManager.this.o : FlexboxLayoutManager.this.n;
            if (FlexboxLayoutManager.this.isMainAxisDirectionHorizontal() || !FlexboxLayoutManager.this.f) {
                if (this.e) {
                    this.c = orientationHelper.getDecoratedEnd(view) + orientationHelper.getTotalSpaceChange();
                } else {
                    this.c = orientationHelper.getDecoratedStart(view);
                }
            } else if (this.e) {
                this.c = orientationHelper.getDecoratedStart(view) + orientationHelper.getTotalSpaceChange();
            } else {
                this.c = orientationHelper.getDecoratedEnd(view);
            }
            this.a = FlexboxLayoutManager.this.getPosition(view);
            this.g = false;
            int[] iArr = FlexboxLayoutManager.this.i.c;
            int i2 = this.a;
            if (i2 == -1) {
                i2 = 0;
            }
            int i3 = iArr[i2];
            this.b = i3 != -1 ? i3 : 0;
            if (FlexboxLayoutManager.this.h.size() > this.b) {
                this.a = ((FlexLine) FlexboxLayoutManager.this.h.get(this.b)).o;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s() {
            this.a = -1;
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            this.f = false;
            this.g = false;
            if (FlexboxLayoutManager.this.isMainAxisDirectionHorizontal()) {
                if (FlexboxLayoutManager.this.b == 0) {
                    this.e = FlexboxLayoutManager.this.a == 1;
                    return;
                } else {
                    this.e = FlexboxLayoutManager.this.b == 2;
                    return;
                }
            }
            if (FlexboxLayoutManager.this.b == 0) {
                this.e = FlexboxLayoutManager.this.a == 3;
            } else {
                this.e = FlexboxLayoutManager.this.b == 2;
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.a + ", mFlexLinePosition=" + this.b + ", mCoordinate=" + this.c + ", mPerpendicularCoordinate=" + this.d + ", mLayoutFromEnd=" + this.e + ", mValid=" + this.f + ", mAssignedFromSavedState=" + this.g + '}';
        }
    }

    public static class c {
        private static final int k = Integer.MIN_VALUE;
        private static final int l = -1;
        private static final int m = 1;
        private static final int n = 1;
        private int a;
        private boolean b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private boolean j;

        private c() {
            this.h = 1;
            this.i = 1;
        }

        public static /* synthetic */ int i(c cVar) {
            int i = cVar.c;
            cVar.c = i + 1;
            return i;
        }

        public static /* synthetic */ int j(c cVar) {
            int i = cVar.c;
            cVar.c = i - 1;
            return i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean w(RecyclerView.State state, List<FlexLine> list) {
            int i;
            int i2 = this.d;
            return i2 >= 0 && i2 < state.getItemCount() && (i = this.c) >= 0 && i < list.size();
        }

        public String toString() {
            return "LayoutState{mAvailable=" + this.a + ", mFlexLinePosition=" + this.c + ", mPosition=" + this.d + ", mOffset=" + this.e + ", mScrollingOffset=" + this.f + ", mLastScrollDelta=" + this.g + ", mItemDirection=" + this.h + ", mLayoutDirection=" + this.i + '}';
        }
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0, 1);
    }

    private boolean A(View view, boolean z) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int iT = t(view);
        int iV = v(view);
        int iU = u(view);
        int iS = s(view);
        boolean z2 = paddingLeft <= iT && width >= iU;
        boolean z3 = iT >= width || iU >= paddingLeft;
        boolean z4 = paddingTop <= iV && height >= iS;
        boolean z5 = iV >= height || iS >= paddingTop;
        if (z) {
            return z2 && z4;
        }
        return z3 && z5;
    }

    private int B(FlexLine flexLine, c cVar) {
        return isMainAxisDirectionHorizontal() ? C(flexLine, cVar) : D(flexLine, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:49:0x010e  */
    /* JADX WARN: Code duplicated, block: B:52:0x012f  */
    /* JADX WARN: Code duplicated, block: B:53:0x014f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0192 A[SYNTHETIC] */
    private int C(FlexLine flexLine, c cVar) {
        float f;
        float f2;
        float f3;
        float measuredWidth;
        float measuredWidth2;
        float fMax;
        int i;
        int itemCount;
        int i2;
        View flexItemAt;
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
            i3 -= flexLine.g;
        }
        int i4 = i3;
        int i5 = cVar.d;
        int i6 = this.c;
        int i7 = 1;
        if (i6 != 0) {
            if (i6 == 1) {
                int i8 = flexLine.e;
                float f4 = (width - i8) + paddingRight;
                f3 = 0.0f;
                f2 = i8 - paddingLeft;
                f = f4;
            } else if (i6 == 2) {
                int i9 = flexLine.e;
                f = paddingLeft + ((width - i9) / 2.0f);
                f2 = (width - paddingRight) - ((width - i9) / 2.0f);
            } else if (i6 == 3) {
                f = paddingLeft;
                int i10 = flexLine.h;
                f3 = (width - flexLine.e) / (i10 != 1 ? i10 - 1 : 1.0f);
                f2 = width - paddingRight;
            } else if (i6 == 4) {
                int i11 = flexLine.h;
                f3 = i11 != 0 ? (width - flexLine.e) / i11 : 0.0f;
                float f5 = f3 / 2.0f;
                f = paddingLeft + f5;
                f2 = (width - paddingRight) - f5;
            } else {
                if (i6 != 5) {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.c);
                }
                int i12 = flexLine.h;
                f3 = i12 != 0 ? (width - flexLine.e) / (i12 + 1) : 0.0f;
                f = paddingLeft + f3;
                f2 = (width - paddingRight) - f3;
            }
            measuredWidth = f - this.m.d;
            measuredWidth2 = f2 - this.m.d;
            fMax = Math.max(f3, 0.0f);
            i = 0;
            itemCount = flexLine.getItemCount();
            i2 = i5;
            while (i2 < i5 + itemCount) {
                flexItemAt = getFlexItemAt(i2);
                if (flexItemAt != null) {
                    if (cVar.i == i7) {
                        calculateItemDecorationsForChild(flexItemAt, B);
                        addView(flexItemAt);
                    } else {
                        calculateItemDecorationsForChild(flexItemAt, B);
                        addView(flexItemAt, i);
                        i++;
                    }
                    int i13 = i;
                    com.google.android.flexbox.b bVar = this.i;
                    long j = bVar.d[i2];
                    iY = bVar.y(j);
                    iX = this.i.x(j);
                    layoutParams = (LayoutParams) flexItemAt.getLayoutParams();
                    if (shouldMeasureChild(flexItemAt, iY, iX, layoutParams)) {
                        flexItemAt.measure(iY, iX);
                    }
                    leftDecorationWidth = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + getLeftDecorationWidth(flexItemAt);
                    rightDecorationWidth = measuredWidth2 - (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + getRightDecorationWidth(flexItemAt));
                    topDecorationHeight = i4 + getTopDecorationHeight(flexItemAt);
                    if (this.f) {
                        this.i.Q(flexItemAt, flexLine, Math.round(rightDecorationWidth) - flexItemAt.getMeasuredWidth(), topDecorationHeight, Math.round(rightDecorationWidth), topDecorationHeight + flexItemAt.getMeasuredHeight());
                    } else {
                        this.i.Q(flexItemAt, flexLine, Math.round(leftDecorationWidth), topDecorationHeight, Math.round(leftDecorationWidth) + flexItemAt.getMeasuredWidth(), topDecorationHeight + flexItemAt.getMeasuredHeight());
                    }
                    i = i13;
                    measuredWidth = leftDecorationWidth + flexItemAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + getRightDecorationWidth(flexItemAt) + fMax;
                    measuredWidth2 = rightDecorationWidth - (((flexItemAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + getLeftDecorationWidth(flexItemAt)) + fMax);
                }
                i2++;
                i7 = 1;
            }
            cVar.c += this.l.i;
            return flexLine.getCrossSize();
        }
        f = paddingLeft;
        f2 = width - paddingRight;
        f3 = 0.0f;
        measuredWidth = f - this.m.d;
        measuredWidth2 = f2 - this.m.d;
        fMax = Math.max(f3, 0.0f);
        i = 0;
        itemCount = flexLine.getItemCount();
        i2 = i5;
        while (i2 < i5 + itemCount) {
            flexItemAt = getFlexItemAt(i2);
            if (flexItemAt != null) {
                if (cVar.i == i7) {
                    calculateItemDecorationsForChild(flexItemAt, B);
                    addView(flexItemAt);
                } else {
                    calculateItemDecorationsForChild(flexItemAt, B);
                    addView(flexItemAt, i);
                    i++;
                }
                int i14 = i;
                com.google.android.flexbox.b bVar2 = this.i;
                long j2 = bVar2.d[i2];
                iY = bVar2.y(j2);
                iX = this.i.x(j2);
                layoutParams = (LayoutParams) flexItemAt.getLayoutParams();
                if (shouldMeasureChild(flexItemAt, iY, iX, layoutParams)) {
                    flexItemAt.measure(iY, iX);
                }
                leftDecorationWidth = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + getLeftDecorationWidth(flexItemAt);
                rightDecorationWidth = measuredWidth2 - (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + getRightDecorationWidth(flexItemAt));
                topDecorationHeight = i4 + getTopDecorationHeight(flexItemAt);
                if (this.f) {
                    this.i.Q(flexItemAt, flexLine, Math.round(rightDecorationWidth) - flexItemAt.getMeasuredWidth(), topDecorationHeight, Math.round(rightDecorationWidth), topDecorationHeight + flexItemAt.getMeasuredHeight());
                } else {
                    this.i.Q(flexItemAt, flexLine, Math.round(leftDecorationWidth), topDecorationHeight, Math.round(leftDecorationWidth) + flexItemAt.getMeasuredWidth(), topDecorationHeight + flexItemAt.getMeasuredHeight());
                }
                i = i14;
                measuredWidth = leftDecorationWidth + flexItemAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + getRightDecorationWidth(flexItemAt) + fMax;
                measuredWidth2 = rightDecorationWidth - (((flexItemAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + getLeftDecorationWidth(flexItemAt)) + fMax);
            }
            i2++;
            i7 = 1;
        }
        cVar.c += this.l.i;
        return flexLine.getCrossSize();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00da  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:45:0x0101  */
    /* JADX WARN: Code duplicated, block: B:48:0x011f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0128  */
    /* JADX WARN: Code duplicated, block: B:52:0x0144  */
    /* JADX WARN: Code duplicated, block: B:54:0x0148  */
    /* JADX WARN: Code duplicated, block: B:55:0x0171  */
    /* JADX WARN: Code duplicated, block: B:56:0x0197  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x01bf  */
    private int D(FlexLine flexLine, c cVar) {
        float f;
        float f2;
        float f3;
        float measuredHeight;
        float measuredHeight2;
        float fMax;
        int i;
        int itemCount;
        int i2;
        View flexItemAt;
        float f4;
        int iY;
        int iX;
        LayoutParams layoutParams;
        float topDecorationHeight;
        float bottomDecorationHeight;
        int leftDecorationWidth;
        int rightDecorationWidth;
        boolean z;
        View view;
        int i3;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = cVar.e;
        int i5 = cVar.e;
        if (cVar.i == -1) {
            int i6 = flexLine.g;
            i4 -= i6;
            i5 += i6;
        }
        int i7 = i4;
        int i8 = i5;
        int i9 = cVar.d;
        int i10 = this.c;
        if (i10 != 0) {
            if (i10 == 1) {
                int i11 = flexLine.e;
                float f5 = (height - i11) + paddingBottom;
                f3 = 0.0f;
                f2 = i11 - paddingTop;
                f = f5;
            } else if (i10 == 2) {
                int i12 = flexLine.e;
                f = paddingTop + ((height - i12) / 2.0f);
                f2 = (height - paddingBottom) - ((height - i12) / 2.0f);
            } else if (i10 == 3) {
                f = paddingTop;
                int i13 = flexLine.h;
                f3 = (height - flexLine.e) / (i13 != 1 ? i13 - 1 : 1.0f);
                f2 = height - paddingBottom;
            } else if (i10 == 4) {
                int i14 = flexLine.h;
                f3 = i14 != 0 ? (height - flexLine.e) / i14 : 0.0f;
                float f6 = f3 / 2.0f;
                f = paddingTop + f6;
                f2 = (height - paddingBottom) - f6;
            } else {
                if (i10 != 5) {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.c);
                }
                int i15 = flexLine.h;
                f3 = i15 != 0 ? (height - flexLine.e) / (i15 + 1) : 0.0f;
                f = paddingTop + f3;
                f2 = (height - paddingBottom) - f3;
            }
            measuredHeight = f - this.m.d;
            measuredHeight2 = f2 - this.m.d;
            fMax = Math.max(f3, 0.0f);
            i = 0;
            itemCount = flexLine.getItemCount();
            i2 = i9;
            while (i2 < i9 + itemCount) {
                flexItemAt = getFlexItemAt(i2);
                if (flexItemAt == null) {
                    i3 = i2;
                    f4 = fMax;
                } else {
                    com.google.android.flexbox.b bVar = this.i;
                    f4 = fMax;
                    long j = bVar.d[i2];
                    iY = bVar.y(j);
                    iX = this.i.x(j);
                    layoutParams = (LayoutParams) flexItemAt.getLayoutParams();
                    if (shouldMeasureChild(flexItemAt, iY, iX, layoutParams)) {
                        flexItemAt.measure(iY, iX);
                    }
                    topDecorationHeight = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + getTopDecorationHeight(flexItemAt);
                    bottomDecorationHeight = measuredHeight2 - (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + getBottomDecorationHeight(flexItemAt));
                    if (cVar.i == 1) {
                        calculateItemDecorationsForChild(flexItemAt, B);
                        addView(flexItemAt);
                    } else {
                        calculateItemDecorationsForChild(flexItemAt, B);
                        addView(flexItemAt, i);
                        i++;
                    }
                    int i16 = i;
                    leftDecorationWidth = i7 + getLeftDecorationWidth(flexItemAt);
                    rightDecorationWidth = i8 - getRightDecorationWidth(flexItemAt);
                    z = this.f;
                    if (z) {
                        view = flexItemAt;
                        i3 = i2;
                        if (this.g) {
                            this.i.R(view, flexLine, z, leftDecorationWidth, Math.round(bottomDecorationHeight) - view.getMeasuredHeight(), leftDecorationWidth + view.getMeasuredWidth(), Math.round(bottomDecorationHeight));
                        } else {
                            this.i.R(view, flexLine, z, leftDecorationWidth, Math.round(topDecorationHeight), leftDecorationWidth + view.getMeasuredWidth(), Math.round(topDecorationHeight) + view.getMeasuredHeight());
                        }
                    } else if (this.g) {
                        view = flexItemAt;
                        i3 = i2;
                        this.i.R(flexItemAt, flexLine, z, rightDecorationWidth - flexItemAt.getMeasuredWidth(), Math.round(bottomDecorationHeight) - flexItemAt.getMeasuredHeight(), rightDecorationWidth, Math.round(bottomDecorationHeight));
                    } else {
                        view = flexItemAt;
                        i3 = i2;
                        this.i.R(view, flexLine, z, rightDecorationWidth - view.getMeasuredWidth(), Math.round(topDecorationHeight), rightDecorationWidth, Math.round(topDecorationHeight) + view.getMeasuredHeight());
                    }
                    View view2 = view;
                    measuredHeight = topDecorationHeight + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + getBottomDecorationHeight(view2) + f4;
                    i = i16;
                    measuredHeight2 = bottomDecorationHeight - (((view2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) + getTopDecorationHeight(view2)) + f4);
                }
                i2 = i3 + 1;
                fMax = f4;
            }
            cVar.c += this.l.i;
            return flexLine.getCrossSize();
        }
        f = paddingTop;
        f2 = height - paddingBottom;
        f3 = 0.0f;
        measuredHeight = f - this.m.d;
        measuredHeight2 = f2 - this.m.d;
        fMax = Math.max(f3, 0.0f);
        i = 0;
        itemCount = flexLine.getItemCount();
        i2 = i9;
        while (i2 < i9 + itemCount) {
            flexItemAt = getFlexItemAt(i2);
            if (flexItemAt == null) {
                i3 = i2;
                f4 = fMax;
            } else {
                com.google.android.flexbox.b bVar2 = this.i;
                f4 = fMax;
                long j2 = bVar2.d[i2];
                iY = bVar2.y(j2);
                iX = this.i.x(j2);
                layoutParams = (LayoutParams) flexItemAt.getLayoutParams();
                if (shouldMeasureChild(flexItemAt, iY, iX, layoutParams)) {
                    flexItemAt.measure(iY, iX);
                }
                topDecorationHeight = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + getTopDecorationHeight(flexItemAt);
                bottomDecorationHeight = measuredHeight2 - (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + getBottomDecorationHeight(flexItemAt));
                if (cVar.i == 1) {
                    calculateItemDecorationsForChild(flexItemAt, B);
                    addView(flexItemAt);
                } else {
                    calculateItemDecorationsForChild(flexItemAt, B);
                    addView(flexItemAt, i);
                    i++;
                }
                int i17 = i;
                leftDecorationWidth = i7 + getLeftDecorationWidth(flexItemAt);
                rightDecorationWidth = i8 - getRightDecorationWidth(flexItemAt);
                z = this.f;
                if (z) {
                    view = flexItemAt;
                    i3 = i2;
                    if (this.g) {
                        this.i.R(view, flexLine, z, leftDecorationWidth, Math.round(bottomDecorationHeight) - view.getMeasuredHeight(), leftDecorationWidth + view.getMeasuredWidth(), Math.round(bottomDecorationHeight));
                    } else {
                        this.i.R(view, flexLine, z, leftDecorationWidth, Math.round(topDecorationHeight), leftDecorationWidth + view.getMeasuredWidth(), Math.round(topDecorationHeight) + view.getMeasuredHeight());
                    }
                } else if (this.g) {
                    view = flexItemAt;
                    i3 = i2;
                    this.i.R(flexItemAt, flexLine, z, rightDecorationWidth - flexItemAt.getMeasuredWidth(), Math.round(bottomDecorationHeight) - flexItemAt.getMeasuredHeight(), rightDecorationWidth, Math.round(bottomDecorationHeight));
                } else {
                    view = flexItemAt;
                    i3 = i2;
                    this.i.R(view, flexLine, z, rightDecorationWidth - view.getMeasuredWidth(), Math.round(topDecorationHeight), rightDecorationWidth, Math.round(topDecorationHeight) + view.getMeasuredHeight());
                }
                View view3 = view;
                measuredHeight = topDecorationHeight + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + getBottomDecorationHeight(view3) + f4;
                i = i17;
                measuredHeight2 = bottomDecorationHeight - (((view3.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) + getTopDecorationHeight(view3)) + f4);
            }
            i2 = i3 + 1;
            fMax = f4;
        }
        cVar.c += this.l.i;
        return flexLine.getCrossSize();
    }

    private void E(RecyclerView.Recycler recycler, c cVar) {
        if (cVar.j) {
            if (cVar.i == -1) {
                F(recycler, cVar);
            } else {
                G(recycler, cVar);
            }
        }
    }

    private void F(RecyclerView.Recycler recycler, c cVar) {
        if (cVar.f < 0) {
            return;
        }
        this.n.getEnd();
        int unused = cVar.f;
        int childCount = getChildCount();
        if (childCount == 0) {
            return;
        }
        int i = childCount - 1;
        int i2 = this.i.c[getPosition(getChildAt(i))];
        if (i2 == -1) {
            return;
        }
        FlexLine flexLine = this.h.get(i2);
        for (int i3 = i; i3 >= 0; i3--) {
            View childAt = getChildAt(i3);
            if (!h(childAt, cVar.f)) {
                break;
            }
            if (flexLine.o == getPosition(childAt)) {
                if (i2 <= 0) {
                    childCount = i3;
                    break;
                } else {
                    i2 += cVar.i;
                    flexLine = this.h.get(i2);
                    childCount = i3;
                }
            }
        }
        recycleChildren(recycler, childCount, i);
    }

    private void G(RecyclerView.Recycler recycler, c cVar) {
        int childCount;
        if (cVar.f >= 0 && (childCount = getChildCount()) != 0) {
            int i = this.i.c[getPosition(getChildAt(0))];
            int i2 = -1;
            if (i == -1) {
                return;
            }
            FlexLine flexLine = this.h.get(i);
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!i(childAt, cVar.f)) {
                    break;
                }
                if (flexLine.p == getPosition(childAt)) {
                    if (i >= this.h.size() - 1) {
                        i2 = i3;
                        break;
                    } else {
                        i += cVar.i;
                        flexLine = this.h.get(i);
                        i2 = i3;
                    }
                }
            }
            recycleChildren(recycler, 0, i2);
        }
    }

    private void H() {
        int heightMode = isMainAxisDirectionHorizontal() ? getHeightMode() : getWidthMode();
        this.l.b = heightMode == 0 || heightMode == Integer.MIN_VALUE;
    }

    private void I() {
        int layoutDirection = getLayoutDirection();
        int i = this.a;
        if (i == 0) {
            this.f = layoutDirection == 1;
            this.g = this.b == 2;
            return;
        }
        if (i == 1) {
            this.f = layoutDirection != 1;
            this.g = this.b == 2;
            return;
        }
        if (i == 2) {
            boolean z = layoutDirection == 1;
            this.f = z;
            if (this.b == 2) {
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
        if (this.b == 2) {
            this.f = !z2;
        }
        this.g = true;
    }

    private boolean J(RecyclerView.State state, b bVar) {
        if (getChildCount() == 0) {
            return false;
        }
        View viewO = bVar.e ? o(state.getItemCount()) : m(state.getItemCount());
        if (viewO == null) {
            return false;
        }
        bVar.r(viewO);
        if (!state.isPreLayout() && supportsPredictiveItemAnimations()) {
            if (this.n.getDecoratedStart(viewO) >= this.n.getEndAfterPadding() || this.n.getDecoratedEnd(viewO) < this.n.getStartAfterPadding()) {
                bVar.c = bVar.e ? this.n.getEndAfterPadding() : this.n.getStartAfterPadding();
            }
        }
        return true;
    }

    private boolean K(RecyclerView.State state, b bVar, SavedState savedState) {
        int i;
        if (!state.isPreLayout() && (i = this.q) != -1) {
            if (i >= 0 && i < state.getItemCount()) {
                bVar.a = this.q;
                bVar.b = this.i.c[bVar.a];
                SavedState savedState2 = this.p;
                if (savedState2 != null && savedState2.g(state.getItemCount())) {
                    bVar.c = this.n.getStartAfterPadding() + savedState.b;
                    bVar.g = true;
                    bVar.b = -1;
                    return true;
                }
                if (this.r != Integer.MIN_VALUE) {
                    if (isMainAxisDirectionHorizontal() || !this.f) {
                        bVar.c = this.n.getStartAfterPadding() + this.r;
                    } else {
                        bVar.c = this.r - this.n.getEndPadding();
                    }
                    return true;
                }
                View viewFindViewByPosition = findViewByPosition(this.q);
                if (viewFindViewByPosition == null) {
                    if (getChildCount() > 0) {
                        bVar.e = this.q < getPosition(getChildAt(0));
                    }
                    bVar.q();
                } else {
                    if (this.n.getDecoratedMeasurement(viewFindViewByPosition) > this.n.getTotalSpace()) {
                        bVar.q();
                        return true;
                    }
                    if (this.n.getDecoratedStart(viewFindViewByPosition) - this.n.getStartAfterPadding() < 0) {
                        bVar.c = this.n.getStartAfterPadding();
                        bVar.e = false;
                        return true;
                    }
                    if (this.n.getEndAfterPadding() - this.n.getDecoratedEnd(viewFindViewByPosition) < 0) {
                        bVar.c = this.n.getEndAfterPadding();
                        bVar.e = true;
                        return true;
                    }
                    bVar.c = bVar.e ? this.n.getDecoratedEnd(viewFindViewByPosition) + this.n.getTotalSpaceChange() : this.n.getDecoratedStart(viewFindViewByPosition);
                }
                return true;
            }
            this.q = -1;
            this.r = Integer.MIN_VALUE;
        }
        return false;
    }

    private void L(RecyclerView.State state, b bVar) {
        if (K(state, bVar, this.p) || J(state, bVar)) {
            return;
        }
        bVar.q();
        bVar.a = 0;
        bVar.b = 0;
    }

    private void M(int i) {
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
        if (isMainAxisDirectionHorizontal() || !this.f) {
            this.r = this.n.getDecoratedStart(childClosestToStart) - this.n.getStartAfterPadding();
        } else {
            this.r = this.n.getDecoratedEnd(childClosestToStart) + this.n.getEndPadding();
        }
    }

    private void N(int i) {
        boolean z;
        int i2;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        int width = getWidth();
        int height = getHeight();
        if (isMainAxisDirectionHorizontal()) {
            int i3 = this.s;
            z = (i3 == Integer.MIN_VALUE || i3 == width) ? false : true;
            i2 = this.l.b ? this.w.getResources().getDisplayMetrics().heightPixels : this.l.a;
        } else {
            int i4 = this.t;
            z = (i4 == Integer.MIN_VALUE || i4 == height) ? false : true;
            i2 = this.l.b ? this.w.getResources().getDisplayMetrics().widthPixels : this.l.a;
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
            if (isMainAxisDirectionHorizontal()) {
                this.i.e(this.z, iMakeMeasureSpec, iMakeMeasureSpec2, i5, this.m.a, this.h);
            } else {
                this.i.h(this.z, iMakeMeasureSpec, iMakeMeasureSpec2, i5, this.m.a, this.h);
            }
            this.h = this.z.a;
            this.i.p(iMakeMeasureSpec, iMakeMeasureSpec2);
            this.i.X();
            b bVar = this.m;
            bVar.b = this.i.c[bVar.a];
            this.l.c = this.m.b;
            return;
        }
        int iMin = i6 != -1 ? Math.min(i6, this.m.a) : this.m.a;
        this.z.a();
        if (isMainAxisDirectionHorizontal()) {
            if (this.h.size() > 0) {
                this.i.j(this.h, iMin);
                this.i.b(this.z, iMakeMeasureSpec, iMakeMeasureSpec2, i5, iMin, this.m.a, this.h);
            } else {
                this.i.s(i);
                this.i.d(this.z, iMakeMeasureSpec, iMakeMeasureSpec2, i5, 0, this.h);
            }
        } else if (this.h.size() > 0) {
            this.i.j(this.h, iMin);
            this.i.b(this.z, iMakeMeasureSpec2, iMakeMeasureSpec, i5, iMin, this.m.a, this.h);
        } else {
            this.i.s(i);
            this.i.g(this.z, iMakeMeasureSpec, iMakeMeasureSpec2, i5, 0, this.h);
        }
        this.h = this.z.a;
        this.i.q(iMakeMeasureSpec, iMakeMeasureSpec2, iMin);
        this.i.Y(iMin);
    }

    private void O(int i, int i2) {
        this.l.i = i;
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        boolean z = !zIsMainAxisDirectionHorizontal && this.f;
        if (i == 1) {
            View childAt = getChildAt(getChildCount() - 1);
            this.l.e = this.n.getDecoratedEnd(childAt);
            int position = getPosition(childAt);
            View viewP = p(childAt, this.h.get(this.i.c[position]));
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
                this.l.e = this.n.getDecoratedStart(viewP);
                this.l.f = (-this.n.getDecoratedStart(viewP)) + this.n.getStartAfterPadding();
                c cVar3 = this.l;
                cVar3.f = cVar3.f >= 0 ? this.l.f : 0;
            } else {
                this.l.e = this.n.getDecoratedEnd(viewP);
                this.l.f = this.n.getDecoratedEnd(viewP) - this.n.getEndAfterPadding();
            }
            if ((this.l.c == -1 || this.l.c > this.h.size() - 1) && this.l.d <= getFlexItemCount()) {
                int i3 = i2 - this.l.f;
                this.z.a();
                if (i3 > 0) {
                    if (zIsMainAxisDirectionHorizontal) {
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
            this.l.e = this.n.getDecoratedStart(childAt2);
            int position2 = getPosition(childAt2);
            View viewN = n(childAt2, this.h.get(this.i.c[position2]));
            this.l.h = 1;
            int i4 = this.i.c[position2];
            if (i4 == -1) {
                i4 = 0;
            }
            if (i4 > 0) {
                this.l.d = position2 - this.h.get(i4 - 1).getItemCount();
            } else {
                this.l.d = -1;
            }
            this.l.c = i4 > 0 ? i4 - 1 : 0;
            if (z) {
                this.l.e = this.n.getDecoratedEnd(viewN);
                this.l.f = this.n.getDecoratedEnd(viewN) - this.n.getEndAfterPadding();
                c cVar4 = this.l;
                cVar4.f = cVar4.f >= 0 ? this.l.f : 0;
            } else {
                this.l.e = this.n.getDecoratedStart(viewN);
                this.l.f = (-this.n.getDecoratedStart(viewN)) + this.n.getStartAfterPadding();
            }
        }
        c cVar5 = this.l;
        cVar5.a = i2 - cVar5.f;
    }

    private void P(b bVar, boolean z, boolean z2) {
        if (z2) {
            H();
        } else {
            this.l.b = false;
        }
        if (isMainAxisDirectionHorizontal() || !this.f) {
            this.l.a = this.n.getEndAfterPadding() - bVar.c;
        } else {
            this.l.a = bVar.c - getPaddingRight();
        }
        this.l.d = bVar.a;
        this.l.h = 1;
        this.l.i = 1;
        this.l.e = bVar.c;
        this.l.f = Integer.MIN_VALUE;
        this.l.c = bVar.b;
        if (!z || this.h.size() <= 1 || bVar.b < 0 || bVar.b >= this.h.size() - 1) {
            return;
        }
        FlexLine flexLine = this.h.get(bVar.b);
        c.i(this.l);
        this.l.d += flexLine.getItemCount();
    }

    private void Q(b bVar, boolean z, boolean z2) {
        if (z2) {
            H();
        } else {
            this.l.b = false;
        }
        if (isMainAxisDirectionHorizontal() || !this.f) {
            this.l.a = bVar.c - this.n.getStartAfterPadding();
        } else {
            this.l.a = (this.x.getWidth() - bVar.c) - this.n.getStartAfterPadding();
        }
        this.l.d = bVar.a;
        this.l.h = 1;
        this.l.i = -1;
        this.l.e = bVar.c;
        this.l.f = Integer.MIN_VALUE;
        this.l.c = bVar.b;
        if (!z || bVar.b <= 0 || this.h.size() <= bVar.b) {
            return;
        }
        FlexLine flexLine = this.h.get(bVar.b);
        c.j(this.l);
        this.l.d -= flexLine.getItemCount();
    }

    private int computeScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        k();
        View viewM = m(itemCount);
        View viewO = o(itemCount);
        if (state.getItemCount() == 0 || viewM == null || viewO == null) {
            return 0;
        }
        return Math.min(this.n.getTotalSpace(), this.n.getDecoratedEnd(viewO) - this.n.getDecoratedStart(viewM));
    }

    private int computeScrollOffset(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        View viewM = m(itemCount);
        View viewO = o(itemCount);
        if (state.getItemCount() != 0 && viewM != null && viewO != null) {
            int position = getPosition(viewM);
            int position2 = getPosition(viewO);
            int iAbs = Math.abs(this.n.getDecoratedEnd(viewO) - this.n.getDecoratedStart(viewM));
            int[] iArr = this.i.c;
            int i = iArr[position];
            if (i != 0 && i != -1) {
                return Math.round((i * (iAbs / ((iArr[position2] - i) + 1))) + (this.n.getStartAfterPadding() - this.n.getDecoratedStart(viewM)));
            }
        }
        return 0;
    }

    private int computeScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        View viewM = m(itemCount);
        View viewO = o(itemCount);
        if (state.getItemCount() == 0 || viewM == null || viewO == null) {
            return 0;
        }
        return (int) ((Math.abs(this.n.getDecoratedEnd(viewO) - this.n.getDecoratedStart(viewM)) / ((findLastVisibleItemPosition() - findFirstVisibleItemPosition()) + 1)) * state.getItemCount());
    }

    private void ensureLayoutState() {
        if (this.l == null) {
            this.l = new c();
        }
    }

    private int fixLayoutEndGap(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int iX;
        int endAfterPadding;
        if (!isMainAxisDirectionHorizontal() && this.f) {
            int startAfterPadding = i - this.n.getStartAfterPadding();
            if (startAfterPadding <= 0) {
                return 0;
            }
            iX = x(startAfterPadding, recycler, state);
        } else {
            int endAfterPadding2 = this.n.getEndAfterPadding() - i;
            if (endAfterPadding2 <= 0) {
                return 0;
            }
            iX = -x(-endAfterPadding2, recycler, state);
        }
        int i2 = i + iX;
        if (!z || (endAfterPadding = this.n.getEndAfterPadding() - i2) <= 0) {
            return iX;
        }
        this.n.offsetChildren(endAfterPadding);
        return endAfterPadding + iX;
    }

    private int fixLayoutStartGap(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int iX;
        int startAfterPadding;
        if (isMainAxisDirectionHorizontal() || !this.f) {
            int startAfterPadding2 = i - this.n.getStartAfterPadding();
            if (startAfterPadding2 <= 0) {
                return 0;
            }
            iX = -x(startAfterPadding2, recycler, state);
        } else {
            int endAfterPadding = this.n.getEndAfterPadding() - i;
            if (endAfterPadding <= 0) {
                return 0;
            }
            iX = x(-endAfterPadding, recycler, state);
        }
        int i2 = i + iX;
        if (!z || (startAfterPadding = i2 - this.n.getStartAfterPadding()) <= 0) {
            return iX;
        }
        this.n.offsetChildren(-startAfterPadding);
        return iX - startAfterPadding;
    }

    private View getChildClosestToStart() {
        return getChildAt(0);
    }

    private boolean h(View view, int i) {
        if (isMainAxisDirectionHorizontal() || !this.f) {
            return this.n.getDecoratedStart(view) >= this.n.getEnd() - i;
        }
        return this.n.getDecoratedEnd(view) <= i;
    }

    private boolean i(View view, int i) {
        if (isMainAxisDirectionHorizontal() || !this.f) {
            return this.n.getDecoratedEnd(view) <= i;
        }
        return this.n.getEnd() - this.n.getDecoratedStart(view) <= i;
    }

    private static boolean isMeasurementUpToDate(int i, int i2, int i3) {
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

    private void j() {
        this.h.clear();
        this.m.s();
        this.m.d = 0;
    }

    private void k() {
        if (this.n != null) {
            return;
        }
        if (isMainAxisDirectionHorizontal()) {
            if (this.b == 0) {
                this.n = OrientationHelper.createHorizontalHelper(this);
                this.o = OrientationHelper.createVerticalHelper(this);
                return;
            } else {
                this.n = OrientationHelper.createVerticalHelper(this);
                this.o = OrientationHelper.createHorizontalHelper(this);
                return;
            }
        }
        if (this.b == 0) {
            this.n = OrientationHelper.createVerticalHelper(this);
            this.o = OrientationHelper.createHorizontalHelper(this);
        } else {
            this.n = OrientationHelper.createHorizontalHelper(this);
            this.o = OrientationHelper.createVerticalHelper(this);
        }
    }

    private int l(RecyclerView.Recycler recycler, RecyclerView.State state, c cVar) {
        if (cVar.f != Integer.MIN_VALUE) {
            if (cVar.a < 0) {
                cVar.f += cVar.a;
            }
            E(recycler, cVar);
        }
        int i = cVar.a;
        int crossSize = cVar.a;
        int iB = 0;
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        while (true) {
            if ((crossSize <= 0 && !this.l.b) || !cVar.w(state, this.h)) {
                break;
            }
            FlexLine flexLine = this.h.get(cVar.c);
            cVar.d = flexLine.o;
            iB += B(flexLine, cVar);
            if (zIsMainAxisDirectionHorizontal || !this.f) {
                cVar.e += flexLine.getCrossSize() * cVar.i;
            } else {
                cVar.e -= flexLine.getCrossSize() * cVar.i;
            }
            crossSize -= flexLine.getCrossSize();
        }
        cVar.a -= iB;
        if (cVar.f != Integer.MIN_VALUE) {
            cVar.f += iB;
            if (cVar.a < 0) {
                cVar.f += cVar.a;
            }
            E(recycler, cVar);
        }
        return i - cVar.a;
    }

    private View m(int i) {
        View viewR = r(0, getChildCount(), i);
        if (viewR == null) {
            return null;
        }
        int i2 = this.i.c[getPosition(viewR)];
        if (i2 == -1) {
            return null;
        }
        return n(viewR, this.h.get(i2));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    private View n(View view, FlexLine flexLine) {
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int i = flexLine.h;
        for (int i2 = 1; i2 < i; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.f || zIsMainAxisDirectionHorizontal) {
                    if (this.n.getDecoratedStart(view) > this.n.getDecoratedStart(childAt)) {
                        view = childAt;
                    }
                } else if (this.n.getDecoratedEnd(view) < this.n.getDecoratedEnd(childAt)) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    private View o(int i) {
        View viewR = r(getChildCount() - 1, -1, i);
        if (viewR == null) {
            return null;
        }
        return p(viewR, this.h.get(this.i.c[getPosition(viewR)]));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    private View p(View view, FlexLine flexLine) {
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int childCount = (getChildCount() - flexLine.h) - 1;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.f || zIsMainAxisDirectionHorizontal) {
                    if (this.n.getDecoratedEnd(view) < this.n.getDecoratedEnd(childAt)) {
                        view = childAt;
                    }
                } else if (this.n.getDecoratedStart(view) > this.n.getDecoratedStart(childAt)) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    private View q(int i, int i2, boolean z) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View childAt = getChildAt(i);
            if (A(childAt, z)) {
                return childAt;
            }
            i += i3;
        }
        return null;
    }

    private View r(int i, int i2, int i3) {
        k();
        ensureLayoutState();
        int startAfterPadding = this.n.getStartAfterPadding();
        int endAfterPadding = this.n.getEndAfterPadding();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            if (position >= 0 && position < i3) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.n.getDecoratedStart(childAt) >= startAfterPadding && this.n.getDecoratedEnd(childAt) <= endAfterPadding) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    private void recycleChildren(RecyclerView.Recycler recycler, int i, int i2) {
        while (i2 >= i) {
            removeAndRecycleViewAt(i2, recycler);
            i2--;
        }
    }

    private int s(View view) {
        return getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    private boolean shouldMeasureChild(View view, int i, int i2, RecyclerView.LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && isMeasurementCacheEnabled() && isMeasurementUpToDate(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    private int t(View view) {
        return getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
    }

    private int u(View view) {
        return getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
    }

    private int v(View view) {
        return getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
    }

    private int x(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        k();
        int i2 = 1;
        this.l.j = true;
        boolean z = !isMainAxisDirectionHorizontal() && this.f;
        if (!z ? i <= 0 : i >= 0) {
            i2 = -1;
        }
        int iAbs = Math.abs(i);
        O(i2, iAbs);
        int iL = this.l.f + l(recycler, state, this.l);
        if (iL < 0) {
            return 0;
        }
        if (z) {
            if (iAbs > iL) {
                i = (-i2) * iL;
            }
        } else if (iAbs > iL) {
            i = i2 * iL;
        }
        this.n.offsetChildren(-i);
        this.l.g = i;
        return i;
    }

    private int y(int i) {
        int iMin;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        k();
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        View view = this.x;
        int width = zIsMainAxisDirectionHorizontal ? view.getWidth() : view.getHeight();
        int width2 = zIsMainAxisDirectionHorizontal ? getWidth() : getHeight();
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

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        if (this.b == 0) {
            return isMainAxisDirectionHorizontal();
        }
        if (isMainAxisDirectionHorizontal()) {
            int width = getWidth();
            View view = this.x;
            if (width <= (view != null ? view.getWidth() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        if (this.b == 0) {
            return !isMainAxisDirectionHorizontal();
        }
        if (isMainAxisDirectionHorizontal()) {
            return true;
        }
        int height = getHeight();
        View view = this.x;
        return height > (view != null ? view.getHeight() : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        int i2 = i < getPosition(getChildAt(0)) ? -1 : 1;
        return isMainAxisDirectionHorizontal() ? new PointF(0.0f, i2) : new PointF(i2, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewQ = q(0, getChildCount(), true);
        if (viewQ == null) {
            return -1;
        }
        return getPosition(viewQ);
    }

    public int findFirstVisibleItemPosition() {
        View viewQ = q(0, getChildCount(), false);
        if (viewQ == null) {
            return -1;
        }
        return getPosition(viewQ);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewQ = q(getChildCount() - 1, -1, true);
        if (viewQ == null) {
            return -1;
        }
        return getPosition(viewQ);
    }

    public int findLastVisibleItemPosition() {
        View viewQ = q(getChildCount() - 1, -1, false);
        if (viewQ == null) {
            return -1;
        }
        return getPosition(viewQ);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // com.google.android.flexbox.a
    public int getAlignContent() {
        return 5;
    }

    @Override // com.google.android.flexbox.a
    public int getAlignItems() {
        return this.d;
    }

    @Override // com.google.android.flexbox.a
    public int getChildHeightMeasureSpec(int i, int i2, int i3) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), i2, i3, canScrollVertically());
    }

    @Override // com.google.android.flexbox.a
    public int getChildWidthMeasureSpec(int i, int i2, int i3) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), i2, i3, canScrollHorizontally());
    }

    @Override // com.google.android.flexbox.a
    public int getDecorationLengthCrossAxis(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (isMainAxisDirectionHorizontal()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return leftDecorationWidth + rightDecorationWidth;
    }

    @Override // com.google.android.flexbox.a
    public int getDecorationLengthMainAxis(View view, int i, int i2) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (isMainAxisDirectionHorizontal()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return topDecorationHeight + bottomDecorationHeight;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexDirection() {
        return this.a;
    }

    @Override // com.google.android.flexbox.a
    public View getFlexItemAt(int i) {
        View view = this.v.get(i);
        return view != null ? view : this.j.getViewForPosition(i);
    }

    @Override // com.google.android.flexbox.a
    public int getFlexItemCount() {
        return this.k.getItemCount();
    }

    @Override // com.google.android.flexbox.a
    public List<FlexLine> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.h.size());
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            FlexLine flexLine = this.h.get(i);
            if (flexLine.getItemCount() != 0) {
                arrayList.add(flexLine);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.a
    public List<FlexLine> getFlexLinesInternal() {
        return this.h;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexWrap() {
        return this.b;
    }

    @Override // com.google.android.flexbox.a
    public int getJustifyContent() {
        return this.c;
    }

    @Override // com.google.android.flexbox.a
    public int getLargestMainSize() {
        if (this.h.size() == 0) {
            return 0;
        }
        int iMax = Integer.MIN_VALUE;
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, this.h.get(i).e);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.a
    public int getMaxLine() {
        return this.e;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.u;
    }

    @Override // com.google.android.flexbox.a
    public View getReorderedFlexItemAt(int i) {
        return getFlexItemAt(i);
    }

    @Override // com.google.android.flexbox.a
    public int getSumOfCrossSize() {
        int size = this.h.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.h.get(i2).g;
        }
        return i;
    }

    @Override // com.google.android.flexbox.a
    public boolean isMainAxisDirectionHorizontal() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.x = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.u) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.onItemsAdded(recyclerView, i, i2);
        M(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(@NonNull RecyclerView recyclerView, int i, int i2, int i3) {
        super.onItemsMoved(recyclerView, i, i2, i3);
        M(Math.min(i, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
        M(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2, Object obj) {
        super.onItemsUpdated(recyclerView, i, i2, obj);
        M(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i;
        int i2;
        this.j = recycler;
        this.k = state;
        int itemCount = state.getItemCount();
        if (itemCount == 0 && state.isPreLayout()) {
            return;
        }
        I();
        k();
        ensureLayoutState();
        this.i.t(itemCount);
        this.i.u(itemCount);
        this.i.s(itemCount);
        this.l.j = false;
        SavedState savedState = this.p;
        if (savedState != null && savedState.g(itemCount)) {
            this.q = this.p.a;
        }
        if (!this.m.f || this.q != -1 || this.p != null) {
            this.m.s();
            L(state, this.m);
            this.m.f = true;
        }
        detachAndScrapAttachedViews(recycler);
        if (this.m.e) {
            Q(this.m, false, true);
        } else {
            P(this.m, false, true);
        }
        N(itemCount);
        if (this.m.e) {
            l(recycler, state, this.l);
            i2 = this.l.e;
            P(this.m, true, false);
            l(recycler, state, this.l);
            i = this.l.e;
        } else {
            l(recycler, state, this.l);
            i = this.l.e;
            Q(this.m, true, false);
            l(recycler, state, this.l);
            i2 = this.l.e;
        }
        if (getChildCount() > 0) {
            if (this.m.e) {
                fixLayoutStartGap(i2 + fixLayoutEndGap(i, recycler, state, true), recycler, state, false);
            } else {
                fixLayoutEndGap(i + fixLayoutStartGap(i2, recycler, state, true), recycler, state, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.p = null;
        this.q = -1;
        this.r = Integer.MIN_VALUE;
        this.y = -1;
        this.m.s();
        this.v.clear();
    }

    @Override // com.google.android.flexbox.a
    public void onNewFlexItemAdded(View view, int i, int i2, FlexLine flexLine) {
        calculateItemDecorationsForChild(view, B);
        if (isMainAxisDirectionHorizontal()) {
            int leftDecorationWidth = getLeftDecorationWidth(view) + getRightDecorationWidth(view);
            flexLine.e += leftDecorationWidth;
            flexLine.f += leftDecorationWidth;
        } else {
            int topDecorationHeight = getTopDecorationHeight(view) + getBottomDecorationHeight(view);
            flexLine.e += topDecorationHeight;
            flexLine.f += topDecorationHeight;
        }
    }

    @Override // com.google.android.flexbox.a
    public void onNewFlexLineAdded(FlexLine flexLine) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.p = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        if (this.p != null) {
            return new SavedState(this.p);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() > 0) {
            View childClosestToStart = getChildClosestToStart();
            savedState.a = getPosition(childClosestToStart);
            savedState.b = this.n.getDecoratedStart(childClosestToStart) - this.n.getStartAfterPadding();
        } else {
            savedState.h();
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!isMainAxisDirectionHorizontal() || (this.b == 0 && isMainAxisDirectionHorizontal())) {
            int iX = x(i, recycler, state);
            this.v.clear();
            return iX;
        }
        int iY = y(i);
        this.m.d += iY;
        this.o.offsetChildren(-iY);
        return iY;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        this.q = i;
        this.r = Integer.MIN_VALUE;
        SavedState savedState = this.p;
        if (savedState != null) {
            savedState.h();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (isMainAxisDirectionHorizontal() || (this.b == 0 && !isMainAxisDirectionHorizontal())) {
            int iX = x(i, recycler, state);
            this.v.clear();
            return iX;
        }
        int iY = y(i);
        this.m.d += iY;
        this.o.offsetChildren(-iY);
        return iY;
    }

    @Override // com.google.android.flexbox.a
    public void setAlignContent(int i) {
        throw new UnsupportedOperationException("Setting the alignContent in the FlexboxLayoutManager is not supported. Use FlexboxLayout if you need to use this attribute.");
    }

    @Override // com.google.android.flexbox.a
    public void setAlignItems(int i) {
        int i2 = this.d;
        if (i2 != i) {
            if (i2 == 4 || i == 4) {
                removeAllViews();
                j();
            }
            this.d = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.a
    public void setFlexDirection(int i) {
        if (this.a != i) {
            removeAllViews();
            this.a = i;
            this.n = null;
            this.o = null;
            j();
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.a
    public void setFlexLines(List<FlexLine> list) {
        this.h = list;
    }

    @Override // com.google.android.flexbox.a
    public void setFlexWrap(int i) {
        if (i == 2) {
            throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
        }
        int i2 = this.b;
        if (i2 != i) {
            if (i2 == 0 || i == 0) {
                removeAllViews();
                j();
            }
            this.b = i;
            this.n = null;
            this.o = null;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.a
    public void setJustifyContent(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.a
    public void setMaxLine(int i) {
        if (this.e != i) {
            this.e = i;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.u = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }

    @Override // com.google.android.flexbox.a
    public void updateViewCache(int i, View view) {
        this.v.put(i, view);
    }

    public int w(int i) {
        return this.i.c[i];
    }

    public boolean z() {
        return this.f;
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        private int a;
        private int b;

        public static class a implements Parcelable.Creator<SavedState> {
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

        /* JADX INFO: Access modifiers changed from: private */
        public boolean g(int i) {
            int i2 = this.a;
            return i2 >= 0 && i2 < i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h() {
            this.a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.a + ", mAnchorOffset=" + this.b + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
        }

        public SavedState() {
        }

        private SavedState(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
        }

        private SavedState(SavedState savedState) {
            this.a = savedState.a;
            this.b = savedState.b;
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
        this.r = Integer.MIN_VALUE;
        this.s = Integer.MIN_VALUE;
        this.t = Integer.MIN_VALUE;
        this.v = new SparseArray<>();
        this.y = -1;
        this.z = new com.google.android.flexbox.b.C0157b();
        setFlexDirection(i);
        setFlexWrap(i2);
        setAlignItems(4);
        setAutoMeasureEnabled(true);
        this.w = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.onItemsUpdated(recyclerView, i, i2);
        M(i);
    }

    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();
        private float a;
        private float b;
        private int c;
        private float d;
        private int e;
        private int f;
        private int g;
        private int h;
        private boolean i;

        public static class a implements Parcelable.Creator<LayoutParams> {
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
            this.a = 0.0f;
            this.b = 1.0f;
            this.c = -1;
            this.d = -1.0f;
            this.g = 16777215;
            this.h = 16777215;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getAlignSelf() {
            return this.c;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexBasisPercent() {
            return this.d;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexGrow() {
            return this.a;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexShrink() {
            return this.b;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginBottom() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginLeft() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginRight() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginTop() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxHeight() {
            return this.h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxWidth() {
            return this.g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMinHeight() {
            return this.f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMinWidth() {
            return this.e;
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
        public boolean isWrapBefore() {
            return this.i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setAlignSelf(int i) {
            this.c = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexBasisPercent(float f) {
            this.d = f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexGrow(float f) {
            this.a = f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexShrink(float f) {
            this.b = f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setHeight(int i) {
            ((ViewGroup.MarginLayoutParams) this).height = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMaxHeight(int i) {
            this.h = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMaxWidth(int i) {
            this.g = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinHeight(int i) {
            this.f = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinWidth(int i) {
            this.e = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setOrder(int i) {
            throw new UnsupportedOperationException("Setting the order in the FlexboxLayoutManager is not supported. Use FlexboxLayout if you need to reorder using the attribute.");
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setWidth(int i) {
            ((ViewGroup.MarginLayoutParams) this).width = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setWrapBefore(boolean z) {
            this.i = z;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.a);
            parcel.writeFloat(this.b);
            parcel.writeInt(this.c);
            parcel.writeFloat(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.a = 0.0f;
            this.b = 1.0f;
            this.c = -1;
            this.d = -1.0f;
            this.g = 16777215;
            this.h = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 0.0f;
            this.b = 1.0f;
            this.c = -1;
            this.d = -1.0f;
            this.g = 16777215;
            this.h = 16777215;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0.0f;
            this.b = 1.0f;
            this.c = -1;
            this.d = -1.0f;
            this.g = 16777215;
            this.h = 16777215;
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0.0f;
            this.b = 1.0f;
            this.c = -1;
            this.d = -1.0f;
            this.g = 16777215;
            this.h = 16777215;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((RecyclerView.LayoutParams) layoutParams);
            this.a = 0.0f;
            this.b = 1.0f;
            this.c = -1;
            this.d = -1.0f;
            this.g = 16777215;
            this.h = 16777215;
            this.a = layoutParams.a;
            this.b = layoutParams.b;
            this.c = layoutParams.c;
            this.d = layoutParams.d;
            this.e = layoutParams.e;
            this.f = layoutParams.f;
            this.g = layoutParams.g;
            this.h = layoutParams.h;
            this.i = layoutParams.i;
        }

        public LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.a = 0.0f;
            this.b = 1.0f;
            this.c = -1;
            this.d = -1.0f;
            this.g = 16777215;
            this.h = 16777215;
            this.a = parcel.readFloat();
            this.b = parcel.readFloat();
            this.c = parcel.readInt();
            this.d = parcel.readFloat();
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readInt();
            this.i = parcel.readByte() != 0;
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
        this.r = Integer.MIN_VALUE;
        this.s = Integer.MIN_VALUE;
        this.t = Integer.MIN_VALUE;
        this.v = new SparseArray<>();
        this.y = -1;
        this.z = new com.google.android.flexbox.b.C0157b();
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2);
        int i3 = properties.orientation;
        if (i3 != 0) {
            if (i3 == 1) {
                if (properties.reverseLayout) {
                    setFlexDirection(3);
                } else {
                    setFlexDirection(2);
                }
            }
        } else if (properties.reverseLayout) {
            setFlexDirection(1);
        } else {
            setFlexDirection(0);
        }
        setFlexWrap(1);
        setAlignItems(4);
        setAutoMeasureEnabled(true);
        this.w = context;
    }
}
