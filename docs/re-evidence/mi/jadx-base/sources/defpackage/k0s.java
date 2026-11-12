package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class k0s {
    public static long a(float f, float f2) {
        return ((long) Float.floatToRawIntBits(f2)) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    public static long b(int i, int i2) {
        return a(i, i2);
    }
}
