package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes5.dex */
public class s2m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3m[] f33213a = new d3m[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix[] f33214b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final d3m g = new d3m();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Path f33215k = new Path();
    public boolean l = true;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s2m f33216a = new s2m();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface b {
        void a(d3m d3mVar, Matrix matrix, int i);

        void b(d3m d3mVar, Matrix matrix, int i);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r2m f33217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Path f33218b;
        public final RectF c;
        public final b d;
        public final float e;

        public c(r2m r2mVar, float f, RectF rectF, b bVar, Path path) {
            this.d = bVar;
            this.f33217a = r2mVar;
            this.e = f;
            this.c = rectF;
            this.f33218b = path;
        }
    }

    public s2m() {
        for (int i = 0; i < 4; i++) {
            this.f33213a[i] = new d3m();
            this.f33214b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static s2m k() {
        return a.f33216a;
    }

    public final float a(int i) {
        return (i + 1) * 90;
    }

    public final void b(c cVar, int i) {
        this.h[0] = this.f33213a[i].k();
        this.h[1] = this.f33213a[i].l();
        this.f33214b[i].mapPoints(this.h);
        if (i == 0) {
            Path path = cVar.f33218b;
            float[] fArr = this.h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f33218b;
            float[] fArr2 = this.h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f33213a[i].d(this.f33214b[i], cVar.f33218b);
        b bVar = cVar.d;
        if (bVar != null) {
            bVar.b(this.f33213a[i], this.f33214b[i], i);
        }
    }

    public final void c(c cVar, int i) {
        int i2 = (i + 1) % 4;
        this.h[0] = this.f33213a[i].i();
        this.h[1] = this.f33213a[i].j();
        this.f33214b[i].mapPoints(this.h);
        this.i[0] = this.f33213a[i2].k();
        this.i[1] = this.f33213a[i2].l();
        this.f33214b[i2].mapPoints(this.i);
        float[] fArr = this.h;
        float f = fArr[0];
        float[] fArr2 = this.i;
        float fMax = Math.max(((float) Math.hypot(f - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float fI = i(cVar.c, i);
        this.g.n(0.0f, 0.0f);
        s08 s08VarJ = j(i, cVar.f33217a);
        s08VarJ.b(fMax, fI, cVar.e, this.g);
        this.j.reset();
        this.g.d(this.c[i], this.j);
        if (this.l && (s08VarJ.a() || l(this.j, i) || l(this.j, i2))) {
            Path path = this.j;
            path.op(path, this.f, Path.Op.DIFFERENCE);
            this.h[0] = this.g.k();
            this.h[1] = this.g.l();
            this.c[i].mapPoints(this.h);
            Path path2 = this.e;
            float[] fArr3 = this.h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.g.d(this.c[i], this.e);
        } else {
            this.g.d(this.c[i], cVar.f33218b);
        }
        b bVar = cVar.d;
        if (bVar != null) {
            bVar.a(this.g, this.c[i], i);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void d(r2m r2mVar, float f, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(r2mVar, f, rectF, bVar, path);
        for (int i = 0; i < 4; i++) {
            m(cVar, i);
            n(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            b(cVar, i2);
            c(cVar, i2);
        }
        path.close();
        this.e.close();
        if (this.e.isEmpty()) {
            return;
        }
        path.op(this.e, Path.Op.UNION);
    }

    public void e(r2m r2mVar, float f, RectF rectF, Path path) {
        d(r2mVar, f, rectF, null, path);
    }

    public final void f(int i, RectF rectF, PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    public final sl4 g(int i, r2m r2mVar) {
        if (i == 1) {
            return r2mVar.l();
        }
        if (i != 2) {
            return i != 3 ? r2mVar.t() : r2mVar.r();
        }
        return r2mVar.j();
    }

    public final tl4 h(int i, r2m r2mVar) {
        if (i == 1) {
            return r2mVar.k();
        }
        if (i != 2) {
            return i != 3 ? r2mVar.s() : r2mVar.q();
        }
        return r2mVar.i();
    }

    public final float i(RectF rectF, int i) {
        float[] fArr = this.h;
        d3m d3mVar = this.f33213a[i];
        fArr[0] = d3mVar.c;
        fArr[1] = d3mVar.d;
        this.f33214b[i].mapPoints(fArr);
        return (i == 1 || i == 3) ? Math.abs(rectF.centerX() - this.h[0]) : Math.abs(rectF.centerY() - this.h[1]);
    }

    public final s08 j(int i, r2m r2mVar) {
        if (i == 1) {
            return r2mVar.h();
        }
        if (i != 2) {
            return i != 3 ? r2mVar.o() : r2mVar.p();
        }
        return r2mVar.n();
    }

    @RequiresApi(19)
    public final boolean l(Path path, int i) {
        this.f33215k.reset();
        this.f33213a[i].d(this.f33214b[i], this.f33215k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f33215k.computeBounds(rectF, true);
        path.op(this.f33215k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    public final void m(c cVar, int i) {
        h(i, cVar.f33217a).b(this.f33213a[i], 90.0f, cVar.e, cVar.c, g(i, cVar.f33217a));
        float fA = a(i);
        this.f33214b[i].reset();
        f(i, cVar.c, this.d);
        Matrix matrix = this.f33214b[i];
        PointF pointF = this.d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f33214b[i].preRotate(fA);
    }

    public final void n(int i) {
        this.h[0] = this.f33213a[i].i();
        this.h[1] = this.f33213a[i].j();
        this.f33214b[i].mapPoints(this.h);
        float fA = a(i);
        this.c[i].reset();
        Matrix matrix = this.c[i];
        float[] fArr = this.h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.c[i].preRotate(fA);
    }
}
