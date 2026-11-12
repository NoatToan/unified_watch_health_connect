package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzep extends zzeq {
    final /* synthetic */ Long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ zzfb zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzep(zzfb zzfbVar, Long l14, String str, String str2, Bundle bundle, boolean z14, boolean z15) {
        super(zzfbVar, true);
        this.zza = l14;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bundle;
        this.zze = z14;
        this.zzf = z15;
        Objects.requireNonNull(zzfbVar);
        this.zzg = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zza() {
        Long l14 = this.zza;
        ((zzcr) Preconditions.checkNotNull(this.zzg.zzQ())).logEvent(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, l14 == null ? this.zzh : l14.longValue());
    }
}
