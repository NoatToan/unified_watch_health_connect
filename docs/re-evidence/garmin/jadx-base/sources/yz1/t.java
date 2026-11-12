package yz1;

import c2.x2;
import i3.ve;
import l72.v2;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class t {
    public static final void a(String str, String str2, String str3, h4.r rVar, boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        boolean z15;
        int i16;
        o0 o0Var;
        boolean z16;
        str.getClass();
        rVar.getClass();
        o0 o0VarE = mVar.E(240201227);
        int i17 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(str3) ? 256 : 128);
        if ((i14 & 3072) == 0) {
            i17 |= o0VarE.B(rVar) ? 2048 : 1024;
        }
        int i18 = i15 & 16;
        if (i18 != 0) {
            i16 = i17 | 24576;
            z15 = z14;
        } else {
            z15 = z14;
            i16 = i17 | (o0VarE.h(z15) ? 16384 : 8192);
        }
        int i19 = i16 | (o0VarE.r(aVar) ? 131072 : 65536);
        if (o0VarE.n(i19 & 1, (74899 & i19) != 74898)) {
            z16 = i18 != 0 ? true : z15;
            x1 x1Var = p3.n.f135158a;
            h4.r rVarA = v2.a(v2.a(x2.f(rVar, 1.0f), !z16, new yp0.b(7), o0VarE, 0), aVar != null, new y22.p(aVar, 5), o0VarE, 0);
            long jB = am.j.B(d92.b.f58623a, o0VarE);
            g6.f.a aVar2 = g6.f.f75994b;
            o0Var = o0VarE;
            ve.a(rVarA, k2.i.a(8), jB, 0L, 0.0f, 0.0f, null, z3.f.c(668074918, new x72.m(str, str2, str3, z16), o0VarE), o0Var, 12582912, 120);
        } else {
            o0Var = o0VarE;
            o0Var.e();
            z16 = z15;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d62.o(str, str2, str3, rVar, z16, aVar, i14, i15);
        }
    }
}
