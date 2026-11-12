package n4;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final e a(d dVar, long j8, long j14, long j15, long j16) {
        return new e(dVar.f123547a, dVar.f123548b, dVar.f123549c, dVar.f123550d, j8, j14, j15, j16, null);
    }

    public static e b(d dVar, long j8, long j14, long j15, long j16, int i14) {
        long j17;
        long j18;
        long j19;
        long j24;
        if ((i14 & 2) != 0) {
            a.f123535b.getClass();
            j17 = 0;
        } else {
            j17 = j8;
        }
        if ((i14 & 4) != 0) {
            a.f123535b.getClass();
            j18 = 0;
        } else {
            j18 = j14;
        }
        if ((i14 & 8) != 0) {
            a.f123535b.getClass();
            j19 = 0;
        } else {
            j19 = j15;
        }
        if ((i14 & 16) != 0) {
            a.f123535b.getClass();
            j24 = 0;
        } else {
            j24 = j16;
        }
        return a(dVar, j17, j18, j19, j24);
    }

    public static final e c(float f14, float f15, float f16, float f17, long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        a.C2318a c2318a = a.f123535b;
        return new e(f14, f15, f16, f17, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, null);
    }

    public static final boolean d(e eVar) {
        long j8 = eVar.f123555e;
        return (j8 >>> 32) == (4294967295L & j8) && j8 == eVar.f123556f && j8 == eVar.f123557g && j8 == eVar.f123558h;
    }
}
