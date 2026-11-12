package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzdq extends zzeq {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfb zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdq(zzfb zzfbVar, long j8) {
        super(zzfbVar, true);
        this.zza = j8;
        Objects.requireNonNull(zzfbVar);
        this.zzb = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zza() {
        ((zzcr) Preconditions.checkNotNull(this.zzb.zzQ())).setSessionTimeoutDuration(this.zza);
    }
}
