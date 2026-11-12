package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzaf extends zzab implements List, RandomAccess {
    private static final zzat zza = new zzad(zzal.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    public static zzaf zzg(Object[] objArr, int i14) {
        return i14 == 0 ? zzal.zza : new zzal(objArr, i14);
    }

    public static zzaf zzh(Object obj) {
        Object[] objArr = {obj};
        zzak.zza(objArr, 1);
        return zzg(objArr, 1);
    }

    public static zzaf zzi(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9};
        zzak.zza(objArr, 9);
        return zzg(objArr, 9);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i14, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i14, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i14 = 0; i14 < size; i14++) {
                if (!zzs.zza(get(i14), list.get(i14))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it3 = list.iterator();
        while (it.hasNext()) {
            if (!it3.hasNext() || !zzs.zza(it.next(), it3.next())) {
                return false;
            }
        }
        return !it3.hasNext();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i14 = 0; i14 < size; i14++) {
            iHashCode = (iHashCode * 31) + get(i14).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i14 = 0; i14 < size; i14++) {
            if (obj.equals(get(i14))) {
                return i14;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i14) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i14, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public int zza(Object[] objArr, int i14) {
        int size = size();
        for (int i15 = 0; i15 < size; i15++) {
            objArr[i15] = get(i15);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    /* JADX INFO: renamed from: zzd */
    public final zzas iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzf */
    public zzaf subList(int i14, int i15) {
        zzt.zzd(i14, i15, size());
        int i16 = i15 - i14;
        if (i16 == size()) {
            return this;
        }
        return i16 == 0 ? zzal.zza : new zzae(this, i14, i16);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final zzat listIterator(int i14) {
        zzt.zzb(i14, size(), FirebaseAnalytics.Param.INDEX);
        return isEmpty() ? zza : new zzad(this, i14);
    }
}
