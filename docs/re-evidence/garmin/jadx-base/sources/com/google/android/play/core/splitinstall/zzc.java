package com.google.android.play.core.splitinstall;

import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class zzc {
    private zzac zza;

    public /* synthetic */ zzc(zzb zzbVar) {
    }

    public final zzc zza(zzac zzacVar) {
        this.zza = zzacVar;
        return this;
    }

    public final zzp zzb() {
        zzac zzacVar = this.zza;
        if (zzacVar != null) {
            return new zze(zzacVar, null);
        }
        h.z(String.valueOf(zzac.class.getCanonicalName()).concat(" must be set"));
        return null;
    }

    private zzc() {
    }
}
