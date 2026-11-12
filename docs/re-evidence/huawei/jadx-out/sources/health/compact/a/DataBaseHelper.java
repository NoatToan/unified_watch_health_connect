package health.compact.a;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdataaccessmodel.db.backup.SubstituteDataBaseHelper;
import defpackage.ltt;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.zetetic.database.DatabaseErrorHandler;
import net.zetetic.database.DefaultDatabaseErrorHandler;
import net.zetetic.database.sqlcipher.SQLiteConnection;
import net.zetetic.database.sqlcipher.SQLiteDatabase;
import net.zetetic.database.sqlcipher.SQLiteDatabaseHook;
import net.zetetic.database.sqlcipher.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes.dex */
public class DataBaseHelper extends SQLiteOpenHelper {
    private static volatile String e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile SQLiteDatabase f36533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f36534c;
    private final String h;
    private int j;
    private static final Map<String, DataBaseHelper> d = new ConcurrentHashMap(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Object> f36532a = new ConcurrentHashMap(5);

    @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    private DataBaseHelper(Context context, String str, String str2, SQLiteDatabaseHook sQLiteDatabaseHook, String str3) {
        super(context, str, str2, (SQLiteDatabase.CursorFactory) null, 112, 0, (DatabaseErrorHandler) new e(), sQLiteDatabaseHook, false);
        this.h = str3;
        this.f36534c = str;
    }

    private static void a() {
        if (TextUtils.isEmpty(e)) {
            synchronized (DataBaseHelper.class) {
                if (TextUtils.isEmpty(e)) {
                    byte[] bArrA = KeyManager.a(14);
                    if (bArrA != null) {
                        e = new String(bArrA, StandardCharsets.UTF_8);
                    }
                }
            }
        }
    }

    private static Object e(String str) {
        Object obj;
        Map<String, Object> map = f36532a;
        Object obj2 = map.get(str);
        if (obj2 != null) {
            return obj2;
        }
        synchronized (DataBaseHelper.class) {
            obj = map.get(str);
            if (obj == null) {
                obj = new Object();
                map.put(str, obj);
            }
        }
        return obj;
    }

    private static DataBaseHelper a(final String str) {
        String str2;
        Map<String, DataBaseHelper> map = d;
        DataBaseHelper dataBaseHelper = map.get(str);
        if (dataBaseHelper != null) {
            return dataBaseHelper;
        }
        synchronized (e(str)) {
            DataBaseHelper dataBaseHelper2 = map.get(str);
            if (dataBaseHelper2 != null) {
                f36532a.remove(str);
                return dataBaseHelper2;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Context context = BaseApplication.getContext();
            ltt.a(context);
            if (TextUtils.isEmpty("com.huawei.health")) {
                str2 = "SportDatas.db";
            } else {
                str2 = "com.huawei.health".replaceAll("\\.", "_") + str + ".db";
            }
            String str3 = str2;
            SQLiteDatabaseHook sQLiteDatabaseHook = new SQLiteDatabaseHook() { // from class: health.compact.a.DataBaseHelper.3
                @Override // net.zetetic.database.sqlcipher.SQLiteDatabaseHook
                public void preKey(SQLiteConnection sQLiteConnection) {
                }

                @Override // net.zetetic.database.sqlcipher.SQLiteDatabaseHook
                public void postKey(SQLiteConnection sQLiteConnection) {
                    if (sQLiteConnection == null) {
                        com.huawei.hwlogsmodel.LogUtil.j("DataBaseHelper", "getDataBaseHelper postKey database is null");
                        return;
                    }
                    try {
                        sQLiteConnection.executeRaw("PRAGMA cache_size = -2000;", null, null);
                        sQLiteConnection.executeRaw("PRAGMA mmap_size = 0;", null, null);
                        if (SharedPreferenceManager.b("health_db_module", "ExecCipherMigrateKey" + str, false)) {
                            return;
                        }
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        sQLiteConnection.executeRaw("PRAGMA cipher_migrate;", null, null);
                        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("R_DataBaseHelper", "moduleId:", str, " postKey migrateTime:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime2));
                        SharedPreferenceManager.a("health_db_module", "ExecCipherMigrateKey" + str, true);
                    } catch (SQLiteException e2) {
                        com.huawei.hwlogsmodel.LogUtil.e("DataBaseHelper", "getDataBaseHelper hook sqliteexception e=", e2.getMessage());
                    } catch (Exception unused) {
                        com.huawei.hwlogsmodel.LogUtil.e("DataBaseHelper", "getDataBaseHelper hook Exception");
                    }
                }
            };
            a();
            DataBaseHelper dataBaseHelper3 = new DataBaseHelper(context, str3, e, sQLiteDatabaseHook, str);
            map.put(str, dataBaseHelper3);
            f36532a.remove(str);
            if (!"SportDatas.db".equals(str3) && !KeyManager.a(str3)) {
                com.huawei.hwlogsmodel.LogUtil.e("R_DataBaseHelper", "getDataBaseHelper error,databaseName:", str3);
            }
            com.huawei.hwlogsmodel.LogUtil.a("DataBaseHelper", "end to getDataBaseHelper for the first time. the moduleId: ", str, "cost:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
            return dataBaseHelper3;
        }
    }

    public static DataBaseHelper d(String str) {
        return a(str);
    }

    public int c() {
        int i;
        synchronized (this) {
            i = this.j;
        }
        return i;
    }

    private void d(int i) {
        this.j = i;
    }

    public boolean b() {
        boolean zDeleteDatabase = BaseApplication.getContext().deleteDatabase(this.f36534c);
        health.compact.a.hwlogsmodel.ReleaseLogUtil.e("R_DataBaseHelper", "deleteDatabase ", this.f36534c, " ret=", Boolean.valueOf(zDeleteDatabase));
        return zDeleteDatabase;
    }

    public SQLiteDatabase e() {
        if (this.f36533b != null) {
            return this.f36533b;
        }
        synchronized (this) {
            if (this.f36533b != null) {
                return this.f36533b;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                this.f36533b = getWritableDatabase();
                health.compact.a.hwlogsmodel.ReleaseLogUtil.d("DataBaseHelper", "getDatabase for the first time. name= ", this.f36534c, " costTime:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                return this.f36533b;
            } catch (SQLiteException e2) {
                health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_DataBaseHelper", "getDatabase Exception=", ExceptionUtils.c(e2));
                try {
                    this.f36533b = SubstituteDataBaseHelper.b(this.h).e();
                    com.huawei.hwlogsmodel.LogUtil.a("DataBaseHelper", "end to getDatabase for the first time. name=", this.f36534c);
                    return this.f36533b;
                } catch (Exception e3) {
                    health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_DataBaseHelper", "getDatabase Exception2=", ExceptionUtils.c(e3));
                    return null;
                }
            } catch (Exception e4) {
                health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_DataBaseHelper", "getDatabase Exception3=", ExceptionUtils.c(e4));
                return null;
            }
        }
    }

    public void d() {
        e();
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (sQLiteDatabase == null) {
            com.huawei.hwlogsmodel.LogUtil.j("DataBaseHelper", "onUpgrade db is null");
            return;
        }
        synchronized (this) {
            com.huawei.hwlogsmodel.LogUtil.a("DataBaseHelper", "onUpgrade enter oldVersion=", Integer.valueOf(i), ",newVersion", Integer.valueOf(i2), ",databaseName=", this.f36534c);
            d(i);
            if (i == 101 && "com_huawei_bone8.db".equals(this.f36534c)) {
                a(sQLiteDatabase);
            }
            if ("com_huawei_health10033.db".equals(this.f36534c)) {
                if (i == 108) {
                    c(sQLiteDatabase);
                    i = 109;
                }
                if (i == 109 || i == 110) {
                    e(sQLiteDatabase);
                }
            }
            d(sQLiteDatabase);
        }
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", (String[]) null);
                if (cursorRawQuery != null) {
                    while (cursorRawQuery.moveToNext()) {
                        com.huawei.hwlogsmodel.LogUtil.a("DataBaseHelper", "onUpgradeExecSql table name = ", cursorRawQuery.getString(0));
                    }
                }
                sQLiteDatabase.execSQL("ALTER TABLE module_8_event_alarm RENAME TO module_8_event_alarm_temp");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS module_8_event_alarm(event_alarm_index integer,event_alarm_enable integer,event_alarm_time varchar(50),event_alarm_cycle integer,event_alarm_name varchar(50),User_ID varchar(50))");
                sQLiteDatabase.execSQL("insert into module_8_event_alarm(event_alarm_index,event_alarm_enable,event_alarm_time,event_alarm_cycle,event_alarm_name,User_ID) select event_alarm_index,event_alarm_enable,event_alarm_time,event_alarm_cycle,event_alarm_name,User_ID from module_8_event_alarm_temp");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS module_8_event_alarm_temp");
                sQLiteDatabase.execSQL("ALTER TABLE module_8_smart_alarm RENAME TO module_8_smart_alarm_temp");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS module_8_smart_alarm(smart_alarm_index integer,smart_alarm_enable integer,smart_alarm_time varchar(50),smart_alarm_cycle integer,smart_alarm_ahead_time integer,User_ID varchar(50))");
                sQLiteDatabase.execSQL("insert into module_8_smart_alarm(smart_alarm_index,smart_alarm_enable,smart_alarm_time,smart_alarm_cycle,smart_alarm_ahead_time,User_ID) select smart_alarm_index,smart_alarm_enable,smart_alarm_time,smart_alarm_cycle,smart_alarm_ahead_time,User_ID from module_8_smart_alarm_temp");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS module_8_smart_alarm_temp");
                com.huawei.hwlogsmodel.LogUtil.a("DataBaseHelper", "alarm db upgrade");
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (SQLiteException e2) {
                com.huawei.hwlogsmodel.LogUtil.e("DataBaseHelper", "onUpgradeExecSql SQLiteException e=", e2.getMessage());
                if (cursorRawQuery == null) {
                    return;
                }
                cursorRawQuery.close();
            } catch (Exception unused) {
                com.huawei.hwlogsmodel.LogUtil.e("DataBaseHelper", "onUpgradeExecSql Exception");
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    private void d(SQLiteDatabase sQLiteDatabase) {
        try {
            e(sQLiteDatabase, "resistanceFreq");
            e(sQLiteDatabase, "resistanceLeftArmRightArmHf");
            e(sQLiteDatabase, "resistanceLeftArmLeftLegHf");
            e(sQLiteDatabase, "resistanceLeftArmRightLegHf");
            e(sQLiteDatabase, "resistanceRightArmLeftLegHf");
            e(sQLiteDatabase, "resistanceRightArmRightLegHf");
            e(sQLiteDatabase, "resistanceLeftLegRightLegHf");
        } catch (Exception unused) {
            com.huawei.hwlogsmodel.LogUtil.e("DataBaseHelper", "upgradeVersion111to112 weightdata_db Exception");
        }
    }

    private void e(SQLiteDatabase sQLiteDatabase, String str) {
        boolean zA = a(sQLiteDatabase, "module_10031_hihealth_weightData", str);
        com.huawei.hwlogsmodel.LogUtil.a("DataBaseHelper", "upgradeVersion111to112 onUpgrade module_10031_hihealth_weightData isHas;", Boolean.valueOf(zA));
        if (zA) {
            sQLiteDatabase.execSQL("ALTER TABLE module_10031_hihealth_weightData ADD COLUMN " + str + "real default null");
        }
    }

    private void e(SQLiteDatabase sQLiteDatabase) {
        try {
            boolean zA = a(sQLiteDatabase, "module_10033_WiFiBindDevice", "source");
            com.huawei.hwlogsmodel.LogUtil.a("DataBaseHelper", "upgradeVersion109to110 device_db WiFi device source isHas:", Boolean.valueOf(zA));
            if (zA) {
                return;
            }
            sQLiteDatabase.execSQL("alter table module_10033_WiFiBindDevice add source integer end");
        } catch (Exception unused) {
            com.huawei.hwlogsmodel.LogUtil.e("DataBaseHelper", "upgradeVersion109to110 device_db Exception");
        }
    }

    private void c(SQLiteDatabase sQLiteDatabase) {
        try {
            boolean zA = a(sQLiteDatabase, "module_10033_WiFiBindDevice", "mac");
            com.huawei.hwlogsmodel.LogUtil.a("DataBaseHelper", "upgradeVersion108to109 onUpgrade device_db WiFi device isHas;", Boolean.valueOf(zA));
            if (zA) {
                return;
            }
            sQLiteDatabase.execSQL("alter table module_10033_WiFiBindDevice add mac TEXT end");
        } catch (Exception unused) {
            com.huawei.hwlogsmodel.LogUtil.e("DataBaseHelper", "upgradeVersion108to109 device_db Exception");
        }
    }

    private boolean a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(String.format(Locale.ENGLISH, "select sql from sqlite_master where type = 'table' and name = '%s'", str), (String[]) null);
        try {
            String string = cursorRawQuery.moveToFirst() ? cursorRawQuery.getString(cursorRawQuery.getColumnIndex("sql")) : null;
            cursorRawQuery.close();
            return string != null && string.contains(str2);
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    public static class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f36535b;

        public c(String str) {
            this.f36535b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TextUtils.isEmpty(this.f36535b)) {
                return;
            }
            com.huawei.hwlogsmodel.LogUtil.a("DataBaseHelper", "pre-getInstance DB:", this.f36535b);
            DataBaseHelper.d(this.f36535b).d();
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class e implements DatabaseErrorHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DatabaseErrorHandler f36536a;

        private e() {
            this.f36536a = new DefaultDatabaseErrorHandler();
        }

        @Override // net.zetetic.database.DatabaseErrorHandler
        public void onCorruption(SQLiteDatabase sQLiteDatabase, SQLiteException sQLiteException) {
            this.f36536a.onCorruption(sQLiteDatabase, sQLiteException);
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("R_DataBaseHelper", "db file corruption:", sQLiteDatabase.getPath());
        }
    }
}
