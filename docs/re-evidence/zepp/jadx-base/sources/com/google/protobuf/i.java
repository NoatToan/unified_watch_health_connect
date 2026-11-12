package com.google.protobuf;

/* JADX INFO: loaded from: classes4.dex */
final class i {
    private static final h a = c();
    private static final h b = new MapFieldSchemaLite();

    public static h a() {
        return a;
    }

    public static h b() {
        return b;
    }

    private static h c() {
        try {
            return (h) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
