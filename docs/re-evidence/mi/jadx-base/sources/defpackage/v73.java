package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class v73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f36580a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (!h(bArr)) {
            for (byte b2 : bArr) {
                sb.append(String.format("%02x", Byte.valueOf(b2)));
            }
        }
        return sb.toString();
    }

    public static int b(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static int c(long j, long j2) {
        return b(j - Long.MIN_VALUE, j2 - Long.MIN_VALUE);
    }

    public static int d(int i) {
        return i & 255;
    }

    public static long e(int i) {
        return ((long) i) & 4294967295L;
    }

    public static String f(long j) {
        long j2 = (j >>> 1) / 5;
        return Long.toString(j2) + (j - (10 * j2));
    }

    public static int g(int i) {
        return i & 65535;
    }

    public static boolean h(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static long i(String str, int i) throws NumberFormatException {
        if (str == null) {
            throw new NumberFormatException(AbstractJsonLexerKt.NULL);
        }
        int length = str.length();
        if (length <= 0) {
            throw new NumberFormatException("For input string: \"" + str + "\"");
        }
        if (str.charAt(0) == '-') {
            throw new NumberFormatException(String.format("Illegal leading minus sign on unsigned string %s.", str));
        }
        if (length <= 12 || (i == 10 && length <= 18)) {
            return Long.parseLong(str, i);
        }
        int i2 = length - 1;
        long j = Long.parseLong(str.substring(0, i2), i);
        int iDigit = Character.digit(str.charAt(i2), i);
        if (iDigit >= 0) {
            long j2 = (((long) i) * j) + ((long) iDigit);
            if (c(j2, j) >= 0) {
                return j2;
            }
            throw new NumberFormatException(String.format("String value %s exceeds range of unsigned long.", str));
        }
        throw new NumberFormatException("Bad digit at end of " + str);
    }
}
