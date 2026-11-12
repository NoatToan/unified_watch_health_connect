package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sfh {
    public static byte[] a(char[] cArr) {
        if (cArr == null || cArr.length <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[(cArr.length + 1) * 2];
        for (int i = 0; i != cArr.length; i++) {
            int i2 = i * 2;
            char c = cArr[i];
            bArr[i2] = (byte) (c >>> '\b');
            bArr[i2 + 1] = (byte) c;
        }
        return bArr;
    }

    public static byte[] b(char[] cArr) {
        if (cArr == null) {
            return new byte[0];
        }
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) cArr[i];
        }
        return bArr;
    }

    public static byte[] c(char[] cArr) {
        return cArr != null ? olo.h(cArr) : new byte[0];
    }
}
