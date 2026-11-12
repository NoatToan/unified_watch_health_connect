package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes6.dex */
public class j57 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public gg2 f22427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r44 f22428b;
    public oal c;
    public wor d;
    public b2n e;
    public rm9 f;
    public k9p g;
    public d67 h;
    public cro i;
    public nal j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22429k;
    public int l;
    public int m;

    public j57(s7d s7dVar) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.f22427a = new gg2(paint, s7dVar);
        this.f22428b = new r44(paint, s7dVar);
        this.c = new oal(paint, s7dVar);
        this.d = new wor(paint, s7dVar);
        this.e = new b2n(paint, s7dVar);
        this.f = new rm9(paint, s7dVar);
        this.g = new k9p(paint, s7dVar);
        this.h = new d67(paint, s7dVar);
        this.i = new cro(paint, s7dVar);
        this.j = new nal(paint, s7dVar);
    }

    public void a(Canvas canvas, boolean z) {
        if (this.f22428b != null) {
            this.f22427a.a(canvas, this.f22429k, z, this.l, this.m);
        }
    }

    public void b(Canvas canvas, gnq gnqVar) {
        r44 r44Var = this.f22428b;
        if (r44Var != null) {
            r44Var.a(canvas, gnqVar, this.f22429k, this.l, this.m);
        }
    }

    public void c(Canvas canvas, gnq gnqVar) {
        d67 d67Var = this.h;
        if (d67Var != null) {
            d67Var.a(canvas, gnqVar, this.l, this.m);
        }
    }

    public void d(Canvas canvas, gnq gnqVar) {
        rm9 rm9Var = this.f;
        if (rm9Var != null) {
            rm9Var.a(canvas, gnqVar, this.f22429k, this.l, this.m);
        }
    }

    public void e(Canvas canvas, gnq gnqVar) {
        oal oalVar = this.c;
        if (oalVar != null) {
            oalVar.a(canvas, gnqVar, this.f22429k, this.l, this.m);
        }
    }

    public void f(Canvas canvas, gnq gnqVar) {
        nal nalVar = this.j;
        if (nalVar != null) {
            nalVar.a(canvas, gnqVar, this.f22429k, this.l, this.m);
        }
    }

    public void g(Canvas canvas, gnq gnqVar) {
        b2n b2nVar = this.e;
        if (b2nVar != null) {
            b2nVar.a(canvas, gnqVar, this.l, this.m);
        }
    }

    public void h(Canvas canvas, gnq gnqVar) {
        cro croVar = this.i;
        if (croVar != null) {
            croVar.a(canvas, gnqVar, this.f22429k, this.l, this.m);
        }
    }

    public void i(Canvas canvas, gnq gnqVar) {
        k9p k9pVar = this.g;
        if (k9pVar != null) {
            k9pVar.a(canvas, gnqVar, this.l, this.m);
        }
    }

    public void j(Canvas canvas, gnq gnqVar) {
        wor worVar = this.d;
        if (worVar != null) {
            worVar.a(canvas, gnqVar, this.l, this.m);
        }
    }

    public void k(int i, int i2, int i3) {
        this.f22429k = i;
        this.l = i2;
        this.m = i3;
    }
}
