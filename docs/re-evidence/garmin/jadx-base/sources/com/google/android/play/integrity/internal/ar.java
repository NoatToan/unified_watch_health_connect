package com.google.android.play.integrity.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes14.dex */
public abstract class ar extends ao implements List, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final aw f53431a = new ap(at.f53434a, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f53432d = 0;

    @Override // com.google.android.play.integrity.internal.ao
    public int a(Object[] objArr, int i14) {
        int size = size();
        for (int i15 = 0; i15 < size; i15++) {
            objArr[i15] = get(i15);
        }
        return size;
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

    @Override // com.google.android.play.integrity.internal.ao
    /* JADX INFO: renamed from: d */
    public final av iterator() {
        return listIterator(0);
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
                if (!ak.a(get(i14), list.get(i14))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it3 = list.iterator();
        while (it.hasNext()) {
            if (!it3.hasNext() || !ak.a(it.next(), it3.next())) {
                return false;
            }
        }
        return !it3.hasNext();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: f */
    public ar subList(int i14, int i15) {
        al.c(i14, i15, size());
        int i16 = i15 - i14;
        if (i16 == size()) {
            return this;
        }
        return i16 == 0 ? at.f53434a : new aq(this, i14, i16);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final aw listIterator(int i14) {
        al.b(i14, size(), FirebaseAnalytics.Param.INDEX);
        return isEmpty() ? f53431a : new ap(this, i14);
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

    @Override // com.google.android.play.integrity.internal.ao, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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
}
