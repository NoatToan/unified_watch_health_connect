package com.google.protobuf;

/* JADX INFO: loaded from: classes4.dex */
final class a {
    private static final Class<?> a = a("libcore.io.Memory");
    private static final boolean b;

    static {
        b = a("org.robolectric.Robolectric") != null;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> b() {
        return a;
    }

    public static boolean c() {
        return (a == null || b) ? false : true;
    }
}
