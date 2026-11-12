package sk0;

import i3.mc;
import p005kotlin.Unit;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class e1 {
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    public static final void a(e23.a<Unit> aVar, mc mcVar, p3.m mVar, int i14) {
        int i15;
        aVar.getClass();
        mcVar.getClass();
        p3.o0 o0VarE = mVar.E(-1587252186);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i16 = i15 | (o0VarE.B(mcVar) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            l72.w wVar = l72.w.f111301a;
            k0.f159709a.getClass();
            z3.e eVar = k0.f159710b;
            boolean z14 = (i16 & 14) == 4;
            Object objQ = o0VarE.q();
            int i17 = 17;
            if (z14) {
                objQ = new sg0.q0(aVar, 17);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new sg0.q0(aVar, 17);
                    o0VarE.K(objQ);
                }
            }
            wVar.c(eVar, null, (e23.a) objQ, mcVar, null, null, z3.f.c(-1303172760, new ak0.p(aVar, i17), o0VarE), o0VarE, ((i16 << 6) & 7168) | 1572870, 50);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g50.m(aVar, mcVar, i14, 1);
        }
    }
}
