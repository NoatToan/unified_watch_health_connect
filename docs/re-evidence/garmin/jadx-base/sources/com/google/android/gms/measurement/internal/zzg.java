package com.google.android.gms.measurement.internal;

import vb.h;

/* JADX INFO: loaded from: classes14.dex */
abstract class zzg extends zzf {
    private boolean zza;

    public zzg(zzic zzicVar) {
        super(zzicVar);
        this.zzu.zzF();
    }

    public final boolean zza() {
        return this.zza;
    }

    public final void zzb() {
        if (zza()) {
            return;
        }
        h.z("Not initialized");
    }

    public final void zzc() {
        if (this.zza) {
            h.z("Can't initialize twice");
        } else {
            if (zze()) {
                return;
            }
            this.zzu.zzG();
            this.zza = true;
        }
    }

    public final void zzd() {
        if (this.zza) {
            h.z("Can't initialize twice");
            return;
        }
        zzf();
        this.zzu.zzG();
        this.zza = true;
    }

    public abstract boolean zze();

    public void zzf() {
    }
}
