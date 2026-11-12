package f5;

/* JADX INFO: loaded from: classes.dex */
public final class g2 {
    public static final long a(long j8, long j14) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j14 >> 32)) * Float.intBitsToFloat((int) (j8 >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j14 & 4294967295L)) * Float.intBitsToFloat((int) (j8 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        n4.g.a aVar = n4.g.f123559b;
        return jFloatToRawIntBits;
    }
}
