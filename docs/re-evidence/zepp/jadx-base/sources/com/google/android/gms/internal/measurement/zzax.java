package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzax {
    public final Map<String, zzaw> a = new HashMap();
    public final zzbj b = new zzbj();

    public zzax() {
        a(new zzav());
        a(new zzay());
        a(new zzaz());
        a(new zzbc());
        a(new zzbh());
        a(new zzbi());
        a(new zzbk());
    }

    public final void a(zzaw zzawVar) {
        Iterator<zzbl> it2 = zzawVar.a.iterator();
        while (it2.hasNext()) {
            this.a.put(it2.next().zzb().toString(), zzawVar);
        }
    }

    public final zzap zza(zzg zzgVar, zzap zzapVar) {
        zzh.zzc(zzgVar);
        if (!(zzapVar instanceof zzaq)) {
            return zzapVar;
        }
        zzaq zzaqVar = (zzaq) zzapVar;
        ArrayList<zzap> arrayListZzc = zzaqVar.zzc();
        String strZzb = zzaqVar.zzb();
        return (this.a.containsKey(strZzb) ? this.a.get(strZzb) : this.b).zza(strZzb, zzgVar, arrayListZzc);
    }
}
