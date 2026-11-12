package b82;

import android.content.res.Resources;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class a1 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16439a;

        static {
            int[] iArr = new int[l72.w1.values().length];
            try {
                iArr[l72.w1.TopStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l72.w1.StartTop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l72.w1.TopCenter.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l72.w1.TopEnd.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[l72.w1.EndTop.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[l72.w1.BottomStart.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[l72.w1.StartBottom.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[l72.w1.BottomCenter.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[l72.w1.BottomEnd.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[l72.w1.EndBottom.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[l72.w1.CenterStart.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[l72.w1.StartCenter.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[l72.w1.Center.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[l72.w1.CenterEnd.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[l72.w1.EndCenter.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            f16439a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:135:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:138:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:140:0x0325  */
    /* JADX WARN: Code duplicated, block: B:142:0x0329  */
    /* JADX WARN: Code duplicated, block: B:145:0x0334  */
    /* JADX WARN: Code duplicated, block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0077  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:84:0x0138  */
    /* JADX WARN: Code duplicated, block: B:86:0x013f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0143  */
    /* JADX WARN: Code duplicated, block: B:90:0x0156  */
    /* JADX WARN: Code duplicated, block: B:92:0x0164  */
    /* JADX WARN: Code duplicated, block: B:95:0x0170  */
    public static final void a(String str, l72.w1 w1Var, l72.x1 x1Var, Integer num, long j8, boolean z14, e23.a aVar, e23.q qVar, p3.m mVar, int i14, int i15) {
        int i16;
        Integer num2;
        int i17;
        long j14;
        int i18;
        boolean z15;
        Integer num3;
        long j15;
        p2 p2VarI0;
        Object objQ;
        p3.m.a.C2565a c2565a;
        p3.p1 p1Var;
        h4.r.a aVar2;
        f5.z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        int i19;
        h5.e0.a aVar3;
        Integer num4;
        h5.g.a.b bVar;
        Object objQ2;
        long jI;
        float fIntBitsToFloat;
        l72.y1 y1Var;
        int i24;
        int i25;
        int i26;
        w1Var.getClass();
        x1Var.getClass();
        qVar.getClass();
        p3.o0 o0VarE = mVar.E(-1505893891);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i27 = i16 | 48;
        if ((i14 & 384) == 0) {
            i27 |= o0VarE.k(w1Var.ordinal()) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i27 |= o0VarE.k(x1Var.ordinal()) ? 2048 : 1024;
        }
        int i28 = i15 & 16;
        if (i28 == 0) {
            if ((i14 & 24576) == 0) {
                num2 = num;
                i27 |= o0VarE.B(num2) ? 16384 : 8192;
            }
            i17 = i15 & 32;
            if (i17 != 0) {
                if ((196608 & i14) == 0) {
                    j14 = j8;
                    if (o0VarE.l(j14)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i27 |= i18;
                }
                if ((1572864 & i14) == 0) {
                    if (o0VarE.h(z14)) {
                        i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i26 = 524288;
                    }
                    i27 |= i26;
                }
                if ((12582912 & i14) == 0) {
                    if (o0VarE.r(aVar)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i27 |= i25;
                }
                if ((100663296 & i14) == 0) {
                    if (o0VarE.r(qVar)) {
                        i24 = 67108864;
                    } else {
                        i24 = 33554432;
                    }
                    i27 |= i24;
                }
                if ((38347923 & i27) != 38347922) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (o0VarE.n(i27 & 1, z15)) {
                    if (i28 != 0) {
                        num2 = null;
                    }
                    if (i17 != 0) {
                        long j16 = 0;
                        j14 = (j16 << 32) | (j16 & 4294967295L);
                        g6.k.a aVar4 = g6.k.f76003b;
                    }
                    p3.x1 x1Var2 = p3.n.f135158a;
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = p3.p0.n(null);
                        o0VarE.K(objQ);
                    }
                    p1Var = (p3.p1) objQ;
                    aVar2 = h4.r.S;
                    h4.r rVarB = h4.p.b(aVar2, 1.0f);
                    h4.d.f81522a.getClass();
                    z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarB, o0VarE);
                    h5.g.V.getClass();
                    i19 = i27;
                    aVar3 = h5.g.a.f81805b;
                    num4 = num2;
                    if (o0VarE.f135177b != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar3);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.u uVar = c2.u.f22885a;
                    if (z14 || p1Var.getF182175a() == 0) {
                        j14 = j14;
                        o0VarE.C(1135843935);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(1134914648);
                        f5.c0 c0Var = (f5.c0) p1Var.getF182175a();
                        if (c0Var == null) {
                            j14 = j14;
                            y1Var = new l72.y1(0L, null, null, 0.0f, 0.0f, 31, null);
                        } else {
                            l72.y1 y1Var2 = new l72.y1(0L, null, null, 0.0f, 0.0f, 31, null);
                            n4.d dVarA = f5.d0.a(c0Var);
                            float f14 = dVarA.f123550d;
                            float f15 = dVarA.f123548b;
                            switch (a.f16439a[w1Var.ordinal()]) {
                                case 1:
                                case 2:
                                    jI = dVarA.i();
                                    break;
                                case 3:
                                    jI = dVarA.h();
                                    break;
                                case 4:
                                case 5:
                                    jI = dVarA.j();
                                    break;
                                case 6:
                                case 7:
                                    jI = dVarA.d();
                                    break;
                                case 8:
                                    jI = dVarA.c();
                                    break;
                                case 9:
                                case 10:
                                    jI = dVarA.e();
                                    break;
                                case 11:
                                case 12:
                                    jI = (((long) Float.floatToRawIntBits(q6.f.c(f14, f15, 2.0f, f15))) & 4294967295L) | (((long) Float.floatToRawIntBits(dVarA.f123547a)) << 32);
                                    n4.c.a aVar5 = n4.c.f123541b;
                                    break;
                                case 13:
                                    jI = dVarA.f();
                                    break;
                                case 14:
                                case 15:
                                    jI = (((long) Float.floatToRawIntBits(q6.f.c(f14, f15, 2.0f, f15))) & 4294967295L) | (((long) Float.floatToRawIntBits(dVarA.f123549c)) << 32);
                                    n4.c.a aVar6 = n4.c.f123541b;
                                    break;
                                default:
                                    lc.u0.r();
                                    return;
                            }
                            if (l72.a2.d(w1Var)) {
                                fIntBitsToFloat = Float.intBitsToFloat((int) (jI >> 32)) - (num4 != null ? b(num4.intValue()) : 0);
                            } else {
                                fIntBitsToFloat = Float.intBitsToFloat((int) (jI >> 32));
                            }
                            g6.k.a aVar7 = g6.k.f76003b;
                            long j17 = jI;
                            y1Var = new l72.y1((((long) ((int) (fIntBitsToFloat + b((int) (j14 >> 32))))) << 32) | (((long) ((int) (Float.intBitsToFloat((int) (j17 & 4294967295L)) + b((int) (j14 & 4294967295L))))) & 4294967295L), w1Var, x1Var, y1Var2.f111384d, (num4 != null ? Integer.valueOf(b(num4.intValue())) : Float.valueOf(Float.intBitsToFloat((int) (dVarA.j() >> 32)) - Float.intBitsToFloat((int) (j17 >> 32)))).floatValue(), null);
                        }
                        ((g6.c) o0VarE.A(kotlin.t1.f91490h)).d1(y1Var.f111385e);
                        boolean z16 = (i19 & 29360128) == 8388608;
                        Object objQ3 = o0VarE.q();
                        if (z16 || objQ3 == c2565a) {
                            objQ3 = new as.n(aVar, 18);
                            o0VarE.K(objQ3);
                        }
                        l72.a2.a(y1Var, (e23.a) objQ3, z3.f.c(6248301, new as.p(str, 2), o0VarE), o0VarE, 384);
                        o0VarE.g0(false);
                    }
                    objQ2 = o0VarE.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new a11.m(p1Var, 3);
                        o0VarE.K(objQ2);
                    }
                    qVar.invoke(f5.g0.f(aVar2, (e23.l) objQ2), o0VarE, Integer.valueOf(((i19 >> 21) & 112) | 6));
                    o0VarE.g0(true);
                    num3 = num4;
                    j15 = j14;
                } else {
                    o0VarE.e();
                    num3 = num2;
                    j15 = j14;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new z0(str, w1Var, x1Var, num3, j15, z14, aVar, qVar, i14, i15);
                }
            }
            i27 |= 196608;
            j14 = j8;
            if ((1572864 & i14) == 0) {
                if (o0VarE.h(z14)) {
                    i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i26 = 524288;
                }
                i27 |= i26;
            }
            if ((12582912 & i14) == 0) {
                if (o0VarE.r(aVar)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i27 |= i25;
            }
            if ((100663296 & i14) == 0) {
                if (o0VarE.r(qVar)) {
                    i24 = 67108864;
                } else {
                    i24 = 33554432;
                }
                i27 |= i24;
            }
            if ((38347923 & i27) != 38347922) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i27 & 1, z15)) {
                if (i28 != 0) {
                    num2 = null;
                }
                if (i17 != 0) {
                    long j18 = 0;
                    j14 = (j18 << 32) | (j18 & 4294967295L);
                    g6.k.a aVar8 = g6.k.f76003b;
                }
                p3.x1 x1Var3 = p3.n.f135158a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p3.p0.n(null);
                    o0VarE.K(objQ);
                }
                p1Var = (p3.p1) objQ;
                aVar2 = h4.r.S;
                h4.r rVarB2 = h4.p.b(aVar2, 1.0f);
                h4.d.f81522a.getClass();
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarB2, o0VarE);
                h5.g.V.getClass();
                i19 = i27;
                aVar3 = h5.g.a.f81805b;
                num4 = num2;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.u uVar2 = c2.u.f22885a;
                if (z14) {
                    j14 = j14;
                    o0VarE.C(1135843935);
                    o0VarE.g0(false);
                } else {
                    j14 = j14;
                    o0VarE.C(1135843935);
                    o0VarE.g0(false);
                }
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new a11.m(p1Var, 3);
                    o0VarE.K(objQ2);
                }
                qVar.invoke(f5.g0.f(aVar2, (e23.l) objQ2), o0VarE, Integer.valueOf(((i19 >> 21) & 112) | 6));
                o0VarE.g0(true);
                num3 = num4;
                j15 = j14;
            } else {
                o0VarE.e();
                num3 = num2;
                j15 = j14;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new z0(str, w1Var, x1Var, num3, j15, z14, aVar, qVar, i14, i15);
            }
        }
        i27 |= 24576;
        num2 = num;
        i17 = i15 & 32;
        if (i17 != 0) {
            if ((196608 & i14) == 0) {
                j14 = j8;
                if (o0VarE.l(j14)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i27 |= i18;
            }
            if ((1572864 & i14) == 0) {
                if (o0VarE.h(z14)) {
                    i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i26 = 524288;
                }
                i27 |= i26;
            }
            if ((12582912 & i14) == 0) {
                if (o0VarE.r(aVar)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i27 |= i25;
            }
            if ((100663296 & i14) == 0) {
                if (o0VarE.r(qVar)) {
                    i24 = 67108864;
                } else {
                    i24 = 33554432;
                }
                i27 |= i24;
            }
            if ((38347923 & i27) != 38347922) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i27 & 1, z15)) {
                if (i28 != 0) {
                    num2 = null;
                }
                if (i17 != 0) {
                    long j19 = 0;
                    j14 = (j19 << 32) | (j19 & 4294967295L);
                    g6.k.a aVar9 = g6.k.f76003b;
                }
                p3.x1 x1Var4 = p3.n.f135158a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p3.p0.n(null);
                    o0VarE.K(objQ);
                }
                p1Var = (p3.p1) objQ;
                aVar2 = h4.r.S;
                h4.r rVarB3 = h4.p.b(aVar2, 1.0f);
                h4.d.f81522a.getClass();
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarB3, o0VarE);
                h5.g.V.getClass();
                i19 = i27;
                aVar3 = h5.g.a.f81805b;
                num4 = num2;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.u uVar3 = c2.u.f22885a;
                if (z14) {
                    j14 = j14;
                    o0VarE.C(1135843935);
                    o0VarE.g0(false);
                } else {
                    j14 = j14;
                    o0VarE.C(1135843935);
                    o0VarE.g0(false);
                }
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new a11.m(p1Var, 3);
                    o0VarE.K(objQ2);
                }
                qVar.invoke(f5.g0.f(aVar2, (e23.l) objQ2), o0VarE, Integer.valueOf(((i19 >> 21) & 112) | 6));
                o0VarE.g0(true);
                num3 = num4;
                j15 = j14;
            } else {
                o0VarE.e();
                num3 = num2;
                j15 = j14;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new z0(str, w1Var, x1Var, num3, j15, z14, aVar, qVar, i14, i15);
            }
        }
        i27 |= 196608;
        j14 = j8;
        if ((1572864 & i14) == 0) {
            if (o0VarE.h(z14)) {
                i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i26 = 524288;
            }
            i27 |= i26;
        }
        if ((12582912 & i14) == 0) {
            if (o0VarE.r(aVar)) {
                i25 = 8388608;
            } else {
                i25 = 4194304;
            }
            i27 |= i25;
        }
        if ((100663296 & i14) == 0) {
            if (o0VarE.r(qVar)) {
                i24 = 67108864;
            } else {
                i24 = 33554432;
            }
            i27 |= i24;
        }
        if ((38347923 & i27) != 38347922) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (o0VarE.n(i27 & 1, z15)) {
            if (i28 != 0) {
                num2 = null;
            }
            if (i17 != 0) {
                long j110 = 0;
                j14 = (j110 << 32) | (j110 & 4294967295L);
                g6.k.a aVar10 = g6.k.f76003b;
            }
            p3.x1 x1Var5 = p3.n.f135158a;
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(null);
                o0VarE.K(objQ);
            }
            p1Var = (p3.p1) objQ;
            aVar2 = h4.r.S;
            h4.r rVarB4 = h4.p.b(aVar2, 1.0f);
            h4.d.f81522a.getClass();
            z0VarD = c2.q.d(h4.d.a.f81524b, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarB4, o0VarE);
            h5.g.V.getClass();
            i19 = i27;
            aVar3 = h5.g.a.f81805b;
            num4 = num2;
            if (o0VarE.f135177b != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar4 = c2.u.f22885a;
            if (z14) {
                j14 = j14;
                o0VarE.C(1135843935);
                o0VarE.g0(false);
            } else {
                j14 = j14;
                o0VarE.C(1135843935);
                o0VarE.g0(false);
            }
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new a11.m(p1Var, 3);
                o0VarE.K(objQ2);
            }
            qVar.invoke(f5.g0.f(aVar2, (e23.l) objQ2), o0VarE, Integer.valueOf(((i19 >> 21) & 112) | 6));
            o0VarE.g0(true);
            num3 = num4;
            j15 = j14;
        } else {
            o0VarE.e();
            num3 = num2;
            j15 = j14;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z0(str, w1Var, x1Var, num3, j15, z14, aVar, qVar, i14, i15);
        }
    }

    public static final int b(int i14) {
        return (int) (i14 * Resources.getSystem().getDisplayMetrics().density);
    }
}
