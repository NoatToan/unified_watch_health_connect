package com.google.android.play.core.splitinstall.testing;

import j20.x;
import java.util.Map;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zza extends zzu {
    private Integer zza;
    private Map zzb;

    @Override // com.google.android.play.core.splitinstall.testing.zzu
    public final zzu zza(int i14) {
        this.zza = Integer.valueOf(i14);
        return this;
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzu
    public final zzu zzb(Map map) {
        if (map != null) {
            this.zzb = map;
            return this;
        }
        x.l("Null splitInstallErrorCodeByModule");
        return null;
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzu
    public final zzv zzc() {
        if (this.zzb != null) {
            return new zzc(this.zza, this.zzb, null);
        }
        h.z("Missing required properties: splitInstallErrorCodeByModule");
        return null;
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzu
    public final Map zzd() {
        Map map = this.zzb;
        if (map != null) {
            return map;
        }
        h.z("Property \"splitInstallErrorCodeByModule\" has not been set");
        return null;
    }
}
