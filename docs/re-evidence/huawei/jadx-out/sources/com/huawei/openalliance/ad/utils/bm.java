package com.huawei.openalliance.ad.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public abstract class bm {
    public static <T> boolean a(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    public static boolean a(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static <T> boolean a(Collection<T> collection) {
        return collection == null || collection.isEmpty();
    }

    public static Set<String> a(List<String> list, boolean z) {
        if (a(list)) {
            return null;
        }
        HashSet hashSet = new HashSet();
        if (!z) {
            hashSet.addAll(list);
            return hashSet;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().toUpperCase(Locale.ENGLISH));
        }
        return hashSet;
    }

    public static String a(List<String> list, String str) {
        if (a(list)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(str);
        }
        return sb.toString();
    }
}
