package com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ltt;
import defpackage.xji;
import health.compact.a.CommonUtil;
import health.compact.a.KeyManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import net.zetetic.database.DatabaseErrorHandler;
import net.zetetic.database.DefaultDatabaseErrorHandler;
import net.zetetic.database.sqlcipher.SQLiteConnection;
import net.zetetic.database.sqlcipher.SQLiteDatabase;
import net.zetetic.database.sqlcipher.SQLiteDatabaseHook;
import net.zetetic.database.sqlcipher.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes11.dex */
public class SecurityCalendarDbHelper extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile SecurityCalendarDbHelper f17470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile SQLiteDatabase f17471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f17472c = new Object();
    private static final SQLiteDatabaseHook e = new SQLiteDatabaseHook() { // from class: com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.SecurityCalendarDbHelper.3
        @Override // net.zetetic.database.sqlcipher.SQLiteDatabaseHook
        public void preKey(SQLiteConnection sQLiteConnection) {
        }

        @Override // net.zetetic.database.sqlcipher.SQLiteDatabaseHook
        public void postKey(SQLiteConnection sQLiteConnection) {
            if (sQLiteConnection == null) {
                LogUtil.j("SecurityCalendarDbHelper", "DB_HOOK#postKey(SQLiteDatabase): database is null");
                return;
            }
            try {
                sQLiteConnection.executeRaw("PRAGMA cache_size = -2000;", null, null);
                sQLiteConnection.executeRaw("PRAGMA mmap_size = 0;", null, null);
                if (SharedPreferenceManager.b("health_db_module", "ExecCipherMigrateKeycalendar_sync_data.db", false)) {
                    return;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                sQLiteConnection.executeRaw("PRAGMA cipher_migrate;", null, null);
                ReleaseLogUtil.d("R_SecurityCalendarDbHelper", " postKey migrateTime:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                SharedPreferenceManager.a("health_db_module", "ExecCipherMigrateKeycalendar_sync_data.db", true);
            } catch (SQLiteException e2) {
                LogUtil.e("SecurityCalendarDbHelper", "DB_HOOK#postKey(SQLiteDatabase): SQLiteException occurred.", e2.getMessage());
            } catch (Exception unused) {
                LogUtil.e("SecurityCalendarDbHelper", "DB_HOOK#postKey(SQLiteDatabase): third lib unknown exception");
            }
        }
    };
    private static volatile String d = "ydt";

    private SecurityCalendarDbHelper(Context context) {
        super(context, "calendar_sync_data.db", d, (SQLiteDatabase.CursorFactory) null, 1, 0, (DatabaseErrorHandler) new c(), e, false);
        LogUtil.a("SecurityCalendarDbHelper", "SecurityContactsDbHelper: ");
    }

    public static SecurityCalendarDbHelper e(Context context) {
        SecurityCalendarDbHelper securityCalendarDbHelper;
        if (context == null) {
            context = BaseApplication.getContext();
        }
        synchronized (f17472c) {
            if (f17470a == null) {
                ltt.a(context);
                c(context);
                c();
                f17470a = new SecurityCalendarDbHelper(context);
            }
            securityCalendarDbHelper = f17470a;
        }
        return securityCalendarDbHelper;
    }

    private static void c(Context context) {
        if (!CommonUtil.av()) {
            LogUtil.a("SecurityCalendarDbHelper", "setDbFileFlag: is not emui11+.");
            return;
        }
        File databasePath = context.getDatabasePath("calendar_sync_data.db");
        if (databasePath.exists()) {
            LogUtil.a("SecurityCalendarDbHelper", "setDbFileFlag: database file existed.");
            return;
        }
        try {
            if (databasePath.createNewFile()) {
                xji.a(databasePath.getPath(), "S2", 0);
            } else {
                LogUtil.a("SecurityCalendarDbHelper", "setDbFileFlag: failed to create db file.");
            }
        } catch (IOException unused) {
            LogUtil.e("SecurityCalendarDbHelper", "setDbFileFlag: create db file error.");
        }
    }

    public void a() {
        LogUtil.a("SecurityCalendarDbHelper", "createSyncStateTable: ", "calendar_sync_state");
        if (!e("calendar_sync_state")) {
            b("CREATE TABLE calendar_sync_state (_id INTEGER PRIMARY KEY AUTOINCREMENT,device_id VARCHAR(36), device_table_name VARCHAR(36), device_sync_flag INTEGER, device_sync_state INTEGER,minor INTEGER)");
        } else {
            LogUtil.a("SecurityCalendarDbHelper", "createSyncStateTable: table existed.");
        }
    }

    public void c(String str) {
        LogUtil.a("SecurityCalendarDbHelper", "createSyncStateTable: " + str);
        if (!e(str)) {
            b("CREATE TABLE " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,event_uuid TEXT, operation TEXT, event_id INTEGER, dtstart INTEGER, dtend INTEGER, all_day INTEGER, calendarFeature TEXT)");
            return;
        }
        LogUtil.a("SecurityCalendarDbHelper", "createSyncStateTable: table existed.");
    }

    private void b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SecurityCalendarDbHelper", "executeSql: sql is null or empty.");
            return;
        }
        if (f17471b == null) {
            LogUtil.j("SecurityCalendarDbHelper", "executeSql: sDatabase is null");
        } else {
            if (!f17471b.isOpen()) {
                LogUtil.j("SecurityCalendarDbHelper", "executeSql: sDatabase is not open.");
                return;
            }
            try {
                f17471b.execSQL(str);
            } catch (SQLiteException unused) {
                LogUtil.e("SecurityCalendarDbHelper", "executeSql: occurred SQLException");
            }
        }
    }

    public SQLiteDatabase d() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (f17472c) {
            if (f17471b == null) {
                e(f17470a, d);
            }
            sQLiteDatabase = f17471b;
        }
        return sQLiteDatabase;
    }

    public void d(String str) {
        LogUtil.a("SecurityCalendarDbHelper", "clearTable: tableName= " + str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("SecurityCalendarDbHelper", "clearTable: tableName is null");
            return;
        }
        if (f17471b == null) {
            LogUtil.j("SecurityCalendarDbHelper", "clearTable: sDb is null");
            return;
        }
        if (!e(str)) {
            LogUtil.a("SecurityCalendarDbHelper", "clearTable: do not have this table: ", str);
            return;
        }
        try {
            f17471b.execSQL("delete from " + str);
        } catch (SQLiteException unused) {
            LogUtil.e("SecurityCalendarDbHelper", "clearTable: occurred SQLException");
        }
    }

    public boolean e(String str) {
        return d(f17471b, str);
    }

    public boolean d(SQLiteDatabase sQLiteDatabase, String str) {
        boolean z = false;
        if (sQLiteDatabase == null) {
            LogUtil.j("SecurityCalendarDbHelper", "isExist: db is null");
            return false;
        }
        if (str == null || TextUtils.isEmpty(str.trim())) {
            LogUtil.j("SecurityCalendarDbHelper", "isExist: tableName is null");
            return false;
        }
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select count(*) as tableCount from sqlite_master where type ='table' and name = '" + str.trim() + "'", (String[]) null);
            try {
                if (cursorRawQuery.moveToNext() && cursorRawQuery.getInt(0) > 0) {
                    z = true;
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return z;
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SQLiteException unused) {
            LogUtil.e("SecurityCalendarDbHelper", "isExist: ", str, "occurred SQLiteException");
            return false;
        } catch (IllegalStateException unused2) {
            LogUtil.e("SecurityCalendarDbHelper", "isExist: ", str, "occurred IllegalStateException");
            return false;
        }
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        LogUtil.a("SecurityCalendarDbHelper", "onCreate: ");
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        LogUtil.a("SecurityCalendarDbHelper", "onUpgrade: oldVersion=", Integer.valueOf(i), "newVersion=", Integer.valueOf(i2));
    }

    private static void c() {
        byte[] bArrA;
        LogUtil.a("SecurityCalendarDbHelper", "initDbKey: ");
        if (!TextUtils.isEmpty(d) || (bArrA = KeyManager.a(14)) == null) {
            return;
        }
        d = new String(bArrA, StandardCharsets.UTF_8);
    }

    private static void e(SQLiteOpenHelper sQLiteOpenHelper, String str) {
        LogUtil.a("SecurityCalendarDbHelper", "initDb: ");
        try {
            f17471b = sQLiteOpenHelper.getWritableDatabase();
        } catch (SQLiteException e2) {
            LogUtil.e("SecurityCalendarDbHelper", "initDb: net.sqlcipher.database.SQLiteException occurred." + e2.getMessage());
            c(e2);
        } catch (Exception unused) {
            LogUtil.e("SecurityCalendarDbHelper", "initDb: third lib unknown exception");
        }
    }

    private static void c(SQLiteException sQLiteException) {
        int iC = SharedPreferenceManager.c("SecurityCalendarDbHelper", "sqliteExceptionNum", 0);
        SharedPreferenceManager.d("SecurityCalendarDbHelper", "sqliteExceptionNum", iC + 1);
        ReleaseLogUtil.a("R_SecurityCalendarDbHelper", "processInitDbException getSyncContactState: ", Integer.valueOf(iC));
        if (iC >= 2) {
            SharedPreferenceManager.d("SecurityCalendarDbHelper", "sqliteExceptionNum", 0);
            String message = sQLiteException.getMessage();
            if (!TextUtils.isEmpty(message) && message.contains("SQL logic error") && message.contains("select count(*) from sqlite_master")) {
                int iC2 = SharedPreferenceManager.c("SecurityCalendarDbHelper", "exceptionDeleteNum", 0);
                SharedPreferenceManager.d("SecurityCalendarDbHelper", "exceptionDeleteNum", iC2 + 1);
                ReleaseLogUtil.a("R_SecurityCalendarDbHelper", "initDb SQL logic error deleteDatabase", Integer.valueOf(iC2));
                BaseApplication.getContext().deleteDatabase("calendar_sync_data.db");
                Process.killProcess(Process.myPid());
            }
        }
    }

    static class c implements DatabaseErrorHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final DatabaseErrorHandler f17473b;

        private c() {
            this.f17473b = new DefaultDatabaseErrorHandler();
        }

        @Override // net.zetetic.database.DatabaseErrorHandler
        public void onCorruption(SQLiteDatabase sQLiteDatabase, SQLiteException sQLiteException) {
            this.f17473b.onCorruption(sQLiteDatabase, sQLiteException);
            ReleaseLogUtil.e("SecurityCalendarDbHelper", "db file corruption:", sQLiteDatabase.getPath());
        }
    }
}
