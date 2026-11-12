package com.google.android.gms.common.data;

import androidx.annotation.RecentlyNonNull;
import com.ximalaya.ting.android.opensdk.httputil.httpswitch.IDCGroupManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class FreezableUtils {
    @RecentlyNonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@RecentlyNonNull ArrayList<E> arrayList) {
        IDCGroupManager.AnonymousClass1.C10481 c10481 = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c10481.add(arrayList.get(i).freeze());
        }
        return c10481;
    }

    @RecentlyNonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(@RecentlyNonNull Iterable<E> iterable) {
        IDCGroupManager.AnonymousClass1.C10481 c10481 = (ArrayList<T>) new ArrayList();
        Iterator<E> it2 = iterable.iterator();
        while (it2.hasNext()) {
            c10481.add(it2.next().freeze());
        }
        return c10481;
    }

    @RecentlyNonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@RecentlyNonNull E[] eArr) {
        IDCGroupManager.AnonymousClass1.C10481 c10481 = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e : eArr) {
            c10481.add(e.freeze());
        }
        return c10481;
    }
}
