package c42;

import java.util.List;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class j {
    /* JADX WARN: Code duplicated, block: B:35:0x0082  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(l lVar, o oVar, p pVar, e23.a aVar, p3.m mVar, int i14) {
        lVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-385366331);
        int i15 = (o0VarE.r(lVar) ? 4 : 2) | i14 | (o0VarE.r(oVar) ? 32 : 16) | (o0VarE.r(pVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(lVar.f24412c, o0VarE);
            List<sd2.f> list = ((k) p1VarC.getF182175a()).f24408b;
            boolean zR = ((i15 & 896) == 256) | o0VarE.r(list) | ((i15 & 112) == 32);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new i(list, pVar, oVar, null);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new i(list, pVar, oVar, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((e23.p) objQ, list, o0VarE);
            boolean z14 = ((k) p1VarC.getF182175a()).f24407a;
            z3.e eVarC = z3.f.c(-2030131254, new a51.g(aVar, 26), o0VarE);
            a.f24348a.getClass();
            z02.d.a(z14, eVarC, null, null, null, a.f24349b, o0VarE, 196656, 28);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a51.l(lVar, oVar, pVar, aVar, i14, 18);
        }
    }
}
