package l43;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends a<u23.c> implements e<u23.c, d43.g<?>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f110007b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(t23.c0 c0Var, t23.g0 g0Var, k43.a aVar) {
        super(aVar);
        c0Var.getClass();
        g0Var.getClass();
        aVar.getClass();
        this.f110007b = new g(c0Var, g0Var);
    }

    @Override // l43.e
    public final d43.g<?> c(o0 o0Var, s33.o oVar, p43.n0 n0Var) {
        oVar.getClass();
        s33.b.C2953b.c cVar = (s33.b.C2953b.c) u33.f.a(oVar, this.f109984a.f102894m);
        if (cVar == null) {
            return null;
        }
        return this.f110007b.c(n0Var, cVar, o0Var.f110076a);
    }

    @Override // l43.e
    public final d43.g<?> e(o0 o0Var, s33.o oVar, p43.n0 n0Var) {
        oVar.getClass();
        return null;
    }

    public final u23.d m(s33.b bVar, u33.d dVar) {
        bVar.getClass();
        dVar.getClass();
        return this.f110007b.a(bVar, dVar);
    }
}
