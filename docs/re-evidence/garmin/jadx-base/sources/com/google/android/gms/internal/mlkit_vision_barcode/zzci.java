package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
final class zzci extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    public zzci(int i14) {
        zzp(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzA() {
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzC() {
        Object[] objArr = this.zzc;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public static /* synthetic */ Object zzg(zzci zzciVar, int i14) {
        return zzciVar.zzB()[i14];
    }

    public static /* synthetic */ Object zzi(zzci zzciVar) {
        Object obj = zzciVar.zze;
        Objects.requireNonNull(obj);
        return obj;
    }

    public static /* synthetic */ Object zzj(zzci zzciVar, int i14) {
        return zzciVar.zzC()[i14];
    }

    public static /* synthetic */ void zzn(zzci zzciVar, int i14, Object obj) {
        zzciVar.zzC()[i14] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzw(Object obj) {
        if (zzr()) {
            return -1;
        }
        int iZza = zzck.zza(obj);
        int iZzv = zzv();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int iZzc = zzcj.zzc(obj2, iZza & iZzv);
        if (iZzc != 0) {
            int i14 = ~iZzv;
            int i15 = iZza & i14;
            do {
                int i16 = iZzc - 1;
                int i17 = zzA()[i16];
                if ((i17 & i14) == i15 && zzax.zza(obj, zzB()[i16])) {
                    return i16;
                }
                iZzc = i17 & iZzv;
            } while (iZzc != 0);
        }
        return -1;
    }

    private final int zzx(int i14, int i15, int i16, int i17) {
        int i18 = i15 - 1;
        Object objZzd = zzcj.zzd(i15);
        if (i17 != 0) {
            zzcj.zze(objZzd, i16 & i18, i17 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzA = zzA();
        for (int i19 = 0; i19 <= i14; i19++) {
            int iZzc = zzcj.zzc(obj, i19);
            while (iZzc != 0) {
                int i24 = iZzc - 1;
                int i25 = iArrZzA[i24];
                int i26 = ((~i14) & i25) | i19;
                int i27 = i26 & i18;
                int iZzc2 = zzcj.zzc(objZzd, i27);
                zzcj.zze(objZzd, i27, iZzc);
                iArrZzA[i24] = ((~i18) & i26) | (iZzc2 & i18);
                iZzc = i25 & i14;
            }
        }
        this.zze = objZzd;
        zzz(i18);
        return i18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzy(Object obj) {
        if (!zzr()) {
            int iZzv = zzv();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int iZzb = zzcj.zzb(obj, null, iZzv, obj2, zzA(), zzB(), null);
            if (iZzb != -1) {
                Object obj3 = zzC()[iZzb];
                zzq(iZzb, iZzv);
                this.zzg--;
                zzo();
                return obj3;
            }
        }
        return zzd;
    }

    private final void zzz(int i14) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i14)) & 31) | (this.zzf & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzr()) {
            return;
        }
        zzo();
        Map mapZzl = zzl();
        if (mapZzl != null) {
            this.zzf = zzdw.zza(size(), 3, 1073741823);
            mapZzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Arrays.fill(zzC(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzA(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsKey(obj);
        }
        return zzw(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsValue(obj);
        }
        for (int i14 = 0; i14 < this.zzg; i14++) {
            if (zzax.zza(obj, zzC()[i14])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        zzcc zzccVar = new zzcc(this);
        this.zzi = zzccVar;
        return zzccVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.get(obj);
        }
        int iZzw = zzw(obj);
        if (iZzw == -1) {
            return null;
        }
        return zzC()[iZzw];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        zzcf zzcfVar = new zzcf(this);
        this.zzh = zzcfVar;
        return zzcfVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i14;
        if (zzr()) {
            zzaz.zzf(zzr(), "Arrays already allocated");
            int i15 = this.zzf;
            int iMax = Math.max(i15 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.zze = zzcj.zzd(iMax2);
            zzz(iMax2 - 1);
            this.zza = new int[i15];
            this.zzb = new Object[i15];
            this.zzc = new Object[i15];
        }
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.put(obj, obj2);
        }
        int[] iArrZzA = zzA();
        Object[] objArrZzB = zzB();
        Object[] objArrZzC = zzC();
        int i16 = this.zzg;
        int i17 = i16 + 1;
        int iZza = zzck.zza(obj);
        int iZzv = zzv();
        int i18 = iZza & iZzv;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int iZzc = zzcj.zzc(obj3, i18);
        if (iZzc == 0) {
            if (i17 > iZzv) {
                iZzv = zzx(iZzv, zzcj.zza(iZzv), iZza, i16);
            } else {
                Object obj4 = this.zze;
                Objects.requireNonNull(obj4);
                zzcj.zze(obj4, i18, i17);
            }
            i14 = 1;
        } else {
            int i19 = ~iZzv;
            int i24 = iZza & i19;
            int i25 = 0;
            while (true) {
                int i26 = iZzc - 1;
                int i27 = iArrZzA[i26];
                i14 = 1;
                int i28 = i27 & i19;
                if (i28 == i24 && zzax.zza(obj, objArrZzB[i26])) {
                    Object obj5 = objArrZzC[i26];
                    objArrZzC[i26] = obj2;
                    return obj5;
                }
                int i29 = i27 & iZzv;
                i25++;
                if (i29 == 0) {
                    if (i25 < 9) {
                        if (i17 <= iZzv) {
                            iArrZzA[i26] = (i17 & iZzv) | i28;
                            break;
                        }
                        iZzv = zzx(iZzv, zzcj.zza(iZzv), iZza, i16);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(zzv() + 1, 1.0f);
                    int iZze = zze();
                    while (iZze >= 0) {
                        linkedHashMap.put(zzB()[iZze], zzC()[iZze]);
                        iZze = zzf(iZze);
                    }
                    this.zze = linkedHashMap;
                    this.zza = null;
                    this.zzb = null;
                    this.zzc = null;
                    zzo();
                    return linkedHashMap.put(obj, obj2);
                }
                iZzc = i29;
            }
        }
        int length = zzA().length;
        if (i17 > length) {
            int i30 = i14;
            int iMin = Math.min(1073741823, (Math.max(i30, length >>> 1) + length) | i30);
            if (iMin != length) {
                this.zza = Arrays.copyOf(zzA(), iMin);
                this.zzb = Arrays.copyOf(zzB(), iMin);
                this.zzc = Arrays.copyOf(zzC(), iMin);
            }
        }
        zzA()[i16] = (~iZzv) & iZza;
        zzB()[i16] = obj;
        zzC()[i16] = obj2;
        this.zzg = i17;
        zzo();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.remove(obj);
        }
        Object objZzy = zzy(obj);
        if (objZzy == zzd) {
            return null;
        }
        return objZzy;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapZzl = zzl();
        return mapZzl != null ? mapZzl.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzch zzchVar = new zzch(this);
        this.zzj = zzchVar;
        return zzchVar;
    }

    public final int zze() {
        return isEmpty() ? -1 : 0;
    }

    public final int zzf(int i14) {
        int i15 = i14 + 1;
        if (i15 < this.zzg) {
            return i15;
        }
        return -1;
    }

    public final Map zzl() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void zzo() {
        this.zzf += 32;
    }

    public final void zzp(int i14) {
        this.zzf = zzdw.zza(i14, 1, 1073741823);
    }

    public final void zzq(int i14, int i15) {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzA = zzA();
        Object[] objArrZzB = zzB();
        Object[] objArrZzC = zzC();
        int size = size();
        int i16 = size - 1;
        if (i14 >= i16) {
            objArrZzB[i14] = null;
            objArrZzC[i14] = null;
            iArrZzA[i14] = 0;
            return;
        }
        int i17 = i14 + 1;
        Object obj2 = objArrZzB[i16];
        objArrZzB[i14] = obj2;
        objArrZzC[i14] = objArrZzC[i16];
        objArrZzB[i16] = null;
        objArrZzC[i16] = null;
        iArrZzA[i14] = iArrZzA[i16];
        iArrZzA[i16] = 0;
        int iZza = zzck.zza(obj2) & i15;
        int iZzc = zzcj.zzc(obj, iZza);
        if (iZzc == size) {
            zzcj.zze(obj, iZza, i17);
            return;
        }
        while (true) {
            int i18 = iZzc - 1;
            int i19 = iArrZzA[i18];
            int i24 = i19 & i15;
            if (i24 == size) {
                iArrZzA[i18] = (i19 & (~i15)) | (i15 & i17);
                return;
            }
            iZzc = i24;
        }
    }

    public final boolean zzr() {
        return this.zze == null;
    }

    public zzci() {
        zzp(3);
    }
}
