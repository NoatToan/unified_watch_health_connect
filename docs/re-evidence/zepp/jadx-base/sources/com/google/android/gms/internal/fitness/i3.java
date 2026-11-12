package com.google.android.gms.internal.fitness;

/* JADX INFO: loaded from: classes3.dex */
final class i3 {
    private static final h3 a = c();
    private static final h3 b = new j3();

    public static h3 a() {
        return a;
    }

    public static h3 b() {
        return b;
    }

    private static h3 c() {
        try {
            return (h3) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
