package com.google.android.gms.internal.measurement;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.huami.message.utils.MessageRecorderEventHelper;
import com.huami.moving.ui.utils.SportAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzae implements Iterable<zzap>, zzap, zzal {
    public final SortedMap<Integer, zzap> a;
    public final Map<String, zzap> b;

    public zzae() {
        this.a = new TreeMap();
        this.b = new TreeMap();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzae)) {
            return false;
        }
        zzae zzaeVar = (zzae) obj;
        if (zzc() != zzaeVar.zzc()) {
            return false;
        }
        if (this.a.isEmpty()) {
            return zzaeVar.a.isEmpty();
        }
        for (int iIntValue = this.a.firstKey().intValue(); iIntValue <= this.a.lastKey().intValue(); iIntValue++) {
            if (!zze(iIntValue).equals(zzaeVar.zze(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator<zzap> iterator() {
        return new b(this);
    }

    public final String toString() {
        return zzj(",");
    }

    public final int zzb() {
        return this.a.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbK(String str, zzg zzgVar, List<zzap> list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || SportAnalytics.ParamValue.MapButtonType.MAP.equals(str) || "pop".equals(str) || MessageRecorderEventHelper.OtherPagerHelper.FROM_PUSH.equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? zzbb.zza(str, this, zzgVar, list) : zzaj.zza(this, new zzat(str), zzgVar, list);
    }

    public final int zzc() {
        if (this.a.isEmpty()) {
            return 0;
        }
        return this.a.lastKey().intValue() + 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        zzae zzaeVar = new zzae();
        for (Map.Entry<Integer, zzap> entry : this.a.entrySet()) {
            if (entry.getValue() instanceof zzal) {
                zzaeVar.a.put(entry.getKey(), entry.getValue());
            } else {
                zzaeVar.a.put(entry.getKey(), entry.getValue().zzd());
            }
        }
        return zzaeVar;
    }

    public final zzap zze(int i) {
        zzap zzapVar;
        if (i < zzc()) {
            return (!zzs(i) || (zzapVar = this.a.get(Integer.valueOf(i))) == null) ? zzap.zzf : zzapVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzap zzf(String str) {
        zzap zzapVar;
        if (SessionDescription.p.equals(str)) {
            return new zzah(Double.valueOf(zzc()));
        }
        return (!zzt(str) || (zzapVar = this.b.get(str)) == null) ? zzap.zzf : zzapVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        if (this.a.size() == 1) {
            return zze(0).zzh();
        }
        return this.a.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return zzj(",");
    }

    public final String zzj(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            for (int i = 0; i < zzc(); i++) {
                zzap zzapVarZze = zze(i);
                sb.append(str);
                if (!(zzapVarZze instanceof zzau) && !(zzapVarZze instanceof zzan)) {
                    sb.append(zzapVarZze.zzi());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final Iterator<Integer> zzk() {
        return this.a.keySet().iterator();
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator<zzap> zzl() {
        return new a(this, this.a.keySet().iterator(), this.b.keySet().iterator());
    }

    public final List<zzap> zzm() {
        ArrayList arrayList = new ArrayList(zzc());
        for (int i = 0; i < zzc(); i++) {
            arrayList.add(zze(i));
        }
        return arrayList;
    }

    public final void zzn() {
        this.a.clear();
    }

    public final void zzo(int i, zzap zzapVar) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid value index: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i >= zzc()) {
            zzq(i, zzapVar);
            return;
        }
        for (int iIntValue = this.a.lastKey().intValue(); iIntValue >= i; iIntValue--) {
            SortedMap<Integer, zzap> sortedMap = this.a;
            Integer numValueOf = Integer.valueOf(iIntValue);
            zzap zzapVar2 = sortedMap.get(numValueOf);
            if (zzapVar2 != null) {
                zzq(iIntValue + 1, zzapVar2);
                this.a.remove(numValueOf);
            }
        }
        zzq(i, zzapVar);
    }

    public final void zzp(int i) {
        int iIntValue = this.a.lastKey().intValue();
        if (i > iIntValue || i < 0) {
            return;
        }
        this.a.remove(Integer.valueOf(i));
        if (i == iIntValue) {
            SortedMap<Integer, zzap> sortedMap = this.a;
            int i2 = i - 1;
            Integer numValueOf = Integer.valueOf(i2);
            if (sortedMap.containsKey(numValueOf) || i2 < 0) {
                return;
            }
            this.a.put(numValueOf, zzap.zzf);
            return;
        }
        while (true) {
            i++;
            if (i > this.a.lastKey().intValue()) {
                return;
            }
            SortedMap<Integer, zzap> sortedMap2 = this.a;
            Integer numValueOf2 = Integer.valueOf(i);
            zzap zzapVar = sortedMap2.get(numValueOf2);
            if (zzapVar != null) {
                this.a.put(Integer.valueOf(i - 1), zzapVar);
                this.a.remove(numValueOf2);
            }
        }
    }

    @RequiresNonNull({MessengerShareContentUtility.ELEMENTS})
    public final void zzq(int i, zzap zzapVar) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Out of bounds index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (zzapVar == null) {
            this.a.remove(Integer.valueOf(i));
        } else {
            this.a.put(Integer.valueOf(i), zzapVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final void zzr(String str, zzap zzapVar) {
        if (zzapVar == null) {
            this.b.remove(str);
        } else {
            this.b.put(str, zzapVar);
        }
    }

    public final boolean zzs(int i) {
        if (i >= 0 && i <= this.a.lastKey().intValue()) {
            return this.a.containsKey(Integer.valueOf(i));
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Out of bounds index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final boolean zzt(String str) {
        return SessionDescription.p.equals(str) || this.b.containsKey(str);
    }

    public zzae(List<zzap> list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                zzq(i, list.get(i));
            }
        }
    }
}
