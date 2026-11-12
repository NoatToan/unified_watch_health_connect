package i3;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class d7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f87830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f87831b;

    static {
        n3.w wVar = n3.w.f123291a;
        wVar.getClass();
        wVar.getClass();
        wVar.getClass();
        wVar.getClass();
        wVar.getClass();
        n3.i1 i1Var = n3.i1.BodyLarge;
        n3.u uVar = n3.u.f123261a;
        uVar.getClass();
        uVar.getClass();
        uVar.getClass();
        uVar.getClass();
        g6.f.a aVar = g6.f.f75994b;
        n3.i1 i1Var2 = n3.i1.BodyLarge;
        n3.t tVar = n3.t.f123258a;
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        n3.i1 i1Var3 = n3.i1.BodyLarge;
        f87830a = 20;
        f87831b = 80;
    }

    public static final void a(e23.a aVar, h4.r rVar, o4.r1 r1Var, long j8, long j14, t6 t6Var, e23.q qVar, p3.m mVar, int i14) {
        e23.q qVar2;
        h4.r rVar2;
        o4.r1 r1Var2;
        long j15;
        long j16;
        t6 t6Var2;
        int i15;
        t6 t6VarA;
        o4.r1 r1Var3;
        long j17;
        long j18;
        p3.o0 o0VarE = mVar.E(1039585610);
        int i16 = i14 | (o0VarE.r(aVar) ? 4 : 2) | 1647792;
        if (o0VarE.n(i16 & 1, (4793491 & i16) != 4793490)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                h4.r.a aVar2 = h4.r.S;
                p6 p6Var = p6.f89278a;
                p6Var.getClass();
                p3.x1 x1Var = p3.n.f135158a;
                n3.v.f123278a.getClass();
                o4.r1 r1VarC = fc.c(n3.v.f123279b, o0VarE);
                p6Var.getClass();
                p3.x1 x1Var2 = p3.n.f135158a;
                n3.y.f123319a.getClass();
                long jE = k2.e(n3.y.f123320b, o0VarE);
                long jB = k2.b(jE, o0VarE);
                p6Var.getClass();
                i15 = i16 & (-524161);
                t6VarA = p6.a(0.0f, 0.0f, 15);
                r1Var3 = r1VarC;
                j17 = jE;
                j18 = jB;
                rVar2 = aVar2;
            } else {
                o0VarE.e();
                i15 = i16 & (-524161);
                rVar2 = rVar;
                r1Var3 = r1Var;
                j17 = j8;
                j18 = j14;
                t6VarA = t6Var;
            }
            o0VarE.h0();
            p3.x1 x1Var3 = p3.n.f135158a;
            qVar2 = qVar;
            b(aVar, rVar2, r1Var3, j17, j18, t6VarA, z3.f.c(-1233936436, new a7(qVar2), o0VarE), o0VarE, (i15 & 14) | 14155824, 0);
            r1Var2 = r1Var3;
            j15 = j17;
            j16 = j18;
            t6Var2 = t6VarA;
        } else {
            qVar2 = qVar;
            o0VarE.e();
            rVar2 = rVar;
            r1Var2 = r1Var;
            j15 = j8;
            j16 = j14;
            t6Var2 = t6Var;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a3.b(aVar, rVar2, r1Var2, j15, j16, t6Var2, qVar2, i14);
        }
    }

    public static final void b(final e23.a aVar, final h4.r rVar, o4.r1 r1Var, final long j8, long j14, final t6 t6Var, final e23.p pVar, p3.m mVar, final int i14, final int i15) {
        e23.a aVar2;
        int i16;
        final o4.r1 r1VarC;
        final long jB;
        p3.o0 o0VarE = mVar.E(748201188);
        if ((i14 & 6) == 0) {
            aVar2 = aVar;
            i16 = (o0VarE.r(aVar2) ? 4 : 2) | i14;
        } else {
            aVar2 = aVar;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            if ((i15 & 4) == 0) {
                r1VarC = r1Var;
                int i17 = o0VarE.B(r1VarC) ? 256 : 128;
                i16 |= i17;
            } else {
                r1VarC = r1Var;
            }
            i16 |= i17;
        } else {
            r1VarC = r1Var;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.l(j8) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            if ((i15 & 16) == 0) {
                jB = j14;
                int i18 = o0VarE.l(jB) ? 16384 : 8192;
                i16 |= i18;
            } else {
                jB = j14;
            }
            i16 |= i18;
        } else {
            jB = j14;
        }
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.B(t6Var) ? 131072 : 65536;
        }
        if ((i15 & 64) != 0) {
            i16 |= 1572864;
        } else if ((i14 & 1572864) == 0) {
            i16 |= o0VarE.B(null) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i16 |= o0VarE.r(pVar) ? 8388608 : 4194304;
        }
        if (o0VarE.n(i16 & 1, (4793491 & i16) != 4793490)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                if ((i15 & 4) != 0) {
                    p6.f89278a.getClass();
                    p3.x1 x1Var = p3.n.f135158a;
                    n3.x.f123299a.getClass();
                    r1VarC = fc.c(n3.x.f123301c, o0VarE);
                    i16 &= -897;
                }
                if ((i15 & 16) != 0) {
                    jB = k2.b(j8, o0VarE);
                    i16 &= -57345;
                }
            } else {
                o0VarE.e();
                if ((i15 & 4) != 0) {
                    i16 &= -897;
                }
                if ((i15 & 16) != 0) {
                    i16 &= -57345;
                }
            }
            long j15 = jB;
            o0VarE.h0();
            p3.x1 x1Var2 = p3.n.f135158a;
            n3.v.f123278a.getClass();
            s5.x0 x0VarA = sj.a(n3.v.f123280c, o0VarE);
            n3.x.f123299a.getClass();
            o4.r1 r1Var2 = r1VarC;
            int i19 = i16 << 9;
            c(aVar2, x0VarA, n3.x.f123302d, n3.x.f123300b, rVar, r1Var2, j8, j15, t6Var, pVar, o0VarE, (i16 & 14) | 3456 | (57344 & i19) | (458752 & i19) | (3670016 & i19) | (29360128 & i19) | (234881024 & i19) | (i19 & 1879048192), (i16 >> 21) & 14);
            r1VarC = r1Var2;
            jB = j15;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: i3.y6
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d7.b(aVar, rVar, r1VarC, j8, jB, t6Var, pVar, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final e23.a aVar, final s5.x0 x0Var, final float f14, final float f15, final h4.r rVar, final o4.r1 r1Var, final long j8, final long j14, final t6 t6Var, final e23.p pVar, p3.m mVar, final int i14, final int i15) {
        int i16;
        s5.x0 x0Var2;
        float f16;
        o4.r1 r1Var2;
        e23.p pVar2;
        int i17;
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(121669932);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            x0Var2 = x0Var;
            i16 |= o0VarE.B(x0Var2) ? 32 : 16;
        } else {
            x0Var2 = x0Var;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.i(f14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            f16 = f15;
            i16 |= o0VarE.i(f16) ? 2048 : 1024;
        } else {
            f16 = f15;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.B(rVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            r1Var2 = r1Var;
            i16 |= o0VarE.B(r1Var2) ? 131072 : 65536;
        } else {
            r1Var2 = r1Var;
        }
        if ((1572864 & i14) == 0) {
            i16 |= o0VarE.l(j8) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i16 |= o0VarE.l(j14) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i16 |= o0VarE.B(t6Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i14) == 0) {
            i16 |= o0VarE.B(null) ? 536870912 : 268435456;
        }
        if ((i15 & 6) == 0) {
            pVar2 = pVar;
            i17 = i15 | (o0VarE.r(pVar2) ? 4 : 2);
        } else {
            pVar2 = pVar;
            i17 = i15;
        }
        boolean z14 = true;
        if (o0VarE.n(i16 & 1, ((i16 & 306783379) == 306783378 && (i17 & 3) == 2) ? false : true)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            o0VarE.C(-282833393);
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
                objQ2 = new i11.f(18);
                o0VarE.K(objQ2);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ2, rVar, false);
            float f17 = t6Var.f89761a;
            int i18 = i16 >> 21;
            int i19 = i18 & 112;
            boolean zB = o0VarE.B(jVar);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                objQ3 = new w6(t6Var.f89761a, t6Var.f89762b, t6Var.f89764d, t6Var.f89763c, null);
                o0VarE.K(objQ3);
            }
            w6 w6Var = (w6) objQ3;
            boolean zR = o0VarE.r(w6Var);
            if (((i19 ^ 48) <= 32 || !o0VarE.B(t6Var)) && (i18 & 48) != 32) {
                z14 = false;
            }
            boolean z15 = zR | z14;
            Object objQ4 = o0VarE.q();
            if (z15 || objQ4 == c2565a) {
                objQ4 = new q6(w6Var, t6Var, null);
                o0VarE.K(objQ4);
            }
            p3.l0.e((e23.p) objQ4, t6Var, o0VarE);
            boolean zB2 = o0VarE.B(jVar) | o0VarE.r(w6Var);
            Object objQ5 = o0VarE.q();
            if (zB2 || objQ5 == c2565a) {
                objQ5 = new s6(jVar, w6Var, null);
                o0VarE.K(objQ5);
            }
            p3.l0.e((e23.p) objQ5, jVar, o0VarE);
            int i24 = i16 & 14;
            int i25 = i16 >> 6;
            o0Var = o0VarE;
            ve.c(aVar, rVarC, false, r1Var2, j8, j14, f17, ((g6.f) w6Var.f90097e.f155489c.f155628b.getF182175a()).f75997a, null, jVar, z3.f.c(-1779603465, new c7(j14, x0Var2, f14, f16, pVar2), o0VarE), o0Var, i24 | (i25 & 7168) | (57344 & i25) | (i25 & 458752), 260);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: i3.z6
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i14 | 1);
                    int iT2 = p3.p0.t(i15);
                    d7.c(aVar, x0Var, f14, f15, rVar, r1Var, j8, j14, t6Var, pVar, (p3.m) obj, iT, iT2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void d(final e23.a aVar, h4.r rVar, final o4.r1 r1Var, final long j8, final long j14, t6 t6Var, final e23.p pVar, p3.m mVar, final int i14, final int i15) {
        h4.r rVar2;
        int i16;
        final t6 t6Var2;
        final h4.r rVar3;
        t6 t6VarA;
        int i17;
        h4.r rVar4;
        p3.o0 o0VarE = mVar.E(26608441);
        int i18 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        int i19 = i15 & 2;
        if (i19 != 0) {
            i16 = i18 | 48;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i16 = i18 | (o0VarE.B(rVar2) ? 32 : 16);
        }
        int i24 = i16 | (o0VarE.B(r1Var) ? 256 : 128) | (o0VarE.l(j8) ? 2048 : 1024) | (o0VarE.l(j14) ? 16384 : 8192) | 1638400;
        if (o0VarE.n(i24 & 1, (4793491 & i24) != 4793490)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                h4.r rVar5 = i19 != 0 ? h4.r.S : rVar2;
                p6.f89278a.getClass();
                t6VarA = p6.a(0.0f, 0.0f, 15);
                h4.r rVar6 = rVar5;
                i17 = i24 & (-458753);
                rVar4 = rVar6;
            } else {
                o0VarE.e();
                i17 = i24 & (-458753);
                rVar4 = rVar2;
                t6VarA = t6Var;
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            n3.z.f123332a.getClass();
            t6 t6Var3 = t6VarA;
            b(aVar, c2.x2.t(rVar4, n3.z.f123334c, n3.z.f123333b, 0.0f, 12), r1Var, j8, j14, t6Var3, pVar, o0VarE, i17 & 33554318, 0);
            rVar3 = rVar4;
            t6Var2 = t6Var3;
        } else {
            o0VarE.e();
            t6Var2 = t6Var;
            rVar3 = rVar2;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(rVar3, r1Var, j8, j14, t6Var2, pVar, i14, i15) { // from class: i3.x6

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h4.r f90284b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ o4.r1 f90285c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f90286d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f90287e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ t6 f90288f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ e23.p f90289g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ int f90290h;

                {
                    this.f90290h = i15;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(12582913);
                    d7.d(this.f90283a, this.f90284b, this.f90285c, this.f90286d, this.f90287e, this.f90288f, this.f90289g, (p3.m) obj, iT, this.f90290h);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
