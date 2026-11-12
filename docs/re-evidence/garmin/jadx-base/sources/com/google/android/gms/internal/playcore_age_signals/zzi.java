package com.google.android.gms.internal.playcore_age_signals;

import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzi extends zze {
    final /* synthetic */ zzo zza;

    public zzi(zzo zzoVar) {
        Objects.requireNonNull(zzoVar);
        this.zza = zzoVar;
    }

    @Override // com.google.android.gms.internal.playcore_age_signals.zze
    public final void zzb() {
        zzo zzoVar = this.zza;
        synchronized (zzoVar.zzg) {
            try {
                if (zzoVar.zzl.get() > 0 && zzoVar.zzl.decrementAndGet() > 0) {
                    zzoVar.zzc.zzc("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                if (zzoVar.zzn != null) {
                    zzoVar.zzc.zzc("Unbind from service.", new Object[0]);
                    zzoVar.zzb.unbindService(zzoVar.zzm);
                    zzoVar.zzh = false;
                    zzoVar.zzn = null;
                    zzoVar.zzm = null;
                }
                zzoVar.zzw();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
