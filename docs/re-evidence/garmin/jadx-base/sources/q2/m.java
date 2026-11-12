package q2;

import f5.z0;
import h5.e0;
import p004k6.d0;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.n2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.t1;
import p3.x1;
import p40.k0;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    public static final void a(h4.r rVar, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        h4.r rVar2;
        z3.e eVar2;
        o0 o0VarE = mVar.E(790527681);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(eVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                t1 t1Var = t1.f135313a;
                t1Var.getClass();
                c2 c2Var = new c2(null, t1Var);
                o0VarE.K(c2Var);
                objQ = c2Var;
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new k0(p1Var, 20);
                o0VarE.K(objQ2);
            }
            e23.a aVar = (e23.a) objQ2;
            d0 d0Var = j.f142180a;
            h.f142173a.getClass();
            s2.b bVarB = s2.d.b(h.f142175c, o0VarE, 6);
            rVar2 = rVar;
            eVar2 = eVar;
            p3.v.b(new n2[]{s2.g.f156003b.c(g.c(aVar, o0VarE, 2)), s2.g.f156002a.c(bVarB)}, z3.f.c(1070596993, new ob0.e(rVar2, p1Var, eVar2, bVarB, aVar), o0VarE), o0VarE, 56);
        } else {
            rVar2 = rVar;
            eVar2 = eVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lh0.k(rVar2, eVar2, i14, 5);
        }
    }

    public static final void b(h4.r rVar, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(155925518);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(eVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            boolean z14 = o0VarE.A(s2.g.f156002a) != null;
            boolean z15 = o0VarE.A(s2.g.f156003b) != null;
            if (z14 && z15) {
                o0VarE.C(-1977187922);
                h4.d.f81522a.getClass();
                z0 z0VarD = c2.q.d(h4.d.a.f81524b, true);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVar, o0VarE);
                h5.g.V.getClass();
                e0.a aVar = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                b4.a(o0VarE, Integer.valueOf(iHashCode), h5.g.a.f81813j);
                b4.b(h5.g.a.f81814k, o0VarE);
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.u uVar = c2.u.f22885a;
                eVar.invoke(o0VarE, Integer.valueOf((i15 >> 3) & 14));
                o0VarE.g0(true);
                o0VarE.g0(false);
            } else if (z14) {
                o0VarE.C(-1976997706);
                g.a(rVar, eVar, o0VarE, i15 & 126);
                o0VarE.g0(false);
            } else if (z15) {
                o0VarE.C(-1976846922);
                j.d(rVar, eVar, o0VarE, i15 & 126);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1976716505);
                a(rVar, eVar, o0VarE, i15 & 126);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lh0.k(rVar, eVar, i14, 4);
        }
    }
}
