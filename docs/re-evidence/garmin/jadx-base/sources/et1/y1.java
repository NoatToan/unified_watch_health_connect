package et1;

import c2.x2;
import p3.b4;

/* JADX INFO: loaded from: classes10.dex */
public final class y1 {
    public static final void a(boolean z14, int i14, int i15, e23.a aVar, z3.e eVar, p3.m mVar, int i16) {
        z3.e eVar2;
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-428550696);
        int i17 = i16 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.k(i15) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarD = x2.d(aVar2, 1.0f);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            eVar2 = eVar;
            eVar2.invoke(o0VarE, 6);
            if (z14) {
                o0VarE.C(148930328);
                h4.r rVarC2 = g02.s0.c(x2.d(aVar2, 1.0f), true);
                Object objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new ep0.a(13);
                    o0VarE.K(objQ);
                }
                u1.n.b(rVarC2, (e23.l) objQ, o0VarE, 48);
                p004k6.u uVar2 = new p004k6.u(false, false, p004k6.e0.Inherit, true, true, (String) null, 32, (p005kotlin.jvm.internal.j) null);
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new e51.c(24);
                    o0VarE.K(objQ2);
                }
                i3.l.d((e23.a) objQ2, aVar2, uVar2, z3.f.c(1624930943, new as.f(i14, i15, 2, aVar), o0VarE), o0VarE, 3510, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(152263076);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            eVar2 = eVar;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.a(z14, i14, i15, aVar, eVar2, i16);
        }
    }
}
