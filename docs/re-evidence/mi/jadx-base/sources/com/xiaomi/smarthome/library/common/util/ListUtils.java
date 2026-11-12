package com.xiaomi.smarthome.library.common.util;

import androidx.core.util.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ListUtils {
    public static <E> void addItem(List<E> list, Consumer<E> consumer) {
        if (list != null) {
            Iterator<E> it = list.iterator();
            while (it.hasNext()) {
                consumer.accept(it.next());
            }
        }
    }

    public static <T> List<T> create(T... tArr) {
        return Arrays.asList(tArr);
    }

    public static <E> List<E> getEmptyList() {
        return new ArrayList();
    }

    public static boolean isEmpty(List<?> list) {
        return list == null || list.size() <= 0;
    }

    public static int size(List<?> list) {
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static <E> List<List<E>> splitList(Collection<E> collection, int i) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(arrayList2);
        for (E e : collection) {
            if (arrayList2.size() >= i) {
                arrayList2 = new ArrayList();
                arrayList.add(arrayList2);
            }
            arrayList2.add(e);
        }
        return arrayList;
    }
}
