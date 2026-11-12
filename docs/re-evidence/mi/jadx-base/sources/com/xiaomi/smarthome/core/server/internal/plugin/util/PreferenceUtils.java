package com.xiaomi.smarthome.core.server.internal.plugin.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public class PreferenceUtils {
    public static final String PREF_KEY_COUNTRY = "country";
    private static final ArrayList<PrefObserver> sPrefObs = new ArrayList<>();

    public interface PrefObserver {
        void notifyPrefChange(String str, Object obj);
    }

    public static void addPrefObserver(PrefObserver prefObserver) {
        sPrefObs.add(prefObserver);
    }

    public static void appendSettingString(SharedPreferences sharedPreferences, String str, String str2) {
        if (sharedPreferences == null) {
            return;
        }
        String string = sharedPreferences.getString(str, "");
        sharedPreferences.edit().putString(str, string + str2).apply();
    }

    public static void clearPreference(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.clear();
        editorEdit.apply();
    }

    public static void dumpDefaultPreference(Context context) {
        dumpPreference(PreferenceManager.getDefaultSharedPreferences(context), "default preference:");
    }

    private static void dumpPreference(SharedPreferences sharedPreferences, String str) {
        if (sharedPreferences == null) {
            return;
        }
        Map<String, ?> all = sharedPreferences.getAll();
        Iterator<String> it = all.keySet().iterator();
        while (it.hasNext()) {
            Objects.toString(all.get(it.next()));
        }
    }

    public static boolean getSettingBoolean(Context context, String str, boolean z) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(str, z);
    }

    public static float getSettingFloat(Context context, String str, float f) {
        return PreferenceManager.getDefaultSharedPreferences(context).getFloat(str, f);
    }

    public static int getSettingInt(Context context, String str, int i) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(str, i);
    }

    public static long getSettingLong(SharedPreferences sharedPreferences, String str, long j) {
        if (sharedPreferences == null) {
            return 0L;
        }
        return sharedPreferences.getLong(str, j);
    }

    public static String getSettingString(Context context, String str, String str2) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(str, str2);
    }

    public static boolean hasKey(Context context, String str) {
        return PreferenceManager.getDefaultSharedPreferences(context).contains(str);
    }

    public static void increaseSettingInt(Context context, String str) {
        increaseSettingInt(PreferenceManager.getDefaultSharedPreferences(context), str);
    }

    public static void increaseSettingLong(SharedPreferences sharedPreferences, String str, long j) {
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putLong(str, sharedPreferences.getLong(str, 0L) + j).apply();
    }

    public static void notifyPrefChange(String str, Object obj) {
        Iterator<PrefObserver> it = sPrefObs.iterator();
        while (it.hasNext()) {
            it.next().notifyPrefChange(str, obj);
        }
    }

    public static void removePrefObserver(PrefObserver prefObserver) {
        for (PrefObserver prefObserver2 : sPrefObs) {
            if (prefObserver2 == prefObserver) {
                sPrefObs.remove(prefObserver2);
                return;
            }
        }
    }

    public static void removePreference(Context context, String str) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().remove(str).apply();
    }

    public static void setSettingBoolean(Context context, String str, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(str, z).apply();
    }

    public static void setSettingFloat(Context context, String str, float f) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putFloat(str, f).apply();
    }

    public static void setSettingInt(Context context, String str, int i) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt(str, i).apply();
    }

    public static void setSettingLong(Context context, String str, long j) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putLong(str, j).apply();
    }

    public static void setSettingString(SharedPreferences sharedPreferences, String str, String str2) {
        SharedPreferences.Editor editorEdit;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return;
        }
        editorEdit.putString(str, str2).apply();
    }

    public static long getSettingLong(Context context, String str, long j) {
        return PreferenceManager.getDefaultSharedPreferences(context).getLong(str, j);
    }

    public static void dumpDefaultPreference(Context context, String str) {
        dumpPreference(context.getSharedPreferences(str, 0), str);
    }

    public static boolean getSettingBoolean(SharedPreferences sharedPreferences, String str, boolean z) {
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.getBoolean(str, z);
    }

    public static int getSettingInt(SharedPreferences sharedPreferences, String str, int i) {
        if (sharedPreferences == null) {
            return 0;
        }
        return sharedPreferences.getInt(str, i);
    }

    public static void increaseSettingInt(SharedPreferences sharedPreferences, String str) {
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putInt(str, sharedPreferences.getInt(str, 0) + 1).apply();
    }

    public static void removePreference(SharedPreferences sharedPreferences, String str) {
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().remove(str).apply();
    }

    public static void setSettingBoolean(SharedPreferences sharedPreferences, String str, boolean z) {
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putBoolean(str, z).apply();
    }

    public static void setSettingInt(SharedPreferences sharedPreferences, String str, int i) {
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putInt(str, i).apply();
    }

    public static void setSettingLong(SharedPreferences sharedPreferences, String str, long j) {
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putLong(str, j).apply();
    }

    public static void setSettingString(Context context, String str, String str2) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(str, str2).apply();
    }

    public static void increaseSettingInt(SharedPreferences sharedPreferences, String str, int i) {
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putInt(str, sharedPreferences.getInt(str, 0) + i).apply();
    }
}
