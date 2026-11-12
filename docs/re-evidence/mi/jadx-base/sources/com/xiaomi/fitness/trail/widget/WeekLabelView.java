package com.xiaomi.fitness.trail.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.xiaomi.passport.ui.internal.MenuBuilder;
import defpackage.bhi;
import defpackage.w4j;

/* JADX INFO: loaded from: classes10.dex */
public class WeekLabelView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f13275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f13276b;
    public int c;
    public int d;
    public int e;
    public float f;
    public float g;
    public String[] h;
    public Paint.FontMetrics i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13277k;

    public WeekLabelView(Context context) {
        this(context, null);
    }

    public final void a() {
        Paint paint = new Paint(1);
        this.f13275a = paint;
        paint.setDither(true);
        this.f13275a.setStrokeCap(Paint.Cap.ROUND);
        this.f13275a.setTextAlign(Paint.Align.CENTER);
        Resources resources = getResources();
        this.f13275a.setTextSize(this.j);
        this.f13275a.setColor(this.f13277k);
        this.i = this.f13275a.getFontMetrics();
        this.h = resources.getStringArray(bhi.f4218a);
        this.f13276b = new Rect();
        this.c = -1;
        for (String str : this.h) {
            this.f13275a.getTextBounds(str, 0, str.length(), this.f13276b);
            if (this.c < this.f13276b.height()) {
                this.c = this.f13276b.height();
            }
        }
        this.c = (int) (this.c * 1.1f);
    }

    public final int b(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return (mode == 0 || mode == 1073741824) ? size : i2;
        }
        return Math.min(i2, size);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float width = getWidth() * 0.088f;
        this.f = width;
        this.g = width;
        float f = ((int) ((this.d - width) - width)) / 6.0f;
        float f2 = (this.c * 0.5f) + this.i.descent;
        for (String str : this.h) {
            canvas.drawText(str, width, f2, this.f13275a);
            width += f;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.d = b(i, this.e);
        int iB = b(i2, this.e);
        this.c = iB;
        setMeasuredDimension(this.d, iB);
    }

    public WeekLabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WeekLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = 200;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w4j.f5);
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(w4j.g5, 20);
        this.f13277k = typedArrayObtainStyledAttributes.getColor(w4j.h5, MenuBuilder.CATEGORY_MASK);
        typedArrayObtainStyledAttributes.recycle();
        a();
    }
}
