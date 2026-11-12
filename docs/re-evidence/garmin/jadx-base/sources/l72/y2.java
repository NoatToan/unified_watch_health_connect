package l72;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import i3.e5;
import i3.i7;
import i3.ta;
import i3.ua;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll72/y2;", "", "<init>", "()V", "components_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y2 f111386a = new y2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f111387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f111388c;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f111387b = 8;
        f111388c = PsExtractor.VIDEO_STREAM_MASK;
    }

    private y2() {
    }

    public static void h(q4.f fVar, float f14, long j8, float f15, int i14) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) / 2;
        boolean z14 = fVar.getLayoutDirection() == g6.o.Ltr;
        float f16 = (z14 ? 0.0f : 1.0f - f14) * fIntBitsToFloat;
        float f17 = (z14 ? f14 : 1.0f) * fIntBitsToFloat;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        n4.c.a aVar = n4.c.f123541b;
        q4.f.G1(fVar, j8, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(f17)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), f15, i14, null, 0, 480);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x018d  */
    public final void a(float f14, float f15, int i14, int i15, int i16, long j8, long j14, h4.r rVar, p3.m mVar) {
        int i17;
        long jD;
        float f16;
        int i18;
        y2 y2Var;
        long j15;
        int i19;
        long j16;
        float f17;
        int i24;
        int i25;
        long j17;
        int i26;
        Object y0Var;
        h4.r rVar2;
        long j18;
        int i27;
        p3.o0 o0VarE = mVar.E(-1806438638);
        if ((i15 & 6) == 0) {
            i17 = (o0VarE.i(f14) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= o0VarE.B(rVar) ? 32 : 16;
        }
        int i28 = i17 | 384;
        if ((i15 & 3072) == 0) {
            jD = j8;
            i28 |= ((i16 & 8) == 0 && o0VarE.l(jD)) ? 2048 : 1024;
        } else {
            jD = j8;
        }
        if ((i15 & 24576) == 0) {
            i28 |= 8192;
        }
        if ((196608 & i15) == 0) {
            if ((i16 & 32) == 0) {
                f16 = f15;
                int i29 = o0VarE.i(f16) ? 131072 : 65536;
                i28 |= i29;
            } else {
                f16 = f15;
            }
            i28 |= i29;
        } else {
            f16 = f15;
        }
        if ((i15 & 1572864) == 0) {
            if ((i16 & 64) == 0) {
                i18 = i14;
                int i30 = o0VarE.k(i18) ? 1048576 : 524288;
                i28 |= i30;
            } else {
                i18 = i14;
            }
            i28 |= i30;
        } else {
            i18 = i14;
        }
        if ((12582912 & i15) == 0) {
            y2Var = this;
            i28 |= o0VarE.B(y2Var) ? 8388608 : 4194304;
        } else {
            y2Var = this;
        }
        boolean z14 = true;
        if (o0VarE.n(i28 & 1, (4793491 & i28) != 4793490)) {
            o0VarE.G0();
            if ((i15 & 1) == 0 || o0VarE.o0()) {
                if ((i16 & 8) != 0) {
                    jD = hb.a.d(d92.b.f58623a, o0VarE);
                    i28 &= -7169;
                }
                d92.b.f58623a.getClass();
                long jG = d92.b.a(o0VarE).c().g();
                int i34 = i28 & (-57345);
                if ((i16 & 32) != 0) {
                    f16 = f111387b;
                    i34 = i28 & (-516097);
                }
                if ((i16 & 64) != 0) {
                    o4.u1.f129010b.getClass();
                    i24 = o4.u1.f129011c;
                    i34 &= -3670017;
                } else {
                    i24 = i18;
                }
                f17 = f16;
                i25 = i34;
                j17 = jG;
            } else {
                o0VarE.e();
                if ((i16 & 8) != 0) {
                    i28 &= -7169;
                }
                int i35 = i28 & (-57345);
                if ((i16 & 32) != 0) {
                    i35 = i28 & (-516097);
                }
                if ((i16 & 64) != 0) {
                    i35 &= -3670017;
                }
                i24 = i18;
                f17 = f16;
                i25 = i35;
                j17 = j14;
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarR = c2.x2.r(u1.z1.a(rVar, f14), f111388c, f17);
            boolean zL = ((((i25 & 3670016) ^ 1572864) > 1048576 && o0VarE.k(i24)) || (i25 & 1572864) == 1048576) | o0VarE.l(j17) | ((i25 & 14) == 4) | ((i25 & 896) == 256);
            if ((((i25 & 7168) ^ 3072) <= 2048 || !o0VarE.l(jD)) && (i25 & 3072) != 2048) {
                z14 = false;
            }
            boolean z15 = zL | z14;
            Object objQ = o0VarE.q();
            if (z15) {
                i26 = i24;
                rVar2 = rVarR;
                j18 = j17;
                i27 = 0;
                y0Var = new a3.y0(j18, i26, f14, jD, 1);
                o0VarE.K(y0Var);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    i26 = i24;
                    rVar2 = rVarR;
                    j18 = j17;
                    i27 = 0;
                    y0Var = new a3.y0(j18, i26, f14, jD, 1);
                    o0VarE.K(y0Var);
                } else {
                    rVar2 = rVarR;
                    i26 = i24;
                    y0Var = objQ;
                    j18 = j17;
                    i27 = 0;
                }
            }
            u1.n.b(rVar2, (e23.l) y0Var, o0VarE, i27);
            j15 = jD;
            j16 = j18;
            i19 = i26;
        } else {
            o0VarE.e();
            j15 = jD;
            i19 = i18;
            j16 = j14;
            f17 = f16;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ta(y2Var, f14, rVar, j15, j16, f17, i19, i15, i16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:60:0x010d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0134  */
    /* JADX WARN: Code duplicated, block: B:64:0x0136  */
    /* JADX WARN: Code duplicated, block: B:67:0x013d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0147  */
    /* JADX WARN: Code duplicated, block: B:71:0x0149  */
    /* JADX WARN: Code duplicated, block: B:73:0x016e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0173  */
    /* JADX WARN: Code duplicated, block: B:78:0x0180  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public final void b(float f14, h4.r rVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, boolean z14, p3.m mVar, int i14, int i15) {
        e23.p<? super p3.m, ? super Integer, Unit> pVar3;
        e23.p<? super p3.m, ? super Integer, Unit> pVar4;
        boolean z15;
        boolean z16;
        p3.o0 o0Var;
        h4.r rVar2;
        boolean z17;
        p3.p2 p2VarI0;
        h4.r.a aVar;
        e23.p<? super p3.m, ? super Integer, Unit> pVar5;
        long jH;
        float f15;
        f5.z0 z0VarD;
        int iHashCode;
        p3.i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar2;
        int i16;
        h5.g.a.b bVar;
        boolean z18;
        Object objQ;
        boolean z19;
        pVar.getClass();
        pVar2.getClass();
        p3.o0 o0VarE = mVar.E(-1253933468);
        int i17 = (o0VarE.i(f14) ? 4 : 2) | i14 | 48;
        if ((i14 & 384) == 0) {
            pVar3 = pVar;
            i17 |= o0VarE.r(pVar3) ? 256 : 128;
        } else {
            pVar3 = pVar;
        }
        if ((i14 & 3072) == 0) {
            pVar4 = pVar2;
            i17 |= o0VarE.r(pVar4) ? 2048 : 1024;
        } else {
            pVar4 = pVar2;
        }
        int i18 = i15 & 16;
        if (i18 == 0) {
            if ((i14 & 24576) == 0) {
                z15 = z14;
                i17 |= o0VarE.h(z15) ? 16384 : 8192;
            }
            if ((i17 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i17 & 1, z16)) {
                aVar = h4.r.S;
                if (i18 != 0) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                p3.x1 x1Var = p3.n.f135158a;
                if (f14 < 1.0f) {
                    pVar5 = pVar3;
                } else {
                    pVar5 = pVar4;
                }
                if (z17) {
                    o0VarE.C(1855759599);
                    d92.b.f58623a.getClass();
                    jH = d92.b.a(o0VarE).f().f63508c;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1855760651);
                    jH = fb1.c.h(d92.b.f58623a, o0VarE, false);
                }
                h4.d.f81522a.getClass();
                h4.g gVar = h4.d.a.f81528f;
                f15 = 72;
                g6.f.a aVar3 = g6.f.f75994b;
                h4.r rVarQ = c2.x2.q(aVar, f15);
                aVar.getClass();
                z0VarD = c2.q.d(gVar, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarQ, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                i16 = i17;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
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
                h4.r rVarQ2 = c2.x2.q(aVar, f15);
                o4.d0.f128823b.getClass();
                long j8 = jH;
                long j14 = o4.d0.f128831j;
                o4.u1.f129010b.getClass();
                int i19 = o4.u1.f129012d;
                float f16 = 0;
                float f17 = 4;
                if ((i16 & 14) == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objQ = o0VarE.q();
                if (z18) {
                    z19 = true;
                    objQ = new g02.j0(f14, 1);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        z19 = true;
                        objQ = new g02.j0(f14, 1);
                        o0VarE.K(objQ);
                    } else {
                        z19 = true;
                    }
                }
                ua.b((e23.a) objQ, rVarQ2, j8, f17, j14, i19, f16, o0VarE, 1600560, 0);
                o0Var = o0VarE;
                e5.q(0, pVar5, o0Var, z19);
                rVar2 = aVar;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar2 = rVar;
                z17 = z15;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new x2(this, f14, rVar2, pVar, pVar4, z17, i14, i15);
            }
        }
        i17 |= 24576;
        z15 = z14;
        if ((i17 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i17 & 1, z16)) {
            aVar = h4.r.S;
            if (i18 != 0) {
                z17 = true;
            } else {
                z17 = z15;
            }
            p3.x1 x1Var2 = p3.n.f135158a;
            if (f14 < 1.0f) {
                pVar5 = pVar3;
            } else {
                pVar5 = pVar4;
            }
            if (z17) {
                o0VarE.C(1855759599);
                d92.b.f58623a.getClass();
                jH = d92.b.a(o0VarE).f().f63508c;
                o0VarE.g0(false);
            } else {
                o0VarE.C(1855760651);
                jH = fb1.c.h(d92.b.f58623a, o0VarE, false);
            }
            h4.d.f81522a.getClass();
            h4.g gVar2 = h4.d.a.f81528f;
            f15 = 72;
            g6.f.a aVar4 = g6.f.f75994b;
            h4.r rVarQ3 = c2.x2.q(aVar, f15);
            aVar.getClass();
            z0VarD = c2.q.d(gVar2, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarQ3, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            i16 = i17;
            if (o0VarE.f135177b != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
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
            h4.r rVarQ4 = c2.x2.q(aVar, f15);
            o4.d0.f128823b.getClass();
            long j15 = jH;
            long j16 = o4.d0.f128831j;
            o4.u1.f129010b.getClass();
            int i110 = o4.u1.f129012d;
            float f18 = 0;
            float f19 = 4;
            if ((i16 & 14) == 4) {
                z18 = true;
            } else {
                z18 = false;
            }
            objQ = o0VarE.q();
            if (z18) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    z19 = true;
                    objQ = new g02.j0(f14, 1);
                    o0VarE.K(objQ);
                } else {
                    z19 = true;
                }
            } else {
                z19 = true;
                objQ = new g02.j0(f14, 1);
                o0VarE.K(objQ);
            }
            ua.b((e23.a) objQ, rVarQ4, j15, f19, j16, i110, f18, o0VarE, 1600560, 0);
            o0Var = o0VarE;
            e5.q(0, pVar5, o0Var, z19);
            rVar2 = aVar;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
            z17 = z15;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new x2(this, f14, rVar2, pVar, pVar4, z17, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00de  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:59:0x0103  */
    /* JADX WARN: Code duplicated, block: B:62:0x0127  */
    /* JADX WARN: Code duplicated, block: B:63:0x012a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0132  */
    /* JADX WARN: Code duplicated, block: B:69:0x013c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0142  */
    /* JADX WARN: Code duplicated, block: B:72:0x016e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0173  */
    /* JADX WARN: Code duplicated, block: B:77:0x017e  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public final void c(float f14, h4.r rVar, boolean z14, p3.m mVar, final int i14, final int i15) {
        int i16;
        h4.r rVar2;
        int i17;
        boolean z15;
        boolean z16;
        final h4.r rVar3;
        final boolean z17;
        p3.p2 p2VarI0;
        int i18;
        long jH;
        long j8;
        h4.r.a aVar;
        float f15;
        f5.z0 z0VarD;
        int iHashCode;
        p3.i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar2;
        h5.g.a.b bVar;
        boolean z18;
        Object objQ;
        boolean z19;
        final float f16 = f14;
        p3.o0 o0VarE = mVar.E(-813420954);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.i(f16) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i19 = i15 & 2;
        if (i19 != 0) {
            i17 = i16 | 48;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i17 = i16 | (o0VarE.B(rVar2) ? 32 : 16);
        }
        int i24 = i15 & 4;
        if (i24 == 0) {
            if ((i14 & 384) == 0) {
                z15 = z14;
                i17 |= o0VarE.h(z15) ? 256 : 128;
            }
            if ((i17 & 147) != 146) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i17 & 1, z16)) {
                if (i19 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i24 != 0) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                p3.x1 x1Var = p3.n.f135158a;
                if (f16 < 1.0f) {
                    i18 = R.drawable.progress_icon;
                } else {
                    i18 = R.drawable.progress_done;
                }
                if (z17) {
                    o0VarE.C(-13479919);
                    d92.b.f58623a.getClass();
                    jH = d92.b.a(o0VarE).f().f63508c;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-13478867);
                    jH = fb1.c.h(d92.b.f58623a, o0VarE, false);
                }
                j8 = jH;
                h4.d.f81522a.getClass();
                h4.g gVar = h4.d.a.f81528f;
                aVar = h4.r.S;
                f15 = 72;
                g6.f.a aVar3 = g6.f.f75994b;
                h4.r rVarThen = rVar3.then(c2.x2.q(aVar, f15));
                z0VarD = c2.q.d(gVar, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarThen, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
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
                h4.r rVarQ = c2.x2.q(aVar, f15);
                o4.d0.f128823b.getClass();
                long j14 = o4.d0.f128831j;
                o4.u1.f129010b.getClass();
                int i25 = o4.u1.f129012d;
                float f17 = 0;
                float f18 = 4;
                if ((i17 & 14) == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objQ = o0VarE.q();
                if (z18) {
                    f16 = f14;
                    z19 = true;
                    objQ = new g02.j0(f16, 1);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        f16 = f14;
                        z19 = true;
                        objQ = new g02.j0(f16, 1);
                        o0VarE.K(objQ);
                    } else {
                        f16 = f14;
                        z19 = true;
                    }
                }
                ua.b((e23.a) objQ, rVarQ, j8, f18, j14, i25, f17, o0VarE, 1600560, 0);
                f111386a.f(i18, ((i17 >> 6) & 14) | 384, o0VarE, z17);
                o0VarE.g0(z19);
            } else {
                o0VarE.e();
                rVar3 = rVar2;
                z17 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: l72.w2
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        p3.m mVar2 = (p3.m) obj;
                        ((Integer) obj2).getClass();
                        y2 y2Var = y2.f111386a;
                        this.f111332a.c(f16, rVar3, z17, mVar2, p3.p0.t(i14 | 1), i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i17 |= 384;
        z15 = z14;
        if ((i17 & 147) != 146) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i17 & 1, z16)) {
            if (i19 != 0) {
                rVar3 = h4.r.S;
            } else {
                rVar3 = rVar2;
            }
            if (i24 != 0) {
                z17 = true;
            } else {
                z17 = z15;
            }
            p3.x1 x1Var2 = p3.n.f135158a;
            if (f16 < 1.0f) {
                i18 = R.drawable.progress_icon;
            } else {
                i18 = R.drawable.progress_done;
            }
            if (z17) {
                o0VarE.C(-13479919);
                d92.b.f58623a.getClass();
                jH = d92.b.a(o0VarE).f().f63508c;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-13478867);
                jH = fb1.c.h(d92.b.f58623a, o0VarE, false);
            }
            j8 = jH;
            h4.d.f81522a.getClass();
            h4.g gVar2 = h4.d.a.f81528f;
            aVar = h4.r.S;
            f15 = 72;
            g6.f.a aVar4 = g6.f.f75994b;
            h4.r rVarThen2 = rVar3.then(c2.x2.q(aVar, f15));
            z0VarD = c2.q.d(gVar2, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarThen2, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
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
            h4.r rVarQ2 = c2.x2.q(aVar, f15);
            o4.d0.f128823b.getClass();
            long j15 = o4.d0.f128831j;
            o4.u1.f129010b.getClass();
            int i26 = o4.u1.f129012d;
            float f19 = 0;
            float f110 = 4;
            if ((i17 & 14) == 4) {
                z18 = true;
            } else {
                z18 = false;
            }
            objQ = o0VarE.q();
            if (z18) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    f16 = f14;
                    z19 = true;
                    objQ = new g02.j0(f16, 1);
                    o0VarE.K(objQ);
                } else {
                    f16 = f14;
                    z19 = true;
                }
            } else {
                f16 = f14;
                z19 = true;
                objQ = new g02.j0(f16, 1);
                o0VarE.K(objQ);
            }
            ua.b((e23.a) objQ, rVarQ2, j8, f110, j15, i26, f19, o0VarE, 1600560, 0);
            f111386a.f(i18, ((i17 >> 6) & 14) | 384, o0VarE, z17);
            o0VarE.g0(z19);
        } else {
            o0VarE.e();
            rVar3 = rVar2;
            z17 = z15;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: l72.w2
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    y2 y2Var = y2.f111386a;
                    this.f111332a.c(f16, rVar3, z17, mVar2, p3.p0.t(i14 | 1), i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00db  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x0107  */
    /* JADX WARN: Code duplicated, block: B:62:0x0113  */
    /* JADX WARN: Code duplicated, block: B:64:0x013f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0163  */
    /* JADX WARN: Code duplicated, block: B:68:0x019c  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public final void d(boolean z14, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, h4.r rVar, boolean z15, p3.m mVar, int i14, int i15) {
        e23.p<? super p3.m, ? super Integer, Unit> pVar3;
        e23.p<? super p3.m, ? super Integer, Unit> pVar4;
        boolean z16;
        boolean z17;
        p3.o0 o0Var;
        h4.r rVar2;
        boolean z18;
        p3.p2 p2VarI0;
        h4.r.a aVar;
        e23.p<? super p3.m, ? super Integer, Unit> pVar5;
        long jH;
        float f14;
        f5.z0 z0VarD;
        int iHashCode;
        p3.i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar2;
        boolean z19;
        h5.g.a.b bVar;
        e23.p<? super p3.m, ? super Integer, Unit> pVar6;
        boolean z24;
        int i16;
        Object objQ;
        pVar.getClass();
        pVar2.getClass();
        p3.o0 o0VarE = mVar.E(-1416170340);
        int i17 = (o0VarE.h(z14) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            pVar3 = pVar;
            i17 |= o0VarE.r(pVar3) ? 32 : 16;
        } else {
            pVar3 = pVar;
        }
        if ((i14 & 384) == 0) {
            pVar4 = pVar2;
            i17 |= o0VarE.r(pVar4) ? 256 : 128;
        } else {
            pVar4 = pVar2;
        }
        int i18 = i17 | 3072;
        int i19 = i15 & 16;
        if (i19 == 0) {
            if ((i14 & 24576) == 0) {
                z16 = z15;
                i18 |= o0VarE.h(z16) ? 16384 : 8192;
            }
            if ((i18 & 9363) != 9362) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i18 & 1, z17)) {
                aVar = h4.r.S;
                if (i19 != 0) {
                    z16 = true;
                }
                p3.x1 x1Var = p3.n.f135158a;
                if (z14) {
                    pVar5 = pVar4;
                } else {
                    pVar5 = pVar3;
                }
                if (z16) {
                    o0VarE.C(564947463);
                    d92.b.f58623a.getClass();
                    jH = d92.b.a(o0VarE).f().f63508c;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(564948515);
                    jH = fb1.c.h(d92.b.f58623a, o0VarE, false);
                }
                h4.d.f81522a.getClass();
                h4.g gVar = h4.d.a.f81528f;
                f14 = 72;
                g6.f.a aVar3 = g6.f.f75994b;
                h4.r rVarQ = c2.x2.q(aVar, f14);
                aVar.getClass();
                z0VarD = c2.q.d(gVar, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarQ, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                z19 = z16;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
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
                if (z14) {
                    o0VarE.C(842529499);
                    e23.p<? super p3.m, ? super Integer, Unit> pVar7 = pVar5;
                    h4.r rVarQ2 = c2.x2.q(aVar, f14);
                    o4.d0.f128823b.getClass();
                    long j8 = o4.d0.f128831j;
                    o4.u1.f129010b.getClass();
                    int i24 = o4.u1.f129012d;
                    float f15 = 0;
                    float f16 = 4;
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new o2(2);
                        o0VarE.K(objQ);
                    }
                    e23.a aVar4 = (e23.a) objQ;
                    rVar2 = aVar;
                    i16 = 0;
                    z24 = true;
                    pVar6 = pVar7;
                    ua.b(aVar4, rVarQ2, jH, f16, j8, i24, f15, o0VarE, 1600566, 0);
                    o0Var = o0VarE;
                    o0Var.g0(false);
                } else {
                    rVar2 = aVar;
                    pVar6 = pVar5;
                    z24 = true;
                    i16 = 0;
                    o0VarE.C(842920130);
                    h4.r rVarQ3 = c2.x2.q(rVar2, f14);
                    o4.d0.f128823b.getClass();
                    long j14 = o4.d0.f128831j;
                    o4.u1.f129010b.getClass();
                    ua.a(4, 0, o4.u1.f129012d, 200070, 0, jH, j14, rVarQ3, o0VarE);
                    o0Var = o0VarE;
                    o0Var.g0(false);
                }
                e5.q(i16, pVar6, o0Var, z24);
                z18 = z19;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar2 = rVar;
                z18 = z16;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new at.a(this, z14, pVar, pVar2, rVar2, z18, i14, i15);
            }
        }
        i18 = i17 | 27648;
        z16 = z15;
        if ((i18 & 9363) != 9362) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (o0VarE.n(i18 & 1, z17)) {
            aVar = h4.r.S;
            if (i19 != 0) {
                z16 = true;
            }
            p3.x1 x1Var2 = p3.n.f135158a;
            if (z14) {
                pVar5 = pVar4;
            } else {
                pVar5 = pVar3;
            }
            if (z16) {
                o0VarE.C(564947463);
                d92.b.f58623a.getClass();
                jH = d92.b.a(o0VarE).f().f63508c;
                o0VarE.g0(false);
            } else {
                o0VarE.C(564948515);
                jH = fb1.c.h(d92.b.f58623a, o0VarE, false);
            }
            h4.d.f81522a.getClass();
            h4.g gVar2 = h4.d.a.f81528f;
            f14 = 72;
            g6.f.a aVar5 = g6.f.f75994b;
            h4.r rVarQ4 = c2.x2.q(aVar, f14);
            aVar.getClass();
            z0VarD = c2.q.d(gVar2, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarQ4, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            z19 = z16;
            if (o0VarE.f135177b != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
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
                o0VarE.C(842529499);
                e23.p<? super p3.m, ? super Integer, Unit> pVar8 = pVar5;
                h4.r rVarQ5 = c2.x2.q(aVar, f14);
                o4.d0.f128823b.getClass();
                long j15 = o4.d0.f128831j;
                o4.u1.f129010b.getClass();
                int i25 = o4.u1.f129012d;
                float f17 = 0;
                float f18 = 4;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new o2(2);
                    o0VarE.K(objQ);
                }
                e23.a aVar6 = (e23.a) objQ;
                rVar2 = aVar;
                i16 = 0;
                z24 = true;
                pVar6 = pVar8;
                ua.b(aVar6, rVarQ5, jH, f18, j15, i25, f17, o0VarE, 1600566, 0);
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                rVar2 = aVar;
                pVar6 = pVar5;
                z24 = true;
                i16 = 0;
                o0VarE.C(842920130);
                h4.r rVarQ6 = c2.x2.q(rVar2, f14);
                o4.d0.f128823b.getClass();
                long j16 = o4.d0.f128831j;
                o4.u1.f129010b.getClass();
                ua.a(4, 0, o4.u1.f129012d, 200070, 0, jH, j16, rVarQ6, o0VarE);
                o0Var = o0VarE;
                o0Var.g0(false);
            }
            e5.q(i16, pVar6, o0Var, z24);
            z18 = z19;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
            z18 = z16;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.a(this, z14, pVar, pVar2, rVar2, z18, i14, i15);
        }
    }

    public final void e(boolean z14, h4.r rVar, boolean z15, p3.m mVar, int i14) {
        h4.r rVar2;
        boolean z16;
        int i15;
        p3.o0 o0VarE = mVar.E(1814606810);
        int i16 = i14 | (o0VarE.h(z14) ? 4 : 2) | 432;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            h4.r.a aVar = h4.r.S;
            p3.x1 x1Var = p3.n.f135158a;
            int i17 = z14 ? R.drawable.progress_done : R.drawable.progress_icon;
            o0VarE.C(80431269);
            d92.b.f58623a.getClass();
            long j8 = d92.b.a(o0VarE).f().f63508c;
            o0VarE.g0(false);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81528f;
            float f14 = 72;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarQ = c2.x2.q(aVar, f14);
            aVar.getClass();
            f5.z0 z0VarD = c2.q.d(gVar, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarQ, o0VarE);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            if (z14) {
                o0VarE.C(457952477);
                int i18 = i17;
                h4.r rVarQ2 = c2.x2.q(aVar, f14);
                o4.d0.f128823b.getClass();
                long j14 = o4.d0.f128831j;
                o4.u1.f129010b.getClass();
                int i19 = o4.u1.f129012d;
                float f15 = 0;
                float f16 = 4;
                Object objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new o2(2);
                    o0VarE.K(objQ);
                }
                i15 = i18;
                ua.b((e23.a) objQ, rVarQ2, j8, f16, j14, i19, f15, o0VarE, 1600566, 0);
                o0VarE.g0(false);
            } else {
                i15 = i17;
                o0VarE.C(458343108);
                h4.r rVarQ3 = c2.x2.q(aVar, f14);
                o4.d0.f128823b.getClass();
                long j15 = o4.d0.f128831j;
                o4.u1.f129010b.getClass();
                ua.a(4, 0, o4.u1.f129012d, 200070, 0, j8, j15, rVarQ3, o0VarE);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
            f111386a.f(i15, 390, o0VarE, true);
            o0VarE.g0(true);
            rVar2 = aVar;
            z16 = true;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            z16 = z15;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ha0.e(this, z14, rVar2, z16, i14);
        }
    }

    public final void f(int i14, int i15, p3.m mVar, boolean z14) {
        int i16;
        long jH;
        p3.o0 o0VarE = mVar.E(32908109);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.h(z14) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.k(i14) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (z14) {
                o0VarE.C(1559925624);
                d92.b.f58623a.getClass();
                jH = d92.b.a(o0VarE).f().f63508c;
                o0VarE.g0(false);
            } else {
                o0VarE.C(1559926676);
                jH = fb1.c.h(d92.b.f58623a, o0VarE, false);
            }
            t4.d dVarA = n5.c.a(i14, o0VarE, (i16 >> 3) & 14);
            g6.f.a aVar = g6.f.f75994b;
            u1.y0.a(dVarA, null, c2.x2.q(h4.r.S, 40), null, null, 0.0f, o4.e0.a.a(o4.e0.f128843b, jH), o0VarE, 432, 56);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.e1(this, z14, i14, i15, 2);
        }
    }

    public final void g(boolean z14, u4.d dVar, p3.m mVar, int i14, int i15) {
        int i16;
        long jH;
        p3.o0 o0VarE = mVar.E(-1504576356);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = i14 | (o0VarE.h(z14) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(dVar) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            if (i17 != 0) {
                z14 = true;
            }
            p3.x1 x1Var = p3.n.f135158a;
            if (z14) {
                o0VarE.C(1506104615);
                d92.b.f58623a.getClass();
                jH = d92.b.a(o0VarE).f().f63508c;
                o0VarE.g0(false);
            } else {
                o0VarE.C(1506105667);
                jH = fb1.c.h(d92.b.f58623a, o0VarE, false);
            }
            long j8 = jH;
            g6.f.a aVar = g6.f.f75994b;
            i7.b(dVar, null, c2.x2.q(h4.r.S, 40), j8, o0VarE, ((i16 >> 3) & 14) | 432, 0);
        } else {
            o0VarE.e();
        }
        boolean z15 = z14;
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.a(this, z15, dVar, i14, i15, 4);
        }
    }
}
