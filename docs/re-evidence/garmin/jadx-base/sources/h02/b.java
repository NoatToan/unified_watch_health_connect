package h02;

import c2.a0;
import g02.q0;
import i3.e5;
import p3.m;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p2;
import p3.x1;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static final void a(a0 a0Var, String str, String str2, Integer num, m mVar, int i14) {
        a0Var.getClass();
        o0 o0VarE = mVar.E(-2058276920);
        int i15 = (o0VarE.B(str) ? 32 : 16) | i14;
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(num) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1169) != 1168)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = e5.o(0, o0VarE);
            }
            og.a.e(f.c(963021423, new g52.d((n1) objQ, num, str, str2, 9), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q0(a0Var, str, str2, num, i14);
        }
    }
}
