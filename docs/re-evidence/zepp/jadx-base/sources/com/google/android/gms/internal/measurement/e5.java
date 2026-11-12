package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class e5 extends zzai {
    public final boolean a;
    public final boolean b;
    public final /* synthetic */ zzt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(zzt zztVar, boolean z, boolean z2) {
        super("log");
        this.c = zztVar;
        this.a = z;
        this.b = z2;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List<zzap> list) {
        int i;
        zzh.zzi("log", 1, list);
        if (list.size() == 1) {
            this.c.a.zza(3, zzgVar.zzb(list.get(0)).zzi(), Collections.emptyList(), this.a, this.b);
            return zzap.zzf;
        }
        int iZzb = zzh.zzb(zzgVar.zzb(list.get(0)).zzh().doubleValue());
        if (iZzb == 2) {
            i = 4;
        } else if (iZzb == 3) {
            i = 1;
        } else if (iZzb != 5) {
            i = iZzb != 6 ? 3 : 2;
        } else {
            i = 5;
        }
        String strZzi = zzgVar.zzb(list.get(1)).zzi();
        if (list.size() == 2) {
            this.c.a.zza(i, strZzi, Collections.emptyList(), this.a, this.b);
            return zzap.zzf;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 2; i2 < Math.min(list.size(), 5); i2++) {
            arrayList.add(zzgVar.zzb(list.get(i2)).zzi());
        }
        this.c.a.zza(i, strZzi, arrayList, this.a, this.b);
        return zzap.zzf;
    }
}
