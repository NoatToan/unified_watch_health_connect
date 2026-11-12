package ys1;

import e23.l;
import h4.r;
import i3.h7;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static final void a(int i14, l lVar, r rVar, m mVar, boolean z14) {
        lVar.getClass();
        o0 o0VarE = mVar.E(2133204939);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            int i16 = i15 >> 3;
            h7.c(z14, lVar, rVar, false, null, null, z3.f.c(1037276126, new rw0.g(z14, 21), o0VarE), o0VarE, (i16 & 112) | (i16 & 14) | 12582912 | ((i15 << 6) & 896));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.h(rVar, z14, lVar, i14, 3);
        }
    }
}
