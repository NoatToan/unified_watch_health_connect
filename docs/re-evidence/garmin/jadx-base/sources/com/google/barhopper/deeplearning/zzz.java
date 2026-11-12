package com.google.barhopper.deeplearning;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes14.dex */
public final class zzz extends zzeh implements zzfn {
    private static final zzz zzb;

    static {
        zzz zzzVar = new zzz();
        zzb = zzzVar;
        zzeh.zzV(zzz.class, zzzVar);
    }

    private zzz() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i14, Object obj, Object obj2) {
        int i15 = i14 - 1;
        if (i15 == 0) {
            return (byte) 1;
        }
        zzx zzxVar = null;
        if (i15 == 2) {
            return zzeh.zzS(zzb, "\u0001\u0000", null);
        }
        if (i15 == 3) {
            return new zzz();
        }
        if (i15 == 4) {
            return new zzy(zzxVar);
        }
        if (i15 != 5) {
            return null;
        }
        return zzb;
    }
}
