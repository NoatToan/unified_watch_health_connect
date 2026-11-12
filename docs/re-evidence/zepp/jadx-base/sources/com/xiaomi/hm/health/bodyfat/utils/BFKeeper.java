package com.xiaomi.hm.health.bodyfat.utils;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes19.dex */
public class BFKeeper {
    public static final String CURRENT_GUEST_BIRTH = "CURRENT_GUEST_BIRTH";
    public static final String CURRENT_GUEST_GENDER = "CURRENT_GUEST_GENDER";
    public static final String CURRENT_GUEST_HEIGHT = "CURRENT_GUEST_HEIGHT";
    public static final String CURRENT_USER_BIRTH = "CURRENT_USER_BIRTH";
    public static final String CURRENT_USER_GENDER = "CURRENT_USER_GENDER";
    public static final String CURRENT_USER_HEIGHT = "CURRENT_USER_HEIGHT";
    public static final String CURRENT_USER_NAME = "CURRENT_USER_NAME";
    public static final String GUEST_PRIVATE_NEED_TIP = "GUEST_PRIVATE_NEED_TIP";
    public static final String WITHOUT_OWNER_REMIND_TIME = "WITHOUT_OWNER_REMIND_TIME";
    private static SharedPreferences a = null;
    private static final String b = "WEIGHT_TARGET_REMIND_TIME";

    public static void clearScaleGuestPrivateTipSetting() {
        clearSettingOf(GUEST_PRIVATE_NEED_TIP);
    }

    public static void clearSettingOf(String str) {
        a.edit().remove(str).apply();
    }

    public static Boolean getChooseUserShowing() {
        return Boolean.valueOf(a.getBoolean("showingChooseUserDialog", false));
    }

    public static String getCurrentUserInfoByTag(String str) {
        return a.getString(str, "");
    }

    public static boolean getNeedBabyWeightRemind() {
        return a.getBoolean("baby_weight_notify", true);
    }

    public static Object getValue(String str, Object obj) {
        if (obj instanceof String) {
            return a.getString(str, (String) obj);
        }
        if (obj instanceof Long) {
            return Long.valueOf(a.getLong(str, ((Long) obj).longValue()));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(a.getInt(str, ((Integer) obj).intValue()));
        }
        if (obj instanceof Boolean) {
            return Boolean.valueOf(a.getBoolean(str, ((Boolean) obj).booleanValue()));
        }
        return obj instanceof Float ? Float.valueOf(a.getFloat(str, ((Float) obj).floatValue())) : obj;
    }

    public static long getWeightGoalRemind(String str) {
        if (HMWeightUtils.isSelf(str)) {
            str = BFCallback.getHMPersonInfo().getUserid();
        }
        return ((Long) getValue("WEIGHT_TARGET_REMIND_TIME_" + str, 0L)).longValue();
    }

    public static void init(SharedPreferences sharedPreferences) {
        a = sharedPreferences;
    }

    public static void keepScaleSyncedUserInfosFromServer(boolean z) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean("ScaleSyncedUserInfosFromServer", z);
        editorEdit.apply();
    }

    public static void putValue(String str, Object obj) {
        if (obj instanceof String) {
            a.edit().putString(str, (String) obj).apply();
            return;
        }
        if (obj instanceof Long) {
            a.edit().putLong(str, ((Long) obj).longValue()).apply();
            return;
        }
        if (obj instanceof Integer) {
            a.edit().putInt(str, ((Integer) obj).intValue()).apply();
        } else if (obj instanceof Boolean) {
            a.edit().putBoolean(str, ((Boolean) obj).booleanValue()).apply();
        } else if (obj instanceof Float) {
            a.edit().putFloat(str, ((Float) obj).floatValue()).apply();
        }
    }

    public static boolean readBoolean(String str, boolean z) {
        return a.getBoolean(str, z);
    }

    public static boolean readScaleGuestPrivateTipSetting() {
        return readBoolean(GUEST_PRIVATE_NEED_TIP, true);
    }

    public static boolean readScaleSyncedUserInfosFromServer() {
        return a.getBoolean("ScaleSyncedUserInfosFromServer", false);
    }

    public static void saveCurrentUser(String str, String str2) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public static void setBoolean(String str, boolean z) {
        a.edit().putBoolean(str, z).apply();
    }

    public static void setChooseUserShowing(boolean z) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean("showingChooseUserDialog", z);
        editorEdit.apply();
    }

    public static void setScaleGuestPrivateTipSetting(boolean z) {
        setBoolean(GUEST_PRIVATE_NEED_TIP, z);
    }

    public static void setShowBabyWeightRemind(boolean z) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean("baby_weight_notify", !z);
        editorEdit.apply();
    }

    public static void setWeightGoalRemind(String str, long j) {
        if (HMWeightUtils.isSelf(str)) {
            str = BFCallback.getHMPersonInfo().getUserid();
        }
        putValue("WEIGHT_TARGET_REMIND_TIME_" + str, Long.valueOf(j));
    }
}
