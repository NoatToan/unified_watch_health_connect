package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class fbm {
    public static short a(byte[] bArr) {
        return b(bArr, 0);
    }

    public static short b(byte[] bArr, int i) {
        if (bArr == null || bArr.length < i + 2) {
            return (short) 0;
        }
        return (short) ((bArr[i + 1] & 255) | (bArr[i] << 8));
    }
}
