package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class rw9 {
    public static int a(int i, int i2) {
        return ((i & 65535) << 16) | (i2 & 65535);
    }

    public static int b(int i) {
        return i & 65535;
    }

    public static int c(int i) {
        return (i >> 16) & 65535;
    }

    public static String d(int i) {
        return c(i) + "." + b(i);
    }
}
