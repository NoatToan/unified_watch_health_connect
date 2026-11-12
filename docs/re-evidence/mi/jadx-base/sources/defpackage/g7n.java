package defpackage;

import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class g7n extends o82<PointF, PointF> {
    public final PointF i;
    public final PointF j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o82<Float, Float> f18693k;
    public final o82<Float, Float> l;
    public yte<Float> m;
    public yte<Float> n;

    public g7n(o82<Float, Float> o82Var, o82<Float, Float> o82Var2) {
        super(Collections.emptyList());
        this.i = new PointF();
        this.j = new PointF();
        this.f18693k = o82Var;
        this.l = o82Var2;
        m(f());
    }

    @Override // defpackage.o82
    public void m(float f) {
        this.f18693k.m(f);
        this.l.m(f);
        this.i.set(this.f18693k.h().floatValue(), this.l.h().floatValue());
        for (int i = 0; i < this.f28842a.size(); i++) {
            this.f28842a.get(i).e();
        }
    }

    @Override // defpackage.o82
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public PointF h() {
        return i(null, 0.0f);
    }

    @Override // defpackage.o82
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF i(e1e<PointF> e1eVar, float f) {
        Float fB;
        e1e<Float> e1eVarB;
        e1e<Float> e1eVarB2;
        Float fB2 = null;
        if (this.m == null || (e1eVarB2 = this.f18693k.b()) == null) {
            fB = null;
        } else {
            float fD = this.f18693k.d();
            Float f2 = e1eVarB2.h;
            yte<Float> yteVar = this.m;
            float f3 = e1eVarB2.g;
            fB = yteVar.b(f3, f2 == null ? f3 : f2.floatValue(), e1eVarB2.f16153b, e1eVarB2.c, f, f, fD);
        }
        if (this.n != null && (e1eVarB = this.l.b()) != null) {
            float fD2 = this.l.d();
            Float f4 = e1eVarB.h;
            yte<Float> yteVar2 = this.n;
            float f5 = e1eVarB.g;
            fB2 = yteVar2.b(f5, f4 == null ? f5 : f4.floatValue(), e1eVarB.f16153b, e1eVarB.c, f, f, fD2);
        }
        if (fB == null) {
            this.j.set(this.i.x, 0.0f);
        } else {
            this.j.set(fB.floatValue(), 0.0f);
        }
        if (fB2 == null) {
            PointF pointF = this.j;
            pointF.set(pointF.x, this.i.y);
        } else {
            PointF pointF2 = this.j;
            pointF2.set(pointF2.x, fB2.floatValue());
        }
        return this.j;
    }

    public void r(yte<Float> yteVar) {
        yte<Float> yteVar2 = this.m;
        if (yteVar2 != null) {
            yteVar2.c(null);
        }
        this.m = yteVar;
        if (yteVar != null) {
            yteVar.c(this);
        }
    }

    public void s(yte<Float> yteVar) {
        yte<Float> yteVar2 = this.n;
        if (yteVar2 != null) {
            yteVar2.c(null);
        }
        this.n = yteVar;
        if (yteVar != null) {
            yteVar.c(this);
        }
    }
}
