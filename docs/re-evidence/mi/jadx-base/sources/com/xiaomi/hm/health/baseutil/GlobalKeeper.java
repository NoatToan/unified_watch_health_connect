package com.xiaomi.hm.health.baseutil;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public class GlobalKeeper {
    private static final String EXERCISE_BM_TIPS = "has_show_running_tips_blue_monkey";
    private static final String EXERCISE_HR_TIPS = "has_show_running_tips";
    private static final String GLOBAL_KEEP_XML = "global_sp_keep";
    private static final String GLOBAL_UUID = "global_uuid";
    private static final String STAT_TOTAL_EXER_COUNT = "exer_stat_total_count";
    private static SharedPreferences sp;

    public static void clear(Context context) {
    }

    public static boolean getBlueMonkeyNeedTip() {
        return sp.getBoolean(EXERCISE_BM_TIPS, true);
    }

    public static int getExerStatTotalCount() {
        return sp.getInt(STAT_TOTAL_EXER_COUNT, 0);
    }

    public static boolean getHrNeedTip() {
        return sp.getBoolean(EXERCISE_HR_TIPS, true);
    }

    public static String getUuid() {
        String uuid = readUuid();
        if (uuid != null && !uuid.isEmpty()) {
            return uuid;
        }
        String string = UUID.randomUUID().toString();
        keepUuid(string);
        return string;
    }

    public static void init(Context context) {
        sp = context.getSharedPreferences(GLOBAL_KEEP_XML, 0);
    }

    private static void keepUuid(String str) {
        SharedPreferences.Editor editorEdit = sp.edit();
        editorEdit.putString(GLOBAL_UUID, str);
        editorEdit.apply();
    }

    private static String readUuid() {
        return sp.getString(GLOBAL_UUID, null);
    }

    public static void setBlueMonkeyNeedTip(boolean z) {
        setBoolean(EXERCISE_BM_TIPS, z);
    }

    private static void setBoolean(String str, boolean z) {
        SharedPreferences.Editor editorEdit = sp.edit();
        editorEdit.putBoolean(str, z);
        editorEdit.apply();
    }

    public static void setExerStatTotalCount(int i) {
        setInt(STAT_TOTAL_EXER_COUNT, i);
    }

    public static void setHrNeedTip(boolean z) {
        setBoolean(EXERCISE_HR_TIPS, z);
    }

    private static void setInt(String str, int i) {
        SharedPreferences.Editor editorEdit = sp.edit();
        editorEdit.putInt(str, i);
        editorEdit.apply();
    }
}
