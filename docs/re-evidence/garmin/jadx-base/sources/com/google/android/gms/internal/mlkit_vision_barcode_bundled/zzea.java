package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import r1.q2;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzea implements zzfk {
    private static final zzea zza = new zzea();

    private zzea() {
    }

    public static zzea zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfk
    public final zzfj zzb(Class cls) {
        if (!zzeh.class.isAssignableFrom(cls)) {
            h.s("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (zzfj) zzeh.zzJ(cls.asSubclass(zzeh.class)).zzg(3, null, null);
        } catch (Exception e4) {
            q2.v("Unable to get message info for ".concat(cls.getName()), e4);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfk
    public final boolean zzc(Class cls) {
        return zzeh.class.isAssignableFrom(cls);
    }
}
