package com.xiaomi.hm.health.bt.utils;

import com.alipay.sdk.m.n.a;
import com.huami.watch.util.Log;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public final class ArraysUtil {
    private static final String a = "Util-Arrays";

    public static <T> boolean contains(T[] array, T o) {
        boolean zContains = Arrays.asList(array).contains(o);
        Log.d(a, "Contains <" + o + "> : " + zContains, new Object[0]);
        return zContains;
    }

    public static boolean isEmpty(List list) {
        return list == null || list.size() == 0;
    }

    public static String join(Object[] array, CharSequence prefix, CharSequence suffix, CharSequence delimiter) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Object obj : array) {
            if (z) {
                z = false;
            } else if (delimiter != null) {
                sb.append(delimiter);
            }
            if (prefix != null) {
                sb.append(prefix);
            }
            sb.append(obj);
            if (suffix != null) {
                sb.append(suffix);
            }
        }
        return sb.toString();
    }

    public static String toString(List<?> list) {
        if (list == null) {
            return "null";
        }
        return Arrays.toString(list.toArray()) + ", Size : " + list.size();
    }

    public static boolean isEmpty(Object[] array) {
        return array == null || array.length == 0;
    }

    public static String toString(List<?> list, CharSequence delimiter) {
        Object[] array;
        if (list == null || (array = list.toArray()) == null) {
            return "null";
        }
        return join(array, (CharSequence) null, (CharSequence) null, delimiter) + ", Size : " + list.size();
    }

    public static String toString(Object[] array) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Arrays.toString(array));
        if (array != null) {
            str = ", Size: " + array.length;
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public static String toString(byte[] bytes) {
        if (bytes == null) {
            return null;
        }
        return bytes + ", Size: " + bytes.length;
    }

    public static String toString(Map<String, Object> map, CharSequence delimiter) {
        return join(map, (CharSequence) null, (CharSequence) null, delimiter);
    }

    public static String join(Map<String, Object> map, CharSequence prefix, CharSequence suffix, CharSequence delimiter) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (z) {
                z = false;
            } else if (delimiter != null) {
                sb.append(delimiter);
            }
            if (prefix != null) {
                sb.append(prefix);
            }
            sb.append(entry.getKey());
            sb.append(a.h);
            sb.append(entry.getValue());
            if (suffix != null) {
                sb.append(suffix);
            }
        }
        return sb.toString();
    }
}
