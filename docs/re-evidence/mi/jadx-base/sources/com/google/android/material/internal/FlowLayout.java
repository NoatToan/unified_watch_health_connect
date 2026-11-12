package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.core.view.c;
import defpackage.b4j;
import defpackage.c5f;
import defpackage.iqi;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class FlowLayout extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8739b;
    public boolean c;
    public int d;

    public FlowLayout(Context context) {
        this(context, null);
    }

    public static int a(int i, int i2, int i3) {
        if (i2 != Integer.MIN_VALUE) {
            return i2 != 1073741824 ? i3 : i;
        }
        return Math.min(i3, i);
    }

    public int b(View view) {
        Object tag = view.getTag(iqi.V);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean c() {
        return this.c;
    }

    public final void d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, b4j.j3, 0, 0);
        this.f8738a = typedArrayObtainStyledAttributes.getDimensionPixelSize(b4j.l3, 0);
        this.f8739b = typedArrayObtainStyledAttributes.getDimensionPixelSize(b4j.k3, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int getItemSpacing() {
        return this.f8739b;
    }

    public int getLineSpacing() {
        return this.f8738a;
    }

    public int getRowCount() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iA;
        int iB;
        if (getChildCount() == 0) {
            this.d = 0;
            return;
        }
        this.d = 1;
        boolean z2 = c.A(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i5 = (i3 - i) - paddingLeft;
        int measuredWidth = paddingRight;
        int i6 = paddingTop;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(iqi.V, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    iB = c5f.b(marginLayoutParams);
                    iA = c5f.a(marginLayoutParams);
                } else {
                    iA = 0;
                    iB = 0;
                }
                int measuredWidth2 = measuredWidth + iB + childAt.getMeasuredWidth();
                if (!this.c && measuredWidth2 > i5) {
                    i6 = this.f8738a + paddingTop;
                    this.d++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(iqi.V, Integer.valueOf(this.d - 1));
                int i8 = measuredWidth + iB;
                int measuredWidth3 = childAt.getMeasuredWidth() + i8;
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                if (z2) {
                    childAt.layout(i5 - measuredWidth3, i6, (i5 - measuredWidth) - iB, measuredHeight);
                } else {
                    childAt.layout(i8, i6, measuredWidth3, measuredHeight);
                }
                measuredWidth += iB + iA + childAt.getMeasuredWidth() + this.f8739b;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i5 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i5 - getPaddingRight();
        int i6 = paddingTop;
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i3 = marginLayoutParams.leftMargin;
                    i4 = marginLayoutParams.rightMargin;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                int i9 = paddingLeft2;
                if (paddingLeft2 + i3 + childAt.getMeasuredWidth() <= paddingRight || c()) {
                    paddingLeft = i9;
                } else {
                    paddingLeft = getPaddingLeft();
                    i6 = this.f8738a + paddingTop;
                }
                int measuredWidth = paddingLeft + i3 + childAt.getMeasuredWidth();
                int measuredHeight = i6 + childAt.getMeasuredHeight();
                if (measuredWidth > i7) {
                    i7 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + i3 + i4 + childAt.getMeasuredWidth() + this.f8739b;
                if (i8 == getChildCount() - 1) {
                    i7 += i4;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i7 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    public void setItemSpacing(int i) {
        this.f8739b = i;
    }

    public void setLineSpacing(int i) {
        this.f8738a = i;
    }

    public void setSingleLine(boolean z) {
        this.c = z;
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = false;
        d(context, attributeSet);
    }
}
