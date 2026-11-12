package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
final class f implements Comparator<zzap> {
    public final /* synthetic */ zzai a;
    public final /* synthetic */ zzg b;

    public f(zzai zzaiVar, zzg zzgVar) {
        this.a = zzaiVar;
        this.b = zzgVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzap zzapVar, zzap zzapVar2) {
        zzap zzapVar3 = zzapVar;
        zzap zzapVar4 = zzapVar2;
        zzai zzaiVar = this.a;
        zzg zzgVar = this.b;
        if (zzapVar3 instanceof zzau) {
            return !(zzapVar4 instanceof zzau) ? 1 : 0;
        }
        if (zzapVar4 instanceof zzau) {
            return -1;
        }
        return zzaiVar == null ? zzapVar3.zzi().compareTo(zzapVar4.zzi()) : (int) zzh.zza(zzaiVar.zza(zzgVar, Arrays.asList(zzapVar3, zzapVar4)).zzh().doubleValue());
    }
}
