package com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.db;

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
public class SecurityContactsDbHelper extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile SQLiteDatabase f17478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile String f17479b;
    private static volatile SecurityContactsDbHelper d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f17480c = new Object();
    private static final SQLiteDatabaseHook e = new SQLiteDatabaseHook() { // from class: com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.db.SecurityContactsDbHelper.4
        @Override // net.zetetic.database.sqlcipher.SQLiteDatabaseHook
        public void preKey(SQLiteConnection sQLiteConnection) {
        }

        @Override // net.zetetic.database.sqlcipher.SQLiteDatabaseHook
        public void postKey(SQLiteConnection sQLiteConnection) {
            if (sQLiteConnection == null) {
                LogUtil.j("SecurityContactsDbHelper", "DB_HOOK#postKey(SQLiteDatabase): database is null");
                return;
            }
            try {
                sQLiteConnection.executeRaw("PRAGMA cache_size = -2000;", null, null);
                sQLiteConnection.executeRaw("PRAGMA mmap_size = 0;", null, null);
                if (SharedPreferenceManager.b("health_db_module", "ExecCipherMigrateKeycontact_sync_data.db", false)) {
                    return;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                sQLiteConnection.executeRaw("PRAGMA cipher_migrate;", null, null);
                ReleaseLogUtil.d("R_SecurityContactsDbHelper", "postKey migrateTime:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                SharedPreferenceManager.a("health_db_module", "ExecCipherMigrateKeycontact_sync_data.db", true);
            } catch (SQLiteException e2) {
                LogUtil.e("SecurityContactsDbHelper", "DB_HOOK#postKey(SQLiteDatabase): SQLiteException occurred.", e2.getMessage());
            } catch (Exception unused) {
                LogUtil.e("SecurityContactsDbHelper", "DB_HOOK#postKey(SQLiteDatabase): third lib unknown exception");
            }
        }
    };

    private SecurityContactsDbHelper(Context context) {
        super(context, "contact_sync_data.db", f17479b, (SQLiteDatabase.CursorFactory) null, 1, 0, (DatabaseErrorHandler) new e(), e, false);
        LogUtil.a("SecurityContactsDbHelper", "SecurityContactsDbHelper: ");
    }

    public static SecurityContactsDbHelper d(Context context) {
        SecurityContactsDbHelper securityContactsDbHelper;
        if (context == null) {
            context = BaseApplication.getContext();
        }
        synchronized (f17480c) {
            if (d == null) {
                ltt.a(context);
                c(context);
                e();
                d = new SecurityContactsDbHelper(context);
            }
            securityContactsDbHelper = d;
        }
        return securityContactsDbHelper;
    }

    private static void c(Context context) {
        if (!CommonUtil.av()) {
            LogUtil.a("SecurityContactsDbHelper", "setDbFileFlag: is not emui11+.");
            return;
        }
        File databasePath = context.getDatabasePath("contact_sync_data.db");
        if (databasePath.exists()) {
            LogUtil.a("SecurityContactsDbHelper", "setDbFileFlag: database file existed.");
            return;
        }
        try {
            if (databasePath.createNewFile()) {
                xji.a(databasePath.getPath(), "S2", 0);
            } else {
                LogUtil.a("SecurityContactsDbHelper", "setDbFileFlag: failed to create db file.");
            }
        } catch (IOException unused) {
            LogUtil.e("SecurityContactsDbHelper", "setDbFileFlag: create db file error.");
        }
    }

    public void e(String str) {
        LogUtil.a("SecurityContactsDbHelper", "createSyncDataTable: ", str);
        if (!b(str)) {
            d("CREATE TABLE " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,raw_contact_id VARCHAR(10), raw_contact_uid VARCHAR(32), raw_contact_feature VARCHAR(25))");
            return;
        }
        LogUtil.a("SecurityContactsDbHelper", "createSyncDataTable: table existed.");
    }

    public void c(String str) {
        LogUtil.a("SecurityContactsDbHelper", "createSportSyncDataTable: ", str);
        if (!b(str)) {
            d("CREATE TABLE " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,raw_contact_id VARCHAR(10), raw_contact_uid VARCHAR(32), raw_contact_feature VARCHAR(25),raw_contact_sortletter VARCHAR(10))");
            return;
        }
        LogUtil.a("SecurityContactsDbHelper", "createSportSyncDataTable: table existed.");
    }

    public void d() {
        LogUtil.a("SecurityContactsDbHelper", "createSyncStateTable: ", "contact_sync_state");
        if (!b("contact_sync_state")) {
            d("CREATE TABLE contact_sync_state (_id INTEGER PRIMARY KEY AUTOINCREMENT,device_id VARCHAR(36), device_table_name VARCHAR(36), device_sync_flag INTEGER, device_sync_state INTEGER, device_last_sync_time INTEGER)");
        } else {
            LogUtil.a("SecurityContactsDbHelper", "createSyncStateTable: table existed.");
        }
    }

    private void d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SecurityContactsDbHelper", "executeSql: sql is null or empty.");
            return;
        }
        if (f17478a == null) {
            LogUtil.j("SecurityContactsDbHelper", "executeSql: sDatabase is null");
        } else {
            if (!f17478a.isOpen()) {
                LogUtil.j("SecurityContactsDbHelper", "executeSql: sDatabase is not open.");
                return;
            }
            try {
                f17478a.execSQL(str);
            } catch (SQLiteException unused) {
                LogUtil.e("SecurityContactsDbHelper", "executeSql: occurred SQLException");
            }
        }
    }

    public SQLiteDatabase c() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (f17480c) {
            if (f17478a == null) {
                a(d, f17479b);
            }
            sQLiteDatabase = f17478a;
        }
        return sQLiteDatabase;
    }

    public void a(String str) {
        LogUtil.a("SecurityContactsDbHelper", "clearTable: tableName=", str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("SecurityContactsDbHelper", "clearTable: tableName is null");
            return;
        }
        if (f17478a == null) {
            LogUtil.j("SecurityContactsDbHelper", "clearTable: sDb is null");
            return;
        }
        if (!b(str)) {
            LogUtil.a("SecurityContactsDbHelper", "clearTable: do not have this table: ", str);
            return;
        }
        try {
            f17478a.execSQL("delete from " + str);
        } catch (SQLiteException unused) {
            LogUtil.e("SecurityContactsDbHelper", "clearTable: occurred SQLException");
        }
    }

    public boolean b(String str) {
        return a(f17478a, str);
    }

    public boolean a(SQLiteDatabase sQLiteDatabase, String str) {
        boolean z = false;
        if (sQLiteDatabase == null) {
            LogUtil.j("SecurityContactsDbHelper", "isExist: db is null");
            return false;
        }
        if (str == null || TextUtils.isEmpty(str.trim())) {
            LogUtil.j("SecurityContactsDbHelper", "isExist: tableName is null");
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
            LogUtil.e("SecurityContactsDbHelper", "isExist: ", str, "occurred SQLiteException");
            return false;
        } catch (IllegalStateException unused2) {
            LogUtil.e("SecurityContactsDbHelper", "isExist: ", str, "occurred IllegalStateException");
            return false;
        }
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        LogUtil.a("SecurityContactsDbHelper", "onCreate: ");
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        LogUtil.a("SecurityContactsDbHelper", "onUpgrade: oldVersion=", Integer.valueOf(i), "newVersion=", Integer.valueOf(i2));
    }

    private static void e() {
        byte[] bArrA;
        LogUtil.a("SecurityContactsDbHelper", "initDbKey: ");
        if (!TextUtils.isEmpty(f17479b) || (bArrA = KeyManager.a(14)) == null) {
            return;
        }
        f17479b = new String(bArrA, StandardCharsets.UTF_8);
    }

    private static void a(SQLiteOpenHelper sQLiteOpenHelper, String str) {
        LogUtil.a("SecurityContactsDbHelper", "initDb: ");
        try {
            f17478a = sQLiteOpenHelper.getWritableDatabase();
        } catch (SQLiteException e2) {
            LogUtil.e("SecurityContactsDbHelper", "initDb: net.sqlcipher.database.SQLiteException occurred.", e2.getMessage());
            a(e2);
            return;
        } catch (Exception unused) {
            LogUtil.e("SecurityContactsDbHelper", "initDb: third lib unknown exception");
        }
        SharedPreferenceManager.d("SecurityContactsDbHelper", "sqliteExceptionNum", 0);
    }

    private static void a(SQLiteException sQLiteException) {
        int iC = SharedPreferenceManager.c("SecurityContactsDbHelper", "sqliteExceptionNum", 0);
        SharedPreferenceManager.d("SecurityContactsDbHelper", "sqliteExceptionNum", iC + 1);
        ReleaseLogUtil.a("R_SecurityContactsDbHelper", "processInitDbException getSyncContactState: ", Integer.valueOf(iC));
        if (iC >= 2) {
            SharedPreferenceManager.d("SecurityContactsDbHelper", "sqliteExceptionNum", 0);
            String message = sQLiteException.getMessage();
            if (!TextUtils.isEmpty(message) && message.contains("SQL logic error") && message.contains("select count(*) from sqlite_master")) {
                int iC2 = SharedPreferenceManager.c("SecurityContactsDbHelper", "exceptionDeleteNum", 0);
                SharedPreferenceManager.d("SecurityContactsDbHelper", "exceptionDeleteNum", iC2 + 1);
                ReleaseLogUtil.a("R_SecurityContactsDbHelper", "initDb SQL logic error deleteDatabase", Integer.valueOf(iC2));
                BaseApplication.getContext().deleteDatabase("contact_sync_data.db");
                Process.killProcess(Process.myPid());
            }
        }
    }

    static class e implements DatabaseErrorHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final DatabaseErrorHandler f17481b;

        private e() {
            this.f17481b = new DefaultDatabaseErrorHandler();
        }

        @Override // net.zetetic.database.DatabaseErrorHandler
        public void onCorruption(SQLiteDatabase sQLiteDatabase, SQLiteException sQLiteException) {
            this.f17481b.onCorruption(sQLiteDatabase, sQLiteException);
            ReleaseLogUtil.e("SecurityContactsDbHelper", "db file corruption:", sQLiteDatabase.getPath());
        }
    }
}
