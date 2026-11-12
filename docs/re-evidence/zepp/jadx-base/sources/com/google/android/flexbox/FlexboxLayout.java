package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FlexboxLayout extends ViewGroup implements a {
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    @Nullable
    private Drawable g;

    @Nullable
    private Drawable h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int[] m;
    private SparseIntArray n;
    private b o;
    private List<FlexLine> p;
    private b.C0157b q;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    private boolean a(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.p.get(i2).getItemCountNotGone() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean b(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View reorderedChildAt = getReorderedChildAt(i - i3);
            if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private void c(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            FlexLine flexLine = this.p.get(i);
            for (int i2 = 0; i2 < flexLine.h; i2++) {
                int i3 = flexLine.o + i2;
                View reorderedChildAt = getReorderedChildAt(i3);
                if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                    if (g(i3, i2)) {
                        f(canvas, z ? reorderedChildAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (reorderedChildAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.l, flexLine.b, flexLine.g);
                    }
                    if (i2 == flexLine.h - 1 && (this.j & 4) > 0) {
                        f(canvas, z ? (reorderedChildAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.l : reorderedChildAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, flexLine.b, flexLine.g);
                    }
                }
            }
            if (h(i)) {
                e(canvas, paddingLeft, z2 ? flexLine.d : flexLine.b - this.k, iMax);
            }
            if (i(i) && (this.i & 4) > 0) {
                e(canvas, paddingLeft, z2 ? flexLine.b - this.k : flexLine.d, iMax);
            }
        }
    }

    private void d(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            FlexLine flexLine = this.p.get(i);
            for (int i2 = 0; i2 < flexLine.h; i2++) {
                int i3 = flexLine.o + i2;
                View reorderedChildAt = getReorderedChildAt(i3);
                if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                    if (g(i3, i2)) {
                        e(canvas, flexLine.a, z2 ? reorderedChildAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (reorderedChildAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.k, flexLine.g);
                    }
                    if (i2 == flexLine.h - 1 && (this.i & 4) > 0) {
                        e(canvas, flexLine.a, z2 ? (reorderedChildAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.k : reorderedChildAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, flexLine.g);
                    }
                }
            }
            if (h(i)) {
                f(canvas, z ? flexLine.c : flexLine.a - this.l, paddingTop, iMax);
            }
            if (i(i) && (this.j & 4) > 0) {
                f(canvas, z ? flexLine.a - this.l : flexLine.c, paddingTop, iMax);
            }
        }
    }

    private void e(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.g;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.k + i2);
        this.g.draw(canvas);
    }

    private void f(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.h;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.l + i, i3 + i2);
        this.h.draw(canvas);
    }

    private boolean g(int i, int i2) {
        if (b(i, i2)) {
            if (isMainAxisDirectionHorizontal()) {
                return (this.j & 1) != 0;
            }
            return (this.i & 1) != 0;
        }
        if (isMainAxisDirectionHorizontal()) {
            return (this.j & 2) != 0;
        }
        return (this.i & 2) != 0;
    }

    private boolean h(int i) {
        if (i < 0 || i >= this.p.size()) {
            return false;
        }
        if (a(i)) {
            if (isMainAxisDirectionHorizontal()) {
                return (this.i & 1) != 0;
            }
            return (this.j & 1) != 0;
        }
        if (isMainAxisDirectionHorizontal()) {
            return (this.i & 2) != 0;
        }
        return (this.j & 2) != 0;
    }

    private boolean i(int i) {
        if (i < 0 || i >= this.p.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.p.size(); i2++) {
            if (this.p.get(i2).getItemCountNotGone() > 0) {
                return false;
            }
        }
        if (isMainAxisDirectionHorizontal()) {
            return (this.i & 4) != 0;
        }
        return (this.j & 4) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x0201  */
    private void j(boolean z, int i, int i2, int i3, int i4) {
        float measuredWidth;
        float f;
        float f2;
        int i5;
        View reorderedChildAt;
        int i6;
        int i7;
        float f3;
        int i8;
        LayoutParams layoutParams;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i9 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.p.size();
        int i10 = 0;
        while (i10 < size) {
            FlexLine flexLine = this.p.get(i10);
            if (h(i10)) {
                int i11 = this.k;
                paddingBottom -= i11;
                paddingTop += i11;
            }
            int i12 = this.c;
            int i13 = 1;
            if (i12 == 0) {
                measuredWidth = paddingLeft;
                f = i9 - paddingRight;
            } else if (i12 != 1) {
                if (i12 == 2) {
                    int i14 = flexLine.e;
                    measuredWidth = paddingLeft + ((i9 - i14) / 2.0f);
                    f = (i9 - paddingRight) - ((i9 - i14) / 2.0f);
                } else if (i12 == 3) {
                    measuredWidth = paddingLeft;
                    int itemCountNotGone = flexLine.getItemCountNotGone();
                    f2 = (i9 - flexLine.e) / (itemCountNotGone != 1 ? itemCountNotGone - 1 : 1.0f);
                    f = i9 - paddingRight;
                } else if (i12 == 4) {
                    int itemCountNotGone2 = flexLine.getItemCountNotGone();
                    f2 = itemCountNotGone2 != 0 ? (i9 - flexLine.e) / itemCountNotGone2 : 0.0f;
                    float f4 = f2 / 2.0f;
                    measuredWidth = paddingLeft + f4;
                    f = (i9 - paddingRight) - f4;
                } else {
                    if (i12 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.c);
                    }
                    int itemCountNotGone3 = flexLine.getItemCountNotGone();
                    f2 = itemCountNotGone3 != 0 ? (i9 - flexLine.e) / (itemCountNotGone3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f2;
                    f = (i9 - paddingRight) - f2;
                }
                float fMax = Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < flexLine.h) {
                    int i15 = flexLine.o + i5;
                    reorderedChildAt = getReorderedChildAt(i15);
                    if (reorderedChildAt != null || reorderedChildAt.getVisibility() == 8) {
                        i6 = paddingLeft;
                        i7 = i5;
                    } else {
                        LayoutParams layoutParams2 = (LayoutParams) reorderedChildAt.getLayoutParams();
                        float f5 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                        float f6 = f - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        if (g(i15, i5)) {
                            int i16 = this.l;
                            float f7 = i16;
                            f5 += f7;
                            i8 = i16;
                            f3 = f6 - f7;
                        } else {
                            f3 = f6;
                            i8 = 0;
                        }
                        int i17 = (i5 != flexLine.h - i13 || (this.j & 4) <= 0) ? 0 : this.l;
                        if (this.b != 2) {
                            i6 = paddingLeft;
                            i7 = i5;
                            layoutParams = layoutParams2;
                            if (z) {
                                this.o.Q(reorderedChildAt, flexLine, Math.round(f3) - reorderedChildAt.getMeasuredWidth(), paddingTop, Math.round(f3), paddingTop + reorderedChildAt.getMeasuredHeight());
                            } else {
                                this.o.Q(reorderedChildAt, flexLine, Math.round(f5), paddingTop, Math.round(f5) + reorderedChildAt.getMeasuredWidth(), paddingTop + reorderedChildAt.getMeasuredHeight());
                            }
                        } else if (z) {
                            i7 = i5;
                            i6 = paddingLeft;
                            layoutParams = layoutParams2;
                            this.o.Q(reorderedChildAt, flexLine, Math.round(f3) - reorderedChildAt.getMeasuredWidth(), paddingBottom - reorderedChildAt.getMeasuredHeight(), Math.round(f3), paddingBottom);
                        } else {
                            i6 = paddingLeft;
                            i7 = i5;
                            layoutParams = layoutParams2;
                            this.o.Q(reorderedChildAt, flexLine, Math.round(f5), paddingBottom - reorderedChildAt.getMeasuredHeight(), Math.round(f5) + reorderedChildAt.getMeasuredWidth(), paddingBottom);
                        }
                        measuredWidth = f5 + reorderedChildAt.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        float measuredWidth2 = f3 - ((reorderedChildAt.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
                        if (z) {
                            flexLine.a(reorderedChildAt, i17, 0, i8, 0);
                        } else {
                            flexLine.a(reorderedChildAt, i8, 0, i17, 0);
                        }
                        f = measuredWidth2;
                    }
                    i5 = i7 + 1;
                    paddingLeft = i6;
                    i13 = 1;
                }
                int i18 = paddingLeft;
                int i19 = flexLine.g;
                paddingTop += i19;
                paddingBottom -= i19;
                i10++;
                paddingLeft = i18;
            } else {
                int i20 = flexLine.e;
                f = i20 - paddingLeft;
                measuredWidth = (i9 - i20) + paddingRight;
            }
            f2 = 0.0f;
            float fMax2 = Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < flexLine.h) {
                int i110 = flexLine.o + i5;
                reorderedChildAt = getReorderedChildAt(i110);
                if (reorderedChildAt != null) {
                    i6 = paddingLeft;
                    i7 = i5;
                } else {
                    i6 = paddingLeft;
                    i7 = i5;
                }
                i5 = i7 + 1;
                paddingLeft = i6;
                i13 = 1;
            }
            int i111 = paddingLeft;
            int i112 = flexLine.g;
            paddingTop += i112;
            paddingBottom -= i112;
            i10++;
            paddingLeft = i111;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ff  */
    private void k(boolean z, boolean z2, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        float f2;
        float f3;
        int i6;
        View reorderedChildAt;
        int i7;
        float f4;
        float f5;
        int i8;
        LayoutParams layoutParams;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i9 = i4 - i2;
        int i10 = (i3 - i) - paddingRight;
        int size = this.p.size();
        for (int i11 = 0; i11 < size; i11++) {
            FlexLine flexLine = this.p.get(i11);
            if (h(i11)) {
                int i12 = this.l;
                paddingLeft += i12;
                i10 -= i12;
            }
            int i13 = this.c;
            if (i13 != 0) {
                if (i13 == 1) {
                    int i14 = flexLine.e;
                    f = (i9 - i14) + paddingBottom;
                    i5 = i14 - paddingTop;
                } else if (i13 == 2) {
                    int i15 = flexLine.e;
                    f2 = (i9 - paddingBottom) - ((i9 - i15) / 2.0f);
                    f = paddingTop + ((i9 - i15) / 2.0f);
                    f3 = 0.0f;
                } else if (i13 == 3) {
                    f = paddingTop;
                    int itemCountNotGone = flexLine.getItemCountNotGone();
                    f3 = (i9 - flexLine.e) / (itemCountNotGone != 1 ? itemCountNotGone - 1 : 1.0f);
                    f2 = i9 - paddingBottom;
                } else if (i13 == 4) {
                    int itemCountNotGone2 = flexLine.getItemCountNotGone();
                    f3 = itemCountNotGone2 != 0 ? (i9 - flexLine.e) / itemCountNotGone2 : 0.0f;
                    float f6 = f3 / 2.0f;
                    f = paddingTop + f6;
                    f2 = (i9 - paddingBottom) - f6;
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.c);
                    }
                    int itemCountNotGone3 = flexLine.getItemCountNotGone();
                    f3 = itemCountNotGone3 != 0 ? (i9 - flexLine.e) / (itemCountNotGone3 + 1) : 0.0f;
                    f = paddingTop + f3;
                    f2 = (i9 - paddingBottom) - f3;
                }
                float fMax = Math.max(f3, 0.0f);
                i6 = 0;
                while (i6 < flexLine.h) {
                    int i16 = flexLine.o + i6;
                    reorderedChildAt = getReorderedChildAt(i16);
                    if (reorderedChildAt != null || reorderedChildAt.getVisibility() == 8) {
                        i7 = i6;
                    } else {
                        LayoutParams layoutParams2 = (LayoutParams) reorderedChildAt.getLayoutParams();
                        float f7 = f + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                        float f8 = f2 - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        if (g(i16, i6)) {
                            int i17 = this.k;
                            float f9 = i17;
                            f4 = f7 + f9;
                            i8 = i17;
                            f5 = f8 - f9;
                        } else {
                            f4 = f7;
                            f5 = f8;
                            i8 = 0;
                        }
                        int i18 = (i6 != flexLine.h - 1 || (this.i & 4) <= 0) ? 0 : this.k;
                        if (!z) {
                            i7 = i6;
                            layoutParams = layoutParams2;
                            if (z2) {
                                this.o.R(reorderedChildAt, flexLine, false, paddingLeft, Math.round(f5) - reorderedChildAt.getMeasuredHeight(), paddingLeft + reorderedChildAt.getMeasuredWidth(), Math.round(f5));
                            } else {
                                this.o.R(reorderedChildAt, flexLine, false, paddingLeft, Math.round(f4), paddingLeft + reorderedChildAt.getMeasuredWidth(), Math.round(f4) + reorderedChildAt.getMeasuredHeight());
                            }
                        } else if (z2) {
                            i7 = i6;
                            layoutParams = layoutParams2;
                            this.o.R(reorderedChildAt, flexLine, true, i10 - reorderedChildAt.getMeasuredWidth(), Math.round(f5) - reorderedChildAt.getMeasuredHeight(), i10, Math.round(f5));
                        } else {
                            i7 = i6;
                            layoutParams = layoutParams2;
                            this.o.R(reorderedChildAt, flexLine, true, i10 - reorderedChildAt.getMeasuredWidth(), Math.round(f4), i10, Math.round(f4) + reorderedChildAt.getMeasuredHeight());
                        }
                        LayoutParams layoutParams3 = layoutParams;
                        float measuredHeight = f4 + reorderedChildAt.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
                        float measuredHeight2 = f5 - ((reorderedChildAt.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin);
                        if (z2) {
                            flexLine.a(reorderedChildAt, 0, i18, 0, i8);
                        } else {
                            flexLine.a(reorderedChildAt, 0, i8, 0, i18);
                        }
                        f = measuredHeight;
                        f2 = measuredHeight2;
                    }
                    i6 = i7 + 1;
                }
                int i19 = flexLine.g;
                paddingLeft += i19;
                i10 -= i19;
            } else {
                f = paddingTop;
                i5 = i9 - paddingBottom;
            }
            f2 = i5;
            f3 = 0.0f;
            float fMax2 = Math.max(f3, 0.0f);
            i6 = 0;
            while (i6 < flexLine.h) {
                int i110 = flexLine.o + i6;
                reorderedChildAt = getReorderedChildAt(i110);
                if (reorderedChildAt != null) {
                    i7 = i6;
                } else {
                    i7 = i6;
                }
                i6 = i7 + 1;
            }
            int i111 = flexLine.g;
            paddingLeft += i111;
            i10 -= i111;
        }
    }

    private void l(int i, int i2) {
        this.p.clear();
        this.q.a();
        this.o.c(this.q, i, i2);
        this.p = this.q.a;
        this.o.p(i, i2);
        if (this.d == 3) {
            for (FlexLine flexLine : this.p) {
                int iMax = Integer.MIN_VALUE;
                for (int i3 = 0; i3 < flexLine.h; i3++) {
                    View reorderedChildAt = getReorderedChildAt(flexLine.o + i3);
                    if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                        iMax = this.b != 2 ? Math.max(iMax, reorderedChildAt.getMeasuredHeight() + Math.max(flexLine.l - reorderedChildAt.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(iMax, reorderedChildAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max((flexLine.l - reorderedChildAt.getMeasuredHeight()) + reorderedChildAt.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                    }
                }
                flexLine.g = iMax;
            }
        }
        this.o.o(i, i2, getPaddingTop() + getPaddingBottom());
        this.o.X();
        n(this.a, i, i2, this.q.b);
    }

    private void m(int i, int i2) {
        this.p.clear();
        this.q.a();
        this.o.f(this.q, i, i2);
        this.p = this.q.a;
        this.o.p(i, i2);
        this.o.o(i, i2, getPaddingLeft() + getPaddingRight());
        this.o.X();
        n(this.a, i, i2, this.q.b);
    }

    private void n(int i, int i2, int i3, int i4) {
        int sumOfCrossSize;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        } else {
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + i);
            }
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException("Unknown width mode is set: " + mode);
            }
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < sumOfCrossSize) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i3, i4);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException("Unknown height mode is set: " + mode2);
            }
            if (size2 < sumOfCrossSize) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    private void o() {
        if (this.g == null && this.h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.n == null) {
            this.n = new SparseIntArray(getChildCount());
        }
        this.m = this.o.n(view, i, layoutParams, this.n);
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // com.google.android.flexbox.a
    public int getAlignContent() {
        return this.e;
    }

    @Override // com.google.android.flexbox.a
    public int getAlignItems() {
        return this.d;
    }

    @Override // com.google.android.flexbox.a
    public int getChildHeightMeasureSpec(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.google.android.flexbox.a
    public int getChildWidthMeasureSpec(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.google.android.flexbox.a
    public int getDecorationLengthCrossAxis(View view) {
        return 0;
    }

    @Override // com.google.android.flexbox.a
    public int getDecorationLengthMainAxis(View view, int i, int i2) {
        int i3;
        int i4;
        if (isMainAxisDirectionHorizontal()) {
            i3 = g(i, i2) ? 0 + this.l : 0;
            if ((this.j & 4) <= 0) {
                return i3;
            }
            i4 = this.l;
        } else {
            i3 = g(i, i2) ? 0 + this.k : 0;
            if ((this.i & 4) <= 0) {
                return i3;
            }
            i4 = this.k;
        }
        return i3 + i4;
    }

    @Nullable
    public Drawable getDividerDrawableHorizontal() {
        return this.g;
    }

    @Nullable
    public Drawable getDividerDrawableVertical() {
        return this.h;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexDirection() {
        return this.a;
    }

    @Override // com.google.android.flexbox.a
    public View getFlexItemAt(int i) {
        return getChildAt(i);
    }

    @Override // com.google.android.flexbox.a
    public int getFlexItemCount() {
        return getChildCount();
    }

    @Override // com.google.android.flexbox.a
    public List<FlexLine> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.p.size());
        for (FlexLine flexLine : this.p) {
            if (flexLine.getItemCountNotGone() != 0) {
                arrayList.add(flexLine);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.a
    public List<FlexLine> getFlexLinesInternal() {
        return this.p;
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
        Iterator<FlexLine> it2 = this.p.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it2.hasNext()) {
            iMax = Math.max(iMax, it2.next().e);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.a
    public int getMaxLine() {
        return this.f;
    }

    public View getReorderedChildAt(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.m;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    @Override // com.google.android.flexbox.a
    public View getReorderedFlexItemAt(int i) {
        return getReorderedChildAt(i);
    }

    public int getShowDividerHorizontal() {
        return this.i;
    }

    public int getShowDividerVertical() {
        return this.j;
    }

    @Override // com.google.android.flexbox.a
    public int getSumOfCrossSize() {
        int size = this.p.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            FlexLine flexLine = this.p.get(i2);
            if (h(i2)) {
                i += isMainAxisDirectionHorizontal() ? this.k : this.l;
            }
            if (i(i2)) {
                i += isMainAxisDirectionHorizontal() ? this.k : this.l;
            }
            i += flexLine.g;
        }
        return i;
    }

    @Override // com.google.android.flexbox.a
    public boolean isMainAxisDirectionHorizontal() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.h == null && this.g == null) {
            return;
        }
        if (this.i == 0 && this.j == 0) {
            return;
        }
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int i = this.a;
        if (i == 0) {
            c(canvas, layoutDirection == 1, this.b == 2);
            return;
        }
        if (i == 1) {
            c(canvas, layoutDirection != 1, this.b == 2);
            return;
        }
        if (i == 2) {
            boolean z = layoutDirection == 1;
            if (this.b == 2) {
                z = !z;
            }
            d(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = layoutDirection == 1;
        if (this.b == 2) {
            z2 = !z2;
        }
        d(canvas, z2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int i5 = this.a;
        if (i5 == 0) {
            j(layoutDirection == 1, i, i2, i3, i4);
            return;
        }
        if (i5 == 1) {
            j(layoutDirection != 1, i, i2, i3, i4);
            return;
        }
        if (i5 == 2) {
            z2 = layoutDirection == 1;
            k(this.b == 2 ? !z2 : z2, false, i, i2, i3, i4);
        } else if (i5 == 3) {
            z2 = layoutDirection == 1;
            k(this.b == 2 ? !z2 : z2, true, i, i2, i3, i4);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.a);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.n == null) {
            this.n = new SparseIntArray(getChildCount());
        }
        if (this.o.O(this.n)) {
            this.m = this.o.m(this.n);
        }
        int i3 = this.a;
        if (i3 == 0 || i3 == 1) {
            l(i, i2);
            return;
        }
        if (i3 == 2 || i3 == 3) {
            m(i, i2);
            return;
        }
        throw new IllegalStateException("Invalid value for the flex direction is set: " + this.a);
    }

    @Override // com.google.android.flexbox.a
    public void onNewFlexItemAdded(View view, int i, int i2, FlexLine flexLine) {
        if (g(i, i2)) {
            if (isMainAxisDirectionHorizontal()) {
                int i3 = flexLine.e;
                int i4 = this.l;
                flexLine.e = i3 + i4;
                flexLine.f += i4;
                return;
            }
            int i5 = flexLine.e;
            int i6 = this.k;
            flexLine.e = i5 + i6;
            flexLine.f += i6;
        }
    }

    @Override // com.google.android.flexbox.a
    public void onNewFlexLineAdded(FlexLine flexLine) {
        if (isMainAxisDirectionHorizontal()) {
            if ((this.j & 4) > 0) {
                int i = flexLine.e;
                int i2 = this.l;
                flexLine.e = i + i2;
                flexLine.f += i2;
                return;
            }
            return;
        }
        if ((this.i & 4) > 0) {
            int i3 = flexLine.e;
            int i4 = this.k;
            flexLine.e = i3 + i4;
            flexLine.f += i4;
        }
    }

    @Override // com.google.android.flexbox.a
    public void setAlignContent(int i) {
        if (this.e != i) {
            this.e = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.a
    public void setAlignItems(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(@Nullable Drawable drawable) {
        if (drawable == this.g) {
            return;
        }
        this.g = drawable;
        if (drawable != null) {
            this.k = drawable.getIntrinsicHeight();
        } else {
            this.k = 0;
        }
        o();
        requestLayout();
    }

    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        if (drawable == this.h) {
            return;
        }
        this.h = drawable;
        if (drawable != null) {
            this.l = drawable.getIntrinsicWidth();
        } else {
            this.l = 0;
        }
        o();
        requestLayout();
    }

    @Override // com.google.android.flexbox.a
    public void setFlexDirection(int i) {
        if (this.a != i) {
            this.a = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.a
    public void setFlexLines(List<FlexLine> list) {
        this.p = list;
    }

    @Override // com.google.android.flexbox.a
    public void setFlexWrap(int i) {
        if (this.b != i) {
            this.b = i;
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
        if (this.f != i) {
            this.f = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.i) {
            this.i = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.j) {
            this.j = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.a
    public void updateViewCache(int i, View view) {
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = -1;
        this.o = new b(this);
        this.p = new ArrayList();
        this.q = new b.C0157b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FlexboxLayout, i, 0);
        this.a = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_flexDirection, 0);
        this.b = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_flexWrap, 0);
        this.c = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_justifyContent, 0);
        this.d = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_alignItems, 0);
        this.e = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_alignContent, 0);
        this.f = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_maxLine, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_showDivider, 0);
        if (i2 != 0) {
            this.j = i2;
            this.i = i2;
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_showDividerVertical, 0);
        if (i3 != 0) {
            this.j = i3;
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_showDividerHorizontal, 0);
        if (i4 != 0) {
            this.i = i4;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();
        private int a;
        private float b;
        private float c;
        private int d;
        private float e;
        private int f;
        private int g;
        private int h;
        private int i;
        private boolean j;

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
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.f = -1;
            this.g = -1;
            this.h = 16777215;
            this.i = 16777215;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FlexboxLayout_Layout);
            this.a = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_Layout_layout_order, 1);
            this.b = typedArrayObtainStyledAttributes.getFloat(R.styleable.FlexboxLayout_Layout_layout_flexGrow, 0.0f);
            this.c = typedArrayObtainStyledAttributes.getFloat(R.styleable.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.d = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.e = typedArrayObtainStyledAttributes.getFraction(R.styleable.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_minWidth, -1);
            this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_minHeight, -1);
            this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_maxWidth, 16777215);
            this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_maxHeight, 16777215);
            this.j = typedArrayObtainStyledAttributes.getBoolean(R.styleable.FlexboxLayout_Layout_layout_wrapBefore, false);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getAlignSelf() {
            return this.d;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexBasisPercent() {
            return this.e;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexGrow() {
            return this.b;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexShrink() {
            return this.c;
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
            return this.i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxWidth() {
            return this.h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMinHeight() {
            return this.g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMinWidth() {
            return this.f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return this.a;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean isWrapBefore() {
            return this.j;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setAlignSelf(int i) {
            this.d = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexBasisPercent(float f) {
            this.e = f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexGrow(float f) {
            this.b = f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexShrink(float f) {
            this.c = f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setHeight(int i) {
            ((ViewGroup.MarginLayoutParams) this).height = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMaxHeight(int i) {
            this.i = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMaxWidth(int i) {
            this.h = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinHeight(int i) {
            this.g = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinWidth(int i) {
            this.f = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setOrder(int i) {
            this.a = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setWidth(int i) {
            ((ViewGroup.MarginLayoutParams) this).width = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setWrapBefore(boolean z) {
            this.j = z;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeFloat(this.b);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.d);
            parcel.writeFloat(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.f = -1;
            this.g = -1;
            this.h = 16777215;
            this.i = 16777215;
            this.a = layoutParams.a;
            this.b = layoutParams.b;
            this.c = layoutParams.c;
            this.d = layoutParams.d;
            this.e = layoutParams.e;
            this.f = layoutParams.f;
            this.g = layoutParams.g;
            this.h = layoutParams.h;
            this.i = layoutParams.i;
            this.j = layoutParams.j;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.f = -1;
            this.g = -1;
            this.h = 16777215;
            this.i = 16777215;
        }

        public LayoutParams(int i, int i2) {
            super(new ViewGroup.LayoutParams(i, i2));
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.f = -1;
            this.g = -1;
            this.h = 16777215;
            this.i = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.f = -1;
            this.g = -1;
            this.h = 16777215;
            this.i = 16777215;
        }

        public LayoutParams(Parcel parcel) {
            super(0, 0);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.f = -1;
            this.g = -1;
            this.h = 16777215;
            this.i = 16777215;
            this.a = parcel.readInt();
            this.b = parcel.readFloat();
            this.c = parcel.readFloat();
            this.d = parcel.readInt();
            this.e = parcel.readFloat();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readInt();
            this.i = parcel.readInt();
            this.j = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}
