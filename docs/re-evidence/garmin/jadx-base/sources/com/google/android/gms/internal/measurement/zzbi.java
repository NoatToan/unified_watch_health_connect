package com.google.android.gms.internal.measurement;

import am.j;
import fb1.c;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class zzbi extends zzav {
    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao zza(String str, zzg zzgVar, List list) {
        if (str == null || str.isEmpty() || !zzgVar.zzd(str)) {
            h.s(c.n("Command not found: ", str));
            return null;
        }
        zzao zzaoVarZzh = zzgVar.zzh(str);
        if (zzaoVarZzh instanceof zzai) {
            return ((zzai) zzaoVarZzh).zza(zzgVar, list);
        }
        h.s(j.m("Function ", str, " is not defined"));
        return null;
    }
}
