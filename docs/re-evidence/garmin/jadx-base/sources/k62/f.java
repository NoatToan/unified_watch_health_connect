package k62;

import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class f {
    public static final void a(boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14) {
        boolean z15;
        o0 o0VarE = mVar.E(-1562588761);
        int i15 = (o0VarE.h(z14) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            z3.e eVarC = z3.f.c(-857845076, new hl1.i(aVar, 16), o0VarE);
            a.f103171a.getClass();
            z15 = z14;
            z02.d.a(z15, eVarC, null, null, null, a.f103172b, o0VarE, (i15 & 14) | 196656, 28);
        } else {
            z15 = z14;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.e(i14, 7, aVar, z15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ad  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(h hVar, e23.a aVar, j jVar, j jVar2, gp.h hVar2, p3.m mVar, int i14) {
        Boolean bool;
        hVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(946130201);
        int i15 = i14 | (o0VarE.r(hVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(jVar) ? 256 : 128) | (o0VarE.r(jVar2) ? 2048 : 1024) | (o0VarE.r(hVar2) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(hVar.f103195d, o0VarE);
            Boolean bool2 = ((g) p1VarC.getF182175a()).f103190c;
            boolean zB = ((i15 & 896) == 256) | o0VarE.B(bool2) | o0VarE.B(p1VarC) | ((i15 & 7168) == 2048) | ((57344 & i15) == 16384);
            Object objQ = o0VarE.q();
            if (zB) {
                bool = bool2;
                e eVar = new e(bool, jVar, jVar2, hVar2, p1VarC, null);
                o0VarE.K(eVar);
                objQ = eVar;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    bool = bool2;
                    e eVar2 = new e(bool, jVar, jVar2, hVar2, p1VarC, null);
                    o0VarE.K(eVar2);
                    objQ = eVar2;
                } else {
                    bool = bool2;
                }
            }
            l0.e((e23.p) objQ, bool, o0VarE);
            a(((g) p1VarC.getF182175a()).f103188a, aVar, o0VarE, i15 & 112);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ix.h(hVar, aVar, jVar, jVar2, hVar2, i14, 7);
        }
    }
}
