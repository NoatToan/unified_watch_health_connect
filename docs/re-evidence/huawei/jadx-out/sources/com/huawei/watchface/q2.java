package com.huawei.watchface;

import android.text.TextUtils;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.HwLog;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public abstract class q2 {
    public static boolean a(Map map, Object obj) {
        if (isEmpty(map)) {
            return false;
        }
        return map.containsKey(obj);
    }

    public static boolean b(Map map) {
        return map == null;
    }

    public static void c(Map map, String str, String str2) {
        if (b(map) || TextUtils.isEmpty(str) || a(map, (Object) str)) {
            return;
        }
        map.put(str, str2);
    }

    public static <T> T getMapValue(Map<?, ?> map, Object obj) {
        if (isEmpty(map)) {
            return null;
        }
        try {
            return (T) map.get(obj);
        } catch (Exception e) {
            HwLog.e("MapUtils", "getMapValue Exception=" + HwLog.printException(e));
            return null;
        }
    }

    public static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    public static String b(Map map, String str, String str2) {
        return (!isEmpty(map) && map.containsKey(str)) ? (String) ArrayUtils.a((List) map.get(str), 0) : str2;
    }

    public static String a(Map map, String str) {
        if (isEmpty(map)) {
            return "";
        }
        return (String) map.get(str);
    }

    public static void b(Map map, String str) {
        if (!isEmpty(map) && a(map, (Object) str)) {
            map.remove(str);
        }
    }

    public static String a(Map map, String str, String str2) {
        return (!isEmpty(map) && map.containsKey(str)) ? (String) map.get(str) : str2;
    }

    public static void a(Map map, Object obj, Object obj2) {
        if (b(map)) {
            return;
        }
        map.put(obj, obj2);
    }

    public static void a(Map map) {
        if (isEmpty(map)) {
            return;
        }
        map.clear();
    }
}
