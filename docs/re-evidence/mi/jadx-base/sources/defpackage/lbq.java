package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class lbq {
    public static byte a(long j) {
        c6i.h((j >> 8) == 0, "out of range: %s", j);
        return (byte) j;
    }

    public static int b(byte b2) {
        return b2 & 255;
    }
}
