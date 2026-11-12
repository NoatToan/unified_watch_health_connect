package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes9.dex */
public class edp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f16539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RectF f16540b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g = 180.0f;
    public float h;
    public float i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Path f16541k;
    public Path l;
    public Path m;
    public Path n;
    public Path o;
    public Path p;
    public Path q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RectF f16542r;
    public RectF s;
    public RectF t;
    public RectF u;

    public edp(boolean z, RectF rectF, float f, float f2, float f3, float f4, float f5) {
        this.f16539a = z ? ddp.f15414a : ddp.f15415b;
        this.f16540b = rectF;
        this.e = rectF.width();
        this.f = rectF.height();
        this.c = f;
        this.d = f2;
        this.i = f3;
        this.j = f4;
        this.h = f5;
    }

    public static edp f(boolean z, int i, RectF rectF, float f, float f2, float f3) {
        float f4;
        float f5;
        if (i == ddp.j) {
            f4 = ddp.d;
            f5 = ddp.e;
        } else if (i == ddp.f15416k) {
            f4 = ddp.f;
            f5 = ddp.g;
        } else {
            f4 = ddp.h;
            f5 = ddp.i;
        }
        return new edp(z, rectF, f, f2, f4, f5, f3);
    }

    public final void a() {
        float f = this.d;
        RectF rectF = new RectF(f - 1.0f, f - 1.0f, (this.e - f) + 1.0f, (this.f - f) + 1.0f);
        float f2 = this.c;
        float f3 = this.d;
        this.f16541k = b(rectF, new RectF((f2 - f3) + 1.0f, (f2 - f3) + 1.0f, ((this.e - f2) + f3) - 1.0f, ((this.f - f2) + f3) - 1.0f), this.g, this.h, this.e / 2.0f, this.f / 2.0f);
    }

    public final Path b(RectF rectF, RectF rectF2, float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.addArc(rectF, f, f2);
        path.lineTo(f3, f4);
        path.close();
        Path path2 = new Path();
        path2.addArc(rectF2, f, f2);
        path2.lineTo(f3, f4);
        path2.close();
        path.op(path2, Path.Op.DIFFERENCE);
        return path;
    }

    public final void c() {
        g();
        a();
        d();
        h();
        e();
    }

    public final void d() {
        float f = this.c;
        float f2 = this.d;
        float f3 = this.f16539a;
        this.t = new RectF((f - f2) - f3, (f - f2) - f3, (this.e - f) + f2 + f3, (this.f - f) + f2 + f3);
        float f4 = this.c;
        RectF rectF = new RectF(f4, f4, this.e - f4, this.f - f4);
        this.u = rectF;
        float f5 = this.j;
        this.m = b(this.t, rectF, (180.0f + f5) - 0.3f, (this.h - (f5 * 2.0f)) + 0.6f, this.e / 2.0f, this.f / 2.0f);
    }

    public final void e() {
        this.p = new Path();
        nfi nfiVar = new nfi();
        nfiVar.d = nfiVar.a(this.t, this.j);
        nfiVar.c = nfiVar.a(this.u, 0.0f);
        nfiVar.f27884a = nfiVar.a(this.u, this.j);
        nfiVar.f27885b = nfiVar.a(this.t, 0.0f);
        this.p = nfiVar.c();
        nfi nfiVar2 = new nfi();
        nfiVar2.d = nfiVar2.b(this.t, (180.0f - this.h) + this.j);
        nfiVar2.c = nfiVar2.a(this.u, this.h);
        nfiVar2.f27884a = nfiVar2.a(this.t, this.h);
        nfiVar2.f27885b = nfiVar2.b(this.u, (180.0f - this.h) + this.j);
        this.q = nfiVar2.c();
    }

    public final void g() {
        this.f16542r = new RectF(0.0f, 0.0f, this.e, this.f);
        float f = this.d;
        float f2 = this.f16539a;
        RectF rectF = new RectF(f + f2, f + f2, (this.e - f) - f2, (this.f - f) - f2);
        this.s = rectF;
        float f3 = this.i;
        this.l = b(this.f16542r, rectF, (180.0f + f3) - 0.2f, (this.h - (f3 * 2.0f)) + 0.4f, this.e / 2.0f, this.f / 2.0f);
    }

    public final void h() {
        nfi nfiVar = new nfi();
        nfiVar.d = nfiVar.a(this.s, this.i);
        nfiVar.c = nfiVar.a(this.f16542r, 0.0f);
        nfiVar.f27884a = nfiVar.a(this.s, 0.0f);
        nfiVar.f27885b = nfiVar.a(this.f16542r, this.i);
        this.n = nfiVar.c();
        nfi nfiVar2 = new nfi();
        nfiVar2.d = nfiVar2.b(this.s, (180.0f - this.h) + this.i);
        nfiVar2.c = nfiVar2.a(this.f16542r, this.h);
        nfiVar2.f27884a = nfiVar2.b(this.f16542r, (180.0f - this.h) + this.i);
        nfiVar2.f27885b = nfiVar2.a(this.s, this.h);
        this.o = nfiVar2.c();
    }

    public void i(Canvas canvas, Paint paint) {
        c();
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
        canvas.drawPath(this.f16541k, paint);
        canvas.drawPath(this.m, paint);
        canvas.drawPath(this.l, paint);
        canvas.drawPath(this.n, paint);
        canvas.drawPath(this.o, paint);
        canvas.drawPath(this.p, paint);
        canvas.drawPath(this.q, paint);
        canvas.restoreToCount(iSaveLayer);
    }

    public void j(Canvas canvas, Paint paint) {
        c();
        canvas.drawPath(this.f16541k, paint);
        canvas.drawPath(this.m, paint);
        canvas.drawPath(this.l, paint);
        canvas.drawPath(this.n, paint);
        canvas.drawPath(this.o, paint);
        canvas.drawPath(this.p, paint);
        canvas.drawPath(this.q, paint);
    }
}
