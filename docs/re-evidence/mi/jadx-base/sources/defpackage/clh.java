package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class clh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f5456a = "0123456789ABCDEF".toCharArray();

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[(bArr.length * 3) - 1];
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            int i2 = i * 3;
            char[] cArr2 = f5456a;
            cArr[i2] = cArr2[(b2 & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b2 & 15];
            if (i != bArr.length - 1) {
                cArr[i2 + 2] = '-';
            }
        }
        return "(0x) " + new String(cArr);
    }
}
