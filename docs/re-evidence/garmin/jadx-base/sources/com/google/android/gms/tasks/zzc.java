package com.google.android.gms.tasks;

import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzc implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzd zzb;

    public zzc(zzd zzdVar, Task task) {
        this.zza = task;
        Objects.requireNonNull(zzdVar);
        this.zzb = zzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Task task = this.zza;
        boolean zIsCanceled = task.isCanceled();
        zzd zzdVar = this.zzb;
        if (zIsCanceled) {
            zzdVar.zzd().zze();
            return;
        }
        try {
            this.zzb.zzd().zza(zzdVar.zzc().then(task));
        } catch (RuntimeExecutionException e4) {
            boolean z14 = e4.getCause() instanceof Exception;
            zzd zzdVar2 = this.zzb;
            if (!z14) {
                zzdVar2.zzd().zzc(e4);
            } else {
                zzdVar2.zzd().zzc((Exception) e4.getCause());
            }
        } catch (Exception e14) {
            this.zzb.zzd().zzc(e14);
        }
    }
}
