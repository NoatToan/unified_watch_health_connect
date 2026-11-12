package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class z68 implements slh, o82.b, h0e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40946b;
    public final jte c;
    public final o82<?, PointF> d;
    public final o82<?, PointF> e;
    public final qw3 f;
    public boolean h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f40945a = new Path();
    public final va4 g = new va4();

    public z68(jte jteVar, a aVar, qw3 qw3Var) {
        this.f40946b = qw3Var.b();
        this.c = jteVar;
        o82<PointF, PointF> o82VarA = qw3Var.d().a();
        this.d = o82VarA;
        o82<PointF, PointF> o82VarA2 = qw3Var.c().a();
        this.e = o82VarA2;
        this.f = qw3Var;
        aVar.i(o82VarA);
        aVar.i(o82VarA2);
        o82VarA.a(this);
        o82VarA2.a(this);
    }

    public final void b() {
        this.h = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.g0e
    public void c(f0e f0eVar, int i, List<f0e> list, f0e f0eVar2) {
        d5g.k(f0eVar, i, list, f0eVar2, this);
    }

    @Override // o82.b
    public void e() {
        b();
    }

    @Override // defpackage.hh4
    public void f(List<hh4> list, List<hh4> list2) {
        for (int i = 0; i < list.size(); i++) {
            hh4 hh4Var = list.get(i);
            if (hh4Var instanceof d2q) {
                d2q d2qVar = (d2q) hh4Var;
                if (d2qVar.j() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.g.a(d2qVar);
                    d2qVar.b(this);
                }
            }
        }
    }

    @Override // defpackage.hh4
    public String getName() {
        return this.f40946b;
    }

    @Override // defpackage.slh
    public Path getPath() {
        if (this.h) {
            return this.f40945a;
        }
        this.f40945a.reset();
        if (this.f.e()) {
            this.h = true;
            return this.f40945a;
        }
        PointF pointFH = this.d.h();
        float f = pointFH.x / 2.0f;
        float f2 = pointFH.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f40945a.reset();
        if (this.f.f()) {
            float f5 = -f2;
            this.f40945a.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.f40945a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.f40945a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.f40945a.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.f40945a.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.f40945a.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.f40945a.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.f40945a.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.f40945a.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.f40945a.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointFH2 = this.e.h();
        this.f40945a.offset(pointFH2.x, pointFH2.y);
        this.f40945a.close();
        this.g.b(this.f40945a);
        this.h = true;
        return this.f40945a;
    }

    @Override // defpackage.g0e
    public <T> void h(T t, yte<T> yteVar) {
        if (t == ste.f33970k) {
            this.d.n(yteVar);
        } else if (t == ste.n) {
            this.e.n(yteVar);
        }
    }
}
