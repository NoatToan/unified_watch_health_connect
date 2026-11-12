package com.huawei.health.manager;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.peh;
import health.compact.a.CommonUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ScreenOnStatisticsUtil {
    public static void b(Context context) {
        Integer numC;
        if (context == null) {
            LogUtil.a("R_ScreenOnStatisticsHelper", "screenOnCount context == null");
            return;
        }
        Map<Integer, Integer> mapA = a(context);
        HashMap map = new HashMap(mapA);
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        LogUtil.a("R_ScreenOnStatisticsHelper", "allCounts:", mapA);
        if (map.size() >= 2 && !map.containsKey(Integer.valueOf(iA)) && (numC = c(map)) != null) {
            map.remove(numC);
        }
        Integer num = (Integer) map.get(Integer.valueOf(iA));
        map.put(Integer.valueOf(iA), Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        e(context, map);
    }

    private static Integer c(Map<Integer, Integer> map) {
        Map.Entry entry = (Map.Entry) Collections.min(map.entrySet(), Map.Entry.comparingByKey());
        if (entry != null) {
            return (Integer) entry.getKey();
        }
        return null;
    }

    private static int d(Context context, long j) {
        Map<Integer, Integer> mapA = a(context);
        int iA = DateFormatUtil.a(j);
        if (mapA == null) {
            return 0;
        }
        if (!mapA.containsKey(Integer.valueOf(iA))) {
            LogUtil.a("R_ScreenOnStatisticsHelper", "getDataScreenCount not contains");
            return 0;
        }
        Integer num = mapA.get(Integer.valueOf(iA));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static boolean e(Context context, long j) {
        return d(context, j) > 10;
    }

    private static void e(Context context, Map<Integer, Integer> map) {
        if (context == null) {
            LogUtil.j("R_ScreenOnStatisticsHelper", "setScreenOnList context is null");
            return;
        }
        String strC = peh.c(map);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit();
        if (editorEdit != null) {
            editorEdit.putString("ScreenOnCounts", strC);
            editorEdit.commit();
        }
    }

    public static Map<Integer, Integer> a(Context context) {
        if (context == null) {
            LogUtil.j("R_ScreenOnStatisticsHelper", "getScreenOnStatistics context is null");
            return new HashMap();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_newFile", 0);
        HashMap map = new HashMap();
        if (sharedPreferences == null) {
            return map;
        }
        String string = sharedPreferences.getString("ScreenOnCounts", "");
        if (TextUtils.isEmpty(string)) {
            return new HashMap();
        }
        try {
            return (Map) new Gson().fromJson(CommonUtil.ac(string), new TypeToken<Map<Integer, Integer>>() { // from class: com.huawei.health.manager.ScreenOnStatisticsUtil.1
            }.getType());
        } catch (JsonSyntaxException unused) {
            LogUtil.e("R_ScreenOnStatisticsHelper", "JsonSyntaxException");
            return new HashMap();
        }
    }
}
