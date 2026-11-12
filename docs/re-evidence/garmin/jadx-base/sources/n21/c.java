package n21;

import c2.j;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.i7;
import j23.f;
import j23.t;
import l72.c3;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.w;
import v.h;
import v62.k5;
import v62.s6;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:102:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:104:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:107:0x0220  */
    /* JADX WARN: Code duplicated, block: B:109:0x0224  */
    /* JADX WARN: Code duplicated, block: B:111:0x0229  */
    /* JADX WARN: Code duplicated, block: B:112:0x022b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0230  */
    /* JADX WARN: Code duplicated, block: B:117:0x0236  */
    /* JADX WARN: Code duplicated, block: B:123:0x0247  */
    /* JADX WARN: Code duplicated, block: B:126:0x024f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0253  */
    /* JADX WARN: Code duplicated, block: B:129:0x027e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:65:0x0103  */
    /* JADX WARN: Code duplicated, block: B:70:0x0124  */
    /* JADX WARN: Code duplicated, block: B:73:0x014b  */
    /* JADX WARN: Code duplicated, block: B:74:0x014e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0154  */
    /* JADX WARN: Code duplicated, block: B:78:0x0157  */
    /* JADX WARN: Code duplicated, block: B:85:0x016b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0171 A[PHI: r23
      0x0171: PHI (r23v2 h4.r) = (r23v0 h4.r), (r23v3 h4.r) binds: [B:86:0x016f, B:84:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0173  */
    /* JADX WARN: Code duplicated, block: B:91:0x017e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0186  */
    /* JADX WARN: Code duplicated, block: B:95:0x0188  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c9  */
    public static final void a(r rVar, final float f14, l<? super Float, Unit> lVar, f<Float> fVar, m mVar, int i14, int i15) {
        r rVar2;
        int i16;
        f<Float> fVar2;
        o0 o0Var;
        r rVar3;
        r rVar4;
        final f<Float> eVar;
        s2 s2VarF;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar;
        g.a.b bVar;
        int i17;
        boolean z14;
        int i18;
        boolean z15;
        int i19;
        r rVar5;
        boolean z16;
        boolean z17;
        Object objQ;
        m.a aVar2;
        final f<Float> fVar3;
        boolean z18;
        Object objQ2;
        boolean z19;
        boolean z24;
        boolean z25;
        Object objQ3;
        boolean z26;
        final l<? super Float, Unit> lVar2 = lVar;
        lVar2.getClass();
        o0 o0VarE = mVar.E(-1423862897);
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
            i16 |= o0VarE.i(f14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(lVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            if ((i15 & 8) == 0) {
                fVar2 = fVar;
                int i25 = o0VarE.B(fVar2) ? 2048 : 1024;
                i16 |= i25;
            } else {
                fVar2 = fVar;
            }
            i16 |= i25;
        } else {
            fVar2 = fVar;
        }
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                rVar4 = i24 != 0 ? r.S : rVar2;
                if ((i15 & 8) != 0) {
                    eVar = new j23.e(0.0f, 100.0f);
                    i16 &= -7169;
                }
                o0VarE.h0();
                x1 x1Var = n.f135158a;
                r rVarF = x2.f(rVar4, 1.0f);
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar2 = j92.b.f97899b;
                r rVarA = c2.l.A(rVarF, 0.0f, eVar2.f97917b, 1);
                h4.d.f81522a.getClass();
                h4.g.b bVar3 = h4.d.a.f81534l;
                j jVar = j.f22691a;
                bVar2.getClass();
                s2VarF = hb.a.f(jVar, eVar2.f97918c, bVar3, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarA, o0VarE);
                g.V.getClass();
                aVar = g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(g.a.f81810g, s2VarF, o0VarE);
                b4.c(g.a.f81809f, i2VarA0, o0VarE);
                bVar = g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(g.a.f81807d, rVarC, o0VarE);
                u2 u2Var = u2.f22900a;
                s62.a.f157643a.getClass();
                t62.b bVar4 = t62.b.f162798a;
                u4.d dVarA = k5.a(bVar4);
                String strQ = y.Q(o0VarE, R.string.lbl_minus);
                long jY = sn.a.y(o0VarE);
                r.a aVar3 = r.S;
                i17 = i16 & 896;
                if (i17 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                i18 = i16 & 112;
                if (i18 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z27 = z14 | z15;
                i19 = (i16 & 7168) ^ 3072;
                if (i19 > 2048 || !o0VarE.B(eVar)) {
                    rVar5 = rVar4;
                    if ((i16 & 3072) != 2048) {
                        z16 = false;
                    }
                    z17 = z27 | z16;
                    objQ = o0VarE.q();
                    aVar2 = m.f135153a;
                    if (z17) {
                        final int i26 = 0;
                        objQ = new e23.a() { // from class: n21.b
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i26) {
                                    case 0:
                                        float f15 = f14 - 1.0f;
                                        f fVar4 = eVar;
                                        lVar2.invoke(Float.valueOf(t.d(f15, ((Number) fVar4.getStart()).floatValue(), ((Number) fVar4.b()).floatValue())));
                                        break;
                                    default:
                                        float f16 = f14 + 1.0f;
                                        f fVar5 = eVar;
                                        lVar2.invoke(Float.valueOf(t.d(f16, ((Number) fVar5.getStart()).floatValue(), ((Number) fVar5.b()).floatValue())));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == m.a.f135155b) {
                            final int i27 = 0;
                            objQ = new e23.a() { // from class: n21.b
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i27) {
                                        case 0:
                                            float f15 = f14 - 1.0f;
                                            f fVar4 = eVar;
                                            lVar2.invoke(Float.valueOf(t.d(f15, ((Number) fVar4.getStart()).floatValue(), ((Number) fVar4.b()).floatValue())));
                                            break;
                                        default:
                                            float f16 = f14 + 1.0f;
                                            f fVar5 = eVar;
                                            lVar2.invoke(Float.valueOf(t.d(f16, ((Number) fVar5.getStart()).floatValue(), ((Number) fVar5.b()).floatValue())));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ);
                        }
                    }
                    r rVarD = w.d(aVar3, false, null, null, (e23.a) objQ, 15);
                    int i28 = i16;
                    fVar3 = eVar;
                    i7.b(dVarA, strQ, rVarD, jY, o0VarE, 0, 0);
                    c3 c3Var = c3.f110949a;
                    r rVarA2 = u2Var.a(aVar3, 1.0f, true);
                    if (i17 == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objQ2 = o0VarE.q();
                    if (z18) {
                        objQ2 = new k11.n(lVar2, 29);
                        o0VarE.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new k11.n(lVar2, 29);
                            o0VarE.K(objQ2);
                        }
                    }
                    c3Var.a(f14, (l) objQ2, rVarA2, false, fVar3, 0, null, null, o0VarE, ((i28 >> 3) & 14) | (57344 & (i28 << 3)), 232);
                    u4.d dVarA2 = s6.a(bVar4);
                    String strQ2 = y.Q(o0VarE, R.string.lbl_plus);
                    long jY2 = sn.a.y(o0VarE);
                    if (i17 == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (i18 == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = z24 | z19 | ((i19 <= 2048 && o0VarE.B(fVar3)) || (i28 & 3072) == 2048);
                    objQ3 = o0VarE.q();
                    if (z25) {
                        lVar2 = lVar;
                        z26 = true;
                        final char c14 = 1 == true ? 1 : 0;
                        objQ3 = new e23.a() { // from class: n21.b
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.a
                            public final Object invoke() {
                                switch (c14) {
                                    case 0:
                                        float f15 = f14 - 1.0f;
                                        f fVar4 = fVar3;
                                        lVar2.invoke(Float.valueOf(t.d(f15, ((Number) fVar4.getStart()).floatValue(), ((Number) fVar4.b()).floatValue())));
                                        break;
                                    default:
                                        float f16 = f14 + 1.0f;
                                        f fVar5 = fVar3;
                                        lVar2.invoke(Float.valueOf(t.d(f16, ((Number) fVar5.getStart()).floatValue(), ((Number) fVar5.b()).floatValue())));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ3);
                    } else {
                        aVar2.getClass();
                        if (objQ3 == m.a.f135155b) {
                            lVar2 = lVar;
                            z26 = true;
                            final int c15 = 1 == true ? 1 : 0;
                            objQ3 = new e23.a() { // from class: n21.b
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (c15) {
                                        case 0:
                                            float f15 = f14 - 1.0f;
                                            f fVar4 = fVar3;
                                            lVar2.invoke(Float.valueOf(t.d(f15, ((Number) fVar4.getStart()).floatValue(), ((Number) fVar4.b()).floatValue())));
                                            break;
                                        default:
                                            float f16 = f14 + 1.0f;
                                            f fVar5 = fVar3;
                                            lVar2.invoke(Float.valueOf(t.d(f16, ((Number) fVar5.getStart()).floatValue(), ((Number) fVar5.b()).floatValue())));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ3);
                        } else {
                            lVar2 = lVar;
                            z26 = true;
                        }
                    }
                    i7.b(dVarA2, strQ2, w.d(aVar3, false, null, null, (e23.a) objQ3, 15), jY2, o0VarE, 0, 0);
                    o0Var = o0VarE;
                    o0Var.g0(z26);
                    fVar2 = fVar3;
                    rVar3 = rVar5;
                } else {
                    rVar5 = rVar4;
                }
                z16 = true;
                z17 = z27 | z16;
                objQ = o0VarE.q();
                aVar2 = m.f135153a;
                if (z17) {
                    aVar2.getClass();
                    if (objQ == m.a.f135155b) {
                        final int i29 = 0;
                        objQ = new e23.a() { // from class: n21.b
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i29) {
                                    case 0:
                                        float f15 = f14 - 1.0f;
                                        f fVar4 = eVar;
                                        lVar2.invoke(Float.valueOf(t.d(f15, ((Number) fVar4.getStart()).floatValue(), ((Number) fVar4.b()).floatValue())));
                                        break;
                                    default:
                                        float f16 = f14 + 1.0f;
                                        f fVar5 = eVar;
                                        lVar2.invoke(Float.valueOf(t.d(f16, ((Number) fVar5.getStart()).floatValue(), ((Number) fVar5.b()).floatValue())));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ);
                    }
                } else {
                    final int i210 = 0;
                    objQ = new e23.a() { // from class: n21.b
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i210) {
                                case 0:
                                    float f15 = f14 - 1.0f;
                                    f fVar4 = eVar;
                                    lVar2.invoke(Float.valueOf(t.d(f15, ((Number) fVar4.getStart()).floatValue(), ((Number) fVar4.b()).floatValue())));
                                    break;
                                default:
                                    float f16 = f14 + 1.0f;
                                    f fVar5 = eVar;
                                    lVar2.invoke(Float.valueOf(t.d(f16, ((Number) fVar5.getStart()).floatValue(), ((Number) fVar5.b()).floatValue())));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ);
                }
                r rVarD2 = w.d(aVar3, false, null, null, (e23.a) objQ, 15);
                int i211 = i16;
                fVar3 = eVar;
                i7.b(dVarA, strQ, rVarD2, jY, o0VarE, 0, 0);
                c3 c3Var2 = c3.f110949a;
                r rVarA3 = u2Var.a(aVar3, 1.0f, true);
                if (i17 == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objQ2 = o0VarE.q();
                if (z18) {
                    aVar2.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new k11.n(lVar2, 29);
                        o0VarE.K(objQ2);
                    }
                } else {
                    objQ2 = new k11.n(lVar2, 29);
                    o0VarE.K(objQ2);
                }
                c3Var2.a(f14, (l) objQ2, rVarA3, false, fVar3, 0, null, null, o0VarE, ((i211 >> 3) & 14) | (57344 & (i211 << 3)), 232);
                u4.d dVarA3 = s6.a(bVar4);
                String strQ3 = y.Q(o0VarE, R.string.lbl_plus);
                long jY3 = sn.a.y(o0VarE);
                if (i17 == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (i18 == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = z24 | z19 | ((i19 <= 2048 && o0VarE.B(fVar3)) || (i211 & 3072) == 2048);
                objQ3 = o0VarE.q();
                if (z25) {
                    aVar2.getClass();
                    if (objQ3 == m.a.f135155b) {
                        lVar2 = lVar;
                        z26 = true;
                        final int c16 = 1 == true ? 1 : 0;
                        objQ3 = new e23.a() { // from class: n21.b
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.a
                            public final Object invoke() {
                                switch (c16) {
                                    case 0:
                                        float f15 = f14 - 1.0f;
                                        f fVar4 = fVar3;
                                        lVar2.invoke(Float.valueOf(t.d(f15, ((Number) fVar4.getStart()).floatValue(), ((Number) fVar4.b()).floatValue())));
                                        break;
                                    default:
                                        float f16 = f14 + 1.0f;
                                        f fVar5 = fVar3;
                                        lVar2.invoke(Float.valueOf(t.d(f16, ((Number) fVar5.getStart()).floatValue(), ((Number) fVar5.b()).floatValue())));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ3);
                    } else {
                        lVar2 = lVar;
                        z26 = true;
                    }
                } else {
                    lVar2 = lVar;
                    z26 = true;
                    final int c17 = 1 == true ? 1 : 0;
                    objQ3 = new e23.a() { // from class: n21.b
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.a
                        public final Object invoke() {
                            switch (c17) {
                                case 0:
                                    float f15 = f14 - 1.0f;
                                    f fVar4 = fVar3;
                                    lVar2.invoke(Float.valueOf(t.d(f15, ((Number) fVar4.getStart()).floatValue(), ((Number) fVar4.b()).floatValue())));
                                    break;
                                default:
                                    float f16 = f14 + 1.0f;
                                    f fVar5 = fVar3;
                                    lVar2.invoke(Float.valueOf(t.d(f16, ((Number) fVar5.getStart()).floatValue(), ((Number) fVar5.b()).floatValue())));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ3);
                }
                i7.b(dVarA3, strQ3, w.d(aVar3, false, null, null, (e23.a) objQ3, 15), jY3, o0VarE, 0, 0);
                o0Var = o0VarE;
                o0Var.g0(z26);
                fVar2 = fVar3;
                rVar3 = rVar5;
            } else {
                o0VarE.e();
                if ((i15 & 8) != 0) {
                    i16 &= -7169;
                }
                rVar4 = rVar2;
            }
            eVar = fVar2;
            o0VarE.h0();
            x1 x1Var2 = n.f135158a;
            r rVarF2 = x2.f(rVar4, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar5 = d92.b.f58625c;
            bVar5.getClass();
            j92.e eVar3 = j92.b.f97899b;
            r rVarA4 = c2.l.A(rVarF2, 0.0f, eVar3.f97917b, 1);
            h4.d.f81522a.getClass();
            h4.g.b bVar6 = h4.d.a.f81534l;
            j jVar2 = j.f22691a;
            bVar5.getClass();
            s2VarF = hb.a.f(jVar2, eVar3.f97918c, bVar6, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarA4, o0VarE);
            g.V.getClass();
            aVar = g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, s2VarF, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            bVar = g.a.f81813j;
            if (o0VarE.T) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            u2 u2Var2 = u2.f22900a;
            s62.a.f157643a.getClass();
            t62.b bVar7 = t62.b.f162798a;
            u4.d dVarA4 = k5.a(bVar7);
            String strQ4 = y.Q(o0VarE, R.string.lbl_minus);
            long jY4 = sn.a.y(o0VarE);
            r.a aVar4 = r.S;
            i17 = i16 & 896;
            if (i17 == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            i18 = i16 & 112;
            if (i18 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z28 = z14 | z15;
            i19 = (i16 & 7168) ^ 3072;
            if (i19 > 2048) {
                rVar5 = rVar4;
                if ((i16 & 3072) != 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
            } else {
                rVar5 = rVar4;
                if ((i16 & 3072) != 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
            }
            z17 = z28 | z16;
            objQ = o0VarE.q();
            aVar2 = m.f135153a;
            if (z17) {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    final int i212 = 0;
                    objQ = new e23.a() { // from class: n21.b
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i212) {
                                case 0:
                                    float f15 = f14 - 1.0f;
                                    f fVar4 = eVar;
                                    lVar2.invoke(Float.valueOf(t.d(f15, ((Number) fVar4.getStart()).floatValue(), ((Number) fVar4.b()).floatValue())));
                                    break;
                                default:
                                    float f16 = f14 + 1.0f;
                                    f fVar5 = eVar;
                                    lVar2.invoke(Float.valueOf(t.d(f16, ((Number) fVar5.getStart()).floatValue(), ((Number) fVar5.b()).floatValue())));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ);
                }
            } else {
                final int i213 = 0;
                objQ = new e23.a() { // from class: n21.b
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i213) {
                            case 0:
                                float f15 = f14 - 1.0f;
                                f fVar4 = eVar;
                                lVar2.invoke(Float.valueOf(t.d(f15, ((Number) fVar4.getStart()).floatValue(), ((Number) fVar4.b()).floatValue())));
                                break;
                            default:
                                float f16 = f14 + 1.0f;
                                f fVar5 = eVar;
                                lVar2.invoke(Float.valueOf(t.d(f16, ((Number) fVar5.getStart()).floatValue(), ((Number) fVar5.b()).floatValue())));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ);
            }
            r rVarD3 = w.d(aVar4, false, null, null, (e23.a) objQ, 15);
            int i214 = i16;
            fVar3 = eVar;
            i7.b(dVarA4, strQ4, rVarD3, jY4, o0VarE, 0, 0);
            c3 c3Var3 = c3.f110949a;
            r rVarA5 = u2Var2.a(aVar4, 1.0f, true);
            if (i17 == 256) {
                z18 = true;
            } else {
                z18 = false;
            }
            objQ2 = o0VarE.q();
            if (z18) {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new k11.n(lVar2, 29);
                    o0VarE.K(objQ2);
                }
            } else {
                objQ2 = new k11.n(lVar2, 29);
                o0VarE.K(objQ2);
            }
            c3Var3.a(f14, (l) objQ2, rVarA5, false, fVar3, 0, null, null, o0VarE, ((i214 >> 3) & 14) | (57344 & (i214 << 3)), 232);
            u4.d dVarA5 = s6.a(bVar7);
            String strQ5 = y.Q(o0VarE, R.string.lbl_plus);
            long jY5 = sn.a.y(o0VarE);
            if (i17 == 256) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (i18 == 32) {
                z24 = true;
            } else {
                z24 = false;
            }
            z25 = z24 | z19 | ((i19 <= 2048 && o0VarE.B(fVar3)) || (i214 & 3072) == 2048);
            objQ3 = o0VarE.q();
            if (z25) {
                aVar2.getClass();
                if (objQ3 == m.a.f135155b) {
                    lVar2 = lVar;
                    z26 = true;
                    final int c18 = 1 == true ? 1 : 0;
                    objQ3 = new e23.a() { // from class: n21.b
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.a
                        public final Object invoke() {
                            switch (c18) {
                                case 0:
                                    float f15 = f14 - 1.0f;
                                    f fVar4 = fVar3;
                                    lVar2.invoke(Float.valueOf(t.d(f15, ((Number) fVar4.getStart()).floatValue(), ((Number) fVar4.b()).floatValue())));
                                    break;
                                default:
                                    float f16 = f14 + 1.0f;
                                    f fVar5 = fVar3;
                                    lVar2.invoke(Float.valueOf(t.d(f16, ((Number) fVar5.getStart()).floatValue(), ((Number) fVar5.b()).floatValue())));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ3);
                } else {
                    lVar2 = lVar;
                    z26 = true;
                }
            } else {
                lVar2 = lVar;
                z26 = true;
                final int c19 = 1 == true ? 1 : 0;
                objQ3 = new e23.a() { // from class: n21.b
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.a
                    public final Object invoke() {
                        switch (c19) {
                            case 0:
                                float f15 = f14 - 1.0f;
                                f fVar4 = fVar3;
                                lVar2.invoke(Float.valueOf(t.d(f15, ((Number) fVar4.getStart()).floatValue(), ((Number) fVar4.b()).floatValue())));
                                break;
                            default:
                                float f16 = f14 + 1.0f;
                                f fVar5 = fVar3;
                                lVar2.invoke(Float.valueOf(t.d(f16, ((Number) fVar5.getStart()).floatValue(), ((Number) fVar5.b()).floatValue())));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ3);
            }
            i7.b(dVarA5, strQ5, w.d(aVar4, false, null, null, (e23.a) objQ3, 15), jY5, o0VarE, 0, 0);
            o0Var = o0VarE;
            o0Var.g0(z26);
            fVar2 = fVar3;
            rVar3 = rVar5;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar3 = rVar2;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b12.c(rVar3, f14, lVar2, fVar2, i14, i15, 4);
        }
    }
}
