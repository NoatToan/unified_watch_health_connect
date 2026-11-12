package rw0;

import androidx.room.a0;
import c2.b0;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import h4.r;
import h5.e0;
import i3.h7;
import l4.w;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import r1.c0;
import r1.u0;
import s1.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class i {
    /* JADX WARN: Code duplicated, block: B:102:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:104:0x0201  */
    /* JADX WARN: Code duplicated, block: B:105:0x0203  */
    /* JADX WARN: Code duplicated, block: B:108:0x0209  */
    /* JADX WARN: Code duplicated, block: B:109:0x020b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0213  */
    /* JADX WARN: Code duplicated, block: B:114:0x021a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0260  */
    /* JADX WARN: Code duplicated, block: B:120:0x0277  */
    /* JADX WARN: Code duplicated, block: B:122:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:124:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:126:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:129:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x0116  */
    /* JADX WARN: Code duplicated, block: B:82:0x011d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0121  */
    /* JADX WARN: Code duplicated, block: B:88:0x0142  */
    /* JADX WARN: Code duplicated, block: B:91:0x017e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0187  */
    /* JADX WARN: Code duplicated, block: B:94:0x018b  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a6  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final boolean z14, final boolean z15, final e23.l<? super Boolean, Unit> lVar, final e23.a<Unit> aVar, r rVar, float f14, e23.a<Unit> aVar2, p3.m mVar, final int i14, final int i15) {
        int i16;
        r rVar2;
        int i17;
        float f15;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z16;
        final e23.a<Unit> aVar3;
        final r rVar3;
        final float f16;
        p2 p2VarI0;
        r rVar4;
        float f17;
        p3.m.a aVar4;
        e23.a<Unit> aVar5;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar6;
        r rVar5;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar;
        h5.g.a.f fVar;
        b0 b0Var;
        h4.g.a aVar7;
        j92.b bVar2;
        e23.a<Unit> aVar8;
        r.a aVar9;
        z zVarA2;
        int iHashCode2;
        i2 i2VarA1;
        r rVarC2;
        float f18;
        float f19;
        int i28;
        f0 f0Var;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objQ;
        Object objQ2;
        o0 o0VarP = a0.p(lVar, aVar, mVar, -133789038);
        p3.c<?> cVar = o0VarP.f135177b;
        if ((i14 & 6) == 0) {
            i16 = (o0VarP.h(z14) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarP.h(z15) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarP.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarP.r(aVar) ? 2048 : 1024;
        }
        int i29 = i15 & 16;
        if (i29 == 0) {
            if ((i14 & 24576) == 0) {
                rVar2 = rVar;
                i16 |= o0VarP.B(rVar2) ? 16384 : 8192;
            }
            i17 = i15 & 32;
            if (i17 != 0) {
                i19 = i16 | 196608;
                f15 = f14;
            } else {
                f15 = f14;
                if (o0VarP.i(f15)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i19 = i16 | i18;
            }
            i24 = i15 & 64;
            if (i24 != 0) {
                i26 = i19 | 1572864;
            } else {
                if (o0VarP.r(aVar2)) {
                    i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i25 = 524288;
                }
                i26 = i19 | i25;
            }
            i27 = i26;
            if ((i26 & 599187) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarP.n(i27 & 1, z16)) {
                if (i29 != 0) {
                    rVar4 = r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i17 != 0) {
                    f17 = 0.0f;
                } else {
                    f17 = f15;
                }
                aVar4 = p3.m.f135153a;
                if (i24 != 0) {
                    objQ2 = o0VarP.q();
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new ro0.h(7);
                        o0VarP.K(objQ2);
                    }
                    aVar5 = (e23.a) objQ2;
                } else {
                    aVar5 = aVar2;
                }
                x1 x1Var = p3.n.f135158a;
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = y.a(kVar, h4.d.a.f81536n, o0VarP, 0);
                iHashCode = Long.hashCode(o0VarP.U);
                i2VarA0 = o0VarP.a0();
                rVarC = h4.k.c(rVar4, o0VarP);
                h5.g.V.getClass();
                aVar6 = h5.g.a.f81805b;
                rVar5 = rVar4;
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarP.z();
                if (o0VarP.T) {
                    o0VarP.M(aVar6);
                } else {
                    o0VarP.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA, o0VarP);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarP);
                bVar = h5.g.a.f81813j;
                if (o0VarP.T || !s.g(o0VarP.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarP, iHashCode, bVar);
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarP);
                b0Var = b0.f22601a;
                aVar7 = h4.d.a.f81537o;
                d92.b.f58623a.getClass();
                bVar2 = d92.b.f58625c;
                bVar2.getClass();
                c2.j.i iVarI = c2.j.i(j92.b.f97899b.f97918c);
                aVar8 = aVar5;
                aVar9 = r.S;
                zVarA2 = y.a(iVarI, aVar7, o0VarP, 48);
                iHashCode2 = Long.hashCode(o0VarP.U);
                i2VarA1 = o0VarP.a0();
                rVarC2 = h4.k.c(aVar9, o0VarP);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarP.z();
                f18 = f17;
                if (o0VarP.T) {
                    o0VarP.M(aVar6);
                } else {
                    o0VarP.c();
                }
                b4.c(eVar, zVarA2, o0VarP);
                b4.c(c1623g, i2VarA1, o0VarP);
                if (o0VarP.T || !s.g(o0VarP.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarP, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarP);
                bVar2.getClass();
                k2.h hVarA = k2.i.a(j92.b.f97900c.f97911c);
                f19 = 4;
                g6.f.a aVar10 = g6.f.f75994b;
                r rVarB = b0Var.b(u1.n.e(w.a(aVar9, f19, hVarA, true, 24), n5.a.a(o0VarP, R.color.gray_white_static), hVarA), aVar7);
                a.f154819a.getClass();
                h7.a(aVar, rVarB, false, null, null, a.f154820b, o0VarP, ((i27 >> 9) & 14) | 1572864, 60);
                if (z15) {
                    o0VarP.C(1341204470);
                    k2.h hVar = k2.i.f102406a;
                    if ((i27 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if ((i27 & 14) == 4) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objQ = o0VarP.q();
                    if (z19) {
                        objQ = new ad0.e(lVar, z14, 15);
                        o0VarP.K(objQ);
                    } else {
                        aVar4.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ad0.e(lVar, z14, 15);
                            o0VarP.K(objQ);
                        }
                    }
                    i28 = 0;
                    f0Var = null;
                    h7.a((e23.a) objQ, b0Var.b(u1.n.e(w.a(aVar9, f19, hVar, true, 24), n5.a.a(o0VarP, R.color.gray_white_static), hVar), aVar7), false, null, null, z3.f.c(1698717815, new g(z14, i28), o0VarP), o0VarP, 1572864, 60);
                    o0VarP = o0VarP;
                    o0VarP.g0(false);
                } else {
                    i28 = 0;
                    f0Var = null;
                    o0VarP.C(1342324996);
                    o0VarP.g0(false);
                }
                int i30 = 1;
                o0VarP.g0(true);
                if (f18 == 0.0f) {
                    i28 = 1;
                }
                o0 o0Var = o0VarP;
                c0.c(b0Var, i28 ^ 1, null, u0.d(f0Var, 3), u0.e(f0Var, 3), null, z3.f.c(986541536, new dt1.b(aVar8, f18, b0Var, i30), o0VarP), o0Var, 1600518, 18);
                o0VarP = o0Var;
                o0VarP.g0(true);
                rVar3 = rVar5;
                f16 = f18;
                aVar3 = aVar8;
            } else {
                o0VarP.e();
                aVar3 = aVar2;
                rVar3 = rVar2;
                f16 = f15;
            }
            p2VarI0 = o0VarP.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new p() { // from class: rw0.h
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        i.a(z14, z15, lVar, aVar, rVar3, f16, aVar3, (p3.m) obj, p0.t(i14 | 1), i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i16 |= 24576;
        rVar2 = rVar;
        i17 = i15 & 32;
        if (i17 != 0) {
            i19 = i16 | 196608;
            f15 = f14;
        } else {
            f15 = f14;
            if (o0VarP.i(f15)) {
                i18 = 131072;
            } else {
                i18 = 65536;
            }
            i19 = i16 | i18;
        }
        i24 = i15 & 64;
        if (i24 != 0) {
            i26 = i19 | 1572864;
        } else {
            if (o0VarP.r(aVar2)) {
                i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i25 = 524288;
            }
            i26 = i19 | i25;
        }
        i27 = i26;
        if ((i26 & 599187) != 599186) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarP.n(i27 & 1, z16)) {
            if (i29 != 0) {
                rVar4 = r.S;
            } else {
                rVar4 = rVar2;
            }
            if (i17 != 0) {
                f17 = 0.0f;
            } else {
                f17 = f15;
            }
            aVar4 = p3.m.f135153a;
            if (i24 != 0) {
                objQ2 = o0VarP.q();
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ro0.h(7);
                    o0VarP.K(objQ2);
                }
                aVar5 = (e23.a) objQ2;
            } else {
                aVar5 = aVar2;
            }
            x1 x1Var2 = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = y.a(kVar2, h4.d.a.f81536n, o0VarP, 0);
            iHashCode = Long.hashCode(o0VarP.U);
            i2VarA0 = o0VarP.a0();
            rVarC = h4.k.c(rVar4, o0VarP);
            h5.g.V.getClass();
            aVar6 = h5.g.a.f81805b;
            rVar5 = rVar4;
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarP.z();
            if (o0VarP.T) {
                o0VarP.M(aVar6);
            } else {
                o0VarP.c();
            }
            eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarP);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarP);
            bVar = h5.g.a.f81813j;
            if (o0VarP.T) {
                v.h.A(iHashCode, o0VarP, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarP, iHashCode, bVar);
            }
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarP);
            b0Var = b0.f22601a;
            aVar7 = h4.d.a.f81537o;
            d92.b.f58623a.getClass();
            bVar2 = d92.b.f58625c;
            bVar2.getClass();
            c2.j.i iVarI2 = c2.j.i(j92.b.f97899b.f97918c);
            aVar8 = aVar5;
            aVar9 = r.S;
            zVarA2 = y.a(iVarI2, aVar7, o0VarP, 48);
            iHashCode2 = Long.hashCode(o0VarP.U);
            i2VarA1 = o0VarP.a0();
            rVarC2 = h4.k.c(aVar9, o0VarP);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarP.z();
            f18 = f17;
            if (o0VarP.T) {
                o0VarP.M(aVar6);
            } else {
                o0VarP.c();
            }
            b4.c(eVar, zVarA2, o0VarP);
            b4.c(c1623g, i2VarA1, o0VarP);
            if (o0VarP.T) {
                v.h.A(iHashCode2, o0VarP, iHashCode2, bVar);
            } else {
                v.h.A(iHashCode2, o0VarP, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarP);
            bVar2.getClass();
            k2.h hVarA2 = k2.i.a(j92.b.f97900c.f97911c);
            f19 = 4;
            g6.f.a aVar11 = g6.f.f75994b;
            r rVarB2 = b0Var.b(u1.n.e(w.a(aVar9, f19, hVarA2, true, 24), n5.a.a(o0VarP, R.color.gray_white_static), hVarA2), aVar7);
            a.f154819a.getClass();
            h7.a(aVar, rVarB2, false, null, null, a.f154820b, o0VarP, ((i27 >> 9) & 14) | 1572864, 60);
            if (z15) {
                o0VarP.C(1341204470);
                k2.h hVar2 = k2.i.f102406a;
                if ((i27 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if ((i27 & 14) == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | z17;
                objQ = o0VarP.q();
                if (z19) {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ad0.e(lVar, z14, 15);
                        o0VarP.K(objQ);
                    }
                } else {
                    objQ = new ad0.e(lVar, z14, 15);
                    o0VarP.K(objQ);
                }
                i28 = 0;
                f0Var = null;
                h7.a((e23.a) objQ, b0Var.b(u1.n.e(w.a(aVar9, f19, hVar2, true, 24), n5.a.a(o0VarP, R.color.gray_white_static), hVar2), aVar7), false, null, null, z3.f.c(1698717815, new g(z14, i28), o0VarP), o0VarP, 1572864, 60);
                o0VarP = o0VarP;
                o0VarP.g0(false);
            } else {
                i28 = 0;
                f0Var = null;
                o0VarP.C(1342324996);
                o0VarP.g0(false);
            }
            int i34 = 1;
            o0VarP.g0(true);
            if (f18 == 0.0f) {
                i28 = 1;
            }
            o0 o0Var2 = o0VarP;
            c0.c(b0Var, i28 ^ 1, null, u0.d(f0Var, 3), u0.e(f0Var, 3), null, z3.f.c(986541536, new dt1.b(aVar8, f18, b0Var, i34), o0VarP), o0Var2, 1600518, 18);
            o0VarP = o0Var2;
            o0VarP.g0(true);
            rVar3 = rVar5;
            f16 = f18;
            aVar3 = aVar8;
        } else {
            o0VarP.e();
            aVar3 = aVar2;
            rVar3 = rVar2;
            f16 = f15;
        }
        p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p() { // from class: rw0.h
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    i.a(z14, z15, lVar, aVar, rVar3, f16, aVar3, (p3.m) obj, p0.t(i14 | 1), i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
