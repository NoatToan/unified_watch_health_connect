package tg1;

import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import t21.l0;

/* JADX INFO: loaded from: classes10.dex */
public final class l {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i14, e23.a aVar, p3.m mVar, pg1.d dVar, sg1.b bVar) {
        pg1.d dVar2;
        aVar.getClass();
        o0 o0VarE = mVar.E(88353903);
        int i15 = (o0VarE.B(bVar) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            dVar2 = dVar;
            i15 |= o0VarE.r(dVar2) ? 256 : 128;
        } else {
            dVar2 = dVar;
        }
        int i16 = i15 | 3072;
        int i17 = 0;
        int i18 = 1;
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            z02.d.a(false, z3.f.c(1135173172, new tb0.h(bVar, i18, aVar, p1Var), o0VarE), null, null, null, z3.f.c(1131504440, new k(bVar, i17), o0VarE), o0VarE, 196662, 28);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-662366988);
                String str = bVar.f159202l;
                long j8 = bVar.f159192b;
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new sg0.l(p1Var, 27);
                    o0VarE.K(objQ2);
                }
                m.a(str, j8, (e23.a) objQ2, dVar2, o0VarE, ((i16 << 3) & 7168) | 384);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-662060429);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l0(bVar, aVar, dVar, i14, 4);
        }
    }
}
