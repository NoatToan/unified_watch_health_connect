package com.xiaomi.fitness.baseui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.z4j;

/* JADX INFO: loaded from: classes7.dex */
public class CustomCircleProgressBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f11675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f11676b;
    public int c;
    public int d;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RectF f11677a = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f11678b = 0;
        public int c = 0;
        public int d = -1;
        public int e = -90;
        public Paint f;
        public Paint g;

        public a() {
            Paint paint = new Paint();
            this.f = paint;
            paint.setAntiAlias(true);
            Paint paint2 = this.f;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            this.f.setStrokeWidth(this.c);
            this.f.setColor(this.d);
            Paint paint3 = new Paint();
            this.g = paint3;
            paint3.setAntiAlias(true);
            this.g.setStyle(style);
            this.g.setStrokeWidth(this.c);
            this.g.setColor(-7829368);
        }

        public void a(int i, int i2) {
            int i3 = this.f11678b;
            if (i3 != 0) {
                RectF rectF = this.f11677a;
                int i4 = this.c;
                rectF.set((i4 / 2) + i3, (i4 / 2) + i3, (i - (i4 / 2)) - i3, (i2 - (i4 / 2)) - i3);
                return;
            }
            int paddingLeft = CustomCircleProgressBar.this.getPaddingLeft();
            int paddingRight = CustomCircleProgressBar.this.getPaddingRight();
            int paddingTop = CustomCircleProgressBar.this.getPaddingTop();
            int paddingBottom = CustomCircleProgressBar.this.getPaddingBottom();
            RectF rectF2 = this.f11677a;
            int i5 = this.c;
            rectF2.set(paddingLeft + (i5 / 2), paddingTop + (i5 / 2), (i - paddingRight) - (i5 / 2), (i2 - paddingBottom) - (i5 / 2));
        }

        public void b(int i) {
            this.d = i;
            this.f.setColor(i);
        }

        public void c(int i) {
            this.c = i;
            float f = i;
            this.f.setStrokeWidth(f);
            this.g.setStrokeWidth(f);
        }
    }

    public CustomCircleProgressBar(Context context) {
        super(context);
        this.f11675a = new a();
        this.f11676b = null;
        this.c = 100;
        this.d = 0;
    }

    public synchronized int getMax() {
        return this.c;
    }

    public synchronized int getProgress() {
        return this.d;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f11676b == null) {
            a aVar = this.f11675a;
            canvas.drawArc(aVar.f11677a, 0.0f, 360.0f, true, aVar.g);
        }
        float f = (this.d / this.c) * 360.0f;
        a aVar2 = this.f11675a;
        canvas.drawArc(aVar2.f11677a, aVar2.e, f, false, aVar2.f);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        Drawable background = getBackground();
        this.f11676b = background;
        if (background != null) {
            size = background.getMinimumWidth();
            size2 = this.f11676b.getMinimumHeight();
        }
        setMeasuredDimension(View.resolveSize(size, i), View.resolveSize(size2, i2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f11675a.a(i, i2);
    }

    public synchronized void setMax(int i) {
        try {
            this.c = i;
            if (i < 0) {
                this.c = 0;
            }
            int i2 = this.c;
            int i3 = this.d;
            if (i2 < i3) {
                this.c = i3;
            }
            invalidate();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setProgress(int i) {
        try {
            this.d = i;
            if (i < 0) {
                this.d = 0;
            }
            int i2 = this.d;
            int i3 = this.c;
            if (i2 > i3) {
                this.d = i3;
            }
            invalidate();
        } catch (Throwable th) {
            throw th;
        }
    }

    public CustomCircleProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11675a = new a();
        this.f11676b = null;
        this.c = 100;
        this.d = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z4j.s0);
        this.c = typedArrayObtainStyledAttributes.getInteger(z4j.u0, 100);
        this.f11675a.c(typedArrayObtainStyledAttributes.getInt(z4j.w0, 10));
        this.f11675a.b(typedArrayObtainStyledAttributes.getColor(z4j.v0, -1));
        this.f11675a.f11678b = typedArrayObtainStyledAttributes.getInt(z4j.t0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
