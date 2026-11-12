package hq2;

import hq.f0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class k implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f85259b;

    public /* synthetic */ k(n nVar, int i14) {
        this.f85258a = i14;
        this.f85259b = nVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f85258a;
        int i15 = 0;
        n nVar = this.f85259b;
        ul2.c cVar = (ul2.c) obj;
        switch (i14) {
            case 0:
                int i16 = n.f85263g;
                cVar.getClass();
                j jVar = j.f85251a;
                jVar.getClass();
                z03.j jVarN = as2.h.n(cVar, j.f85253c);
                gw.j jVar2 = new gw.j(new l(nVar, cVar, i15), 18);
                int i17 = w03.b.f181178a;
                z03.o oVar = new z03.o(jVarN, jVar2);
                jVar.getClass();
                return new e13.h(oVar.c(new e13.j(as2.h.m(cVar, j.f85254d, "Failed to getPurseId"), new gw.j(new l(nVar, cVar, 1), 23))), new c(cVar, 2));
            default:
                int i18 = n.f85263g;
                cVar.getClass();
                j.f85251a.getClass();
                z03.j jVarN2 = as2.h.n(cVar, j.f85253c);
                gw.j jVar3 = new gw.j(new l(nVar, cVar, i15), 18);
                int i19 = w03.b.f181178a;
                return new e13.h(new z03.o(jVarN2, jVar3).c(new e13.j(as2.h.m(cVar, nVar.w(), "Failed to getBalanceAndLastTopUpRecord"), new gw.j(new f0(nVar, 14), 24))), new c(cVar, 3));
        }
    }
}
