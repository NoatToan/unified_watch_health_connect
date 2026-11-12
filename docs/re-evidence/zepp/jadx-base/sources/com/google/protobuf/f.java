package com.google.protobuf;

/* JADX INFO: loaded from: classes4.dex */
final class f {
    private static final e<?> a = new ExtensionSchemaLite();
    private static final e<?> b = c();

    public static e<?> a() {
        e<?> eVar = b;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static e<?> b() {
        return a;
    }

    private static e<?> c() {
        try {
            return (e) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
