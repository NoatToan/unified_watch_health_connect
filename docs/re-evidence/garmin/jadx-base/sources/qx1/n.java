package qx1;

import c2.x2;
import h4.r;
import jy0.h0;
import l72.y2;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class n {
    public static final void a(int i14, int i15, int i16, r rVar, p3.m mVar) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-54268068);
        int i17 = (o0VarE.k(i14) ? 4 : 2) | i16 | (o0VarE.k(i15) ? 32 : 16) | (o0VarE.B(rVar) ? 256 : 128);
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (i14 < 0 || i15 <= 0) {
                o0Var = o0VarE;
                o0Var.C(-1792028762);
                o0Var.g0(false);
            } else {
                o0VarE.C(-1792145229);
                y2.f111386a.a(i14 / i15, 0.0f, 0, 0, 124, 0L, 0L, x2.f(rVar, 1.0f), o0VarE);
                o0Var = o0VarE;
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h0(i14, i15, rVar, i16);
        }
    }
}
