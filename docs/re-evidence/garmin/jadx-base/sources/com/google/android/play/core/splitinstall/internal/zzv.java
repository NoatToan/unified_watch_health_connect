package com.google.android.play.core.splitinstall.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzv implements Runnable {
    private final TaskCompletionSource zza;

    public zzv() {
        this.zza = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zzc();
        } catch (Exception e4) {
            zzb(e4);
        }
    }

    public final TaskCompletionSource zza() {
        return this.zza;
    }

    public final void zzb(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.zza;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void zzc();

    public zzv(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }
}
