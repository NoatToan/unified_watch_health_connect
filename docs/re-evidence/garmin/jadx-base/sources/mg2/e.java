package mg2;

import c2.x2;
import d81.z;
import f5.z0;
import h5.e0;
import i3.ua;
import o4.d0;
import o4.u1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m1;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes11.dex */
public final class e {
    public static final void a(e23.a aVar, long j8, p3.m mVar, int i14) {
        o0 o0Var;
        aVar.getClass();
        o0 o0VarE = mVar.E(-2082215260);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.l(j8) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = n23.j.o(0.0f, o0VarE);
            }
            m1 m1Var = (m1) objQ;
            x3 x3VarB = s1.f.b(m1Var.getFloatValue(), s1.l.d((int) j8, 0, null, 6), null, o0VarE, 0, 28);
            Unit unit = Unit.INSTANCE;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new c(m1Var, null);
                o0VarE.K(objQ2);
            }
            l0.e((e23.p) objQ2, unit, o0VarE);
            Float fValueOf = Float.valueOf(((Number) x3VarB.getF182175a()).floatValue());
            boolean zB = ((i15 & 14) == 4) | o0VarE.B(x3VarB);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                objQ3 = new d(aVar, x3VarB, null);
                o0VarE.K(objQ3);
            }
            l0.e((e23.p) objQ3, fValueOf, o0VarE);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81528f;
            h4.r.a aVar2 = h4.r.S;
            z0 z0VarD = c2.q.d(gVar, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
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
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            h4.r rVarQ = x2.q(aVar2, j92.b.f97901d.f97908g);
            long jE = d92.b.a(o0VarE).j().e();
            d0.f128823b.getClass();
            long j14 = d0.f128831j;
            u1.f129010b.getClass();
            int i16 = u1.f129012d;
            float f14 = 0;
            bVar2.getClass();
            float f15 = j92.b.f97899b.f97917b;
            boolean zB2 = o0VarE.B(x3VarB);
            Object objQ4 = o0VarE.q();
            if (zB2 || objQ4 == c2565a) {
                objQ4 = new by1.h(x3VarB, 9);
                o0VarE.K(objQ4);
            }
            ua.b((e23.a) objQ4, rVarQ, jE, f15, j14, i16, f14, o0VarE, 1597440, 0);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z(aVar, i14, 6, j8);
        }
    }
}
