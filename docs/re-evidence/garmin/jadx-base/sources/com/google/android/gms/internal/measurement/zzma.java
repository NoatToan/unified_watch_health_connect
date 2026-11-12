package com.google.android.gms.internal.measurement;

import r1.q2;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzma implements zznk {
    private static final zzma zza = new zzma();

    private zzma() {
    }

    public static zzma zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final boolean zzb(Class cls) {
        return zzmf.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final zznj zzc(Class cls) {
        if (!zzmf.class.isAssignableFrom(cls)) {
            h.s("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (zznj) zzmf.zzco(cls.asSubclass(zzmf.class)).zzl(3, null, null);
        } catch (Exception e4) {
            q2.v("Unable to get message info for ".concat(cls.getName()), e4);
            return null;
        }
    }
}
