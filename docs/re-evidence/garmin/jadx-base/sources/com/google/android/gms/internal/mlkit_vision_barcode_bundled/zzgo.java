package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.protobuf.a;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes14.dex */
class zzgo extends AbstractMap {
    private Object[] zza;
    private int zzb;
    private Map zzc;
    private boolean zzd;
    private volatile zzgm zze;
    private Map zzf;

    private zzgo() {
        Map map = Collections.EMPTY_MAP;
        this.zzc = map;
        this.zzf = map;
    }

    private final int zzl(Comparable comparable) {
        int i14 = this.zzb;
        int i15 = i14 - 1;
        int i16 = 0;
        if (i15 >= 0) {
            int iCompareTo = comparable.compareTo(((zzgi) this.zza[i15]).zza());
            if (iCompareTo > 0) {
                return -(i14 + 1);
            }
            if (iCompareTo == 0) {
                return i15;
            }
        }
        while (i16 <= i15) {
            int i17 = (i16 + i15) / 2;
            int iCompareTo2 = comparable.compareTo(((zzgi) this.zza[i17]).zza());
            if (iCompareTo2 < 0) {
                i15 = i17 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i17;
                }
                i16 = i17 + 1;
            }
        }
        return -(i16 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzm(int i14) {
        zzo();
        Object value = ((zzgi) this.zza[i14]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i14 + 1, objArr, i14, (this.zzb - i14) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator it = zzn().entrySet().iterator();
            Object[] objArr2 = this.zza;
            int i15 = this.zzb;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i15] = new zzgi(this, (Comparable) entry.getKey(), entry.getValue());
            this.zzb++;
            it.remove();
        }
        return value;
    }

    private final SortedMap zzn() {
        zzo();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzo() {
        if (this.zzd) {
            a.m();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzo();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zzl(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.zze == null) {
            this.zze = new zzgm(this, null);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgo)) {
            return super.equals(obj);
        }
        zzgo zzgoVar = (zzgo) obj;
        int size = size();
        if (size != zzgoVar.size()) {
            return false;
        }
        int i14 = this.zzb;
        if (i14 != zzgoVar.zzb) {
            return entrySet().equals(zzgoVar.entrySet());
        }
        for (int i15 = 0; i15 < i14; i15++) {
            if (!zzg(i15).equals(zzgoVar.zzg(i15))) {
                return false;
            }
        }
        if (i14 != size) {
            return this.zzc.equals(zzgoVar.zzc);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iZzl = zzl(comparable);
        return iZzl >= 0 ? ((zzgi) this.zza[iZzl]).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i14 = this.zzb;
        int iHashCode = 0;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode += this.zza[i15].hashCode();
        }
        return this.zzc.size() > 0 ? this.zzc.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzo();
        Comparable comparable = (Comparable) obj;
        int iZzl = zzl(comparable);
        if (iZzl >= 0) {
            return zzm(iZzl);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzc.size() + this.zzb;
    }

    public void zza() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final Iterable zzd() {
        return this.zzc.isEmpty() ? Collections.EMPTY_SET : this.zzc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        zzo();
        int iZzl = zzl(comparable);
        if (iZzl >= 0) {
            return ((zzgi) this.zza[iZzl]).setValue(obj);
        }
        zzo();
        if (this.zza == null) {
            this.zza = new Object[16];
        }
        int i14 = -(iZzl + 1);
        if (i14 >= 16) {
            return zzn().put(comparable, obj);
        }
        if (this.zzb == 16) {
            zzgi zzgiVar = (zzgi) this.zza[15];
            this.zzb = 15;
            zzn().put(zzgiVar.zza(), zzgiVar.getValue());
        }
        Object[] objArr = this.zza;
        int length = objArr.length;
        System.arraycopy(objArr, i14, objArr, i14 + 1, 15 - i14);
        this.zza[i14] = new zzgi(this, comparable, obj);
        this.zzb++;
        return null;
    }

    public final Map.Entry zzg(int i14) {
        if (i14 < this.zzb) {
            return (zzgi) this.zza[i14];
        }
        throw new ArrayIndexOutOfBoundsException(i14);
    }

    public final boolean zzj() {
        return this.zzd;
    }

    public /* synthetic */ zzgo(zzgn zzgnVar) {
        Map map = Collections.EMPTY_MAP;
        this.zzc = map;
        this.zzf = map;
    }
}
