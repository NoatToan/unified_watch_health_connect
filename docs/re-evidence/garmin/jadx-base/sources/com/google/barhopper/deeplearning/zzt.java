package com.google.barhopper.deeplearning;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes14.dex */
public final class zzt extends zzeh implements zzfn {
    private static final zzt zzb;

    static {
        zzt zztVar = new zzt();
        zzb = zztVar;
        zzeh.zzV(zzt.class, zztVar);
    }

    private zzt() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i14, Object obj, Object obj2) {
        int i15 = i14 - 1;
        if (i15 == 0) {
            return (byte) 1;
        }
        zzr zzrVar = null;
        if (i15 == 2) {
            return zzeh.zzS(zzb, "\u0001\u0000", null);
        }
        if (i15 == 3) {
            return new zzt();
        }
        if (i15 == 4) {
            return new zzs(zzrVar);
        }
        if (i15 != 5) {
            return null;
        }
        return zzb;
    }
}
