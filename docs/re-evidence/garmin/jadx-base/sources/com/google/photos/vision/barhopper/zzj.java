package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes2.dex */
public final class zzj extends zzeh implements zzfn {
    private static final zzj zzb;
    private int zzd;
    private String zze = "";
    private zzeo zzf = zzeh.zzP();

    static {
        zzj zzjVar = new zzj();
        zzb = zzjVar;
        zzeh.zzV(zzj.class, zzjVar);
    }

    private zzj() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i14, Object obj, Object obj2) {
        int i15 = i14 - 1;
        if (i15 == 0) {
            return (byte) 1;
        }
        if (i15 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", zzx.class});
        }
        if (i15 == 3) {
            return new zzj();
        }
        zza zzaVar = null;
        if (i15 == 4) {
            return new zzi(zzaVar);
        }
        if (i15 != 5) {
            return null;
        }
        return zzb;
    }
}
