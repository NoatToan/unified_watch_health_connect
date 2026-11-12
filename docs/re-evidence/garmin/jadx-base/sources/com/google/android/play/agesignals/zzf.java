package com.google.android.play.agesignals;

import am.j;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.agesignals.protocol.IAgeSignalsService;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzf extends com.google.android.gms.internal.playcore_age_signals.zze {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ AgeSignalsAccessRequest zzb;
    final /* synthetic */ zzj zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(zzj zzjVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, AgeSignalsAccessRequest ageSignalsAccessRequest) {
        super(taskCompletionSource);
        this.zza = taskCompletionSource2;
        this.zzb = ageSignalsAccessRequest;
        Objects.requireNonNull(zzjVar);
        this.zzc = zzjVar;
    }

    @Override // com.google.android.gms.internal.playcore_age_signals.zze
    public final void zza(Exception exc) {
        if (exc instanceof com.google.android.gms.internal.playcore_age_signals.zzp) {
            super.zza(new AgeSignalsException(-5));
        } else {
            super.zza(exc);
        }
    }

    @Override // com.google.android.gms.internal.playcore_age_signals.zze
    public final void zzb() {
        try {
            zzj zzjVar = this.zzc;
            ((IAgeSignalsService) zzjVar.zza.zze()).requestAgeSignalsAccess(zzjVar.zzd.getPackageName(), j.e(4, "playcore.version.code"), new zzh(zzjVar, this.zza, this.zzb.activity()));
        } catch (RemoteException e4) {
            zzj.zzb.zzb(e4, "requestAgeSignalsAccess failed.", new Object[0]);
            this.zza.trySetException(new AgeSignalsException(-100));
        }
    }
}
