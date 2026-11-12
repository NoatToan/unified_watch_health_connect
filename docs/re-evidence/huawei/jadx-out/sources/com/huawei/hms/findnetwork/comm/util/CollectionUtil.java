package com.huawei.hms.findnetwork.comm.util;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public class CollectionUtil {
    public static <T extends Collection<?>> boolean isEmpty(T t) {
        return t == null || t.size() == 0;
    }

    public static <K, V> boolean isEmpty(Map<K, V> map) {
        return map == null || map.isEmpty();
    }

    public static boolean isEmpty(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static <T> boolean isEmpty(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }
}
