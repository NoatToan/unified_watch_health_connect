package i3;

import com.google.android.exoplayer2.C;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li3/wg;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class wg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wg f90137a = new wg();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f90138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f90139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f90140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f90141e;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f90142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f90143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a2.i f90144c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ sg f90145d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ o4.r1 f90146e;

        public a(boolean z14, boolean z15, a2.i iVar, sg sgVar, o4.r1 r1Var) {
            this.f90142a = z14;
            this.f90143b = z15;
            this.f90144c = iVar;
            this.f90145d = sgVar;
            this.f90146e = r1Var;
        }

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                wg wgVar = wg.f90137a;
                h4.r.a aVar = h4.r.S;
                wgVar.getClass();
                wgVar.a(this.f90142a, this.f90143b, this.f90144c, aVar, this.f90145d, this.f90146e, wg.f90141e, wg.f90140d, mVar2, 114822144);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements e23.q<gh, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.p<p3.m, Integer, Unit> f90147a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(e23.p<? super p3.m, ? super Integer, Unit> pVar) {
            this.f90147a = pVar;
        }

        @Override // e23.q
        public final Unit invoke(gh ghVar, p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                p3.x1 x1Var = p3.n.f135158a;
                this.f90147a.invoke(mVar2, 0);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class c implements o4.j0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f90148a;

        public c(e23.a aVar) {
            this.f90148a = aVar;
        }

        @Override // o4.j0
        public final /* synthetic */ long a() {
            return ((o4.d0) this.f90148a.invoke()).f128833a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof o4.j0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f90148a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    static {
        g6.f.a aVar = g6.f.f75994b;
        f90138b = 56;
        f90139c = 280;
        f90140d = 1;
        f90141e = 2;
    }

    private wg() {
    }

    public static sg c(long j8, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26, long j27, long j28, long j29, p3.m mVar, int i14) {
        long j34;
        long j35;
        long j36;
        long j37;
        long j38;
        long j39;
        long j44;
        long j45;
        if ((i14 & 1) != 0) {
            o4.d0.f128823b.getClass();
            j34 = o4.d0.f128832k;
        } else {
            j34 = j8;
        }
        if ((i14 & 2) != 0) {
            o4.d0.f128823b.getClass();
            j35 = o4.d0.f128832k;
        } else {
            j35 = j14;
        }
        o4.d0.a aVar = o4.d0.f128823b;
        aVar.getClass();
        long j46 = o4.d0.f128832k;
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        if ((i14 & 2048) != 0) {
            aVar.getClass();
            j36 = j46;
        } else {
            j36 = j18;
        }
        if ((i14 & 4096) != 0) {
            aVar.getClass();
            j37 = j46;
        } else {
            j37 = j19;
        }
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        if ((524288 & i14) != 0) {
            aVar.getClass();
            j38 = j46;
        } else {
            j38 = j26;
        }
        if ((1048576 & i14) != 0) {
            aVar.getClass();
            j39 = j46;
        } else {
            j39 = j27;
        }
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        if ((134217728 & i14) != 0) {
            aVar.getClass();
            j44 = j46;
        } else {
            j44 = j28;
        }
        if ((i14 & 268435456) != 0) {
            aVar.getClass();
            j45 = j46;
        } else {
            j45 = j29;
        }
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        p3.x1 x1Var = p3.n.f135158a;
        s7.f89624a.getClass();
        return d(s7.a(mVar), (z2.t2) mVar.A(z2.u2.f201804a)).a(j34, j35, j46, j46, j15, j16, j46, j46, j17, j46, null, j36, j37, j46, j46, j24, j25, j46, j46, j38, j39, j46, j46, j46, j46, j46, j46, j44, j45, j46, j46, j46, j46, j46, j46, j46, j46, j46, j46, j46, j46, j46, j46);
    }

    public static sg d(j2 j2Var, z2.t2 t2Var) {
        sg sgVar = j2Var.f88498n0;
        if (sgVar != null) {
            if (p005kotlin.jvm.internal.s.g(sgVar.f89685k, t2Var)) {
                return sgVar;
            }
            sg sgVarA = sgVar.a(sgVar.f89675a, sgVar.f89676b, sgVar.f89677c, sgVar.f89678d, sgVar.f89679e, sgVar.f89680f, sgVar.f89681g, sgVar.f89682h, sgVar.f89683i, sgVar.f89684j, t2Var, sgVar.f89686l, sgVar.f89687m, sgVar.f89688n, sgVar.f89689o, sgVar.f89690p, sgVar.f89691q, sgVar.f89692r, sgVar.f89693s, sgVar.f89694t, sgVar.f89695u, sgVar.f89696v, sgVar.f89697w, sgVar.f89698x, sgVar.f89699y, sgVar.f89700z, sgVar.A, sgVar.B, sgVar.C, sgVar.D, sgVar.E, sgVar.F, sgVar.G, sgVar.H, sgVar.I, sgVar.J, sgVar.K, sgVar.L, sgVar.M, sgVar.N, sgVar.O, sgVar.P, sgVar.Q);
            j2Var.f88498n0 = sgVarA;
            return sgVarA;
        }
        n3.c0.f122715a.getClass();
        long jD = k2.d(j2Var, n3.c0.f122740z);
        long jD2 = k2.d(j2Var, n3.c0.E);
        n3.m mVar = n3.c0.f122722h;
        long jD3 = k2.d(j2Var, mVar);
        float f14 = n3.c0.f122723i;
        long jC = o4.d0.c(f14, jD3, 14);
        long jD4 = k2.d(j2Var, n3.c0.f122734t);
        n3.m mVar2 = n3.c0.f122718d;
        long jD5 = k2.d(j2Var, mVar2);
        long jD6 = k2.d(j2Var, mVar2);
        long jD7 = k2.d(j2Var, mVar2);
        long jD8 = k2.d(j2Var, mVar2);
        long jD9 = k2.d(j2Var, n3.c0.f122717c);
        long jD10 = k2.d(j2Var, n3.c0.f122733s);
        long jD11 = k2.d(j2Var, n3.c0.f122739y);
        long jD12 = k2.d(j2Var, n3.c0.f122716b);
        long jC2 = o4.d0.c(n3.c0.f122721g, k2.d(j2Var, n3.c0.f122720f), 14);
        long jD13 = k2.d(j2Var, n3.c0.f122732r);
        long jD14 = k2.d(j2Var, n3.c0.B);
        long jD15 = k2.d(j2Var, n3.c0.J);
        long jC3 = o4.d0.c(n3.c0.f122727m, k2.d(j2Var, n3.c0.f122726l), 14);
        long jD16 = k2.d(j2Var, n3.c0.f122736v);
        long jD17 = k2.d(j2Var, n3.c0.D);
        long jD18 = k2.d(j2Var, n3.c0.L);
        long jC4 = o4.d0.c(n3.c0.f122731q, k2.d(j2Var, n3.c0.f122730p), 14);
        long jD19 = k2.d(j2Var, n3.c0.f122738x);
        long jD20 = k2.d(j2Var, n3.c0.A);
        long jD21 = k2.d(j2Var, n3.c0.I);
        long jC5 = o4.d0.c(n3.c0.f122725k, k2.d(j2Var, n3.c0.f122724j), 14);
        long jD22 = k2.d(j2Var, n3.c0.f122735u);
        n3.m mVar3 = n3.c0.F;
        long jD23 = k2.d(j2Var, mVar3);
        long jD24 = k2.d(j2Var, mVar3);
        long jC6 = o4.d0.c(f14, k2.d(j2Var, mVar), 14);
        long jD25 = k2.d(j2Var, mVar3);
        long jD26 = k2.d(j2Var, n3.c0.C);
        long jD27 = k2.d(j2Var, n3.c0.K);
        long jC7 = o4.d0.c(n3.c0.f122729o, k2.d(j2Var, n3.c0.f122728n), 14);
        long jD28 = k2.d(j2Var, n3.c0.f122737w);
        n3.m mVar4 = n3.c0.G;
        long jD29 = k2.d(j2Var, mVar4);
        long jD30 = k2.d(j2Var, mVar4);
        long jC8 = o4.d0.c(f14, k2.d(j2Var, mVar4), 14);
        long jD31 = k2.d(j2Var, mVar4);
        n3.m mVar5 = n3.c0.H;
        sg sgVar2 = new sg(jD, jD2, jC, jD4, jD5, jD6, jD7, jD8, jD9, jD10, t2Var, jD11, jD12, jC2, jD13, jD14, jD15, jC3, jD16, jD17, jD18, jC4, jD19, jD20, jD21, jC5, jD22, jD23, jD24, jC6, jD25, jD26, jD27, jC7, jD28, jD29, jD30, jC8, jD31, k2.d(j2Var, mVar5), k2.d(j2Var, mVar5), o4.d0.c(f14, k2.d(j2Var, mVar5), 14), k2.d(j2Var, mVar5), null);
        j2Var.f88498n0 = sgVar2;
        return sgVar2;
    }

    public static o4.r1 e(p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        n3.c0.f122715a.getClass();
        return fc.c(n3.c0.f122719e, mVar);
    }

    public static c2.l2 f(wg wgVar) {
        float f14 = l3.k2.f109300a;
        g6.f.a aVar = g6.f.f75994b;
        wgVar.getClass();
        return c2.l.d(f14, l3.k2.f109303d, f14, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(final boolean z14, final boolean z15, final a2.i iVar, h4.r rVar, final sg sgVar, final o4.r1 r1Var, final float f14, final float f15, p3.m mVar, final int i14) {
        h4.r rVar2;
        long j8;
        p3.o0 o0VarE = mVar.E(-818661242);
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.h(z15) ? 32 : 16) | (o0VarE.B(iVar) ? 256 : 128) | (o0VarE.B(sgVar) ? 16384 : 8192) | (o0VarE.B(r1Var) ? 131072 : 65536);
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (38347923 & i15) != 38347922)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            boolean zBooleanValue = ((Boolean) xy2.b.k(iVar, o0VarE, (i15 >> 6) & 14).getF182175a()).booleanValue();
            if (!z14) {
                j8 = sgVar.f89681g;
            } else if (z15) {
                j8 = sgVar.f89682h;
            } else {
                j8 = zBooleanValue ? sgVar.f89679e : sgVar.f89680f;
            }
            final p3.x3 x3VarA = r1.f2.a(j8, k9.b(n3.h0.FastEffects, o0VarE), o0VarE);
            c cVar = new c(new p005kotlin.jvm.internal.g0(x3VarA) { // from class: i3.vg
                @Override // p005kotlin.jvm.internal.g0, k23.m
                public final Object get() {
                    return ((p3.x3) this.receiver).getF182175a();
                }
            });
            float f16 = l3.k2.f109300a;
            rVar2 = rVar;
            c2.q.a(l4.k.e(rVar2, new l3.p1(i16, r1Var, cVar)).then(new k7(z14, z15, iVar, sgVar, r1Var, f14, f15, null)), o0VarE, 0);
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final h4.r rVar3 = rVar2;
            p2VarI0.f135219d = new e23.p(z14, z15, iVar, rVar3, sgVar, r1Var, f14, f15, i14) { // from class: i3.ug

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f89941b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f89942c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ a2.i f89943d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ h4.r f89944e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ sg f89945f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ o4.r1 f89946g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ float f89947h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ float f89948i;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    wg wgVar = wg.f90137a;
                    this.f89940a.a(this.f89941b, this.f89942c, this.f89943d, this.f89944e, this.f89945f, this.f89946g, this.f89947h, this.f89948i, mVar2, p3.p0.t(114822145));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:197:0x0299  */
    public final void b(final String str, final e23.p<? super p3.m, ? super Integer, Unit> pVar, final boolean z14, final boolean z15, final x5.r0 r0Var, final a2.i iVar, boolean z16, e23.p<? super p3.m, ? super Integer, Unit> pVar2, final e23.p<? super p3.m, ? super Integer, Unit> pVar3, e23.p<? super p3.m, ? super Integer, Unit> pVar4, e23.p<? super p3.m, ? super Integer, Unit> pVar5, e23.p<? super p3.m, ? super Integer, Unit> pVar6, e23.p<? super p3.m, ? super Integer, Unit> pVar7, e23.p<? super p3.m, ? super Integer, Unit> pVar8, final o4.r1 r1Var, final sg sgVar, c2.h2 h2Var, e23.p<? super p3.m, ? super Integer, Unit> pVar9, p3.m mVar, final int i14, final int i15, final int i16) {
        int i17;
        boolean z17;
        a2.i iVar2;
        boolean z18;
        e23.p<? super p3.m, ? super Integer, Unit> pVar10;
        e23.p<? super p3.m, ? super Integer, Unit> pVar11;
        int i18;
        int i19;
        int i24;
        int i25;
        p3.o0 o0Var;
        final e23.p<? super p3.m, ? super Integer, Unit> pVar12;
        final e23.p<? super p3.m, ? super Integer, Unit> pVar13;
        final c2.h2 h2Var2;
        final e23.p<? super p3.m, ? super Integer, Unit> pVar14;
        final e23.p<? super p3.m, ? super Integer, Unit> pVar15;
        final boolean z19;
        final e23.p<? super p3.m, ? super Integer, Unit> pVar16;
        final e23.p<? super p3.m, ? super Integer, Unit> pVar17;
        final e23.p<? super p3.m, ? super Integer, Unit> pVar18;
        int i26;
        c2.h2 h2Var3;
        e23.p<? super p3.m, ? super Integer, Unit> pVarC;
        e23.p<? super p3.m, ? super Integer, Unit> pVar19;
        e23.p<? super p3.m, ? super Integer, Unit> pVar20;
        e23.p<? super p3.m, ? super Integer, Unit> pVar21;
        e23.p<? super p3.m, ? super Integer, Unit> pVar22;
        c2.h2 h2Var4;
        e23.p<? super p3.m, ? super Integer, Unit> pVar23;
        e23.p<? super p3.m, ? super Integer, Unit> pVar24;
        c2.l2 l2VarD;
        p3.o0 o0VarE = mVar.E(1806980801);
        if ((i14 & 6) == 0) {
            i17 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            i17 |= o0VarE.r(pVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i17 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            z17 = z15;
            i17 |= o0VarE.h(z17) ? 2048 : 1024;
        } else {
            z17 = z15;
        }
        if ((i14 & 24576) == 0) {
            i17 |= o0VarE.B(r0Var) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            iVar2 = iVar;
            i17 |= o0VarE.B(iVar2) ? 131072 : 65536;
        } else {
            iVar2 = iVar;
        }
        int i27 = i16 & 64;
        int i28 = 524288;
        if (i27 != 0) {
            i17 |= 1572864;
            z18 = z16;
        } else {
            z18 = z16;
            if ((i14 & 1572864) == 0) {
                i17 |= o0VarE.h(z18) ? 1048576 : 524288;
            }
        }
        int i29 = i16 & 128;
        if (i29 != 0) {
            i17 |= 12582912;
            pVar10 = pVar2;
        } else {
            pVar10 = pVar2;
            if ((i14 & 12582912) == 0) {
                i17 |= o0VarE.r(pVar10) ? 8388608 : 4194304;
            }
        }
        if ((i14 & 100663296) == 0) {
            i17 |= o0VarE.r(pVar3) ? 67108864 : 33554432;
        }
        int i30 = i16 & 512;
        if (i30 != 0) {
            i17 |= C.ENCODING_PCM_32BIT;
            pVar11 = pVar4;
        } else {
            pVar11 = pVar4;
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                i17 |= o0VarE.r(pVar11) ? 536870912 : 268435456;
            }
        }
        int i34 = i16 & 1024;
        if (i34 != 0) {
            i18 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i18 = i15 | (o0VarE.r(pVar5) ? 4 : 2);
        } else {
            i18 = i15;
        }
        int i35 = i16 & 2048;
        if (i35 != 0) {
            i19 = i18 | 48;
        } else {
            i19 = i18 | (o0VarE.r(pVar6) ? 32 : 16);
        }
        int i36 = i19;
        int i37 = i16 & 4096;
        if (i37 != 0) {
            i24 = i36 | 384;
        } else {
            i24 = i36 | (o0VarE.r(pVar7) ? 256 : 128);
        }
        int i38 = i16 & 8192;
        if (i38 != 0) {
            i25 = i24 | 3072;
        } else {
            i25 = i24 | (o0VarE.r(pVar8) ? 2048 : 1024);
        }
        int i39 = i25 | (o0VarE.B(r1Var) ? 16384 : 8192) | (o0VarE.B(sgVar) ? 131072 : 65536);
        if ((i15 & 1572864) == 0) {
            if ((i16 & 65536) == 0 && o0VarE.B(h2Var)) {
                i28 = 1048576;
            }
            i39 |= i28;
        }
        int i44 = i39 | 12582912;
        if (o0VarE.n(i17 & 1, ((i17 & 306783379) == 306783378 && (i44 & 38347923) == 38347922) ? false : true)) {
            o0VarE.G0();
            z3.e eVarC = null;
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                boolean z24 = i27 != 0 ? false : z18;
                e23.p<? super p3.m, ? super Integer, Unit> pVar25 = i29 != 0 ? null : pVar10;
                if (i30 != 0) {
                    pVar11 = null;
                }
                e23.p<? super p3.m, ? super Integer, Unit> pVar26 = i34 != 0 ? null : pVar5;
                e23.p<? super p3.m, ? super Integer, Unit> pVar27 = i35 != 0 ? null : pVar6;
                e23.p<? super p3.m, ? super Integer, Unit> pVar28 = i37 != 0 ? null : pVar7;
                e23.p<? super p3.m, ? super Integer, Unit> pVar29 = i38 != 0 ? null : pVar8;
                if ((i16 & 65536) != 0) {
                    if (pVar25 == null) {
                        float f14 = l3.k2.f109300a;
                        l2VarD = c2.l.d(f14, f14, f14, f14);
                    } else {
                        float f15 = l3.k2.f109300a;
                        float f16 = eh.f88030a;
                        l2VarD = c2.l.d(f15, f16, f15, f16);
                    }
                    i26 = i44 & (-3670017);
                    h2Var3 = l2VarD;
                } else {
                    i26 = i44;
                    h2Var3 = h2Var;
                }
                pVarC = z3.f.c(417908150, new a(z14, z24, iVar2, sgVar, r1Var), o0VarE);
                pVar19 = pVar26;
                pVar20 = pVar27;
                pVar21 = pVar29;
                pVar22 = pVar11;
                h2Var4 = h2Var3;
                pVar23 = pVar25;
                z18 = z24;
                pVar24 = pVar28;
            } else {
                o0VarE.e();
                if ((i16 & 65536) != 0) {
                    i44 &= -3670017;
                }
                pVar20 = pVar6;
                pVar21 = pVar8;
                pVarC = pVar9;
                pVar22 = pVar11;
                pVar23 = pVar10;
                i26 = i44;
                pVar19 = pVar5;
                pVar24 = pVar7;
                h2Var4 = h2Var;
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            boolean z25 = ((i17 & 57344) == 16384) | ((i17 & 14) == 4);
            Object objQ = o0VarE.q();
            if (z25) {
                objQ = r0Var.a(new s5.c(str, null, 2, null));
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = r0Var.a(new s5.c(str, null, 2, null));
                    o0VarE.K(objQ);
                }
            }
            String str2 = ((x5.q0) objQ).f188939a.f157138b;
            l3.l2 l2Var = l3.l2.Filled;
            fh.b bVar = new fh.b(false, null, null, 7, null);
            if (pVar23 == null) {
                o0VarE.C(-1353131191);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1353131190);
                eVarC = z3.f.c(1110058497, new b(pVar23), o0VarE);
                o0VarE.g0(false);
            }
            int i45 = i17 >> 9;
            int i46 = i26 << 21;
            o0Var = o0VarE;
            boolean z26 = z18;
            l3.k2.a(l2Var, str2, pVar, bVar, eVarC, pVar3, pVar22, pVar19, pVar20, pVar24, pVar21, z17, z14, z26, iVar, h2Var4, sgVar, pVarC, o0Var, ((i17 << 3) & 896) | 6 | (i45 & 458752) | (i45 & 3670016) | (i46 & 29360128) | (i46 & 234881024) | (i46 & 1879048192), ((i26 >> 9) & 14) | ((i17 >> 6) & 112) | (i17 & 896) | (i45 & 7168) | ((i17 >> 3) & 57344) | ((i26 >> 3) & 458752) | ((i26 << 3) & 3670016) | 12582912);
            pVar16 = pVar23;
            pVar15 = pVar22;
            pVar17 = pVar19;
            pVar12 = pVar20;
            pVar18 = pVar24;
            pVar13 = pVar21;
            z19 = z26;
            h2Var2 = h2Var4;
            pVar14 = pVarC;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            pVar12 = pVar6;
            pVar13 = pVar8;
            h2Var2 = h2Var;
            pVar14 = pVar9;
            pVar15 = pVar11;
            z19 = z18;
            pVar16 = pVar10;
            pVar17 = pVar5;
            pVar18 = pVar7;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: i3.tg
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wg wgVar = wg.f90137a;
                    int iT = p3.p0.t(i14 | 1);
                    int iT2 = p3.p0.t(i15);
                    this.f89804a.b(str, pVar, z14, z15, r0Var, iVar, z19, pVar16, pVar3, pVar15, pVar17, pVar12, pVar18, pVar13, r1Var, sgVar, h2Var2, pVar14, (p3.m) obj, iT, iT2, i16);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
