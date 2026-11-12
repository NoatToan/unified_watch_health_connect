package wb2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import ch.qos.logback.classic.Logger;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static l f184055c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f184056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SQLiteDatabase f184057b;

    public static class a extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Logger f184058a;

        public a(Context context) {
            super(context, "sync_cache.db", (SQLiteDatabase.CursorFactory) null, 1);
            int i14 = gt2.c.f79010a;
            this.f184058a = gt2.b.f79005a.i("SYNC#DeviceSyncAuditDBHelper");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            Logger logger = this.f184058a;
            logger.debug("CacheHelper:onCreate **** BEGIN");
            sQLiteDatabase.beginTransaction();
            try {
                sQLiteDatabase.execSQL("create table if not exists device_sync_audit (_id integer primary key autoincrement, device_info text, audit_text text, app_version text,created_timestamp integer);");
                sQLiteDatabase.setTransactionSuccessful();
                logger.warn("CacheHelper:onCreate: database [sync_cache.db], version [1]");
                sQLiteDatabase.endTransaction();
                logger.debug("CacheHelper:onCreate **** END");
            } catch (Throwable th3) {
                sQLiteDatabase.endTransaction();
                throw th3;
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i14, int i15) {
            String strG = am.j.g(i14, i15, "CacheHelper:onUpgrade: from version [", "] to [", "]");
            Logger logger = this.f184058a;
            logger.warn(strG);
            logger.warn("CacheHelper:onUpgrade: upgrade from version [" + i14 + "] to [" + i15 + "] successful");
        }
    }

    private l(Context context) {
        this.f184057b = new a(context).getWritableDatabase();
        int i14 = gt2.c.f79010a;
        this.f184056a = gt2.b.f79005a.i("SYNC#DeviceSyncAuditDAO");
    }

    public static void a(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    public static m b(Cursor cursor) {
        return new m(cursor.getLong(cursor.getColumnIndexOrThrow("_id")), cursor.getLong(cursor.getColumnIndexOrThrow("created_timestamp")), cursor.getString(cursor.getColumnIndexOrThrow("device_info")), cursor.getString(cursor.getColumnIndexOrThrow("audit_text")), cursor.getString(cursor.getColumnIndexOrThrow("app_version")));
    }

    public static ArrayList c(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(new m(cursor.getLong(cursor.getColumnIndexOrThrow("_id")), cursor.getLong(cursor.getColumnIndexOrThrow("created_timestamp")), cursor.getString(cursor.getColumnIndexOrThrow("device_info")), cursor.getString(cursor.getColumnIndexOrThrow("audit_text")), cursor.getString(cursor.getColumnIndexOrThrow("app_version"))));
        }
        return arrayList;
    }

    public static void d(Context context) {
        if (f184055c == null) {
            f184055c = new l(context);
        }
    }

    public final void e(String str, String str2, String str3) {
        ContentValues contentValues = new ContentValues(4);
        contentValues.put("app_version", str3);
        contentValues.put("created_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("device_info", str);
        contentValues.put("audit_text", str2);
        SQLiteDatabase sQLiteDatabase = this.f184057b;
        if (DatabaseUtils.queryNumEntries(sQLiteDatabase, "device_sync_audit") < 100) {
            sQLiteDatabase.insert("device_sync_audit", null, contentValues);
            return;
        }
        try {
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.execSQL("delete from device_sync_audit where _id in (select _id from device_sync_audit order by _id limit 1)");
            sQLiteDatabase.insert("device_sync_audit", null, contentValues);
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception e4) {
            this.f184056a.error((String) null, (Throwable) e4);
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }
}
