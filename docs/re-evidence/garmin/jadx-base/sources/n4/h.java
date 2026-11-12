package n4;

import g8.i;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final long a(float f14, float f15) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f15)) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32);
        g.a aVar = g.f123559b;
        return jFloatToRawIntBits;
    }

    public static final long b(long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32)) / 2.0f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j8 & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        c.a aVar = c.f123541b;
        return jFloatToRawIntBits;
    }

    public static final d c(long j8) {
        c.f123541b.getClass();
        return i.g(0L, j8);
    }
}
