package com.ximalaya.ting.android.sdkdownloader.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public class XmUtils {
    public static String converToString(Collection collection) {
        String str = "";
        if (collection == null || collection.size() <= 0) {
            return "";
        }
        Iterator it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (i == collection.size() - 1) {
                return str + it2.next();
            }
            str = str + it2.next() + ",";
            i++;
        }
        return str;
    }

    public static final <T> List<T> emptyList() {
        return new ArrayList();
    }

    public static final <K, V> Map<K, V> emptyMap() {
        return new HashMap();
    }

    public static final <T> Set<T> emptySet() {
        return new HashSet();
    }

    public static String getFriendlyFileSize(double d) {
        if (d < 1024.0d) {
            return String.format("%.2f", Double.valueOf(d)) + "B";
        }
        double d2 = d / 1024.0d;
        if (d2 < 1024.0d) {
            return String.format("%.2f", Double.valueOf(d2)) + "KB";
        }
        double d3 = d2 / 1024.0d;
        if (d3 < 1024.0d) {
            return String.format("%.2f", Double.valueOf(d3)) + "MB";
        }
        return String.format("%.2f", Double.valueOf(d3 / 1024.0d)) + "G";
    }

    public static <T, E> List<T> getListFromMapByKeys(List<E> list, Map<E, T> map) {
        if (list == null || list.isEmpty() || map == null || map.isEmpty()) {
            return emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<E> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(map.get(it2.next()));
        }
        return arrayList;
    }

    public static String tempPathByDownloadSavePath(String str) {
        return str + ".tmp";
    }
}
