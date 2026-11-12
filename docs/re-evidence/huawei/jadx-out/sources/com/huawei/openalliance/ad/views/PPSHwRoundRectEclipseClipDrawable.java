package com.huawei.openalliance.ad.views;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes12.dex */
public class PPSHwRoundRectEclipseClipDrawable extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f20860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f20861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Path f20862c;
    private RectF d;
    private RectF e;
    private Rect f;
    private float g;

    private float f(float f) {
        return f / 2.0f;
    }

    @Override // com.huawei.openalliance.ad.views.q, android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        a(i, i2, i3, i4);
        int i5 = i3 - i;
        if (i5 != 0) {
            a(this.g / i5);
            b(1.0f - a());
        }
    }

    protected float b() {
        return this.f20861b;
    }

    void a(int i, int i2, int i3, int i4) {
        this.f.set(i, i2, i3, i4);
        int i5 = i4 - i2;
        a(i, i2, i + i5, i4);
        this.g = f(i5);
    }

    void a(float f, float f2, float f3, float f4) {
        this.d.set(f, f2, f3, f4);
    }

    @Override // com.huawei.openalliance.ad.views.q
    protected Path a(int i) {
        float f = i / 10000.0f;
        if (Float.compare(f, a()) < 0) {
            c(f);
        } else if (Float.compare(f, b()) < 0) {
            d(f);
        } else {
            e(f);
        }
        return this.f20862c;
    }

    protected float a() {
        return this.f20860a;
    }

    private void e(float f) {
        this.f20862c.reset();
        this.f20862c.addArc(this.d, 90.0f, 180.0f);
        float f2 = this.f.right - this.g;
        if (Float.compare(a(), b()) != 0) {
            this.f20862c.addRect(this.f.left + this.g, this.f.top, f2, this.f.bottom, Path.Direction.CCW);
        }
        float fB = Float.compare(a(), 0.0f) != 0 ? ((f - b()) / a()) * this.g : 0.0f;
        this.e.set(f2 - fB, this.f.top, f2 + fB, this.f.bottom);
        this.f20862c.addArc(this.e, 270.0f, 180.0f);
    }

    private void d(float f) {
        this.f20862c.reset();
        this.f20862c.addArc(this.d, 90.0f, 180.0f);
        this.f20862c.addRect(this.f.left + this.g, this.f.top, (this.f.width() * f) + this.f.left, this.f.bottom, Path.Direction.CCW);
    }

    private void c(float f) {
        this.f20862c.reset();
        this.f20862c.addArc(this.d, 90.0f, 180.0f);
        float fA = Float.compare(a(), 0.0f) != 0 ? (f / a()) * this.g : 0.0f;
        this.e.set(this.f.left + fA, this.f.top, (this.f.left + this.f.height()) - fA, this.f.bottom);
        this.f20862c.addArc(this.e, 270.0f, -180.0f);
    }

    private void c() {
        Rect bounds = getBounds();
        this.f = bounds;
        a(bounds.left, this.f.top, this.f.left + this.f.height(), this.f.bottom);
        this.g = f(this.f.height());
    }

    private void b(float f) {
        this.f20861b = f;
    }

    private void a(float f) {
        this.f20860a = f;
    }

    public PPSHwRoundRectEclipseClipDrawable(Drawable drawable, int i, int i2) {
        super(drawable, i, i2);
        this.f20862c = new Path();
        this.d = new RectF();
        this.e = new RectF();
        c();
    }
}
