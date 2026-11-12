package com.xiaomi.smarthome.library.common.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class SharePrefsManager {
    public static final String SP_KEY_FACE_SERVICE_SHOWED = "SP_KEY_FACE_SERVICE_SHOWED";
    public static final String SP_KEY_KOREA_FORCE_PIN_CODE = "SP_KEY_KOREA_FORCE_PIN_CODE";
    public static final String SP_KEY_MEDIA_STORE_INIT_TIME = "SP_KEY_MEDIA_STORE_INIT_TIME";
    public static final String SP_KEY_UNSET_ROOM_IGNORE = "SP_KEY_UNSET_ROOM_IGNORE";
    public static final String SP_KEY_USE_MIUI_MEMORY_OPT = "SP_KEY_USE_MIUI_MEMORY_OPT";
    public static final String SP_THREADPOOL_AB_CONFIG = "SP_THREADPOOL_AB_CONFIG";
    public static final String SP_THREADPOOL_COREPOOLSIZE = "SP_THREADPOOL_COREPOOLSIZE";
    public static final String SP_THREADPOOL_MAX_REQUESTS_PER_HOST = "SP_THREADPOOL_MAX_REQUESTS_PER_HOST";
    private static HashMap<String, SharedPreferences> mPreferenceMap;

    public static void clearPreference(SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.clear();
            editorEdit.commit();
        }
    }

    private static String getNonNullString(String str) {
        return str != null ? str : "";
    }

    public static boolean getSettingBoolean(SharedPreferences sharedPreferences, String str, boolean z) {
        return sharedPreferences != null ? sharedPreferences.getBoolean(str, z) : z;
    }

    public static float getSettingFloat(Context context, String str, String str2, float f) {
        SharedPreferences sharedPrefs = getSharedPrefs(context, str);
        return sharedPrefs != null ? sharedPrefs.getFloat(str2, f) : f;
    }

    public static int getSettingInt(SharedPreferences sharedPreferences, String str, int i) {
        return sharedPreferences != null ? sharedPreferences.getInt(str, i) : i;
    }

    public static long getSettingLong(Context context, String str, String str2, long j) {
        SharedPreferences sharedPrefs = getSharedPrefs(context, str);
        return sharedPrefs != null ? sharedPrefs.getLong(str2, j) : j;
    }

    public static String getSettingString(SharedPreferences sharedPreferences, String str, String str2) {
        return sharedPreferences != null ? sharedPreferences.getString(str, str2) : str2;
    }

    public static SharedPreferences getSharedPrefs(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (mPreferenceMap == null) {
            mPreferenceMap = new HashMap<>();
        }
        if (mPreferenceMap.containsKey(str)) {
            return mPreferenceMap.get(str);
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        mPreferenceMap.put(str, sharedPreferences);
        return sharedPreferences;
    }

    public static void removePreference(SharedPreferences sharedPreferences, String str) {
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove(str).commit();
        }
    }

    public static void setSettingBoolean(SharedPreferences sharedPreferences, String str, boolean z) {
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean(str, z).commit();
        }
    }

    public static void setSettingBooleanAsync(Context context, String str, String str2, boolean z) {
        SharedPreferences sharedPrefs = getSharedPrefs(context, str);
        if (sharedPrefs != null) {
            sharedPrefs.edit().putBoolean(str2, z).apply();
        }
    }

    public static void setSettingFloat(Context context, String str, String str2, float f) {
        SharedPreferences sharedPrefs = getSharedPrefs(context, str);
        if (sharedPrefs != null) {
            sharedPrefs.edit().putFloat(str2, f).commit();
        }
    }

    public static void setSettingInt(SharedPreferences sharedPreferences, String str, int i) {
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt(str, i).commit();
        }
    }

    public static void setSettingLong(Context context, String str, String str2, long j) {
        SharedPreferences sharedPrefs = getSharedPrefs(context, str);
        if (sharedPrefs != null) {
            sharedPrefs.edit().putLong(str2, j).commit();
        }
    }

    public static void setSettingString(SharedPreferences sharedPreferences, String str, String str2) {
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString(str, getNonNullString(str2)).commit();
        }
    }

    public static void setSettingStringAsync(SharedPreferences sharedPreferences, String str, String str2) {
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString(str, getNonNullString(str2)).apply();
        }
    }

    public static boolean getSettingBoolean(Context context, String str, String str2, boolean z) {
        SharedPreferences sharedPrefs = getSharedPrefs(context, str);
        return sharedPrefs != null ? sharedPrefs.getBoolean(str2, z) : z;
    }

    public static int getSettingInt(Context context, String str, String str2, int i) {
        SharedPreferences sharedPrefs = getSharedPrefs(context, str);
        return sharedPrefs != null ? sharedPrefs.getInt(str2, i) : i;
    }

    public static String getSettingString(Context context, String str, String str2, String str3) {
        SharedPreferences sharedPrefs = getSharedPrefs(context, str);
        return (sharedPrefs == null || TextUtils.isEmpty(str2)) ? str3 : sharedPrefs.getString(str2, str3);
    }

    public static void removePreference(Context context, String str, String str2) {
        SharedPreferences sharedPrefs = getSharedPrefs(context, str);
        if (sharedPrefs != null) {
            sharedPrefs.edit().remove(str2).commit();
        }
    }

    public static void setSettingBoolean(Context context, String str, String str2, boolean z) {
        SharedPreferences sharedPrefs = getSharedPrefs(context, str);
        if (sharedPrefs != null) {
            sharedPrefs.edit().putBoolean(str2, z).commit();
        }
    }

    public static void setSettingInt(Context context, String str, String str2, int i) {
        SharedPreferences sharedPrefs = getSharedPrefs(context, str);
        if (sharedPrefs != null) {
            sharedPrefs.edit().putInt(str2, i).commit();
        }
    }

    public static void setSettingString(Context context, String str, String str2, String str3) {
        SharedPreferences sharedPrefs = getSharedPrefs(context, str);
        if (sharedPrefs != null) {
            sharedPrefs.edit().putString(str2, str3).commit();
        }
    }

    public static void setSettingStringAsync(Context context, String str, String str2, String str3) {
        SharedPreferences sharedPrefs = getSharedPrefs(context, str);
        if (sharedPrefs != null) {
            sharedPrefs.edit().putString(str2, str3).apply();
        }
    }

    public static float getSettingFloat(SharedPreferences sharedPreferences, String str, float f) {
        return sharedPreferences != null ? sharedPreferences.getFloat(str, f) : f;
    }

    public static long getSettingLong(SharedPreferences sharedPreferences, String str, long j) {
        return sharedPreferences != null ? sharedPreferences.getLong(str, j) : j;
    }

    public static void setSettingFloat(SharedPreferences sharedPreferences, String str, float f) {
        if (sharedPreferences != null) {
            sharedPreferences.edit().putFloat(str, f).commit();
        }
    }

    public static void setSettingLong(SharedPreferences sharedPreferences, String str, long j) {
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong(str, j).commit();
        }
    }
}
