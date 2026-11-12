package i3;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f90384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c2.l2 f90385b;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f90386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c2.h2 f90387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.p<p3.m, Integer, Unit> f90388c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.p<p3.m, Integer, Unit> f90389d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.p<p3.m, Integer, Unit> f90390e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f90391f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ e23.p<p3.m, Integer, Unit> f90392g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ long f90393h;

        /* JADX WARN: Multi-variable type inference failed */
        public a(float f14, c2.h2 h2Var, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, e23.p<? super p3.m, ? super Integer, Unit> pVar3, long j8, e23.p<? super p3.m, ? super Integer, Unit> pVar4, long j14) {
            this.f90386a = f14;
            this.f90387b = h2Var;
            this.f90388c = pVar;
            this.f90389d = pVar2;
            this.f90390e = pVar3;
            this.f90391f = j8;
            this.f90392g = pVar4;
            this.f90393h = j14;
        }

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                s1.f0 f0VarB = k9.b(n3.h0.SlowEffects, mVar2);
                s1.f0 f0VarB2 = k9.b(n3.h0.FastEffects, mVar2);
                s1.f0 f0VarB3 = k9.b(n3.h0.FastSpatial, mVar2);
                s1.f0 f0VarB4 = k9.b(n3.h0.DefaultEffects, mVar2);
                h4.r.a aVar = h4.r.S;
                h4.r rVarX = c2.l.x(c2.x2.b(aVar, 0.0f, this.f90386a, 1), this.f90387b);
                Object objQ = mVar2.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new d2();
                    mVar2.K(objQ);
                }
                d2 d2Var = (d2) objQ;
                int iP = mVar2.P();
                p3.i2 i2VarX = mVar2.x();
                h4.r rVarC = h4.k.c(rVarX, mVar2);
                h5.g.V.getClass();
                h5.e0.a aVar2 = h5.g.a.f81805b;
                if (mVar2.F() == null) {
                    p3.p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar2);
                } else {
                    mVar2.c();
                }
                h5.g.a.e eVar = h5.g.a.f81810g;
                p3.b4.c(eVar, d2Var, mVar2);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                p3.b4.c(c1623g, i2VarX, mVar2);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                    v.h.z(iP, mVar2, iP, bVar);
                }
                h5.g.a.f fVar = h5.g.a.f81807d;
                p3.b4.c(fVar, rVarC, mVar2);
                h4.r rVarE = f5.g0.e(aVar, "leadingIcon");
                e23.p<p3.m, Integer, Unit> pVar = this.f90388c;
                e23.p<p3.m, Integer, Unit> pVar2 = this.f90389d;
                boolean z14 = (pVar == null && pVar2 == null) ? false : true;
                h4.d.f81522a.getClass();
                h4.g.a aVar3 = h4.d.a.f81536n;
                r1.c0.e(z14, rVarE, r1.u0.a(f0VarB3, aVar3, 12).b(r1.u0.d(f0VarB, 2)), r1.u0.h(f0VarB4, aVar3, 12).b(r1.u0.e(f0VarB2, 2)), null, z3.f.c(687705959, new w1(pVar, pVar2, this.f90391f), mVar2), mVar2, 196656, 16);
                h4.r rVarA = c2.l.A(f5.g0.e(aVar, Constants.ScionAnalytics.PARAM_LABEL), y1.f90384a, 0.0f, 2);
                c2.j.f22691a.getClass();
                c2.s2 s2VarA = c2.q2.a(c2.j.f22692b, h4.d.a.f81534l, mVar2, 54);
                int iP2 = mVar2.P();
                p3.i2 i2VarX2 = mVar2.x();
                h4.r rVarC2 = h4.k.c(rVarA, mVar2);
                if (mVar2.F() == null) {
                    p3.p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar2);
                } else {
                    mVar2.c();
                }
                p3.b4.c(eVar, s2VarA, mVar2);
                p3.b4.c(c1623g, i2VarX2, mVar2);
                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP2))) {
                    v.h.z(iP2, mVar2, iP2, bVar);
                }
                p3.b4.c(fVar, rVarC2, mVar2);
                c2.u2 u2Var = c2.u2.f22900a;
                this.f90392g.invoke(mVar2, 0);
                mVar2.y();
                h4.r rVarE2 = f5.g0.e(aVar, "trailingIcon");
                e23.p<p3.m, Integer, Unit> pVar3 = this.f90390e;
                boolean z15 = pVar3 != null;
                h4.g.a aVar4 = h4.d.a.f81538p;
                r1.c0.e(z15, rVarE2, r1.u0.a(f0VarB3, aVar4, 12).b(r1.u0.d(f0VarB, 2)), r1.u0.h(f0VarB4, aVar4, 12).b(r1.u0.e(f0VarB2, 2)), null, z3.f.c(1905252304, new x1(pVar3, this.f90393h), mVar2), mVar2, 196656, 16);
                mVar2.y();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    static {
        float f14 = 8;
        g6.f.a aVar = g6.f.f75994b;
        f90384a = f14;
        c2.l.c(f14, 0.0f, 2);
        f90385b = c2.l.c(f14, 0.0f, 2);
        c2.l.c(f14, 0.0f, 2);
    }

    public static final void a(final e23.p<? super p3.m, ? super Integer, Unit> pVar, final s5.x0 x0Var, final long j8, final e23.p<? super p3.m, ? super Integer, Unit> pVar2, final e23.p<? super p3.m, ? super Integer, Unit> pVar3, final e23.p<? super p3.m, ? super Integer, Unit> pVar4, final long j14, final long j15, final float f14, final c2.h2 h2Var, p3.m mVar, final int i14) {
        p3.o0 o0VarE = mVar.E(-2070754602);
        int i15 = i14 | (o0VarE.r(pVar) ? 4 : 2) | (o0VarE.B(x0Var) ? 32 : 16) | (o0VarE.l(j8) ? 256 : 128) | (o0VarE.r(pVar2) ? 2048 : 1024) | (o0VarE.r(pVar3) ? 16384 : 8192) | (o0VarE.r(pVar4) ? 131072 : 65536) | (o0VarE.l(j14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.l(j15) ? 8388608 : 4194304) | (o0VarE.i(f14) ? 67108864 : 33554432) | (o0VarE.B(h2Var) ? 536870912 : 268435456);
        if (o0VarE.n(i15 & 1, (306783379 & i15) != 306783378)) {
            p3.x1 x1Var = p3.n.f135158a;
            p3.v.b(new p3.n2[]{s2.f89590a.c(o4.d0.a(j8)), mh.f89022a.c(x0Var)}, z3.f.c(-668234218, new a(f14, h2Var, pVar3, pVar2, pVar4, j14, pVar, j15), o0VarE), o0VarE, 56);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(x0Var, j8, pVar2, pVar3, pVar4, j14, j15, f14, h2Var, i14) { // from class: i3.v1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s5.x0 f89973b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f89974c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ e23.p f89975d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ e23.p f89976e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ e23.p f89977f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ long f89978g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ long f89979h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ float f89980i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ c2.h2 f89981j;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(1);
                    y1.a(this.f89972a, this.f89973b, this.f89974c, this.f89975d, this.f89976e, this.f89977f, this.f89978g, this.f89979h, this.f89980i, this.f89981j, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x014f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0151  */
    /* JADX WARN: Code duplicated, block: B:108:0x0156  */
    /* JADX WARN: Code duplicated, block: B:109:0x0159  */
    /* JADX WARN: Code duplicated, block: B:112:0x015d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0161  */
    /* JADX WARN: Code duplicated, block: B:118:0x0167  */
    /* JADX WARN: Code duplicated, block: B:119:0x017c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0182  */
    /* JADX WARN: Code duplicated, block: B:123:0x0199  */
    /* JADX WARN: Code duplicated, block: B:126:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:127:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:130:0x0259  */
    /* JADX WARN: Code duplicated, block: B:133:0x0270  */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:86:0x0101  */
    /* JADX WARN: Code duplicated, block: B:89:0x010b  */
    /* JADX WARN: Code duplicated, block: B:91:0x011b  */
    public static final void b(boolean z14, e23.a aVar, z3.e eVar, h4.r rVar, boolean z15, e23.p pVar, e23.p pVar2, o4.r1 r1Var, xb xbVar, ac acVar, u1.u uVar, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        int i17;
        boolean z16;
        int i18;
        int i19;
        int i24;
        e23.p pVar3;
        int i25;
        int i26;
        int i27;
        o4.r1 r1VarC;
        xb xbVar2;
        int i28;
        int i29;
        int i30;
        boolean z17;
        e23.p pVar4;
        p3.o0 o0Var;
        h4.r rVar3;
        boolean z18;
        xb xbVar3;
        e23.p pVar5;
        ac acVar2;
        u1.u uVar2;
        o4.r1 r1Var2;
        p3.p2 p2VarI0;
        boolean z19;
        int i34;
        xb xbVarC;
        o6 o6Var;
        p3.o0 o0Var2;
        u1.u uVarA;
        u1.u uVar3;
        e23.p pVar6;
        int i35;
        o4.r1 r1Var3;
        h4.r rVar4;
        xb xbVar4;
        ac acVar3;
        e23.p pVar7;
        boolean z24;
        p3.o0 o0VarE = mVar.E(-1385473344);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i36 = i16 | (o0VarE.r(aVar) ? 32 : 16);
        int i37 = i15 & 8;
        if (i37 == 0) {
            if ((i14 & 3072) == 0) {
                rVar2 = rVar;
                i36 |= o0VarE.B(rVar2) ? 2048 : 1024;
            }
            i17 = i15 & 16;
            if (i17 != 0) {
                i19 = i36 | 24576;
                z16 = z15;
            } else {
                z16 = z15;
                if (o0VarE.h(z16)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i19 = i36 | i18;
            }
            i24 = i15 & 32;
            if (i24 != 0) {
                if ((i14 & 196608) == 0) {
                    pVar3 = pVar;
                    if (o0VarE.r(pVar3)) {
                        i25 = 131072;
                    } else {
                        i25 = 65536;
                    }
                    i19 |= i25;
                }
                i26 = i15 & 64;
                if (i26 != 0) {
                    i19 |= 1572864;
                } else if ((i14 & 1572864) == 0) {
                    if (o0VarE.r(pVar2)) {
                        i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i27 = 524288;
                    }
                    i19 |= i27;
                }
                if ((i14 & 12582912) == 0) {
                    if ((i15 & 128) == 0) {
                        r1VarC = r1Var;
                        int i38 = o0VarE.B(r1VarC) ? 8388608 : 4194304;
                        i19 |= i38;
                    } else {
                        r1VarC = r1Var;
                    }
                    i19 |= i38;
                } else {
                    r1VarC = r1Var;
                }
                if ((i15 & 256) == 0) {
                    xbVar2 = xbVar;
                    int i39 = o0VarE.B(xbVar2) ? 67108864 : 33554432;
                    i28 = i19 | i39 | 268435456;
                    i29 = 48;
                    i30 = (((i15 & 1024) == 0 || !o0VarE.B(uVar)) ? 2 : 4) | 48;
                    if ((i28 & 306783379) == 306783378 || (i30 & 19) != 18) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (o0VarE.n(i28 & 1, z17)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0 || o0VarE.o0()) {
                            if (i37 != 0) {
                                rVar2 = h4.r.S;
                            }
                            if (i17 != 0) {
                                z19 = true;
                            } else {
                                z19 = z16;
                            }
                            if (i24 != 0) {
                                pVar3 = null;
                            }
                            e23.p pVar8 = i26 == 0 ? pVar2 : null;
                            if ((i15 & 128) != 0) {
                                o6.f89151a.getClass();
                                p3.x1 x1Var = p3.n.f135158a;
                                n3.d0.f122764a.getClass();
                                r1VarC = fc.c(n3.d0.f122766c, o0VarE);
                                i34 = i28 & (-29360129);
                            } else {
                                i34 = i28;
                            }
                            if ((i15 & 256) != 0) {
                                o6.f89151a.getClass();
                                p3.x1 x1Var2 = p3.n.f135158a;
                                s7.f89624a.getClass();
                                xbVarC = o6.c(s7.a(o0VarE));
                                i34 &= -234881025;
                            } else {
                                xbVarC = xbVar2;
                            }
                            o6Var = o6.f89151a;
                            o6Var.getClass();
                            n3.d0.f122764a.getClass();
                            float f14 = n3.d0.f122770g;
                            float f15 = n3.d0.f122779p;
                            float f16 = n3.d0.f122776m;
                            float f17 = n3.d0.f122777n;
                            float f18 = n3.d0.f122769f;
                            p3.x1 x1Var3 = p3.n.f135158a;
                            ac acVar4 = new ac(f14, f15, f16, f17, f18, f14, null);
                            int i44 = (-1879048193) & i34;
                            if ((i15 & 1024) != 0) {
                                o6Var.getClass();
                                uVarA = o6.a(z19, z14, 0L, 0L, 0L, 0L, 0.0f, 0.0f, o0VarE, 252);
                                o0Var2 = o0VarE;
                            } else {
                                o0Var2 = o0VarE;
                                uVarA = uVar;
                                i29 = i30;
                            }
                            uVar3 = uVarA;
                            pVar6 = pVar8;
                            i35 = i44;
                            r1Var3 = r1VarC;
                            rVar4 = rVar2;
                            xbVar4 = xbVarC;
                            acVar3 = acVar4;
                            pVar7 = pVar3;
                            z24 = z19;
                        } else {
                            o0VarE.e();
                            int i45 = (i15 & 128) != 0 ? i28 & (-29360129) : i28;
                            if ((i15 & 256) != 0) {
                                i45 &= -234881025;
                            }
                            i35 = i45 & (-1879048193);
                            pVar6 = pVar2;
                            acVar3 = acVar;
                            uVar3 = uVar;
                            o0Var2 = o0VarE;
                            r1Var3 = r1VarC;
                            rVar4 = rVar2;
                            z24 = z16;
                            xbVar4 = xbVar2;
                            pVar7 = pVar3;
                            if ((i15 & 1024) == 0) {
                                i29 = i30;
                            }
                        }
                        o0Var2.h0();
                        p3.x1 x1Var4 = p3.n.f135158a;
                        n3.d0.f122764a.getClass();
                        s5.x0 x0VarA = sj.a(n3.d0.f122782s, o0Var2);
                        o6.f89151a.getClass();
                        int i46 = i35 << 3;
                        int i47 = i35 << 6;
                        p3.o0 o0Var3 = o0Var2;
                        c(z14, rVar4, aVar, z24, eVar, x0VarA, pVar7, pVar6, r1Var3, xbVar4, acVar3, uVar3, o6.f89152b, f90385b, o0Var3, (i35 & 14) | 12582912 | ((i35 >> 6) & 112) | (i46 & 896) | ((i35 >> 3) & 7168) | 24576 | (i46 & 3670016) | (234881024 & i47) | (1879048192 & i47), ((i35 >> 24) & 14) | 27648 | ((i29 << 6) & 896) | 196608);
                        rVar3 = rVar4;
                        z18 = z24;
                        pVar5 = pVar7;
                        pVar4 = pVar6;
                        r1Var2 = r1Var3;
                        xbVar3 = xbVar4;
                        acVar2 = acVar3;
                        uVar2 = uVar3;
                        o0Var = o0Var3;
                    } else {
                        o0VarE.e();
                        pVar4 = pVar2;
                        o0Var = o0VarE;
                        rVar3 = rVar2;
                        z18 = z16;
                        xbVar3 = xbVar2;
                        pVar5 = pVar3;
                        acVar2 = acVar;
                        uVar2 = uVar;
                        r1Var2 = r1VarC;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new t1(z14, aVar, eVar, rVar3, z18, pVar5, pVar4, r1Var2, xbVar3, acVar2, uVar2, i14, i15);
                    }
                }
                xbVar2 = xbVar;
                i28 = i19 | i39 | 268435456;
                i29 = 48;
                i30 = (((i15 & 1024) == 0 || !o0VarE.B(uVar)) ? 2 : 4) | 48;
                if ((i28 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (o0VarE.n(i28 & 1, z17)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i37 != 0) {
                            rVar2 = h4.r.S;
                        }
                        if (i17 != 0) {
                            z19 = true;
                        } else {
                            z19 = z16;
                        }
                        if (i24 != 0) {
                            pVar3 = null;
                        }
                        if (i26 == 0) {
                        }
                        if ((i15 & 128) != 0) {
                            o6.f89151a.getClass();
                            p3.x1 x1Var5 = p3.n.f135158a;
                            n3.d0.f122764a.getClass();
                            r1VarC = fc.c(n3.d0.f122766c, o0VarE);
                            i34 = i28 & (-29360129);
                        } else {
                            i34 = i28;
                        }
                        if ((i15 & 256) != 0) {
                            o6.f89151a.getClass();
                            p3.x1 x1Var6 = p3.n.f135158a;
                            s7.f89624a.getClass();
                            xbVarC = o6.c(s7.a(o0VarE));
                            i34 &= -234881025;
                        } else {
                            xbVarC = xbVar2;
                        }
                        o6Var = o6.f89151a;
                        o6Var.getClass();
                        n3.d0.f122764a.getClass();
                        float f19 = n3.d0.f122770g;
                        float f110 = n3.d0.f122779p;
                        float f111 = n3.d0.f122776m;
                        float f112 = n3.d0.f122777n;
                        float f113 = n3.d0.f122769f;
                        p3.x1 x1Var7 = p3.n.f135158a;
                        ac acVar5 = new ac(f19, f110, f111, f112, f113, f19, null);
                        int i48 = (-1879048193) & i34;
                        if ((i15 & 1024) != 0) {
                            o6Var.getClass();
                            uVarA = o6.a(z19, z14, 0L, 0L, 0L, 0L, 0.0f, 0.0f, o0VarE, 252);
                            o0Var2 = o0VarE;
                        } else {
                            o0Var2 = o0VarE;
                            uVarA = uVar;
                            i29 = i30;
                        }
                        uVar3 = uVarA;
                        pVar6 = pVar8;
                        i35 = i48;
                        r1Var3 = r1VarC;
                        rVar4 = rVar2;
                        xbVar4 = xbVarC;
                        acVar3 = acVar5;
                        pVar7 = pVar3;
                        z24 = z19;
                    } else {
                        if (i37 != 0) {
                            rVar2 = h4.r.S;
                        }
                        if (i17 != 0) {
                            z19 = true;
                        } else {
                            z19 = z16;
                        }
                        if (i24 != 0) {
                            pVar3 = null;
                        }
                        if (i26 == 0) {
                        }
                        if ((i15 & 128) != 0) {
                            o6.f89151a.getClass();
                            p3.x1 x1Var8 = p3.n.f135158a;
                            n3.d0.f122764a.getClass();
                            r1VarC = fc.c(n3.d0.f122766c, o0VarE);
                            i34 = i28 & (-29360129);
                        } else {
                            i34 = i28;
                        }
                        if ((i15 & 256) != 0) {
                            o6.f89151a.getClass();
                            p3.x1 x1Var9 = p3.n.f135158a;
                            s7.f89624a.getClass();
                            xbVarC = o6.c(s7.a(o0VarE));
                            i34 &= -234881025;
                        } else {
                            xbVarC = xbVar2;
                        }
                        o6Var = o6.f89151a;
                        o6Var.getClass();
                        n3.d0.f122764a.getClass();
                        float f114 = n3.d0.f122770g;
                        float f115 = n3.d0.f122779p;
                        float f116 = n3.d0.f122776m;
                        float f117 = n3.d0.f122777n;
                        float f118 = n3.d0.f122769f;
                        p3.x1 x1Var10 = p3.n.f135158a;
                        ac acVar6 = new ac(f114, f115, f116, f117, f118, f114, null);
                        int i49 = (-1879048193) & i34;
                        if ((i15 & 1024) != 0) {
                            o6Var.getClass();
                            uVarA = o6.a(z19, z14, 0L, 0L, 0L, 0L, 0.0f, 0.0f, o0VarE, 252);
                            o0Var2 = o0VarE;
                        } else {
                            o0Var2 = o0VarE;
                            uVarA = uVar;
                            i29 = i30;
                        }
                        uVar3 = uVarA;
                        pVar6 = pVar8;
                        i35 = i49;
                        r1Var3 = r1VarC;
                        rVar4 = rVar2;
                        xbVar4 = xbVarC;
                        acVar3 = acVar6;
                        pVar7 = pVar3;
                        z24 = z19;
                    }
                    o0Var2.h0();
                    p3.x1 x1Var11 = p3.n.f135158a;
                    n3.d0.f122764a.getClass();
                    s5.x0 x0VarA2 = sj.a(n3.d0.f122782s, o0Var2);
                    o6.f89151a.getClass();
                    int i410 = i35 << 3;
                    int i411 = i35 << 6;
                    p3.o0 o0Var4 = o0Var2;
                    c(z14, rVar4, aVar, z24, eVar, x0VarA2, pVar7, pVar6, r1Var3, xbVar4, acVar3, uVar3, o6.f89152b, f90385b, o0Var4, (i35 & 14) | 12582912 | ((i35 >> 6) & 112) | (i410 & 896) | ((i35 >> 3) & 7168) | 24576 | (i410 & 3670016) | (234881024 & i411) | (1879048192 & i411), ((i35 >> 24) & 14) | 27648 | ((i29 << 6) & 896) | 196608);
                    rVar3 = rVar4;
                    z18 = z24;
                    pVar5 = pVar7;
                    pVar4 = pVar6;
                    r1Var2 = r1Var3;
                    xbVar3 = xbVar4;
                    acVar2 = acVar3;
                    uVar2 = uVar3;
                    o0Var = o0Var4;
                } else {
                    o0VarE.e();
                    pVar4 = pVar2;
                    o0Var = o0VarE;
                    rVar3 = rVar2;
                    z18 = z16;
                    xbVar3 = xbVar2;
                    pVar5 = pVar3;
                    acVar2 = acVar;
                    uVar2 = uVar;
                    r1Var2 = r1VarC;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new t1(z14, aVar, eVar, rVar3, z18, pVar5, pVar4, r1Var2, xbVar3, acVar2, uVar2, i14, i15);
                }
            }
            i19 |= 196608;
            pVar3 = pVar;
            i26 = i15 & 64;
            if (i26 != 0) {
                i19 |= 1572864;
            } else if ((i14 & 1572864) == 0) {
                if (o0VarE.r(pVar2)) {
                    i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i27 = 524288;
                }
                i19 |= i27;
            }
            if ((i14 & 12582912) == 0) {
                if ((i15 & 128) == 0) {
                    r1VarC = r1Var;
                    if (o0VarE.B(r1VarC)) {
                    }
                    i19 |= i38;
                } else {
                    r1VarC = r1Var;
                }
                i19 |= i38;
            } else {
                r1VarC = r1Var;
            }
            if ((i15 & 256) == 0) {
                xbVar2 = xbVar;
                if (o0VarE.B(xbVar2)) {
                }
                i28 = i19 | i39 | 268435456;
                i29 = 48;
                i30 = (((i15 & 1024) == 0 || !o0VarE.B(uVar)) ? 2 : 4) | 48;
                if ((i28 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (o0VarE.n(i28 & 1, z17)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i37 != 0) {
                            rVar2 = h4.r.S;
                        }
                        if (i17 != 0) {
                            z19 = true;
                        } else {
                            z19 = z16;
                        }
                        if (i24 != 0) {
                            pVar3 = null;
                        }
                        if (i26 == 0) {
                        }
                        if ((i15 & 128) != 0) {
                            o6.f89151a.getClass();
                            p3.x1 x1Var12 = p3.n.f135158a;
                            n3.d0.f122764a.getClass();
                            r1VarC = fc.c(n3.d0.f122766c, o0VarE);
                            i34 = i28 & (-29360129);
                        } else {
                            i34 = i28;
                        }
                        if ((i15 & 256) != 0) {
                            o6.f89151a.getClass();
                            p3.x1 x1Var13 = p3.n.f135158a;
                            s7.f89624a.getClass();
                            xbVarC = o6.c(s7.a(o0VarE));
                            i34 &= -234881025;
                        } else {
                            xbVarC = xbVar2;
                        }
                        o6Var = o6.f89151a;
                        o6Var.getClass();
                        n3.d0.f122764a.getClass();
                        float f119 = n3.d0.f122770g;
                        float f1110 = n3.d0.f122779p;
                        float f1111 = n3.d0.f122776m;
                        float f1112 = n3.d0.f122777n;
                        float f1113 = n3.d0.f122769f;
                        p3.x1 x1Var14 = p3.n.f135158a;
                        ac acVar7 = new ac(f119, f1110, f1111, f1112, f1113, f119, null);
                        int i412 = (-1879048193) & i34;
                        if ((i15 & 1024) != 0) {
                            o6Var.getClass();
                            uVarA = o6.a(z19, z14, 0L, 0L, 0L, 0L, 0.0f, 0.0f, o0VarE, 252);
                            o0Var2 = o0VarE;
                        } else {
                            o0Var2 = o0VarE;
                            uVarA = uVar;
                            i29 = i30;
                        }
                        uVar3 = uVarA;
                        pVar6 = pVar8;
                        i35 = i412;
                        r1Var3 = r1VarC;
                        rVar4 = rVar2;
                        xbVar4 = xbVarC;
                        acVar3 = acVar7;
                        pVar7 = pVar3;
                        z24 = z19;
                    } else {
                        if (i37 != 0) {
                            rVar2 = h4.r.S;
                        }
                        if (i17 != 0) {
                            z19 = true;
                        } else {
                            z19 = z16;
                        }
                        if (i24 != 0) {
                            pVar3 = null;
                        }
                        if (i26 == 0) {
                        }
                        if ((i15 & 128) != 0) {
                            o6.f89151a.getClass();
                            p3.x1 x1Var15 = p3.n.f135158a;
                            n3.d0.f122764a.getClass();
                            r1VarC = fc.c(n3.d0.f122766c, o0VarE);
                            i34 = i28 & (-29360129);
                        } else {
                            i34 = i28;
                        }
                        if ((i15 & 256) != 0) {
                            o6.f89151a.getClass();
                            p3.x1 x1Var16 = p3.n.f135158a;
                            s7.f89624a.getClass();
                            xbVarC = o6.c(s7.a(o0VarE));
                            i34 &= -234881025;
                        } else {
                            xbVarC = xbVar2;
                        }
                        o6Var = o6.f89151a;
                        o6Var.getClass();
                        n3.d0.f122764a.getClass();
                        float f1114 = n3.d0.f122770g;
                        float f1115 = n3.d0.f122779p;
                        float f1116 = n3.d0.f122776m;
                        float f1117 = n3.d0.f122777n;
                        float f1118 = n3.d0.f122769f;
                        p3.x1 x1Var17 = p3.n.f135158a;
                        ac acVar8 = new ac(f1114, f1115, f1116, f1117, f1118, f1114, null);
                        int i413 = (-1879048193) & i34;
                        if ((i15 & 1024) != 0) {
                            o6Var.getClass();
                            uVarA = o6.a(z19, z14, 0L, 0L, 0L, 0L, 0.0f, 0.0f, o0VarE, 252);
                            o0Var2 = o0VarE;
                        } else {
                            o0Var2 = o0VarE;
                            uVarA = uVar;
                            i29 = i30;
                        }
                        uVar3 = uVarA;
                        pVar6 = pVar8;
                        i35 = i413;
                        r1Var3 = r1VarC;
                        rVar4 = rVar2;
                        xbVar4 = xbVarC;
                        acVar3 = acVar8;
                        pVar7 = pVar3;
                        z24 = z19;
                    }
                    o0Var2.h0();
                    p3.x1 x1Var18 = p3.n.f135158a;
                    n3.d0.f122764a.getClass();
                    s5.x0 x0VarA3 = sj.a(n3.d0.f122782s, o0Var2);
                    o6.f89151a.getClass();
                    int i414 = i35 << 3;
                    int i415 = i35 << 6;
                    p3.o0 o0Var5 = o0Var2;
                    c(z14, rVar4, aVar, z24, eVar, x0VarA3, pVar7, pVar6, r1Var3, xbVar4, acVar3, uVar3, o6.f89152b, f90385b, o0Var5, (i35 & 14) | 12582912 | ((i35 >> 6) & 112) | (i414 & 896) | ((i35 >> 3) & 7168) | 24576 | (i414 & 3670016) | (234881024 & i415) | (1879048192 & i415), ((i35 >> 24) & 14) | 27648 | ((i29 << 6) & 896) | 196608);
                    rVar3 = rVar4;
                    z18 = z24;
                    pVar5 = pVar7;
                    pVar4 = pVar6;
                    r1Var2 = r1Var3;
                    xbVar3 = xbVar4;
                    acVar2 = acVar3;
                    uVar2 = uVar3;
                    o0Var = o0Var5;
                } else {
                    o0VarE.e();
                    pVar4 = pVar2;
                    o0Var = o0VarE;
                    rVar3 = rVar2;
                    z18 = z16;
                    xbVar3 = xbVar2;
                    pVar5 = pVar3;
                    acVar2 = acVar;
                    uVar2 = uVar;
                    r1Var2 = r1VarC;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new t1(z14, aVar, eVar, rVar3, z18, pVar5, pVar4, r1Var2, xbVar3, acVar2, uVar2, i14, i15);
                }
            }
            xbVar2 = xbVar;
            i28 = i19 | i39 | 268435456;
            i29 = 48;
            i30 = (((i15 & 1024) == 0 || !o0VarE.B(uVar)) ? 2 : 4) | 48;
            if ((i28 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (o0VarE.n(i28 & 1, z17)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i37 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if (i17 != 0) {
                        z19 = true;
                    } else {
                        z19 = z16;
                    }
                    if (i24 != 0) {
                        pVar3 = null;
                    }
                    if (i26 == 0) {
                    }
                    if ((i15 & 128) != 0) {
                        o6.f89151a.getClass();
                        p3.x1 x1Var19 = p3.n.f135158a;
                        n3.d0.f122764a.getClass();
                        r1VarC = fc.c(n3.d0.f122766c, o0VarE);
                        i34 = i28 & (-29360129);
                    } else {
                        i34 = i28;
                    }
                    if ((i15 & 256) != 0) {
                        o6.f89151a.getClass();
                        p3.x1 x1Var110 = p3.n.f135158a;
                        s7.f89624a.getClass();
                        xbVarC = o6.c(s7.a(o0VarE));
                        i34 &= -234881025;
                    } else {
                        xbVarC = xbVar2;
                    }
                    o6Var = o6.f89151a;
                    o6Var.getClass();
                    n3.d0.f122764a.getClass();
                    float f1119 = n3.d0.f122770g;
                    float f11110 = n3.d0.f122779p;
                    float f11111 = n3.d0.f122776m;
                    float f11112 = n3.d0.f122777n;
                    float f11113 = n3.d0.f122769f;
                    p3.x1 x1Var111 = p3.n.f135158a;
                    ac acVar9 = new ac(f1119, f11110, f11111, f11112, f11113, f1119, null);
                    int i416 = (-1879048193) & i34;
                    if ((i15 & 1024) != 0) {
                        o6Var.getClass();
                        uVarA = o6.a(z19, z14, 0L, 0L, 0L, 0L, 0.0f, 0.0f, o0VarE, 252);
                        o0Var2 = o0VarE;
                    } else {
                        o0Var2 = o0VarE;
                        uVarA = uVar;
                        i29 = i30;
                    }
                    uVar3 = uVarA;
                    pVar6 = pVar8;
                    i35 = i416;
                    r1Var3 = r1VarC;
                    rVar4 = rVar2;
                    xbVar4 = xbVarC;
                    acVar3 = acVar9;
                    pVar7 = pVar3;
                    z24 = z19;
                } else {
                    if (i37 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if (i17 != 0) {
                        z19 = true;
                    } else {
                        z19 = z16;
                    }
                    if (i24 != 0) {
                        pVar3 = null;
                    }
                    if (i26 == 0) {
                    }
                    if ((i15 & 128) != 0) {
                        o6.f89151a.getClass();
                        p3.x1 x1Var112 = p3.n.f135158a;
                        n3.d0.f122764a.getClass();
                        r1VarC = fc.c(n3.d0.f122766c, o0VarE);
                        i34 = i28 & (-29360129);
                    } else {
                        i34 = i28;
                    }
                    if ((i15 & 256) != 0) {
                        o6.f89151a.getClass();
                        p3.x1 x1Var113 = p3.n.f135158a;
                        s7.f89624a.getClass();
                        xbVarC = o6.c(s7.a(o0VarE));
                        i34 &= -234881025;
                    } else {
                        xbVarC = xbVar2;
                    }
                    o6Var = o6.f89151a;
                    o6Var.getClass();
                    n3.d0.f122764a.getClass();
                    float f11114 = n3.d0.f122770g;
                    float f11115 = n3.d0.f122779p;
                    float f11116 = n3.d0.f122776m;
                    float f11117 = n3.d0.f122777n;
                    float f11118 = n3.d0.f122769f;
                    p3.x1 x1Var114 = p3.n.f135158a;
                    ac acVar10 = new ac(f11114, f11115, f11116, f11117, f11118, f11114, null);
                    int i417 = (-1879048193) & i34;
                    if ((i15 & 1024) != 0) {
                        o6Var.getClass();
                        uVarA = o6.a(z19, z14, 0L, 0L, 0L, 0L, 0.0f, 0.0f, o0VarE, 252);
                        o0Var2 = o0VarE;
                    } else {
                        o0Var2 = o0VarE;
                        uVarA = uVar;
                        i29 = i30;
                    }
                    uVar3 = uVarA;
                    pVar6 = pVar8;
                    i35 = i417;
                    r1Var3 = r1VarC;
                    rVar4 = rVar2;
                    xbVar4 = xbVarC;
                    acVar3 = acVar10;
                    pVar7 = pVar3;
                    z24 = z19;
                }
                o0Var2.h0();
                p3.x1 x1Var115 = p3.n.f135158a;
                n3.d0.f122764a.getClass();
                s5.x0 x0VarA4 = sj.a(n3.d0.f122782s, o0Var2);
                o6.f89151a.getClass();
                int i418 = i35 << 3;
                int i419 = i35 << 6;
                p3.o0 o0Var6 = o0Var2;
                c(z14, rVar4, aVar, z24, eVar, x0VarA4, pVar7, pVar6, r1Var3, xbVar4, acVar3, uVar3, o6.f89152b, f90385b, o0Var6, (i35 & 14) | 12582912 | ((i35 >> 6) & 112) | (i418 & 896) | ((i35 >> 3) & 7168) | 24576 | (i418 & 3670016) | (234881024 & i419) | (1879048192 & i419), ((i35 >> 24) & 14) | 27648 | ((i29 << 6) & 896) | 196608);
                rVar3 = rVar4;
                z18 = z24;
                pVar5 = pVar7;
                pVar4 = pVar6;
                r1Var2 = r1Var3;
                xbVar3 = xbVar4;
                acVar2 = acVar3;
                uVar2 = uVar3;
                o0Var = o0Var6;
            } else {
                o0VarE.e();
                pVar4 = pVar2;
                o0Var = o0VarE;
                rVar3 = rVar2;
                z18 = z16;
                xbVar3 = xbVar2;
                pVar5 = pVar3;
                acVar2 = acVar;
                uVar2 = uVar;
                r1Var2 = r1VarC;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new t1(z14, aVar, eVar, rVar3, z18, pVar5, pVar4, r1Var2, xbVar3, acVar2, uVar2, i14, i15);
            }
        }
        i36 |= 3072;
        rVar2 = rVar;
        i17 = i15 & 16;
        if (i17 != 0) {
            i19 = i36 | 24576;
            z16 = z15;
        } else {
            z16 = z15;
            if (o0VarE.h(z16)) {
                i18 = 16384;
            } else {
                i18 = 8192;
            }
            i19 = i36 | i18;
        }
        i24 = i15 & 32;
        if (i24 != 0) {
            if ((i14 & 196608) == 0) {
                pVar3 = pVar;
                if (o0VarE.r(pVar3)) {
                    i25 = 131072;
                } else {
                    i25 = 65536;
                }
                i19 |= i25;
            }
            i26 = i15 & 64;
            if (i26 != 0) {
                i19 |= 1572864;
            } else if ((i14 & 1572864) == 0) {
                if (o0VarE.r(pVar2)) {
                    i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i27 = 524288;
                }
                i19 |= i27;
            }
            if ((i14 & 12582912) == 0) {
                if ((i15 & 128) == 0) {
                    r1VarC = r1Var;
                    if (o0VarE.B(r1VarC)) {
                    }
                    i19 |= i38;
                } else {
                    r1VarC = r1Var;
                }
                i19 |= i38;
            } else {
                r1VarC = r1Var;
            }
            if ((i15 & 256) == 0) {
                xbVar2 = xbVar;
                if (o0VarE.B(xbVar2)) {
                }
                i28 = i19 | i39 | 268435456;
                i29 = 48;
                i30 = (((i15 & 1024) == 0 || !o0VarE.B(uVar)) ? 2 : 4) | 48;
                if ((i28 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (o0VarE.n(i28 & 1, z17)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i37 != 0) {
                            rVar2 = h4.r.S;
                        }
                        if (i17 != 0) {
                            z19 = true;
                        } else {
                            z19 = z16;
                        }
                        if (i24 != 0) {
                            pVar3 = null;
                        }
                        if (i26 == 0) {
                        }
                        if ((i15 & 128) != 0) {
                            o6.f89151a.getClass();
                            p3.x1 x1Var116 = p3.n.f135158a;
                            n3.d0.f122764a.getClass();
                            r1VarC = fc.c(n3.d0.f122766c, o0VarE);
                            i34 = i28 & (-29360129);
                        } else {
                            i34 = i28;
                        }
                        if ((i15 & 256) != 0) {
                            o6.f89151a.getClass();
                            p3.x1 x1Var117 = p3.n.f135158a;
                            s7.f89624a.getClass();
                            xbVarC = o6.c(s7.a(o0VarE));
                            i34 &= -234881025;
                        } else {
                            xbVarC = xbVar2;
                        }
                        o6Var = o6.f89151a;
                        o6Var.getClass();
                        n3.d0.f122764a.getClass();
                        float f11119 = n3.d0.f122770g;
                        float f111110 = n3.d0.f122779p;
                        float f111111 = n3.d0.f122776m;
                        float f111112 = n3.d0.f122777n;
                        float f111113 = n3.d0.f122769f;
                        p3.x1 x1Var118 = p3.n.f135158a;
                        ac acVar11 = new ac(f11119, f111110, f111111, f111112, f111113, f11119, null);
                        int i4110 = (-1879048193) & i34;
                        if ((i15 & 1024) != 0) {
                            o6Var.getClass();
                            uVarA = o6.a(z19, z14, 0L, 0L, 0L, 0L, 0.0f, 0.0f, o0VarE, 252);
                            o0Var2 = o0VarE;
                        } else {
                            o0Var2 = o0VarE;
                            uVarA = uVar;
                            i29 = i30;
                        }
                        uVar3 = uVarA;
                        pVar6 = pVar8;
                        i35 = i4110;
                        r1Var3 = r1VarC;
                        rVar4 = rVar2;
                        xbVar4 = xbVarC;
                        acVar3 = acVar11;
                        pVar7 = pVar3;
                        z24 = z19;
                    } else {
                        if (i37 != 0) {
                            rVar2 = h4.r.S;
                        }
                        if (i17 != 0) {
                            z19 = true;
                        } else {
                            z19 = z16;
                        }
                        if (i24 != 0) {
                            pVar3 = null;
                        }
                        if (i26 == 0) {
                        }
                        if ((i15 & 128) != 0) {
                            o6.f89151a.getClass();
                            p3.x1 x1Var119 = p3.n.f135158a;
                            n3.d0.f122764a.getClass();
                            r1VarC = fc.c(n3.d0.f122766c, o0VarE);
                            i34 = i28 & (-29360129);
                        } else {
                            i34 = i28;
                        }
                        if ((i15 & 256) != 0) {
                            o6.f89151a.getClass();
                            p3.x1 x1Var1110 = p3.n.f135158a;
                            s7.f89624a.getClass();
                            xbVarC = o6.c(s7.a(o0VarE));
                            i34 &= -234881025;
                        } else {
                            xbVarC = xbVar2;
                        }
                        o6Var = o6.f89151a;
                        o6Var.getClass();
                        n3.d0.f122764a.getClass();
                        float f111114 = n3.d0.f122770g;
                        float f111115 = n3.d0.f122779p;
                        float f111116 = n3.d0.f122776m;
                        float f111117 = n3.d0.f122777n;
                        float f111118 = n3.d0.f122769f;
                        p3.x1 x1Var1111 = p3.n.f135158a;
                        ac acVar12 = new ac(f111114, f111115, f111116, f111117, f111118, f111114, null);
                        int i4111 = (-1879048193) & i34;
                        if ((i15 & 1024) != 0) {
                            o6Var.getClass();
                            uVarA = o6.a(z19, z14, 0L, 0L, 0L, 0L, 0.0f, 0.0f, o0VarE, 252);
                            o0Var2 = o0VarE;
                        } else {
                            o0Var2 = o0VarE;
                            uVarA = uVar;
                            i29 = i30;
                        }
                        uVar3 = uVarA;
                        pVar6 = pVar8;
                        i35 = i4111;
                        r1Var3 = r1VarC;
                        rVar4 = rVar2;
                        xbVar4 = xbVarC;
                        acVar3 = acVar12;
                        pVar7 = pVar3;
                        z24 = z19;
                    }
                    o0Var2.h0();
                    p3.x1 x1Var1112 = p3.n.f135158a;
                    n3.d0.f122764a.getClass();
                    s5.x0 x0VarA5 = sj.a(n3.d0.f122782s, o0Var2);
                    o6.f89151a.getClass();
                    int i4112 = i35 << 3;
                    int i4113 = i35 << 6;
                    p3.o0 o0Var7 = o0Var2;
                    c(z14, rVar4, aVar, z24, eVar, x0VarA5, pVar7, pVar6, r1Var3, xbVar4, acVar3, uVar3, o6.f89152b, f90385b, o0Var7, (i35 & 14) | 12582912 | ((i35 >> 6) & 112) | (i4112 & 896) | ((i35 >> 3) & 7168) | 24576 | (i4112 & 3670016) | (234881024 & i4113) | (1879048192 & i4113), ((i35 >> 24) & 14) | 27648 | ((i29 << 6) & 896) | 196608);
                    rVar3 = rVar4;
                    z18 = z24;
                    pVar5 = pVar7;
                    pVar4 = pVar6;
                    r1Var2 = r1Var3;
                    xbVar3 = xbVar4;
                    acVar2 = acVar3;
                    uVar2 = uVar3;
                    o0Var = o0Var7;
                } else {
                    o0VarE.e();
                    pVar4 = pVar2;
                    o0Var = o0VarE;
                    rVar3 = rVar2;
                    z18 = z16;
                    xbVar3 = xbVar2;
                    pVar5 = pVar3;
                    acVar2 = acVar;
                    uVar2 = uVar;
                    r1Var2 = r1VarC;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new t1(z14, aVar, eVar, rVar3, z18, pVar5, pVar4, r1Var2, xbVar3, acVar2, uVar2, i14, i15);
                }
            }
            xbVar2 = xbVar;
            i28 = i19 | i39 | 268435456;
            i29 = 48;
            i30 = (((i15 & 1024) == 0 || !o0VarE.B(uVar)) ? 2 : 4) | 48;
            if ((i28 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (o0VarE.n(i28 & 1, z17)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i37 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if (i17 != 0) {
                        z19 = true;
                    } else {
                        z19 = z16;
                    }
                    if (i24 != 0) {
                        pVar3 = null;
                    }
                    if (i26 == 0) {
                    }
                    if ((i15 & 128) != 0) {
                        o6.f89151a.getClass();
                        p3.x1 x1Var1113 = p3.n.f135158a;
                        n3.d0.f122764a.getClass();
                        r1VarC = fc.c(n3.d0.f122766c, o0VarE);
                        i34 = i28 & (-29360129);
                    } else {
                        i34 = i28;
                    }
                    if ((i15 & 256) != 0) {
                        o6.f89151a.getClass();
                        p3.x1 x1Var1114 = p3.n.f135158a;
                        s7.f89624a.getClass();
                        xbVarC = o6.c(s7.a(o0VarE));
                        i34 &= -234881025;
                    } else {
                        xbVarC = xbVar2;
                    }
                    o6Var = o6.f89151a;
                    o6Var.getClass();
                    n3.d0.f122764a.getClass();
                    float f111119 = n3.d0.f122770g;
                    float f1111110 = n3.d0.f122779p;
                    float f1111111 = n3.d0.f122776m;
                    float f1111112 = n3.d0.f122777n;
                    float f1111113 = n3.d0.f122769f;
                    p3.x1 x1Var1115 = p3.n.f135158a;
                    ac acVar13 = new ac(f111119, f1111110, f1111111, f1111112, f1111113, f111119, null);
                    int i4114 = (-1879048193) & i34;
                    if ((i15 & 1024) != 0) {
                        o6Var.getClass();
                        uVarA = o6.a(z19, z14, 0L, 0L, 0L, 0L, 0.0f, 0.0f, o0VarE, 252);
                        o0Var2 = o0VarE;
                    } else {
                        o0Var2 = o0VarE;
                        uVarA = uVar;
                        i29 = i30;
                    }
                    uVar3 = uVarA;
                    pVar6 = pVar8;
                    i35 = i4114;
                    r1Var3 = r1VarC;
                    rVar4 = rVar2;
                    xbVar4 = xbVarC;
                    acVar3 = acVar13;
                    pVar7 = pVar3;
                    z24 = z19;
                } else {
                    if (i37 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if (i17 != 0) {
                        z19 = true;
                    } else {
                        z19 = z16;
                    }
                    if (i24 != 0) {
                        pVar3 = null;
                    }
                    if (i26 == 0) {
                    }
                    if ((i15 & 128) != 0) {
                        o6.f89151a.getClass();
                        p3.x1 x1Var1116 = p3.n.f135158a;
                        n3.d0.f122764a.getClass();
                        r1VarC = fc.c(n3.d0.f122766c, o0VarE);
                        i34 = i28 & (-29360129);
                    } else {
                        i34 = i28;
                    }
                    if ((i15 & 256) != 0) {
                        o6.f89151a.getClass();
                        p3.x1 x1Var1117 = p3.n.f135158a;
                        s7.f89624a.getClass();
                        xbVarC = o6.c(s7.a(o0VarE));
                        i34 &= -234881025;
                    } else {
                        xbVarC = xbVar2;
                    }
                    o6Var = o6.f89151a;
                    o6Var.getClass();
                    n3.d0.f122764a.getClass();
                    float f1111114 = n3.d0.f122770g;
                    float f1111115 = n3.d0.f122779p;
                    float f1111116 = n3.d0.f122776m;
                    float f1111117 = n3.d0.f122777n;
                    float f1111118 = n3.d0.f122769f;
                    p3.x1 x1Var1118 = p3.n.f135158a;
                    ac acVar14 = new ac(f1111114, f1111115, f1111116, f1111117, f1111118, f1111114, null);
                    int i4115 = (-1879048193) & i34;
                    if ((i15 & 1024) != 0) {
                        o6Var.getClass();
                        uVarA = o6.a(z19, z14, 0L, 0L, 0L, 0L, 0.0f, 0.0f, o0VarE, 252);
                        o0Var2 = o0VarE;
                    } else {
                        o0Var2 = o0VarE;
                        uVarA = uVar;
                        i29 = i30;
                    }
                    uVar3 = uVarA;
                    pVar6 = pVar8;
                    i35 = i4115;
                    r1Var3 = r1VarC;
                    rVar4 = rVar2;
                    xbVar4 = xbVarC;
                    acVar3 = acVar14;
                    pVar7 = pVar3;
                    z24 = z19;
                }
                o0Var2.h0();
                p3.x1 x1Var1119 = p3.n.f135158a;
                n3.d0.f122764a.getClass();
                s5.x0 x0VarA6 = sj.a(n3.d0.f122782s, o0Var2);
                o6.f89151a.getClass();
                int i4116 = i35 << 3;
                int i4117 = i35 << 6;
                p3.o0 o0Var8 = o0Var2;
                c(z14, rVar4, aVar, z24, eVar, x0VarA6, pVar7, pVar6, r1Var3, xbVar4, acVar3, uVar3, o6.f89152b, f90385b, o0Var8, (i35 & 14) | 12582912 | ((i35 >> 6) & 112) | (i4116 & 896) | ((i35 >> 3) & 7168) | 24576 | (i4116 & 3670016) | (234881024 & i4117) | (1879048192 & i4117), ((i35 >> 24) & 14) | 27648 | ((i29 << 6) & 896) | 196608);
                rVar3 = rVar4;
                z18 = z24;
                pVar5 = pVar7;
                pVar4 = pVar6;
                r1Var2 = r1Var3;
                xbVar3 = xbVar4;
                acVar2 = acVar3;
                uVar2 = uVar3;
                o0Var = o0Var8;
            } else {
                o0VarE.e();
                pVar4 = pVar2;
                o0Var = o0VarE;
                rVar3 = rVar2;
                z18 = z16;
                xbVar3 = xbVar2;
                pVar5 = pVar3;
                acVar2 = acVar;
                uVar2 = uVar;
                r1Var2 = r1VarC;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new t1(z14, aVar, eVar, rVar3, z18, pVar5, pVar4, r1Var2, xbVar3, acVar2, uVar2, i14, i15);
            }
        }
        i19 |= 196608;
        pVar3 = pVar;
        i26 = i15 & 64;
        if (i26 != 0) {
            i19 |= 1572864;
        } else if ((i14 & 1572864) == 0) {
            if (o0VarE.r(pVar2)) {
                i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i27 = 524288;
            }
            i19 |= i27;
        }
        if ((i14 & 12582912) == 0) {
            if ((i15 & 128) == 0) {
                r1VarC = r1Var;
                if (o0VarE.B(r1VarC)) {
                }
                i19 |= i38;
            } else {
                r1VarC = r1Var;
            }
            i19 |= i38;
        } else {
            r1VarC = r1Var;
        }
        if ((i15 & 256) == 0) {
            xbVar2 = xbVar;
            if (o0VarE.B(xbVar2)) {
            }
            i28 = i19 | i39 | 268435456;
            i29 = 48;
            i30 = (((i15 & 1024) == 0 || !o0VarE.B(uVar)) ? 2 : 4) | 48;
            if ((i28 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (o0VarE.n(i28 & 1, z17)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i37 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if (i17 != 0) {
                        z19 = true;
                    } else {
                        z19 = z16;
                    }
                    if (i24 != 0) {
                        pVar3 = null;
                    }
                    if (i26 == 0) {
                    }
                    if ((i15 & 128) != 0) {
                        o6.f89151a.getClass();
                        p3.x1 x1Var11110 = p3.n.f135158a;
                        n3.d0.f122764a.getClass();
                        r1VarC = fc.c(n3.d0.f122766c, o0VarE);
                        i34 = i28 & (-29360129);
                    } else {
                        i34 = i28;
                    }
                    if ((i15 & 256) != 0) {
                        o6.f89151a.getClass();
                        p3.x1 x1Var11111 = p3.n.f135158a;
                        s7.f89624a.getClass();
                        xbVarC = o6.c(s7.a(o0VarE));
                        i34 &= -234881025;
                    } else {
                        xbVarC = xbVar2;
                    }
                    o6Var = o6.f89151a;
                    o6Var.getClass();
                    n3.d0.f122764a.getClass();
                    float f1111119 = n3.d0.f122770g;
                    float f11111110 = n3.d0.f122779p;
                    float f11111111 = n3.d0.f122776m;
                    float f11111112 = n3.d0.f122777n;
                    float f11111113 = n3.d0.f122769f;
                    p3.x1 x1Var11112 = p3.n.f135158a;
                    ac acVar15 = new ac(f1111119, f11111110, f11111111, f11111112, f11111113, f1111119, null);
                    int i4118 = (-1879048193) & i34;
                    if ((i15 & 1024) != 0) {
                        o6Var.getClass();
                        uVarA = o6.a(z19, z14, 0L, 0L, 0L, 0L, 0.0f, 0.0f, o0VarE, 252);
                        o0Var2 = o0VarE;
                    } else {
                        o0Var2 = o0VarE;
                        uVarA = uVar;
                        i29 = i30;
                    }
                    uVar3 = uVarA;
                    pVar6 = pVar8;
                    i35 = i4118;
                    r1Var3 = r1VarC;
                    rVar4 = rVar2;
                    xbVar4 = xbVarC;
                    acVar3 = acVar15;
                    pVar7 = pVar3;
                    z24 = z19;
                } else {
                    if (i37 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if (i17 != 0) {
                        z19 = true;
                    } else {
                        z19 = z16;
                    }
                    if (i24 != 0) {
                        pVar3 = null;
                    }
                    if (i26 == 0) {
                    }
                    if ((i15 & 128) != 0) {
                        o6.f89151a.getClass();
                        p3.x1 x1Var11113 = p3.n.f135158a;
                        n3.d0.f122764a.getClass();
                        r1VarC = fc.c(n3.d0.f122766c, o0VarE);
                        i34 = i28 & (-29360129);
                    } else {
                        i34 = i28;
                    }
                    if ((i15 & 256) != 0) {
                        o6.f89151a.getClass();
                        p3.x1 x1Var11114 = p3.n.f135158a;
                        s7.f89624a.getClass();
                        xbVarC = o6.c(s7.a(o0VarE));
                        i34 &= -234881025;
                    } else {
                        xbVarC = xbVar2;
                    }
                    o6Var = o6.f89151a;
                    o6Var.getClass();
                    n3.d0.f122764a.getClass();
                    float f11111114 = n3.d0.f122770g;
                    float f11111115 = n3.d0.f122779p;
                    float f11111116 = n3.d0.f122776m;
                    float f11111117 = n3.d0.f122777n;
                    float f11111118 = n3.d0.f122769f;
                    p3.x1 x1Var11115 = p3.n.f135158a;
                    ac acVar16 = new ac(f11111114, f11111115, f11111116, f11111117, f11111118, f11111114, null);
                    int i4119 = (-1879048193) & i34;
                    if ((i15 & 1024) != 0) {
                        o6Var.getClass();
                        uVarA = o6.a(z19, z14, 0L, 0L, 0L, 0L, 0.0f, 0.0f, o0VarE, 252);
                        o0Var2 = o0VarE;
                    } else {
                        o0Var2 = o0VarE;
                        uVarA = uVar;
                        i29 = i30;
                    }
                    uVar3 = uVarA;
                    pVar6 = pVar8;
                    i35 = i4119;
                    r1Var3 = r1VarC;
                    rVar4 = rVar2;
                    xbVar4 = xbVarC;
                    acVar3 = acVar16;
                    pVar7 = pVar3;
                    z24 = z19;
                }
                o0Var2.h0();
                p3.x1 x1Var11116 = p3.n.f135158a;
                n3.d0.f122764a.getClass();
                s5.x0 x0VarA7 = sj.a(n3.d0.f122782s, o0Var2);
                o6.f89151a.getClass();
                int i41110 = i35 << 3;
                int i41111 = i35 << 6;
                p3.o0 o0Var9 = o0Var2;
                c(z14, rVar4, aVar, z24, eVar, x0VarA7, pVar7, pVar6, r1Var3, xbVar4, acVar3, uVar3, o6.f89152b, f90385b, o0Var9, (i35 & 14) | 12582912 | ((i35 >> 6) & 112) | (i41110 & 896) | ((i35 >> 3) & 7168) | 24576 | (i41110 & 3670016) | (234881024 & i41111) | (1879048192 & i41111), ((i35 >> 24) & 14) | 27648 | ((i29 << 6) & 896) | 196608);
                rVar3 = rVar4;
                z18 = z24;
                pVar5 = pVar7;
                pVar4 = pVar6;
                r1Var2 = r1Var3;
                xbVar3 = xbVar4;
                acVar2 = acVar3;
                uVar2 = uVar3;
                o0Var = o0Var9;
            } else {
                o0VarE.e();
                pVar4 = pVar2;
                o0Var = o0VarE;
                rVar3 = rVar2;
                z18 = z16;
                xbVar3 = xbVar2;
                pVar5 = pVar3;
                acVar2 = acVar;
                uVar2 = uVar;
                r1Var2 = r1VarC;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new t1(z14, aVar, eVar, rVar3, z18, pVar5, pVar4, r1Var2, xbVar3, acVar2, uVar2, i14, i15);
            }
        }
        xbVar2 = xbVar;
        i28 = i19 | i39 | 268435456;
        i29 = 48;
        i30 = (((i15 & 1024) == 0 || !o0VarE.B(uVar)) ? 2 : 4) | 48;
        if ((i28 & 306783379) == 306783378) {
            z17 = true;
        } else {
            z17 = true;
        }
        if (o0VarE.n(i28 & 1, z17)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i37 != 0) {
                    rVar2 = h4.r.S;
                }
                if (i17 != 0) {
                    z19 = true;
                } else {
                    z19 = z16;
                }
                if (i24 != 0) {
                    pVar3 = null;
                }
                if (i26 == 0) {
                }
                if ((i15 & 128) != 0) {
                    o6.f89151a.getClass();
                    p3.x1 x1Var11117 = p3.n.f135158a;
                    n3.d0.f122764a.getClass();
                    r1VarC = fc.c(n3.d0.f122766c, o0VarE);
                    i34 = i28 & (-29360129);
                } else {
                    i34 = i28;
                }
                if ((i15 & 256) != 0) {
                    o6.f89151a.getClass();
                    p3.x1 x1Var11118 = p3.n.f135158a;
                    s7.f89624a.getClass();
                    xbVarC = o6.c(s7.a(o0VarE));
                    i34 &= -234881025;
                } else {
                    xbVarC = xbVar2;
                }
                o6Var = o6.f89151a;
                o6Var.getClass();
                n3.d0.f122764a.getClass();
                float f11111119 = n3.d0.f122770g;
                float f111111110 = n3.d0.f122779p;
                float f111111111 = n3.d0.f122776m;
                float f111111112 = n3.d0.f122777n;
                float f111111113 = n3.d0.f122769f;
                p3.x1 x1Var11119 = p3.n.f135158a;
                ac acVar17 = new ac(f11111119, f111111110, f111111111, f111111112, f111111113, f11111119, null);
                int i41112 = (-1879048193) & i34;
                if ((i15 & 1024) != 0) {
                    o6Var.getClass();
                    uVarA = o6.a(z19, z14, 0L, 0L, 0L, 0L, 0.0f, 0.0f, o0VarE, 252);
                    o0Var2 = o0VarE;
                } else {
                    o0Var2 = o0VarE;
                    uVarA = uVar;
                    i29 = i30;
                }
                uVar3 = uVarA;
                pVar6 = pVar8;
                i35 = i41112;
                r1Var3 = r1VarC;
                rVar4 = rVar2;
                xbVar4 = xbVarC;
                acVar3 = acVar17;
                pVar7 = pVar3;
                z24 = z19;
            } else {
                if (i37 != 0) {
                    rVar2 = h4.r.S;
                }
                if (i17 != 0) {
                    z19 = true;
                } else {
                    z19 = z16;
                }
                if (i24 != 0) {
                    pVar3 = null;
                }
                if (i26 == 0) {
                }
                if ((i15 & 128) != 0) {
                    o6.f89151a.getClass();
                    p3.x1 x1Var111110 = p3.n.f135158a;
                    n3.d0.f122764a.getClass();
                    r1VarC = fc.c(n3.d0.f122766c, o0VarE);
                    i34 = i28 & (-29360129);
                } else {
                    i34 = i28;
                }
                if ((i15 & 256) != 0) {
                    o6.f89151a.getClass();
                    p3.x1 x1Var111111 = p3.n.f135158a;
                    s7.f89624a.getClass();
                    xbVarC = o6.c(s7.a(o0VarE));
                    i34 &= -234881025;
                } else {
                    xbVarC = xbVar2;
                }
                o6Var = o6.f89151a;
                o6Var.getClass();
                n3.d0.f122764a.getClass();
                float f111111114 = n3.d0.f122770g;
                float f111111115 = n3.d0.f122779p;
                float f111111116 = n3.d0.f122776m;
                float f111111117 = n3.d0.f122777n;
                float f111111118 = n3.d0.f122769f;
                p3.x1 x1Var111112 = p3.n.f135158a;
                ac acVar18 = new ac(f111111114, f111111115, f111111116, f111111117, f111111118, f111111114, null);
                int i41113 = (-1879048193) & i34;
                if ((i15 & 1024) != 0) {
                    o6Var.getClass();
                    uVarA = o6.a(z19, z14, 0L, 0L, 0L, 0L, 0.0f, 0.0f, o0VarE, 252);
                    o0Var2 = o0VarE;
                } else {
                    o0Var2 = o0VarE;
                    uVarA = uVar;
                    i29 = i30;
                }
                uVar3 = uVarA;
                pVar6 = pVar8;
                i35 = i41113;
                r1Var3 = r1VarC;
                rVar4 = rVar2;
                xbVar4 = xbVarC;
                acVar3 = acVar18;
                pVar7 = pVar3;
                z24 = z19;
            }
            o0Var2.h0();
            p3.x1 x1Var111113 = p3.n.f135158a;
            n3.d0.f122764a.getClass();
            s5.x0 x0VarA8 = sj.a(n3.d0.f122782s, o0Var2);
            o6.f89151a.getClass();
            int i41114 = i35 << 3;
            int i41115 = i35 << 6;
            p3.o0 o0Var10 = o0Var2;
            c(z14, rVar4, aVar, z24, eVar, x0VarA8, pVar7, pVar6, r1Var3, xbVar4, acVar3, uVar3, o6.f89152b, f90385b, o0Var10, (i35 & 14) | 12582912 | ((i35 >> 6) & 112) | (i41114 & 896) | ((i35 >> 3) & 7168) | 24576 | (i41114 & 3670016) | (234881024 & i41115) | (1879048192 & i41115), ((i35 >> 24) & 14) | 27648 | ((i29 << 6) & 896) | 196608);
            rVar3 = rVar4;
            z18 = z24;
            pVar5 = pVar7;
            pVar4 = pVar6;
            r1Var2 = r1Var3;
            xbVar3 = xbVar4;
            acVar2 = acVar3;
            uVar2 = uVar3;
            o0Var = o0Var10;
        } else {
            o0VarE.e();
            pVar4 = pVar2;
            o0Var = o0VarE;
            rVar3 = rVar2;
            z18 = z16;
            xbVar3 = xbVar2;
            pVar5 = pVar3;
            acVar2 = acVar;
            uVar2 = uVar;
            r1Var2 = r1VarC;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t1(z14, aVar, eVar, rVar3, z18, pVar5, pVar4, r1Var2, xbVar3, acVar2, uVar2, i14, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void c(final boolean z14, final h4.r rVar, final e23.a aVar, final boolean z15, final z3.e eVar, final s5.x0 x0Var, final e23.p pVar, final e23.p pVar2, final o4.r1 r1Var, final xb xbVar, final ac acVar, final u1.u uVar, final float f14, final c2.h2 h2Var, p3.m mVar, final int i14, final int i15) {
        int i16;
        int i17;
        p3.o0 o0Var;
        long j8;
        float f15;
        s1.b bVar;
        boolean z16;
        e23.p pVar3;
        s1.m mVar2;
        ?? r14;
        float f16;
        p3.o0 o0VarE = mVar.E(1786844928);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.h(z15) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(eVar) ? 16384 : 8192;
        }
        if ((i14 & 196608) == 0) {
            i16 |= o0VarE.B(x0Var) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i16 |= o0VarE.r(pVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i16 |= o0VarE.r(null) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i16 |= o0VarE.r(pVar2) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i16 |= o0VarE.B(r1Var) ? 536870912 : 268435456;
        }
        if ((i15 & 6) == 0) {
            i17 = i15 | (o0VarE.B(xbVar) ? 4 : 2);
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= o0VarE.B(acVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= o0VarE.B(uVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= o0VarE.i(f14) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i17 |= o0VarE.B(h2Var) ? 16384 : 8192;
        }
        if ((i15 & 196608) == 0) {
            i17 |= o0VarE.B(null) ? 131072 : 65536;
        }
        int i18 = i16;
        boolean z17 = true;
        if (o0VarE.n(i18 & 1, ((i16 & 306783379) == 306783378 && (i17 & 74899) == 74898) ? false : true)) {
            p3.x1 x1Var = p3.n.f135158a;
            o0VarE.C(73215547);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            aVar2.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = kg.f.b(o0VarE);
            }
            a2.j jVar = (a2.j) objQ;
            o0VarE.g0(false);
            Object objQ2 = o0VarE.q();
            aVar2.getClass();
            if (objQ2 == c2565a) {
                objQ2 = new i11.f(5);
                o0VarE.K(objQ2);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ2, rVar, false);
            if (z15) {
                j8 = !z14 ? xbVar.f90306a : xbVar.f90314i;
            } else {
                j8 = z14 ? xbVar.f90315j : xbVar.f90310e;
            }
            long j14 = j8;
            if (acVar == null) {
                o0VarE.C(73531126);
                o0VarE.g0(false);
                mVar2 = null;
                r14 = 0;
                i18 = i18;
                pVar3 = null;
            } else {
                o0VarE.C(-828912021);
                int i19 = ((i17 << 3) & 896) | ((i18 >> 9) & 14);
                Object objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = new f4.s();
                    o0VarE.K(objQ3);
                }
                f4.s sVar = (f4.s) objQ3;
                Object objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = p3.p0.n(null);
                    o0VarE.K(objQ4);
                }
                p3.p1 p1Var = (p3.p1) objQ4;
                boolean zB = o0VarE.B(jVar);
                Object objQ5 = o0VarE.q();
                if (zB || objQ5 == c2565a) {
                    objQ5 = new yb(jVar, sVar, null);
                    o0VarE.K(objQ5);
                }
                p3.l0.e((e23.p) objQ5, jVar, o0VarE);
                a2.h hVar = (a2.h) p13.h0.n0(sVar);
                if (!z15) {
                    f15 = acVar.f87474f;
                } else if (hVar instanceof a2.l.b) {
                    f15 = acVar.f87470b;
                } else if (hVar instanceof a2.e) {
                    f15 = acVar.f87472d;
                } else if (hVar instanceof a2.b) {
                    f15 = acVar.f87471c;
                } else {
                    f15 = hVar instanceof a2.a.b ? acVar.f87473e : acVar.f87469a;
                }
                float f17 = f15;
                Object objQ6 = o0VarE.q();
                if (objQ6 == c2565a) {
                    objQ6 = new s1.b(g6.f.a(f17), s1.e2.f155570c, null, null, 12, null);
                    o0VarE.K(objQ6);
                }
                s1.b bVar2 = (s1.b) objQ6;
                g6.f fVarA = g6.f.a(f17);
                boolean zR = o0VarE.r(bVar2) | o0VarE.i(f17);
                if ((((i19 & 14) ^ 6) <= 4 || !o0VarE.h(z15)) && (i19 & 6) != 4) {
                    z17 = false;
                }
                boolean zR2 = zR | z17 | o0VarE.r(hVar);
                Object objQ7 = o0VarE.q();
                if (zR2 || objQ7 == c2565a) {
                    bVar = bVar2;
                    z16 = false;
                    pVar3 = null;
                    zb zbVar = new zb(bVar, f17, z15, hVar, p1Var, null);
                    o0VarE.K(zbVar);
                    objQ7 = zbVar;
                } else {
                    bVar = bVar2;
                    z16 = false;
                    pVar3 = null;
                }
                p3.l0.e((e23.p) objQ7, fVarA, o0VarE);
                mVar2 = bVar.f155489c;
                o0VarE.g0(z16);
                r14 = z16;
            }
            if (mVar2 != null) {
                f16 = ((g6.f) mVar2.f155628b.getF182175a()).f75997a;
            } else {
                f16 = (float) r14;
                g6.f.a aVar3 = g6.f.f75994b;
            }
            p3.o0 o0Var2 = o0VarE;
            ve.b(z14, aVar, rVarC, z15, r1Var, j14, 0L, f16, uVar, jVar, z3.f.c(-990050154, new z1(xbVar, z15, z14, eVar, x0Var, pVar, pVar3, pVar2, f14, h2Var), o0VarE), o0Var2, (i18 & 14) | ((i18 >> 3) & 112) | (i18 & 7168) | ((i18 >> 15) & 57344) | ((i17 << 21) & 1879048192), 192);
            o0Var = o0Var2;
        } else {
            p3.o0 o0Var3 = o0VarE;
            o0Var3.e();
            o0Var = o0Var3;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: i3.u1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i14 | 1);
                    int iT2 = p3.p0.t(i15);
                    y1.c(z14, rVar, aVar, z15, eVar, x0Var, pVar, pVar2, r1Var, xbVar, acVar, uVar, f14, h2Var, (p3.m) obj, iT, iT2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final p3.p1 d(e23.p pVar, p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        Object objQ = mVar.q();
        p3.m.f135153a.getClass();
        if (objQ == p3.m.a.f135155b) {
            objQ = p3.p0.n(pVar);
            mVar.K(objQ);
        }
        p3.p1 p1Var = (p3.p1) objQ;
        if (pVar != null) {
            p1Var.setValue(pVar);
        }
        return p1Var;
    }
}
