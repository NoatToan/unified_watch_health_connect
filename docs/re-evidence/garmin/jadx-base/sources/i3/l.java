package i3;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f88773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f88774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f88775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f88776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c2.l2 f88777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c2.l2 f88778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c2.l2 f88779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c2.l2 f88780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p3.j0 f88781i;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f88773a = 280;
        f88774b = 560;
        f88775c = 8;
        f88776d = 12;
        float f14 = 24;
        f88777e = c2.l.a(f14);
        float f15 = 16;
        f88778f = c2.l.e(0.0f, 0.0f, 0.0f, f15, 7);
        f88779g = c2.l.e(0.0f, 0.0f, 0.0f, f15, 7);
        f88780h = c2.l.e(0.0f, 0.0f, 0.0f, f14, 7);
        f88781i = p3.v.c(new i01.j(8));
    }

    public static final void a(final z3.e eVar, h4.r rVar, final e23.p pVar, final e23.p pVar2, final e23.p pVar3, final o4.r1 r1Var, final long j8, final float f14, final long j14, final long j15, final long j16, final long j17, p3.m mVar, final int i14) {
        final h4.r rVar2;
        p3.o0 o0VarE = mVar.E(1378716401);
        int i15 = i14 | 48 | (o0VarE.r(pVar) ? 256 : 128) | (o0VarE.r(pVar2) ? 2048 : 1024) | (o0VarE.r(pVar3) ? 16384 : 8192) | (o0VarE.B(r1Var) ? 131072 : 65536) | (o0VarE.l(j8) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.i(f14) ? 8388608 : 4194304) | (o0VarE.l(j14) ? 67108864 : 33554432) | (o0VarE.l(j15) ? 536870912 : 268435456);
        if (o0VarE.n(i15 & 1, ((i15 & 306783379) == 306783378 && (((o0VarE.l(j16) ? (char) 4 : (char) 2) | (o0VarE.l(j17) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            h4.r.a aVar = h4.r.S;
            p3.x1 x1Var = p3.n.f135158a;
            int i16 = i15 >> 12;
            ve.a(aVar, r1Var, j8, 0L, f14, 0.0f, null, z3.f.c(-652798794, new g(pVar, pVar2, pVar3, j15, j16, j17, j14, eVar), o0VarE), o0VarE, (i16 & 896) | (i16 & 112) | 12582918 | ((i15 >> 9) & 57344), 104);
            rVar2 = aVar;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(rVar2, pVar, pVar2, pVar3, r1Var, j8, f14, j14, j15, j16, j17, i14) { // from class: i3.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h4.r f87676b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ e23.p f87677c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ e23.p f87678d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ e23.p f87679e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ o4.r1 f87680f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ long f87681g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ float f87682h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ long f87683i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ long f87684j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ long f87685k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ long f87686l;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(7);
                    l.a(this.f87675a, this.f87676b, this.f87677c, this.f87678d, this.f87679e, this.f87680f, this.f87681g, this.f87682h, this.f87683i, this.f87684j, this.f87685k, this.f87686l, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void b(float f14, float f15, z3.e eVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-917637668);
        if (o0VarE.n(i14 & 1, (i14 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new h(f14, f15);
                o0VarE.K(objQ);
            }
            f5.z0 z0Var = (f5.z0) objQ;
            h4.r.a aVar = h4.r.S;
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
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
            p3.b4.c(h5.g.a.f81810g, z0Var, o0VarE);
            p3.b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b71.i.n(6, eVar, o0VarE, true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a3.c(f14, f15, eVar, i14, 1);
        }
    }

    public static final void c(final e23.a aVar, final z3.e eVar, final h4.r rVar, final e23.p pVar, final e23.p pVar2, final e23.p pVar3, final o4.r1 r1Var, final long j8, final long j14, final long j15, final long j16, final float f14, final p004k6.u uVar, p3.m mVar, final int i14, final int i15) {
        int i16;
        z3.e eVar2;
        e23.p pVar4;
        int i17;
        p3.o0 o0VarE = mVar.E(-867616355);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            eVar2 = eVar;
            i16 |= o0VarE.r(eVar2) ? 32 : 16;
        } else {
            eVar2 = eVar;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(rVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            pVar4 = pVar;
            i16 |= o0VarE.r(pVar4) ? 2048 : 1024;
        } else {
            pVar4 = pVar;
        }
        int i18 = 128;
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(null) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.r(pVar2) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i16 |= o0VarE.r(pVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i16 |= o0VarE.B(r1Var) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i16 |= o0VarE.l(j8) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i16 |= o0VarE.l(j14) ? 536870912 : 268435456;
        }
        if ((i15 & 6) == 0) {
            i17 = i15 | (o0VarE.l(j15) ? 4 : 2);
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= o0VarE.l(j16) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            if (o0VarE.i(f14)) {
                i18 = 256;
            }
            i17 |= i18;
        }
        if ((i15 & 3072) == 0) {
            i17 |= o0VarE.B(uVar) ? 2048 : 1024;
        }
        int i19 = i17;
        if (o0VarE.n(i16 & 1, ((306783379 & i16) == 306783378 && (i19 & 1171) == 1170) ? false : true)) {
            p3.x1 x1Var = p3.n.f135158a;
            d(aVar, rVar, uVar, z3.f.c(527420759, new k(null, pVar2, pVar3, r1Var, j8, f14, j14, j15, j16, pVar4, eVar2), o0VarE), o0VarE, (i16 & 14) | 3072 | ((i16 >> 3) & 112) | ((i19 >> 3) & 896), 0);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: i3.b
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i14 | 1);
                    int iT2 = p3.p0.t(i15);
                    l.c(aVar, eVar, rVar, pVar, pVar2, pVar3, r1Var, j8, j14, j15, j16, f14, uVar, (p3.m) obj, iT, iT2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public static final void d(e23.a aVar, h4.r rVar, p004k6.u uVar, z3.e eVar, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        int i17;
        p004k6.u uVar2;
        int i18;
        boolean z14;
        h4.r rVar3;
        p004k6.u uVar3;
        p3.p2 p2VarI0;
        p004k6.u uVar4;
        int i19;
        p3.o0 o0VarE = mVar.E(24925658);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i24 = i15 & 2;
        if (i24 == 0) {
            if ((i14 & 48) == 0) {
                rVar2 = rVar;
                i16 |= o0VarE.B(rVar2) ? 32 : 16;
            }
            i17 = i15 & 4;
            if (i17 != 0) {
                if ((i14 & 384) == 0) {
                    uVar2 = uVar;
                    if (o0VarE.B(uVar2)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i16 |= i18;
                }
                if ((i14 & 3072) == 0) {
                    if (o0VarE.r(eVar)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i16 |= i19;
                }
                if ((i16 & 1171) != 1170) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i24 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 != 0) {
                        uVar4 = new p004k6.u(false, false, false, 7, (p005kotlin.jvm.internal.j) null);
                    } else {
                        uVar4 = uVar2;
                    }
                    p3.x1 x1Var = p3.n.f135158a;
                    ((b0) o0VarE.A(f88781i)).a(new c0(aVar, rVar3, uVar4, eVar), o0VarE, 0);
                    uVar3 = uVar4;
                } else {
                    o0VarE.e();
                    rVar3 = rVar2;
                    uVar3 = uVar2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new b82.f0(aVar, rVar3, uVar3, eVar, i14, i15, 14);
                }
            }
            i16 |= 384;
            uVar2 = uVar;
            if ((i14 & 3072) == 0) {
                if (o0VarE.r(eVar)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i16 |= i19;
            }
            if ((i16 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i24 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i17 != 0) {
                    uVar4 = new p004k6.u(false, false, false, 7, (p005kotlin.jvm.internal.j) null);
                } else {
                    uVar4 = uVar2;
                }
                p3.x1 x1Var2 = p3.n.f135158a;
                ((b0) o0VarE.A(f88781i)).a(new c0(aVar, rVar3, uVar4, eVar), o0VarE, 0);
                uVar3 = uVar4;
            } else {
                o0VarE.e();
                rVar3 = rVar2;
                uVar3 = uVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b82.f0(aVar, rVar3, uVar3, eVar, i14, i15, 14);
            }
        }
        i16 |= 48;
        rVar2 = rVar;
        i17 = i15 & 4;
        if (i17 != 0) {
            if ((i14 & 384) == 0) {
                uVar2 = uVar;
                if (o0VarE.B(uVar2)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i16 |= i18;
            }
            if ((i14 & 3072) == 0) {
                if (o0VarE.r(eVar)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i16 |= i19;
            }
            if ((i16 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i24 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i17 != 0) {
                    uVar4 = new p004k6.u(false, false, false, 7, (p005kotlin.jvm.internal.j) null);
                } else {
                    uVar4 = uVar2;
                }
                p3.x1 x1Var3 = p3.n.f135158a;
                ((b0) o0VarE.A(f88781i)).a(new c0(aVar, rVar3, uVar4, eVar), o0VarE, 0);
                uVar3 = uVar4;
            } else {
                o0VarE.e();
                rVar3 = rVar2;
                uVar3 = uVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b82.f0(aVar, rVar3, uVar3, eVar, i14, i15, 14);
            }
        }
        i16 |= 384;
        uVar2 = uVar;
        if ((i14 & 3072) == 0) {
            if (o0VarE.r(eVar)) {
                i19 = 2048;
            } else {
                i19 = 1024;
            }
            i16 |= i19;
        }
        if ((i16 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i24 != 0) {
                rVar3 = h4.r.S;
            } else {
                rVar3 = rVar2;
            }
            if (i17 != 0) {
                uVar4 = new p004k6.u(false, false, false, 7, (p005kotlin.jvm.internal.j) null);
            } else {
                uVar4 = uVar2;
            }
            p3.x1 x1Var4 = p3.n.f135158a;
            ((b0) o0VarE.A(f88781i)).a(new c0(aVar, rVar3, uVar4, eVar), o0VarE, 0);
            uVar3 = uVar4;
        } else {
            o0VarE.e();
            rVar3 = rVar2;
            uVar3 = uVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.f0(aVar, rVar3, uVar3, eVar, i14, i15, 14);
        }
    }
}
