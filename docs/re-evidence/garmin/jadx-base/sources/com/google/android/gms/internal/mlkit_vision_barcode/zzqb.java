package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes14.dex */
public final class zzqb {
    private Long zza;
    private Long zzb;
    private Long zzc;
    private Long zzd;
    private Long zze;
    private Long zzf;

    public final zzqb zza(Long l14) {
        this.zzc = Long.valueOf(l14.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zzb(Long l14) {
        this.zzd = Long.valueOf(l14.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zzc(Long l14) {
        this.zza = Long.valueOf(l14.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zzd(Long l14) {
        this.zze = Long.valueOf(l14.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zze(Long l14) {
        this.zzb = Long.valueOf(l14.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zzf(Long l14) {
        this.zzf = Long.valueOf(l14.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqd zzg() {
        return new zzqd(this, null);
    }
}
