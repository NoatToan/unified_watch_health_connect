package ys1;

import am.j;
import b82.b2;
import c2.b0;
import c2.l;
import c2.q;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import f5.z0;
import h4.k;
import h4.r;
import h5.e0;
import i3.h7;
import jy0.h0;
import k2.i;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0158  */
    /* JADX WARN: Code duplicated, block: B:70:0x015f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0163  */
    /* JADX WARN: Code duplicated, block: B:76:0x017e  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:87:0x024c  */
    public static final void a(int i14, i53.c<Integer> cVar, i53.c<Integer> cVar2, e23.a<Unit> aVar, m mVar, int i15, int i16) {
        int i17;
        int i18;
        int i19;
        int i24;
        h5.g.a.f fVar;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        boolean z14;
        Object objQ;
        cVar.getClass();
        cVar2.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(733322982);
        p3.c<?> cVar3 = o0VarE.f135177b;
        int i25 = i16 & 1;
        if (i25 != 0) {
            i18 = i15 | 6;
            i17 = i14;
        } else if ((i15 & 6) == 0) {
            i17 = i14;
            i18 = (o0VarE.k(i17) ? 4 : 2) | i15;
        } else {
            i17 = i14;
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= o0VarE.B(cVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i18 |= o0VarE.B(cVar2) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i18 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i18 & 1, (i18 & 1171) != 1170)) {
            int i26 = i25 != 0 ? 3 : i17;
            x1 x1Var = n.f135158a;
            boolean z15 = (i18 & 14) == 4;
            Object objQ2 = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (z15) {
                objQ2 = new a51.c(i26, 12);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new a51.c(i26, 12);
                    o0VarE.K(objQ2);
                }
            }
            h2.b bVarB = h2.o0.b(0, (e23.a) objQ2, o0VarE, 0, 3);
            r.a aVar3 = r.S;
            long jB = j.B(d92.b.f58623a, o0VarE);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            int i27 = i18;
            float f15 = eVar.f97920e;
            r rVarE = u1.n.e(aVar3, jB, i.a(f14));
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81537o;
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            float f16 = eVar.f97918c;
            jVar.getClass();
            z zVarA = y.a(c2.j.i(f16), aVar4, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (cVar3 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                i24 = i26;
            } else {
                i24 = i26;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                b0 b0Var = b0.f22601a;
                r rVarF = x2.f(aVar3, 1.0f);
                z0VarD = q.d(h4.d.a.f81524b, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarF, o0VarE);
                if (cVar3 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                u uVar = u.f22885a;
                h2.u.a(bVarB, uVar.c(aVar3, h4.d.a.f81525c), null, null, 0, 0.0f, null, null, false, null, null, null, null, z3.f.c(-2062814391, new ul.a(cVar, 9, cVar2, uVar), o0VarE), o0VarE, 0, 24576, 16380);
                r rVarC3 = uVar.c(aVar3, h4.d.a.f81526d);
                bVar.getClass();
                r rVarY = l.y(rVarC3, f15);
                bVar.getClass();
                r rVarQ = x2.q(rVarY, j92.b.f97901d.f97904c);
                if ((i27 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objQ = o0VarE.q();
                if (z14) {
                    objQ = new ya0.l(aVar, 26);
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new ya0.l(aVar, 26);
                        o0VarE.K(objQ);
                    }
                }
                d.f199167a.getClass();
                h7.a((e23.a) objQ, rVarQ, false, null, null, d.f199168b, o0VarE, 1572864, 60);
                bVar.getClass();
                l02.k.b(uVar.c(l.y(aVar3, f15), h4.d.a.f81531i), bVarB, i24, 0, 0L, 0L, 0.0f, 0.0f, 0.0f, 0.0f, null, null, o0VarE, (i27 << 6) & 896);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                o0VarE.g0(true);
                i19 = i24;
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var2 = b0.f22601a;
            r rVarF2 = x2.f(aVar3, 1.0f);
            z0VarD = q.d(h4.d.a.f81524b, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarF2, o0VarE);
            if (cVar3 != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            u uVar2 = u.f22885a;
            h2.u.a(bVarB, uVar2.c(aVar3, h4.d.a.f81525c), null, null, 0, 0.0f, null, null, false, null, null, null, null, z3.f.c(-2062814391, new ul.a(cVar, 9, cVar2, uVar2), o0VarE), o0VarE, 0, 24576, 16380);
            r rVarC4 = uVar2.c(aVar3, h4.d.a.f81526d);
            bVar.getClass();
            r rVarY2 = l.y(rVarC4, f15);
            bVar.getClass();
            r rVarQ2 = x2.q(rVarY2, j92.b.f97901d.f97904c);
            if ((i27 & 7168) == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            objQ = o0VarE.q();
            if (z14) {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ya0.l(aVar, 26);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new ya0.l(aVar, 26);
                o0VarE.K(objQ);
            }
            d.f199167a.getClass();
            h7.a((e23.a) objQ, rVarQ2, false, null, null, d.f199168b, o0VarE, 1572864, 60);
            bVar.getClass();
            l02.k.b(uVar2.c(l.y(aVar3, f15), h4.d.a.f81531i), bVarB, i24, 0, 0L, 0L, 0.0f, 0.0f, 0.0f, 0.0f, null, null, o0VarE, (i27 << 6) & 896);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            o0VarE.g0(true);
            i19 = i24;
        } else {
            o0VarE.e();
            i19 = i17;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b2(i19, cVar, cVar2, aVar, i15, i16);
        }
    }

    public static final void b(int i14, int i15, int i16, r rVar, m mVar) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-1672787357);
        int i17 = i16 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.k(i15) ? 256 : 128);
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            float f15 = eVar.f97918c;
            g6.f.a aVar = g6.f.f75994b;
            r rVarJ = x2.j(l.y(rVar, f14), 130, 0.0f, 2);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarJ, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, i14);
            r.a aVar3 = r.S;
            r rVarF = x2.f(aVar3, 1.0f);
            bVar.getClass();
            bVar.getClass();
            bVar.getClass();
            bVar.getClass();
            r rVarJ2 = x2.j(l.B(rVarF, f15, f15, eVar.f97921f, f15), 0.0f, 35, 1);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            g02.c.a(strQ, rVarJ2, 0L, null, 0, false, 1, d92.c.e(d92.c.b(j92.f.f97930g, o0VarE)), 0.0d, o0VarE, 1572864, 316);
            String strQ2 = gl1.y.Q(o0VarE, i15);
            r rVarF2 = x2.f(aVar3, 1.0f);
            bVar.getClass();
            r rVarA = l.A(rVarF2, f15, 0.0f, 2);
            bVar.getClass();
            r rVarC2 = l.C(rVarA, 0.0f, 0.0f, 0.0f, eVar.f97921f, 7);
            fVar.getClass();
            g02.c.a(strQ2, rVarC2, 0L, null, 0, false, 3, d92.c.b(j92.f.f97931h, o0VarE), 0.0d, o0VarE, 1572864, 316);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h0(rVar, i14, i15, i16);
        }
    }
}
