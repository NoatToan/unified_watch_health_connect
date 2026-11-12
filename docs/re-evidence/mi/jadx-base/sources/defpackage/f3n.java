package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;

/* JADX INFO: loaded from: classes3.dex */
public class f3n {
    public float[] c;
    public float d;
    public RectF e;
    public Paint f;
    public Path h;
    public Path i;
    public g3n j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17367a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17368b = 0;
    public Paint g = new Paint(1);

    public f3n() {
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new Path();
        this.i = new Path();
        this.j = new g3n();
        this.e = new RectF();
    }

    public void a(Canvas canvas, Xfermode xfermode) {
        this.g.setXfermode(xfermode);
        canvas.drawPath(this.i, this.g);
        this.g.setXfermode(null);
    }

    public void b(Canvas canvas) {
        if (this.f17367a == 0 || this.f.getAlpha() == 0 || Color.alpha(this.f17368b) == 0) {
            return;
        }
        canvas.save();
        this.f.setStrokeWidth(this.f17367a);
        this.f.setColor(this.f17368b);
        canvas.drawPath(this.h, this.f);
        canvas.restore();
    }

    public float[] c() {
        return this.c;
    }

    public float d() {
        return this.d;
    }

    public Path e(Rect rect) {
        float f = 0.5f;
        if (this.f17367a != 0 && this.f.getAlpha() != 0 && Color.alpha(this.f17368b) != 0) {
            f = 0.5f + (this.f17367a / 2.0f);
        }
        float f2 = f;
        return f(new Path(), new RectF(rect), this.c, this.d, f2, f2);
    }

    public final Path f(Path path, RectF rectF, float[] fArr, float f, float f2, float f3) {
        return this.j.w(path, fArr == null ? this.j.r(rectF, f, f2, f3) : this.j.s(rectF, fArr, f2, f3));
    }

    public int g() {
        return this.f17368b;
    }

    public int h() {
        return this.f17367a;
    }

    public void i(Rect rect) {
        float f = 0.5f;
        this.e.set(rect.left - 0.5f, rect.top - 0.5f, rect.right + 0.5f, rect.bottom + 0.5f);
        if (this.f17367a != 0 && this.f.getAlpha() != 0 && Color.alpha(this.f17368b) != 0) {
            f = 0.5f + (this.f17367a / 2.0f);
        }
        float f2 = f;
        this.h = f(this.h, this.e, this.c, this.d, f2, f2);
        Path path = this.i;
        if (path != null) {
            path.reset();
        } else {
            this.i = new Path();
        }
        this.i.addRect(this.e, Path.Direction.CW);
        this.i.op(this.h, Path.Op.DIFFERENCE);
    }

    public void j(int i) {
        this.f.setAlpha(i);
    }

    public void k(float[] fArr) {
        this.c = fArr;
    }

    public void l(float f) {
        this.d = f;
    }

    public void m(int i) {
        this.f17368b = i;
    }

    public void n(int i) {
        this.f17367a = i;
    }
}
