package l33;

/* JADX INFO: loaded from: classes3.dex */
public class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f109737a;

    public g(i iVar) {
        this.f109737a = iVar;
    }

    @Override // e23.a
    public final Object invoke() {
        k23.l<Object>[] lVarArr = i.f109751i;
        i iVar = this.f109737a;
        x33.c cVarC = iVar.c();
        o33.a aVar = iVar.f109753b;
        k33.i iVar2 = iVar.f109752a;
        if (cVarC == null) {
            return r43.l.c(r43.k.I, aVar.toString());
        }
        s23.d dVar = s23.d.f156251a;
        k33.c cVar = iVar2.f102785a;
        t23.c0 c0Var = cVar.f102765o;
        t23.e eVarC = s23.d.c(dVar, cVarC, c0Var.e());
        if (eVarC == null) {
            eVarC = cVar.f102761k.a(aVar.j());
            if (eVarC == null) {
                x33.b.f188590d.getClass();
                eVarC = t23.u.c(c0Var, x33.b.a.b(cVarC), cVar.f102754d.c().f110062l);
            }
        }
        return eVarC.p();
    }
}
