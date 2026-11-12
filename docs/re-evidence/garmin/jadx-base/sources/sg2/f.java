package sg2;

import i3.l1;
import i3.o1;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
public final class f {
    public static final void a(h4.r rVar, long j8, z3.e eVar, p3.m mVar, int i14, int i15) {
        int i16;
        long jF;
        o0 o0Var;
        o0 o0VarE = mVar.E(1720637075);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            if ((i15 & 2) == 0) {
                jF = j8;
                int i17 = o0VarE.l(jF) ? 32 : 16;
                i16 |= i17;
            } else {
                jF = j8;
            }
            i16 |= i17;
        } else {
            jF = j8;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(eVar) ? 256 : 128;
        }
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
                if ((i15 & 2) != 0) {
                    i16 &= -113;
                }
            } else if ((i15 & 2) != 0) {
                jF = vb.h.f(d92.b.f58623a, o0VarE);
                i16 &= -113;
            }
            long j14 = jF;
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            k2.h hVarA = k2.i.a(j92.b.f97900c.f97911c);
            l1.f88793a.getClass();
            o1.a(rVar, hVarA, l1.a((i16 >> 3) & 14, 14, j14, 0L, o0VarE), null, z3.f.c(1100767713, new aa2.k(eVar, 10), o0VarE), o0VarE, (i16 & 14) | 196608, 24);
            o0Var = o0VarE;
            jF = j14;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq.q(rVar, jF, eVar, i14, i15);
        }
    }
}
