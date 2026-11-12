package com.google.protobuf;

/* JADX INFO: loaded from: classes4.dex */
final class n {
    private static final m a = c();
    private static final m b = new NewInstanceSchemaLite();

    public static m a() {
        return a;
    }

    public static m b() {
        return b;
    }

    private static m c() {
        try {
            return (m) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
