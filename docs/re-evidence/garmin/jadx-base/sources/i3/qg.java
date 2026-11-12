package i3;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class qg {
    @o13.e
    public static final void a(final int i14, h4.r rVar, final long j8, long j14, final float f14, final z3.e eVar, final e23.p pVar, final z3.e eVar2, p3.m mVar, final int i15) {
        final h4.r rVar2;
        final long j15;
        long jE;
        int i16;
        h4.r rVar3;
        p3.o0 o0VarE = mVar.E(847049916);
        int i17 = i15 | (o0VarE.k(i14) ? 4 : 2) | 48 | (o0VarE.l(j8) ? 256 : 128) | 1024;
        if (o0VarE.n(i17 & 1, (4793491 & i17) != 4793490)) {
            o0VarE.G0();
            if ((i15 & 1) == 0 || o0VarE.o0()) {
                h4.r.a aVar = h4.r.S;
                yf.f90469a.getClass();
                p3.x1 x1Var = p3.n.f135158a;
                n3.q0.f123226a.getClass();
                jE = k2.e(n3.q0.f123230e, o0VarE);
                i16 = i17 & (-7169);
                rVar3 = aVar;
            } else {
                o0VarE.e();
                i16 = i17 & (-7169);
                rVar3 = rVar;
                jE = j14;
            }
            o0VarE.h0();
            p3.x1 x1Var2 = p3.n.f135158a;
            c(i14, eVar, rVar3, j8, jE, f14, pVar, eVar2, u1.a2.a(o0VarE), o0VarE, ((i16 << 3) & 7168) | (i16 & 14) | 432 | 14352384);
            rVar2 = rVar3;
            j15 = jE;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            j15 = j14;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(i14, rVar2, j8, j15, f14, eVar, pVar, eVar2, i15) { // from class: i3.cg

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f87784a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h4.r f87785b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f87786c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f87787d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ float f87788e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ z3.e f87789f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ e23.p f87790g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ z3.e f87791h;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(14376961);
                    qg.a(this.f87784a, this.f87785b, this.f87786c, this.f87787d, this.f87788e, this.f87789f, this.f87790g, this.f87791h, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void b(final float f14, final float f15, final int i14, final int i15, final long j8, final long j14, final e23.p pVar, final h4.r rVar, p3.m mVar, final u1.d2 d2Var, final z3.e eVar, final z3.e eVar2) {
        int i16;
        float f16;
        e23.p pVar2;
        z3.e eVar3;
        p3.o0 o0VarE = mVar.E(414860860);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.k(i14) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.l(j8) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= o0VarE.l(j14) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= o0VarE.i(f14) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            f16 = f15;
            i16 |= o0VarE.i(f16) ? 131072 : 65536;
        } else {
            f16 = f15;
        }
        if ((1572864 & i15) == 0) {
            i16 |= o0VarE.B(d2Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i15 & 12582912) == 0) {
            i16 |= o0VarE.r(eVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i15) == 0) {
            pVar2 = pVar;
            i16 |= o0VarE.r(pVar2) ? 67108864 : 33554432;
        } else {
            pVar2 = pVar;
        }
        if ((805306368 & i15) == 0) {
            eVar3 = eVar2;
            i16 |= o0VarE.r(eVar3) ? 536870912 : 268435456;
        } else {
            eVar3 = eVar2;
        }
        if (o0VarE.n(i16 & 1, (306783379 & i16) != 306783378)) {
            p3.x1 x1Var = p3.n.f135158a;
            ve.a(rVar, null, j8, j14, 0.0f, 0.0f, null, z3.f.c(1878374785, new jg(d2Var, pVar2, eVar3, f14, f16, i14, eVar), o0VarE), o0VarE, ((i16 >> 3) & 14) | 12582912 | (i16 & 896) | (i16 & 7168), 114);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: i3.eg
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i15 | 1);
                    qg.b(f14, f15, i14, iT, j8, j14, pVar, rVar, (p3.m) obj, d2Var, eVar, eVar2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void c(final int i14, final z3.e eVar, final h4.r rVar, final long j8, final long j14, final float f14, final e23.p pVar, final z3.e eVar2, final u1.d2 d2Var, p3.m mVar, final int i15) {
        int i16;
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(901781420);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.k(i14) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.r(eVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.B(rVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= o0VarE.l(j8) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= o0VarE.l(j14) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i16 |= o0VarE.i(f14) ? 131072 : 65536;
        }
        if ((1572864 & i15) == 0) {
            i16 |= o0VarE.r(pVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i15 & 12582912) == 0) {
            i16 |= o0VarE.r(eVar2) ? 8388608 : 4194304;
        }
        if ((100663296 & i15) == 0) {
            i16 |= o0VarE.B(d2Var) ? 67108864 : 33554432;
        }
        if (o0VarE.n(i16 & 1, (38347923 & i16) != 38347922)) {
            o0VarE.G0();
            if ((i15 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            int i17 = ((i16 >> 6) & 14) | 12582912;
            int i18 = i16 >> 3;
            o0Var = o0VarE;
            ve.a(rVar, null, j8, j14, 0.0f, 0.0f, null, z3.f.c(2077251399, new mg(d2Var, f14, eVar2, pVar, eVar, i14), o0VarE), o0Var, i17 | (i18 & 896) | (i18 & 7168), 114);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: i3.dg
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qg.c(i14, eVar, rVar, j8, j14, f14, pVar, eVar2, d2Var, (p3.m) obj, p3.p0.t(i15 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void d(final float f14, float f15, final int i14, final int i15, final long j8, final long j14, final e23.p pVar, final h4.r rVar, p3.m mVar, u1.d2 d2Var, final z3.e eVar, final z3.e eVar2) {
        final float f16;
        final u1.d2 d2Var2;
        int i16;
        float f17;
        u1.d2 d2Var3;
        p3.o0 o0VarE = mVar.E(519094802);
        int i17 = i15 | (o0VarE.k(i14) ? 4 : 2) | 128 | (o0VarE.l(j8) ? 2048 : 1024) | (o0VarE.l(j14) ? 16384 : 8192) | (o0VarE.i(f14) ? 131072 : 65536) | 100663296;
        if (o0VarE.n(i17 & 1, (306783379 & i17) != 306783378)) {
            o0VarE.G0();
            if ((i15 & 1) == 0 || o0VarE.o0()) {
                u1.d2 d2VarA = u1.a2.a(o0VarE);
                i16 = i17 & (-897);
                yf.f90469a.getClass();
                f17 = yf.f90470b;
                d2Var3 = d2VarA;
            } else {
                o0VarE.e();
                i16 = i17 & (-897);
                f17 = f15;
                d2Var3 = d2Var;
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            int i18 = i16 & 126;
            int i19 = i16 >> 3;
            b(f14, f17, i14, (i19 & 57344) | i18 | (i19 & 896) | (i19 & 7168) | 918749184, j8, j14, pVar, rVar, o0VarE, d2Var3, eVar, eVar2);
            f16 = f17;
            d2Var2 = d2Var3;
        } else {
            o0VarE.e();
            f16 = f15;
            d2Var2 = d2Var;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(f14, f16, i14, i15, j8, j14, pVar, rVar, d2Var2, eVar, eVar2) { // from class: i3.bg

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f87598a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h4.r f87599b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ u1.d2 f87600c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f87601d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f87602e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ float f87603f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ z3.e f87604g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ e23.p f87605h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ float f87606i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ z3.e f87607j;

                {
                    this.f87599b = rVar;
                    this.f87600c = d2Var2;
                    this.f87601d = j8;
                    this.f87602e = j14;
                    this.f87604g = eVar;
                    this.f87605h = pVar;
                    this.f87607j = eVar2;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(819462193);
                    qg.d(this.f87603f, this.f87606i, this.f87598a, iT, this.f87601d, this.f87602e, this.f87605h, this.f87599b, (p3.m) obj, this.f87600c, this.f87604g, this.f87607j);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    @o13.e
    public static final void e(final int i14, h4.r rVar, final long j8, long j14, final z3.e eVar, final e23.p pVar, final z3.e eVar2, p3.m mVar, final int i15, final int i16) {
        long jE;
        int i17;
        boolean z14;
        final h4.r rVar2;
        final long j15;
        p3.p2 p2VarI0;
        long j16;
        h4.r rVar3;
        p3.o0 o0VarE = mVar.E(1445190381);
        int i18 = i15 | (o0VarE.k(i14) ? 4 : 2) | 48 | (o0VarE.l(j8) ? 256 : 128);
        if ((i16 & 8) == 0) {
            jE = j14;
            int i19 = o0VarE.l(jE) ? 2048 : 1024;
            i17 = i18 | i19;
            if ((599187 & i17) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                o0VarE.G0();
                if ((i15 & 1) != 0 || o0VarE.o0()) {
                    h4.r.a aVar = h4.r.S;
                    if ((i16 & 8) != 0) {
                        yf.f90469a.getClass();
                        p3.x1 x1Var = p3.n.f135158a;
                        n3.q0.f123226a.getClass();
                        jE = k2.e(n3.q0.f123230e, o0VarE);
                        i17 &= -7169;
                    }
                    j16 = jE;
                    rVar3 = aVar;
                } else {
                    o0VarE.e();
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                    }
                    j16 = jE;
                    rVar3 = rVar;
                }
                o0VarE.h0();
                p3.x1 x1Var2 = p3.n.f135158a;
                f(rVar3, j8, j16, eVar, pVar, eVar2, o0VarE, (i17 >> 3) & 524286);
                rVar2 = rVar3;
                j15 = j16;
            } else {
                o0VarE.e();
                rVar2 = rVar;
                j15 = jE;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p(i14, rVar2, j8, j15, eVar, pVar, eVar2, i15, i16) { // from class: i3.zf

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f90603a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h4.r f90604b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ long f90605c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ long f90606d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ z3.e f90607e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ e23.p f90608f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ z3.e f90609g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    public final /* synthetic */ int f90610h;

                    {
                        this.f90610h = i16;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(1794049);
                        qg.e(this.f90603a, this.f90604b, this.f90605c, this.f90606d, this.f90607e, this.f90608f, this.f90609g, (p3.m) obj, iT, this.f90610h);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        jE = j14;
        i17 = i18 | i19;
        if ((599187 & i17) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i17 & 1, z14)) {
            o0VarE.G0();
            if ((i15 & 1) != 0) {
                h4.r.a aVar2 = h4.r.S;
                if ((i16 & 8) != 0) {
                    yf.f90469a.getClass();
                    p3.x1 x1Var3 = p3.n.f135158a;
                    n3.q0.f123226a.getClass();
                    jE = k2.e(n3.q0.f123230e, o0VarE);
                    i17 &= -7169;
                }
                j16 = jE;
                rVar3 = aVar2;
            } else {
                h4.r.a aVar3 = h4.r.S;
                if ((i16 & 8) != 0) {
                    yf.f90469a.getClass();
                    p3.x1 x1Var4 = p3.n.f135158a;
                    n3.q0.f123226a.getClass();
                    jE = k2.e(n3.q0.f123230e, o0VarE);
                    i17 &= -7169;
                }
                j16 = jE;
                rVar3 = aVar3;
            }
            o0VarE.h0();
            p3.x1 x1Var5 = p3.n.f135158a;
            f(rVar3, j8, j16, eVar, pVar, eVar2, o0VarE, (i17 >> 3) & 524286);
            rVar2 = rVar3;
            j15 = j16;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            j15 = jE;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(i14, rVar2, j8, j15, eVar, pVar, eVar2, i15, i16) { // from class: i3.zf

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f90603a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h4.r f90604b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f90605c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f90606d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ z3.e f90607e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ e23.p f90608f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ z3.e f90609g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ int f90610h;

                {
                    this.f90610h = i16;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(1794049);
                    qg.e(this.f90603a, this.f90604b, this.f90605c, this.f90606d, this.f90607e, this.f90608f, this.f90609g, (p3.m) obj, iT, this.f90610h);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void f(h4.r rVar, final long j8, final long j14, final z3.e eVar, final e23.p pVar, final z3.e eVar2, p3.m mVar, final int i14) {
        final h4.r rVar2;
        int i15;
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(148841506);
        if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i15 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.l(j8) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.l(j14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(eVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(pVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(eVar2) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            p3.x1 x1Var = p3.n.f135158a;
            int i16 = i15 << 3;
            o0Var = o0VarE;
            ve.a(g8.i.Z(rVar2), null, j8, j14, 0.0f, 0.0f, null, z3.f.c(-1815327065, new pg(eVar2, pVar, eVar), o0VarE), o0Var, (i16 & 896) | 12582912 | (i16 & 7168), 114);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: i3.ag
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qg.f(rVar2, j8, j14, eVar, pVar, eVar2, (p3.m) obj, p3.p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
