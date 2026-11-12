package com.huami.watch.companion.facestore.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes16.dex */
public class WatchFacesDBHelper extends SQLiteOpenHelper {
    private static final String a = "downlaod_task_manager.db";
    private static final int b = 7;
    private static final String c = "CREATE TABLE  IF NOT EXISTS face_track (downloads TEXT PRIMARY KEY ,name TEXT NOT NULL,skin_bin  TEXT DEFAULT '',skin_size TEXT DEFAULT '0')";
    private static final String d = "CREATE TABLE IF NOT EXISTS download_task_manager (download_id INTEGER PRIMARY KEY ,downloads  TEXT NOT NULL,name TEXT NOT NULL,skin_bin TEXT NOT NULL,file_path TEXT NOT NULL,device_type TEXT NOT NULL,skin_size TEXT DEFAULT '0',thumbnails TEXT NOT NULL)";

    public WatchFacesDBHelper(Context context) {
        super(context, a, (SQLiteDatabase.CursorFactory) null, 7);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(c);
        sQLiteDatabase.execSQL(d);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 >= 7 && i < 7) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS download_task_manager");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS face_track");
        }
        onCreate(sQLiteDatabase);
    }
}
