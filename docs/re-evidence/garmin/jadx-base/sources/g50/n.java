package g50;

import ak0.p;
import g02.h0;
import i3.mc;
import l72.w;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class n {
    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    public static final void a(e23.a<Unit> aVar, mc mcVar, p3.m mVar, int i14) {
        int i15;
        aVar.getClass();
        mcVar.getClass();
        o0 o0VarE = mVar.E(-2098743224);
        int i16 = 4;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i17 = i15 | (o0VarE.B(mcVar) ? 32 : 16);
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            w wVar = w.f111301a;
            a.f75882a.getClass();
            z3.e eVar = a.f75883b;
            boolean z14 = (i17 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new h0(aVar, 6);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new h0(aVar, 6);
                    o0VarE.K(objQ);
                }
            }
            wVar.c(eVar, null, (e23.a) objQ, mcVar, null, null, z3.f.c(-2052862650, new p(aVar, i16), o0VarE), o0VarE, ((i17 << 6) & 7168) | 1572870, 50);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(aVar, mcVar, i14, 0);
        }
    }
}
