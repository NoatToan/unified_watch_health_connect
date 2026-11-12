package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class llu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f40425a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static char[] d(byte[] bArr, boolean z) {
        return d(bArr, z ? e : f40425a);
    }

    private static char[] d(byte[] bArr, char[] cArr) {
        int length = bArr.length;
        char[] cArr2 = new char[length << 1];
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            cArr2[i] = cArr[(b2 & 240) >>> 4];
            cArr2[i + 1] = cArr[b2 & 15];
            i2++;
            i += 2;
        }
        return cArr2;
    }

    public static String a(byte[] bArr, boolean z) {
        return new String(d(bArr, z));
    }

    private static byte[] e(char[] cArr) throws IllegalArgumentException {
        int length = cArr.length;
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("Number of characters illegal.");
        }
        byte[] bArr = new byte[length >> 1];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int iC = c(cArr[i], i);
            int i3 = i + 1;
            i += 2;
            bArr[i2] = (byte) (((iC << 4) | c(cArr[i3], i3)) & 255);
            i2++;
        }
        return bArr;
    }

    private static int c(char c2, int i) throws IllegalArgumentException {
        int iDigit = Character.digit(c2, 16);
        if (iDigit != -1) {
            return iDigit;
        }
        throw new IllegalArgumentException("toDigitInt IllegalArgumentException " + c2 + " at index " + i);
    }

    public static byte[] d(String str) throws IllegalArgumentException {
        return e(str.toCharArray());
    }
}
