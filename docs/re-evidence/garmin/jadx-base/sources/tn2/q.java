package tn2;

import java.util.ArrayList;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class q implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w.d f165618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f165619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ul2.c f165620d;

    public /* synthetic */ q(w.d dVar, w wVar, ul2.c cVar, int i14) {
        this.f165617a = i14;
        this.f165618b = dVar;
        this.f165619c = wVar;
        this.f165620d = cVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f165617a;
        int i15 = 1;
        ul2.c cVar = this.f165620d;
        w wVar = this.f165619c;
        w.d dVar = this.f165618b;
        w.f fVar = (w.f) obj;
        switch (i14) {
            case 0:
                Logger logger = w.f165679d;
                fVar.getClass();
                if (!dVar.f165694a) {
                    return q03.r.f(fVar);
                }
                cVar.getClass();
                z03.j jVarN = as2.h.n(cVar, w.e.a.f165708b.f165713e.a());
                wq2.a.f186629a.getClass();
                e13.o oVarM = as2.h.m(cVar, wq2.a.a((byte) 0, (byte) 102), "");
                v vVar = new v(new m(11), 12);
                int i16 = w03.b.f181178a;
                return new e13.o(jVarN.c(new e13.j(new e13.o(oVarM, vVar), new n(new p(wVar, cVar, i15), 28))), new n(new s(fVar, 0), 17));
            case 1:
                Logger logger2 = w.f165679d;
                fVar.getClass();
                if (!dVar.f165699f) {
                    return q03.r.f(fVar);
                }
                cVar.getClass();
                e13.n nVarF = q03.r.f(new ArrayList());
                v vVar2 = new v(new u(wVar, cVar, 0), 0);
                int i17 = w03.b.f181178a;
                return new e13.o(new e13.j(new e13.j(new e13.j(nVarF, vVar2), new v(new u(wVar, cVar, 1), 1)), new v(new u(wVar, cVar, 2), 2)), new n(new s(fVar, 6), 25));
            case 2:
                Logger logger3 = w.f165679d;
                fVar.getClass();
                boolean z14 = dVar.f165701h;
                boolean z15 = dVar.f165702i;
                if (!z14 && !z15) {
                    return q03.r.f(fVar);
                }
                ul2.c cVar2 = this.f165620d;
                cVar2.getClass();
                e13.o oVarM2 = as2.h.m(cVar2, wq2.a.b(pn2.a.EnumC2623a.INSTANCE1.a()), "");
                v vVar3 = new v(new m(13), 14);
                int i18 = w03.b.f181178a;
                return new e13.o(new e13.j(new e13.o(oVarM2, vVar3), new v(new g02.u(z14, z15, this.f165619c, cVar2, 3), 4)), new n(new s(fVar, 3), 21));
            case 3:
                Logger logger4 = w.f165679d;
                fVar.getClass();
                if (!dVar.f165696c) {
                    return q03.r.f(fVar);
                }
                cVar.getClass();
                e13.o oVarR = wVar.r(cVar, w.a.EnumC3112a.f165690c);
                n nVar = new n(new s(fVar, 5), 23);
                int i19 = w03.b.f181178a;
                return new e13.o(oVarR, nVar);
            default:
                Logger logger5 = w.f165679d;
                fVar.getClass();
                if (!dVar.f165697d) {
                    return q03.r.f(fVar);
                }
                cVar.getClass();
                e13.w wVarL = q03.r.l(wVar.r(cVar, w.a.EnumC3112a.f165688a), wVar.r(cVar, w.a.EnumC3112a.f165689b), new tn.k(3));
                n nVar2 = new n(new s(fVar, 7), 26);
                int i24 = w03.b.f181178a;
                return new e13.o(wVarL, nVar2);
        }
    }
}
