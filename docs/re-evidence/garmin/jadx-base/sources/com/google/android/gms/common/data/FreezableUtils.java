package com.google.android.gms.common.data;

import java.util.ArrayList;
import java.util.Iterator;
import vt2.q;

/* JADX INFO: loaded from: classes14.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        q qVar = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            qVar.add(arrayList.get(i14).freeze());
        }
        return qVar;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        q qVar = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            qVar.add(it.next().freeze());
        }
        return qVar;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        q qVar = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e4 : eArr) {
            qVar.add(e4.freeze());
        }
        return qVar;
    }
}
