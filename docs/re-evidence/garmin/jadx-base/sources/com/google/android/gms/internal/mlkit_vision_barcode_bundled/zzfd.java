package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes14.dex */
final class zzfd implements zzfk {
    private final zzfk[] zza;

    public zzfd(zzfk... zzfkVarArr) {
        this.zza = zzfkVarArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfk
    public final zzfj zzb(Class cls) {
        for (int i14 = 0; i14 < 2; i14++) {
            zzfk zzfkVar = this.zza[i14];
            if (zzfkVar.zzc(cls)) {
                return zzfkVar.zzb(cls);
            }
        }
        e.w("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfk
    public final boolean zzc(Class cls) {
        for (int i14 = 0; i14 < 2; i14++) {
            if (this.zza[i14].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
