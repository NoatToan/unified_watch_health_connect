package w23;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k0 extends p implements t23.h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x33.c f181639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f181640f;

    /* JADX WARN: Illegal instructions before constructor call */
    public k0(t23.c0 c0Var, x33.c cVar) {
        c0Var.getClass();
        cVar.getClass();
        u23.h.f168226x0.getClass();
        u23.h.a.C3153a c3153a = u23.h.a.f168228b;
        x33.d dVar = cVar.f188596a;
        super(c0Var, c3153a, dVar.c() ? x33.d.f188599f : dVar.g(), t23.y0.f162076a);
        this.f181639e = cVar;
        this.f181640f = "package " + cVar + " of " + c0Var;
    }

    @Override // t23.l
    public final <R, D> R K(t23.n<R, D> nVar, D d14) {
        return (R) nVar.j(this, d14);
    }

    @Override // t23.h0
    public final x33.c c() {
        return this.f181639e;
    }

    @Override // w23.p, t23.l
    public final t23.c0 d() {
        t23.l lVarD = super.d();
        lVarD.getClass();
        return (t23.c0) lVarD;
    }

    @Override // w23.p, t23.m
    public t23.y0 getSource() {
        t23.y0.a aVar = t23.y0.f162076a;
        aVar.getClass();
        return aVar;
    }

    @Override // w23.o
    public String toString() {
        return this.f181640f;
    }
}
