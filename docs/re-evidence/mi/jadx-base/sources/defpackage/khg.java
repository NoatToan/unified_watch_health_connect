package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class khg {
    public static long[] a() {
        return new long[9];
    }

    public static long[] b() {
        return new long[18];
    }

    public static boolean c(long[] jArr, long[] jArr2) {
        for (int i = 8; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static long[] d(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 576) {
            throw new IllegalArgumentException();
        }
        long[] jArrA = a();
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArrA[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        return jArrA;
    }

    public static boolean e(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 9; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(long[] jArr) {
        for (int i = 0; i < 9; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static BigInteger g(long[] jArr) {
        byte[] bArr = new byte[72];
        for (int i = 0; i < 9; i++) {
            long j = jArr[i];
            if (j != 0) {
                ahh.b(j, bArr, (8 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }
}
