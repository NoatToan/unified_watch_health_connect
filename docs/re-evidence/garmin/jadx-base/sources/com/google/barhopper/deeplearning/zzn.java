package com.google.barhopper.deeplearning;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes14.dex */
public final class zzn extends zzeh implements zzfn {
    private static final zzn zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzeh.zzV(zzn.class, zznVar);
    }

    private zzn() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i14, Object obj, Object obj2) {
        int i15 = i14 - 1;
        if (i15 == 0) {
            return (byte) 1;
        }
        if (i15 == 2) {
            return zzeh.zzS(zzb, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zze", "zzd", zzt.class, zzz.class, zzw.class});
        }
        if (i15 == 3) {
            return new zzn();
        }
        zzl zzlVar = null;
        if (i15 == 4) {
            return new zzm(zzlVar);
        }
        if (i15 != 5) {
            return null;
        }
        return zzb;
    }
}
