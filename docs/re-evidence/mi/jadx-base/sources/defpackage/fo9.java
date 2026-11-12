package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fo9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final do9 f17996a = new m8i(BigInteger.valueOf(2));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final do9 f17997b = new m8i(BigInteger.valueOf(3));

    public static x2i a(int[] iArr) {
        if (iArr[0] != 0) {
            throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
        }
        for (int i = 1; i < iArr.length; i++) {
            if (iArr[i] <= iArr[i - 1]) {
                throw new IllegalArgumentException("Polynomial exponents must be montonically increasing");
            }
        }
        return new eya(f17996a, new xua(iArr));
    }

    public static do9 b(BigInteger bigInteger) {
        int iBitLength = bigInteger.bitLength();
        if (bigInteger.signum() <= 0 || iBitLength < 2) {
            throw new IllegalArgumentException("'characteristic' must be >= 2");
        }
        if (iBitLength < 3) {
            int iIntValue = bigInteger.intValue();
            if (iIntValue == 2) {
                return f17996a;
            }
            if (iIntValue == 3) {
                return f17997b;
            }
        }
        return new m8i(bigInteger);
    }
}
