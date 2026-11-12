package sg2;

import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
public final class o {
    public static final void a(h4.r rVar, lt2.a aVar, ah2.e eVar, String str, ag2.c.a aVar2, String str2, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(848857479);
        int i15 = i14 | (o0VarE.B(aVar) ? 32 : 16) | (o0VarE.B(eVar) ? 256 : 128) | (o0VarE.B(str) ? 2048 : 1024) | (o0VarE.k(aVar2.ordinal()) ? 16384 : 8192) | (o0VarE.B(str2) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Float f14 = eVar != null ? eVar.f3290b : null;
            if (eVar != null) {
                o0VarE.C(-453811842);
                o0Var = o0VarE;
                f.a(rVar, 0L, z3.f.c(1077644312, new ak0.h(f14, aVar, aVar2, eVar, str2, str, 23), o0VarE), o0Var, 390, 2);
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                o0Var.C(-451385317);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new oy0.b(rVar, aVar, eVar, str, aVar2, str2, i14, 21);
        }
    }
}
