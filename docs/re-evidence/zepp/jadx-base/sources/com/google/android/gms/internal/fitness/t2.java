package com.google.android.gms.internal.fitness;

/* JADX INFO: loaded from: classes3.dex */
final class t2 implements k3 {
    private static final t2 a = new t2();

    private t2() {
    }

    public static t2 c() {
        return a;
    }

    @Override // com.google.android.gms.internal.fitness.k3
    public final boolean a(Class<?> cls) {
        return zzgy.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.fitness.k3
    public final l3 b(Class<?> cls) {
        if (!zzgy.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (l3) zzgy.c(cls.asSubclass(zzgy.class)).zza(zzgy.zze.zzyf, (Object) null, (Object) null);
        } catch (Exception e) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e);
        }
    }
}
