package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes14.dex */
final class zzei implements Runnable {
    final Future zza;
    final zzeh zzb;

    public zzei(Future future, zzeh zzehVar) {
        this.zza = future;
        this.zzb = zzehVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable thZza = zzey.zza((zzex) this.zza);
        if (thZza != null) {
            this.zzb.zza(thZza);
            return;
        }
        try {
            Future future = this.zza;
            if (!future.isDone()) {
                throw new IllegalStateException(zzba.zzb("Future was expected to be done: %s", future));
            }
            boolean z14 = false;
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z14 = true;
                } catch (Throwable th3) {
                    if (z14) {
                        Thread.currentThread().interrupt();
                    }
                    throw th3;
                }
            }
            if (z14) {
                Thread.currentThread().interrupt();
            }
            this.zzb.zzb(obj);
        } catch (ExecutionException e4) {
            this.zzb.zza(e4.getCause());
        } catch (Throwable th4) {
            this.zzb.zza(th4);
        }
    }

    public final String toString() {
        zzav zzavVarZza = zzaw.zza(this);
        zzavVarZza.zza(this.zzb);
        return zzavVarZza.toString();
    }
}
