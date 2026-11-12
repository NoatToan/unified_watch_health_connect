package n43;

import java.util.List;
import p43.a2;
import p43.d2;
import p43.g2;
import p43.v0;
import p43.y1;
import t23.d1;
import t23.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends w23.h implements w {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s33.t f123635j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u33.d f123636k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u33.h f123637l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u33.j f123638m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v f123639n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public v0 f123640o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v0 f123641p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List<? extends d1> f123642q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public v0 f123643r;

    /* JADX WARN: Illegal instructions before constructor call */
    public i0(o43.n nVar, t23.l lVar, u23.h hVar, x33.f fVar, t23.r rVar, s33.t tVar, u33.d dVar, u33.h hVar2, u33.j jVar, v vVar) {
        nVar.getClass();
        lVar.getClass();
        hVar.getClass();
        fVar.getClass();
        rVar.getClass();
        tVar.getClass();
        dVar.getClass();
        hVar2.getClass();
        jVar.getClass();
        y0.a aVar = y0.f162076a;
        aVar.getClass();
        super(nVar, lVar, hVar, fVar, aVar, rVar);
        this.f123635j = tVar;
        this.f123636k = dVar;
        this.f123637l = hVar2;
        this.f123638m = jVar;
        this.f123639n = vVar;
    }

    @Override // w23.h
    public final List<d1> D0() {
        List list = this.f123642q;
        if (list != null) {
            return list;
        }
        p005kotlin.jvm.internal.s.m("typeConstructorParameters");
        throw null;
    }

    @Override // t23.c1
    public final v0 E() {
        v0 v0Var = this.f123641p;
        if (v0Var != null) {
            return v0Var;
        }
        p005kotlin.jvm.internal.s.m("expandedType");
        throw null;
    }

    public final void E0(List<? extends d1> list, v0 v0Var, v0 v0Var2) {
        i43.l lVarC0;
        list.getClass();
        v0Var.getClass();
        v0Var2.getClass();
        this.f181604g = list;
        this.f123640o = v0Var;
        this.f123641p = v0Var2;
        this.f123642q = o72.t.n(this);
        t23.e eVarZ = z();
        if (eVarZ == null || (lVarC0 = eVarZ.c0()) == null) {
            lVarC0 = i43.l.b.f91061b;
        }
        w23.g gVar = new w23.g(this);
        r43.i iVar = d2.f135814a;
        this.f123643r = r43.l.f(this) ? r43.l.c(r43.k.f150372k, toString()) : d2.n(h(), lVarC0, gVar);
    }

    @Override // n43.w
    public final u33.d F() {
        return this.f123636k;
    }

    @Override // n43.w
    public final v G() {
        return this.f123639n;
    }

    @Override // n43.w
    public final u33.h X() {
        return this.f123637l;
    }

    @Override // t23.a1
    public final t23.m b(a2 a2Var) {
        a2Var.getClass();
        if (a2Var.f135795a.e()) {
            return this;
        }
        t23.l lVarD = d();
        lVarD.getClass();
        u23.h annotations = getAnnotations();
        annotations.getClass();
        x33.f name = getName();
        name.getClass();
        i0 i0Var = new i0(this.f181602e, lVarD, annotations, name, this.f181603f, this.f123635j, this.f123636k, this.f123637l, this.f123638m, this.f123639n);
        List<d1> listQ = q();
        v0 v0VarZ0 = z0();
        g2 g2Var = g2.INVARIANT;
        i0Var.E0(listQ, y1.a(a2Var.h(g2Var, v0VarZ0)), y1.a(a2Var.h(g2Var, E())));
        return i0Var;
    }

    @Override // t23.h
    public final v0 p() {
        v0 v0Var = this.f123643r;
        if (v0Var != null) {
            return v0Var;
        }
        p005kotlin.jvm.internal.s.m("defaultTypeImpl");
        throw null;
    }

    @Override // n43.w
    public final z33.n w() {
        return this.f123635j;
    }

    @Override // t23.c1
    public final t23.e z() {
        if (o72.t.R(E())) {
            return null;
        }
        t23.h hVarT = E().F0().t();
        if (hVarT instanceof t23.e) {
            return (t23.e) hVarT;
        }
        return null;
    }

    @Override // t23.c1
    public final v0 z0() {
        v0 v0Var = this.f123640o;
        if (v0Var != null) {
            return v0Var;
        }
        p005kotlin.jvm.internal.s.m("underlyingType");
        throw null;
    }
}
