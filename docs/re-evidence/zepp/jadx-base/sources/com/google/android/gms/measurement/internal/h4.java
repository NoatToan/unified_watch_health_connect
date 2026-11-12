package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzfj;
import com.google.android.gms.internal.measurement.zzfk;
import com.google.android.gms.internal.measurement.zzfl;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzge;
import com.google.android.gms.internal.measurement.zzgf;
import com.google.android.gms.internal.measurement.zzoa;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class h4 {
    private String a;
    private boolean b;
    private zzgd c;
    private BitSet d;
    private BitSet e;
    private Map<Integer, Long> f;
    private Map<Integer, List<Long>> g;
    public final /* synthetic */ m4 h;

    public /* synthetic */ h4(m4 m4Var, String str, zzs zzsVar) {
        this.h = m4Var;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new ArrayMap();
        this.g = new ArrayMap();
    }

    @NonNull
    public final zzfk a(int i) {
        ArrayList arrayList;
        List listEmptyList;
        zzfj zzfjVarZzb = zzfk.zzb();
        zzfjVarZzb.zza(i);
        zzfjVarZzb.zzc(this.b);
        zzgd zzgdVar = this.c;
        if (zzgdVar != null) {
            zzfjVarZzb.zzd(zzgdVar);
        }
        zzgc zzgcVarZzf = zzgd.zzf();
        zzgcVarZzf.zzb(zzku.y(this.d));
        zzgcVarZzf.zzd(zzku.y(this.e));
        Map<Integer, Long> map = this.f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            Iterator<Integer> it2 = this.f.keySet().iterator();
            while (it2.hasNext()) {
                int iIntValue = it2.next().intValue();
                Long l = this.f.get(Integer.valueOf(iIntValue));
                if (l != null) {
                    zzfl zzflVarZzc = com.google.android.gms.internal.measurement.zzfm.zzc();
                    zzflVarZzc.zzb(iIntValue);
                    zzflVarZzc.zza(l.longValue());
                    arrayList2.add(zzflVarZzc.zzaA());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            zzgcVarZzf.zza(arrayList);
        }
        Map<Integer, List<Long>> map2 = this.g;
        if (map2 == null) {
            listEmptyList = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num : this.g.keySet()) {
                zzge zzgeVarZzd = zzgf.zzd();
                zzgeVarZzd.zzb(num.intValue());
                List<Long> list = this.g.get(num);
                if (list != null) {
                    Collections.sort(list);
                    zzgeVarZzd.zza(list);
                }
                arrayList3.add((zzgf) zzgeVarZzd.zzaA());
            }
            listEmptyList = arrayList3;
        }
        zzgcVarZzf.zzc(listEmptyList);
        zzfjVarZzb.zzb(zzgcVarZzf);
        return (zzfk) zzfjVarZzb.zzaA();
    }

    public final void c(@NonNull k4 k4Var) {
        int iA = k4Var.a();
        Boolean bool = k4Var.c;
        if (bool != null) {
            this.e.set(iA, bool.booleanValue());
        }
        Boolean bool2 = k4Var.d;
        if (bool2 != null) {
            this.d.set(iA, bool2.booleanValue());
        }
        if (k4Var.e != null) {
            Map<Integer, Long> map = this.f;
            Integer numValueOf = Integer.valueOf(iA);
            Long l = map.get(numValueOf);
            long jLongValue = k4Var.e.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                this.f.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (k4Var.f != null) {
            Map<Integer, List<Long>> map2 = this.g;
            Integer numValueOf2 = Integer.valueOf(iA);
            List<Long> arrayList = map2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.g.put(numValueOf2, arrayList);
            }
            if (k4Var.c()) {
                arrayList.clear();
            }
            zzoa.zzc();
            zzaf zzafVarZzf = this.h.zzs.zzf();
            String str = this.a;
            zzdx<Boolean> zzdxVar = zzdy.zzY;
            if (zzafVarZzf.zzs(str, zzdxVar) && k4Var.b()) {
                arrayList.clear();
            }
            zzoa.zzc();
            if (!this.h.zzs.zzf().zzs(this.a, zzdxVar)) {
                arrayList.add(Long.valueOf(k4Var.f.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(k4Var.f.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public /* synthetic */ h4(m4 m4Var, String str, zzgd zzgdVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2, zzs zzsVar) {
        this.h = m4Var;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = map;
        this.g = new ArrayMap();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.g.put(num, arrayList);
        }
        this.b = false;
        this.c = zzgdVar;
    }
}
