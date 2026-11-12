package g02;

import c2.q2;
import c2.s2;
import c2.u2;
import i3.mh;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes10.dex */
public final class o1 {
    /* JADX WARN: Code duplicated, block: B:56:0x012f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, boolean z14, i53.c cVar, int i14, e23.l lVar, p3.m mVar, int i15) {
        cVar.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(-2119952690);
        int i16 = i15 | (o0VarE.B(rVar) ? 4 : 2);
        boolean z15 = z14;
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.h(z15) ? 32 : 16;
        }
        int i17 = i16 | (o0VarE.B(cVar) ? 256 : 128) | (o0VarE.k(i14) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192);
        boolean z16 = true;
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            p3.x1 x1Var = p3.n.f135158a;
            float size = 1.0f / cVar.size();
            g6.f.a aVar = g6.f.f75994b;
            h4.r rVarE = u1.n.e(l4.k.b(rVar, k2.i.a(8)), vb.h.f(d92.b.f58623a, o0VarE), o4.m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            o0VarE.C(-1603327012);
            int size2 = cVar.size();
            int i18 = 0;
            while (i18 < size2) {
                String str = (String) cVar.get(i18);
                h4.r rVarA = u2Var.a(h4.r.S, size, z16);
                boolean z17 = i14 == i18 ? z16 : false;
                boolean zK = ((57344 & i17) == 16384) | o0VarE.k(i18);
                Object objQ = o0VarE.q();
                if (zK) {
                    objQ = new au0.m(lVar, i18, 11);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new au0.m(lVar, i18, 11);
                        o0VarE.K(objQ);
                    }
                }
                b(rVarA, str, z17, z15, (e23.a) objQ, o0VarE, (i17 << 6) & 7168);
                i18++;
                z15 = z14;
                z16 = true;
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.g(rVar, z14, cVar, i14, lVar, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    public static final void b(h4.r rVar, String str, boolean z14, boolean z15, e23.a aVar, p3.m mVar, int i14) {
        int i15;
        String str2;
        long jB;
        long jB2;
        p3.o0 o0VarE = mVar.E(-397763476);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            str2 = str;
            i15 |= o0VarE.B(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z15) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            p3.x1 x1Var = p3.n.f135158a;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarB = l4.k.b(rVar, k2.i.a(8));
            if (z14) {
                o0VarE.C(1399566);
                d92.b.f58623a.getClass();
                jB = d92.b.a(o0VarE).i().a().b();
                o0VarE.g0(false);
            } else {
                o0VarE.C(1400023);
                o0VarE.g0(false);
                o4.d0.f128823b.getClass();
                jB = o4.d0.f128831j;
            }
            h4.r rVarE = u1.n.e(rVarB, jB, o4.m1.f128891a);
            boolean z16 = (57344 & i15) == 16384;
            Object objQ = o0VarE.q();
            if (z16) {
                objQ = new a03.h0(aVar, 25);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a03.h0(aVar, 25);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarA = wz1.i.a((e23.l) objQ, rVarE, z15);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
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
            h4.r rVarC2 = c2.u.f22885a.c(h4.r.S, h4.d.a.f81528f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarA2 = c2.l.A(rVarC2, 0.0f, j92.b.f97899b.f97918c, 1);
            d92.b.f58624b.getClass();
            s5.x0 x0Var = j92.f.f97932i;
            if (z14) {
                o0VarE.C(-45088303);
                jB2 = d92.b.a(o0VarE).k().f63527d;
            } else {
                o0VarE.C(-45087251);
                jB2 = d92.b.a(o0VarE).k().b();
            }
            o0VarE.g0(false);
            mh.c(str2, rVarA2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, s5.x0.a(x0Var, jB2, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, (i15 >> 3) & 14, 0, 131068);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n1(rVar, str, z14, z15, aVar, i14, 0);
        }
    }
}
