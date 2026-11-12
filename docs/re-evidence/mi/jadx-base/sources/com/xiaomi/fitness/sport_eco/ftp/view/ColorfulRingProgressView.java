package com.xiaomi.fitness.sport_eco.ftp.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import defpackage.v4j;

/* JADX INFO: loaded from: classes10.dex */
public class ColorfulRingProgressView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f13079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f13080b;
    public int c;
    public float d;
    public int e;
    public int f;
    public LinearGradient g;
    public Context h;
    public RectF i;
    public Paint j;

    public ColorfulRingProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13079a = 75.0f;
        this.c = -1973791;
        this.d = 0.0f;
        this.e = -7168;
        this.f = -47104;
        this.h = context;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, v4j.l0, 0, 0);
        try {
            this.c = typedArrayObtainStyledAttributes.getColor(v4j.m0, -1973791);
            this.f = typedArrayObtainStyledAttributes.getColor(v4j.n0, -47104);
            this.e = typedArrayObtainStyledAttributes.getColor(v4j.o0, -7168);
            this.f13079a = typedArrayObtainStyledAttributes.getFloat(v4j.p0, 75.0f);
            this.d = typedArrayObtainStyledAttributes.getFloat(v4j.q0, 0.0f) + 270.0f;
            this.f13080b = typedArrayObtainStyledAttributes.getDimensionPixelSize(v4j.r0, a(21.0f));
            typedArrayObtainStyledAttributes.recycle();
            b();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final int a(float f) {
        return (int) ((this.h.getResources().getDisplayMetrics().density * f) + 0.5f);
    }

    public final void b() {
        Paint paint = new Paint();
        this.j = paint;
        paint.setAntiAlias(true);
        this.j.setStyle(Paint.Style.STROKE);
        this.j.setStrokeWidth(this.f13080b);
        this.j.setStrokeCap(Paint.Cap.ROUND);
        d();
    }

    public void c() {
        invalidate();
        requestLayout();
    }

    public final void d() {
        this.i = new RectF(getPaddingLeft() + this.f13080b, getPaddingTop() + this.f13080b, (getPaddingLeft() + (getWidth() - (getPaddingLeft() + getPaddingRight()))) - this.f13080b, (getPaddingTop() + (getHeight() - (getPaddingBottom() + getPaddingTop()))) - this.f13080b);
    }

    public int getFgColorEnd() {
        return this.f;
    }

    public int getFgColorStart() {
        return this.e;
    }

    public float getPercent() {
        return this.f13079a;
    }

    public float getStartAngle() {
        return this.d;
    }

    public float getStrokeWidth() {
        return this.f13080b;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.j.setShader(null);
        this.j.setColor(this.c);
        canvas.drawArc(this.i, 0.0f, 360.0f, false, this.j);
        this.j.setShader(this.g);
        canvas.drawArc(this.i, this.d, this.f13079a * 3.6f, false, this.j);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        d();
        RectF rectF = this.i;
        float f = rectF.left;
        this.g = new LinearGradient(f, rectF.top, f, rectF.bottom, this.e, this.f, Shader.TileMode.CLAMP);
    }

    public void setFgColorEnd(int i) {
        this.f = i;
        RectF rectF = this.i;
        float f = rectF.left;
        this.g = new LinearGradient(f, rectF.top, f, rectF.bottom, this.e, i, Shader.TileMode.CLAMP);
        c();
    }

    public void setFgColorStart(int i) {
        this.e = i;
        RectF rectF = this.i;
        float f = rectF.left;
        this.g = new LinearGradient(f, rectF.top, f, rectF.bottom, i, this.f, Shader.TileMode.CLAMP);
        c();
    }

    public void setPercent(float f) {
        this.f13079a = f;
        c();
    }

    public void setStartAngle(float f) {
        this.d = f + 270.0f;
        c();
    }

    public void setStrokeWidth(float f) {
        this.f13080b = f;
        this.j.setStrokeWidth(f);
        d();
        c();
    }

    public void setStrokeWidthDp(float f) {
        float fA = a(f);
        this.f13080b = fA;
        this.j.setStrokeWidth(fA);
        d();
        c();
    }
}
