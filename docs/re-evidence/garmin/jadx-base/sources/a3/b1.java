package a3;

import c2.x2;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import p005kotlin.Unit;
import p3.p2;
import p3.x1;
import p3.x3;
import s1.d2;
import s1.e2;
import u1.y1;
import u1.z1;

/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s1.w f625d;

    static {
        s0.f817a.getClass();
        f622a = s0.f818b;
        float f14 = PsExtractor.VIDEO_STREAM_MASK;
        g6.f.a aVar = g6.f.f75994b;
        f623b = f14;
        f624c = 40;
        new s1.w(0.2f, 0.0f, 0.8f, 1.0f);
        new s1.w(0.4f, 0.0f, 1.0f, 1.0f);
        new s1.w(0.0f, 0.0f, 0.65f, 1.0f);
        new s1.w(0.1f, 0.0f, 0.45f, 1.0f);
        f625d = new s1.w(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x012a  */
    public static final void a(final float f14, final h4.r rVar, final long j8, final float f15, long j14, p3.m mVar, final int i14) {
        int i15;
        final long j15;
        long j16;
        int i16;
        Object obj;
        final long j17;
        p3.o0 o0VarE = mVar.E(1746618448);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.i(f14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.l(j8) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.i(f15) ? 2048 : 1024;
        }
        int i17 = i15 | 24576;
        if ((196608 & i14) == 0) {
            i17 = 90112 | i15;
        }
        if (o0VarE.n(i17 & 1, (74899 & i17) != 74898)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                o4.d0.f128823b.getClass();
                j16 = o4.d0.f128831j;
                o4.u1.f129010b.getClass();
                i16 = i17 & (-458753);
            } else {
                o0VarE.e();
                i16 = i17 & (-458753);
                j16 = j14;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            float f16 = f14 < 0.0f ? 0.0f : f14;
            if (f16 > 1.0f) {
                f16 = 1.0f;
            }
            final q4.k kVar = new q4.k(((g6.c) o0VarE.A(kotlin.t1.f91490h)).s0(f15), 0.0f, 0, 0, null, 26, null);
            Float fValueOf = Float.valueOf(f16);
            if (Float.isNaN(f16)) {
                fValueOf = null;
            }
            h4.r rVarQ = x2.q(z1.a(rVar, fValueOf != null ? fValueOf.floatValue() : 0.0f), f624c);
            boolean zI = ((i16 & 57344) == 16384) | o0VarE.i(f16) | o0VarE.r(kVar) | ((((i16 & 896) ^ 384) > 256 && o0VarE.l(j8)) || (i16 & 384) == 256);
            Object objQ = o0VarE.q();
            if (zI) {
                final float f17 = f16;
                j17 = j16;
                obj = new e23.l() { // from class: a3.w0
                    @Override // e23.l
                    public final Object invoke(Object obj2) {
                        q4.f fVar = (q4.f) obj2;
                        float f18 = 360.0f * f17;
                        long j18 = j17;
                        q4.k kVar2 = kVar;
                        b1.d(fVar, 0.0f, 360.0f, j18, kVar2);
                        b1.d(fVar, 270.0f, f18, j8, kVar2);
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(obj);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    final float f18 = f16;
                    j17 = j16;
                    obj = new e23.l() { // from class: a3.w0
                        @Override // e23.l
                        public final Object invoke(Object obj2) {
                            q4.f fVar = (q4.f) obj2;
                            float f19 = 360.0f * f18;
                            long j18 = j17;
                            q4.k kVar2 = kVar;
                            b1.d(fVar, 0.0f, 360.0f, j18, kVar2);
                            b1.d(fVar, 270.0f, f19, j8, kVar2);
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(obj);
                } else {
                    obj = objQ;
                    j17 = j16;
                }
            }
            u1.n.b(rVarQ, (e23.l) obj, o0VarE, 0);
            j15 = j17;
        } else {
            o0VarE.e();
            j15 = j14;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: a3.x0
                @Override // e23.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    b1.a(f14, rVar, j8, f15, j15, (p3.m) obj2, p3.p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void b(final float f14, int i14, final int i15, final long j8, long j14, final h4.r rVar, p3.m mVar) {
        int i16;
        p3.o0 o0Var;
        final int i17;
        final long j15;
        int i18;
        int i19;
        long j16;
        Object obj;
        int i24;
        final long j17;
        p3.o0 o0VarE = mVar.E(-1119119072);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.l(j8) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.i(f14) ? 256 : 128;
        }
        int i25 = i16 | 3072;
        if ((i15 & 24576) == 0) {
            i25 = i16 | 11264;
        }
        if (o0VarE.n(i25 & 1, (i25 & 9363) != 9362)) {
            o0VarE.G0();
            if ((i15 & 1) == 0 || o0VarE.o0()) {
                o4.d0.f128823b.getClass();
                long j18 = o4.d0.f128831j;
                o4.u1.f129010b.getClass();
                i18 = o4.u1.f129012d;
                i19 = i25 & (-57345);
                j16 = j18;
            } else {
                o0VarE.e();
                i19 = i25 & (-57345);
                i18 = i14;
                j16 = j14;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            final q4.k kVar = new q4.k(((g6.c) o0VarE.A(kotlin.t1.f91490h)).s0(f14), 0.0f, i18, 0, null, 26, null);
            int i26 = i18;
            s1.n0 n0VarC = s1.p0.c(null, o0VarE, 1);
            p005kotlin.jvm.internal.r rVar2 = p005kotlin.jvm.internal.r.f105809a;
            d2 d2Var = e2.f155569b;
            s1.c0 c0Var = s1.e0.f155563d;
            final s1.n0.a aVarB = s1.p0.b(n0VarC, 0, 5, d2Var, s1.l.a(s1.l.d(6660, 0, c0Var, 2), null, 6), null, o0VarE, 33208, 16);
            final s1.n0.a aVarA = s1.p0.a(n0VarC, 0.0f, 286.0f, s1.l.a(s1.l.d(1332, 0, c0Var, 2), null, 6), null, o0VarE, 4536, 8);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new a03.h(12);
                o0VarE.K(objQ);
            }
            s1.r0.b bVar = new s1.r0.b();
            ((e23.l) objQ).invoke(bVar);
            final s1.n0.a aVarA2 = s1.p0.a(n0VarC, 0.0f, 290.0f, s1.l.a(new s1.r0(bVar), null, 6), null, o0VarE, 4536, 8);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new a03.h(13);
                o0VarE.K(objQ2);
            }
            s1.r0.b bVar2 = new s1.r0.b();
            ((e23.l) objQ2).invoke(bVar2);
            final s1.n0.a aVarA3 = s1.p0.a(n0VarC, 0.0f, 290.0f, s1.l.a(new s1.r0(bVar2), null, 6), null, o0VarE, 4536, 8);
            o0Var = o0VarE;
            h4.r rVarQ = x2.q(p5.v.c(new y1(0), rVar, true), f624c);
            boolean zR = ((i19 & 896) == 256) | ((i19 & 7168) == 2048) | o0Var.r(kVar) | o0Var.B(aVarB) | o0Var.B(aVarA2) | o0Var.B(aVarA3) | o0Var.B(aVarA) | ((((i19 & 112) ^ 48) > 32 && o0Var.l(j8)) || (i19 & 48) == 32);
            Object objQ3 = o0Var.q();
            if (zR || objQ3 == c2565a) {
                i24 = 0;
                j17 = j16;
                obj = new e23.l() { // from class: a3.u0
                    @Override // e23.l
                    public final Object invoke(Object obj2) {
                        float f15;
                        q4.f fVar = (q4.f) obj2;
                        long j19 = j17;
                        q4.k kVar2 = kVar;
                        b1.d(fVar, 0.0f, 360.0f, j19, kVar2);
                        float fIntValue = (((Number) aVarB.getF182175a()).intValue() * 216.0f) % 360.0f;
                        float fFloatValue = ((Number) aVarA2.getF182175a()).floatValue();
                        x3 x3Var = aVarA3;
                        float fAbs = Math.abs(fFloatValue - ((Number) x3Var.getF182175a()).floatValue());
                        float fFloatValue2 = ((Number) x3Var.getF182175a()).floatValue() + ((Number) aVarA.getF182175a()).floatValue() + (fIntValue - 90.0f);
                        int i27 = kVar2.f142564c;
                        o4.u1.f129010b.getClass();
                        if (i27 == 0) {
                            f15 = 0.0f;
                        } else {
                            float f16 = b1.f624c / 2;
                            g6.f.a aVar = g6.f.f75994b;
                            f15 = ((f14 / f16) * 57.29578f) / 2.0f;
                        }
                        b1.d(fVar, fFloatValue2 + f15, Math.max(fAbs, 0.1f), j8, kVar2);
                        return Unit.INSTANCE;
                    }
                };
                o0Var.K(obj);
            } else {
                obj = objQ3;
                j17 = j16;
                i24 = 0;
            }
            u1.n.b(rVarQ, (e23.l) obj, o0Var, i24);
            j15 = j17;
            i17 = i26;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            i17 = i14;
            j15 = j14;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: a3.v0
                @Override // e23.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iT = p3.p0.t(i15 | 1);
                    b1.b(f14, i17, iT, j8, j15, rVar, (p3.m) obj2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0119  */
    public static final void c(final float f14, final int i14, final int i15, final long j8, final long j14, final h4.r rVar, p3.m mVar) {
        p3.o0 o0VarE = mVar.E(-531984864);
        int i16 = i15 | (o0VarE.i(f14) ? 4 : 2) | (o0VarE.B(rVar) ? 32 : 16) | (o0VarE.l(j8) ? 256 : 128) | (o0VarE.l(j14) ? 2048 : 1024) | (o0VarE.k(i14) ? 16384 : 8192);
        int i17 = 0;
        boolean z14 = true;
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            o0VarE.G0();
            if ((i15 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            float f15 = f14 < 0.0f ? 0.0f : f14;
            if (f15 > 1.0f) {
                f15 = 1.0f;
            }
            float f16 = 10;
            g6.f.a aVar = g6.f.f75994b;
            h4.r rVarA = c2.l.A(p5.v.c(new a03.h(14), f5.g0.d(rVar, new a1(f16, i17)), true), 0.0f, f16, 1);
            Float fValueOf = Float.valueOf(f15);
            if (Float.isNaN(f15)) {
                fValueOf = null;
            }
            h4.r rVarR = x2.r(z1.a(rVarA, fValueOf != null ? fValueOf.floatValue() : 0.0f), f623b, f622a);
            boolean zI = ((((i16 & 7168) ^ 3072) > 2048 && o0VarE.l(j14)) || (i16 & 3072) == 2048) | ((((57344 & i16) ^ 24576) > 16384 && o0VarE.k(i14)) || (i16 & 24576) == 16384) | o0VarE.i(f15);
            if ((((i16 & 896) ^ 384) <= 256 || !o0VarE.l(j8)) && (i16 & 384) != 256) {
                z14 = false;
            }
            boolean z15 = zI | z14;
            Object objQ = o0VarE.q();
            if (z15) {
                y0 y0Var = new y0(j14, i14, f15, j8, 0);
                o0VarE.K(y0Var);
                objQ = y0Var;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    y0 y0Var2 = new y0(j14, i14, f15, j8, 0);
                    o0VarE.K(y0Var2);
                    objQ = y0Var2;
                }
            }
            u1.n.b(rVarR, (e23.l) objQ, o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(f14, i14, i15, j8, j14, rVar) { // from class: a3.z0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ float f893a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h4.r f894b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f895c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f896d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f897e;

                {
                    this.f894b = rVar;
                    this.f895c = j8;
                    this.f896d = j14;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(1);
                    b1.c(this.f893a, this.f897e, iT, this.f895c, this.f896d, this.f894b, (p3.m) obj);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void d(q4.f fVar, float f14, float f15, long j8, q4.k kVar) {
        float f16 = 2;
        float f17 = kVar.f142562a / f16;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32)) - (f16 * f17);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f17)) << 32) | (((long) Float.floatToRawIntBits(f17)) & 4294967295L);
        n4.c.a aVar = n4.c.f123541b;
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        n4.g.a aVar2 = n4.g.f123559b;
        q4.f.Q1(fVar, j8, f14, f15, jFloatToRawIntBits, jFloatToRawIntBits2, 0.0f, kVar, 832);
    }

    public static final void e(q4.f fVar, float f14, long j8, float f15, int i14) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
        float f16 = 2;
        float f17 = fIntBitsToFloat2 / f16;
        boolean z14 = fVar.getLayoutDirection() == g6.o.Ltr;
        float f18 = (z14 ? 0.0f : 1.0f - f14) * fIntBitsToFloat;
        float f19 = (z14 ? f14 : 1.0f) * fIntBitsToFloat;
        o4.u1.f129010b.getClass();
        if (i14 == 0 || fIntBitsToFloat2 > fIntBitsToFloat) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f18)) << 32) | (((long) Float.floatToRawIntBits(f17)) & 4294967295L);
            n4.c.a aVar = n4.c.f123541b;
            q4.f.G1(fVar, j8, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(f19)) << 32) | (((long) Float.floatToRawIntBits(f17)) & 4294967295L), f15, 0, null, 0, 496);
            return;
        }
        float f22 = f15 / f16;
        j23.e eVar = new j23.e(f22, fIntBitsToFloat - f22);
        float fFloatValue = ((Number) j23.t.j(Float.valueOf(f18), eVar)).floatValue();
        float fFloatValue2 = ((Number) j23.t.j(Float.valueOf(f19), eVar)).floatValue();
        if (Math.abs(f14 - 0.0f) > 0.0f) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(f17)) & 4294967295L);
            n4.c.a aVar2 = n4.c.f123541b;
            q4.f.G1(fVar, j8, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f17)) & 4294967295L), f15, i14, null, 0, 480);
        }
    }
}
