package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes14.dex */
public final class zzhu extends zzmf implements zznn {
    private static final zzhu zzf;
    private int zzb;
    private String zzd = "";
    private long zze;

    static {
        zzhu zzhuVar = new zzhu();
        zzf = zzhuVar;
        zzmf.zzcp(zzhu.class, zzhuVar);
    }

    private zzhu() {
    }

    public static zzht zza() {
        return (zzht) zzf.zzck();
    }

    public final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void zzc(long j8) {
        this.zzb |= 2;
        this.zze = j8;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final Object zzl(int i14, Object obj, Object obj2) {
        int i15 = i14 - 1;
        if (i15 == 0) {
            return (byte) 1;
        }
        if (i15 == 2) {
            return zzmf.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i15 == 3) {
            return new zzhu();
        }
        byte[] bArr = null;
        if (i15 == 4) {
            return new zzht(bArr);
        }
        if (i15 == 5) {
            return zzf;
        }
        throw null;
    }
}
