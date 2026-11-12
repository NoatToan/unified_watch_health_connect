package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class d3 implements q3 {
    private static final d3 a = new d3();

    private d3() {
    }

    public static d3 c() {
        return a;
    }

    @Override // com.google.android.gms.internal.measurement.q3
    public final p3 a(Class<?> cls) {
        if (!zzjx.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (p3) zzjx.d(cls.asSubclass(zzjx.class)).zzl(3, null, null);
        } catch (Exception e) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.q3
    public final boolean b(Class<?> cls) {
        return zzjx.class.isAssignableFrom(cls);
    }
}
