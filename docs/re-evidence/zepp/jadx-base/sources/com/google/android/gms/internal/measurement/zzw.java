package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzw extends zzai {
    private final zzj a;
    public final Map<String, zzai> b;

    public zzw(zzj zzjVar) {
        super("require");
        this.b = new HashMap();
        this.a = zzjVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List<zzap> list) {
        zzai zzaiVarCall;
        zzh.zzh("require", 1, list);
        String strZzi = zzgVar.zzb(list.get(0)).zzi();
        if (this.b.containsKey(strZzi)) {
            return this.b.get(strZzi);
        }
        zzj zzjVar = this.a;
        if (zzjVar.a.containsKey(strZzi)) {
            try {
                zzaiVarCall = zzjVar.a.get(strZzi).call();
            } catch (Exception unused) {
                String strValueOf = String.valueOf(strZzi);
                throw new IllegalStateException(strValueOf.length() != 0 ? "Failed to create API implementation: ".concat(strValueOf) : new String("Failed to create API implementation: "));
            }
        } else {
            zzaiVarCall = zzap.zzf;
        }
        if (zzaiVarCall instanceof zzai) {
            this.b.put(strZzi, (zzai) zzaiVarCall);
        }
        return zzaiVarCall;
    }
}
