package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes14.dex */
public final class zzoc extends zzg {
    protected final zzob zza;
    protected final zzoa zzb;
    protected final zzny zzc;
    private Handler zzd;
    private boolean zze;

    public zzoc(zzic zzicVar) {
        super(zzicVar);
        this.zze = true;
        this.zza = new zzob(this);
        this.zzb = new zzoa(this);
        this.zzc = new zzny(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final void zzj() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new com.google.android.gms.internal.measurement.zzcn(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return false;
    }

    public final void zzh(boolean z14) {
        zzg();
        this.zze = z14;
    }

    public final boolean zzi() {
        zzg();
        return this.zze;
    }

    public final /* synthetic */ void zzk(long j8) {
        zzg();
        zzj();
        zzic zzicVar = this.zzu;
        zzicVar.zzaV().zzk().zzb("Activity resumed, time", Long.valueOf(j8));
        if (zzicVar.zzc().zzp(null, zzfy.zzaU)) {
            if (zzicVar.zzc().zzv() || this.zze) {
                this.zzb.zza(j8);
            }
        } else if (zzicVar.zzc().zzv() || zzicVar.zzd().zzn.zza()) {
            this.zzb.zza(j8);
        }
        this.zzc.zza();
        zzob zzobVar = this.zza;
        zzoc zzocVar = zzobVar.zza;
        zzocVar.zzg();
        if (zzocVar.zzu.zzB()) {
            zzobVar.zzb(zzocVar.zzu.zzaZ().currentTimeMillis(), false);
        }
    }

    public final /* synthetic */ void zzl(long j8) {
        zzg();
        zzj();
        zzic zzicVar = this.zzu;
        zzicVar.zzaV().zzk().zzb("Activity paused, time", Long.valueOf(j8));
        this.zzc.zzb(j8);
        if (zzicVar.zzc().zzv()) {
            this.zzb.zzb(j8);
        }
    }

    public final /* synthetic */ Handler zzm() {
        return this.zzd;
    }
}
