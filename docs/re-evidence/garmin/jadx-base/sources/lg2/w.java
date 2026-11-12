package lg2;

import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r1.c0;
import r1.u0;
import r1.u1;
import r1.v1;

/* JADX INFO: loaded from: classes11.dex */
public final class w {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(boolean z14, ag2.e eVar, z3.e eVar2, p3.m mVar, int i14) {
        int i15;
        v1 v1VarB;
        o0 o0VarE = mVar.E(1895176640);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(eVar == null ? -1 : eVar.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(eVar2) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Boolean boolValueOf = Boolean.valueOf(z14);
            int i16 = i15 & 14;
            boolean z15 = (i16 == 4) | ((i15 & 112) == 32);
            Object objQ2 = o0VarE.q();
            if (z15 || objQ2 == c2565a) {
                objQ2 = new v(z14, eVar, p1Var, null);
                o0VarE.K(objQ2);
            }
            l0.f(eVar, boolValueOf, (e23.p) objQ2, o0VarE);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                v1VarB = u0.d(null, 3).b(u0.a(null, null, 15));
            } else {
                u1.f149287a.getClass();
                v1VarB = u1.f149288b;
            }
            c0.e(z14, null, v1VarB, u0.h(null, null, 15).b(u0.e(null, 3)), null, z3.f.c(-1913239576, new aa2.k(eVar2, 5), o0VarE), o0VarE, i16 | 199680, 18);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.b(z14, eVar, eVar2, i14, 14);
        }
    }
}
