package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class biz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f1141c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String c(byte[] bArr, boolean z) {
        return new String(b(bArr, z));
    }

    private static char[] c(byte[] bArr, char[] cArr) {
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

    public static char[] b(byte[] bArr, boolean z) {
        return c(bArr, z ? d : f1141c);
    }
}
