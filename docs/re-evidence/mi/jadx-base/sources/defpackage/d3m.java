package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class d3m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f15043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f15044b;

    @Deprecated
    public float c;

    @Deprecated
    public float d;

    @Deprecated
    public float e;

    @Deprecated
    public float f;
    public final List<f> g = new ArrayList();
    public final List<g> h = new ArrayList();
    public boolean i;

    public class a extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f15045b;
        public final /* synthetic */ Matrix c;

        public a(List list, Matrix matrix) {
            this.f15045b = list;
            this.c = matrix;
        }

        @Override // d3m.g
        public void b(Matrix matrix, n2m n2mVar, int i, Canvas canvas) {
            Iterator it = this.f15045b.iterator();
            while (it.hasNext()) {
                ((g) it.next()).b(this.c, n2mVar, i, canvas);
            }
        }
    }

    public static class b extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f15046b;

        public b(d dVar) {
            this.f15046b = dVar;
        }

        @Override // d3m.g
        public void b(Matrix matrix, n2m n2mVar, int i, Canvas canvas) {
            n2mVar.a(canvas, matrix, new RectF(this.f15046b.k(), this.f15046b.o(), this.f15046b.l(), this.f15046b.j()), i, this.f15046b.m(), this.f15046b.n());
        }
    }

    public static class c extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f15047b;
        public final float c;
        public final float d;

        public c(e eVar, float f, float f2) {
            this.f15047b = eVar;
            this.c = f;
            this.d = f2;
        }

        @Override // d3m.g
        public void b(Matrix matrix, n2m n2mVar, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f15047b.c - this.d, this.f15047b.f15049b - this.c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.c, this.d);
            matrix2.preRotate(c());
            n2mVar.b(canvas, matrix2, rectF, i);
        }

        public float c() {
            return (float) Math.toDegrees(Math.atan((this.f15047b.c - this.d) / (this.f15047b.f15049b - this.c)));
        }
    }

    public static class d extends f {
        public static final RectF h = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public float f15048b;

        @Deprecated
        public float c;

        @Deprecated
        public float d;

        @Deprecated
        public float e;

        @Deprecated
        public float f;

        @Deprecated
        public float g;

        public d(float f, float f2, float f3, float f4) {
            q(f);
            u(f2);
            r(f3);
            p(f4);
        }

        @Override // d3m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f15050a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }

        public final float j() {
            return this.e;
        }

        public final float k() {
            return this.f15048b;
        }

        public final float l() {
            return this.d;
        }

        public final float m() {
            return this.f;
        }

        public final float n() {
            return this.g;
        }

        public final float o() {
            return this.c;
        }

        public final void p(float f) {
            this.e = f;
        }

        public final void q(float f) {
            this.f15048b = f;
        }

        public final void r(float f) {
            this.d = f;
        }

        public final void s(float f) {
            this.f = f;
        }

        public final void t(float f) {
            this.g = f;
        }

        public final void u(float f) {
            this.c = f;
        }
    }

    public static class e extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f15049b;
        public float c;

        @Override // d3m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f15050a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f15049b, this.c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f15050a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public static abstract class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Matrix f15051a = new Matrix();

        public final void a(n2m n2mVar, int i, Canvas canvas) {
            b(f15051a, n2mVar, i, canvas);
        }

        public abstract void b(Matrix matrix, n2m n2mVar, int i, Canvas canvas);
    }

    public d3m() {
        n(0.0f, 0.0f);
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        d dVar = new d(f2, f3, f4, f5);
        dVar.s(f6);
        dVar.t(f7);
        this.g.add(dVar);
        b bVar = new b(dVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        c(bVar, f6, z ? (180.0f + f8) % 360.0f : f8);
        double d2 = f8;
        r(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))));
        s(((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))));
    }

    public final void b(float f2) {
        if (g() == f2) {
            return;
        }
        float fG = ((f2 - g()) + 360.0f) % 360.0f;
        if (fG > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(fG);
        this.h.add(new b(dVar));
        p(f2);
    }

    public final void c(g gVar, float f2, float f3) {
        b(f2);
        this.h.add(gVar);
        p(f3);
    }

    public void d(Matrix matrix, Path path) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            this.g.get(i).a(matrix, path);
        }
    }

    public boolean e() {
        return this.i;
    }

    public g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.h), new Matrix(matrix));
    }

    public final float g() {
        return this.e;
    }

    public final float h() {
        return this.f;
    }

    public float i() {
        return this.c;
    }

    public float j() {
        return this.d;
    }

    public float k() {
        return this.f15043a;
    }

    public float l() {
        return this.f15044b;
    }

    public void m(float f2, float f3) {
        e eVar = new e();
        eVar.f15049b = f2;
        eVar.c = f3;
        this.g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f2);
        s(f3);
    }

    public void n(float f2, float f3) {
        o(f2, f3, 270.0f, 0.0f);
    }

    public void o(float f2, float f3, float f4, float f5) {
        t(f2);
        u(f3);
        r(f2);
        s(f3);
        p(f4);
        q((f4 + f5) % 360.0f);
        this.g.clear();
        this.h.clear();
        this.i = false;
    }

    public final void p(float f2) {
        this.e = f2;
    }

    public final void q(float f2) {
        this.f = f2;
    }

    public final void r(float f2) {
        this.c = f2;
    }

    public final void s(float f2) {
        this.d = f2;
    }

    public final void t(float f2) {
        this.f15043a = f2;
    }

    public final void u(float f2) {
        this.f15044b = f2;
    }
}
