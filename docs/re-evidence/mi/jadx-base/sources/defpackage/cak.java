package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class cak implements o82.b, h0e, slh {
    public final String c;
    public final boolean d;
    public final jte e;
    public final o82<?, PointF> f;
    public final o82<?, PointF> g;
    public final o82<?, Float> h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5130k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f5128a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f5129b = new RectF();
    public final va4 i = new va4();
    public o82<Float, Float> j = null;

    public cak(jte jteVar, a aVar, dak dakVar) {
        this.c = dakVar.c();
        this.d = dakVar.f();
        this.e = jteVar;
        o82<PointF, PointF> o82VarA = dakVar.d().a();
        this.f = o82VarA;
        o82<PointF, PointF> o82VarA2 = dakVar.e().a();
        this.g = o82VarA2;
        o82<Float, Float> o82VarA3 = dakVar.b().a();
        this.h = o82VarA3;
        aVar.i(o82VarA);
        aVar.i(o82VarA2);
        aVar.i(o82VarA3);
        o82VarA.a(this);
        o82VarA2.a(this);
        o82VarA3.a(this);
    }

    private void b() {
        this.f5130k = false;
        this.e.invalidateSelf();
    }

    @Override // defpackage.g0e
    public void c(f0e f0eVar, int i, List<f0e> list, f0e f0eVar2) {
        d5g.k(f0eVar, i, list, f0eVar2, this);
    }

    @Override // o82.b
    public void e() {
        b();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[SYNTHETIC] */
    @Override // defpackage.hh4
    public void f(List<hh4> list, List<hh4> list2) {
        for (int i = 0; i < list.size(); i++) {
            hh4 hh4Var = list.get(i);
            if (hh4Var instanceof d2q) {
                d2q d2qVar = (d2q) hh4Var;
                if (d2qVar.j() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.i.a(d2qVar);
                    d2qVar.b(this);
                } else if (hh4Var instanceof vxk) {
                    this.j = ((vxk) hh4Var).h();
                }
            } else if (hh4Var instanceof vxk) {
                this.j = ((vxk) hh4Var).h();
            }
        }
    }

    @Override // defpackage.hh4
    public String getName() {
        return this.c;
    }

    @Override // defpackage.slh
    public Path getPath() {
        o82<Float, Float> o82Var;
        if (this.f5130k) {
            return this.f5128a;
        }
        this.f5128a.reset();
        if (this.d) {
            this.f5130k = true;
            return this.f5128a;
        }
        PointF pointFH = this.g.h();
        float f = pointFH.x / 2.0f;
        float f2 = pointFH.y / 2.0f;
        o82<?, Float> o82Var2 = this.h;
        float fP = o82Var2 == null ? 0.0f : ((ox9) o82Var2).p();
        if (fP == 0.0f && (o82Var = this.j) != null) {
            fP = Math.min(o82Var.h().floatValue(), Math.min(f, f2));
        }
        float fMin = Math.min(f, f2);
        if (fP > fMin) {
            fP = fMin;
        }
        PointF pointFH2 = this.f.h();
        this.f5128a.moveTo(pointFH2.x + f, (pointFH2.y - f2) + fP);
        this.f5128a.lineTo(pointFH2.x + f, (pointFH2.y + f2) - fP);
        if (fP > 0.0f) {
            RectF rectF = this.f5129b;
            float f3 = pointFH2.x;
            float f4 = fP * 2.0f;
            float f5 = pointFH2.y;
            rectF.set((f3 + f) - f4, (f5 + f2) - f4, f3 + f, f5 + f2);
            this.f5128a.arcTo(this.f5129b, 0.0f, 90.0f, false);
        }
        this.f5128a.lineTo((pointFH2.x - f) + fP, pointFH2.y + f2);
        if (fP > 0.0f) {
            RectF rectF2 = this.f5129b;
            float f6 = pointFH2.x;
            float f7 = pointFH2.y;
            float f8 = fP * 2.0f;
            rectF2.set(f6 - f, (f7 + f2) - f8, (f6 - f) + f8, f7 + f2);
            this.f5128a.arcTo(this.f5129b, 90.0f, 90.0f, false);
        }
        this.f5128a.lineTo(pointFH2.x - f, (pointFH2.y - f2) + fP);
        if (fP > 0.0f) {
            RectF rectF3 = this.f5129b;
            float f9 = pointFH2.x;
            float f10 = pointFH2.y;
            float f11 = fP * 2.0f;
            rectF3.set(f9 - f, f10 - f2, (f9 - f) + f11, (f10 - f2) + f11);
            this.f5128a.arcTo(this.f5129b, 180.0f, 90.0f, false);
        }
        this.f5128a.lineTo((pointFH2.x + f) - fP, pointFH2.y - f2);
        if (fP > 0.0f) {
            RectF rectF4 = this.f5129b;
            float f12 = pointFH2.x;
            float f13 = fP * 2.0f;
            float f14 = pointFH2.y;
            rectF4.set((f12 + f) - f13, f14 - f2, f12 + f, (f14 - f2) + f13);
            this.f5128a.arcTo(this.f5129b, 270.0f, 90.0f, false);
        }
        this.f5128a.close();
        this.i.b(this.f5128a);
        this.f5130k = true;
        return this.f5128a;
    }

    @Override // defpackage.g0e
    public <T> void h(T t, yte<T> yteVar) {
        if (t == ste.l) {
            this.g.n(yteVar);
        } else if (t == ste.n) {
            this.f.n(yteVar);
        } else if (t == ste.m) {
            this.h.n(yteVar);
        }
    }
}
