package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgb extends zzjx<zzgb, zzfz> implements zzld {
    private static final zzgb zza;
    private int zze;
    private int zzf = 1;
    private zzke<zzfq> zzg = zzjx.zzbA();

    static {
        zzgb zzgbVar = new zzgb();
        zza = zzgbVar;
        zzjx.zzbG(zzgb.class, zzgbVar);
    }

    private zzgb() {
    }

    public static /* synthetic */ void f(zzgb zzgbVar, zzfq zzfqVar) {
        zzfqVar.getClass();
        zzke<zzfq> zzkeVar = zzgbVar.zzg;
        if (!zzkeVar.zzc()) {
            zzgbVar.zzg = zzjx.zzbB(zzkeVar);
        }
        zzgbVar.zzg.add(zzfqVar);
    }

    public static zzfz zza() {
        return zza.zzbu();
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzjx.zzbF(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", k1.a, "zzg", zzfq.class});
        }
        if (i2 == 3) {
            return new zzgb();
        }
        i1 i1Var = null;
        if (i2 == 4) {
            return new zzfz(i1Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}
