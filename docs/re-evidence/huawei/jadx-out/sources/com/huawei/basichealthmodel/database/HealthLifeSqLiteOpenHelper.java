package com.huawei.basichealthmodel.database;

import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.CreativeType;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import defpackage.bxa;
import health.compact.a.KeyManager;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import java.nio.charset.StandardCharsets;
import net.zetetic.database.DatabaseErrorHandler;
import net.zetetic.database.DefaultDatabaseErrorHandler;
import net.zetetic.database.sqlcipher.SQLiteConnection;
import net.zetetic.database.sqlcipher.SQLiteDatabase;
import net.zetetic.database.sqlcipher.SQLiteDatabaseHook;
import net.zetetic.database.sqlcipher.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes4.dex */
public class HealthLifeSqLiteOpenHelper extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile HealthLifeSqLiteOpenHelper f5295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile String f5296b;
    private SQLiteDatabase h;
    private boolean i;
    private boolean j;
    private static final String[] d = {"challengeId Integer", "taskType Integer", "dataSource Integer"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f5297c = new byte[0];
    private static final SQLiteDatabaseHook e = new SQLiteDatabaseHook() { // from class: com.huawei.basichealthmodel.database.HealthLifeSqLiteOpenHelper.3
        @Override // net.zetetic.database.sqlcipher.SQLiteDatabaseHook
        public void preKey(SQLiteConnection sQLiteConnection) {
        }

        @Override // net.zetetic.database.sqlcipher.SQLiteDatabaseHook
        public void postKey(SQLiteConnection sQLiteConnection) {
            try {
                sQLiteConnection.executeRaw("PRAGMA cache_size = -2000;", null, null);
                sQLiteConnection.executeRaw("PRAGMA mmap_size = 0;", null, null);
                if (SharedPreferenceManager.b("health_db_module", "ExecCipherMigrateKeycom_huawei_health10031.db", false)) {
                    return;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                sQLiteConnection.executeRaw("PRAGMA cipher_migrate;", null, null);
                ReleaseLogUtil.c("R_HL_HealthLifeSqLiteOpenHelper", " postKey migrateTime:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                SharedPreferenceManager.a("health_db_module", "ExecCipherMigrateKeycom_huawei_health10031.db", true);
            } catch (SQLiteException e2) {
                ReleaseLogUtil.b("R_HL_HealthLifeSqLiteOpenHelper", "postKey sqLiteException ", ExceptionUtils.c(e2));
            } catch (Exception e3) {
                ReleaseLogUtil.b("R_HL_HealthLifeSqLiteOpenHelper", "postKey exception ", ExceptionUtils.c(e3));
            }
        }
    };

    public static HealthLifeSqLiteOpenHelper a() {
        if (f5295a == null) {
            synchronized (f5297c) {
                if (f5295a == null) {
                    i();
                    f5295a = new HealthLifeSqLiteOpenHelper();
                }
            }
        }
        return f5295a;
    }

    private HealthLifeSqLiteOpenHelper() {
        super(BaseApplication.b(), "com_huawei_health10031.db", f5296b, (SQLiteDatabase.CursorFactory) null, CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON, 0, (DatabaseErrorHandler) new e(), e, true);
        d();
    }

    private void d() {
        if (this.h != null) {
            return;
        }
        synchronized (f5297c) {
            if (this.h != null) {
                return;
            }
            try {
                this.h = getWritableDatabase();
            } catch (SQLiteException | UnsatisfiedLinkError e2) {
                ReleaseLogUtil.b("R_HL_HealthLifeSqLiteOpenHelper", "initDatabase exception ", ExceptionUtils.c(e2));
            }
        }
    }

    private static void i() {
        if (TextUtils.isEmpty(f5296b)) {
            synchronized (f5297c) {
                if (TextUtils.isEmpty(f5296b)) {
                    byte[] bArrA = KeyManager.a(14);
                    if (bArrA != null) {
                        f5296b = new String(bArrA, StandardCharsets.UTF_8);
                    }
                }
            }
        }
    }

    public SQLiteDatabase b() {
        d(this.h);
        return this.h;
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        LogUtil.a("HL_HealthLifeSqLiteOpenHelper", "onCreate database ", sQLiteDatabase);
        if (sQLiteDatabase == null) {
            return;
        }
        d(sQLiteDatabase);
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        LogUtil.a("HL_HealthLifeSqLiteOpenHelper", "onUpgrade database ", sQLiteDatabase, " oldVersion ", Integer.valueOf(i), " newVersion ", Integer.valueOf(i2));
        if (sQLiteDatabase != null && i < 113) {
            d(sQLiteDatabase);
        }
    }

    private void d(SQLiteDatabase sQLiteDatabase) {
        b(sQLiteDatabase);
        a(sQLiteDatabase);
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        if (this.i) {
            return;
        }
        if (sQLiteDatabase == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeSqLiteOpenHelper", "initDatabaseTableForConfig database is null");
            return;
        }
        if (!bxa.d(sQLiteDatabase, "module_10031_health_task_config")) {
            ReleaseLogUtil.c("R_HL_HealthLifeSqLiteOpenHelper", "initDatabaseTableForConfig createConfigTable");
            sQLiteDatabase.execSQL(c());
            return;
        }
        if (bxa.e(sQLiteDatabase, "module_10031_health_task_config", ParsedFieldTag.TASK_TYPE)) {
            ReleaseLogUtil.c("R_HL_HealthLifeSqLiteOpenHelper", "initDatabaseTableForConfig mIsConfigTableExist ", Boolean.valueOf(this.i));
            this.i = true;
            return;
        }
        ReleaseLogUtil.c("R_HL_HealthLifeSqLiteOpenHelper", "initDatabaseTableForConfig UPGRADE_TABLE_FIELD");
        for (String str : d) {
            try {
                sQLiteDatabase.execSQL("ALTER TABLE module_10031_health_task_config ADD " + str);
            } catch (SQLiteException e2) {
                ReleaseLogUtil.b("R_HL_HealthLifeSqLiteOpenHelper", "initDatabaseTableForConfig exception ", ExceptionUtils.c(e2));
            }
        }
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        if (this.j) {
            return;
        }
        if (sQLiteDatabase == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeSqLiteOpenHelper", "initDatabaseTableForRecord database is null");
            return;
        }
        if (!bxa.d(sQLiteDatabase, "module_10031_health_task_records")) {
            ReleaseLogUtil.c("R_HL_HealthLifeSqLiteOpenHelper", "initDatabaseTableForRecord createRecordTable");
            sQLiteDatabase.execSQL(e());
            return;
        }
        if (bxa.e(sQLiteDatabase, "module_10031_health_task_records", ParsedFieldTag.TASK_TYPE)) {
            ReleaseLogUtil.c("R_HL_HealthLifeSqLiteOpenHelper", "initDatabaseTableForRecord mIsRecordTableExist ", Boolean.valueOf(this.j));
            this.j = true;
            return;
        }
        ReleaseLogUtil.c("R_HL_HealthLifeSqLiteOpenHelper", "initDatabaseTableForRecord UPGRADE_TABLE_FIELD");
        for (String str : d) {
            try {
                sQLiteDatabase.execSQL("ALTER TABLE module_10031_health_task_records ADD " + str);
            } catch (SQLiteException e2) {
                ReleaseLogUtil.b("R_HL_HealthLifeSqLiteOpenHelper", "initDatabaseTableForRecord exception ", ExceptionUtils.c(e2));
            }
        }
    }

    private String c() {
        return "create table IF NOT EXISTS module_10031_health_task_config(huid text not null,timezone text,timestamp Long not null,recordDay Integer not null,id Integer not null,dataSource Integer,challengeId Integer,taskType Integer,syncStatus Integer,condition text,reserve text,target text not null,lastTarget text not null,primary key (huid, recordDay, id))";
    }

    private String e() {
        return "create table IF NOT EXISTS module_10031_health_task_records(huid text not null,timezone text,timestamp Long not null,recordDay Integer not null,id Integer not null,dataSource Integer,challengeId Integer,taskType Integer,syncStatus Integer,condition text,reserve text,target text not null,result text not null,type Integer not null,status Integer not null,restStatus Integer,primary key (huid, recordDay, id))";
    }

    static class e implements DatabaseErrorHandler {
        private final DatabaseErrorHandler d;

        private e() {
            this.d = new DefaultDatabaseErrorHandler();
        }

        @Override // net.zetetic.database.DatabaseErrorHandler
        public void onCorruption(SQLiteDatabase sQLiteDatabase, SQLiteException sQLiteException) {
            this.d.onCorruption(sQLiteDatabase, sQLiteException);
            if (sQLiteDatabase == null) {
                ReleaseLogUtil.d("R_HL_HealthLifeSqLiteOpenHelper", "InnerDatabaseErrorHandler onCorruption sqLiteDatabase is null");
            } else {
                ReleaseLogUtil.d("R_HL_HealthLifeSqLiteOpenHelper", "InnerDatabaseErrorHandler onCorruption getPath ", sQLiteDatabase.getPath());
            }
        }
    }
}
