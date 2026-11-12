package w52;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import p3.b4;
import p3.i2;
import p3.p2;
import v62.s6;
import v62.s8;

/* JADX INFO: loaded from: classes9.dex */
public final class r0 {
    /* JADX WARN: Code duplicated, block: B:37:0x007c  */
    public static final void a(int i14, e23.a aVar, h4.r rVar, p3.m mVar, boolean z14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-2018266616);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.f0.a aVar2 = l72.f0.a.f111000a;
            s62.a.f157643a.getClass();
            u4.d dVarA = s6.a(t62.b.f162798a);
            String strQ = gl1.y.Q(o0VarE, R.string.workout_lbl_add_step);
            boolean z15 = (i15 & 896) == 256;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new w51.j(aVar, 6);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new w51.j(aVar, 6);
                    o0VarE.K(objQ);
                }
            }
            aVar2.c((i15 << 6) & 8064, 0, (e23.a) objQ, rVar, strQ, o0VarE, dVarA, z14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.h(rVar, z14, aVar, i14, 2, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    public static final void b(h4.r rVar, String str, boolean z14, e23.a aVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(342968317);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            boolean z15 = false;
            l72.f0.a aVar2 = l72.f0.a.f111000a;
            s62.a.f157643a.getClass();
            u4.d dVarA = s8.a(t62.b.f162798a);
            if ((i15 & 7168) == 2048) {
                z15 = true;
            }
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new w51.j(aVar, 5);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new w51.j(aVar, 5);
                    o0VarE.K(objQ);
                }
            }
            aVar2.c((i15 & 112) | ((i15 << 6) & 896) | ((i15 << 3) & 7168), 0, (e23.a) objQ, rVar, str, o0VarE, dVarA, z14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.i(rVar, str, z14, aVar, i14, 22);
        }
    }

    public static final void c(int i14, e23.a aVar, e23.a aVar2, String str, p3.m mVar, boolean z14, boolean z15) {
        aVar.getClass();
        str.getClass();
        aVar2.getClass();
        p3.o0 o0VarE = mVar.E(180582132);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.h(z15) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarS = c2.l.s(x2.f(aVar3, 1.0f));
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = c2.l.A(rVarS, eVar.f97920e, 0.0f, 2);
            bVar.getClass();
            float f14 = eVar.f97918c;
            bVar.getClass();
            h4.r rVarC = c2.l.C(rVarA, 0.0f, f14, 0.0f, eVar.f97921f, 5);
            if (((g6.c) o0VarE.A(kotlin.t1.f91490h)).getF75992b() <= 1.5f) {
                o0VarE.C(-1871248369);
                c2.j.f22691a.getClass();
                c2.j.C0343j c0343j = c2.j.f22692b;
                h4.d.f81522a.getClass();
                s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
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
                b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                u2 u2Var = u2.f22900a;
                h4.r rVarA2 = u2Var.a(aVar3, 0.5f, true);
                bVar.getClass();
                a((i15 << 3) & 1008, aVar, c2.l.C(rVarA2, 0.0f, 0.0f, eVar.f97918c, 0.0f, 11), o0VarE, z14);
                h4.r rVarA3 = u2Var.a(aVar3, 0.5f, true);
                bVar.getClass();
                b(c2.l.C(rVarA3, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14), str, z15, aVar2, o0VarE, (i15 >> 3) & 8176);
                o0VarE.g0(true);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1870611474);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC3 = h4.k.c(rVarC, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar5 = h5.g.a.f81805b;
                if (cVar == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                h5.g.a.b bVar3 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                }
                b4.c(h5.g.a.f81807d, rVarC3, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                int i16 = i15 << 3;
                a((i16 & 896) | (i16 & 112) | 6, aVar, x2.f(aVar3, 1.0f), o0VarE, z14);
                bVar.getClass();
                c2.l.f(x2.h(aVar3, eVar.f97920e), o0VarE);
                int i17 = i15 >> 3;
                b(x2.f(aVar3, 1.0f), str, z15, aVar2, o0VarE, (i17 & 112) | 6 | (i17 & 896) | (i17 & 7168));
                o0VarE.g0(true);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ew1.u1(i14, aVar, aVar2, str, z14, z15);
        }
    }
}
