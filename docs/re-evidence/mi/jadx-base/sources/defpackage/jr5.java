package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public class jr5 extends Drawable implements v4d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f23048b;
    public int c;
    public int d;
    public int e;
    public String f;
    public rbl.b g;
    public int h;
    public int i;
    public int j = 80;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Paint f23049k = new Paint(1);
    public final Matrix l = new Matrix();
    public final Rect m = new Rect();
    public final RectF n = new RectF();
    public int o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f23050r;
    public int s;
    public long t;
    public String u;

    public jr5() {
        e();
    }

    @Override // defpackage.v4d
    public void a(long j) {
        this.t = j;
        invalidateSelf();
    }

    public final void b(Canvas canvas, String str, Object... objArr) {
        if (objArr == null) {
            canvas.drawText(str, this.f23050r, this.s, this.f23049k);
        } else {
            canvas.drawText(String.format(str, objArr), this.f23050r, this.s, this.f23049k);
        }
        this.s += this.q;
    }

    public int c(int i, int i2, rbl.b bVar) {
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        if (iWidth > 0 && iHeight > 0 && i > 0 && i2 > 0) {
            if (bVar != null) {
                Rect rect = this.m;
                rect.top = 0;
                rect.left = 0;
                rect.right = iWidth;
                rect.bottom = iHeight;
                this.l.reset();
                bVar.a(this.l, this.m, i, i2, 0.0f, 0.0f);
                RectF rectF = this.n;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = i;
                rectF.bottom = i2;
                this.l.mapRect(rectF);
                int iWidth2 = (int) this.n.width();
                int iHeight2 = (int) this.n.height();
                iWidth = Math.min(iWidth, iWidth2);
                iHeight = Math.min(iHeight, iHeight2);
            }
            float f = iWidth;
            float f2 = f * 0.1f;
            float f3 = f * 0.5f;
            float f4 = iHeight;
            float f5 = 0.1f * f4;
            float f6 = f4 * 0.5f;
            int iAbs = Math.abs(i - iWidth);
            int iAbs2 = Math.abs(i2 - iHeight);
            float f7 = iAbs;
            if (f7 < f2 && iAbs2 < f5) {
                return 1716301648;
            }
            if (f7 < f3 && iAbs2 < f6) {
                return 1728026624;
            }
        }
        return 1727284022;
    }

    public final void d(Rect rect, int i, int i2) {
        int iMin = Math.min(40, Math.max(10, Math.min(rect.width() / i2, rect.height() / i)));
        this.f23049k.setTextSize(iMin);
        int i3 = iMin + 8;
        this.q = i3;
        int i4 = this.j;
        if (i4 == 80) {
            this.q = i3 * (-1);
        }
        this.o = rect.left + 10;
        this.p = i4 == 80 ? rect.bottom - 10 : rect.top + 20;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f23049k.setStyle(Paint.Style.STROKE);
        this.f23049k.setStrokeWidth(2.0f);
        this.f23049k.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f23049k);
        Paint paint = this.f23049k;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f23049k.setColor(c(this.c, this.d, this.g));
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f23049k);
        this.f23049k.setStyle(style);
        this.f23049k.setStrokeWidth(0.0f);
        this.f23049k.setColor(-1);
        this.f23050r = this.o;
        this.s = this.p;
        String str = this.f23048b;
        if (str != null) {
            b(canvas, "IDs: %s, %s", this.f23047a, str);
        } else {
            b(canvas, "ID: %s", this.f23047a);
        }
        b(canvas, "D: %dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height()));
        b(canvas, "I: %dx%d", Integer.valueOf(this.c), Integer.valueOf(this.d));
        b(canvas, "I: %d KiB", Integer.valueOf(this.e / 1024));
        String str2 = this.f;
        if (str2 != null) {
            b(canvas, "i format: %s", str2);
        }
        int i = this.h;
        if (i > 0) {
            b(canvas, "anim: f %d, l %d", Integer.valueOf(i), Integer.valueOf(this.i));
        }
        rbl.b bVar = this.g;
        if (bVar != null) {
            b(canvas, "scale: %s", bVar);
        }
        long j = this.t;
        if (j >= 0) {
            b(canvas, "t: %d ms", Long.valueOf(j));
        }
        String str3 = this.u;
        if (str3 != null) {
            b(canvas, "origin: %s", str3);
        }
    }

    public void e() {
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.h = -1;
        this.i = -1;
        this.f = null;
        f(null);
        this.t = -1L;
        this.u = null;
        invalidateSelf();
    }

    public void f(String str) {
        if (str == null) {
            str = "none";
        }
        this.f23047a = str;
        invalidateSelf();
    }

    public void g(int i, int i2) {
        this.c = i;
        this.d = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h(int i) {
        this.e = i;
    }

    public void i(String str) {
        this.u = str;
        invalidateSelf();
    }

    public void j(rbl.b bVar) {
        this.g = bVar;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        d(rect, 9, 8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
