package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes14.dex */
public final class zziu extends zzmf implements zznn {
    private static final zziu zzj;
    private int zzb;
    private long zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;

    static {
        zziu zziuVar = new zziu();
        zzj = zziuVar;
        zzmf.zzcp(zziu.class, zziuVar);
    }

    private zziu() {
    }

    public static zzit zzm() {
        return (zzit) zzj.zzck();
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final long zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zze;
    }

    public final boolean zzd() {
        return (this.zzb & 4) != 0;
    }

    public final String zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        return (this.zzb & 8) != 0;
    }

    public final long zzg() {
        return this.zzg;
    }

    public final boolean zzh() {
        return (this.zzb & 16) != 0;
    }

    public final float zzi() {
        return this.zzh;
    }

    public final boolean zzj() {
        return (this.zzb & 32) != 0;
    }

    public final double zzk() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final Object zzl(int i14, Object obj, Object obj2) {
        int i15 = i14 - 1;
        if (i15 == 0) {
            return (byte) 1;
        }
        if (i15 == 2) {
            return zzmf.zzcq(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i15 == 3) {
            return new zziu();
        }
        byte[] bArr = null;
        if (i15 == 4) {
            return new zzit(bArr);
        }
        if (i15 == 5) {
            return zzj;
        }
        throw null;
    }

    public final /* synthetic */ void zzn(long j8) {
        this.zzb |= 1;
        this.zzd = j8;
    }

    public final /* synthetic */ void zzo(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void zzp(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzf = str;
    }

    public final /* synthetic */ void zzq() {
        this.zzb &= -5;
        this.zzf = zzj.zzf;
    }

    public final /* synthetic */ void zzr(long j8) {
        this.zzb |= 8;
        this.zzg = j8;
    }

    public final /* synthetic */ void zzs() {
        this.zzb &= -9;
        this.zzg = 0L;
    }

    public final /* synthetic */ void zzt(double d14) {
        this.zzb |= 32;
        this.zzi = d14;
    }

    public final /* synthetic */ void zzu() {
        this.zzb &= -33;
        this.zzi = 0.0d;
    }
}
