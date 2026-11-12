package q4;

import g6.o;
import o4.e0;
import o4.f1;
import o4.g1;
import o4.o0;
import o4.q;
import o4.r;
import o4.v0;
import o4.w;
import o4.w1;
import o4.z0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public interface f extends g6.c {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final a f142555o0 = a.f142556a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq4/f$a;", "", "<init>", "()V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f142556a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f142557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f142558c;

        static {
            q.f128930b.getClass();
            f142557b = q.f128933e;
            o0.f128897b.getClass();
            f142558c = o0.f128898c;
        }

        private a() {
        }
    }

    static void A0(f fVar, long j8, long j14, long j15, float f14, g gVar, e0 e0Var, int i14) {
        long j16;
        int i15;
        if ((i14 & 2) != 0) {
            n4.c.f123541b.getClass();
            j16 = 0;
        } else {
            j16 = j14;
        }
        long jQ0 = (i14 & 4) != 0 ? q0(fVar.b(), j16) : j15;
        float f15 = (i14 & 8) != 0 ? 1.0f : f14;
        g gVar2 = (i14 & 16) != 0 ? j.f142560a : gVar;
        e0 e0Var2 = (i14 & 32) != 0 ? null : e0Var;
        if ((i14 & 64) != 0) {
            f142555o0.getClass();
            i15 = a.f142557b;
        } else {
            i15 = 0;
        }
        fVar.r1(j8, j16, jQ0, f15, gVar2, e0Var2, i15);
    }

    static void A1(c cVar, w wVar, long j8, long j14, float f14, float f15) {
        k.f142561f.getClass();
        f142555o0.getClass();
        cVar.y0(wVar, j8, j14, f14, f15, a.f142557b);
    }

    static void B0(f fVar, v0 v0Var, long j8, long j14, long j15, long j16, float f14, g gVar, e0 e0Var, int i14, int i15, int i16) {
        long j17;
        long j18;
        int i17;
        int i18;
        if ((i16 & 2) != 0) {
            g6.k.f76003b.getClass();
            j17 = 0;
        } else {
            j17 = j8;
        }
        if ((i16 & 8) != 0) {
            g6.k.f76003b.getClass();
            j18 = 0;
        } else {
            j18 = j15;
        }
        long j19 = (i16 & 16) != 0 ? j14 : j16;
        float f15 = (i16 & 32) != 0 ? 1.0f : f14;
        g gVar2 = (i16 & 64) != 0 ? j.f142560a : gVar;
        int i19 = i16 & 256;
        a aVar = f142555o0;
        if (i19 != 0) {
            aVar.getClass();
            i17 = a.f142557b;
        } else {
            i17 = i14;
        }
        if ((i16 & 512) != 0) {
            aVar.getClass();
            i18 = a.f142558c;
        } else {
            i18 = i15;
        }
        fVar.L0(v0Var, j17, j14, j18, j19, f15, gVar2, e0Var, i17, i18);
    }

    static void C0(f fVar, w wVar, long j8, long j14, float f14, g gVar, int i14, int i15) {
        int i16;
        if ((i15 & 2) != 0) {
            n4.c.f123541b.getClass();
            j8 = 0;
        }
        long j15 = j8;
        long jQ0 = (i15 & 4) != 0 ? q0(fVar.b(), j15) : j14;
        float f15 = (i15 & 8) != 0 ? 1.0f : f14;
        g gVar2 = (i15 & 16) != 0 ? j.f142560a : gVar;
        if ((i15 & 64) != 0) {
            f142555o0.getClass();
            i16 = a.f142557b;
        } else {
            i16 = i14;
        }
        fVar.z(wVar, j15, jQ0, f15, gVar2, i16);
    }

    static void C1(f fVar, f1 f1Var, w wVar, float f14, k kVar, int i14) {
        int i15;
        if ((i14 & 4) != 0) {
            f14 = 1.0f;
        }
        float f15 = f14;
        g gVar = kVar;
        if ((i14 & 8) != 0) {
            gVar = j.f142560a;
        }
        g gVar2 = gVar;
        if ((i14 & 32) != 0) {
            f142555o0.getClass();
            i15 = a.f142557b;
        } else {
            i15 = 0;
        }
        fVar.L1(f1Var, wVar, f15, gVar2, i15);
    }

    static void G1(f fVar, long j8, long j14, long j15, float f14, int i14, o4.k kVar, int i15, int i16) {
        int i17;
        int i18;
        float f15 = (i16 & 8) != 0 ? 0.0f : f14;
        if ((i16 & 16) != 0) {
            k.f142561f.getClass();
            i17 = 0;
        } else {
            i17 = i14;
        }
        o4.k kVar2 = (i16 & 32) != 0 ? null : kVar;
        if ((i16 & 256) != 0) {
            f142555o0.getClass();
            i18 = a.f142557b;
        } else {
            i18 = i15;
        }
        fVar.M(j8, j14, j15, f15, i17, kVar2, i18);
    }

    static void L(f fVar, f1 f1Var, long j8, float f14, g gVar, int i14) {
        if ((i14 & 4) != 0) {
            f14 = 1.0f;
        }
        float f15 = f14;
        if ((i14 & 8) != 0) {
            gVar = j.f142560a;
        }
        f142555o0.getClass();
        fVar.I(f1Var, j8, f15, gVar, a.f142557b);
    }

    static void M0(f fVar, long j8, long j14, long j15, long j16, g gVar, int i14, int i15) {
        long j17;
        int i16;
        if ((i15 & 2) != 0) {
            n4.c.f123541b.getClass();
            j17 = 0;
        } else {
            j17 = j14;
        }
        long jQ0 = (i15 & 4) != 0 ? q0(fVar.b(), j17) : j15;
        g gVar2 = (i15 & 16) != 0 ? j.f142560a : gVar;
        if ((i15 & 128) != 0) {
            f142555o0.getClass();
            i16 = a.f142557b;
        } else {
            i16 = i14;
        }
        fVar.U(j8, j17, jQ0, j16, gVar2, i16);
    }

    static void Q1(f fVar, long j8, float f14, float f15, long j14, long j15, float f16, k kVar, int i14) {
        long j16;
        if ((i14 & 16) != 0) {
            n4.c.f123541b.getClass();
            j16 = 0;
        } else {
            j16 = j14;
        }
        long jQ0 = (i14 & 32) != 0 ? q0(fVar.b(), j16) : j15;
        float f17 = (i14 & 64) != 0 ? 1.0f : f16;
        f142555o0.getClass();
        fVar.N(j8, f14, f15, j16, jQ0, f17, kVar, a.f142557b);
    }

    static void o0(f fVar, long j8, float f14, long j14, g gVar, int i14, int i15) {
        int i16;
        if ((i15 & 2) != 0) {
            f14 = n4.g.f(fVar.b()) / 2.0f;
        }
        float f15 = f14;
        if ((i15 & 4) != 0) {
            j14 = fVar.i1();
        }
        long j15 = j14;
        if ((i15 & 16) != 0) {
            gVar = j.f142560a;
        }
        g gVar2 = gVar;
        if ((i15 & 64) != 0) {
            f142555o0.getClass();
            i16 = a.f142557b;
        } else {
            i16 = i14;
        }
        fVar.H(j8, f15, j15, gVar2, i16);
    }

    static void p1(f fVar, z0 z0Var, float f14, long j8, int i14) {
        if ((i14 & 2) != 0) {
            f14 = n4.g.f(fVar.b()) / 2.0f;
        }
        float f15 = f14;
        if ((i14 & 4) != 0) {
            j8 = fVar.i1();
        }
        j jVar = j.f142560a;
        f142555o0.getClass();
        fVar.y1(z0Var, f15, j8, jVar, a.f142557b);
    }

    static long q0(long j8, long j14) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32)) - Float.intBitsToFloat((int) (j14 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L)) - Float.intBitsToFloat((int) (j14 & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        n4.g.a aVar = n4.g.f123559b;
        return jFloatToRawIntBits;
    }

    static void w0(f fVar, v0 v0Var, long j8, r rVar, int i14) {
        if ((i14 & 2) != 0) {
            n4.c.f123541b.getClass();
            j8 = 0;
        }
        long j14 = j8;
        j jVar = j.f142560a;
        if ((i14 & 16) != 0) {
            rVar = null;
        }
        f142555o0.getClass();
        fVar.K1(v0Var, j14, jVar, rVar, a.f142557b);
    }

    static void z1(c cVar, w wVar, long j8, long j14, long j15, g gVar, int i14) {
        long j16;
        if ((i14 & 2) != 0) {
            n4.c.f123541b.getClass();
            j16 = 0;
        } else {
            j16 = j8;
        }
        long jQ0 = (i14 & 4) != 0 ? q0(cVar.b(), j16) : j14;
        g gVar2 = (i14 & 32) != 0 ? j.f142560a : gVar;
        f142555o0.getClass();
        cVar.q1(wVar, j16, jQ0, j15, 1.0f, gVar2, a.f142557b);
    }

    void H(long j8, float f14, long j14, g gVar, int i14);

    void I(f1 f1Var, long j8, float f14, g gVar, int i14);

    void K1(v0 v0Var, long j8, g gVar, e0 e0Var, int i14);

    default void L0(v0 v0Var, long j8, long j14, long j15, long j16, float f14, g gVar, e0 e0Var, int i14, int i15) {
        B0(this, v0Var, j8, j14, j15, j16, f14, gVar, e0Var, i14, 0, 512);
    }

    void L1(f1 f1Var, w wVar, float f14, g gVar, int i14);

    void M(long j8, long j14, long j15, float f14, int i14, g1 g1Var, int i15);

    void N(long j8, float f14, float f15, long j14, long j15, float f16, k kVar, int i14);

    void R0(w1 w1Var, float f14, long j8, long j14, g gVar, int i14);

    /* JADX INFO: renamed from: S */
    q4.a.b getF142543b();

    void U(long j8, long j14, long j15, long j16, g gVar, int i14);

    default long b() {
        return getF142543b().b();
    }

    o getLayoutDirection();

    default long i1() {
        return n4.h.b(getF142543b().b());
    }

    void q1(w wVar, long j8, long j14, long j15, float f14, g gVar, int i14);

    void r1(long j8, long j14, long j15, float f14, g gVar, e0 e0Var, int i14);

    void y0(w wVar, long j8, long j14, float f14, float f15, int i14);

    void y1(z0 z0Var, float f14, long j8, g gVar, int i14);

    void z(w wVar, long j8, long j14, float f14, g gVar, int i14);
}
