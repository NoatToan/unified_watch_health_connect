package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ads {
    public static int a(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    public static long b(byte[] bArr, int i) {
        int i2 = i + 2;
        return ((long) ((a(bArr, i2) << 16) | a(bArr, i))) & 4294967295L;
    }
}
