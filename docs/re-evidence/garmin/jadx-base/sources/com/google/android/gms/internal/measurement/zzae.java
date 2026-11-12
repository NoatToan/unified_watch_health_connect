package com.google.android.gms.internal.measurement;

import com.google.common.annotations.VisibleForTesting;
import j20.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class zzae implements Iterable, zzao, zzak {

    @VisibleForTesting
    final SortedMap zza;

    @VisibleForTesting
    final Map zzb;

    public zzae(List list) {
        this();
        if (list != null) {
            for (int i14 = 0; i14 < list.size(); i14++) {
                zzn(i14, (zzao) list.get(i14));
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzae)) {
            return false;
        }
        zzae zzaeVar = (zzae) obj;
        if (zzh() != zzaeVar.zzh()) {
            return false;
        }
        SortedMap sortedMap = this.zza;
        if (sortedMap.isEmpty()) {
            return zzaeVar.zza.isEmpty();
        }
        for (int iIntValue = ((Integer) sortedMap.firstKey()).intValue(); iIntValue <= ((Integer) sortedMap.lastKey()).intValue(); iIntValue++) {
            if (!zzl(iIntValue).equals(zzaeVar.zzl(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzad(this);
    }

    public final String toString() {
        return zzs(",");
    }

    public final List zzb() {
        ArrayList arrayList = new ArrayList(zzh());
        for (int i14 = 0; i14 < zzh(); i14++) {
            arrayList.add(zzl(i14));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return zzs(",");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzcA(String str, zzg zzgVar, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? zzba.zza(str, this, zzgVar, list) : zzak.zzu(this, new zzas(str), zzgVar, list);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        SortedMap sortedMap = this.zza;
        if (sortedMap.size() == 1) {
            return zzl(0).zzd();
        }
        return sortedMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return new zzac(this, this.zza.keySet().iterator(), this.zzb.keySet().iterator());
    }

    public final Iterator zzg() {
        return this.zza.keySet().iterator();
    }

    public final int zzh() {
        SortedMap sortedMap = this.zza;
        if (sortedMap.isEmpty()) {
            return 0;
        }
        return ((Integer) sortedMap.lastKey()).intValue() + 1;
    }

    public final int zzi() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final boolean zzj(String str) {
        return "length".equals(str) || this.zzb.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final zzao zzk(String str) {
        zzao zzaoVar;
        if ("length".equals(str)) {
            return new zzah(Double.valueOf(zzh()));
        }
        return (!zzj(str) || (zzaoVar = (zzao) this.zzb.get(str)) == null) ? zzao.zzf : zzaoVar;
    }

    public final zzao zzl(int i14) {
        zzao zzaoVar;
        if (i14 < zzh()) {
            return (!zzo(i14) || (zzaoVar = (zzao) this.zza.get(Integer.valueOf(i14))) == null) ? zzao.zzf : zzaoVar;
        }
        e.v("Attempting to get element outside of current array");
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final void zzm(String str, zzao zzaoVar) {
        Map map = this.zzb;
        if (zzaoVar == null) {
            map.remove(str);
        } else {
            map.put(str, zzaoVar);
        }
    }

    public final void zzn(int i14, zzao zzaoVar) {
        if (i14 > 32468) {
            h.z("Array too large");
            return;
        }
        if (i14 < 0) {
            e.v(x.e(new StringBuilder(String.valueOf(i14).length() + 21), i14, "Out of bounds index: "));
            return;
        }
        SortedMap sortedMap = this.zza;
        if (zzaoVar == null) {
            sortedMap.remove(Integer.valueOf(i14));
        } else {
            sortedMap.put(Integer.valueOf(i14), zzaoVar);
        }
    }

    public final boolean zzo(int i14) {
        if (i14 >= 0) {
            SortedMap sortedMap = this.zza;
            if (i14 <= ((Integer) sortedMap.lastKey()).intValue()) {
                return sortedMap.containsKey(Integer.valueOf(i14));
            }
        }
        e.v(x.e(new StringBuilder(String.valueOf(i14).length() + 21), i14, "Out of bounds index: "));
        return false;
    }

    public final void zzp() {
        this.zza.clear();
    }

    public final void zzq(int i14, zzao zzaoVar) {
        if (i14 < 0) {
            h.s(x.e(new StringBuilder(String.valueOf(i14).length() + 21), i14, "Invalid value index: "));
            return;
        }
        if (i14 >= zzh()) {
            zzn(i14, zzaoVar);
            return;
        }
        SortedMap sortedMap = this.zza;
        for (int iIntValue = ((Integer) sortedMap.lastKey()).intValue(); iIntValue >= i14; iIntValue--) {
            Integer numValueOf = Integer.valueOf(iIntValue);
            zzao zzaoVar2 = (zzao) sortedMap.get(numValueOf);
            if (zzaoVar2 != null) {
                zzn(iIntValue + 1, zzaoVar2);
                sortedMap.remove(numValueOf);
            }
        }
        zzn(i14, zzaoVar);
    }

    public final void zzr(int i14) {
        SortedMap sortedMap = this.zza;
        int iIntValue = ((Integer) sortedMap.lastKey()).intValue();
        if (i14 > iIntValue || i14 < 0) {
            return;
        }
        sortedMap.remove(Integer.valueOf(i14));
        if (i14 == iIntValue) {
            int i15 = i14 - 1;
            Integer numValueOf = Integer.valueOf(i15);
            if (sortedMap.containsKey(numValueOf) || i15 < 0) {
                return;
            }
            sortedMap.put(numValueOf, zzao.zzf);
            return;
        }
        while (true) {
            i14++;
            if (i14 > ((Integer) sortedMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i14);
            zzao zzaoVar = (zzao) sortedMap.get(numValueOf2);
            if (zzaoVar != null) {
                sortedMap.put(Integer.valueOf(i14 - 1), zzaoVar);
                sortedMap.remove(numValueOf2);
            }
        }
    }

    public final String zzs(String str) {
        String str2;
        StringBuilder sb3 = new StringBuilder();
        if (!this.zza.isEmpty()) {
            int i14 = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i14 >= zzh()) {
                    break;
                }
                zzao zzaoVarZzl = zzl(i14);
                sb3.append(str2);
                if (!(zzaoVarZzl instanceof zzat) && !(zzaoVarZzl instanceof zzam)) {
                    sb3.append(zzaoVarZzl.zzc());
                }
                i14++;
            }
            sb3.delete(0, str2.length());
        }
        return sb3.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        zzae zzaeVar = new zzae();
        for (Map.Entry entry : this.zza.entrySet()) {
            boolean z14 = entry.getValue() instanceof zzak;
            SortedMap sortedMap = zzaeVar.zza;
            if (z14) {
                sortedMap.put((Integer) entry.getKey(), (zzao) entry.getValue());
            } else {
                sortedMap.put((Integer) entry.getKey(), ((zzao) entry.getValue()).zzt());
            }
        }
        return zzaeVar;
    }

    public zzae() {
        this.zza = new TreeMap();
        this.zzb = new TreeMap();
    }
}
