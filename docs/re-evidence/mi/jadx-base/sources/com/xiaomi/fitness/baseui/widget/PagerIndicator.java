package com.xiaomi.fitness.baseui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import defpackage.z4j;

/* JADX INFO: loaded from: classes7.dex */
public class PagerIndicator extends View {
    public static int h = 15;
    public static int i = 10;
    public static int j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f11713k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11715b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Paint g;

    public PagerIndicator(Context context) {
        this(context, null);
    }

    public final int a(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (this.d * 2) + getPaddingTop() + getPaddingBottom();
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    public final int b(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            return size;
        }
        int i3 = this.d * 2;
        int i4 = this.f11715b;
        int paddingLeft = (i3 * i4) + (this.c * (i4 - 1)) + getPaddingLeft() + getPaddingRight();
        return mode == Integer.MIN_VALUE ? Math.min(paddingLeft, size) : paddingLeft;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        int i2 = this.d;
        int i3 = i2;
        for (int i4 = 0; i4 < this.f11715b; i4++) {
            if (i4 == this.f11714a) {
                this.g.setColor(this.e);
            } else {
                this.g.setColor(this.f);
            }
            canvas.drawCircle(i3, i2, this.d, this.g);
            i3 = i3 + (this.d * 2) + this.c;
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(b(i2), a(i3));
    }

    public PagerIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PagerIndicator(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z4j.o4);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(z4j.q4, h);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(z4j.p4, i);
        this.e = typedArrayObtainStyledAttributes.getColor(z4j.r4, j);
        this.f = typedArrayObtainStyledAttributes.getColor(z4j.s4, f11713k);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.g = paint;
        paint.setAntiAlias(true);
    }
}
