package defpackage;

import cn.hutool.core.exceptions.UtilException;

/* JADX INFO: loaded from: classes.dex */
public class m7c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f25837a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f25838b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static void a(StringBuilder sb, byte b2, boolean z) {
        char[] cArr = z ? f25837a : f25838b;
        sb.append(cArr[(b2 & 240) >>> 4]);
        sb.append(cArr[b2 & 15]);
    }

    public static byte[] b(CharSequence charSequence) {
        if (tt3.G(charSequence)) {
            return null;
        }
        String strH = tt3.h(charSequence);
        int length = strH.length();
        if ((length & 1) != 0) {
            strH = "0" + ((Object) strH);
            length = strH.length();
        }
        byte[] bArr = new byte[length >> 1];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            int iH = (h(strH.charAt(i), i) << 4) | h(strH.charAt(i3), i3);
            i += 2;
            bArr[i2] = (byte) (iH & 255);
            i2++;
        }
        return bArr;
    }

    public static byte[] c(String str) {
        return b(str);
    }

    public static char[] d(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b2 & 240) >>> 4];
            i += 2;
            cArr2[i2] = cArr[b2 & 15];
        }
        return cArr2;
    }

    public static String e(byte[] bArr) {
        return f(bArr, true);
    }

    public static String f(byte[] bArr, boolean z) {
        return g(bArr, z ? f25837a : f25838b);
    }

    public static String g(byte[] bArr, char[] cArr) {
        return new String(d(bArr, cArr));
    }

    public static int h(char c, int i) {
        int iDigit = Character.digit(c, 16);
        if (iDigit >= 0) {
            return iDigit;
        }
        throw new UtilException("Illegal hexadecimal character {} at index {}", Character.valueOf(c), Integer.valueOf(i));
    }

    public static String i(long j) {
        return Long.toHexString(j);
    }
}
