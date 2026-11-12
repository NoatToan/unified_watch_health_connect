package s70;

import c2.x2;
import i3.ve;
import l72.v2;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class b1 {
    public static final void a(String str, String str2, h4.r rVar, boolean z14, e23.p pVar, e23.p pVar2, e23.a aVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        boolean z15;
        p3.o0 o0VarK = com.nimbusds.jose.shaded.gson.internal.a.k(str, str2, mVar, -114485277);
        int i15 = i14 | (o0VarK.B(str) ? 4 : 2) | (o0VarK.B(str2) ? 32 : 16) | (o0VarK.B(rVar) ? 256 : 128) | 27648 | (o0VarK.r(aVar) ? 8388608 : 4194304);
        if (o0VarK.n(i15 & 1, (4793491 & i15) != 4793490)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarA = v2.a(v2.a(x2.f(rVar, 1.0f), aVar != null, new ao1.j(null, aVar, 4), o0VarK, 0), false, new s50.b(2), o0VarK, 0);
            Object objQ = o0VarK.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new s5.e0(19);
                o0VarK.K(objQ);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ, rVarA, true);
            long jB = am.j.B(d92.b.f58623a, o0VarK);
            g6.f.a aVar2 = g6.f.f75994b;
            o0Var = o0VarK;
            ve.a(rVarC, k2.i.a(8), jB, 0L, 0.0f, 0.0f, null, z3.f.c(1328269054, new qy0.d(str, pVar, str2, pVar2, 23), o0VarK), o0Var, 12582912, 120);
            z15 = true;
        } else {
            o0Var = o0VarK;
            o0Var.e();
            z15 = z14;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new defpackage.d(str, str2, rVar, z15, pVar, pVar2, aVar, i14);
        }
    }
}
