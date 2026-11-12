package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.store.SharedStoreManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.KeyManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import net.zetetic.database.DatabaseErrorHandler;
import net.zetetic.database.DefaultDatabaseErrorHandler;
import net.zetetic.database.sqlcipher.SQLiteConnection;
import net.zetetic.database.sqlcipher.SQLiteDatabase;
import net.zetetic.database.sqlcipher.SQLiteDatabaseHook;
import net.zetetic.database.sqlcipher.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes3.dex */
public class yhp {
    private yhp() {
    }

    public static void a() {
        if (b()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: yhp.5
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (yhp.class) {
                        if (yhp.b()) {
                            yhp.g();
                            yhp.f();
                            yhp.h();
                        }
                    }
                }
            });
        }
    }

    public static boolean b() {
        return !"ok".equals(SharedStoreManager.a("keyvaldb_encrypt_udsdevice").getString("sync_data", ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f() {
        SharedPreferences.Editor editorEdit = SharedStoreManager.a("keyvaldb_encrypt_udsdevice").edit();
        editorEdit.putString("sync_data", "ok");
        editorEdit.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0  */
    public static void g() throws Throwable {
        Exception e;
        SQLiteDatabase sQLiteDatabaseE;
        ReleaseLogUtil.d("R_UdsDataToMmkvUtil", "sync Data From Database");
        Cursor cursor = null;
        try {
            try {
                sQLiteDatabaseE = d.b().e();
                try {
                    if (sQLiteDatabaseE == null) {
                        LogUtil.e("UdsDataToMmkvUtil", "database is null.");
                        if (sQLiteDatabaseE != null) {
                            sQLiteDatabaseE.close();
                            return;
                        }
                        return;
                    }
                    Cursor cursorQuery = sQLiteDatabaseE.query("UdsDeviceTable", null, null, null, null, null, null);
                    if (cursorQuery == null) {
                        LogUtil.e("UdsDataToMmkvUtil", "cursor is null.");
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (sQLiteDatabaseE != null) {
                            sQLiteDatabaseE.close();
                            return;
                        }
                        return;
                    }
                    if (cursorQuery.moveToFirst()) {
                        HashSet hashSet = new HashSet();
                        do {
                            b(hashSet, cursorQuery.getString(cursorQuery.getColumnIndex("identity")), cursorQuery.getString(cursorQuery.getColumnIndex("deviceInfo")), cursorQuery.getString(cursorQuery.getColumnIndex("deviceStatus")), cursorQuery.getString(cursorQuery.getColumnIndex("deviceCapability")));
                        } while (cursorQuery.moveToNext());
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (sQLiteDatabaseE != null) {
                        sQLiteDatabaseE.close();
                    }
                } catch (Exception e2) {
                    e = e2;
                    LogUtil.e("UdsDataToMmkvUtil", "syncDataFromDatabase Exception: ", ExceptionUtils.c(e));
                    if (0 != 0) {
                        cursor.close();
                    }
                    if (sQLiteDatabaseE != null) {
                        sQLiteDatabaseE.close();
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    cursor.close();
                }
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            sQLiteDatabaseE = null;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                cursor.close();
            }
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private static void b(Set<String> set, String str, String str2, String str3, String str4) {
        SharedPreferences.Editor editorEdit = SharedStoreManager.a("keyvaldb_encrypt_udsdevice").edit();
        set.add(str);
        editorEdit.putString("identitys", new Gson().toJson(set));
        editorEdit.putString(str + "_deviceInfo", str2);
        editorEdit.putString(str + "_deviceStatus", str3);
        editorEdit.putString(str + "_deviceCapability", str4);
        editorEdit.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h() {
        LogUtil.a("UdsDataToMmkvUtil", "deleteDatabase ", "com_huawei_health_UdsDevicesDatas.db", " ret=", Boolean.valueOf(BaseApplication.b().deleteDatabase("com_huawei_health_UdsDevicesDatas.db")));
    }

    /* JADX INFO: loaded from: classes20.dex */
    static class d extends SQLiteOpenHelper {
        @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }

        private d(Context context, String str, String str2, SQLiteDatabaseHook sQLiteDatabaseHook) {
            super(context, str, str2, (SQLiteDatabase.CursorFactory) null, 1, 0, (DatabaseErrorHandler) new c(), sQLiteDatabaseHook, false);
            ltt.a(context);
        }

        public static d b() {
            String str;
            SQLiteDatabaseHook sQLiteDatabaseHook = new SQLiteDatabaseHook() { // from class: yhp.d.1
                @Override // net.zetetic.database.sqlcipher.SQLiteDatabaseHook
                public void preKey(SQLiteConnection sQLiteConnection) {
                }

                @Override // net.zetetic.database.sqlcipher.SQLiteDatabaseHook
                public void postKey(SQLiteConnection sQLiteConnection) {
                    if (sQLiteConnection == null) {
                        LogUtil.e("UdsDeviceDataBaseHelper", "getDataBaseHelper postKey database is null");
                        return;
                    }
                    try {
                        sQLiteConnection.executeRaw("PRAGMA cache_size = -2000;", null, null);
                        sQLiteConnection.executeRaw("PRAGMA mmap_size = 0;", null, null);
                        if (SharedPreferenceManager.b("health_db_module", "ExecCipherMigrateKeycom_huawei_health_UdsDevicesDatas.db", false)) {
                            return;
                        }
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        sQLiteConnection.executeRaw("PRAGMA cipher_migrate;", null, null);
                        ReleaseLogUtil.d("UdsDeviceDataBaseHelper", " postKey migrateTime:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                        SharedPreferenceManager.a("health_db_module", "ExecCipherMigrateKeycom_huawei_health_UdsDevicesDatas.db", true);
                    } catch (SQLiteException e) {
                        LogUtil.e("UdsDeviceDataBaseHelper", "getDataBaseHelper hook sqliteexception: ", ExceptionUtils.c(e));
                    }
                }
            };
            byte[] bArrA = KeyManager.a(14);
            if (bArrA == null) {
                str = "";
            } else {
                str = new String(bArrA, StandardCharsets.UTF_8);
            }
            if (TextUtils.isEmpty(str)) {
                LogUtil.e("UdsDeviceDataBaseHelper", "getDatabase sDatabaseKey is null");
                return null;
            }
            return new d(BaseApplication.b(), "com_huawei_health_UdsDevicesDatas.db", str, sQLiteDatabaseHook);
        }

        static class c implements DatabaseErrorHandler {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final DatabaseErrorHandler f53340a;

            private c() {
                this.f53340a = new DefaultDatabaseErrorHandler();
            }

            @Override // net.zetetic.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase, SQLiteException sQLiteException) {
                this.f53340a.onCorruption(sQLiteDatabase, sQLiteException);
                ReleaseLogUtil.e("UdsDeviceDataBaseHelper", "db file corruption:", sQLiteDatabase.getPath());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SQLiteDatabase e() {
            SQLiteDatabase writableDatabase;
            try {
                writableDatabase = getWritableDatabase();
                try {
                    LogUtil.a("UdsDeviceDataBaseHelper", "getDatabase and open database.");
                    return writableDatabase;
                } catch (SQLiteException e) {
                    e = e;
                    ReleaseLogUtil.a("R_UdsDeviceDataBaseHelper", "getDatabase Exception: ", ExceptionUtils.c(e));
                    return writableDatabase;
                }
            } catch (SQLiteException e2) {
                e = e2;
                writableDatabase = null;
            }
        }

        @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            LogUtil.e("UdsDeviceDataBaseHelper", "create Storage Data Table");
            try {
                sQLiteDatabase.execSQL("create table if not exists UdsDeviceTable (id integer primary key autoincrement, identity text, deviceInfo text, deviceStatus text, deviceCapability text)");
            } catch (SQLiteException e) {
                LogUtil.e("UdsDeviceDataBaseHelper", "createStorageDataTable SQLiteException: ", ExceptionUtils.c(e));
            }
        }
    }
}
