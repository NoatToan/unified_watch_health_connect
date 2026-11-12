package com.amap.api.col.p0003sl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes4.dex */
public class bq implements kd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile bq f2282a;

    @Override // com.amap.api.col.p0003sl.kd
    public final int c() {
        return 2;
    }

    public static bq a() {
        if (f2282a == null) {
            synchronized (bq.class) {
                if (f2282a == null) {
                    f2282a = new bq();
                }
            }
        }
        return f2282a;
    }

    private bq() {
    }

    @Override // com.amap.api.col.p0003sl.kd
    public final void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            return;
        }
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS update_item (_id integer primary key autoincrement, title  TEXT, url TEXT,mAdcode TEXT,fileName TEXT,version TEXT,lLocalLength INTEGER,lRemoteLength INTEGER,localPath TEXT,mIndex INTEGER,isProvince INTEGER NOT NULL,mCompleteCode INTEGER,mCityCode TEXT,mState INTEGER,mPinyin TEXT, UNIQUE(mAdcode));");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS update_item_file (_id integer primary key autoincrement,mAdcode TTEXT, file TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS update_item_download_info (_id integer primary key autoincrement,mAdcode TEXT,fileLength integer,splitter integer,startPos integer,endPos integer, UNIQUE(mAdcode));");
        } catch (Throwable th) {
            jv.c(th, "DB", "onCreate");
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.col.p0003sl.kd
    public final String b() {
        return "offlineDbV4.db";
    }

    @Override // com.amap.api.col.p0003sl.kd
    public final void a(SQLiteDatabase sQLiteDatabase, int i) {
        if (sQLiteDatabase != null && i == 1) {
            sQLiteDatabase.execSQL("ALTER TABLE update_item ADD COLUMN mPinyin TEXT;");
            Cursor cursorQuery = sQLiteDatabase.query("update_item", null, null, null, null, null, null);
            if (cursorQuery == null) {
                sQLiteDatabase.close();
                sQLiteDatabase = null;
            }
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("url"));
                    String strSubstring = string.substring(string.lastIndexOf("/") + 1);
                    sQLiteDatabase.execSQL("update update_item set mPinyin=? where url =?", new String[]{strSubstring.substring(0, strSubstring.lastIndexOf(".")), string});
                }
                cursorQuery.close();
            }
        }
    }
}
