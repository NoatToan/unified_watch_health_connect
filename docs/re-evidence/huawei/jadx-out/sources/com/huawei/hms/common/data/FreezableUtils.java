package com.huawei.hms.common.data;

import com.huawei.healthcloud.plugintrack.offlinemap.ui.view.CityListBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes33.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        return freezeIterable(arrayList);
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        CityListBean cityListBean = (ArrayList<T>) new ArrayList();
        if (iterable != null) {
            Iterator<E> it = iterable.iterator();
            while (it.hasNext()) {
                cityListBean.add(it.next().freeze());
            }
        }
        return cityListBean;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        return freezeIterable(Arrays.asList(eArr));
    }
}
