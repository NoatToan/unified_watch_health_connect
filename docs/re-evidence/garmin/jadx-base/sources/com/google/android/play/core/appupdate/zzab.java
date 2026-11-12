package com.google.android.play.core.appupdate;

import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class zzab {
    private zzi zza;

    public /* synthetic */ zzab(zzaa zzaaVar) {
    }

    public final zza zza() {
        zzi zziVar = this.zza;
        if (zziVar != null) {
            return new zzz(zziVar, null);
        }
        h.z(String.valueOf(zzi.class.getCanonicalName()).concat(" must be set"));
        return null;
    }

    public final zzab zzb(zzi zziVar) {
        this.zza = zziVar;
        return this;
    }

    private zzab() {
    }
}
