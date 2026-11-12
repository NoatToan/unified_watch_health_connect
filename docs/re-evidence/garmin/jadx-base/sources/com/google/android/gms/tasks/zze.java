package com.google.android.gms.tasks;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes14.dex */
final class zze implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzf zzb;

    public zze(zzf zzfVar, Task task) {
        this.zza = task;
        Objects.requireNonNull(zzfVar);
        this.zzb = zzfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task task = (Task) this.zzb.zzc().then(this.zza);
            zzf zzfVar = this.zzb;
            if (task == null) {
                zzfVar.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = TaskExecutors.zza;
            task.addOnSuccessListener(executor, zzfVar);
            task.addOnFailureListener(executor, zzfVar);
            task.addOnCanceledListener(executor, zzfVar);
        } catch (RuntimeExecutionException e4) {
            boolean z14 = e4.getCause() instanceof Exception;
            zzf zzfVar2 = this.zzb;
            if (!z14) {
                zzfVar2.zzd().zzc(e4);
            } else {
                zzfVar2.zzd().zzc((Exception) e4.getCause());
            }
        } catch (Exception e14) {
            this.zzb.zzd().zzc(e14);
        }
    }
}
