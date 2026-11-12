package ii0;

import am.e1;
import c2.x2;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.p2;
import p3.x1;
import yc.z0;

/* JADX INFO: loaded from: classes8.dex */
public final class r0 {
    public static final void a(zc.d dVar, li0.f fVar, u2.h hVar, e2.i0 i0Var, boolean z14, p3.m mVar, int i14) {
        int i15;
        dVar.getClass();
        fVar.getClass();
        hVar.getClass();
        i0Var.getClass();
        p3.o0 o0VarE = mVar.E(-793775701);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(hVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(i0Var) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.h(z14) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = kg.f.j(o0VarE);
            }
            m4.b0 b0Var = (m4.b0) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = kg.f.b(o0VarE);
            }
            a2.j jVar = (a2.j) objQ2;
            p1 p1VarK = xy2.b.k(jVar, o0VarE, 6);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var = (p1) objQ3;
            z0 z0Var = dVar.d().f196385a;
            int i16 = i15 & 14;
            boolean z15 = i16 == 4 || ((i15 & 8) != 0 && o0VarE.r(dVar));
            Object objQ4 = o0VarE.q();
            if (z15 || objQ4 == c2565a) {
                objQ4 = new p0(dVar, p1Var, null);
                o0VarE.K(objQ4);
            }
            p3.l0.e((e23.p) objQ4, z0Var, o0VarE);
            Unit unit = Unit.INSTANCE;
            boolean z16 = (57344 & i15) == 16384;
            Object objQ5 = o0VarE.q();
            if (z16 || objQ5 == c2565a) {
                objQ5 = new q0(z14, b0Var, null);
                o0VarE.K(objQ5);
            }
            p3.l0.e((e23.p) objQ5, unit, o0VarE);
            h4.r.a aVar = h4.r.S;
            h4.r rVarC = wz1.i.c(x2.d(aVar, 1.0f), o0VarE);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            int i17 = i15 >> 6;
            p003ji0.n.a(hVar, m4.e.a(aVar, b0Var), jVar, false, o0VarE, (i17 & 14) | 384, 8);
            h4.r rVarD = x2.d(aVar, 1.0f);
            boolean zB = ((i15 & 896) == 256) | (i16 == 4 || ((i15 & 8) != 0 && o0VarE.r(dVar))) | ((i15 & 112) == 32 || ((i15 & 64) != 0 && o0VarE.r(fVar))) | o0VarE.B(p1VarK);
            Object objQ6 = o0VarE.q();
            if (zB || objQ6 == c2565a) {
                e1 e1Var = new e1(dVar, hVar, fVar, p1Var, p1VarK, 26);
                o0VarE.K(e1Var);
                objQ6 = e1Var;
            }
            e2.c.b(rVarD, i0Var, null, null, null, null, false, null, (e23.l) objQ6, o0VarE, (i17 & 112) | 6, 508);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.l(dVar, fVar, hVar, i0Var, z14, i14, 10);
        }
    }
}
