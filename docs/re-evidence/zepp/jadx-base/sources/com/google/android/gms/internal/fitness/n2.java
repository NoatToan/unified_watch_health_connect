package com.google.android.gms.internal.fitness;

/* JADX INFO: loaded from: classes3.dex */
final class n2 {
    private static final m2<?> a = new o2();
    private static final m2<?> b = a();

    private static m2<?> a() {
        try {
            return (m2) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static m2<?> b() {
        return a;
    }

    public static m2<?> c() {
        m2<?> m2Var = b;
        if (m2Var != null) {
            return m2Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
