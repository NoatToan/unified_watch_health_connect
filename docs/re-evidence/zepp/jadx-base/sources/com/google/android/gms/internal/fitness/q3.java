package com.google.android.gms.internal.fitness;

/* JADX INFO: loaded from: classes3.dex */
final class q3 {
    private static final p3 a = c();
    private static final p3 b = new r3();

    public static p3 a() {
        return a;
    }

    public static p3 b() {
        return b;
    }

    private static p3 c() {
        try {
            return (p3) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
