package y01;

import c2.q2;
import c2.s2;
import c2.t0;
import c2.u2;
import c2.x2;
import g21.f0;
import h5.e0;
import i3.mh;
import l72.v2;
import o4.m1;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class m {
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public static final void a(h4.r rVar, v21.e eVar, f0 f0Var, x0 x0Var, g21.u uVar, p3.m mVar, int i14, int i15) {
        h4.r rVar2;
        int i16;
        g21.u uVar2;
        boolean z14;
        g21.u uVar3;
        p2 p2VarI0;
        h4.r rVar3;
        g21.u uVar4;
        eVar.getClass();
        f0Var.getClass();
        o0 o0VarE = mVar.E(-1784817222);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i16 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(f0Var) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.B(x0Var) ? 2048 : 1024;
        }
        int i18 = i15 & 16;
        if (i18 == 0) {
            if ((i14 & 24576) == 0) {
                uVar2 = uVar;
                i16 |= o0VarE.B(uVar2) ? 16384 : 8192;
            }
            if ((i16 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i17 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i18 != 0) {
                    uVar4 = null;
                } else {
                    uVar4 = uVar2;
                }
                x1 x1Var = p3.n.f135158a;
                c2.j jVar = c2.j.f22691a;
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f14 = eVar2.f97917b;
                jVar.getClass();
                c2.j.i iVarI = c2.j.i(f14);
                bVar.getClass();
                c2.j.i iVarI2 = c2.j.i(eVar2.f97920e);
                uVar2 = uVar4;
                h4.r rVar4 = rVar3;
                t0.a(rVar4, iVarI2, iVarI, null, 0, 0, z3.f.c(590920181, new vd0.f0(eVar, f0Var, uVar4, x0Var, 8), o0VarE), o0VarE, (i16 & 14) | 1572864, 56);
                rVar2 = rVar4;
            } else {
                o0VarE.e();
            }
            uVar3 = uVar2;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new wx1.i(rVar2, eVar, f0Var, x0Var, uVar3, i14, i15);
            }
        }
        i16 |= 24576;
        uVar2 = uVar;
        if ((i16 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i17 != 0) {
                rVar3 = h4.r.S;
            } else {
                rVar3 = rVar2;
            }
            if (i18 != 0) {
                uVar4 = null;
            } else {
                uVar4 = uVar2;
            }
            x1 x1Var2 = p3.n.f135158a;
            c2.j jVar2 = c2.j.f22691a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f15 = eVar3.f97917b;
            jVar2.getClass();
            c2.j.i iVarI3 = c2.j.i(f15);
            bVar2.getClass();
            c2.j.i iVarI4 = c2.j.i(eVar3.f97920e);
            uVar2 = uVar4;
            h4.r rVar5 = rVar3;
            t0.a(rVar5, iVarI4, iVarI3, null, 0, 0, z3.f.c(590920181, new vd0.f0(eVar, f0Var, uVar4, x0Var, 8), o0VarE), o0VarE, (i16 & 14) | 1572864, 56);
            rVar2 = rVar5;
        } else {
            o0VarE.e();
        }
        uVar3 = uVar2;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new wx1.i(rVar2, eVar, f0Var, x0Var, uVar3, i14, i15);
        }
    }

    public static final void b(h4.r rVar, String str, long j8, x0 x0Var, String str2, p3.m mVar, int i14) {
        o0 o0Var;
        h4.r rVar2;
        o0 o0VarE = mVar.E(540117289);
        int i15 = i14 | 6 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.l(j8) ? 256 : 128) | (o0VarE.B(x0Var) ? 2048 : 1024) | (o0VarE.B(str2) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            h4.r.a aVar = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            h4.r rVarThen = v2.b(aVar, str2, new u72.a(5), o0VarE, ((i15 >> 9) & 112) | 6).then(aVar);
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            float f14 = j92.b.f97899b.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(iVarI, h4.d.a.f81534l, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarThen, o0VarE);
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            bVar.getClass();
            c2.q.a(u1.n.e(l4.k.b(x2.q(aVar, j92.b.f97901d.f97902a), k2.i.f102406a), j8, m1.f128891a), o0VarE, 0);
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, (i15 >> 3) & 14, (i15 << 12) & 29360128, 131070);
            o0Var = o0VarE;
            o0Var.g0(true);
            rVar2 = aVar;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c42.e(rVar2, str, j8, x0Var, str2, i14);
        }
    }
}
