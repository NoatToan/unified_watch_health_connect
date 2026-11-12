package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class j4s {
    public static int a(byte[] bArr) {
        if (bArr.length != 4) {
            throw new IllegalArgumentException("the length of bytes must be 4");
        }
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static byte[] b(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }
}
