package com.huami.watch.companion.settings;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class WatchSettings {
    private static final String a = "UserSettings-Watch";

    public static class SettingsEntry {
        public static final String COLUMN_CLOUD_SYNC_STATE = "cloud_sync_state";
        public static final String COLUMN_KEY = "key";
        public static final String COLUMN_VALUE = "value";
        public static final String COLUMN_WATCH_SYNC_STATE = "watch_sync_state";
        public static final int SYNC_STATE_NEED_SYNC = 0;
        public static final int SYNC_STATE_SYNCED = 1;
        public static Uri CONTENT_URI = Uri.parse("content://com.huami.watch.companion.settings");
        public static final String[] COLUMNS_EMPTY = new String[0];
        public static final String[] COLUMNS_VALUE = {"value"};
        public static final String[] COLUMNS_KEY_VALUE = {"key", "value"};
        public static final String[] COLUMNS_ALL = {"key", "value", "cloud_sync_state", "watch_sync_state"};

        public static void setUri(Uri uri) {
            CONTENT_URI = uri;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    public static String get(ContentResolver contentResolver, String str) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor = null;
        string = null;
        string = null;
        string = null;
        String string = null;
        try {
            cursorQuery = contentResolver.query(SettingsEntry.CONTENT_URI, SettingsEntry.COLUMNS_VALUE, "key=?", new String[]{str}, null);
            if (cursorQuery != null) {
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            string = cursorQuery.getString(0);
                        }
                    } catch (Exception e) {
                        e = e;
                        e.printStackTrace();
                        if (cursorQuery != null) {
                        }
                        Log.d(a, "Get : " + str + ", " + string);
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        Log.d(a, "Get : " + str + ", " + string);
        return string;
    }

    public static boolean put(ContentResolver contentResolver, String str, String str2) {
        return put(contentResolver, str, str2, null);
    }

    public static boolean put(ContentResolver contentResolver, String str, String str2, ContentObserver contentObserver) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", str);
        contentValues.put("value", str2);
        boolean z = false;
        contentValues.put("cloud_sync_state", (Integer) 0);
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(SettingsEntry.CONTENT_URI, SettingsEntry.COLUMNS_EMPTY, "key=?", new String[]{str}, null);
            if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                Log.d(a, "Insert Values : " + contentValues.toString());
                if (contentResolver.insert(SettingsEntry.CONTENT_URI, contentValues) != null) {
                    z = true;
                }
                return z;
            }
            Log.d(a, "Update Values : " + contentValues.toString());
            if (contentResolver.update(SettingsEntry.CONTENT_URI, contentValues, "key=?", new String[]{str}) > 0) {
                z = true;
            }
            if (z) {
                Log.d(a, "Put Success, NotifyChange now!!");
                contentResolver.notifyChange(SettingsEntry.CONTENT_URI, contentObserver);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
        return z;
    }
}
