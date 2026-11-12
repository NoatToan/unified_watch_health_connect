package defpackage;

import android.util.Base64;
import java.security.SecureRandom;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class mc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile SecureRandom f41390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f41391b = "0123456789ABCDEF".toCharArray();

    public static byte[] b(long j) {
        return new byte[]{(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24), (byte) (j >> 32), (byte) (j >> 40), (byte) (j >> 48), (byte) (j >> 56)};
    }

    public static byte[] c() {
        byte[] bArr = new byte[2];
        e().nextBytes(bArr);
        return bArr;
    }

    public static byte[] d() {
        byte[] bArr = new byte[4];
        e().nextBytes(bArr);
        return bArr;
    }

    public static byte[] a(short s) {
        return new byte[]{(byte) s, (byte) (s >> 8)};
    }

    public static byte[] c(char c2, char c3) {
        return new byte[]{(byte) (c2 & 255), (byte) (c3 & 255)};
    }

    public static byte[] b(byte b2) {
        return new byte[]{b2};
    }

    public static SecureRandom e() {
        if (f41390a != null) {
            return f41390a;
        }
        synchronized (mc.class) {
            if (f41390a == null) {
                f41390a = new SecureRandom();
            }
        }
        return f41390a;
    }

    public static byte[] c(byte[]... bArr) {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArrCopyOf = null;
        int length2 = 0;
        for (byte[] bArr3 : bArr) {
            if (bArrCopyOf == null) {
                bArrCopyOf = Arrays.copyOf(bArr3, length);
                length2 = bArr3.length;
            } else {
                System.arraycopy(bArr3, 0, bArrCopyOf, length2, bArr3.length);
                length2 += bArr3.length;
            }
        }
        return bArrCopyOf;
    }

    public static String e(byte[] bArr) {
        return Base64.encodeToString(bArr, 3);
    }
}
