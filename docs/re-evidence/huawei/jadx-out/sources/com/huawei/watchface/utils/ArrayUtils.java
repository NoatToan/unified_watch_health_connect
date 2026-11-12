package com.huawei.watchface.utils;

import android.text.TextUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public final class ArrayUtils {
    public static boolean a(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static int b(Map map) {
        if (a(map)) {
            return 0;
        }
        return map.size();
    }

    public static boolean isEmpty(String[] strArr) {
        return strArr == null || strArr.length == 0;
    }

    public static boolean isSafeIndex(Collection<?> collection, int i) {
        return !isEmpty(collection) && i >= 0 && i < collection.size();
    }

    public static boolean a(Map map) {
        return map == null || map.isEmpty();
    }

    public static boolean b(String[] strArr, String str) {
        if (!isEmpty(strArr) && !TextUtils.isEmpty(str)) {
            for (String str2 : strArr) {
                if (str2 != null && str2.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isEmpty(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    public static int a(Collection collection) {
        if (isEmpty((Collection<?>) collection)) {
            return 0;
        }
        return collection.size();
    }

    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean a(Object obj, Object... objArr) {
        if (obj != null && !isEmpty(objArr)) {
            for (Object obj2 : objArr) {
                if (obj2 != null && (((obj2 instanceof String) && (obj instanceof String) && ((String) obj2).equalsIgnoreCase((String) obj)) || obj2.equals(obj))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(String[] strArr, String str) {
        if (!isEmpty(strArr) && !TextUtils.isEmpty(str)) {
            for (String str2 : strArr) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int a(Object[] objArr) {
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    public static Object a(List list, int i) {
        if (i < 0 || i >= a(list)) {
            return null;
        }
        try {
            return list.get(i);
        } catch (Exception e) {
            HwLog.e("ArrayUtils", "getItem Exception " + HwLog.printException(e));
            return null;
        }
    }

    public static Object a(Object[] objArr, int i) {
        if (i < 0 || i >= a(objArr)) {
            return null;
        }
        return objArr[i];
    }
}
