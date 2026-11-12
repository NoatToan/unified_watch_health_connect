package com.google.android.gms.internal.playcore_age_signals;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zze implements Runnable {
    private final TaskCompletionSource zza;

    public zze() {
        this.zza = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zzb();
        } catch (Exception e4) {
            zza(e4);
        }
    }

    public void zza(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.zza;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void zzb();

    public final TaskCompletionSource zzc() {
        return this.zza;
    }

    public zze(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }
}
