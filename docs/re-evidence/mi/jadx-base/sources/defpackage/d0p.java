package defpackage;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class d0p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1s f14935a = c1s.a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b1s f14936b = new a();

    public static class a implements b1s {
        @Override // defpackage.b1s
        public String decode(byte[] bArr) {
            StringBuilder sb = new StringBuilder(bArr.length);
            for (byte b2 : bArr) {
                if (b2 == 0) {
                    break;
                }
                sb.append((char) (b2 & 255));
            }
            return sb.toString();
        }
    }

    public static String a(byte[] bArr, int i, int i2, int i3, byte b2) {
        return "Invalid byte " + ((int) b2) + " at offset " + (i3 - i) + " in '" + new String(bArr, i, i2).replaceAll("\u0000", "{NUL}") + "' len=" + i2;
    }

    public static long b(byte[] bArr, int i, int i2, boolean z) {
        int i3 = i2 - 1;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i + 1, bArr2, 0, i3);
        BigInteger bigInteger = new BigInteger(bArr2);
        if (z) {
            bigInteger = bigInteger.add(BigInteger.valueOf(-1L)).not();
        }
        if (bigInteger.bitLength() <= 63) {
            long jLongValue = bigInteger.longValue();
            return z ? -jLongValue : jLongValue;
        }
        throw new IllegalArgumentException("At offset " + i + ", " + i2 + " byte binary number exceeds maximum signed long value");
    }

    public static long c(byte[] bArr, int i, int i2, boolean z) {
        if (i2 >= 9) {
            throw new IllegalArgumentException("At offset " + i + ", " + i2 + " byte binary number exceeds maximum signed long value");
        }
        long jPow = 0;
        for (int i3 = 1; i3 < i2; i3++) {
            jPow = (jPow << 8) + ((long) (bArr[i + i3] & 255));
        }
        if (z) {
            jPow = (jPow - 1) ^ (((long) Math.pow(2.0d, ((double) (i2 - 1)) * 8.0d)) - 1);
        }
        return z ? -jPow : jPow;
    }

    public static boolean d(byte[] bArr, int i) {
        return bArr[i] == 1;
    }

    public static String e(byte[] bArr, int i, int i2) {
        try {
            try {
                return f(bArr, i, i2, f14935a);
            } catch (IOException unused) {
                return f(bArr, i, i2, f14936b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String f(byte[] bArr, int i, int i2, b1s b1sVar) throws IOException {
        int i3 = 0;
        for (int i4 = i; i3 < i2 && bArr[i4] != 0; i4++) {
            i3++;
        }
        if (i3 <= 0) {
            return "";
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return b1sVar.decode(bArr2);
    }

    public static long g(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        if (i2 < 2) {
            throw new IllegalArgumentException("Length " + i2 + " must be at least 2");
        }
        long j = 0;
        if (bArr[i] == 0) {
            return 0L;
        }
        int i4 = i;
        while (i4 < i3 && bArr[i4] == 32) {
            i4++;
        }
        byte b2 = bArr[i3 - 1];
        while (i4 < i3 && (b2 == 0 || b2 == 32)) {
            b2 = bArr[i3 - 2];
            i3--;
        }
        while (i4 < i3) {
            byte b3 = bArr[i4];
            if (b3 < 48 || b3 > 55) {
                throw new IllegalArgumentException(a(bArr, i, i2, i4, b3));
            }
            j = (j << 3) + ((long) (b3 - 48));
            i4++;
        }
        return j;
    }

    public static long h(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i];
        if ((b2 & 128) == 0) {
            return g(bArr, i, i2);
        }
        boolean z = b2 == -1;
        return i2 < 9 ? c(bArr, i, i2, z) : b(bArr, i, i2, z);
    }

    public static boolean i(byte[] bArr) {
        long jG = g(bArr, 148, 8);
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            if (148 <= i && i < 156) {
                b2 = 32;
            }
            j += (long) (b2 & 255);
            j2 += (long) b2;
        }
        return jG == j || jG == j2;
    }
}
