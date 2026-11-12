package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class v3 {
    private static final u3 a;
    private static final u3 b;

    static {
        u3 u3Var;
        try {
            u3Var = (u3) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            u3Var = null;
        }
        a = u3Var;
        b = new u3();
    }

    public static u3 a() {
        return a;
    }

    public static u3 b() {
        return b;
    }
}
