package com.google.android.gms.internal.maps;

import am.j;
import com.google.android.gms.maps.model.FeatureType;
import j20.x;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzbo extends zzbh implements Set {
    private transient zzbk zza;

    public static int zzf(int i14) {
        int iMax = Math.max(i14, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
            return iHighestOneBit;
        }
        if (iMax < 1073741824) {
            return 1073741824;
        }
        h.s("collection too large");
        return 0;
    }

    @SafeVarargs
    public static zzbo zzi(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[7];
        objArr2[0] = FeatureType.ADMINISTRATIVE_AREA_LEVEL_1;
        objArr2[1] = FeatureType.ADMINISTRATIVE_AREA_LEVEL_2;
        objArr2[2] = FeatureType.COUNTRY;
        objArr2[3] = FeatureType.LOCALITY;
        objArr2[4] = FeatureType.POSTAL_CODE;
        objArr2[5] = FeatureType.SCHOOL_DISTRICT;
        System.arraycopy(objArr, 0, objArr2, 6, 1);
        return zzk(7, objArr2);
    }

    private static zzbo zzk(int i14, Object... objArr) {
        if (i14 == 0) {
            return zzbw.zza;
        }
        if (i14 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzby(obj);
        }
        int iZzf = zzf(i14);
        Object[] objArr2 = new Object[iZzf];
        int i15 = iZzf - 1;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < i14; i18++) {
            Object obj2 = objArr[i18];
            if (obj2 == null) {
                x.l(j.h(i18, "at index "));
                return null;
            }
            int iHashCode = obj2.hashCode();
            int iZza = zzbg.zza(iHashCode);
            while (true) {
                int i19 = iZza & i15;
                Object obj3 = objArr2[i19];
                if (obj3 == null) {
                    objArr[i17] = obj2;
                    objArr2[i19] = obj2;
                    i16 += iHashCode;
                    i17++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iZza++;
            }
        }
        Arrays.fill(objArr, i17, i14, (Object) null);
        if (i17 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzby(obj4);
        }
        if (zzf(i17) < iZzf / 2) {
            return zzk(i17, objArr);
        }
        if (i17 < 4) {
            objArr = Arrays.copyOf(objArr, i17);
        }
        return new zzbw(objArr, i16, objArr2, i15, i17);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzbo) && zzj() && ((zzbo) obj).zzj() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzbx.zza(this);
    }

    @Override // com.google.android.gms.internal.maps.zzbh, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzbz iterator();

    public final zzbk zzg() {
        zzbk zzbkVar = this.zza;
        if (zzbkVar != null) {
            return zzbkVar;
        }
        zzbk zzbkVarZzh = zzh();
        this.zza = zzbkVarZzh;
        return zzbkVarZzh;
    }

    public zzbk zzh() {
        Object[] array = toArray();
        int i14 = zzbk.zzd;
        return zzbk.zzg(array, array.length);
    }

    public boolean zzj() {
        return false;
    }
}
