package i3;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class y7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f90417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f90418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f90419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f90420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f90421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f90422f;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h4.r f90423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u1.d2 f90424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.q<c2.a0, p3.m, Integer, Unit> f90425c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(h4.r rVar, u1.d2 d2Var, e23.q<? super c2.a0, ? super p3.m, ? super Integer, Unit> qVar) {
            this.f90423a = rVar;
            this.f90424b = d2Var;
            this.f90425c = qVar;
        }

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                h4.r rVarB = u1.a2.b(c2.l.E(c2.l.A(this.f90423a, 0.0f, y7.f90420d, 1), c2.q1.Max), this.f90424b, true);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                int iP = mVar2.P();
                p3.i2 i2VarX = mVar2.x();
                h4.r rVarC = h4.k.c(rVarB, mVar2);
                h5.g.V.getClass();
                h5.e0.a aVar = h5.g.a.f81805b;
                if (mVar2.F() == null) {
                    p3.p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar);
                } else {
                    mVar2.c();
                }
                p3.b4.c(h5.g.a.f81810g, zVarA, mVar2);
                p3.b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                    v.h.z(iP, mVar2, iP, bVar);
                }
                p3.b4.c(h5.g.a.f81807d, rVarC, mVar2);
                this.f90425c.invoke(c2.b0.f22601a, mVar2, 6);
                mVar2.y();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements e23.q<s1.t1.b<Boolean>, p3.m, Integer, s1.f0<Float>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s1.f0<Float> f90426a;

        public b(s1.f0<Float> f0Var) {
            this.f90426a = f0Var;
        }

        @Override // e23.q
        public final s1.f0<Float> invoke(s1.t1.b<Boolean> bVar, p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            num.intValue();
            mVar2.C(2839488);
            p3.x1 x1Var = p3.n.f135158a;
            mVar2.f();
            return this.f90426a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class c implements e23.q<s1.t1.b<Boolean>, p3.m, Integer, s1.f0<Float>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s1.f0<Float> f90427a;

        public c(s1.f0<Float> f0Var) {
            this.f90427a = f0Var;
        }

        @Override // e23.q
        public final s1.f0<Float> invoke(s1.t1.b<Boolean> bVar, p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            num.intValue();
            mVar2.C(-745957716);
            p3.x1 x1Var = p3.n.f135158a;
            mVar2.f();
            return this.f90427a;
        }
    }

    static {
        float f14 = 48;
        g6.f.a aVar = g6.f.f75994b;
        f90417a = f14;
        f90418b = f14;
        f90419c = 12;
        f90420d = 8;
        f90421e = 112;
        f90422f = 280;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x01bc  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final h4.r rVar, final s1.t0<Boolean> t0Var, final p3.p1<o4.z1> p1Var, final u1.d2 d2Var, final o4.r1 r1Var, final long j8, final float f14, final float f15, final u1.u uVar, final e23.q<? super c2.a0, ? super p3.m, ? super Integer, Unit> qVar, p3.m mVar, final int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(848986741);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(t0Var) ? 32 : 16) | (o0VarE.B(d2Var) ? 2048 : 1024) | (o0VarE.B(r1Var) ? 16384 : 8192) | (o0VarE.l(j8) ? 131072 : 65536) | (o0VarE.i(f14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.i(f15) ? 8388608 : 4194304) | (o0VarE.B(uVar) ? 67108864 : 33554432) | (o0VarE.r(qVar) ? 536870912 : 268435456);
        if (o0VarE.n(i15 & 1, (i15 & 306783379) != 306783378)) {
            p3.x1 x1Var = p3.n.f135158a;
            s1.t1 t1VarD = s1.w1.d(t0Var, "DropDownMenu", o0VarE, (((i15 >> 3) & 14) | 48) & 126);
            s1.f0 f0VarB = k9.b(n3.h0.FastSpatial, o0VarE);
            s1.f0 f0VarB2 = k9.b(n3.h0.FastEffects, o0VarE);
            c cVar = new c(f0VarB);
            p005kotlin.jvm.internal.m mVar2 = p005kotlin.jvm.internal.m.f105803a;
            s1.d2 d2Var2 = s1.e2.f155568a;
            s1.a2<S> a2Var = t1VarD.f155744a;
            p3.c2 c2Var = t1VarD.f155747d;
            boolean zBooleanValue = ((Boolean) a2Var.a()).booleanValue();
            o0VarE.C(143964305);
            float f16 = zBooleanValue ? 1.0f : 0.8f;
            o0VarE.g0(false);
            Float fValueOf = Float.valueOf(f16);
            boolean zBooleanValue2 = ((Boolean) c2Var.getF182175a()).booleanValue();
            o0VarE.C(143964305);
            float f17 = zBooleanValue2 ? 1.0f : 0.8f;
            o0VarE.g0(false);
            s1.t1.d dVarC = s1.w1.c(t1VarD, fValueOf, Float.valueOf(f17), cVar.invoke(t1VarD.f(), o0VarE, 0), d2Var2, "FloatAnimation", o0VarE, 0);
            b bVar = new b(f0VarB2);
            boolean zBooleanValue3 = ((Boolean) t1VarD.f155744a.a()).booleanValue();
            o0VarE.C(892761509);
            float f18 = zBooleanValue3 ? 1.0f : 0.0f;
            o0VarE.g0(false);
            Float fValueOf2 = Float.valueOf(f18);
            boolean zBooleanValue4 = ((Boolean) c2Var.getF182175a()).booleanValue();
            o0VarE.C(892761509);
            float f19 = zBooleanValue4 ? 1.0f : 0.0f;
            o0VarE.g0(false);
            s1.t1.d dVarC2 = s1.w1.c(t1VarD, fValueOf2, Float.valueOf(f19), bVar.invoke(t1VarD.f(), o0VarE, 0), d2Var2, "FloatAnimation", o0VarE, 0);
            boolean zBooleanValue5 = ((Boolean) o0VarE.A(kotlin.l2.f91259a)).booleanValue();
            h4.r.a aVar = h4.r.S;
            boolean zH = o0VarE.h(zBooleanValue5) | o0VarE.B(dVarC) | ((i15 & 112) == 32) | o0VarE.B(dVarC2);
            Object objQ = o0VarE.q();
            if (zH) {
                cq.m mVar3 = new cq.m(zBooleanValue5, t0Var, p1Var, dVarC, dVarC2);
                o0VarE.K(mVar3);
                objQ = mVar3;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    cq.m mVar4 = new cq.m(zBooleanValue5, t0Var, p1Var, dVarC, dVarC2);
                    o0VarE.K(mVar4);
                    objQ = mVar4;
                }
            }
            int i16 = i15 >> 9;
            int i17 = i15 >> 6;
            ve.a(o4.s0.a(aVar, (e23.l) objQ), r1Var, j8, 0L, f14, f15, uVar, z3.f.c(-1463404422, new a(rVar, d2Var, qVar), o0VarE), o0VarE, (i16 & 896) | (i16 & 112) | 12582912 | (57344 & i17) | (458752 & i17) | (i17 & 3670016), 8);
            o0Var = o0VarE;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(t0Var, p1Var, d2Var, r1Var, j8, f14, f15, uVar, qVar, i14) { // from class: i3.x7

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s1.t0 f90292b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ p3.p1 f90293c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ u1.d2 f90294d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ o4.r1 f90295e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f90296f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ float f90297g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ float f90298h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ u1.u f90299i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ e23.q f90300j;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(385);
                    y7.a(this.f90291a, this.f90292b, this.f90293c, this.f90294d, this.f90295e, this.f90296f, this.f90297g, this.f90298h, this.f90299i, this.f90300j, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void b(e23.p pVar, e23.a aVar, h4.r rVar, e23.p pVar2, e23.p pVar3, boolean z14, w7 w7Var, c2.h2 h2Var, p3.m mVar, int i14) {
        e23.p pVar4;
        int i15;
        e23.a aVar2;
        e23.p pVar5;
        e23.p pVar6;
        p3.o0 o0VarE = mVar.E(-1325192924);
        if ((i14 & 6) == 0) {
            pVar4 = pVar;
            i15 = (o0VarE.r(pVar4) ? 4 : 2) | i14;
        } else {
            pVar4 = pVar;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            aVar2 = aVar;
            i15 |= o0VarE.r(aVar2) ? 32 : 16;
        } else {
            aVar2 = aVar;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(rVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            pVar5 = pVar2;
            i15 |= o0VarE.r(pVar5) ? 2048 : 1024;
        } else {
            pVar5 = pVar2;
        }
        if ((i14 & 24576) == 0) {
            pVar6 = pVar3;
            i15 |= o0VarE.r(pVar6) ? 16384 : 8192;
        } else {
            pVar6 = pVar3;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.h(z14) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.B(w7Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.B(h2Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.B(null) ? 67108864 : 33554432;
        }
        if (o0VarE.n(i15 & 1, (38347923 & i15) != 38347922)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarX = c2.l.x(c2.x2.t(c2.x2.f(u1.w.b(rVar, null, fb.a(0.0f, 6, 0L, true), z14, null, null, aVar2, 24), 1.0f), f90421e, f90418b, f90422f, 8), h2Var);
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            c2.s2 s2VarA = c2.q2.a(c2.j.f22692b, bVar, o0VarE, 48);
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarX, o0VarE);
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
            p3.b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            p3.b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar2);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u2 u2Var = c2.u2.f22900a;
            s7.f89624a.getClass();
            mh.a(s7.c(o0VarE).f89554m, z3.f.c(865999929, new c8(pVar5, w7Var, z14, pVar6, u2Var, pVar4), o0VarE), o0VarE, 48);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e52.d(pVar, aVar, rVar, pVar2, pVar3, z14, w7Var, h2Var, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:4:0x0017  */
    public static final long c(g6.l lVar, g6.l lVar2) {
        float fMin;
        int i14 = lVar2.f76008a;
        int i15 = lVar2.f76011d;
        int i16 = lVar2.f76008a;
        int i17 = lVar2.f76010c;
        int i18 = lVar2.f76009b;
        int i19 = lVar.f76010c;
        int i24 = lVar.f76009b;
        int i25 = lVar.f76011d;
        int i26 = lVar.f76008a;
        float fMin2 = 1.0f;
        if (i14 >= i19) {
            fMin = 0.0f;
        } else if (i17 <= i26) {
            fMin = 1.0f;
        } else if (lVar2.d() == 0) {
            fMin = 0.0f;
        } else {
            fMin = (((Math.min(lVar.f76010c, i17) + Math.max(i26, i16)) / 2) - i16) / lVar2.d();
        }
        if (i18 >= i25) {
            fMin2 = 0.0f;
        } else if (i15 > i24) {
            if (lVar2.b() == 0) {
                fMin2 = 0.0f;
            } else {
                fMin2 = (((Math.min(i25, i15) + Math.max(i24, i18)) / 2) - i18) / lVar2.b();
            }
        }
        return o4.l1.b(fMin, fMin2);
    }
}
