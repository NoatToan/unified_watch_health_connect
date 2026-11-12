package com.google.android.gms.common.data;

import com.huawei.healthcloud.plugintrack.offlinemap.ui.view.CityListBean;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        CityListBean cityListBean = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cityListBean.add(arrayList.get(i).freeze());
        }
        return cityListBean;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        CityListBean cityListBean = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e : eArr) {
            cityListBean.add(e.freeze());
        }
        return cityListBean;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        CityListBean cityListBean = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            cityListBean.add(it.next().freeze());
        }
        return cityListBean;
    }
}
