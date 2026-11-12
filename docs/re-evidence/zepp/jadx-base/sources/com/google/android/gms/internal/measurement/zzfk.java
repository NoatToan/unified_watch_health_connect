package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfk extends zzjx<zzfk, zzfj> implements zzld {
    private static final zzfk zza;
    private int zze;
    private int zzf;
    private zzgd zzg;
    private zzgd zzh;
    private boolean zzi;

    static {
        zzfk zzfkVar = new zzfk();
        zza = zzfkVar;
        zzjx.zzbG(zzfk.class, zzfkVar);
    }

    private zzfk() {
    }

    public static /* synthetic */ void f(zzfk zzfkVar, int i) {
        zzfkVar.zze |= 1;
        zzfkVar.zzf = i;
    }

    public static /* synthetic */ void g(zzfk zzfkVar, zzgd zzgdVar) {
        zzgdVar.getClass();
        zzfkVar.zzg = zzgdVar;
        zzfkVar.zze |= 2;
    }

    public static /* synthetic */ void h(zzfk zzfkVar, zzgd zzgdVar) {
        zzfkVar.zzh = zzgdVar;
        zzfkVar.zze |= 4;
    }

    public static /* synthetic */ void i(zzfk zzfkVar, boolean z) {
        zzfkVar.zze |= 8;
        zzfkVar.zzi = z;
    }

    public static zzfj zzb() {
        return zza.zzbu();
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzgd zzd() {
        zzgd zzgdVar = this.zzg;
        return zzgdVar == null ? zzgd.zzh() : zzgdVar;
    }

    public final zzgd zze() {
        zzgd zzgdVar = this.zzh;
        return zzgdVar == null ? zzgd.zzh() : zzgdVar;
    }

    public final boolean zzj() {
        return this.zzi;
    }

    public final boolean zzk() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzjx.zzbF(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzfk();
        }
        i1 i1Var = null;
        if (i2 == 4) {
            return new zzfj(i1Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final boolean zzm() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzn() {
        return (this.zze & 4) != 0;
    }
}
