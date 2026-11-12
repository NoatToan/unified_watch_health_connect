package ak;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes7.dex */
public class k {
    private k() {
    }

    public static String a(int i14) {
        return "0x".concat(String.format("%02X", Integer.valueOf(i14 & 255)));
    }

    public static String b(byte[] bArr) {
        StringBuilder sb3 = new StringBuilder();
        for (byte b14 : bArr) {
            sb3.append('[');
            sb3.append(String.format("%02X", Integer.valueOf(b14 & UnsignedBytes.MAX_VALUE)));
            sb3.append(']');
        }
        return sb3.toString();
    }

    public static final boolean c(int i14, int i15) {
        return i14 >= 0 && i14 <= i15;
    }

    public static boolean d(int i14, int i15) {
        return (i14 & i15) != 0;
    }

    public static long e(int i14, int i15, byte[] bArr) {
        long j8 = 0;
        for (int i16 = 0; i16 < i15; i16++) {
            j8 += (long) ((bArr[i14 + i16] & UnsignedBytes.MAX_VALUE) << (i16 * 8));
        }
        return j8;
    }

    public static void f(int i14, int i15, long j8, byte[] bArr) {
        long j14 = 0;
        for (int i16 = 0; i16 < i14; i16++) {
            j14 += (long) (255 << (i16 * 8));
        }
        if (j8 > j14 || j8 < 0) {
            vb.h.s(com.nimbusds.jose.shaded.gson.internal.a.g(j14, " byte integer (0-", ")", v.h.w(i14, "Value (", ") outside the bounds of unsigned ", j8)));
            return;
        }
        for (int i17 = 0; i17 < i14; i17++) {
            bArr[i15 + i17] = (byte) ((j8 >> (i17 * 8)) & 255);
        }
    }

    public static void g(int i14, int i15, byte[] bArr) {
        if (i14 > 255 || i14 < 0) {
            vb.h.s("Value outside the bounds of unsigned byte integer");
        } else {
            bArr[i15] = (byte) i14;
        }
    }
}
