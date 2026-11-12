package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzs extends zzai {
    final boolean zza;
    final boolean zzb;
    final /* synthetic */ zzt zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzt zztVar, boolean z14, boolean z15) {
        super("log");
        Objects.requireNonNull(zztVar);
        this.zzc = zztVar;
        this.zza = z14;
        this.zzb = z15;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0080  */
    /* JADX WARN: Code duplicated, block: B:25:0x008f A[LOOP:0: B:23:0x0085->B:25:0x008f, LOOP_END] */
    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao zza(zzg zzgVar, List list) {
        int i14;
        int i15;
        String strZzc;
        ArrayList arrayList;
        zzh.zzb("log", 1, list);
        if (list.size() == 1) {
            zzt zztVar = this.zzc;
            zztVar.zzb().zza(3, zzgVar.zza((zzao) list.get(0)).zzc(), Collections.EMPTY_LIST, this.zza, this.zzb);
            return zzao.zzf;
        }
        int iZzg = zzh.zzg(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue());
        if (iZzg != 2) {
            i14 = 3;
            if (iZzg == 3) {
                i15 = 1;
            } else if (iZzg == 5) {
                i15 = 5;
            } else if (iZzg == 6) {
                i15 = 2;
            }
            strZzc = zzgVar.zza((zzao) list.get(1)).zzc();
            if (list.size() == 2) {
                zzt zztVar2 = this.zzc;
                zztVar2.zzb().zza(i15, strZzc, Collections.EMPTY_LIST, this.zza, this.zzb);
                return zzao.zzf;
            }
            arrayList = new ArrayList();
            for (int i16 = 2; i16 < Math.min(list.size(), 5); i16++) {
                arrayList.add(zzgVar.zza((zzao) list.get(i16)).zzc());
            }
            this.zzc.zzb().zza(i15, strZzc, arrayList, this.zza, this.zzb);
            return zzao.zzf;
        }
        i14 = 4;
        i15 = i14;
        strZzc = zzgVar.zza((zzao) list.get(1)).zzc();
        if (list.size() == 2) {
            zzt zztVar3 = this.zzc;
            zztVar3.zzb().zza(i15, strZzc, Collections.EMPTY_LIST, this.zza, this.zzb);
            return zzao.zzf;
        }
        arrayList = new ArrayList();
        while (i16 < Math.min(list.size(), 5)) {
            arrayList.add(zzgVar.zza((zzao) list.get(i16)).zzc());
        }
        this.zzc.zzb().zza(i15, strZzc, arrayList, this.zza, this.zzb);
        return zzao.zzf;
    }
}
