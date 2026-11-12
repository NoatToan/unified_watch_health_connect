package com.huami.watch.companion.usersettings;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.util.AndroidException;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class UserSettings {
    private static final String a = "UserSettings";

    public static class UserSettingNotFoundException extends AndroidException {
        public UserSettingNotFoundException(String str) {
            super(str);
        }
    }

    public static String get(ContentResolver contentResolver, String str) {
        return get(contentResolver, str, null);
    }

    public static boolean getBoolean(ContentResolver contentResolver, String str, boolean z) {
        return Boolean.parseBoolean(get(contentResolver, str, String.valueOf(z)));
    }

    public static float getFloat(ContentResolver contentResolver, String str, float f) {
        return Float.parseFloat(get(contentResolver, str, String.valueOf(f)));
    }

    public static int getInt(ContentResolver contentResolver, String str, int i) {
        return Integer.parseInt(get(contentResolver, str, String.valueOf(i)));
    }

    public static long getLong(ContentResolver contentResolver, String str, long j) {
        return Long.parseLong(get(contentResolver, str, String.valueOf(j)));
    }

    public static String getString(ContentResolver contentResolver, String str) {
        return get(contentResolver, str);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0078 A[DONT_GENERATE, PHI: r1 r11
      0x0078: PHI (r1v4 android.database.Cursor) = (r1v3 android.database.Cursor), (r1v5 android.database.Cursor) binds: [B:19:0x0082, B:13:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x0078: PHI (r11v3 boolean) = (r11v1 boolean), (r11v4 boolean) binds: [B:19:0x0082, B:13:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean put(ContentResolver contentResolver, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", str);
        contentValues.put("value", str2);
        boolean z = false;
        contentValues.put("cloud_sync_state", (Integer) 0);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(SettingsEntry.CONTENT_URI, SettingsEntry.COLUMNS_EMPTY, "key=?", new String[]{str}, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    Log.d("UserSettings", "Update Values : " + str, new Object[0]);
                    if (contentResolver.update(SettingsEntry.CONTENT_URI, contentValues, "key=?", new String[]{str}) > 0) {
                    }
                    return z;
                }
                Log.d("UserSettings", "Insert Values : " + str, new Object[0]);
                contentResolver.insert(SettingsEntry.CONTENT_URI, contentValues);
                z = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return z;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public static boolean putBoolean(ContentResolver contentResolver, String str, boolean z) {
        return put(contentResolver, str, String.valueOf(z));
    }

    public static boolean putFloat(ContentResolver contentResolver, String str, float f) {
        return put(contentResolver, str, String.valueOf(f));
    }

    public static boolean putInt(ContentResolver contentResolver, String str, int i) {
        return put(contentResolver, str, String.valueOf(i));
    }

    public static boolean putLong(ContentResolver contentResolver, String str, long j) {
        return put(contentResolver, str, String.valueOf(j));
    }

    public static boolean putString(ContentResolver contentResolver, String str, String str2) {
        return put(contentResolver, str, str2);
    }

    public static String get(ContentResolver contentResolver, String str, String str2) {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(SettingsEntry.CONTENT_URI, SettingsEntry.COLUMNS_VALUE, "key=?", new String[]{str}, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    str2 = cursorQuery.getString(0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str2;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public static boolean getBoolean(ContentResolver contentResolver, String str) {
        String str2 = get(contentResolver, str);
        if (str2 == null) {
            return false;
        }
        return Boolean.parseBoolean(str2);
    }

    public static float getFloat(ContentResolver contentResolver, String str) throws UserSettingNotFoundException {
        String str2 = get(contentResolver, str);
        if (str2 == null) {
            throw new UserSettingNotFoundException(str);
        }
        try {
            return Float.parseFloat(str2);
        } catch (NumberFormatException unused) {
            throw new UserSettingNotFoundException(str);
        }
    }

    public static int getInt(ContentResolver contentResolver, String str) throws UserSettingNotFoundException {
        String str2 = get(contentResolver, str);
        if (str2 == null) {
            throw new UserSettingNotFoundException(str);
        }
        try {
            return Integer.parseInt(str2);
        } catch (NumberFormatException unused) {
            throw new UserSettingNotFoundException(str);
        }
    }

    public static float getLong(ContentResolver contentResolver, String str) throws UserSettingNotFoundException {
        String str2 = get(contentResolver, str);
        if (str2 == null) {
            throw new UserSettingNotFoundException(str);
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            throw new UserSettingNotFoundException(str);
        }
    }
}
