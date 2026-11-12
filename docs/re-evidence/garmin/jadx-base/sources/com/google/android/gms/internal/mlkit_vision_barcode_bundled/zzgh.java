package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
final class zzgh extends zzgo {
    public zzgh() {
        super(null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgo
    public final void zza() {
        if (!zzj()) {
            for (int i14 = 0; i14 < zzc(); i14++) {
                ((zzdw) ((zzgi) zzg(i14)).zza()).zzg();
            }
            Iterator it = zzd().iterator();
            while (it.hasNext()) {
                ((zzdw) ((Map.Entry) it.next()).getKey()).zzg();
            }
        }
        super.zza();
    }
}
