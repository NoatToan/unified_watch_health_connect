package j02;

import f5.z0;
import i3.gf;
import i3.v2;
import java.util.HashSet;
import lc.u0;
import p008y1.b2;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class p {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96121a;

        static {
            int[] iArr = new int[b2.values().length];
            try {
                iArr[b2.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b2.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f96121a = iArr;
        }
    }

    public static final void a(s sVar, Object obj, h4.r rVar, boolean z14, boolean z15, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        boolean z16;
        sVar.getClass();
        obj.getClass();
        o0 o0VarE = mVar.E(932313557);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(sVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(obj) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(rVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            z16 = z15;
            i15 |= o0VarE.h(z16) ? 16384 : 8192;
        } else {
            z16 = z15;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(eVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                n4.c.f123541b.getClass();
                objQ = p0.n(n4.c.a(0L));
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new v2(p1Var, 10);
                o0VarE.K(objQ2);
            }
            h4.r rVarF = f5.g0.f(rVar, (e23.l) objQ2);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
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
            int i16 = i15 & 14;
            boolean zB = (i16 == 4) | o0VarE.B(obj);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                objQ3 = new m(sVar, obj, new i11.i(p1Var, 25));
                o0VarE.K(objQ3);
            }
            eVar.invoke((m) objQ3, Boolean.valueOf(z16), o0VarE, Integer.valueOf((i15 >> 9) & 1008));
            o0VarE.g0(true);
            HashSet<Object> hashSet = sVar.f96143r;
            Boolean boolValueOf = Boolean.valueOf(z14);
            boolean zR = ((i15 & 7168) == 2048) | (i16 == 4) | o0VarE.r(obj);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                objQ4 = new o(z14, sVar, obj, null);
                o0VarE.K(objQ4);
            }
            p3.l0.f(hashSet, boolValueOf, (e23.p) objQ4, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gf(sVar, obj, rVar, z14, z16, eVar, i14);
        }
    }

    public static final long b(g6.k.a aVar, b2 b2Var, int i14) {
        aVar.getClass();
        b2Var.getClass();
        int i15 = a.f96121a[b2Var.ordinal()];
        if (i15 == 1) {
            long j8 = (((long) 0) << 32) | (4294967295L & ((long) i14));
            g6.k.a aVar2 = g6.k.f76003b;
            return j8;
        }
        if (i15 != 2) {
            u0.r();
            return 0L;
        }
        long j14 = (((long) i14) << 32) | (4294967295L & ((long) 0));
        g6.k.a aVar3 = g6.k.f76003b;
        return j14;
    }

    public static final float c(b2 b2Var, long j8) {
        b2Var.getClass();
        int i14 = a.f96121a[b2Var.ordinal()];
        if (i14 == 1) {
            return Float.intBitsToFloat((int) (j8 & 4294967295L));
        }
        if (i14 == 2) {
            return Float.intBitsToFloat((int) (j8 >> 32));
        }
        u0.r();
        return 0.0f;
    }

    public static final long d(long j8, long j14) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j14 >> 32)) + Float.intBitsToFloat((int) (j8 >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j14 & 4294967295L)) + Float.intBitsToFloat((int) (j8 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        n4.c.a aVar = n4.c.f123541b;
        return jFloatToRawIntBits;
    }

    public static final long e(b2 b2Var, long j8) {
        b2Var.getClass();
        int i14 = a.f96121a[b2Var.ordinal()];
        if (i14 == 1) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (j8 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
            n4.c.a aVar = n4.c.f123541b;
            return jFloatToRawIntBits;
        }
        if (i14 != 2) {
            u0.r();
            return 0L;
        }
        float f14 = -Float.intBitsToFloat((int) (j8 >> 32));
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j8 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32);
        n4.c.a aVar2 = n4.c.f123541b;
        return jFloatToRawIntBits2;
    }
}
