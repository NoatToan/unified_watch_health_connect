package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public final class bss {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f4576a = b(1, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f4577b = b(1, 4);
    public static final int c = b(2, 0);
    public static final int d = b(3, 2);

    public static int a(int i) {
        return i & 7;
    }

    public static int b(int i, int i2) {
        return (i << 3) | i2;
    }

    public static int c(int i) {
        return i >>> 3;
    }
}
