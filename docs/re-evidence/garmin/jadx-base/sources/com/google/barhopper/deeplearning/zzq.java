package com.google.barhopper.deeplearning;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes14.dex */
public final class zzq extends zzeh implements zzfn {
    private static final zzq zzb;
    private zzeo zzd = zzeh.zzP();
    private zzeo zze = zzeh.zzP();

    static {
        zzq zzqVar = new zzq();
        zzb = zzqVar;
        zzeh.zzV(zzq.class, zzqVar);
    }

    private zzq() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i14, Object obj, Object obj2) {
        int i15 = i14 - 1;
        if (i15 == 0) {
            return (byte) 1;
        }
        if (i15 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zzd", zzn.class, "zze", zzn.class});
        }
        if (i15 == 3) {
            return new zzq();
        }
        zzo zzoVar = null;
        if (i15 == 4) {
            return new zzp(zzoVar);
        }
        if (i15 != 5) {
            return null;
        }
        return zzb;
    }
}
