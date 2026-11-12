package com.huami.watch.companion.usersettings;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/* JADX INFO: loaded from: classes16.dex */
public class SettingsDBHelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "Settings.db";
    public static final int DB_VERSION = 1;
    private static final String a = "CREATE TABLE Settings (_id INTEGER PRIMARY KEY,key TEXT,value TEXT,cloud_sync_state INTEGER,watch_sync_state INTEGER)";
    private static final String b = "DROP TABLE IF EXISTS Settings";

    public static abstract class Entry extends SettingsEntry implements BaseColumns {
        public static final String TABLE_NAME = "Settings";
    }

    public SettingsDBHelper(Context context) {
        super(context, DB_NAME, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
