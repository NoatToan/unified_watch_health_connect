package j03;

import i03.t;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements i03.k.c<h73.l> {
    @Override // i03.k.c
    public final void a(i03.n nVar, h73.r rVar) {
        t tVar = nVar.f86958c;
        h73.l lVar = (h73.l) rVar;
        i03.g gVar = nVar.f86956a;
        i03.s sVar = gVar.f86938e.f86951a.get(h73.l.class);
        if (sVar == null) {
            nVar.g(lVar);
            return;
        }
        int iD = nVar.d();
        nVar.g(lVar);
        if (iD == nVar.d()) {
            tVar.a((char) 65532);
        }
        boolean z14 = lVar.f82379a instanceof h73.n;
        n03.a.b bVar = gVar.f86937d;
        String str = lVar.f82370f;
        bVar.getClass();
        i03.q qVar = nVar.f86957b;
        m03.c.f115754a.b(qVar, str);
        m03.c.f115755b.b(qVar, Boolean.valueOf(z14));
        m03.c.f115756c.b(qVar, null);
        Object objA = sVar.a(gVar, qVar);
        int length = tVar.f86967a.length();
        int length2 = tVar.f86967a.length();
        if (length <= iD || iD < 0 || length > length2) {
            return;
        }
        t.c(tVar, objA, iD, length);
    }
}
