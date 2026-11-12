package o72;

import i3.kd;
import i3.mh;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
public final class n2 {
    public static final void a(p3.m mVar, int i14) {
        p3.m1 m1Var;
        p3.m1 m1Var2;
        String str;
        p3.o0 o0VarE = mVar.E(459130623);
        p3.c<?> cVar = o0VarE.f135177b;
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = n23.j.o(0.0f, o0VarE);
            }
            p3.m1 m1Var3 = (p3.m1) objQ;
            h4.r.a aVar = h4.r.S;
            h4.r rVarD = c2.x2.d(aVar, 1.0f);
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarY = c2.l.y(rVarD, f14);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.i(f14), aVar3, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c("Map Compass", null, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97928e, o0VarE, 6, 0, 131066);
            fVar2.getClass();
            s5.x0 x0Var = j92.f.f97932i;
            mh.c("The compass automatically hides when the map returns the set default heading. It shows cardinal directions (N, E, S, W) and fades out 2 seconds after reaching default heading.", null, vb.h.g(o0VarE), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, 6, 0, 131066);
            c2.l.f(c2.x2.h(aVar, f14), o0VarE);
            h4.r rVarE = u1.n.e(c2.x2.q(aVar, 300), v.h.t(o0VarE), o4.m1.f128891a);
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81532j, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarE, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            c2.u uVar = c2.u.f22885a;
            String strF = v.e0.f((int) m1Var3.getFloatValue(), "Map Rotated: ", "°");
            long jD = d92.b.a(o0VarE).k().d();
            fVar2.getClass();
            mh.c(strF, uVar.c(aVar, h4.d.a.f81528f), jD, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, 0, 0, 131064);
            float floatValue = m1Var3.getFloatValue();
            h4.r rVarY2 = c2.l.y(aVar, f14);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                m1Var = m1Var3;
                objQ2 = new m2(m1Var, 0);
                o0VarE.K(objQ2);
            } else {
                m1Var = m1Var3;
            }
            l72.t2.a(floatValue, 224688, (e23.a) objQ2, rVarY2, o0VarE, true);
            o0VarE.g0(true);
            c2.l.f(c2.x2.h(aVar, f14), o0VarE);
            String str2 = "Rotate Map: " + ((int) m1Var.getFloatValue()) + "°";
            fVar2.getClass();
            p3.m1 m1Var4 = m1Var;
            mh.c(str2, null, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97931h, o0VarE, 0, 0, 131066);
            float floatValue2 = m1Var4.getFloatValue();
            j23.e eVar2 = new j23.e(0.0f, 360.0f);
            h4.r rVarA = c2.l.A(aVar, f14, 0.0f, 2);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                m1Var2 = m1Var4;
                objQ3 = new ca0.q1(m1Var2, 5);
                o0VarE.K(objQ3);
            } else {
                m1Var2 = m1Var4;
            }
            kd.e(floatValue2, (e23.l) objQ3, rVarA, false, eVar2, 0, null, null, null, o0VarE, 432, 488);
            if (m1Var2.getFloatValue() < 22.5f || m1Var2.getFloatValue() >= 337.5f) {
                str = "N (North)";
            } else if (m1Var2.getFloatValue() >= 22.5f && m1Var2.getFloatValue() < 67.5f) {
                str = "N (North-East boundary)";
            } else if (m1Var2.getFloatValue() >= 67.5f && m1Var2.getFloatValue() < 112.5f) {
                str = "E (East)";
            } else if (m1Var2.getFloatValue() >= 112.5f && m1Var2.getFloatValue() < 157.5f) {
                str = "S (South-East boundary)";
            } else if (m1Var2.getFloatValue() >= 157.5f && m1Var2.getFloatValue() < 202.5f) {
                str = "S (South)";
            } else if (m1Var2.getFloatValue() < 202.5f || m1Var2.getFloatValue() >= 247.5f) {
                str = (m1Var2.getFloatValue() < 247.5f || m1Var2.getFloatValue() >= 292.5f) ? "N (North-West boundary)" : "W (West)";
            } else {
                str = "S (South-West boundary)";
            }
            String strConcat = "Current Direction: ".concat(str);
            fVar2.getClass();
            s5.x0 x0Var2 = j92.f.f97933j;
            mh.c(strConcat, null, vb.h.g(o0VarE), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var2, o0VarE, 0, 0, 131066);
            fVar2.getClass();
            mh.c("Compass will auto-hide 2s after returning to 0°", null, d92.b.a(o0VarE).k().d(), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var2, o0VarE, 6, 0, 131066);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z1(i14, 16);
        }
    }
}
