package tg1;

import p004k6.u;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s70.a0;
import sk0.k1;
import t21.l0;
import t70.a1;

/* JADX INFO: loaded from: classes10.dex */
public final class s {
    public static final void a(sg1.b bVar, pg1.a aVar, u uVar, e23.a aVar2, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(468340197);
        int i15 = 4;
        int i16 = i14 | (o0VarE.B(bVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new a1(aVar2, 20);
                o0VarE.K(objQ);
            }
            z3.e eVarC = z3.f.c(-1319816547, new tb0.h(aVar, 3, bVar, aVar2), o0VarE);
            z3.e eVarC2 = z3.f.c(1199075675, new a0(aVar2, 13), o0VarE);
            j.f164522a.getClass();
            o0Var = o0VarE;
            i3.r.a((e23.a) objQ, eVarC, null, eVarC2, j.f164523b, z3.f.c(-1465036936, new k(bVar, i15), o0VarE), null, 0L, 0L, 0L, 0L, 0.0f, uVar, o0Var, 1772592, 3072, 8084);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k1(bVar, aVar, uVar, aVar2, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(sg1.b bVar, pg1.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        aVar2.getClass();
        o0 o0VarE = mVar.E(-90121238);
        int i15 = (o0VarE.B(bVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar2) ? 256 : 128;
        }
        int i16 = 0;
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
            z02.d.a(false, z3.f.c(-956540305, new p(bVar, aVar2), o0VarE), null, null, null, z3.f.c(-597182861, new r(bVar, p1Var, i16), o0VarE), o0VarE, 196656, 29);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-445324557);
                u uVar = new u(false, false, false, 4, (p005kotlin.jvm.internal.j) null);
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new sg0.l(p1Var, 29);
                    o0VarE.K(objQ2);
                }
                a(bVar, aVar, uVar, (e23.a) objQ2, o0VarE, (i15 & 112) | (i15 & 14) | 3456);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-445042984);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l0(bVar, aVar, aVar2, i14, 5);
        }
    }
}
