package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzk extends zzai {
    private final zzab a;

    public zzk(zzab zzabVar) {
        super("internal.eventLogger");
        this.a = zzabVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List<zzap> list) {
        zzh.zzh(this.zzd, 3, list);
        String strZzi = zzgVar.zzb(list.get(0)).zzi();
        long jZza = (long) zzh.zza(zzgVar.zzb(list.get(1)).zzh().doubleValue());
        zzap zzapVarZzb = zzgVar.zzb(list.get(2));
        this.a.zze(strZzi, jZza, zzapVarZzb instanceof zzam ? zzh.zzg((zzam) zzapVarZzb) : new HashMap<>());
        return zzap.zzf;
    }
}
