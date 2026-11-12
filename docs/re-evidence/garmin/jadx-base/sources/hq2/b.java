package hq2;

import g2.m1;
import hq.f0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f85239b;

    public /* synthetic */ b(g gVar, int i14) {
        this.f85238a = i14;
        this.f85239b = gVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f85238a;
        g gVar = this.f85239b;
        switch (i14) {
            case 0:
                ul2.c cVar = (ul2.c) obj;
                int i15 = g.f85248g;
                cVar.getClass();
                a aVar = a.f85231a;
                sl2.f f99649c = gVar.f85271a.getF99649c();
                aVar.getClass();
                f99649c.getClass();
                int i16 = a.C1691a.f85237a[f99649c.ordinal()];
                int i17 = 1;
                z03.j jVarN = as2.h.n(cVar, i16 == 1 ? a.f85233c : a.f85232b);
                e13.o oVarM = as2.h.m(cVar, gVar.w(), "Failed to getBalanceAndLastTopUpRecord");
                gw.j jVar = new gw.j(new f0(gVar, 12), 16);
                int i18 = w03.b.f181178a;
                return new e13.h(jVarN.c(new e13.j(oVarM, jVar)), new c(cVar, i17));
            default:
                String str = (String) obj;
                int i19 = g.f85248g;
                str.getClass();
                e13.p pVarA = ks2.e.a(gVar.f85271a);
                gw.j jVar2 = new gw.j(new m1(22, gVar, str), 17);
                int i24 = w03.b.f181178a;
                return new e13.j(pVarA, jVar2);
        }
    }
}
