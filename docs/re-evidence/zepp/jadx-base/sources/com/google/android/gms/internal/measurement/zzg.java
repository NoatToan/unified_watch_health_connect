package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzg {
    public final zzax a;
    public final Map<String, zzap> b = new HashMap();
    public final Map<String, Boolean> c = new HashMap();
    public final zzg zza;

    public zzg(zzg zzgVar, zzax zzaxVar) {
        this.zza = zzgVar;
        this.a = zzaxVar;
    }

    public final zzg zza() {
        return new zzg(this, this.a);
    }

    public final zzap zzb(zzap zzapVar) {
        return this.a.zza(this, zzapVar);
    }

    public final zzap zzc(zzae zzaeVar) {
        zzap zzapVarZza = zzap.zzf;
        Iterator<Integer> itZzk = zzaeVar.zzk();
        while (itZzk.hasNext()) {
            zzapVarZza = this.a.zza(this, zzaeVar.zze(itZzk.next().intValue()));
            if (zzapVarZza instanceof zzag) {
                break;
            }
        }
        return zzapVarZza;
    }

    public final zzap zzd(String str) {
        if (this.b.containsKey(str)) {
            return this.b.get(str);
        }
        zzg zzgVar = this.zza;
        if (zzgVar != null) {
            return zzgVar.zzd(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    public final void zze(String str, zzap zzapVar) {
        if (this.c.containsKey(str)) {
            return;
        }
        if (zzapVar == null) {
            this.b.remove(str);
        } else {
            this.b.put(str, zzapVar);
        }
    }

    public final void zzf(String str, zzap zzapVar) {
        zze(str, zzapVar);
        this.c.put(str, Boolean.TRUE);
    }

    public final void zzg(String str, zzap zzapVar) {
        zzg zzgVar;
        if (!this.b.containsKey(str) && (zzgVar = this.zza) != null && zzgVar.zzh(str)) {
            this.zza.zzg(str, zzapVar);
        } else {
            if (this.c.containsKey(str)) {
                return;
            }
            if (zzapVar == null) {
                this.b.remove(str);
            } else {
                this.b.put(str, zzapVar);
            }
        }
    }

    public final boolean zzh(String str) {
        if (this.b.containsKey(str)) {
            return true;
        }
        zzg zzgVar = this.zza;
        if (zzgVar != null) {
            return zzgVar.zzh(str);
        }
        return false;
    }
}
