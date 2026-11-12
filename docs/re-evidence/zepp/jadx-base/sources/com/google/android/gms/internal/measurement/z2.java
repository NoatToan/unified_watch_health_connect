package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class z2 {
    private static final x2<?> a = new y2();
    private static final x2<?> b;

    static {
        x2<?> x2Var;
        try {
            x2Var = (x2) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            x2Var = null;
        }
        b = x2Var;
    }

    public static x2<?> a() {
        x2<?> x2Var = b;
        if (x2Var != null) {
            return x2Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static x2<?> b() {
        return a;
    }
}
