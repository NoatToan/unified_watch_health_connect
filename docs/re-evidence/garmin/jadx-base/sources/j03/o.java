package j03;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements i03.k.c<h73.q> {
    @Override // i03.k.c
    public final void a(i03.n nVar, h73.r rVar) {
        h73.q qVar = (h73.q) rVar;
        int iD = nVar.d();
        i03.q qVar2 = nVar.f86957b;
        nVar.g(qVar);
        h73.a aVar = (h73.a) qVar.f82379a;
        if (aVar instanceof h73.s) {
            h73.s sVar = (h73.s) aVar;
            int i14 = sVar.f82384g;
            q.f96178a.b(qVar2, q.a.ORDERED);
            q.f96180c.b(qVar2, Integer.valueOf(i14));
            sVar.f82384g++;
        } else {
            q.f96178a.b(qVar2, q.a.BULLET);
            i03.o<Integer> oVar = q.f96179b;
            int i15 = 0;
            for (h73.r rVarC = (h73.a) qVar.f82379a; rVarC != null; rVarC = rVarC.c()) {
                if (rVarC instanceof h73.q) {
                    i15++;
                }
            }
            oVar.b(qVar2, Integer.valueOf(i15));
        }
        nVar.e(qVar, iD);
        if (qVar.f82383e != null) {
            nVar.c();
        }
    }
}
