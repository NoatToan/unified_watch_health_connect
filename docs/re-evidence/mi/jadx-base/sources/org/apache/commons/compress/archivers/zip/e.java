package org.apache.commons.compress.archivers.zip;

import androidx.work.WorkInfo;
import java.math.BigInteger;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f29433a = ZipLong.getBytes(8448);

    public static long a(int i) {
        return i < 0 ? ((long) i) + 4294967296L : i;
    }

    public static long b(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 63) {
            return bigInteger.longValue();
        }
        throw new NumberFormatException("The BigInteger cannot fit inside a 64 bit java long: [" + bigInteger + "]");
    }

    public static byte[] c(byte[] bArr) {
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public static BigInteger d(long j) {
        if (j >= -2147483648L) {
            if (j < 0 && j >= -2147483648L) {
                j = a((int) j);
            }
            return BigInteger.valueOf(j);
        }
        throw new IllegalArgumentException("Negative longs < -2^31 not permitted: [" + j + "]");
    }

    public static byte[] e(byte[] bArr) {
        int length = bArr.length - 1;
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b2 = bArr[i];
            int i2 = length - i;
            bArr[i] = bArr[i2];
            bArr[i2] = b2;
        }
        return bArr;
    }

    public static int f(byte b2) {
        return b2 >= 0 ? b2 : b2 + 256;
    }

    public static byte g(int i) {
        if (i <= 255 && i >= 0) {
            return i < 128 ? (byte) i : (byte) (i + WorkInfo.STOP_REASON_NOT_STOPPED);
        }
        throw new IllegalArgumentException("Can only convert non-negative integers between [0,255] to byte: [" + i + "]");
    }
}
