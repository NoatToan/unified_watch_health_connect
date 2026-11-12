package com.huawei.hianalytics;

import android.text.TextUtils;
import com.huawei.hianalytics.core.log.HiLog;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v1 {
    public static boolean a(int i, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            HiLog.w("ParamCheckUtils", "parameter is empty: ".concat(str));
            return false;
        }
        if (str2.length() <= i) {
            return true;
        }
        HiLog.w("ParamCheckUtils", "parameter length error: ".concat(str));
        return false;
    }

    public static boolean a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            HiLog.w("ParamCheckUtils", "parameter is null. parameter:".concat(str));
            return false;
        }
        if (Pattern.compile(str3).matcher(str2).matches()) {
            return true;
        }
        HiLog.w("ParamCheckUtils", "check parameter failure! parameter:".concat(str));
        return false;
    }

    public static boolean a(Map map) {
        if (map == null || map.isEmpty()) {
            HiLog.w("ParamCheckUtils", "onEvent size empty");
            return false;
        }
        if (map.size() == 1 && (map.get("constants") != null || map.get("_constants") != null)) {
            HiLog.w("ParamCheckUtils", "the key can't be constants or _constants");
            return false;
        }
        try {
            if (map.size() <= 2048 && map.toString().length() <= 204800) {
                return true;
            }
            HiLog.w("ParamCheckUtils", "map data is too big. size: " + map.size() + ", length: " + map.toString().length());
            return false;
        } catch (Exception unused) {
            HiLog.w("ParamCheckUtils", "checkMap failed");
            return false;
        }
    }

    public static LinkedHashMap a(Map map, int i, long j, long j2, String str) {
        if (map != null && !map.isEmpty()) {
            if (map.size() > i) {
                HiLog.w("ParamCheckUtils", "map size is too big");
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                if (!TextUtils.isEmpty(str2) && str2.length() <= j) {
                    if (!TextUtils.isEmpty(str) && !str2.startsWith(str)) {
                        HiLog.w("ParamCheckUtils", "key is not starts with x_");
                    } else {
                        String str3 = (String) entry.getValue();
                        if (!TextUtils.isEmpty(str3) && str3.length() <= j2) {
                            linkedHashMap.put(str2, (String) entry.getValue());
                        } else {
                            HiLog.w("ParamCheckUtils", "value check failure");
                        }
                    }
                } else {
                    HiLog.w("ParamCheckUtils", "key check failure");
                }
            }
            return linkedHashMap;
        }
        HiLog.w("ParamCheckUtils", "headers is empty");
        return null;
    }
}
