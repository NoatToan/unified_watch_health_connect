package com.huami.watch.companion.usersettings;

import android.net.Uri;

/* JADX INFO: loaded from: classes16.dex */
public class SettingsEntry {
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
