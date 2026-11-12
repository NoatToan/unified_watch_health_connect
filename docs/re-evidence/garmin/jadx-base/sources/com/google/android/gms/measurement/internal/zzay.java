package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes14.dex */
abstract class zzay {
    private static volatile Handler zzb;
    private final zzjg zza;
    private final Runnable zzc;
    private volatile long zzd;

    public zzay(zzjg zzjgVar) {
        Preconditions.checkNotNull(zzjgVar);
        this.zza = zzjgVar;
        this.zzc = new zzax(this, zzjgVar);
    }

    private final Handler zzf() {
        Handler handler;
        if (zzb != null) {
            return zzb;
        }
        synchronized (zzay.class) {
            try {
                if (zzb == null) {
                    zzb = new com.google.android.gms.internal.measurement.zzcn(this.zza.zzaY().getMainLooper());
                }
                handler = zzb;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return handler;
    }

    public abstract void zza();

    public final void zzb(long j8) {
        zzd();
        if (j8 >= 0) {
            zzjg zzjgVar = this.zza;
            this.zzd = zzjgVar.zzaZ().currentTimeMillis();
            if (zzf().postDelayed(this.zzc, j8)) {
                return;
            }
            zzjgVar.zzaV().zzb().zzb("Failed to schedule delayed post. time", Long.valueOf(j8));
        }
    }

    public final boolean zzc() {
        return this.zzd != 0;
    }

    public final void zzd() {
        this.zzd = 0L;
        zzf().removeCallbacks(this.zzc);
    }

    public final /* synthetic */ void zze(long j8) {
        this.zzd = 0L;
    }
}
