package com.xiaomi.smarthome.utils;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class CollectionUtils {
    public static boolean isEmpty(Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).isEmpty();
        }
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        if (obj instanceof Object[]) {
            return ((Object[]) obj).length == 0;
        }
        if (obj instanceof Iterator) {
            return !((Iterator) obj).hasNext();
        }
        if (obj instanceof Enumeration) {
            return !((Enumeration) obj).hasMoreElements();
        }
        try {
            return Array.getLength(obj) == 0;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static boolean isNotEmpty(Object obj) {
        return !isEmpty(obj);
    }

    public static int size(Collection collection) {
        if (isEmpty(collection)) {
            return 0;
        }
        return collection.size();
    }

    public static int size(Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }
}
