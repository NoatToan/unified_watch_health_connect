package sg0;

import i3.mh;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class t {
    public static final void a(p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-736408226);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(aVar, eVar.f97920e);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            s5.x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
            d6.h.f57752b.getClass();
            int i15 = d6.h.f57755e;
            mh.c("Your child has aged out of the family account", null, 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 6, 0, 130046);
            fVar.getClass();
            s5.x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarE);
            bVar.getClass();
            mh.c("Your child has become of age of digital consent where they can manage their Garmin accounts on their own. If you feel that your child needs continued guidance, we advise you to have a conversation with them.", c2.l.C(aVar, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 6, 0, 130044);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s70.v(i14, 27);
        }
    }

    public static final void b(f0 f0Var, q0 q0Var, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1797713714);
        int i15 = 4;
        int i16 = (o0VarE.r(f0Var) ? 4 : 2) | i14 | (o0VarE.r(q0Var) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            z02.d.a(false, z3.f.c(-165925869, new s5.a(q0Var, 9), o0VarE), null, null, null, z3.f.c(1639915287, new dv0.l(s9.c.c(r53.s.d(f0Var.f159087f), o0VarE), i15), o0VarE), o0VarE, 196656, 29);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rk0.a1(f0Var, q0Var, i14, 13);
        }
    }
}
