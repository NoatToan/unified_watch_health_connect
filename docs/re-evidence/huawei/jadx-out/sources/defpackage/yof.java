package defpackage;

/* JADX INFO: loaded from: classes20.dex */
public final class yof {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f53694b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(byte[] bArr, boolean z) {
        return new String(c(bArr, z));
    }

    public static byte[] b(String str) throws ynw {
        return c(str.toCharArray());
    }

    private static char[] c(byte[] bArr, boolean z) {
        return d(bArr, z ? d : f53694b);
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

    private static byte[] c(char[] cArr) throws ynw {
        int length = cArr.length;
        if ((length & 1) != 0) {
            throw new ynw("Odd number of characters.");
        }
        byte[] bArr = new byte[length >> 1];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int iDigit = Character.digit(cArr[i], 16);
            if (iDigit == -1) {
                throw new ynw("Illegal hexadecimal character at index " + i);
            }
            int i3 = i + 1;
            int iDigit2 = Character.digit(cArr[i3], 16);
            if (iDigit2 == -1) {
                throw new ynw("Illegal hexadecimal character at index " + i3);
            }
            i += 2;
            bArr[i2] = (byte) (((iDigit << 4) | iDigit2) & 255);
            i2++;
        }
        return bArr;
    }
}
