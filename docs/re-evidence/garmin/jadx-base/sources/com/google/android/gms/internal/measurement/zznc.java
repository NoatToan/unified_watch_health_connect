package com.google.android.gms.internal.measurement;

import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes14.dex */
final class zznc implements zznk {
    private final zznk[] zza;

    public zznc(zznk... zznkVarArr) {
        this.zza = zznkVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final boolean zzb(Class cls) {
        for (int i14 = 0; i14 < 2; i14++) {
            if (this.zza[i14].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final zznj zzc(Class cls) {
        for (int i14 = 0; i14 < 2; i14++) {
            zznk zznkVar = this.zza[i14];
            if (zznkVar.zzb(cls)) {
                return zznkVar.zzc(cls);
            }
        }
        e.w("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }
}
