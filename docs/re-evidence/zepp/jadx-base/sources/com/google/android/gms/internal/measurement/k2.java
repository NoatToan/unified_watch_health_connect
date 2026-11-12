package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
final class k2 implements Comparator<zzix> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzix zzixVar, zzix zzixVar2) {
        zzix zzixVar3 = zzixVar;
        zzix zzixVar4 = zzixVar2;
        j2 j2Var = new j2(zzixVar3);
        j2 j2Var2 = new j2(zzixVar4);
        while (j2Var.hasNext() && j2Var2.hasNext()) {
            int iZza = zzip.zza(j2Var.zza() & 255, j2Var2.zza() & 255);
            if (iZza != 0) {
                return iZza;
            }
        }
        return zzip.zza(zzixVar3.zzd(), zzixVar4.zzd());
    }
}
