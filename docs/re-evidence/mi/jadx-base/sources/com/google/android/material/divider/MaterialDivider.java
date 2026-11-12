package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.c;
import defpackage.b4j;
import defpackage.c9p;
import defpackage.k3j;
import defpackage.k8f;
import defpackage.l8f;
import defpackage.n8f;
import defpackage.ni4;
import defpackage.pii;
import defpackage.pmi;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialDivider extends View {
    public static final int f = k3j.F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l8f f8698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8699b;
    public int c;
    public int d;
    public int e;

    public MaterialDivider(Context context) {
        this(context, null);
    }

    public int getDividerColor() {
        return this.c;
    }

    public int getDividerInsetEnd() {
        return this.e;
    }

    public int getDividerInsetStart() {
        return this.d;
    }

    public int getDividerThickness() {
        return this.f8699b;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z = c.A(this) == 1;
        int i2 = z ? this.e : this.d;
        if (z) {
            width = getWidth();
            i = this.d;
        } else {
            width = getWidth();
            i = this.e;
        }
        this.f8698a.setBounds(i2, 0, width - i, getBottom() - getTop());
        this.f8698a.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.f8699b;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.c != i) {
            this.c = i;
            this.f8698a.b0(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(ni4.c(getContext(), i));
    }

    public void setDividerInsetEnd(int i) {
        this.e = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.d = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.f8699b != i) {
            this.f8699b = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pii.J);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(Context context, AttributeSet attributeSet, int i) {
        int i2 = f;
        super(n8f.c(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        this.f8698a = new l8f();
        TypedArray typedArrayH = c9p.h(context2, attributeSet, b4j.a5, i, i2, new int[0]);
        this.f8699b = typedArrayH.getDimensionPixelSize(b4j.e5, getResources().getDimensionPixelSize(pmi.B));
        this.d = typedArrayH.getDimensionPixelOffset(b4j.d5, 0);
        this.e = typedArrayH.getDimensionPixelOffset(b4j.c5, 0);
        setDividerColor(k8f.b(context2, typedArrayH, b4j.b5).getDefaultColor());
        typedArrayH.recycle();
    }
}
