package com.google.android.gms.internal.location;

import com.google.android.exoplayer2.v;
import com.google.firebase.analytics.FirebaseAnalytics;
import j20.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzbx extends zzbu implements List, RandomAccess {
    private static final zzca zza = new zzbv(zzby.zza, 0);

    public static zzbx zzi(Object[] objArr, int i14) {
        return i14 == 0 ? zzby.zza : new zzby(objArr, i14);
    }

    public static zzbx zzj(Collection collection) {
        if (collection instanceof zzbu) {
            zzbx zzbxVarZzd = ((zzbu) collection).zzd();
            if (!zzbxVarZzd.zzf()) {
                return zzbxVarZzd;
            }
            Object[] array = zzbxVarZzd.toArray();
            return zzi(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        for (int i14 = 0; i14 < length; i14++) {
            if (array2[i14] == null) {
                x.l(v.b(20, i14, "at index "));
                return null;
            }
        }
        return zzi(array2, length);
    }

    public static zzbx zzk() {
        return zzby.zza;
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
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
                if (!zzbq.zza(get(i14), list.get(i14))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it3 = list.iterator();
        while (it.hasNext()) {
            if (!it3.hasNext() || !zzbq.zza(it.next(), it3.next())) {
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

    @Override // com.google.android.gms.internal.location.zzbu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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

    @Override // com.google.android.gms.internal.location.zzbu
    public int zza(Object[] objArr, int i14) {
        int size = size();
        for (int i15 = 0; i15 < size; i15++) {
            objArr[i15] = get(i15);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.location.zzbu
    @Deprecated
    public final zzbx zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.location.zzbu
    /* JADX INFO: renamed from: zze */
    public final zzbz iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzbx subList(int i14, int i15) {
        zzbr.zzc(i14, i15, size());
        int i16 = i15 - i14;
        if (i16 == size()) {
            return this;
        }
        return i16 == 0 ? zzby.zza : new zzbw(this, i14, i16);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final zzca listIterator(int i14) {
        zzbr.zzb(i14, size(), FirebaseAnalytics.Param.INDEX);
        return isEmpty() ? zza : new zzbv(this, i14);
    }
}
