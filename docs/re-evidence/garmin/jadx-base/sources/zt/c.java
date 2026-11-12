package zt;

import c2.x2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import e23.p;
import g6.f;
import h4.r;
import kotlin.t1;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.m0;
import u1.z1;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:67:0x012e  */
    public static final void a(final float f14, final int i14, r rVar, final long j8, final long j14, float f15, final int i15, float f16, m mVar, final int i16) {
        r rVar2;
        final float f17;
        final float f18;
        float f19;
        float f22;
        o0 o0VarE = mVar.E(-1469503399);
        int i17 = i16 | (o0VarE.i(f14) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.l(j8) ? 2048 : 1024) | (o0VarE.l(j14) ? 16384 : 8192) | 196608 | (o0VarE.k(i15) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | 12582912;
        if (o0VarE.n(i17 & 1, (4793491 & i17) != 4793490)) {
            o0VarE.G0();
            if ((i16 & 1) == 0 || o0VarE.o0()) {
                f19 = 4;
                f.a aVar = f.f75994b;
                f22 = 8;
            } else {
                o0VarE.e();
                f19 = f15;
                f22 = f16;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            final p005kotlin.jvm.internal.o0 o0Var = new p005kotlin.jvm.internal.o0();
            final p005kotlin.jvm.internal.o0 o0Var2 = new p005kotlin.jvm.internal.o0();
            g6.c cVar = (g6.c) o0VarE.A(t1.f91490h);
            o0Var.f105806a = cVar.s0(f22);
            o0Var2.f105806a = cVar.s0(f19);
            rVar2 = rVar;
            r rVarA = m0.a(x2.h(x2.f(z1.a(rVar2, f14), 1.0f), f19), true, null);
            boolean zI = ((i17 & 14) == 4) | ((3670016 & i17) == 1048576) | ((((57344 & i17) ^ 24576) > 16384 && o0VarE.l(j14)) || (i17 & 24576) == 16384) | o0VarE.i(o0Var2.f105806a) | o0VarE.i(o0Var.f105806a) | ((i17 & 112) == 32) | ((((i17 & 7168) ^ 3072) > 2048 && o0VarE.l(j8)) || (i17 & 3072) == 2048);
            Object objQ = o0VarE.q();
            if (zI) {
                l lVar = new l() { // from class: zt.a
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        q4.f fVar = (q4.f) obj;
                        fVar.getClass();
                        int i18 = i15;
                        p005kotlin.jvm.internal.o0 o0Var3 = o0Var2;
                        float f24 = o0Var3.f105806a;
                        p005kotlin.jvm.internal.o0 o0Var4 = o0Var;
                        c.b(fVar, 1.0f, i18 - 1, j14, f24, i18, o0Var4.f105806a);
                        c.b(fVar, f14, i14, j8, o0Var3.f105806a, i18, o0Var4.f105806a);
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(lVar);
                objQ = lVar;
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    l lVar2 = new l() { // from class: zt.a
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            q4.f fVar = (q4.f) obj;
                            fVar.getClass();
                            int i18 = i15;
                            p005kotlin.jvm.internal.o0 o0Var3 = o0Var2;
                            float f24 = o0Var3.f105806a;
                            p005kotlin.jvm.internal.o0 o0Var4 = o0Var;
                            c.b(fVar, 1.0f, i18 - 1, j14, f24, i18, o0Var4.f105806a);
                            c.b(fVar, f14, i14, j8, o0Var3.f105806a, i18, o0Var4.f105806a);
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(lVar2);
                    objQ = lVar2;
                }
            }
            u1.n.b(rVarA, (l) objQ, o0VarE, 0);
            f17 = f19;
            f18 = f22;
        } else {
            rVar2 = rVar;
            o0VarE.e();
            f17 = f15;
            f18 = f16;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final r rVar3 = rVar2;
            p2VarI0.f135219d = new p(f14, i14, rVar3, j8, j14, f17, i15, f18, i16) { // from class: zt.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ float f206922a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f206923b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ r f206924c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f206925d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f206926e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ float f206927f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ int f206928g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ float f206929h;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(385);
                    c.a(this.f206922a, this.f206923b, this.f206924c, this.f206925d, this.f206926e, this.f206927f, this.f206928g, this.f206929h, (m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void b(q4.f fVar, float f14, int i14, long j8, float f15, int i15, float f16) {
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (fVar.b() >> 32)) - ((i15 - 1) * f16)) / i15;
        float f17 = fIntBitsToFloat + f16;
        float f18 = (fIntBitsToFloat * f14) + (i14 * f17);
        for (int i16 = 0; i16 < i15; i16++) {
            float f19 = i16 * f17;
            if (f19 < f18) {
                float f22 = f19 + fIntBitsToFloat;
                if (f22 > f18) {
                    f22 = f18;
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f19 + 0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                n4.c.a aVar = n4.c.f123541b;
                q4.f.G1(fVar, j8, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(f22)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), f15, 0, null, 0, 496);
            }
        }
    }
}
