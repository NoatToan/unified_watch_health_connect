package com.google.android.gms.internal.mlkit_common;

import android.content.Context;

/* JADX INFO: loaded from: classes14.dex */
public final class zzh {
    public static final zzh zza;
    private final boolean zzb;
    private final boolean zzc = false;
    private final zzaf zzd;

    static {
        zze zzeVar = null;
        zzf zzfVar = new zzf(zzeVar);
        zzfVar.zzb();
        zza = zzfVar.zzd();
        zzf zzfVar2 = new zzf(zzeVar);
        zzfVar2.zzb();
        zzfVar2.zza(new zzd());
        zzfVar2.zzd();
        zzf zzfVar3 = new zzf(zzeVar);
        zzfVar3.zzc();
        zzfVar3.zzd();
    }

    public /* synthetic */ zzh(boolean z14, boolean z15, zzaf zzafVar, zzg zzgVar) {
        this.zzb = z14;
        this.zzd = zzafVar;
    }

    public static /* bridge */ /* synthetic */ boolean zza(zzh zzhVar) {
        boolean z14 = zzhVar.zzc;
        return false;
    }

    public static /* bridge */ /* synthetic */ int zzc(zzh zzhVar, Context context, zzj zzjVar) {
        zzaf zzafVar = zzhVar.zzd;
        int size = zzafVar.size();
        int i14 = 0;
        while (i14 < size) {
            int iZza = ((zzk) zzafVar.get(i14)).zza(context, zzjVar, zzhVar.zzb) - 1;
            i14++;
            if (iZza == 1) {
                return 2;
            }
        }
        return 3;
    }
}
