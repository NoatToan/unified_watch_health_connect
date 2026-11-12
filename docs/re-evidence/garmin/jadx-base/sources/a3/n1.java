package a3;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.n2;
import p3.p2;
import p3.x1;
import p3.y3;

/* JADX INFO: loaded from: classes.dex */
public final class n1 {
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x0107  */
    /* JADX WARN: Code duplicated, block: B:77:0x0111  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public static final void a(final h4.r rVar, final o4.r1 r1Var, final long j8, long j14, float f14, final z3.e eVar, p3.m mVar, final int i14, final int i15) {
        int i16;
        o4.r1 r1Var2;
        final long jA;
        float f15;
        z3.e eVar2;
        boolean z14;
        final float f16;
        p2 p2VarI0;
        int i17;
        p3.o0 o0VarE = mVar.E(174096871);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            r1Var2 = r1Var;
            i16 |= o0VarE.B(r1Var2) ? 32 : 16;
        } else {
            r1Var2 = r1Var;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.l(j8) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            if ((i15 & 8) == 0) {
                jA = j14;
                int i18 = o0VarE.l(jA) ? 2048 : 1024;
                i16 |= i18;
            } else {
                jA = j14;
            }
            i16 |= i18;
        } else {
            jA = j14;
        }
        int i19 = i16 | 24576;
        int i24 = i15 & 32;
        if (i24 == 0) {
            if ((196608 & i14) == 0) {
                f15 = f14;
                i19 |= o0VarE.i(f15) ? 131072 : 65536;
            }
            if ((1572864 & i14) == 0) {
                eVar2 = eVar;
                if (o0VarE.r(eVar2)) {
                    i17 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i17 = 524288;
                }
                i19 |= i17;
            } else {
                eVar2 = eVar;
            }
            if ((599187 & i19) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i19 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    if ((i15 & 8) != 0) {
                        jA = u.a(j8, o0VarE);
                    }
                    if (i24 != 0) {
                        f15 = 0;
                        g6.f.a aVar = g6.f.f75994b;
                    }
                } else {
                    o0VarE.e();
                }
                long j15 = jA;
                float f17 = f15;
                o0VarE.h0();
                x1 x1Var = p3.n.f135158a;
                p3.j0 j0Var = k0.f708b;
                float f18 = ((g6.f) o0VarE.A(j0Var)).f75997a + f17;
                p3.v.b(new n2[]{x.f872a.c(o4.d0.a(j15)), j0Var.c(g6.f.a(f18))}, z3.f.c(-2004281689, new i1(rVar, r1Var2, j8, f18, f17, eVar2), o0VarE), o0VarE, 56);
                f16 = f17;
                jA = j15;
            } else {
                o0VarE.e();
                f16 = f15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: a3.j1
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        n1.a(rVar, r1Var, j8, jA, f16, eVar, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i19 = 221184 | i16;
        f15 = f14;
        if ((1572864 & i14) == 0) {
            eVar2 = eVar;
            if (o0VarE.r(eVar2)) {
                i17 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i17 = 524288;
            }
            i19 |= i17;
        } else {
            eVar2 = eVar;
        }
        if ((599187 & i19) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i19 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if ((i15 & 8) != 0) {
                    jA = u.a(j8, o0VarE);
                }
                if (i24 != 0) {
                    f15 = 0;
                    g6.f.a aVar2 = g6.f.f75994b;
                }
            } else {
                if ((i15 & 8) != 0) {
                    jA = u.a(j8, o0VarE);
                }
                if (i24 != 0) {
                    f15 = 0;
                    g6.f.a aVar3 = g6.f.f75994b;
                }
            }
            long j16 = jA;
            float f19 = f15;
            o0VarE.h0();
            x1 x1Var2 = p3.n.f135158a;
            p3.j0 j0Var2 = k0.f708b;
            float f110 = ((g6.f) o0VarE.A(j0Var2)).f75997a + f19;
            p3.v.b(new n2[]{x.f872a.c(o4.d0.a(j16)), j0Var2.c(g6.f.a(f110))}, z3.f.c(-2004281689, new i1(rVar, r1Var2, j8, f110, f19, eVar2), o0VarE), o0VarE, 56);
            f16 = f19;
            jA = j16;
        } else {
            o0VarE.e();
            f16 = f15;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: a3.j1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    n1.a(rVar, r1Var, j8, jA, f16, eVar, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void b(final e23.a aVar, final h4.r rVar, final boolean z14, final o4.r1 r1Var, final long j8, final long j14, final float f14, final a2.j jVar, final z3.e eVar, p3.m mVar, final int i14) {
        int i15;
        z3.e eVar2;
        p3.o0 o0VarE = mVar.E(2141308794);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(r1Var) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.l(j8) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.l(j14) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.B(null) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.i(f14) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.B(jVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i14) == 0) {
            eVar2 = eVar;
            i15 |= o0VarE.r(eVar2) ? 536870912 : 268435456;
        } else {
            eVar2 = eVar;
        }
        if (o0VarE.n(i15 & 1, (306783379 & i15) != 306783378)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            p3.j0 j0Var = k0.f708b;
            final float f15 = ((g6.f) o0VarE.A(j0Var)).f75997a + f14;
            final z3.e eVar3 = eVar2;
            p3.v.b(new n2[]{x.f872a.c(o4.d0.a(j14)), j0Var.c(g6.f.a(f15))}, z3.f.c(-1766606150, new e23.p() { // from class: a3.k1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var2 = p3.n.f135158a;
                        y3 y3Var = n0.f755a;
                        h4.r rVarC = n1.c(f14, n1.d(j8, (j0) mVar2.A(k0.f707a), f15, mVar2), rVar.then(p0.f777a), r1Var);
                        p3.j0 j0Var2 = e1.f643a;
                        g6.f.f75994b.getClass();
                        float f16 = g6.f.f75996d;
                        o4.d0.f128823b.getClass();
                        long j15 = o4.d0.f128832k;
                        h4.r rVarB = u1.w.b(rVarC, jVar, (g6.f.c(f16, f16) && o4.d0.d(j15, j15)) ? e1.f644b : new f1(true, f16, j15, (p005kotlin.jvm.internal.j) null), z14, null, null, aVar, 24);
                        h4.d.f81522a.getClass();
                        f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, true);
                        int iP = mVar2.P();
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC2 = h4.k.c(rVarB, mVar2);
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
                        b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                            v.h.z(iP, mVar2, iP, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                        c2.u uVar = c2.u.f22885a;
                        eVar3.invoke(mVar2, 0);
                        mVar2.y();
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 56);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: a3.l1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    n1.b(aVar, rVar, z14, r1Var, j8, j14, f14, jVar, eVar, (p3.m) obj, p3.p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final h4.r c(float f14, long j8, h4.r rVar, o4.r1 r1Var) {
        return l4.k.b(u1.n.e(l4.w.a(rVar, f14, r1Var, false, 24).then(h4.r.S), j8, r1Var), r1Var);
    }

    public static final long d(long j8, j0 j0Var, float f14, p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        o0.f762a.getClass();
        if (!o4.d0.d(j8, o0.a(mVar).b()) || j0Var == null) {
            mVar.C(-1124546347);
            mVar.f();
            return j8;
        }
        mVar.C(-1124614454);
        long jA = j0Var.a(j8, f14, mVar, 0);
        mVar.f();
        return jA;
    }
}
