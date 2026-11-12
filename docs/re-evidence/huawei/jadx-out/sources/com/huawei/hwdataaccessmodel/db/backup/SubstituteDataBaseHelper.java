package com.huawei.hwdataaccessmodel.db.backup;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ltt;
import health.compact.a.KeyManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.zetetic.database.DatabaseErrorHandler;
import net.zetetic.database.DefaultDatabaseErrorHandler;
import net.zetetic.database.sqlcipher.SQLiteConnection;
import net.zetetic.database.sqlcipher.SQLiteDatabase;
import net.zetetic.database.sqlcipher.SQLiteDatabaseHook;
import net.zetetic.database.sqlcipher.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes2.dex */
public class SubstituteDataBaseHelper extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile String f17243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, SubstituteDataBaseHelper> f17244c = new ConcurrentHashMap(5);
    private static final Map<String, Object> e = new ConcurrentHashMap(5);
    private volatile SQLiteDatabase d;

    @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private SubstituteDataBaseHelper(Context context, String str, String str2, SQLiteDatabaseHook sQLiteDatabaseHook) {
        super(context, str, str2, (SQLiteDatabase.CursorFactory) null, 102, 0, (DatabaseErrorHandler) new b(), sQLiteDatabaseHook, false);
    }

    private static void b() {
        if (TextUtils.isEmpty(f17243b)) {
            synchronized (SubstituteDataBaseHelper.class) {
                if (TextUtils.isEmpty(f17243b)) {
                    byte[] bArrA = KeyManager.a(14);
                    if (bArrA != null) {
                        f17243b = new String(bArrA, StandardCharsets.UTF_8);
                    }
                }
            }
        }
    }

    private static Object c(String str) {
        Object obj;
        Map<String, Object> map = e;
        Object obj2 = map.get(str);
        if (obj2 != null) {
            return obj2;
        }
        synchronized (SubstituteDataBaseHelper.class) {
            obj = map.get(str);
            if (obj == null) {
                obj = new Object();
                map.put(str, obj);
            }
        }
        return obj;
    }

    private static SubstituteDataBaseHelper d(final String str) {
        String str2;
        Map<String, SubstituteDataBaseHelper> map = f17244c;
        SubstituteDataBaseHelper substituteDataBaseHelper = map.get(str);
        if (substituteDataBaseHelper != null) {
            return substituteDataBaseHelper;
        }
        synchronized (c(str)) {
            SubstituteDataBaseHelper substituteDataBaseHelper2 = map.get(str);
            if (substituteDataBaseHelper2 != null) {
                e.remove(str);
                return substituteDataBaseHelper2;
            }
            Context context = BaseApplication.getContext();
            ltt.a(context);
            String packageName = context.getPackageName();
            if (TextUtils.isEmpty(packageName)) {
                str2 = "SubstituteSportDatas.db";
            } else {
                str2 = packageName.replaceAll("\\.", "_") + "Sub" + str + ".db";
            }
            SQLiteDatabaseHook sQLiteDatabaseHook = new SQLiteDatabaseHook() { // from class: com.huawei.hwdataaccessmodel.db.backup.SubstituteDataBaseHelper.5
                @Override // net.zetetic.database.sqlcipher.SQLiteDatabaseHook
                public void preKey(SQLiteConnection sQLiteConnection) {
                }

                @Override // net.zetetic.database.sqlcipher.SQLiteDatabaseHook
                public void postKey(SQLiteConnection sQLiteConnection) {
                    if (sQLiteConnection == null) {
                        LogUtil.j("SubstituteDataBaseHelper", "postKey database is null");
                        return;
                    }
                    try {
                        sQLiteConnection.executeRaw("PRAGMA cache_size = -2000;", null, null);
                        sQLiteConnection.executeRaw("PRAGMA mmap_size = 0;", null, null);
                        if (SharedPreferenceManager.b("health_db_module", "ExecCipherMigrateKey" + str, false)) {
                            return;
                        }
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        sQLiteConnection.executeRaw("PRAGMA cipher_migrate;", null, null);
                        ReleaseLogUtil.d("SubstituteDataBaseHelper", " postKey migrateTime:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                        SharedPreferenceManager.a("health_db_module", "ExecCipherMigrateKey" + str, true);
                    } catch (SQLiteException e2) {
                        LogUtil.e("SubstituteDataBaseHelper", "hook sqliteexception e=", e2.getMessage());
                    } catch (Exception unused) {
                        LogUtil.e("SubstituteDataBaseHelper", "hook Exception");
                    }
                }
            };
            b();
            SubstituteDataBaseHelper substituteDataBaseHelper3 = new SubstituteDataBaseHelper(context, str2, f17243b, sQLiteDatabaseHook);
            map.put(str, substituteDataBaseHelper3);
            e.remove(str);
            return substituteDataBaseHelper3;
        }
    }

    public static SubstituteDataBaseHelper b(String str) {
        return d(str);
    }

    public SQLiteDatabase e() {
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            if (this.d != null) {
                return this.d;
            }
            this.d = getWritableDatabase();
            return this.d;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static class b implements DatabaseErrorHandler {
        private final DatabaseErrorHandler e;

        private b() {
            this.e = new DefaultDatabaseErrorHandler();
        }

        @Override // net.zetetic.database.DatabaseErrorHandler
        public void onCorruption(SQLiteDatabase sQLiteDatabase, SQLiteException sQLiteException) {
            this.e.onCorruption(sQLiteDatabase, sQLiteException);
            ReleaseLogUtil.e("SubstituteDataBaseHelper", "db file corruption:", sQLiteDatabase.getPath());
        }
    }
}
