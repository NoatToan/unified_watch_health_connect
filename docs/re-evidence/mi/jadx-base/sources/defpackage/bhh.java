package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public abstract class bhh {
    public static int a(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }
}
