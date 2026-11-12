package defpackage;

import java.security.InvalidParameterException;

/* JADX INFO: loaded from: classes3.dex */
public class f2s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f17346a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f17347b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static int a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        throw new InvalidParameterException("Invalid hex char '" + c + "'");
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return c(bArr, 0, bArr.length);
    }

    public static String c(byte[] bArr, int i, int i2) {
        char[] cArr = new char[i2 * 2];
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            byte b2 = bArr[i4];
            int i5 = i3 + 1;
            char[] cArr2 = f17347b;
            cArr[i3] = cArr2[(b2 >>> 4) & 15];
            i3 += 2;
            cArr[i5] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public static boolean d(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2 == null;
        }
        if (bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = bArr.length - 1; length >= 0; length--) {
            z &= bArr[length] == bArr2[length];
        }
        return z;
    }

    public static byte[] e(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((a(str.charAt(i)) << 4) | a(str.charAt(i + 1)));
        }
        return bArr;
    }

    public static String f(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        String str = "";
        for (int i = 0; i < bArr.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            char[] cArr = f17346a;
            sb.append(cArr[(bArr[i] >>> 4) & 15]);
            str = sb.toString() + cArr[bArr[i] & 15];
        }
        return str;
    }
}
