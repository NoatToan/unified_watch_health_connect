package com.google.android.gms.internal.playcore_age_signals;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzh extends zze {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ zzo zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(zzo zzoVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, zze zzeVar) {
        super(taskCompletionSource);
        this.zza = taskCompletionSource2;
        this.zzb = zzeVar;
        Objects.requireNonNull(zzoVar);
        this.zzc = zzoVar;
    }

    @Override // com.google.android.gms.internal.playcore_age_signals.zze
    public final void zzb() {
        zzo zzoVar = this.zzc;
        synchronized (zzoVar.zzg) {
            try {
                zzo.zzo(zzoVar, this.zza);
                if (zzoVar.zzl.getAndIncrement() > 0) {
                    zzoVar.zzc.zzc("Already connected to the service.", new Object[0]);
                }
                zzo.zzq(zzoVar, this.zzb);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
