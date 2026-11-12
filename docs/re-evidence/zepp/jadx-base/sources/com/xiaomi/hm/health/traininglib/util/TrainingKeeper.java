package com.xiaomi.hm.health.traininglib.util;

import android.content.SharedPreferences;
import com.xiaomi.hm.health.baseutil.GlobalUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingKeeper {
    public static final String PREF_KEY_NEED_RELOAD_COURSE = "PREF_KEY_NEED_RELOAD_COURSE";
    private static SharedPreferences a;

    public static void clear() {
        a.edit().clear().apply();
    }

    public static String getCache(String str) {
        SharedPreferences sharedPreferences = a;
        if (sharedPreferences != null) {
            return sharedPreferences.getString(str, null);
        }
        return null;
    }

    public static String getKey(String str, Map<String, Object> map) {
        return str + "_" + GlobalUtil.gson().toJson(map);
    }

    public static void init(SharedPreferences sharedPreferences) {
        a = sharedPreferences;
    }

    public static boolean needReloadCourseInfo() {
        return a.getBoolean(PREF_KEY_NEED_RELOAD_COURSE, true);
    }

    public static void putCache(String str, String str2) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public static void remove(String str) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.remove(str);
        editorEdit.apply();
    }

    public static void setNeedReloadCourseInfo(boolean z) {
        a.edit().putBoolean(PREF_KEY_NEED_RELOAD_COURSE, z).apply();
    }
}
