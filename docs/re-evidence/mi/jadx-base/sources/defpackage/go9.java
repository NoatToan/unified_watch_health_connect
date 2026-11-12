package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class go9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eo9 f19181a = new n8i(BigInteger.valueOf(2));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final eo9 f19182b = new n8i(BigInteger.valueOf(3));

    public static y2i a(int[] iArr) {
        if (iArr[0] != 0) {
            throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
        }
        for (int i = 1; i < iArr.length; i++) {
            if (iArr[i] <= iArr[i - 1]) {
                throw new IllegalArgumentException("Polynomial exponents must be montonically increasing");
            }
        }
        return new fya(f19181a, new yua(iArr));
    }

    public static eo9 b(BigInteger bigInteger) {
        int iBitLength = bigInteger.bitLength();
        if (bigInteger.signum() <= 0 || iBitLength < 2) {
            throw new IllegalArgumentException("'characteristic' must be >= 2");
        }
        if (iBitLength < 3) {
            int iIntValue = bigInteger.intValue();
            if (iIntValue == 2) {
                return f19181a;
            }
            if (iIntValue == 3) {
                return f19182b;
            }
        }
        return new n8i(bigInteger);
    }
}
