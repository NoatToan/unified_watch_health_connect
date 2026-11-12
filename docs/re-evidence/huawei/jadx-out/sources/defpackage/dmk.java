package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.manager.DeviceCloudSharePreferencesManager;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import health.compact.a.CommonUtil;
import health.compact.a.DataBaseHelper;
import health.compact.a.DbManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class dmk extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static dmk f32005c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f32004b = new Object();
    private static final Object d = new Object();
    private static final Map<String, Integer> e = new HashMap(10);

    public static class c {
        private static final String[] e = {"productId", "deviceId", "deviceCode", "sn", "model", "deviceType", ProfileRequestConstants.MANU, "prodId", ProfileRequestConstants.HIV, ProfileRequestConstants.FWV, ProfileRequestConstants.HWV, ProfileRequestConstants.SWV, "mac", ProfileRequestConstants.PROT_TYPE, "serviceInfo", "source"};

        public static final String[] b() {
            return (String[]) e.clone();
        }
    }

    public static class e {
        private static final String[] d = {"productId", "deviceId", "deviceModel", "deviceTypeId"};

        public static String[] a() {
            return (String[]) d.clone();
        }
    }

    public static class a {
        private static final String[] e = {"deviceId", "subUser"};

        public static String[] c() {
            return (String[]) e.clone();
        }
    }

    private dmk(Context context) {
        super(context, "device.db", (SQLiteDatabase.CursorFactory) null, 4);
    }

    public static dmk d() {
        synchronized (f32004b) {
            if (f32005c == null) {
                LogUtil.j("DeviceDataBaseHelper", "Enter getInstance");
                f32005c = new dmk(dxw.d());
            }
        }
        return f32005c;
    }

    public Cursor d(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceDataBaseHelper", "query table is null");
            return null;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        LogUtil.d("DeviceDataBaseHelper", "raw query data from device.db ", str);
        return readableDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    private String e(String str) {
        if ("WiFiBindDevice".equals(str) || "WiFiDeviceSubUser".equals(str)) {
            return "10033";
        }
        if ("WiFiDeviceList".equals(str)) {
            return "10034";
        }
        return "";
    }

    public long e(String str, ContentValues contentValues) {
        long jInsertOrThrow;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            LogUtil.j("DeviceDataBaseHelper", "do not writedate base on main thread");
        }
        long j = -1;
        if (contentValues == null) {
            LogUtil.j("DeviceDataBaseHelper", "cant not insert empty value");
            return -1L;
        }
        LogUtil.a("DeviceDataBaseHelper", "insert to table ", str);
        LogUtil.d("DeviceDataBaseHelper", "insert values", contentValues.toString());
        synchronized (d) {
            try {
                jInsertOrThrow = getWritableDatabase().insertOrThrow(str, null, contentValues);
                try {
                    LogUtil.a("DeviceDataBaseHelper", "after insert to rowId ", Long.valueOf(jInsertOrThrow));
                    if (jInsertOrThrow != -1) {
                        a(str, contentValues);
                    }
                } catch (SQLException unused) {
                    j = jInsertOrThrow;
                    LogUtil.e("DeviceDataBaseHelper", "getRowId SQLException!");
                    jInsertOrThrow = j;
                }
            } catch (SQLException unused2) {
            }
        }
        return jInsertOrThrow;
    }

    private void a(String str, ContentValues contentValues) {
        String asString;
        if (!"device".equals(str) || contentValues == null || (asString = contentValues.getAsString("sn")) == null || !asString.endsWith("#ANDROID21")) {
            return;
        }
        String asString2 = contentValues.getAsString("name");
        ReleaseLogUtil.e("R_DeviceDataBaseHelper", "checkAndroid21Device deviceInfo:", "Name:" + asString2 + " Sn:" + dyg.b(asString.substring(0, asString.length() - 10)));
        if (CommonUtil.af(BaseApplication.getContext())) {
            return;
        }
        String strD = DfxUtils.d(Thread.currentThread(), null);
        OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("checkAndroid21Device", "deviceInfo:" + asString2 + " traceInfo:" + strD);
    }

    public long d(String str, ContentValues contentValues, String str2, String[] strArr) {
        long jUpdate = -1;
        if (TextUtils.isEmpty(str) || contentValues == null) {
            LogUtil.j("DeviceDataBaseHelper", "update data illegal argments");
            return -1L;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            LogUtil.j("DeviceDataBaseHelper", "do not write datebase on main thread");
        }
        LogUtil.a("DeviceDataBaseHelper", "update data in table ", str);
        LogUtil.d("DeviceDataBaseHelper", "update data, ", contentValues.toString());
        synchronized (d) {
            try {
                jUpdate = getWritableDatabase().update(str, contentValues, str2, strArr);
            } catch (SQLException unused) {
                LogUtil.e("DeviceDataBaseHelper", "getUpdateRowId SQLException!");
            }
        }
        return jUpdate;
    }

    public int c(String str, String str2, String[] strArr) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            LogUtil.j("DeviceDataBaseHelper", "do not write datebase on main thread");
        }
        int iDelete = -1;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceDataBaseHelper", "delete fail, table name is null");
            return -1;
        }
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("DeviceDataBaseHelper", "delete all data in table ，are you serious ?");
        }
        LogUtil.d("DeviceDataBaseHelper", "delete data in table ", str, " whereClause ", str2);
        synchronized (d) {
            try {
                iDelete = getWritableDatabase().delete(str, str2, strArr);
            } catch (SQLException unused) {
                LogUtil.e("DeviceDataBaseHelper", "getUpdateRowId SQLException!");
            }
        }
        return iDelete;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        super.onDowngrade(sQLiteDatabase, i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        LogUtil.j("DeviceDataBaseHelper", "on Open currentVersion,", Integer.valueOf(sQLiteDatabase.getVersion()));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        LogUtil.j("DeviceDataBaseHelper", "onUpgrade oldVersion:", Integer.valueOf(i), " newVersion:", Integer.valueOf(i2));
        if (i == 0 || i == 1 || i == 2) {
            a(sQLiteDatabase);
            j(sQLiteDatabase);
        } else if (i != 3) {
            return;
        }
        e(sQLiteDatabase);
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        synchronized (d) {
            try {
                sQLiteDatabase.execSQL("ALTER TABLE device ADD COLUMN mDeviceId varchar(64) ");
                LogUtil.a("DeviceDataBaseHelper", "add column success");
            } catch (SQLException unused) {
                LogUtil.e("DeviceDataBaseHelper", "exception throw when add column");
            }
        }
    }

    private void e(SQLiteDatabase sQLiteDatabase) {
        synchronized (d) {
            try {
                sQLiteDatabase.execSQL("ALTER TABLE device ADD COLUMN showInList INTEGER DEFAULT 1");
                sQLiteDatabase.execSQL("ALTER TABLE device ADD COLUMN extra TEXT");
                LogUtil.a("DeviceDataBaseHelper", "addFittingColumn success");
            } catch (SQLException unused) {
                LogUtil.e("DeviceDataBaseHelper", "exception throw when addFittingColumn");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void d(SQLiteDatabase sQLiteDatabase) {
        Map<String, String> mapF = f(sQLiteDatabase);
        if (mapF.size() != 0) {
            synchronized (d) {
                try {
                    try {
                        sQLiteDatabase.beginTransactionWithListenerNonExclusive(new SQLiteTransactionListener() { // from class: dmk.3
                            @Override // android.database.sqlite.SQLiteTransactionListener
                            public void onBegin() {
                                LogUtil.a("DeviceDataBaseHelper", "insert mDeviceId value begin");
                            }

                            @Override // android.database.sqlite.SQLiteTransactionListener
                            public void onCommit() {
                                LogUtil.a("DeviceDataBaseHelper", "insert mDeviceId value success");
                            }

                            @Override // android.database.sqlite.SQLiteTransactionListener
                            public void onRollback() {
                                LogUtil.a("DeviceDataBaseHelper", "insert mDeviceId fail");
                            }
                        });
                        ContentValues contentValues = new ContentValues();
                        int i = 0;
                        for (Map.Entry<String, String> entry : mapF.entrySet()) {
                            contentValues.put("mDeviceId", entry.getValue());
                            if (sQLiteDatabase.update("device", contentValues, "uniqueId=?", new String[]{entry.getKey()}) > 0) {
                                i++;
                            }
                        }
                        LogUtil.a("DeviceDataBaseHelper", "update old version database,update table ", "device", "by adding wiseDeviceId column,and insert value ", Integer.valueOf(i), " successes");
                        sQLiteDatabase.setTransactionSuccessful();
                    } catch (SQLException unused) {
                        LogUtil.j("DeviceDataBaseHelper", "exception throw when add values to old version database");
                    }
                    sQLiteDatabase.endTransaction();
                } catch (Throwable th) {
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            }
            return;
        }
        LogUtil.a("DeviceDataBaseHelper", "no data needs to add value");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008e A[DONT_GENERATE, PHI: r3
      0x008e: PHI (r3v6 android.database.Cursor) = (r3v5 android.database.Cursor), (r3v7 android.database.Cursor) binds: [B:24:0x008c, B:18:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    private Map<String, String> f(SQLiteDatabase sQLiteDatabase) {
        dyd dydVar = new dyd();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        lql.b(BaseApplication.getContext(), 2);
        for (ProductMapInfo productMapInfo : ProductMap.e()) {
            String strF = productMapInfo.f();
            if (!TextUtils.isEmpty(strF)) {
                e.put(strF, Integer.valueOf(productMapInfo.c()));
            }
        }
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery("select uniqueId, productId from device group by uniqueId having addTime=MAX(addTime)", null);
            while (cursorRawQuery.moveToNext()) {
                String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("productId"));
                if (!TextUtils.isEmpty(string) && e.containsKey(string)) {
                    arrayList.add(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("uniqueId")));
                    arrayList2.add(string);
                }
            }
        } catch (SQLException unused) {
            LogUtil.e("DeviceDataBaseHelper", "getCloudWiseDeviceIdByUniqueIds has exception");
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
        return dydVar.b(arrayList2, arrayList);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        LogUtil.a("DeviceDataBaseHelper", "onCreate dataBase version ", Integer.valueOf(sQLiteDatabase.getVersion()));
        if (sQLiteDatabase.getVersion() > 0) {
            LogUtil.j("DeviceDataBaseHelper", "data base hase been initialized");
            return;
        }
        h(sQLiteDatabase);
        i(sQLiteDatabase);
        g(sQLiteDatabase);
    }

    private void h(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(a("device"));
        sQLiteDatabase.execSQL(a("WiFiBindDevice"));
        sQLiteDatabase.execSQL(a("WiFiDeviceSubUser"));
        sQLiteDatabase.execSQL(a("WiFiDeviceList"));
    }

    private void i(SQLiteDatabase sQLiteDatabase) {
        synchronized (d) {
            try {
                try {
                    sQLiteDatabase.beginTransactionWithListenerNonExclusive(new SQLiteTransactionListener() { // from class: dmk.4
                        @Override // android.database.sqlite.SQLiteTransactionListener
                        public void onBegin() {
                            LogUtil.a("DeviceDataBaseHelper", "migrate all device data begin");
                        }

                        @Override // android.database.sqlite.SQLiteTransactionListener
                        public void onCommit() {
                            LogUtil.a("DeviceDataBaseHelper", "migrate all device data success");
                        }

                        @Override // android.database.sqlite.SQLiteTransactionListener
                        public void onRollback() {
                            LogUtil.a("DeviceDataBaseHelper", "migrate all device data fail");
                        }
                    });
                    sQLiteDatabase.execSQL(a("device_tmp"));
                    sQLiteDatabase.execSQL("INSERT INTO device_tmp(uniqueId, productId, name, mode, kind, kitUuid, auto, addTime) SELECT uniqueId, productId, name, mode, kind, kitUuid, auto, addTime  FROM device GROUP BY uniqueId HAVING addTime=MAX(addTime)");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS device");
                    sQLiteDatabase.execSQL("ALTER TABLE device_tmp RENAME TO device");
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (SQLException unused) {
                    LogUtil.j("DeviceDataBaseHelper", "exception throw when upgrade table device");
                }
                sQLiteDatabase.endTransaction();
            } catch (Throwable th) {
                sQLiteDatabase.endTransaction();
                throw th;
            }
        }
    }

    private void j(final SQLiteDatabase sQLiteDatabase) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: dml
            @Override // java.lang.Runnable
            public final void run() {
                this.f32009c.d(sQLiteDatabase);
            }
        });
    }

    private void g(final SQLiteDatabase sQLiteDatabase) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: dmo
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.d.b(sQLiteDatabase);
            }
        });
    }

    /* synthetic */ void b(SQLiteDatabase sQLiteDatabase) throws Throwable {
        ArrayList<ContentValues> arrayListB = b("WiFiBindDevice");
        ArrayList<ContentValues> arrayListB2 = b("WiFiDeviceList");
        ArrayList<ContentValues> arrayListB3 = b("WiFiDeviceSubUser");
        ArrayList<ContentValues> arrayListC = c(sQLiteDatabase, arrayListB);
        if (njy.e(arrayListB) && njy.e(arrayListB2) && njy.e(arrayListB3) && njy.e(arrayListC)) {
            LogUtil.j("DeviceDataBaseHelper", "no data need to migrate");
            return;
        }
        synchronized (d) {
            try {
                try {
                    sQLiteDatabase.beginTransactionWithListenerNonExclusive(new SQLiteTransactionListener() { // from class: dmk.1
                        @Override // android.database.sqlite.SQLiteTransactionListener
                        public void onBegin() {
                            LogUtil.j("DeviceDataBaseHelper", "migrate data begin !");
                        }

                        @Override // android.database.sqlite.SQLiteTransactionListener
                        public void onCommit() {
                            LogUtil.j("DeviceDataBaseHelper", "migrate data suucess !");
                            dmk.this.c();
                        }

                        @Override // android.database.sqlite.SQLiteTransactionListener
                        public void onRollback() {
                            LogUtil.j("DeviceDataBaseHelper", "migrate wifi data fail !");
                            dmk.this.c();
                        }
                    });
                    a(sQLiteDatabase, "WiFiBindDevice", arrayListB);
                    a(sQLiteDatabase, "WiFiDeviceSubUser", arrayListB3);
                    a(sQLiteDatabase, "WiFiDeviceList", arrayListB2);
                    e(sQLiteDatabase, arrayListC);
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (SQLException e2) {
                    LogUtil.e("DeviceDataBaseHelper", "migrate data catch exception ", e2.getMessage());
                }
                sQLiteDatabase.endTransaction();
            } catch (Throwable th) {
                sQLiteDatabase.endTransaction();
                throw th;
            }
        }
    }

    private ArrayList<ContentValues> b(String str) {
        return b(e(str), str) ? c(str) : new ArrayList<>(10);
    }

    private void e(SQLiteDatabase sQLiteDatabase, ArrayList<ContentValues> arrayList) {
        if (njy.e(arrayList)) {
            LogUtil.j("DeviceDataBaseHelper", "migrate data updateDeviceSn no data, tableName", "device");
            return;
        }
        try {
            int i = 0;
            for (ContentValues contentValues : arrayList) {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("sn", contentValues.getAsString("sn"));
                if (sQLiteDatabase.update("device", contentValues2, "uniqueId=?", new String[]{contentValues.getAsString("uniqueId")}) > 0) {
                    i++;
                }
            }
            LogUtil.a("DeviceDataBaseHelper", "migrate data in table ", "device", " data'size ", Integer.valueOf(arrayList.size()), " success ", Integer.valueOf(i));
        } catch (SQLException e2) {
            LogUtil.e("DeviceDataBaseHelper", "catch exception while copy data from table:", "device", " error msg ", e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        String packageName = BaseApplication.getContext().getPackageName();
        BaseApplication.getContext().deleteDatabase(packageName.replaceAll("\\.", "_") + "10033.db");
        BaseApplication.getContext().deleteDatabase(packageName.replaceAll("\\.", "_") + "10034.db");
    }

    private void a(SQLiteDatabase sQLiteDatabase, String str, ArrayList<ContentValues> arrayList) {
        if (njy.e(arrayList)) {
            LogUtil.j("DeviceDataBaseHelper", "migrate data wifiDeviceData no data, tableName", str);
            return;
        }
        try {
            Iterator<ContentValues> it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (sQLiteDatabase.insert(str, null, it.next()) > 0) {
                    i++;
                }
            }
            LogUtil.a("DeviceDataBaseHelper", "migrate data in table ", str, " data'size ", Integer.valueOf(arrayList.size()), " success ", Integer.valueOf(i));
        } catch (SQLException e2) {
            LogUtil.j("DeviceDataBaseHelper", "catch exception while copy data from table:", str, " error msg ", e2.getMessage());
        }
    }

    private String a(String str) {
        if ("device".equals(str) || "device_tmp".equals(str)) {
            return "CREATE TABLE IF NOT EXISTS " + str + "(uniqueId VARCHAR(64) UNIQUE NOT NULL,productId VARCHAR(64) NOT NULL,name VARCHAR(64) NOT NULL,mode VARCHAR(16) NOT NULL,kind VARCHAR(16) NOT NULL, kitUuid VARCHAR(64) NOT NULL,auto INTEGER NOT NULL,sn VARCHAR(64),displayName VARCHAR(64),addTime LONG,mDeviceId VARCHAR(64),showInList INTEGER DEFAULT 1,extra TEXT)";
        }
        if ("WiFiBindDevice".equals(str)) {
            return "CREATE TABLE IF NOT EXISTS WiFiBindDevice(_id integer primary key autoincrement, productId text not null, deviceId text not null, deviceCode text not null, sn text not null, model text not null,deviceType text not null,manu text not null,prodId text not null,hiv text not null,fwv text,hwv text,swv text,mac text,protType integer,serviceInfo text,source integer,addTime long)";
        }
        if ("WiFiDeviceList".equals(str)) {
            return "CREATE TABLE IF NOT EXISTS WiFiDeviceList(_id integer PRIMARY KEY AUTOINCREMENT,productId text NOT NULL, deviceId text NOT NULL, deviceModel TEXT,deviceTypeId TEXT)";
        }
        if ("WiFiDeviceSubUser".equals(str)) {
            return "CREATE TABLE IF NOT EXISTS WiFiDeviceSubUser(_id integer PRIMARY KEY AUTOINCREMENT,deviceId text UNIQUE not null,subUser text)";
        }
        LogUtil.j("DeviceDataBaseHelper", "unkow table ", str);
        return null;
    }

    private Cursor a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        String strE = e(str);
        DataBaseHelper.d(strE).d();
        String strD = DbManager.d(strE, str);
        if (DataBaseHelper.d(strE).e() != null) {
            return DataBaseHelper.d(strE).e().query(strD, strArr, str2, strArr2, str3, str4, str5, str6);
        }
        return null;
    }

    private ArrayList<ContentValues> c(SQLiteDatabase sQLiteDatabase, ArrayList<ContentValues> arrayList) throws Throwable {
        ArrayList<ContentValues> arrayList2 = new ArrayList<>(10);
        String[] strArr = {"productId", "uniqueId", "sn", Wpt.MODE};
        try {
            Cursor cursorQuery = sQLiteDatabase.query("device", strArr, "productId = ? or productId = ? or productId = ? or productId = ? or productId = ? or productId = ?", new String[]{"8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4", "e835d102-af95-48a6-ae13-2983bc06f5c0", "25c6df38-ca23-11e9-a32f-2a2ae2dbcce4", "e4b0b1d5-2003-4d88-8b5f-c4f64542040b", "a8ba095d-4123-43c4-a30a-0240011c58de", "c943c933-442e-4c34-bcd0-66597f24aaed"}, null, null, null, null);
            try {
                try {
                    if (cursorQuery == null) {
                        LogUtil.j("DeviceDataBaseHelper", "getDataFromDevice not device data");
                        if (cursorQuery != null) {
                            cursorQuery.close();
                            return arrayList2;
                        }
                        LogUtil.e("DeviceDataBaseHelper", "getDataFromDevice has exception");
                    } else {
                        while (cursorQuery.moveToNext()) {
                            ContentValues contentValues = new ContentValues();
                            for (int i = 0; i < 4; i++) {
                                String str = strArr[i];
                                int columnIndex = cursorQuery.getColumnIndex(str);
                                if (columnIndex != -1) {
                                    contentValues.put(str, cursorQuery.getString(columnIndex));
                                } else {
                                    contentValues.put(str, "");
                                }
                            }
                            try {
                                String strB = b(contentValues, arrayList);
                                if (!TextUtils.isEmpty(strB)) {
                                    contentValues.put("sn", strB);
                                    arrayList2.add(contentValues);
                                }
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                if (cursorQuery == null) {
                                    throw th2;
                                }
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                            return arrayList2;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (SQLException unused) {
            }
        } catch (SQLException unused2) {
        }
        return arrayList2;
    }

    private String b(ContentValues contentValues, ArrayList<ContentValues> arrayList) {
        if (contentValues == null) {
            LogUtil.d("DeviceDataBaseHelper", "hasUpdateSn contentValues is null");
            return "";
        }
        if (!TextUtils.isEmpty(contentValues.getAsString("sn"))) {
            LogUtil.a("DeviceDataBaseHelper", "sn is not null");
            return "";
        }
        String strB = new DeviceCloudSharePreferencesManager(dxw.d()).b(contentValues.getAsString("productId") + "sn");
        if (TextUtils.isEmpty(strB)) {
            LogUtil.d("DeviceDataBaseHelper", "serialNumber is null");
            return "";
        }
        if ("0".equals(strB) && !njy.e(arrayList)) {
            LogUtil.a("DeviceDataBaseHelper", "wifiDevice size:", Integer.valueOf(arrayList.size()));
            LogUtil.a("DeviceDataBaseHelper", "serialNumber is 0");
            for (ContentValues contentValues2 : arrayList) {
                if (contentValues.getAsString("productId").equals(contentValues2.getAsString("productId"))) {
                    return contentValues2.getAsString("sn");
                }
            }
        }
        return strB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        if (r13 != null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ArrayList<ContentValues> c(String str) {
        String[] strArrC;
        ArrayList<ContentValues> arrayList = new ArrayList<>(10);
        if ("WiFiBindDevice".equals(str)) {
            strArrC = c.b();
        } else if ("WiFiDeviceList".equals(str)) {
            strArrC = e.a();
        } else if ("WiFiDeviceSubUser".equals(str)) {
            strArrC = a.c();
        } else {
            LogUtil.j("DeviceDataBaseHelper", "getAllWifiDeviceData know table, name ", str);
            return arrayList;
        }
        try {
            Cursor cursorA = a(str, null, null, null, null, null, null, null);
            try {
                if (cursorA == null) {
                    LogUtil.j("DeviceDataBaseHelper", "copyWifiDeviceData not wifi device data");
                    if (cursorA != null) {
                        cursorA.close();
                        return arrayList;
                    }
                    return arrayList;
                }
                while (cursorA.moveToNext()) {
                    ContentValues contentValues = new ContentValues();
                    for (String str2 : strArrC) {
                        int columnIndex = cursorA.getColumnIndex(str2);
                        if (columnIndex != -1) {
                            contentValues.put(str2, cursorA.getString(columnIndex));
                        } else {
                            contentValues.put(str2, "");
                        }
                    }
                    arrayList.add(contentValues);
                }
            } catch (Throwable th) {
                if (cursorA != null) {
                    try {
                        cursorA.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SQLException unused) {
            LogUtil.e("DeviceDataBaseHelper", "getDataFromWifiDataBase has exception");
        }
    }

    private boolean b(String str, String str2) {
        LogUtil.a("DeviceDataBaseHelper", "moduleId:", str, ",tableName:", str2);
        String str3 = BaseApplication.getContext().getPackageName().replaceAll("\\.", "_") + str + ".db";
        String[] strArrDatabaseList = BaseApplication.getContext().databaseList();
        LogUtil.a("DeviceDataBaseHelper", "dataBaseName:", str3);
        if (strArrDatabaseList == null) {
            return false;
        }
        for (String str4 : strArrDatabaseList) {
            if (str3.equals(str4)) {
                List<String> listE = DbManager.e(String.valueOf(str));
                return !njy.e(listE) && listE.contains(DbManager.d(str, str2));
            }
        }
        return false;
    }
}
