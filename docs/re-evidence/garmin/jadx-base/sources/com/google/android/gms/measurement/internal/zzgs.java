package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class zzgs {
    final /* synthetic */ zzgu zza;
    private final int zzb;
    private final boolean zzc;
    private final boolean zzd;

    public zzgs(zzgu zzguVar, int i14, boolean z14, boolean z15) {
        Objects.requireNonNull(zzguVar);
        this.zza = zzguVar;
        this.zzb = i14;
        this.zzc = z14;
        this.zzd = z15;
    }

    public final void zza(String str) {
        this.zza.zzm(this.zzb, this.zzc, this.zzd, str, null, null, null);
    }

    public final void zzb(String str, Object obj) {
        this.zza.zzm(this.zzb, this.zzc, this.zzd, str, obj, null, null);
    }

    public final void zzc(String str, Object obj, Object obj2) {
        this.zza.zzm(this.zzb, this.zzc, this.zzd, str, obj, obj2, null);
    }

    public final void zzd(String str, Object obj, Object obj2, Object obj3) {
        this.zza.zzm(this.zzb, this.zzc, this.zzd, str, obj, obj2, obj3);
    }
}
