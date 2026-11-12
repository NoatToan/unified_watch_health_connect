package w52;

import aq.m2;
import kotlin.k2;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class u {
    public static final void a(int i14, int i15, int i16, h4.r rVar, p3.m mVar, z3.e eVar) {
        int i17;
        h4.r rVar2;
        p3.o0 o0VarE = mVar.E(-1644801396);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
        } else {
            i17 = (o0VarE.B(rVar) ? 4 : 2) | i15;
        }
        int i19 = i17 | (o0VarE.k(i14) ? 32 : 16);
        if ((i15 & 384) == 0) {
            i19 |= o0VarE.r(eVar) ? 256 : 128;
        }
        int i24 = 1;
        if (o0VarE.n(i19 & 1, (i19 & 147) != 146)) {
            h4.r rVar3 = i18 != 0 ? h4.r.S : rVar;
            p3.x1 x1Var = p3.n.f135158a;
            if (i14 == 0) {
                o0VarE.C(1003609196);
                h4.d.f81522a.getClass();
                f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVar3, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p3.p0.l();
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
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.u uVar = c2.u.f22885a;
                eVar.invoke(o0VarE, Integer.valueOf((i19 >> 6) & 14));
                o0VarE.g0(true);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1003692493);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                a(i14 - 1, i19 & 896, 0, h4.k.a(c2.l.A(rVar3, j92.b.f97899b.f97918c, 0.0f, 2), k2.f91249a, new s(i24)), o0VarE, eVar);
                o0VarE.g0(false);
            }
            rVar2 = rVar3;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m2(rVar2, i14, eVar, i15, i16);
        }
    }
}
