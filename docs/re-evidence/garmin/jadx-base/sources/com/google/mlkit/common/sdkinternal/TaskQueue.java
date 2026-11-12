package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class TaskQueue {
    private boolean zzb;
    private final Object zza = new Object();
    private final Queue zzc = new ArrayDeque();
    private final AtomicReference zzd = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc() {
        synchronized (this.zza) {
            try {
                if (this.zzc.isEmpty()) {
                    this.zzb = false;
                } else {
                    zzv zzvVar = (zzv) this.zzc.remove();
                    zzd(zzvVar.zza, zzvVar.zzb);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private final void zzd(Executor executor, final Runnable runnable) {
        try {
            executor.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzt
                @Override // java.lang.Runnable
                public final void run() {
                    zzx zzxVar = new zzx(this.zza, null);
                    try {
                        runnable.run();
                        zzxVar.close();
                    } catch (Throwable th3) {
                        try {
                            zzxVar.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            zzc();
        }
    }

    @KeepForSdk
    public void checkIsRunningOnCurrentThread() {
        Preconditions.checkState(Thread.currentThread().equals(this.zzd.get()));
    }

    @KeepForSdk
    public void submit(Executor executor, Runnable runnable) {
        synchronized (this.zza) {
            try {
                if (this.zzb) {
                    this.zzc.add(new zzv(executor, runnable, null));
                } else {
                    this.zzb = true;
                    zzd(executor, runnable);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
