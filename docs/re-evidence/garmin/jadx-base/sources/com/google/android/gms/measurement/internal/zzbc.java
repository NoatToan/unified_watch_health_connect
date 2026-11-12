package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes14.dex */
final class zzbc {
    final String zza;
    final String zzb;
    final long zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final Long zzh;
    final Long zzi;
    final Long zzj;
    final Boolean zzk;

    public zzbc(String str, String str2, long j8, long j14, long j15, long j16, long j17, Long l14, Long l15, Long l16, Boolean bool) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkArgument(j8 >= 0);
        Preconditions.checkArgument(j14 >= 0);
        Preconditions.checkArgument(j15 >= 0);
        Preconditions.checkArgument(j17 >= 0);
        this.zza = str;
        this.zzb = str2;
        this.zzc = j8;
        this.zzd = j14;
        this.zze = j15;
        this.zzf = j16;
        this.zzg = j17;
        this.zzh = l14;
        this.zzi = l15;
        this.zzj = l16;
        this.zzk = bool;
    }

    public final zzbc zza(long j8) {
        return new zzbc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, j8, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk);
    }

    public final zzbc zzb(long j8, long j14) {
        return new zzbc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, j8, Long.valueOf(j14), this.zzi, this.zzj, this.zzk);
    }

    public final zzbc zzc(Long l14, Long l15, Boolean bool) {
        return new zzbc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, l14, l15, bool);
    }
}
