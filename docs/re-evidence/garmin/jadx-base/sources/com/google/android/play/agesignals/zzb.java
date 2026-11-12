package com.google.android.play.agesignals;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes14.dex */
public final class zzb implements AgeSignalsManager {
    private final zzj zza;

    public zzb(zzj zzjVar) {
        this.zza = zzjVar;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsManager
    public final Task<AgeSignalsResult> checkAgeSignals(AgeSignalsRequest ageSignalsRequest) {
        return this.zza.zzc(ageSignalsRequest);
    }

    @Override // com.google.android.play.agesignals.AgeSignalsManager
    public final Task<AgeSignalsAccessResult> requestAgeSignalsAccess(AgeSignalsAccessRequest ageSignalsAccessRequest) {
        return this.zza.zzd(ageSignalsAccessRequest);
    }
}
