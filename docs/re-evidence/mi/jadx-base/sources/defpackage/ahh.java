package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ahh {
    public static void a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static void b(long j, byte[] bArr, int i) {
        a((int) (j >>> 32), bArr, i);
        a((int) (j & 4294967295L), bArr, i + 4);
    }
}
