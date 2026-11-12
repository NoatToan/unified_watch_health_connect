package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes4.dex */
public class vcs implements x3t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile vcs f36757a;

    @Override // defpackage.x3t
    public final void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            return;
        }
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS update_item (_id integer primary key autoincrement, title  TEXT, url TEXT,mAdcode TEXT,fileName TEXT,version TEXT,lLocalLength INTEGER,lRemoteLength INTEGER,localPath TEXT,mIndex INTEGER,isProvince INTEGER NOT NULL,mCompleteCode INTEGER,mCityCode TEXT,mState INTEGER,mPinyin TEXT, UNIQUE(mAdcode));");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS update_item_file (_id integer primary key autoincrement,mAdcode TTEXT, file TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS update_item_download_info (_id integer primary key autoincrement,mAdcode TEXT,fileLength integer,splitter integer,startPos integer,endPos integer, UNIQUE(mAdcode));");
        } catch (Throwable th) {
            m2t.r(th, "DB", "onCreate");
            th.printStackTrace();
        }
    }

    @Override // defpackage.x3t
    public final String b() {
        return "offlineDbV4.db";
    }

    @Override // defpackage.x3t
    public final int c() {
        return 2;
    }

    @Override // defpackage.x3t
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

    public static vcs a() {
        if (f36757a == null) {
            synchronized (vcs.class) {
                try {
                    if (f36757a == null) {
                        f36757a = new vcs();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f36757a;
    }
}
