package com.google.android.gms.internal.measurement;

import com.huami.sleep.sleephome.vo.ShowActionItemInfo;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzz {
    public final TreeMap<Integer, zzao> a = new TreeMap<>();
    public final TreeMap<Integer, zzao> b = new TreeMap<>();

    private static final int a(zzg zzgVar, zzao zzaoVar, zzap zzapVar) {
        zzap zzapVarZza = zzaoVar.zza(zzgVar, Collections.singletonList(zzapVar));
        if (zzapVarZza instanceof zzah) {
            return zzh.zzb(zzapVarZza.zzh().doubleValue());
        }
        return -1;
    }

    public final void zza(String str, int i, zzao zzaoVar, String str2) {
        TreeMap<Integer, zzao> treeMap;
        if ("create".equals(str2)) {
            treeMap = this.b;
        } else {
            if (!ShowActionItemInfo.EDIT.equals(str2)) {
                String strValueOf = String.valueOf(str2);
                throw new IllegalStateException(strValueOf.length() != 0 ? "Unknown callback type: ".concat(strValueOf) : new String("Unknown callback type: "));
            }
            treeMap = this.a;
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = treeMap.lastKey().intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), zzaoVar);
    }

    public final void zzb(zzg zzgVar, zzab zzabVar) {
        zzl zzlVar = new zzl(zzabVar);
        for (Integer num : this.a.keySet()) {
            zzaa zzaaVarClone = zzabVar.zzb().clone();
            int iA = a(zzgVar, this.a.get(num), zzlVar);
            if (iA == 2 || iA == -1) {
                zzabVar.zzf(zzaaVarClone);
            }
        }
        Iterator<Integer> it2 = this.b.keySet().iterator();
        while (it2.hasNext()) {
            a(zzgVar, this.b.get(it2.next()), zzlVar);
        }
    }
}
