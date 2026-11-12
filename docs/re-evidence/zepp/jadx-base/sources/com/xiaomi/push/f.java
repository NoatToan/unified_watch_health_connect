package com.xiaomi.push;

/* JADX INFO: loaded from: classes22.dex */
public final class f {
    public static final int a = b(1, 3);
    public static final int b = b(1, 4);
    public static final int c = b(2, 0);
    public static final int d = b(3, 2);

    public static int a(int i) {
        return i & 7;
    }

    public static int b(int i) {
        return i >>> 3;
    }

    public static int b(int i, int i2) {
        return (i << 3) | i2;
    }
}
