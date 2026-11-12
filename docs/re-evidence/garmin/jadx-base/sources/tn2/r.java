package tn2;

import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class r implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w.d f165629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ul2.c f165630c;

    public /* synthetic */ r(w.d dVar, w wVar, ul2.c cVar, int i14) {
        this.f165628a = i14;
        this.f165629b = dVar;
        this.f165630c = cVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f165628a;
        int i15 = 4;
        int i16 = 6;
        int i17 = 8;
        ul2.c cVar = this.f165630c;
        w.d dVar = this.f165629b;
        w.f fVar = (w.f) obj;
        switch (i14) {
            case 0:
                Logger logger = w.f165679d;
                fVar.getClass();
                if (!dVar.f165700g) {
                    return q03.r.f(fVar);
                }
                cVar.getClass();
                z03.j jVarN = as2.h.n(cVar, w.e.a.f165708b.f165713e.a());
                wq2.a.f186629a.getClass();
                e13.o oVarM = as2.h.m(cVar, wq2.a.a((byte) 0, (byte) 102), "");
                n nVar = new n(new m(i16), 29);
                int i18 = w03.b.f181178a;
                return new e13.o(jVarN.c(new e13.o(oVarM, nVar)), new n(new s(fVar, 2), 20));
            case 1:
                Logger logger2 = w.f165679d;
                fVar.getClass();
                if (!dVar.f165703j) {
                    return q03.r.f(fVar);
                }
                cVar.getClass();
                e13.o oVarM2 = as2.h.m(cVar, wq2.a.b(pn2.a.EnumC2623a.INSTANCE1.a()), "");
                n nVar2 = new n(new m(i15), 19);
                int i19 = w03.b.f181178a;
                return new b13.k(new b13.f(new e13.l(oVarM2, nVar2), new yr2.l(new b0(fVar))), new e13.b(new c0(fVar)));
            case 2:
                Logger logger3 = w.f165679d;
                fVar.getClass();
                if (!dVar.f165695b) {
                    return q03.r.f(fVar);
                }
                cVar.getClass();
                z03.j jVarN2 = as2.h.n(cVar, w.e.a.f165708b.f165713e.a());
                wq2.a.f186629a.getClass();
                e13.o oVarM3 = as2.h.m(cVar, wq2.a.a((byte) 0, (byte) 102), "");
                v vVar = new v(new m(i17), 6);
                int i24 = w03.b.f181178a;
                return new e13.o(jVarN2.c(new e13.o(oVarM3, vVar)), new n(new s(fVar, 4), 22));
            default:
                Logger logger4 = w.f165679d;
                fVar.getClass();
                if (!dVar.f165698e) {
                    return q03.r.f(fVar);
                }
                cVar.getClass();
                z03.j jVarN3 = as2.h.n(cVar, w.e.a.f165709c.f165715e.a());
                wq2.a.f186629a.getClass();
                e13.o oVarM4 = as2.h.m(cVar, wq2.a.a((byte) 0, (byte) -63), "");
                v vVar2 = new v(new m(9), 8);
                int i25 = w03.b.f181178a;
                return new e13.o(jVarN3.c(new e13.o(oVarM4, vVar2)), new n(new s(fVar, 1), 18));
        }
    }
}
