package j03;

import h73.t;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements i03.k.c<t> {
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // i03.k.c
    public final void a(i03.n nVar, h73.r rVar) {
        boolean z14;
        t tVar = (t) rVar;
        h73.a aVar = (h73.a) tVar.f82379a;
        if (aVar != null) {
            h73.a aVar2 = (h73.a) aVar.f82379a;
            if (aVar2 instanceof h73.p) {
                z14 = ((h73.p) aVar2).f82378f;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        if (!z14) {
            nVar.b();
        }
        int iD = nVar.d();
        nVar.g(tVar);
        q.f96183f.b(nVar.f86957b, Boolean.valueOf(z14));
        nVar.e(tVar, iD);
        if (z14) {
            return;
        }
        nVar.a(tVar);
    }
}
