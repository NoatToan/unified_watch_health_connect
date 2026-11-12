package com.huawei.openalliance.ad.views;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.dk;

/* JADX INFO: loaded from: classes12.dex */
public class PPSFlickerDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f20857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f20858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f20859c;
    private float d;
    private float e;
    private int i;
    private long k;
    private LinearGradient l;
    private float m;
    private boolean n;
    private int f = 1728053247;
    private boolean g = true;
    private float h = 0.0f;
    private boolean j = false;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        super.setBounds(rect);
        a(rect.left, rect.right);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        a(i, i3);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        this.f20859c = (this.f20858b * i) / 10000.0f;
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (d()) {
            this.j = false;
            return;
        }
        f();
        float fG = this.e + (this.h * g());
        if (Float.compare(fG, this.f20859c) > 0) {
            int i = (int) this.f20859c;
            if (i != 0) {
                fG = (fG % i) - this.d;
            }
            this.g = true;
        }
        this.e = fG;
        Rect bounds = getBounds();
        if (Float.compare(this.m, 0.0f) > 0) {
            RectF rectF = new RectF();
            rectF.set(bounds);
            Path path = new Path();
            float f = this.m;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            canvas.clipPath(path);
        }
        if (this.n) {
            canvas.scale(-1.0f, 1.0f, bounds.width() / 2.0f, bounds.height() / 2.0f);
        }
        canvas.save();
        canvas.translate(fG, 0.0f);
        float f2 = Float.compare(this.d + fG, this.f20859c) > 0 ? this.f20859c - fG : this.d;
        if (Float.compare(fG, 0.0f) < 0) {
            canvas.clipRect(bounds.left - fG, bounds.top, (bounds.left - fG) + f2, bounds.bottom);
        }
        canvas.drawRect(bounds.left, bounds.top, bounds.left + f2, bounds.bottom, this.f20857a);
        canvas.restore();
        invalidateSelf();
        if (e()) {
            this.j = false;
            b();
        }
    }

    public void b() {
        if (hw.a()) {
            hw.a("HwFlickerDrawable", "stop()");
        }
        i();
        a(2);
    }

    public void a() {
        if (hw.a()) {
            hw.a("HwFlickerDrawable", "start()");
        }
        if (this.i == 0) {
            return;
        }
        this.j = false;
        a(System.currentTimeMillis());
        invalidateSelf();
        a(0);
    }

    private void i() {
        this.e = -this.d;
    }

    private void h() {
        int i = this.f;
        int i2 = 16777215 & i;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.d, 0.0f, new int[]{i2, i, i2}, new float[]{0.0f, 0.93f, 1.0f}, Shader.TileMode.CLAMP);
        this.l = linearGradient;
        this.f20857a.setShader(linearGradient);
    }

    private long g() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.k;
        a(jCurrentTimeMillis);
        if (j < 0) {
            return 0L;
        }
        return j;
    }

    private void f() {
        this.h = (this.d + this.f20859c) / 2000.0f;
        if (this.g) {
            this.g = false;
        }
    }

    private boolean e() {
        return this.j && this.g;
    }

    private boolean d() {
        return this.i == 2;
    }

    private void c() {
        Paint paint = new Paint();
        this.f20857a = paint;
        paint.setAntiAlias(true);
        this.f20857a.setStyle(Paint.Style.FILL);
        this.f20858b = 0.0f;
        this.d = 0.0f;
        a(2);
        this.n = dk.h();
    }

    private void a(long j) {
        this.k = j;
    }

    private void a(int i) {
        this.i = i;
    }

    private void a(float f, float f2) {
        float f3 = f2 - f;
        this.f20858b = f3;
        float level = (f3 * getLevel()) / 10000.0f;
        this.f20859c = level;
        float f4 = this.f20858b * 0.3f;
        this.d = f4;
        this.h = (f4 + level) / 2000.0f;
        i();
        h();
    }

    public PPSFlickerDrawable(float f) {
        this.m = f;
        c();
    }

    public PPSFlickerDrawable() {
        c();
    }
}
