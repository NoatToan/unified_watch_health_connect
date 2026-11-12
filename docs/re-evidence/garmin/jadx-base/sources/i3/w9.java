package i3;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.firebase.messaging.Constants;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class w9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f90108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f90109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f90110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f90111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f90112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f90113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f90114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p3.j0 f90115h;

    static {
        n3.j0.f122993a.getClass();
        f90108a = n3.j0.f123000h;
        g6.f.a aVar = g6.f.f75994b;
        f90109b = 8;
        f90110c = 4;
        n3.k0.f123054a.getClass();
        float f14 = n3.k0.f123056c;
        float f15 = n3.k0.f123057d;
        float f16 = 2;
        f90111d = (f14 - f15) / f16;
        f90112e = (n3.k0.f123055b - f15) / f16;
        f90113f = 12;
        f90114g = 44;
        f90115h = p3.v.c(new i01.j(22));
    }

    public static final void a(final h4.r rVar, final long j8, long j14, float f14, c2.k3 k3Var, final z3.e eVar, p3.m mVar, final int i14) {
        final long j15;
        final float f15;
        final c2.k3 k3VarA;
        p3.o0 o0VarE = mVar.E(1054099326);
        int i15 = i14 | (o0VarE.l(j8) ? 32 : 16) | 11392;
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                s7.f89624a.getClass();
                long jA = k2.a(s7.a(o0VarE), j8);
                l9 l9Var = l9.f88870a;
                l9Var.getClass();
                float f16 = l9.f88871b;
                l9Var.getClass();
                k3VarA = l9.a(o0VarE);
                f15 = f16;
                j15 = jA;
            } else {
                o0VarE.e();
                j15 = j14;
                f15 = f14;
                k3VarA = k3Var;
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            ((x9) o0VarE.A(f90115h)).a(new y9(rVar, j8, j15, f15, k3VarA, eVar, null), o0VarE, 0);
        } else {
            o0VarE.e();
            j15 = j14;
            f15 = f14;
            k3VarA = k3Var;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(j8, j15, f15, k3VarA, eVar, i14) { // from class: i3.q9

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f89422b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f89423c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ float f89424d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ c2.k3 f89425e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ z3.e f89426f;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(196615);
                    w9.a(this.f89421a, this.f89422b, this.f89423c, this.f89424d, this.f89425e, this.f89426f, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void b(c2.t2 t2Var, e23.a aVar, z3.e eVar, h4.r rVar, boolean z14, e23.p pVar, boolean z15, m9 m9Var, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        h4.r rVar2;
        boolean z16;
        boolean z17;
        m9 m9Var2;
        int i16;
        h4.r rVar3;
        m9 m9Var3;
        boolean z18;
        boolean z19;
        m9 m9Var4;
        z3.e eVar2;
        p3.o0 o0VarE = mVar.E(974293026);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(false) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(eVar) ? 2048 : 1024;
        }
        int i17 = i15 | 221184;
        if ((1572864 & i14) == 0) {
            i17 |= o0VarE.r(pVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i18 = 12582912 | i17;
        if ((100663296 & i14) == 0) {
            i18 = 46137344 | i17;
        }
        int i19 = 805306368 | i18;
        if (o0VarE.n(i19 & 1, (306783379 & i19) != 306783378)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                h4.r.a aVar2 = h4.r.S;
                n9.f89070a.getClass();
                p3.x1 x1Var = p3.n.f135158a;
                s7.f89624a.getClass();
                j2 j2VarA = s7.a(o0VarE);
                m9 m9Var5 = j2VarA.f88488i0;
                if (m9Var5 == null) {
                    n3.j0.f122993a.getClass();
                    long jD = k2.d(j2VarA, n3.j0.f122994b);
                    long jD2 = k2.d(j2VarA, n3.j0.f122997e);
                    long jD3 = k2.d(j2VarA, n3.j0.f122995c);
                    n3.m mVar2 = n3.j0.f122998f;
                    long jD4 = k2.d(j2VarA, mVar2);
                    n3.m mVar3 = n3.j0.f122999g;
                    m9 m9Var6 = new m9(jD, jD2, jD3, jD4, k2.d(j2VarA, mVar3), o4.d0.c(0.38f, k2.d(j2VarA, mVar2), 14), o4.d0.c(0.38f, k2.d(j2VarA, mVar3), 14), null);
                    j2VarA.f88488i0 = m9Var6;
                    m9Var5 = m9Var6;
                }
                i16 = i19 & (-234881025);
                rVar3 = aVar2;
                m9Var3 = m9Var5;
                z18 = true;
                z19 = true;
            } else {
                o0VarE.e();
                i16 = i19 & (-234881025);
                rVar3 = rVar;
                z18 = z14;
                z19 = z15;
                m9Var3 = m9Var;
            }
            int i24 = i16;
            o0VarE.h0();
            p3.x1 x1Var2 = p3.n.f135158a;
            p3.m.a aVar3 = p3.m.f135153a;
            Object objH = r1.q2.h(o0VarE, -224963495, aVar3);
            Object obj = p3.m.a.f135155b;
            if (objH == obj) {
                objH = kg.f.b(o0VarE);
            }
            a2.j jVar = (a2.j) objH;
            o0VarE.g0(false);
            n3.h0 h0Var = n3.h0.DefaultEffects;
            s1.f0 f0VarB = k9.b(h0Var, o0VarE);
            boolean z24 = z19;
            z3.e eVarC = z3.f.c(-876637252, new t9(m9Var3, false, z18, f0VarB, pVar, z19, eVar), o0VarE);
            if (pVar == null) {
                o0VarE.C(-224036658);
                o0VarE.g0(false);
                m9Var4 = m9Var3;
                eVar2 = null;
            } else {
                o0VarE.C(-224036657);
                m9Var4 = m9Var3;
                z3.e eVarC2 = z3.f.c(802208206, new u9(m9Var3, false, z18, f0VarB, pVar), o0VarE);
                o0VarE.g0(false);
                eVar2 = eVarC2;
            }
            Object objQ = o0VarE.q();
            aVar3.getClass();
            if (objQ == obj) {
                objQ = e5.o(0, o0VarE);
            }
            p3.n1 n1Var = (p3.n1) objQ;
            p5.l.f136032b.getClass();
            h4.r rVar4 = rVar3;
            boolean z25 = z18;
            h4.r rVarA = t2Var.a(c2.x2.b(j2.b.a(rVar4, false, jVar, null, z25, p5.l.a(p5.l.f136036f), aVar), 0.0f, f90108a, 1), 1.0f, true);
            Object objQ2 = o0VarE.q();
            if (objQ2 == obj) {
                objQ2 = new a11.h0(n1Var, 18);
                o0VarE.K(objQ2);
            }
            h4.r rVarG = f5.g0.g(rVarA, (e23.l) objQ2);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81528f, true);
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarG, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            p3.b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            p3.b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            p3.x3 x3VarB = s1.f.b(0.0f, k9.b(h0Var, o0VarE), null, o0VarE, 0, 28);
            p3.x3 x3VarB2 = s1.f.b(0.0f, k9.b(n3.h0.FastSpatial, o0VarE), null, o0VarE, 0, 28);
            g6.c cVar = (g6.c) o0VarE.A(kotlin.t1.f91490h);
            n3.k0.f123054a.getClass();
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(cVar.s0(f90113f))) & 4294967295L) | (((long) Float.floatToRawIntBits((n1Var.getIntValue() - cVar.f0(n3.k0.f123056c)) / 2)) << 32);
            Unit unit = Unit.INSTANCE;
            boolean zB = o0VarE.B(jVar) | o0VarE.l(jFloatToRawIntBits);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == obj) {
                objQ3 = new l3.f1(jVar, jFloatToRawIntBits, null);
                o0VarE.K(objQ3);
            }
            z3.e eVarC3 = z3.f.c(-2082182507, new s9((l3.f1) objQ3), o0VarE);
            z3.e eVarC4 = z3.f.c(-799524251, new r9(x3VarB, m9Var4), o0VarE);
            boolean zB2 = o0VarE.B(x3VarB);
            Object objQ4 = o0VarE.q();
            if (zB2 || objQ4 == obj) {
                objQ4 = new by1.h(x3VarB, 2);
                o0VarE.K(objQ4);
            }
            e23.a aVar5 = (e23.a) objQ4;
            boolean zB3 = o0VarE.B(x3VarB2);
            Object objQ5 = o0VarE.q();
            if (zB3 || objQ5 == obj) {
                objQ5 = new by1.h(x3VarB2, 3);
                o0VarE.K(objQ5);
            }
            z17 = z24;
            c(eVarC3, eVarC4, eVarC, eVar2, z17, aVar5, (e23.a) objQ5, o0VarE, ((i24 >> 9) & 57344) | 438);
            o0Var = o0VarE;
            o0Var.g0(true);
            m9Var2 = m9Var4;
            rVar2 = rVar4;
            z16 = z25;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
            z16 = z14;
            z17 = z15;
            m9Var2 = m9Var;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq.i(t2Var, aVar, eVar, rVar2, z16, pVar, z17, m9Var2, i14, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00df  */
    public static final void c(z3.e eVar, z3.e eVar2, z3.e eVar3, e23.p pVar, boolean z14, e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        int i15;
        boolean z15;
        e23.p pVar2 = pVar;
        p3.o0 o0VarE = mVar.E(-1019541078);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(eVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(eVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(eVar3) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(pVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.h(z14) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(aVar2) ? 1048576 : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            f5.s sVar = z.f90506a;
            h4.r rVarD = f5.g0.d(aVar3, new h81.a(22));
            int i16 = 57344 & i15;
            boolean z16 = ((i15 & 7168) == 2048) | ((3670016 & i15) == 1048576) | (i16 == 16384);
            Object objQ = o0VarE.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (z16) {
                objQ = new v9(aVar2, pVar2, z14);
                o0VarE.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new v9(aVar2, pVar2, z14);
                    o0VarE.K(objQ);
                }
            }
            f5.z0 z0Var = (f5.z0) objQ;
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
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
            h5.g.a.e eVar4 = h5.g.a.f81810g;
            p3.b4.c(eVar4, z0Var, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            p3.b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            int i17 = i15;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            p3.b4.c(fVar, rVarC, o0VarE);
            eVar.invoke(o0VarE, Integer.valueOf(i17 & 14));
            eVar2.invoke(o0VarE, Integer.valueOf((i17 >> 3) & 14));
            h4.r rVarE = f5.g0.e(aVar3, "icon");
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81524b;
            f5.z0 z0VarD = c2.q.d(gVar, false);
            int iP2 = o0VarE.P();
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarE, o0VarE);
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
            p3.b4.c(eVar4, z0VarD, o0VarE);
            p3.b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP2))) {
                v.h.A(iP2, o0VarE, iP2, bVar);
            }
            p3.b4.c(fVar, rVarC2, o0VarE);
            c2.u uVar = c2.u.f22885a;
            b71.i.n((i17 >> 6) & 14, eVar3, o0VarE, true);
            if (pVar != null) {
                o0VarE.C(-660471321);
                h4.r rVarE2 = f5.g0.e(aVar3, Constants.ScionAnalytics.PARAM_LABEL);
                boolean z17 = (i16 == 16384) | ((i17 & 458752) == 131072);
                Object objQ2 = o0VarE.q();
                if (z17) {
                    objQ2 = new as2.d(z14, aVar, 9);
                    o0VarE.K(objQ2);
                } else {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new as2.d(z14, aVar, 9);
                        o0VarE.K(objQ2);
                    }
                }
                h4.r rVarA = o4.s0.a(rVarE2, (e23.l) objQ2);
                f5.z0 z0VarD2 = c2.q.d(gVar, false);
                int iP3 = o0VarE.P();
                p3.i2 i2VarA2 = o0VarE.a0();
                h4.r rVarC3 = h4.k.c(rVarA, o0VarE);
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
                p3.b4.c(eVar4, z0VarD2, o0VarE);
                p3.b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP3))) {
                    v.h.A(iP3, o0VarE, iP3, bVar);
                }
                p3.b4.c(fVar, rVarC3, o0VarE);
                pVar2 = pVar;
                z15 = true;
                e5.r((i17 >> 9) & 14, pVar2, o0VarE, true, false);
            } else {
                pVar2 = pVar;
                z15 = true;
                o0VarE.C(-660200319);
                o0VarE.g0(false);
            }
            o0VarE.g0(z15);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b21.n9(eVar, eVar2, eVar3, pVar2, z14, aVar, aVar2, i14);
        }
    }
}
