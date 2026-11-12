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
import androidx.core.view.c;
import defpackage.a4j;
import defpackage.kx9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class FlexboxLayout extends ViewGroup implements kx9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8473b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Drawable g;
    public Drawable h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8474k;
    public int l;
    public int[] m;
    public SparseIntArray n;
    public b o;
    public List<a> p;
    public b.C0209b q;

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    public final void A() {
        if (this.g == null && this.h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    @Override // defpackage.kx9
    public void a(View view, int i, int i2, a aVar) {
        if (s(i, i2)) {
            if (j()) {
                int i3 = aVar.e;
                int i4 = this.l;
                aVar.e = i3 + i4;
                aVar.f += i4;
                return;
            }
            int i5 = aVar.e;
            int i6 = this.f8474k;
            aVar.e = i5 + i6;
            aVar.f += i6;
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

    @Override // defpackage.kx9
    public View b(int i) {
        return getChildAt(i);
    }

    @Override // defpackage.kx9
    public int c(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // defpackage.kx9
    public int d(View view) {
        return 0;
    }

    @Override // defpackage.kx9
    public View e(int i) {
        return r(i);
    }

    @Override // defpackage.kx9
    public int f(View view, int i, int i2) {
        int i3;
        int i4;
        if (j()) {
            i3 = s(i, i2) ? this.l : 0;
            if ((this.j & 4) <= 0) {
                return i3;
            }
            i4 = this.l;
        } else {
            i3 = s(i, i2) ? this.f8474k : 0;
            if ((this.i & 4) <= 0) {
                return i3;
            }
            i4 = this.f8474k;
        }
        return i3 + i4;
    }

    @Override // defpackage.kx9
    public int g(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // defpackage.kx9
    public int getAlignContent() {
        return this.e;
    }

    @Override // defpackage.kx9
    public int getAlignItems() {
        return this.d;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.g;
    }

    public Drawable getDividerDrawableVertical() {
        return this.h;
    }

    @Override // defpackage.kx9
    public int getFlexDirection() {
        return this.f8472a;
    }

    @Override // defpackage.kx9
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<a> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.p.size());
        for (a aVar : this.p) {
            if (aVar.c() != 0) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    @Override // defpackage.kx9
    public List<a> getFlexLinesInternal() {
        return this.p;
    }

    @Override // defpackage.kx9
    public int getFlexWrap() {
        return this.f8473b;
    }

    public int getJustifyContent() {
        return this.c;
    }

    @Override // defpackage.kx9
    public int getLargestMainSize() {
        Iterator<a> it = this.p.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().e);
        }
        return iMax;
    }

    @Override // defpackage.kx9
    public int getMaxLine() {
        return this.f;
    }

    public int getShowDividerHorizontal() {
        return this.i;
    }

    public int getShowDividerVertical() {
        return this.j;
    }

    @Override // defpackage.kx9
    public int getSumOfCrossSize() {
        int size = this.p.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = this.p.get(i2);
            if (t(i2)) {
                i += j() ? this.f8474k : this.l;
            }
            if (u(i2)) {
                i += j() ? this.f8474k : this.l;
            }
            i += aVar.g;
        }
        return i;
    }

    @Override // defpackage.kx9
    public void h(a aVar) {
        if (j()) {
            if ((this.j & 4) > 0) {
                int i = aVar.e;
                int i2 = this.l;
                aVar.e = i + i2;
                aVar.f += i2;
                return;
            }
            return;
        }
        if ((this.i & 4) > 0) {
            int i3 = aVar.e;
            int i4 = this.f8474k;
            aVar.e = i3 + i4;
            aVar.f += i4;
        }
    }

    @Override // defpackage.kx9
    public void i(int i, View view) {
    }

    @Override // defpackage.kx9
    public boolean j() {
        int i = this.f8472a;
        return i == 0 || i == 1;
    }

    public final boolean k(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.p.get(i2).c() > 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean l(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View viewR = r(i - i3);
            if (viewR != null && viewR.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    public final void m(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.p.get(i);
            for (int i2 = 0; i2 < aVar.h; i2++) {
                int i3 = aVar.o + i2;
                View viewR = r(i3);
                if (viewR != null && viewR.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewR.getLayoutParams();
                    if (s(i3, i2)) {
                        p(canvas, z ? viewR.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (viewR.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.l, aVar.f8489b, aVar.g);
                    }
                    if (i2 == aVar.h - 1 && (this.j & 4) > 0) {
                        p(canvas, z ? (viewR.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.l : viewR.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, aVar.f8489b, aVar.g);
                    }
                }
            }
            if (t(i)) {
                o(canvas, paddingLeft, z2 ? aVar.d : aVar.f8489b - this.f8474k, iMax);
            }
            if (u(i) && (this.i & 4) > 0) {
                o(canvas, paddingLeft, z2 ? aVar.f8489b - this.f8474k : aVar.d, iMax);
            }
        }
    }

    public final void n(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.p.get(i);
            for (int i2 = 0; i2 < aVar.h; i2++) {
                int i3 = aVar.o + i2;
                View viewR = r(i3);
                if (viewR != null && viewR.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewR.getLayoutParams();
                    if (s(i3, i2)) {
                        o(canvas, aVar.f8488a, z2 ? viewR.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (viewR.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f8474k, aVar.g);
                    }
                    if (i2 == aVar.h - 1 && (this.i & 4) > 0) {
                        o(canvas, aVar.f8488a, z2 ? (viewR.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f8474k : viewR.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, aVar.g);
                    }
                }
            }
            if (t(i)) {
                p(canvas, z ? aVar.c : aVar.f8488a - this.l, paddingTop, iMax);
            }
            if (u(i) && (this.j & 4) > 0) {
                p(canvas, z ? aVar.f8488a - this.l : aVar.c, paddingTop, iMax);
            }
        }
    }

    public final void o(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.g;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.f8474k + i2);
        this.g.draw(canvas);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.h == null && this.g == null) {
            return;
        }
        if (this.i == 0 && this.j == 0) {
            return;
        }
        int iA = c.A(this);
        int i = this.f8472a;
        if (i == 0) {
            m(canvas, iA == 1, this.f8473b == 2);
            return;
        }
        if (i == 1) {
            m(canvas, iA != 1, this.f8473b == 2);
            return;
        }
        if (i == 2) {
            boolean z = iA == 1;
            if (this.f8473b == 2) {
                z = !z;
            }
            n(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = iA == 1;
        if (this.f8473b == 2) {
            z2 = !z2;
        }
        n(canvas, z2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int iA = c.A(this);
        int i5 = this.f8472a;
        if (i5 == 0) {
            v(iA == 1, i, i2, i3, i4);
            return;
        }
        if (i5 == 1) {
            v(iA != 1, i, i2, i3, i4);
            return;
        }
        if (i5 == 2) {
            z2 = iA == 1;
            w(this.f8473b == 2 ? !z2 : z2, false, i, i2, i3, i4);
        } else if (i5 == 3) {
            z2 = iA == 1;
            w(this.f8473b == 2 ? !z2 : z2, true, i, i2, i3, i4);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.f8472a);
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
        int i3 = this.f8472a;
        if (i3 == 0 || i3 == 1) {
            x(i, i2);
            return;
        }
        if (i3 == 2 || i3 == 3) {
            y(i, i2);
            return;
        }
        throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f8472a);
    }

    public final void p(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.h;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.l + i, i3 + i2);
        this.h.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public View r(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.m;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    public final boolean s(int i, int i2) {
        if (l(i, i2)) {
            if (j()) {
                return (this.j & 1) != 0;
            }
            return (this.i & 1) != 0;
        }
        if (j()) {
            return (this.j & 2) != 0;
        }
        return (this.i & 2) != 0;
    }

    public void setAlignContent(int i) {
        if (this.e != i) {
            this.e = i;
            requestLayout();
        }
    }

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

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.g) {
            return;
        }
        this.g = drawable;
        if (drawable != null) {
            this.f8474k = drawable.getIntrinsicHeight();
        } else {
            this.f8474k = 0;
        }
        A();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.h) {
            return;
        }
        this.h = drawable;
        if (drawable != null) {
            this.l = drawable.getIntrinsicWidth();
        } else {
            this.l = 0;
        }
        A();
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.f8472a != i) {
            this.f8472a = i;
            requestLayout();
        }
    }

    @Override // defpackage.kx9
    public void setFlexLines(List<a> list) {
        this.p = list;
    }

    public void setFlexWrap(int i) {
        if (this.f8473b != i) {
            this.f8473b = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }

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

    public final boolean t(int i) {
        if (i < 0 || i >= this.p.size()) {
            return false;
        }
        if (k(i)) {
            if (j()) {
                return (this.i & 1) != 0;
            }
            return (this.j & 1) != 0;
        }
        if (j()) {
            return (this.i & 2) != 0;
        }
        return (this.j & 2) != 0;
    }

    public final boolean u(int i) {
        if (i < 0 || i >= this.p.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.p.size(); i2++) {
            if (this.p.get(i2).c() > 0) {
                return false;
            }
        }
        if (j()) {
            return (this.i & 4) != 0;
        }
        return (this.j & 4) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00df  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:48:0x0108  */
    /* JADX WARN: Code duplicated, block: B:49:0x0112  */
    /* JADX WARN: Code duplicated, block: B:52:0x011b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0123  */
    /* JADX WARN: Code duplicated, block: B:55:0x0128  */
    /* JADX WARN: Code duplicated, block: B:59:0x0131 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0133  */
    /* JADX WARN: Code duplicated, block: B:61:0x0166  */
    /* JADX WARN: Code duplicated, block: B:62:0x0190  */
    /* JADX WARN: Code duplicated, block: B:64:0x019d  */
    /* JADX WARN: Code duplicated, block: B:65:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:69:0x0200  */
    /* JADX WARN: Code duplicated, block: B:71:0x020f  */
    public final void v(boolean z, int i, int i2, int i3, int i4) {
        float measuredWidth;
        float f;
        float f2;
        float fMax;
        int i5;
        int i6;
        View viewR;
        int i7;
        int i8;
        int i9;
        char c;
        LayoutParams layoutParams;
        float f3;
        float f4;
        float f5;
        int i10;
        char c2;
        int i11;
        LayoutParams layoutParams2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i12 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.p.size();
        int i13 = 0;
        while (i13 < size) {
            a aVar = this.p.get(i13);
            if (t(i13)) {
                int i14 = this.f8474k;
                paddingBottom -= i14;
                paddingTop += i14;
            }
            int i15 = this.c;
            char c3 = 4;
            int i16 = 1;
            if (i15 == 0) {
                measuredWidth = paddingLeft;
                f = i12 - paddingRight;
            } else if (i15 != 1) {
                if (i15 == 2) {
                    int i17 = aVar.e;
                    measuredWidth = paddingLeft + ((i12 - i17) / 2.0f);
                    f = (i12 - paddingRight) - ((i12 - i17) / 2.0f);
                } else if (i15 == 3) {
                    measuredWidth = paddingLeft;
                    int iC = aVar.c();
                    f2 = (i12 - aVar.e) / (iC != 1 ? iC - 1 : 1.0f);
                    f = i12 - paddingRight;
                } else if (i15 == 4) {
                    int iC2 = aVar.c();
                    f2 = iC2 != 0 ? (i12 - aVar.e) / iC2 : 0.0f;
                    float f6 = f2 / 2.0f;
                    measuredWidth = paddingLeft + f6;
                    f = (i12 - paddingRight) - f6;
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.c);
                    }
                    int iC3 = aVar.c();
                    f2 = iC3 != 0 ? (i12 - aVar.e) / (iC3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f2;
                    f = (i12 - paddingRight) - f2;
                }
                fMax = Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < aVar.h) {
                    i6 = aVar.o + i5;
                    viewR = r(i6);
                    if (viewR != null) {
                        i7 = paddingLeft;
                        i8 = i16;
                        i9 = i5;
                        c = c3;
                    } else if (viewR.getVisibility() == 8) {
                        i7 = paddingLeft;
                        i8 = i16;
                        i9 = i5;
                        c = 4;
                    } else {
                        layoutParams = (LayoutParams) viewR.getLayoutParams();
                        f3 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                        f4 = f - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        if (s(i6, i5)) {
                            int i18 = this.l;
                            float f7 = i18;
                            f3 += f7;
                            i10 = i18;
                            f5 = f4 - f7;
                        } else {
                            f5 = f4;
                            i10 = 0;
                        }
                        if (i5 == aVar.h - i16) {
                            c2 = 4;
                            i11 = (this.j & 4) > 0 ? this.l : 0;
                            if (this.f8473b == 2) {
                                i7 = paddingLeft;
                                i8 = i16;
                                i9 = i5;
                                layoutParams2 = layoutParams;
                                c = c2;
                                if (z) {
                                    this.o.Q(viewR, aVar, Math.round(f5) - viewR.getMeasuredWidth(), paddingTop, Math.round(f5), paddingTop + viewR.getMeasuredHeight());
                                } else {
                                    this.o.Q(viewR, aVar, Math.round(f3), paddingTop, Math.round(f3) + viewR.getMeasuredWidth(), paddingTop + viewR.getMeasuredHeight());
                                }
                            } else if (z) {
                                i8 = i16;
                                i9 = i5;
                                i7 = paddingLeft;
                                layoutParams2 = layoutParams;
                                c = c2;
                                this.o.Q(viewR, aVar, Math.round(f5) - viewR.getMeasuredWidth(), paddingBottom - viewR.getMeasuredHeight(), Math.round(f5), paddingBottom);
                            } else {
                                i7 = paddingLeft;
                                i8 = i16;
                                i9 = i5;
                                layoutParams2 = layoutParams;
                                c = c2;
                                this.o.Q(viewR, aVar, Math.round(f3), paddingBottom - viewR.getMeasuredHeight(), Math.round(f3) + viewR.getMeasuredWidth(), paddingBottom);
                            }
                            measuredWidth = f3 + viewR.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                            float measuredWidth2 = f5 - ((viewR.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
                            if (z) {
                                aVar.d(viewR, i11, 0, i10, 0);
                            } else {
                                aVar.d(viewR, i10, 0, i11, 0);
                            }
                            f = measuredWidth2;
                        } else {
                            c2 = 4;
                        }
                        if (this.f8473b == 2) {
                            i7 = paddingLeft;
                            i8 = i16;
                            i9 = i5;
                            layoutParams2 = layoutParams;
                            c = c2;
                            if (z) {
                                this.o.Q(viewR, aVar, Math.round(f5) - viewR.getMeasuredWidth(), paddingTop, Math.round(f5), paddingTop + viewR.getMeasuredHeight());
                            } else {
                                this.o.Q(viewR, aVar, Math.round(f3), paddingTop, Math.round(f3) + viewR.getMeasuredWidth(), paddingTop + viewR.getMeasuredHeight());
                            }
                        } else if (z) {
                            i8 = i16;
                            i9 = i5;
                            i7 = paddingLeft;
                            layoutParams2 = layoutParams;
                            c = c2;
                            this.o.Q(viewR, aVar, Math.round(f5) - viewR.getMeasuredWidth(), paddingBottom - viewR.getMeasuredHeight(), Math.round(f5), paddingBottom);
                        } else {
                            i7 = paddingLeft;
                            i8 = i16;
                            i9 = i5;
                            layoutParams2 = layoutParams;
                            c = c2;
                            this.o.Q(viewR, aVar, Math.round(f3), paddingBottom - viewR.getMeasuredHeight(), Math.round(f3) + viewR.getMeasuredWidth(), paddingBottom);
                        }
                        measuredWidth = f3 + viewR.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        float measuredWidth3 = f5 - ((viewR.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
                        if (z) {
                            aVar.d(viewR, i11, 0, i10, 0);
                        } else {
                            aVar.d(viewR, i10, 0, i11, 0);
                        }
                        f = measuredWidth3;
                    }
                    i5 = i9 + 1;
                    c3 = c;
                    i16 = i8;
                    paddingLeft = i7;
                }
                int i19 = paddingLeft;
                int i20 = aVar.g;
                paddingTop += i20;
                paddingBottom -= i20;
                i13++;
                paddingLeft = i19;
            } else {
                int i21 = aVar.e;
                f = i21 - paddingLeft;
                measuredWidth = (i12 - i21) + paddingRight;
            }
            f2 = 0.0f;
            fMax = Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < aVar.h) {
                i6 = aVar.o + i5;
                viewR = r(i6);
                if (viewR != null) {
                    i7 = paddingLeft;
                    i8 = i16;
                    i9 = i5;
                    c = c3;
                } else if (viewR.getVisibility() == 8) {
                    i7 = paddingLeft;
                    i8 = i16;
                    i9 = i5;
                    c = 4;
                } else {
                    layoutParams = (LayoutParams) viewR.getLayoutParams();
                    f3 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    f4 = f - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    if (s(i6, i5)) {
                        int i110 = this.l;
                        float f8 = i110;
                        f3 += f8;
                        i10 = i110;
                        f5 = f4 - f8;
                    } else {
                        f5 = f4;
                        i10 = 0;
                    }
                    if (i5 == aVar.h - i16) {
                        c2 = 4;
                        if ((this.j & 4) > 0) {
                        }
                        if (this.f8473b == 2) {
                            i7 = paddingLeft;
                            i8 = i16;
                            i9 = i5;
                            layoutParams2 = layoutParams;
                            c = c2;
                            if (z) {
                                this.o.Q(viewR, aVar, Math.round(f5) - viewR.getMeasuredWidth(), paddingTop, Math.round(f5), paddingTop + viewR.getMeasuredHeight());
                            } else {
                                this.o.Q(viewR, aVar, Math.round(f3), paddingTop, Math.round(f3) + viewR.getMeasuredWidth(), paddingTop + viewR.getMeasuredHeight());
                            }
                        } else if (z) {
                            i8 = i16;
                            i9 = i5;
                            i7 = paddingLeft;
                            layoutParams2 = layoutParams;
                            c = c2;
                            this.o.Q(viewR, aVar, Math.round(f5) - viewR.getMeasuredWidth(), paddingBottom - viewR.getMeasuredHeight(), Math.round(f5), paddingBottom);
                        } else {
                            i7 = paddingLeft;
                            i8 = i16;
                            i9 = i5;
                            layoutParams2 = layoutParams;
                            c = c2;
                            this.o.Q(viewR, aVar, Math.round(f3), paddingBottom - viewR.getMeasuredHeight(), Math.round(f3) + viewR.getMeasuredWidth(), paddingBottom);
                        }
                        measuredWidth = f3 + viewR.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        float measuredWidth4 = f5 - ((viewR.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
                        if (z) {
                            aVar.d(viewR, i11, 0, i10, 0);
                        } else {
                            aVar.d(viewR, i10, 0, i11, 0);
                        }
                        f = measuredWidth4;
                    } else {
                        c2 = 4;
                    }
                    if (this.f8473b == 2) {
                        i7 = paddingLeft;
                        i8 = i16;
                        i9 = i5;
                        layoutParams2 = layoutParams;
                        c = c2;
                        if (z) {
                            this.o.Q(viewR, aVar, Math.round(f5) - viewR.getMeasuredWidth(), paddingTop, Math.round(f5), paddingTop + viewR.getMeasuredHeight());
                        } else {
                            this.o.Q(viewR, aVar, Math.round(f3), paddingTop, Math.round(f3) + viewR.getMeasuredWidth(), paddingTop + viewR.getMeasuredHeight());
                        }
                    } else if (z) {
                        i8 = i16;
                        i9 = i5;
                        i7 = paddingLeft;
                        layoutParams2 = layoutParams;
                        c = c2;
                        this.o.Q(viewR, aVar, Math.round(f5) - viewR.getMeasuredWidth(), paddingBottom - viewR.getMeasuredHeight(), Math.round(f5), paddingBottom);
                    } else {
                        i7 = paddingLeft;
                        i8 = i16;
                        i9 = i5;
                        layoutParams2 = layoutParams;
                        c = c2;
                        this.o.Q(viewR, aVar, Math.round(f3), paddingBottom - viewR.getMeasuredHeight(), Math.round(f3) + viewR.getMeasuredWidth(), paddingBottom);
                    }
                    measuredWidth = f3 + viewR.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                    float measuredWidth5 = f5 - ((viewR.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
                    if (z) {
                        aVar.d(viewR, i11, 0, i10, 0);
                    } else {
                        aVar.d(viewR, i10, 0, i11, 0);
                    }
                    f = measuredWidth5;
                }
                i5 = i9 + 1;
                c3 = c;
                i16 = i8;
                paddingLeft = i7;
            }
            int i111 = paddingLeft;
            int i22 = aVar.g;
            paddingTop += i22;
            paddingBottom -= i22;
            i13++;
            paddingLeft = i111;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:49:0x0102  */
    /* JADX WARN: Code duplicated, block: B:50:0x010e  */
    /* JADX WARN: Code duplicated, block: B:53:0x011a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0122  */
    /* JADX WARN: Code duplicated, block: B:56:0x0127  */
    /* JADX WARN: Code duplicated, block: B:59:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x012f  */
    /* JADX WARN: Code duplicated, block: B:61:0x015e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0186  */
    /* JADX WARN: Code duplicated, block: B:64:0x0190  */
    /* JADX WARN: Code duplicated, block: B:65:0x01af  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:71:0x0207  */
    public final void w(boolean z, boolean z2, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        float f2;
        float f3;
        float fMax;
        int i6;
        int i7;
        View viewR;
        int i8;
        boolean z3;
        char c;
        LayoutParams layoutParams;
        float f4;
        float f5;
        float f6;
        float f7;
        int i9;
        char c2;
        int i10;
        LayoutParams layoutParams2;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i11 = i4 - i2;
        int i12 = (i3 - i) - paddingRight;
        int size = this.p.size();
        for (int i13 = 0; i13 < size; i13++) {
            a aVar = this.p.get(i13);
            if (t(i13)) {
                int i14 = this.l;
                paddingLeft += i14;
                i12 -= i14;
            }
            int i15 = this.c;
            char c3 = 4;
            boolean z4 = true;
            if (i15 != 0) {
                if (i15 == 1) {
                    int i16 = aVar.e;
                    f = (i11 - i16) + paddingBottom;
                    i5 = i16 - paddingTop;
                } else if (i15 == 2) {
                    int i17 = aVar.e;
                    f2 = (i11 - paddingBottom) - ((i11 - i17) / 2.0f);
                    f = paddingTop + ((i11 - i17) / 2.0f);
                    f3 = 0.0f;
                } else if (i15 == 3) {
                    f = paddingTop;
                    int iC = aVar.c();
                    f3 = (i11 - aVar.e) / (iC != 1 ? iC - 1 : 1.0f);
                    f2 = i11 - paddingBottom;
                } else if (i15 == 4) {
                    int iC2 = aVar.c();
                    f3 = iC2 != 0 ? (i11 - aVar.e) / iC2 : 0.0f;
                    float f8 = f3 / 2.0f;
                    f = paddingTop + f8;
                    f2 = (i11 - paddingBottom) - f8;
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.c);
                    }
                    int iC3 = aVar.c();
                    f3 = iC3 != 0 ? (i11 - aVar.e) / (iC3 + 1) : 0.0f;
                    f = paddingTop + f3;
                    f2 = (i11 - paddingBottom) - f3;
                }
                fMax = Math.max(f3, 0.0f);
                i6 = 0;
                while (i6 < aVar.h) {
                    i7 = aVar.o + i6;
                    viewR = r(i7);
                    if (viewR != null) {
                        i8 = i6;
                        z3 = z4;
                        c = c3;
                    } else if (viewR.getVisibility() == 8) {
                        i8 = i6;
                        z3 = true;
                        c = 4;
                    } else {
                        layoutParams = (LayoutParams) viewR.getLayoutParams();
                        f4 = f + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        f5 = f2 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        if (s(i7, i6)) {
                            int i18 = this.f8474k;
                            float f9 = i18;
                            f6 = f4 + f9;
                            i9 = i18;
                            f7 = f5 - f9;
                        } else {
                            f6 = f4;
                            f7 = f5;
                            i9 = 0;
                        }
                        if (i6 == aVar.h - 1) {
                            c2 = 4;
                            i10 = (this.i & 4) > 0 ? this.f8474k : 0;
                            if (z) {
                                i8 = i6;
                                z3 = true;
                                layoutParams2 = layoutParams;
                                c = c2;
                                if (z2) {
                                    this.o.R(viewR, aVar, false, paddingLeft, Math.round(f7) - viewR.getMeasuredHeight(), paddingLeft + viewR.getMeasuredWidth(), Math.round(f7));
                                } else {
                                    this.o.R(viewR, aVar, false, paddingLeft, Math.round(f6), paddingLeft + viewR.getMeasuredWidth(), Math.round(f6) + viewR.getMeasuredHeight());
                                }
                            } else if (z2) {
                                i8 = i6;
                                z3 = true;
                                layoutParams2 = layoutParams;
                                c = c2;
                                this.o.R(viewR, aVar, true, i12 - viewR.getMeasuredWidth(), Math.round(f7) - viewR.getMeasuredHeight(), i12, Math.round(f7));
                            } else {
                                i8 = i6;
                                z3 = true;
                                layoutParams2 = layoutParams;
                                c = c2;
                                this.o.R(viewR, aVar, true, i12 - viewR.getMeasuredWidth(), Math.round(f6), i12, Math.round(f6) + viewR.getMeasuredHeight());
                            }
                            LayoutParams layoutParams3 = layoutParams2;
                            float measuredHeight = f6 + viewR.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
                            float measuredHeight2 = f7 - ((viewR.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin);
                            if (z2) {
                                aVar.d(viewR, 0, i10, 0, i9);
                            } else {
                                aVar.d(viewR, 0, i9, 0, i10);
                            }
                            f = measuredHeight;
                            f2 = measuredHeight2;
                        } else {
                            c2 = 4;
                        }
                        if (z) {
                            i8 = i6;
                            z3 = true;
                            layoutParams2 = layoutParams;
                            c = c2;
                            if (z2) {
                                this.o.R(viewR, aVar, false, paddingLeft, Math.round(f7) - viewR.getMeasuredHeight(), paddingLeft + viewR.getMeasuredWidth(), Math.round(f7));
                            } else {
                                this.o.R(viewR, aVar, false, paddingLeft, Math.round(f6), paddingLeft + viewR.getMeasuredWidth(), Math.round(f6) + viewR.getMeasuredHeight());
                            }
                        } else if (z2) {
                            i8 = i6;
                            z3 = true;
                            layoutParams2 = layoutParams;
                            c = c2;
                            this.o.R(viewR, aVar, true, i12 - viewR.getMeasuredWidth(), Math.round(f7) - viewR.getMeasuredHeight(), i12, Math.round(f7));
                        } else {
                            i8 = i6;
                            z3 = true;
                            layoutParams2 = layoutParams;
                            c = c2;
                            this.o.R(viewR, aVar, true, i12 - viewR.getMeasuredWidth(), Math.round(f6), i12, Math.round(f6) + viewR.getMeasuredHeight());
                        }
                        LayoutParams layoutParams4 = layoutParams2;
                        float measuredHeight3 = f6 + viewR.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
                        float measuredHeight4 = f7 - ((viewR.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin);
                        if (z2) {
                            aVar.d(viewR, 0, i10, 0, i9);
                        } else {
                            aVar.d(viewR, 0, i9, 0, i10);
                        }
                        f = measuredHeight3;
                        f2 = measuredHeight4;
                    }
                    i6 = i8 + 1;
                    z4 = z3;
                    c3 = c;
                }
                int i19 = aVar.g;
                paddingLeft += i19;
                i12 -= i19;
            } else {
                f = paddingTop;
                i5 = i11 - paddingBottom;
            }
            f2 = i5;
            f3 = 0.0f;
            fMax = Math.max(f3, 0.0f);
            i6 = 0;
            while (i6 < aVar.h) {
                i7 = aVar.o + i6;
                viewR = r(i7);
                if (viewR != null) {
                    i8 = i6;
                    z3 = z4;
                    c = c3;
                } else if (viewR.getVisibility() == 8) {
                    i8 = i6;
                    z3 = true;
                    c = 4;
                } else {
                    layoutParams = (LayoutParams) viewR.getLayoutParams();
                    f4 = f + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    f5 = f2 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    if (s(i7, i6)) {
                        int i110 = this.f8474k;
                        float f10 = i110;
                        f6 = f4 + f10;
                        i9 = i110;
                        f7 = f5 - f10;
                    } else {
                        f6 = f4;
                        f7 = f5;
                        i9 = 0;
                    }
                    if (i6 == aVar.h - 1) {
                        c2 = 4;
                        if ((this.i & 4) > 0) {
                        }
                        if (z) {
                            i8 = i6;
                            z3 = true;
                            layoutParams2 = layoutParams;
                            c = c2;
                            if (z2) {
                                this.o.R(viewR, aVar, false, paddingLeft, Math.round(f7) - viewR.getMeasuredHeight(), paddingLeft + viewR.getMeasuredWidth(), Math.round(f7));
                            } else {
                                this.o.R(viewR, aVar, false, paddingLeft, Math.round(f6), paddingLeft + viewR.getMeasuredWidth(), Math.round(f6) + viewR.getMeasuredHeight());
                            }
                        } else if (z2) {
                            i8 = i6;
                            z3 = true;
                            layoutParams2 = layoutParams;
                            c = c2;
                            this.o.R(viewR, aVar, true, i12 - viewR.getMeasuredWidth(), Math.round(f7) - viewR.getMeasuredHeight(), i12, Math.round(f7));
                        } else {
                            i8 = i6;
                            z3 = true;
                            layoutParams2 = layoutParams;
                            c = c2;
                            this.o.R(viewR, aVar, true, i12 - viewR.getMeasuredWidth(), Math.round(f6), i12, Math.round(f6) + viewR.getMeasuredHeight());
                        }
                        LayoutParams layoutParams5 = layoutParams2;
                        float measuredHeight5 = f6 + viewR.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin;
                        float measuredHeight6 = f7 - ((viewR.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin);
                        if (z2) {
                            aVar.d(viewR, 0, i10, 0, i9);
                        } else {
                            aVar.d(viewR, 0, i9, 0, i10);
                        }
                        f = measuredHeight5;
                        f2 = measuredHeight6;
                    } else {
                        c2 = 4;
                    }
                    if (z) {
                        i8 = i6;
                        z3 = true;
                        layoutParams2 = layoutParams;
                        c = c2;
                        if (z2) {
                            this.o.R(viewR, aVar, false, paddingLeft, Math.round(f7) - viewR.getMeasuredHeight(), paddingLeft + viewR.getMeasuredWidth(), Math.round(f7));
                        } else {
                            this.o.R(viewR, aVar, false, paddingLeft, Math.round(f6), paddingLeft + viewR.getMeasuredWidth(), Math.round(f6) + viewR.getMeasuredHeight());
                        }
                    } else if (z2) {
                        i8 = i6;
                        z3 = true;
                        layoutParams2 = layoutParams;
                        c = c2;
                        this.o.R(viewR, aVar, true, i12 - viewR.getMeasuredWidth(), Math.round(f7) - viewR.getMeasuredHeight(), i12, Math.round(f7));
                    } else {
                        i8 = i6;
                        z3 = true;
                        layoutParams2 = layoutParams;
                        c = c2;
                        this.o.R(viewR, aVar, true, i12 - viewR.getMeasuredWidth(), Math.round(f6), i12, Math.round(f6) + viewR.getMeasuredHeight());
                    }
                    LayoutParams layoutParams6 = layoutParams2;
                    float measuredHeight7 = f6 + viewR.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin;
                    float measuredHeight8 = f7 - ((viewR.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin);
                    if (z2) {
                        aVar.d(viewR, 0, i10, 0, i9);
                    } else {
                        aVar.d(viewR, 0, i9, 0, i10);
                    }
                    f = measuredHeight7;
                    f2 = measuredHeight8;
                }
                i6 = i8 + 1;
                z4 = z3;
                c3 = c;
            }
            int i111 = aVar.g;
            paddingLeft += i111;
            i12 -= i111;
        }
    }

    public final void x(int i, int i2) {
        this.p.clear();
        this.q.a();
        this.o.c(this.q, i, i2);
        this.p = this.q.f8494a;
        this.o.p(i, i2);
        if (this.d == 3) {
            for (a aVar : this.p) {
                int iMax = Integer.MIN_VALUE;
                for (int i3 = 0; i3 < aVar.h; i3++) {
                    View viewR = r(aVar.o + i3);
                    if (viewR != null && viewR.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) viewR.getLayoutParams();
                        iMax = this.f8473b != 2 ? Math.max(iMax, viewR.getMeasuredHeight() + Math.max(aVar.l - viewR.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(iMax, viewR.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max((aVar.l - viewR.getMeasuredHeight()) + viewR.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                    }
                }
                aVar.g = iMax;
            }
        }
        this.o.o(i, i2, getPaddingTop() + getPaddingBottom());
        this.o.X();
        z(this.f8472a, i, i2, this.q.f8495b);
    }

    public final void y(int i, int i2) {
        this.p.clear();
        this.q.a();
        this.o.f(this.q, i, i2);
        this.p = this.q.f8494a;
        this.o.p(i, i2);
        this.o.o(i, i2, getPaddingLeft() + getPaddingRight());
        this.o.X();
        z(this.f8472a, i, i2, this.q.f8495b);
    }

    public final void z(int i, int i2, int i3, int i4) {
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

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = -1;
        this.o = new b(this);
        this.p = new ArrayList();
        this.q = new b.C0209b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a4j.f609b, i, 0);
        this.f8472a = typedArrayObtainStyledAttributes.getInt(a4j.h, 0);
        this.f8473b = typedArrayObtainStyledAttributes.getInt(a4j.i, 0);
        this.c = typedArrayObtainStyledAttributes.getInt(a4j.j, 0);
        this.d = typedArrayObtainStyledAttributes.getInt(a4j.d, 0);
        this.e = typedArrayObtainStyledAttributes.getInt(a4j.c, 0);
        this.f = typedArrayObtainStyledAttributes.getInt(a4j.f610k, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(a4j.e);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(a4j.f);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(a4j.g);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(a4j.l, 0);
        if (i2 != 0) {
            this.j = i2;
            this.i = i2;
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(a4j.n, 0);
        if (i3 != 0) {
            this.j = i3;
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(a4j.m, 0);
        if (i4 != 0) {
            this.i = i4;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f8476b;
        public float c;
        public int d;
        public float e;
        public int f;
        public int g;
        public int h;
        public int i;
        public boolean j;

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
            this.f8475a = 1;
            this.f8476b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.f = -1;
            this.g = -1;
            this.h = 16777215;
            this.i = 16777215;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a4j.o);
            this.f8475a = typedArrayObtainStyledAttributes.getInt(a4j.x, 1);
            this.f8476b = typedArrayObtainStyledAttributes.getFloat(a4j.f611r, 0.0f);
            this.c = typedArrayObtainStyledAttributes.getFloat(a4j.s, 1.0f);
            this.d = typedArrayObtainStyledAttributes.getInt(a4j.p, -1);
            this.e = typedArrayObtainStyledAttributes.getFraction(a4j.q, 1, 1, -1.0f);
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(a4j.w, -1);
            this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(a4j.v, -1);
            this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(a4j.u, 16777215);
            this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(a4j.t, 16777215);
            this.j = typedArrayObtainStyledAttributes.getBoolean(a4j.y, false);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // com.google.android.flexbox.FlexItem
        public int D() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int S() {
            return this.d;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float T() {
            return this.c;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void Z(int i) {
            this.g = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float b0() {
            return this.f8476b;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float c0() {
            return this.e;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean d0() {
            return this.j;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int f0() {
            return this.h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return this.f8475a;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void m0(int i) {
            this.f = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int n0() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int p() {
            return this.f;
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
            return this.g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int t0() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f8475a);
            parcel.writeFloat(this.f8476b);
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
            this.f8475a = 1;
            this.f8476b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.f = -1;
            this.g = -1;
            this.h = 16777215;
            this.i = 16777215;
            this.f8475a = layoutParams.f8475a;
            this.f8476b = layoutParams.f8476b;
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
            this.f8475a = 1;
            this.f8476b = 0.0f;
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
            this.f8475a = 1;
            this.f8476b = 0.0f;
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
            this.f8475a = 1;
            this.f8476b = 0.0f;
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
            this.f8475a = 1;
            this.f8476b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.f = -1;
            this.g = -1;
            this.h = 16777215;
            this.i = 16777215;
            this.f8475a = parcel.readInt();
            this.f8476b = parcel.readFloat();
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
