package com.huawei.hihealthservice.db.helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hihealth.HiAccountInfo;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.type.HiDeviceType;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OperationKey;
import com.huawei.utils.FoundationCommonUtil;
import com.huawei.watchface.mvp.ui.activity.ScanImageActivity;
import defpackage.kue;
import defpackage.kun;
import defpackage.kup;
import defpackage.kuq;
import defpackage.kur;
import defpackage.kus;
import defpackage.kut;
import defpackage.kuu;
import defpackage.kuv;
import defpackage.kuw;
import defpackage.kux;
import defpackage.kuy;
import defpackage.kuz;
import defpackage.kvb;
import defpackage.kvc;
import defpackage.kvd;
import defpackage.kve;
import defpackage.kvf;
import defpackage.kvg;
import defpackage.kvh;
import defpackage.kvi;
import defpackage.kvj;
import defpackage.kvk;
import defpackage.kvl;
import defpackage.kvm;
import defpackage.kvn;
import defpackage.kvo;
import defpackage.kvp;
import defpackage.kvq;
import defpackage.kvr;
import defpackage.kvs;
import defpackage.kvt;
import defpackage.kvu;
import defpackage.kvv;
import defpackage.kvx;
import defpackage.kvz;
import defpackage.kwa;
import defpackage.kwd;
import defpackage.kwf;
import defpackage.kwi;
import defpackage.liq;
import defpackage.ljp;
import defpackage.ljv;
import defpackage.lkb;
import defpackage.ltt;
import health.compact.a.CommonUtil;
import health.compact.a.FileSensitiveProtectUtil;
import health.compact.a.KeyManager;
import health.compact.a.LogAnonymous;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.zetetic.database.DatabaseErrorHandler;
import net.zetetic.database.DefaultDatabaseErrorHandler;
import net.zetetic.database.sqlcipher.SQLiteConnection;
import net.zetetic.database.sqlcipher.SQLiteCursor;
import net.zetetic.database.sqlcipher.SQLiteDatabase;
import net.zetetic.database.sqlcipher.SQLiteDatabaseHook;
import net.zetetic.database.sqlcipher.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes10.dex */
public class HiHealthDBHelper extends SQLiteOpenHelper {
    private static volatile String e;
    private volatile SQLiteDatabase g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f12354a = new Object();
    private static final Map<String, HiHealthDBHelper> d = new ConcurrentHashMap(5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, Object> f12355b = new ConcurrentHashMap(5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile int f12356c = 0;

    static {
        SQLiteCursor.setCursorWindowSize(ScanImageActivity.SCAN_IMAGE_LENGTH_LIMIT);
    }

    private HiHealthDBHelper(Context context, String str, SQLiteDatabaseHook sQLiteDatabaseHook) {
        super(context, str, e, (SQLiteDatabase.CursorFactory) null, 17, 0, new a(), sQLiteDatabaseHook, SystemInfo.d());
    }

    public static HiHealthDBHelper d() {
        return d("hihealth_003.db");
    }

    public static HiHealthDBHelper e(String str) {
        if ("hihealth_003_export.db".equals(str) || "hihealth_sensitive_export.db".equals(str)) {
            if (TextUtils.isEmpty(str) || !CommonUtil.av()) {
                str = "hihealth_003_export.db";
            }
            return d(str);
        }
        if (TextUtils.isEmpty(str) || !CommonUtil.av()) {
            str = "hihealth_003.db";
        }
        return d(str);
    }

    private static void c(String str) {
        e = str;
    }

    public void c() {
        if (SystemInfo.d()) {
            ReleaseLogUtil.d("HiH_HiHealthDBHelper", "start to execWalCheckPoint");
            try {
                for (Map.Entry<String, HiHealthDBHelper> entry : d.entrySet()) {
                    if (entry.getValue() != null && entry.getValue().getWritableDatabase() != null) {
                        entry.getValue().getWritableDatabase().rawExecSQL("PRAGMA wal_checkpoint(FULL);", new Object[0]);
                        ReleaseLogUtil.d("HiH_HiHealthDBHelper", "Success to execWalCheckPoint, dbName:", entry.getKey());
                    } else {
                        ReleaseLogUtil.d("HiH_HiHealthDBHelper", "fail to execWalCheckPoint, dbName:", entry.getKey());
                    }
                }
                ReleaseLogUtil.d("HiH_HiHealthDBHelper", "Success to execWalCheckPoint");
            } catch (Exception e2) {
                ReleaseLogUtil.a("HiH_HiHealthDBHelper", "failed to execWalCheckPoint ", ExceptionUtils.c(e2));
            }
        }
    }

    private static HiHealthDBHelper d(final String str) {
        String strD;
        Map<String, HiHealthDBHelper> map = d;
        HiHealthDBHelper hiHealthDBHelper = map.get(str);
        if (hiHealthDBHelper != null) {
            return hiHealthDBHelper;
        }
        synchronized (b(str)) {
            HiHealthDBHelper hiHealthDBHelper2 = map.get(str);
            if (hiHealthDBHelper2 != null) {
                f12355b.remove(str);
                return hiHealthDBHelper2;
            }
            final Context contextB = BaseApplication.b();
            ltt.a(contextB);
            SQLiteDatabaseHook sQLiteDatabaseHook = new SQLiteDatabaseHook() { // from class: com.huawei.hihealthservice.db.helper.HiHealthDBHelper.1
                @Override // net.zetetic.database.sqlcipher.SQLiteDatabaseHook
                public void preKey(SQLiteConnection sQLiteConnection) {
                }

                @Override // net.zetetic.database.sqlcipher.SQLiteDatabaseHook
                public void postKey(SQLiteConnection sQLiteConnection) {
                    try {
                        sQLiteConnection.executeRaw("PRAGMA cache_size = -2000;", null, null);
                        sQLiteConnection.executeRaw("PRAGMA mmap_size = 0;", null, null);
                        if (lkb.b(contextB, "ExecCipherMigrateKey" + str, 0, false)) {
                            return;
                        }
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        sQLiteConnection.executeRaw("PRAGMA cipher_migrate;", null, null);
                        ReleaseLogUtil.d("HiH_HiHealthDBHelper", "DB:", str, " postKey migrateTime:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                        lkb.c(contextB, "ExecCipherMigrateKey" + str, true, 0);
                    } catch (SQLiteException e2) {
                        ReleaseLogUtil.a("HiH_HiHealthDBHelper", "hook sqliteexception e=", e2.getMessage());
                        if (kwf.e(e2)) {
                            ReleaseLogUtil.a("HiH_HiHealthDBHelper", "postKey file is not a database, need to clean clone data");
                            KeyManager.a(false);
                        }
                    } catch (Exception e3) {
                        ReleaseLogUtil.a("HiH_HiHealthDBHelper", "hook Exception", LogAnonymous.b(e3));
                    }
                }
            };
            if ("hihealth_sensitive.db".equals(str)) {
                strD = FileSensitiveProtectUtil.d(str);
                FileSensitiveProtectUtil.e();
            } else {
                strD = str;
            }
            e();
            HiHealthDBHelper hiHealthDBHelper3 = new HiHealthDBHelper(contextB, strD, sQLiteDatabaseHook);
            if (!lkb.b(contextB, "CopySensitiveDataKey", 0, false)) {
                ReleaseLogUtil.d("Debug_HiHealthDBHelper", "start to copySensitiveData");
                hiHealthDBHelper3.d(hiHealthDBHelper3.getWritableDatabase());
                lkb.c(contextB, "CopySensitiveDataKey", true, 0);
            }
            map.put(str, hiHealthDBHelper3);
            f12355b.remove(str);
            return hiHealthDBHelper3;
        }
    }

    private static void e() {
        if (TextUtils.isEmpty(e)) {
            synchronized (f12354a) {
                if (TextUtils.isEmpty(e)) {
                    byte[] bArrA = KeyManager.a(13);
                    if (bArrA != null) {
                        LogUtil.d("Debug_HiHealthDBHelper", "initDbKey keyByte != null");
                        c(new String(bArrA, StandardCharsets.UTF_8));
                    } else {
                        LogUtil.d("Debug_HiHealthDBHelper", "initDbKey keyByte = null");
                        c("");
                    }
                }
            }
        }
    }

    private static Object b(String str) {
        Object obj;
        Map<String, Object> map = f12355b;
        Object obj2 = map.get(str);
        if (obj2 != null) {
            return obj2;
        }
        synchronized (f12354a) {
            obj = map.get(str);
            if (obj == null) {
                obj = new Object();
                map.put(str, obj);
            }
        }
        return obj;
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        String databaseName = getName();
        ReleaseLogUtil.d("HiH_HiHealthDBHelper", "onCreate VERSION = ", 17, ", NAME = ", databaseName);
        if ("hihealth_003.db".equals(databaseName)) {
            c(sQLiteDatabase);
        } else if (FileSensitiveProtectUtil.d("hihealth_sensitive.db").equals(databaseName)) {
            sQLiteDatabase.execSQL(kvc.c());
            sQLiteDatabase.execSQL(kvc.b());
            sQLiteDatabase.execSQL(kvc.e());
            sQLiteDatabase.execSQL(kvc.g());
            sQLiteDatabase.execSQL(kvm.c());
            sQLiteDatabase.execSQL(kvm.e());
        } else {
            LogUtil.j("Debug_HiHealthDBHelper", "onCreate is other condition");
        }
        LogUtil.a("HiH_HiHealthDBHelper", "onCreate end");
    }

    private void a(String str) {
        kwi kwiVarB = kwi.b();
        int iB = kwiVarB.b(str);
        if (iB <= 0) {
            kwiVarB.d(ljp.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), str), 0);
        }
        ReleaseLogUtil.d("HiH_HiHealthDBHelper", "compensationInsertAppInfo app = ", Integer.valueOf(iB), ", packageName = ", str);
    }

    private void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(kur.a());
        sQLiteDatabase.execSQL(kvs.a());
        sQLiteDatabase.execSQL(kvs.e());
        sQLiteDatabase.execSQL(kun.a());
        sQLiteDatabase.execSQL(kun.e());
        sQLiteDatabase.execSQL(kvr.c());
        sQLiteDatabase.execSQL(kvr.d());
        sQLiteDatabase.execSQL(kwa.c());
        sQLiteDatabase.execSQL(kuw.d());
        sQLiteDatabase.execSQL(kuw.a());
        sQLiteDatabase.execSQL(kus.d());
        sQLiteDatabase.execSQL(kus.a());
        sQLiteDatabase.execSQL(kut.c());
        sQLiteDatabase.execSQL(kuv.d());
        sQLiteDatabase.execSQL(kvd.a());
        sQLiteDatabase.execSQL(kvd.c());
        sQLiteDatabase.execSQL(kvd.b());
        sQLiteDatabase.execSQL(kvd.h());
        sQLiteDatabase.execSQL(kvf.c());
        sQLiteDatabase.execSQL(kvf.b());
        sQLiteDatabase.execSQL(kvf.e());
        sQLiteDatabase.execSQL(kvf.g());
        sQLiteDatabase.execSQL(kvi.e());
        sQLiteDatabase.execSQL(kvi.b());
        sQLiteDatabase.execSQL(kvh.d());
        sQLiteDatabase.execSQL(kvh.c());
        sQLiteDatabase.execSQL(kvk.c());
        sQLiteDatabase.execSQL(kvk.b());
        sQLiteDatabase.execSQL(kvl.d());
        sQLiteDatabase.execSQL(kvl.e());
        sQLiteDatabase.execSQL(kvl.b());
        sQLiteDatabase.execSQL(kvt.b(false));
        sQLiteDatabase.execSQL(kvt.b());
        sQLiteDatabase.execSQL(kvu.d());
        sQLiteDatabase.execSQL(kvu.c());
        sQLiteDatabase.execSQL(kuz.a());
        sQLiteDatabase.execSQL(kvq.c());
        sQLiteDatabase.execSQL(kvq.e());
        sQLiteDatabase.execSQL(kvq.b());
        sQLiteDatabase.execSQL(kvv.c());
        sQLiteDatabase.execSQL(kvv.e());
        sQLiteDatabase.execSQL(kvj.e());
        sQLiteDatabase.execSQL(kvx.d());
        sQLiteDatabase.execSQL(kup.d());
        sQLiteDatabase.execSQL(kup.c());
        sQLiteDatabase.execSQL(kuy.b());
        sQLiteDatabase.execSQL(kvz.a());
        sQLiteDatabase.execSQL(kvb.d());
        sQLiteDatabase.execSQL(kvo.e());
        sQLiteDatabase.execSQL(kvo.b());
        sQLiteDatabase.execSQL(kvp.d());
        sQLiteDatabase.execSQL(kvn.e());
        sQLiteDatabase.execSQL(kve.e());
        sQLiteDatabase.execSQL(kve.c());
        sQLiteDatabase.execSQL(kuq.a());
        sQLiteDatabase.execSQL(kuq.c());
        sQLiteDatabase.execSQL(kuu.d());
        sQLiteDatabase.execSQL(kuu.a());
        sQLiteDatabase.execSQL(kux.e());
        sQLiteDatabase.execSQL(kvg.a());
        sQLiteDatabase.execSQL(kvg.e());
        b(sQLiteDatabase);
        a(sQLiteDatabase);
        a();
        liq.e();
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        LogUtil.a("HiH_HiHealthDBHelper", "onUpgrade oldVersion = ", Integer.valueOf(i), ",newVersion =  ", Integer.valueOf(i2));
        int i3 = i;
        while (i3 < i2) {
            if (i3 >= 8) {
                d(sQLiteDatabase);
            }
            switch (i3) {
                case 1:
                    l(sQLiteDatabase);
                    break;
                case 2:
                    p(sQLiteDatabase);
                    break;
                case 3:
                    r(sQLiteDatabase);
                    break;
                case 4:
                    h(sQLiteDatabase);
                    break;
                case 5:
                    j(sQLiteDatabase);
                    break;
                case 6:
                    k(sQLiteDatabase);
                    break;
                case 7:
                    m(sQLiteDatabase);
                    break;
                case 8:
                    e(sQLiteDatabase);
                    break;
                case 9:
                    o(sQLiteDatabase);
                    break;
                case 10:
                    t(sQLiteDatabase);
                    break;
                case 11:
                    f(sQLiteDatabase);
                    break;
                case 12:
                    s(sQLiteDatabase);
                    break;
                case 13:
                    q(sQLiteDatabase);
                    break;
                case 14:
                    g(sQLiteDatabase);
                    break;
                case 15:
                    i(sQLiteDatabase);
                    break;
                case 16:
                    n(sQLiteDatabase);
                    break;
            }
            i3++;
        }
        LogUtil.a("HiH_HiHealthDBHelper", "onUpgrade end oldVersion = ", Integer.valueOf(i), ",newVersion =  ", Integer.valueOf(i2), ",upgradeTo = ", Integer.valueOf(i3));
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("device_unique_code", "-1");
        contentValues.put("deviceName", HiDeviceType.c(1));
        contentValues.put(DeviceCategoryFragment.DEVICE_TYPE, (Integer) 1);
        contentValues.put("firmwareVersion", Build.VERSION.RELEASE);
        contentValues.put("manufacturer", Build.MANUFACTURER);
        contentValues.put("model", Build.MODEL);
        contentValues.put("createTime", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("sync_status", (Integer) 0);
        if (sQLiteDatabase.insert("hihealth_device", (String) null, contentValues) <= 0) {
            LogUtil.j("Debug_HiHealthDBHelper", "initManualInputDeviceInfo insert fail");
        }
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        String androidId = FoundationCommonUtil.getAndroidId(BaseApplication.b());
        if (TextUtils.isEmpty(androidId)) {
            LogUtil.j("Debug_HiHealthDBHelper", "initPhoneDeviceInfo insert fail: Unauthorized to get android ID");
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("device_unique_code", androidId);
        contentValues.put("deviceName", Build.PRODUCT);
        contentValues.put(DeviceCategoryFragment.DEVICE_TYPE, (Integer) 32);
        contentValues.put("firmwareVersion", Build.VERSION.RELEASE);
        contentValues.put("hardwareVersion", Build.VERSION.RELEASE);
        contentValues.put("softwareVersion", Build.VERSION.RELEASE);
        contentValues.put("manufacturer", Build.MANUFACTURER);
        contentValues.put("model", kwd.c());
        contentValues.put("device_mac", Build.USER);
        contentValues.put("createTime", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("sync_status", (Integer) 0);
        LogUtil.d("Debug_HiHealthDBHelper", "initPhoneDeviceInfo values = ", contentValues);
        if (sQLiteDatabase.insert("hihealth_device", (String) null, contentValues) <= 0) {
            LogUtil.j("Debug_HiHealthDBHelper", "initPhoneDeviceInfo insert fail");
        }
    }

    private void a() {
        LogUtil.a("Debug_HiHealthDBHelper", "enter initUserAccount");
        Context contextB = BaseApplication.b();
        final LoginInit loginInit = LoginInit.getInstance(contextB);
        if (!loginInit.getIsLogined() || Utils.k()) {
            ReleaseLogUtil.d("HiH_HiHealthDBHelper", "initUserData not login");
            return;
        }
        final String accountInfo = loginInit.getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.e("HiH_HiHealthDBHelper", "initUserData userId is empty");
            return;
        }
        a("com.huawei.health");
        HiAccountInfo hiAccountInfo = new HiAccountInfo();
        String accountInfo2 = loginInit.getAccountInfo(1015);
        hiAccountInfo.setAccessToken(accountInfo2);
        hiAccountInfo.setHuid(accountInfo);
        hiAccountInfo.setServiceToken(accountInfo2);
        hiAccountInfo.setSiteId(CommonUtil.n(contextB, loginInit.getAccountInfo(1009)));
        HiHealthNativeApi.a(contextB).hiLogin(hiAccountInfo, new HiCommonListener() { // from class: com.huawei.hihealthservice.db.helper.HiHealthDBHelper.4
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                LogUtil.a("HiH_HiHealthDBHelper", "hiLogin onSuccess.");
                HiHealthDBHelper.a(accountInfo, loginInit);
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.j("HiH_HiHealthDBHelper", "hiLogin failed errCode:", Integer.valueOf(i), "errorMsg:", obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str, LoginInit loginInit) {
        HiUserInfo hiUserInfo = new HiUserInfo();
        hiUserInfo.setUser(1073741824);
        hiUserInfo.setHuid(str);
        hiUserInfo.setBirthday(CommonUtil.j(loginInit.getAccountInfo(1006)));
        int iJ = CommonUtil.j(loginInit.getAccountInfo(1005));
        if (iJ == 0) {
            hiUserInfo.setGender(1);
        } else if (iJ == 1) {
            hiUserInfo.setGender(0);
        } else {
            hiUserInfo.setGender(iJ);
        }
        hiUserInfo.setHeadImgUrl(loginInit.getAccountInfo(1003));
        String accountInfo = loginInit.getAccountInfo(1002);
        if (TextUtils.isEmpty(accountInfo)) {
            accountInfo = loginInit.getAccountInfo(1001);
        }
        hiUserInfo.setName(accountInfo);
        hiUserInfo.setModifiedIntent(268435456);
        HiHealthNativeApi.a(BaseApplication.b()).setUserData(hiUserInfo, new HiCommonListener() { // from class: com.huawei.hihealthservice.db.helper.HiHealthDBHelper.2
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                ReleaseLogUtil.d("HiH_HiHealthDBHelper", "initUserInfo success");
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                ReleaseLogUtil.e("HiH_HiHealthDBHelper", "initUserInfo fail:", Integer.valueOf(i), ",msg:", obj.toString());
            }
        });
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper, androidx.sqlite.db.SupportSQLiteOpenHelper
    public SQLiteDatabase getWritableDatabase() {
        if (this.g != null) {
            return this.g;
        }
        e();
        if (TextUtils.isEmpty(e)) {
            ReleaseLogUtil.e("HiH_HiHealthDBHelper", "dbKey is also null return");
            return null;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (this) {
            if (this.g != null) {
                return this.g;
            }
            try {
                this.g = super.getWritableDatabase();
            } catch (SQLiteException e2) {
                String strC = ExceptionUtils.c(e2);
                ReleaseLogUtil.a("HiH_HiHealthDBHelper", "getWritableDatabase e=", strC);
                if (strC != null && strC.contains("database is locked")) {
                    LogUtil.b("Debug_HiHealthDBHelper", "database is locked");
                }
                if (!TextUtils.isEmpty(e)) {
                    this.g = b();
                }
            } catch (Exception e3) {
                ReleaseLogUtil.a("HiH_HiHealthDBHelper", "getWritableDatabase Exception2=", ExceptionUtils.c(e3));
            }
            ReleaseLogUtil.d("Debug_HiHealthDBHelper", "db:", getName(), " WAL:", Boolean.valueOf(this.g != null && this.g.isWriteAheadLoggingEnabled()), " costTime:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
            return this.g;
        }
    }

    private SQLiteDatabase b() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(5);
        SQLiteDatabase writableDatabase = null;
        try {
            LogUtil.d("Debug_HiHealthDBHelper", "try open database again!");
            writableDatabase = super.getWritableDatabase();
            linkedHashMap.put("errorCode", Integer.toString(0));
            ljv.d(BaseApplication.b()).c(OperationKey.HEALTH_APP_DATABASE_UNAVAILABLE_85070025.value(), linkedHashMap, false);
            return writableDatabase;
        } catch (SQLiteException e2) {
            ReleaseLogUtil.a("HiH_HiHealthDBHelper", "getWritableDatabase sqliteexcepiont e2=", e2.getMessage());
            String message = e2.getMessage();
            if (TextUtils.isEmpty(message)) {
                return writableDatabase;
            }
            if (message.contains("SQL logic error: , while compiling: select count(*) from sqlite_master")) {
                f12356c++;
            }
            if (message.contains("file is not a database") || f12356c >= 10) {
                LogUtil.e("Debug_HiHealthDBHelper", "getWritableDatabaseSync need to clean clone data");
                f12356c = 0;
                linkedHashMap.put("errorCode", Integer.toString(message.contains("file is not a database") ? -1 : -2));
                ljv.d(BaseApplication.b()).c(OperationKey.HEALTH_APP_DATABASE_UNAVAILABLE_85070025.value(), linkedHashMap, false);
                KeyManager.a(false);
            }
            return writableDatabase;
        } catch (Exception e3) {
            ReleaseLogUtil.a("HiH_HiHealthDBHelper", "getWritableDatabase Exception1=", ExceptionUtils.c(e3));
            return writableDatabase;
        }
    }

    private void l(SQLiteDatabase sQLiteDatabase) {
        LogUtil.a("Debug_HiHealthDBHelper", "upgradeVersionOne create table sample_session_core and user_preference");
        sQLiteDatabase.execSQL(kvk.c());
        sQLiteDatabase.execSQL(kvk.b());
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS user_preference");
        sQLiteDatabase.execSQL(kvv.c());
        sQLiteDatabase.execSQL(kvv.e());
        LogUtil.a("Debug_HiHealthDBHelper", "upgradeVersionOne end");
    }

    private void p(SQLiteDatabase sQLiteDatabase) {
        LogUtil.a("Debug_HiHealthDBHelper", "upgradeVersionTwo create hihealth_authorization and hihealth_permission and point_health_stress");
        sQLiteDatabase.execSQL(kve.e());
        sQLiteDatabase.execSQL(kve.c());
        sQLiteDatabase.execSQL(kup.d());
        sQLiteDatabase.execSQL(kup.c());
        sQLiteDatabase.execSQL(kuy.b());
        LogUtil.a("Debug_HiHealthDBHelper", "upgradeVersionTwo end");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0121 A[LOOP:1: B:19:0x011b->B:21:0x0121, LOOP_END] */
    private void r(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList;
        Iterator it;
        LogUtil.a("Debug_HiHealthDBHelper", "upgradeVersionThree copy dataclient to new");
        ArrayList arrayList2 = new ArrayList(10);
        Cursor cursorQuery = sQLiteDatabase.query("hihealth_dataclient", new String[]{"_id", "client_uuid", "user_id", "device_id", "app_id", "cloud_device", "sync_status", "create_time"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("user_id", Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("user_id"))));
                    contentValues.put("app_id", Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("app_id"))));
                    contentValues.put("_id", Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("_id"))));
                    contentValues.put("cloud_device", Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndex("cloud_device"))));
                    contentValues.put("device_id", Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("device_id"))));
                    contentValues.put("sync_status", Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("sync_status"))));
                    contentValues.put("client_uuid", cursorQuery.getString(cursorQuery.getColumnIndex("client_uuid")));
                    contentValues.put("create_time", Long.valueOf(System.currentTimeMillis()));
                    contentValues.put("need_uploaddata", (Integer) 1);
                    arrayList = arrayList2;
                    try {
                        arrayList.add(contentValues);
                        arrayList2 = arrayList;
                    } catch (Exception e2) {
                        e = e2;
                        ReleaseLogUtil.a("HiH_HiHealthDBHelper", "upgradeVersionThree Exception", LogAnonymous.b(e));
                        cursorQuery.close();
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS hihealth_dataclient");
                        sQLiteDatabase.execSQL(kus.d());
                        sQLiteDatabase.execSQL(kus.a());
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            sQLiteDatabase.insert("hihealth_dataclient", (String) null, (ContentValues) it.next());
                        }
                        LogUtil.a("Debug_HiHealthDBHelper", "upgradeVersionThree end");
                    }
                } catch (Exception e3) {
                    e = e3;
                    arrayList = arrayList2;
                }
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        arrayList = arrayList2;
        cursorQuery.close();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS hihealth_dataclient");
        sQLiteDatabase.execSQL(kus.d());
        sQLiteDatabase.execSQL(kus.a());
        it = arrayList.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.insert("hihealth_dataclient", (String) null, (ContentValues) it.next());
        }
        LogUtil.a("Debug_HiHealthDBHelper", "upgradeVersionThree end");
    }

    private void h(SQLiteDatabase sQLiteDatabase) {
        LogUtil.a("Debug_HiHealthDBHelper", "upgradeVersionFour create config model data tables");
        sQLiteDatabase.execSQL(kuq.a());
        sQLiteDatabase.execSQL(kuq.c());
        sQLiteDatabase.execSQL(kuu.d());
        sQLiteDatabase.execSQL(kuu.a());
        LogUtil.a("Debug_HiHealthDBHelper", "upgradeVersionFour end");
    }

    private void j(SQLiteDatabase sQLiteDatabase) {
        LogUtil.a("Debug_HiHealthDBHelper", "upgradeVersionFive create kit data tables");
        sQLiteDatabase.execSQL(kvr.c());
        sQLiteDatabase.execSQL(kvr.d());
        sQLiteDatabase.execSQL(kux.e());
        LogUtil.a("Debug_HiHealthDBHelper", "upgradeVersionFive end");
    }

    private void k(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(kwa.c());
        LogUtil.a("Debug_HiHealthDBHelper", "upgradeVersionSix end");
    }

    private void m(SQLiteDatabase sQLiteDatabase) {
        LogUtil.a("Debug_HiHealthDBHelper", "upgradeVersionSeven start：copy sensitive data to SECE database");
        d(sQLiteDatabase);
        LogUtil.a("Debug_HiHealthDBHelper", "upgradeVersionSeven end");
    }

    private void e(SQLiteDatabase sQLiteDatabase) {
        LogUtil.a("Debug_HiHealthDBHelper", "upgradeVersionEight start");
        if ("hihealth_003.db".equals(getName())) {
            sQLiteDatabase.execSQL("ALTER TABLE sample_sequence ADD simple_data TEXT");
            sQLiteDatabase.execSQL("ALTER TABLE sample_sequence ADD sub_type_id INTEGER");
            sQLiteDatabase.execSQL("ALTER TABLE sample_sequence ADD reserve TEXT");
            kue.d(sQLiteDatabase);
            LogUtil.a("Debug_HiHealthDBHelper", "upgradeVersionEight alter table end");
        }
    }

    private void o(SQLiteDatabase sQLiteDatabase) {
        if ("hihealth_003.db".equals(getName())) {
            sQLiteDatabase.execSQL(kvt.b(true));
            sQLiteDatabase.execSQL(kvt.b());
            sQLiteDatabase.execSQL(kvu.d());
            sQLiteDatabase.execSQL(kvu.c());
            LogUtil.a("Debug_HiHealthDBHelper", "upgradeVersionNine end");
        }
    }

    private void t(SQLiteDatabase sQLiteDatabase) {
        if ("hihealth_003.db".equals(getName())) {
            sQLiteDatabase.execSQL("ALTER TABLE business_data ADD data_source TEXT");
            LogUtil.a("Debug_HiHealthDBHelper", "upgradeVersionTen end");
        }
    }

    private void f(SQLiteDatabase sQLiteDatabase) {
        if ("hihealth_003.db".equals(getName())) {
            sQLiteDatabase.execSQL(kvg.a());
            sQLiteDatabase.execSQL(kvg.e());
            LogUtil.a("Debug_HiHealthDBHelper", "upgradeVersionEleven end");
        }
    }

    private void s(SQLiteDatabase sQLiteDatabase) {
        if ("hihealth_003.db".equals(getName())) {
            sQLiteDatabase.execSQL("ALTER TABLE hihealth_device ADD prod_id TEXT");
            sQLiteDatabase.execSQL("ALTER TABLE hihealth_device ADD device_udid TEXT");
            LogUtil.a("Debug_HiHealthDBHelper", "upgradeVersionTwelve end");
        }
    }

    private void q(SQLiteDatabase sQLiteDatabase) {
        if ("hihealth_003.db".equals(getName())) {
            sQLiteDatabase.execSQL("ALTER TABLE hihealth_device ADD sub_prod_id TEXT");
            LogUtil.a("HiH_HiHealthDBHelper", "upgradeVersionThirteen end");
        }
    }

    private void g(SQLiteDatabase sQLiteDatabase) {
        if (!"hihealth_003.db".equals(getName())) {
            sQLiteDatabase.execSQL(kvf.a());
            sQLiteDatabase.execSQL(kvf.b());
            sQLiteDatabase.execSQL(kvf.e());
        } else {
            sQLiteDatabase.execSQL(kvf.a());
            sQLiteDatabase.execSQL(kvf.b());
            sQLiteDatabase.execSQL(kvd.d());
            sQLiteDatabase.execSQL(kvd.c());
            sQLiteDatabase.execSQL(kvf.e());
            sQLiteDatabase.execSQL(kvd.b());
            sQLiteDatabase.execSQL(kvq.b());
            sQLiteDatabase.execSQL(kvl.c());
            sQLiteDatabase.execSQL(kvl.b());
        }
        LogUtil.a("HiH_HiHealthDBHelper", "upgradeVersionFourteen end");
    }

    private void i(SQLiteDatabase sQLiteDatabase) {
        if (!"hihealth_003.db".equals(getName())) {
            sQLiteDatabase.execSQL(kvf.e());
            sQLiteDatabase.execSQL(kvf.g());
        } else {
            sQLiteDatabase.execSQL(kvf.g());
            sQLiteDatabase.execSQL(kvd.h());
            sQLiteDatabase.execSQL(kvl.e());
        }
        LogUtil.a("HiH_HiHealthDBHelper", "upgradeVersionFifteen end");
    }

    private void n(SQLiteDatabase sQLiteDatabase) {
        if ("hihealth_003.db".equals(getName())) {
            sQLiteDatabase.execSQL("ALTER TABLE hihealth_device ADD sync_status INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE sync_anchor ADD sync_data_category INTEGER NOT NULL DEFAULT -1");
            kvo.a(sQLiteDatabase);
            LogUtil.a("Debug_HiHealthDBHelper", "upgradeVersionSixteen end");
        }
    }

    private void d(SQLiteDatabase sQLiteDatabase) {
        if (CommonUtil.av() && "hihealth_003.db".equals(getName())) {
            SQLiteDatabase writableDatabase = e("hihealth_sensitive.db").getWritableDatabase();
            if (writableDatabase == null) {
                LogUtil.j("Debug_HiHealthDBHelper", "Create new dataBase failed");
                return;
            }
            kue.d(sQLiteDatabase, writableDatabase);
            kue.c(sQLiteDatabase, writableDatabase);
            LogUtil.a("Debug_HiHealthDBHelper", "copy sensitive data to SECE database end");
        }
    }

    static class a implements DatabaseErrorHandler {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final DatabaseErrorHandler f12360c;

        private a() {
            this.f12360c = new DefaultDatabaseErrorHandler();
        }

        @Override // net.zetetic.database.DatabaseErrorHandler
        public void onCorruption(SQLiteDatabase sQLiteDatabase, SQLiteException sQLiteException) {
            this.f12360c.onCorruption(sQLiteDatabase, sQLiteException);
            ReleaseLogUtil.e("HiH_HiHealthDBHelper", "db file corruption:", sQLiteDatabase.getPath());
        }
    }
}
