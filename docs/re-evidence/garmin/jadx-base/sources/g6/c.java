package g6;

/* JADX INFO: loaded from: classes.dex */
public interface c extends i {
    default long A(long j8) {
        if (j8 != 9205357640488583168L) {
            return dh.b.e(d1(Float.intBitsToFloat((int) (j8 >> 32))), d1(Float.intBitsToFloat((int) (j8 & 4294967295L))));
        }
        h.f76000b.getClass();
        return h.f76001c;
    }

    default long D(float f14) {
        return Y(d1(f14));
    }

    default float c1(int i14) {
        float density = i14 / getF69050b();
        f.a aVar = f.f75994b;
        return density;
    }

    default float d1(float f14) {
        float density = f14 / getF69050b();
        f.a aVar = f.f75994b;
        return density;
    }

    default int f0(float f14) {
        float fS0 = s0(f14);
        if (Float.isInfinite(fS0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fS0);
    }

    default float g0(long j8) {
        long jC = q.c(j8);
        r.f76022b.getClass();
        if (!r.b(jC, r.f76023c)) {
            j.b("Only Sp can convert to Px");
        }
        return s0(H0(j8));
    }

    /* JADX INFO: renamed from: getDensity */
    float getF69050b();

    default long k1(long j8) {
        if (j8 == 9205357640488583168L) {
            n4.g.f123559b.getClass();
            return n4.g.f123560c;
        }
        float fS0 = s0(h.c(j8));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(s0(h.b(j8)))) & 4294967295L) | (Float.floatToRawIntBits(fS0) << 32);
        n4.g.a aVar = n4.g.f123559b;
        return jFloatToRawIntBits;
    }

    default float s0(float f14) {
        return getF69050b() * f14;
    }

    default int v0(long j8) {
        return Math.round(g0(j8));
    }
}
