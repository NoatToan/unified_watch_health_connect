package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzn extends zzai {
    private final zzo a;

    public zzn(String str, zzo zzoVar) {
        super("internal.remoteConfig");
        this.a = zzoVar;
        this.zze.put("getValue", new n4(this, "getValue", zzoVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List<zzap> list) {
        return zzap.zzf;
    }
}
