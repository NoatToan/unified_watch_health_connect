package g6;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static final long a(int i14, int i15) {
        long j8 = (((long) i15) & 4294967295L) | (((long) i14) << 32);
        m.a aVar = m.f76012b;
        return j8;
    }

    public static final long b(long j8) {
        long j14 = (((j8 << 32) >> 33) & 4294967295L) | ((j8 >> 33) << 32);
        k.a aVar = k.f76003b;
        return j14;
    }

    public static final long c(long j8) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j8 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j8 >> 32)) << 32);
        n4.g.a aVar = n4.g.f123559b;
        return jFloatToRawIntBits;
    }
}
