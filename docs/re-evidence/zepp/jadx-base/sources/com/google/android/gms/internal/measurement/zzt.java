package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzt extends zzai {
    private final zzr a;

    public zzt(zzr zzrVar) {
        super("internal.logger");
        this.a = zzrVar;
        this.zze.put("log", new e5(this, false, true));
        this.zze.put("silent", new c5(this, "silent"));
        ((zzai) this.zze.get("silent")).zzr("log", new e5(this, true, true));
        this.zze.put("unmonitored", new d5(this, "unmonitored"));
        ((zzai) this.zze.get("unmonitored")).zzr("log", new e5(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List<zzap> list) {
        return zzap.zzf;
    }
}
