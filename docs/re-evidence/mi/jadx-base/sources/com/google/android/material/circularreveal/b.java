package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import defpackage.p8f;

/* JADX INFO: loaded from: classes5.dex */
public class b {
    public static final int j = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f8623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f8624b;
    public final Path c;
    public final Paint d;
    public final Paint e;
    public c.e f;
    public Drawable g;
    public boolean h;
    public boolean i;

    public interface a {
        void b(Canvas canvas);

        boolean c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar) {
        this.f8623a = aVar;
        View view = (View) aVar;
        this.f8624b = view;
        view.setWillNotDraw(false);
        this.c = new Path();
        this.d = new Paint(7);
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setColor(0);
    }

    public void a() {
        if (j == 0) {
            this.h = true;
            this.i = false;
            this.f8624b.buildDrawingCache();
            Bitmap drawingCache = this.f8624b.getDrawingCache();
            if (drawingCache == null && this.f8624b.getWidth() != 0 && this.f8624b.getHeight() != 0) {
                drawingCache = Bitmap.createBitmap(this.f8624b.getWidth(), this.f8624b.getHeight(), Bitmap.Config.ARGB_8888);
                this.f8624b.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.h = false;
            this.i = true;
        }
    }

    public void b() {
        if (j == 0) {
            this.i = false;
            this.f8624b.destroyDrawingCache();
            this.d.setShader(null);
            this.f8624b.invalidate();
        }
    }

    public void c(Canvas canvas) {
        if (n()) {
            int i = j;
            if (i == 0) {
                c.e eVar = this.f;
                canvas.drawCircle(eVar.f8629a, eVar.f8630b, eVar.c, this.d);
                if (p()) {
                    c.e eVar2 = this.f;
                    canvas.drawCircle(eVar2.f8629a, eVar2.f8630b, eVar2.c, this.e);
                }
            } else if (i == 1) {
                int iSave = canvas.save();
                canvas.clipPath(this.c);
                this.f8623a.b(canvas);
                if (p()) {
                    canvas.drawRect(0.0f, 0.0f, this.f8624b.getWidth(), this.f8624b.getHeight(), this.e);
                }
                canvas.restoreToCount(iSave);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("Unsupported strategy " + i);
                }
                this.f8623a.b(canvas);
                if (p()) {
                    canvas.drawRect(0.0f, 0.0f, this.f8624b.getWidth(), this.f8624b.getHeight(), this.e);
                }
            }
        } else {
            this.f8623a.b(canvas);
            if (p()) {
                canvas.drawRect(0.0f, 0.0f, this.f8624b.getWidth(), this.f8624b.getHeight(), this.e);
            }
        }
        d(canvas);
    }

    public final void d(Canvas canvas) {
        if (o()) {
            Rect bounds = this.g.getBounds();
            float fWidth = this.f.f8629a - (bounds.width() / 2.0f);
            float fHeight = this.f.f8630b - (bounds.height() / 2.0f);
            canvas.translate(fWidth, fHeight);
            this.g.draw(canvas);
            canvas.translate(-fWidth, -fHeight);
        }
    }

    public Drawable e() {
        return this.g;
    }

    public int f() {
        return this.e.getColor();
    }

    public final float g(c.e eVar) {
        return p8f.b(eVar.f8629a, eVar.f8630b, 0.0f, 0.0f, this.f8624b.getWidth(), this.f8624b.getHeight());
    }

    public c.e h() {
        c.e eVar = this.f;
        if (eVar == null) {
            return null;
        }
        c.e eVar2 = new c.e(eVar);
        if (eVar2.a()) {
            eVar2.c = g(eVar2);
        }
        return eVar2;
    }

    public final void i() {
        if (j == 1) {
            this.c.rewind();
            c.e eVar = this.f;
            if (eVar != null) {
                this.c.addCircle(eVar.f8629a, eVar.f8630b, eVar.c, Path.Direction.CW);
            }
        }
        this.f8624b.invalidate();
    }

    public boolean j() {
        return this.f8623a.c() && !n();
    }

    public void k(Drawable drawable) {
        this.g = drawable;
        this.f8624b.invalidate();
    }

    public void l(int i) {
        this.e.setColor(i);
        this.f8624b.invalidate();
    }

    public void m(c.e eVar) {
        if (eVar == null) {
            this.f = null;
        } else {
            c.e eVar2 = this.f;
            if (eVar2 == null) {
                this.f = new c.e(eVar);
            } else {
                eVar2.c(eVar);
            }
            if (p8f.c(eVar.c, g(eVar), 1.0E-4f)) {
                this.f.c = Float.MAX_VALUE;
            }
        }
        i();
    }

    public final boolean n() {
        c.e eVar = this.f;
        boolean z = eVar == null || eVar.a();
        if (j == 0) {
            return !z && this.i;
        }
        return !z;
    }

    public final boolean o() {
        return (this.h || this.g == null || this.f == null) ? false : true;
    }

    public final boolean p() {
        return (this.h || Color.alpha(this.e.getColor()) == 0) ? false : true;
    }
}
