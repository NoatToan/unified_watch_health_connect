package com.google.android.gms.internal.fitness;

/* JADX INFO: loaded from: classes3.dex */
final class w1 {
    private static final Class<?> a = c("libcore.io.Memory");
    private static final boolean b;

    static {
        b = c("org.robolectric.Robolectric") != null;
    }

    public static boolean a() {
        return (a == null || b) ? false : true;
    }

    public static Class<?> b() {
        return a;
    }

    private static <T> Class<T> c(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
