package i3;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f90508a;

        static {
            int[] iArr = new int[pc.values().length];
            try {
                iArr[pc.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pc.PartiallyExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pc.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f90508a = iArr;
        }
    }

    public static final void a(final z3.e eVar, h4.r rVar, final a1 a1Var, final float f14, float f15, final o4.r1 r1Var, long j8, long j14, float f16, float f17, e23.p pVar, boolean z14, e23.q qVar, long j15, long j16, final z3.e eVar2, p3.m mVar, final int i14, final int i15, final int i16) {
        h4.r rVar2;
        int i17;
        e23.p pVar2;
        int i18;
        int i19;
        int i24;
        final long j17;
        final float f18;
        final float f19;
        final boolean z15;
        final long j18;
        long j19;
        long j24;
        final e23.p pVar3;
        final float f22;
        final e23.q qVar2;
        h4.r rVar3;
        e23.p pVar4;
        e23.q qVar3;
        long j25;
        long j26;
        e23.p pVar5;
        boolean z16;
        e23.q qVar4;
        float f24;
        long jB;
        float f25;
        float f26;
        boolean z17;
        p3.o0 o0VarE = mVar.E(920075480);
        int i25 = i16 & 2;
        if (i25 != 0) {
            i17 = i14 | 48;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i17 = (o0VarE.B(rVar2) ? 32 : 16) | i14;
        }
        if ((i14 & 384) == 0) {
            i17 |= o0VarE.B(a1Var) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i17 |= o0VarE.i(f14) ? 2048 : 1024;
        }
        long jE = j8;
        int i26 = i17 | 24576 | (o0VarE.B(r1Var) ? 131072 : 65536) | (((i16 & 64) == 0 && o0VarE.l(jE)) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if ((i14 & 12582912) == 0) {
            i26 |= ((i16 & 128) == 0 && o0VarE.l(j14)) ? 8388608 : 4194304;
        }
        int i27 = i26 | 905969664;
        int i28 = i16 & 1024;
        if (i28 != 0) {
            pVar2 = pVar;
            i19 = i15 | 6;
            i18 = 65536;
        } else {
            pVar2 = pVar;
            if ((i15 & 6) == 0) {
                i18 = 65536;
                i19 = i15 | (o0VarE.r(pVar2) ? 4 : 2);
            } else {
                i18 = 65536;
                i19 = i15;
            }
        }
        int i29 = i16 & 2048;
        if (i29 != 0) {
            i19 |= 48;
        } else if ((i15 & 48) == 0) {
            i19 |= o0VarE.h(z14) ? 32 : 16;
        }
        int i30 = i19;
        int i34 = i30 | 384;
        int i35 = i16 & 8192;
        if (i35 != 0) {
            i24 = i30 | 3456;
        } else if ((i15 & 3072) == 0) {
            i24 = i34 | (o0VarE.r(qVar) ? 2048 : 1024);
        } else {
            i24 = i34;
        }
        if (o0VarE.n(i27 & 1, ((i27 & 306783379) == 306783378 && (((i24 | (((i16 & 16384) != 0 || !o0VarE.l(j15)) ? 8192 : 16384)) | i18) & 599187) == 599186) ? false : true)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                rVar3 = i25 != 0 ? h4.r.S : rVar2;
                f0 f0Var = f0.f88041a;
                f0Var.getClass();
                float f27 = f0.f88043c;
                if ((i16 & 64) != 0) {
                    f0Var.getClass();
                    p3.x1 x1Var = p3.n.f135158a;
                    n3.w0.f123292a.getClass();
                    jE = k2.e(n3.w0.f123293b, o0VarE);
                }
                long jB2 = (i16 & 128) != 0 ? k2.b(jE, o0VarE) : j14;
                float f28 = 0;
                g6.f.a aVar = g6.f.f75994b;
                f0Var.getClass();
                float f29 = f0.f88042b;
                if (i28 != 0) {
                    m2.f88937a.getClass();
                    pVar4 = m2.f88938b;
                } else {
                    pVar4 = pVar2;
                }
                boolean z18 = i29 != 0 ? true : z14;
                if (i35 != 0) {
                    m2.f88937a.getClass();
                    qVar3 = m2.f88939c;
                } else {
                    qVar3 = qVar;
                }
                if ((i16 & 16384) != 0) {
                    s7.f89624a.getClass();
                    j25 = s7.a(o0VarE).f88501p;
                } else {
                    j25 = j15;
                }
                j26 = jB2;
                j24 = jE;
                pVar5 = pVar4;
                z16 = z18;
                qVar4 = qVar3;
                f24 = f27;
                jB = k2.b(j25, o0VarE);
                f25 = f29;
                f26 = f28;
                z17 = false;
            } else {
                o0VarE.e();
                j26 = j14;
                f26 = f16;
                f25 = f17;
                z16 = z14;
                qVar4 = qVar;
                z17 = false;
                j24 = jE;
                rVar3 = rVar2;
                pVar5 = pVar2;
                f24 = f15;
                j25 = j15;
                jB = j16;
            }
            o0VarE.h0();
            p3.x1 x1Var2 = p3.n.f135158a;
            h4.r rVarE = u1.n.e(c2.x2.d(rVar3, 1.0f), j25, o4.m1.f128891a);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, z17);
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            h4.r rVar4 = rVar3;
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
            p3.b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            p3.b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            p3.v.a(s2.f89590a.c(o4.d0.a(jB)), z3.f.c(999829022, new n0(a1Var, null, eVar2, f14, f24, z16, r1Var, j24, j26, f26, f25, pVar5, eVar, qVar4), o0VarE), o0VarE, 56);
            o0VarE.g0(true);
            j19 = jB;
            z15 = z16;
            j17 = j26;
            f18 = f26;
            f19 = f25;
            pVar3 = pVar5;
            rVar2 = rVar4;
            j18 = j25;
            f22 = f24;
            qVar2 = qVar4;
        } else {
            o0VarE.e();
            j17 = j14;
            f18 = f16;
            f19 = f17;
            z15 = z14;
            j18 = j15;
            j19 = j16;
            j24 = jE;
            pVar3 = pVar2;
            f22 = f15;
            qVar2 = qVar;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final h4.r rVar5 = rVar2;
            final long j27 = j24;
            final long j28 = j19;
            p2VarI0.f135219d = new e23.p() { // from class: i3.g0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i14 | 1);
                    int iT2 = p3.p0.t(i15);
                    z0.a(eVar, rVar5, a1Var, f14, f22, r1Var, j27, j17, f18, f19, pVar3, z15, qVar2, j18, j28, eVar2, (p3.m) obj, iT, iT2, i16);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a8  */
    public static final void b(e23.p pVar, z3.e eVar, z3.e eVar2, z3.e eVar3, e23.a aVar, mc mcVar, p3.m mVar, int i14) {
        e23.p pVar2;
        p3.o0 o0VarE = mVar.E(-1217723575);
        int i15 = i14 | (o0VarE.r(pVar) ? 4 : 2) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.B(mcVar) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (pVar == null) {
                m2.f88937a.getClass();
                pVar2 = m2.f88940d;
            } else {
                pVar2 = pVar;
            }
            List listK = p13.x.k(pVar2, eVar, eVar2, eVar3);
            boolean z14 = ((i15 & 57344) == 16384) | ((458752 & i15) == 131072);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z14) {
                objQ = new p0(mcVar, aVar);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new p0(mcVar, aVar);
                    o0VarE.K(objQ);
                }
            }
            f5.e1 e1Var = (f5.e1) objQ;
            h4.r.a aVar3 = h4.r.S;
            z3.e eVarB = f5.k0.b(listK);
            boolean zB = o0VarE.B(e1Var);
            Object objQ2 = o0VarE.q();
            if (zB) {
                objQ2 = new f5.f1(e1Var);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new f5.f1(e1Var);
                    o0VarE.K(objQ2);
                }
            }
            f5.z0 z0Var = (f5.z0) objQ2;
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar3, o0VarE);
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
            p3.b4.c(h5.g.a.f81810g, z0Var, o0VarE);
            p3.b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b71.i.n(0, eVarB, o0VarE, true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hl1.j(pVar, eVar, eVar2, eVar3, aVar, mcVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00fb  */
    public static final void c(final mc mcVar, final float f14, final float f15, final boolean z14, final o4.r1 r1Var, final long j8, final long j14, final float f16, final float f17, final e23.p pVar, final e23.q qVar, p3.m mVar, final int i14) {
        p3.o0 o0Var;
        boolean z15;
        h4.r rVarA;
        p3.o0 o0VarE = mVar.E(-2108849428);
        int i15 = i14 | (o0VarE.B(mcVar) ? 4 : 2) | (o0VarE.i(f14) ? 32 : 16) | (o0VarE.i(f15) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.B(r1Var) ? 16384 : 8192) | (o0VarE.l(j8) ? 131072 : 65536) | (o0VarE.l(j14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.i(f16) ? 8388608 : 4194304) | (o0VarE.i(f17) ? 67108864 : 33554432) | (o0VarE.r(pVar) ? 536870912 : 268435456);
        if (o0VarE.n(i15 & 1, ((i15 & 306783379) == 306783378 && ((o0VarE.r(qVar) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            p3.x1 x1Var = p3.n.f135158a;
            n3.h0 h0Var = n3.h0.DefaultSpatial;
            s1.f0 f0VarB = k9.b(h0Var, o0VarE);
            s1.f0 f0VarB2 = k9.b(h0Var, o0VarE);
            s1.f0 f0VarB3 = k9.b(n3.h0.FastEffects, o0VarE);
            int i16 = i15 & 14;
            boolean zR = (i16 == 4) | o0VarE.r(f0VarB2) | o0VarE.r(f0VarB3) | o0VarE.r(f0VarB);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                z15 = false;
                objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 0);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    z15 = false;
                    objQ = new h0(mcVar, f0VarB2, f0VarB3, f0VarB, 0);
                    o0VarE.K(objQ);
                } else {
                    z15 = false;
                }
            }
            p3.l0.i((e23.a) objQ, o0VarE);
            Object objQ2 = o0VarE.q();
            aVar.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            o53.b0 b0Var = (o53.b0) objQ2;
            p008y1.b2 b2Var = p008y1.b2.Vertical;
            float fS0 = ((g6.c) o0VarE.A(kotlin.t1.f91490h)).s0(f14);
            if (z14) {
                o0VarE.C(2049456610);
                h4.r.a aVar2 = h4.r.S;
                boolean zB = o0VarE.B(mcVar.f88996e);
                Object objQ3 = o0VarE.q();
                if (zB || objQ3 == c2565a) {
                    cn1.u uVar = new cn1.u(b0Var, mcVar, 1);
                    float f18 = kc.f88702a;
                    hc hcVar = new hc(mcVar, uVar, b2Var);
                    o0VarE.K(hcVar);
                    objQ3 = hcVar;
                }
                rVarA = a5.f.a(aVar2, (a5.a) objQ3, null);
                o0VarE.g0(false);
            } else {
                o0VarE.C(2049851798);
                o0VarE.g0(z15);
                rVarA = h4.r.S;
            }
            int i17 = 1;
            h4.r rVarThen = c2.x2.l(c2.x2.f(c2.x2.w(h4.r.S, 0.0f, f15, 1), 1.0f), f14).then(rVarA);
            l3.m<pc> mVar2 = mcVar.f88996e;
            boolean zI = (i16 == 4) | o0VarE.i(fS0);
            Object objQ4 = o0VarE.q();
            if (zI || objQ4 == c2565a) {
                objQ4 = new d70.f(mcVar, fS0, 2);
                o0VarE.K(objQ4);
            }
            h4.r rVarE = l3.k.e(rVarThen, mVar2, b2Var, (e23.p) objQ4);
            l3.m<pc> mVar3 = mcVar.f88996e;
            int i18 = i15 >> 9;
            ve.a(o4.s0.a(p008y1.a1.a(rVarE, mVar3.f109324f, b2Var, z14, null, mVar3.f(), null, new l3.g(mVar3, null), false, 32), new j0(mcVar, i17)), r1Var, j8, j14, f16, f17, null, z3.f.c(1508311921, new x0(mcVar, pVar, qVar, b0Var, z14), o0VarE), o0VarE, (i18 & 112) | 12582912 | (i18 & 896) | (i18 & 7168) | (57344 & i18) | (i18 & 458752), 64);
            o0Var = o0VarE;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(f14, f15, z14, r1Var, j8, j14, f16, f17, pVar, qVar, i14) { // from class: i3.i0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ float f88381b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ float f88382c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f88383d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ o4.r1 f88384e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f88385f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ long f88386g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ float f88387h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ float f88388i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ e23.p f88389j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ e23.q f88390k;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(1);
                    z0.c(this.f88380a, this.f88381b, this.f88382c, this.f88383d, this.f88384e, this.f88385f, this.f88386g, this.f88387h, this.f88388i, this.f88389j, this.f88390k, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    public static final a1 d(mc mcVar, fe feVar, p3.m mVar, int i14, int i15) {
        if ((i15 & 1) != 0) {
            mcVar = e(null, mVar, 0, 7);
        }
        int i16 = i15 & 2;
        p3.m.a aVar = p3.m.f135153a;
        if (i16 != 0) {
            Object objQ = mVar.q();
            aVar.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new fe();
                mVar.K(objQ);
            }
            feVar = (fe) objQ;
        }
        p3.x1 x1Var = p3.n.f135158a;
        boolean z14 = ((((i14 & 14) ^ 6) > 4 && mVar.B(mcVar)) || (i14 & 6) == 4) | ((((i14 & 112) ^ 48) > 32 && mVar.B(feVar)) || (i14 & 48) == 32);
        Object objQ2 = mVar.q();
        if (z14) {
            objQ2 = new a1(mcVar, feVar);
            mVar.K(objQ2);
        } else {
            aVar.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new a1(mcVar, feVar);
                mVar.K(objQ2);
            }
        }
        return (a1) objQ2;
    }

    public static final mc e(pc pcVar, p3.m mVar, int i14, int i15) {
        if ((i15 & 1) != 0) {
            pcVar = pc.PartiallyExpanded;
        }
        pc pcVar2 = pcVar;
        Object objQ = mVar.q();
        p3.m.f135153a.getClass();
        int i16 = 3;
        if (objQ == p3.m.a.f135155b) {
            objQ = new i11.f(i16);
            mVar.K(objQ);
        }
        e23.l lVar = (e23.l) objQ;
        boolean z14 = (i15 & 4) != 0;
        p3.x1 x1Var = p3.n.f135158a;
        return kc.b(false, lVar, pcVar2, z14, mVar, ((i14 << 6) & 896) | ((i14 << 3) & 7168), 49);
    }
}
