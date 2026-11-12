package com.huawei.haf.common.utils;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    public static boolean d(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    public static boolean c(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean a(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean c(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    public static boolean d(Collection<?> collection, int i) {
        return a(collection) || i < 0 || i >= collection.size();
    }
}
