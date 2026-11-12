package com.google.android.gms.measurement.internal;

import vb.h;

/* JADX INFO: loaded from: classes14.dex */
abstract class zzos extends zzol {
    private boolean zza;

    public zzos(zzpg zzpgVar) {
        super(zzpgVar);
        this.zzg.zzae();
    }

    public final boolean zzav() {
        return this.zza;
    }

    public final void zzaw() {
        if (zzav()) {
            return;
        }
        h.z("Not initialized");
    }

    public final void zzax() {
        if (this.zza) {
            h.z("Can't initialize twice");
            return;
        }
        zzbb();
        this.zzg.zzaf();
        this.zza = true;
    }

    public abstract boolean zzbb();
}
