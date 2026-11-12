package com.google.android.gms.measurement.internal;

import vb.h;

/* JADX INFO: loaded from: classes14.dex */
abstract class zzjf extends zzje {
    private boolean zza;

    public zzjf(zzic zzicVar) {
        super(zzicVar);
        this.zzu.zzF();
    }

    public abstract boolean zza();

    public void zzba() {
    }

    public final boolean zzv() {
        return this.zza;
    }

    public final void zzw() {
        if (zzv()) {
            return;
        }
        h.z("Not initialized");
    }

    public final void zzx() {
        if (this.zza) {
            h.z("Can't initialize twice");
        } else {
            if (zza()) {
                return;
            }
            this.zzu.zzG();
            this.zza = true;
        }
    }

    public final void zzy() {
        if (this.zza) {
            h.z("Can't initialize twice");
            return;
        }
        zzba();
        this.zzu.zzG();
        this.zza = true;
    }
}
