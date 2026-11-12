package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class o3 {
    private static final n3 a;
    private static final n3 b;

    static {
        n3 n3Var;
        try {
            n3Var = (n3) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            n3Var = null;
        }
        a = n3Var;
        b = new n3();
    }

    public static n3 a() {
        return a;
    }

    public static n3 b() {
        return b;
    }
}
