package com.google.android.gms.internal.measurement;

import fb1.c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tn.k;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public interface zzak {
    static zzao zzu(zzak zzakVar, zzao zzaoVar, zzg zzgVar, List list) {
        if (zzakVar.zzj(zzaoVar.zzc())) {
            zzao zzaoVarZzk = zzakVar.zzk(zzaoVar.zzc());
            if (zzaoVarZzk instanceof zzai) {
                return ((zzai) zzaoVarZzk).zza(zzgVar, list);
            }
            h.s(k.g(zzaoVar.zzc(), " is not a function"));
            return null;
        }
        if ("hasOwnProperty".equals(zzaoVar.zzc())) {
            zzh.zza("hasOwnProperty", 1, list);
            return zzakVar.zzj(zzgVar.zza((zzao) list.get(0)).zzc()) ? zzao.zzk : zzao.zzl;
        }
        h.s(c.n("Object has no function ", zzaoVar.zzc()));
        return null;
    }

    static Iterator zzv(Map map) {
        return new zzaj(map.keySet().iterator());
    }

    boolean zzj(String str);

    zzao zzk(String str);

    void zzm(String str, zzao zzaoVar);
}
