package g02;

import c2.x2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.i7;
import p005kotlin.Unit;
import p3.p2;

/* JADX INFO: loaded from: classes10.dex */
public final class i {
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:81:0x010c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0114  */
    /* JADX WARN: Code duplicated, block: B:86:0x011b  */
    /* JADX WARN: Code duplicated, block: B:89:0x014c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0159  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static final void a(h4.r rVar, final u4.d dVar, final long j8, final long j14, final float f14, float f15, e23.l lVar, p3.m mVar, final int i14, final int i15) {
        h4.r rVar2;
        int i16;
        float f16;
        int i17;
        e23.l lVar2;
        int i18;
        int i19;
        boolean z14;
        p3.o0 o0Var;
        final h4.r rVar3;
        final float f17;
        final e23.l lVar3;
        p2 p2VarI0;
        p3.m.a aVar;
        boolean z15;
        Object objQ;
        Object objQ2;
        dVar.getClass();
        p3.o0 o0VarE = mVar.E(2073103304);
        int i24 = i15 & 1;
        if (i24 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i16 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.l(j8) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.l(j14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.i(f14) ? 16384 : 8192;
        }
        int i25 = i15 & 32;
        if (i25 == 0) {
            if ((196608 & i14) == 0) {
                f16 = f15;
                i16 |= o0VarE.i(f16) ? 131072 : 65536;
            }
            i17 = i15 & 64;
            if (i17 != 0) {
                i16 |= 1572864;
                lVar2 = lVar;
            } else {
                lVar2 = lVar;
                if ((i14 & 1572864) == 0) {
                    if (o0VarE.r(lVar2)) {
                        i18 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i18 = 524288;
                    }
                    i16 |= i18;
                }
            }
            i19 = i16 | 12582912;
            if ((i19 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i19 & 1, z14)) {
                if (i24 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i25 != 0) {
                    g6.f.a aVar2 = g6.f.f75994b;
                    f16 = 8;
                }
                aVar = p3.m.f135153a;
                if (i17 != 0) {
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new fo.x(19);
                        o0VarE.K(objQ2);
                    }
                    lVar2 = (e23.l) objQ2;
                }
                p3.x1 x1Var = p3.n.f135158a;
                h4.r rVarE = u1.n.e(l4.k.b(rVar3, k2.i.f102406a), j14, o4.m1.f128891a);
                z15 = (3670016 & i19) == 1048576;
                objQ = o0VarE.q();
                if (z15) {
                    objQ = new fb0.d(lVar2, 2);
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new fb0.d(lVar2, 2);
                        o0VarE.K(objQ);
                    }
                }
                o0Var = o0VarE;
                i7.b(dVar, null, c2.l.y(x2.q(l4.k.d(rVarE, (e23.l) objQ), f14), f16), j8, o0Var, ((i19 >> 3) & 14) | ((i19 >> 18) & 112) | ((i19 << 3) & 7168), 0);
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar3 = rVar2;
            }
            f17 = f16;
            lVar3 = lVar2;
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: g02.h
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        i.a(rVar3, dVar, j8, j14, f14, f17, lVar3, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i16 |= 196608;
        f16 = f15;
        i17 = i15 & 64;
        if (i17 != 0) {
            i16 |= 1572864;
            lVar2 = lVar;
        } else {
            lVar2 = lVar;
            if ((i14 & 1572864) == 0) {
                if (o0VarE.r(lVar2)) {
                    i18 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i18 = 524288;
                }
                i16 |= i18;
            }
        }
        i19 = i16 | 12582912;
        if ((i19 & 4793491) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i19 & 1, z14)) {
            if (i24 != 0) {
                rVar3 = h4.r.S;
            } else {
                rVar3 = rVar2;
            }
            if (i25 != 0) {
                g6.f.a aVar3 = g6.f.f75994b;
                f16 = 8;
            }
            aVar = p3.m.f135153a;
            if (i17 != 0) {
                objQ2 = o0VarE.q();
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new fo.x(19);
                    o0VarE.K(objQ2);
                }
                lVar2 = (e23.l) objQ2;
            }
            p3.x1 x1Var2 = p3.n.f135158a;
            h4.r rVarE2 = u1.n.e(l4.k.b(rVar3, k2.i.f102406a), j14, o4.m1.f128891a);
            if ((3670016 & i19) == 1048576) {
            }
            objQ = o0VarE.q();
            if (z15) {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new fb0.d(lVar2, 2);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new fb0.d(lVar2, 2);
                o0VarE.K(objQ);
            }
            o0Var = o0VarE;
            i7.b(dVar, null, c2.l.y(x2.q(l4.k.d(rVarE2, (e23.l) objQ), f14), f16), j8, o0Var, ((i19 >> 3) & 14) | ((i19 >> 18) & 112) | ((i19 << 3) & 7168), 0);
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar3 = rVar2;
        }
        f17 = f16;
        lVar3 = lVar2;
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: g02.h
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    i.a(rVar3, dVar, j8, j14, f14, f17, lVar3, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
