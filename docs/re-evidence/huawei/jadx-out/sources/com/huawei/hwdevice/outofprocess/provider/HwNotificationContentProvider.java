package com.huawei.hwdevice.outofprocess.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.StaleDataException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.health.device.model.RecordAction;
import com.huawei.hwcommonmodel.application.BaseApplication;
import defpackage.lsu;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class HwNotificationContentProvider extends ContentProvider {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static UriMatcher f17413c;
    public static final String e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f17414a;
    private SQLiteDatabase d;

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    static {
        String str = BaseApplication.getAppPackage() + ".HwNotificationContentProvider";
        e = str;
        f17413c = null;
        UriMatcher uriMatcher = new UriMatcher(-1);
        f17413c = uriMatcher;
        uriMatcher.addURI(str, "NotificationList", 1);
        f17413c.addURI(str, "NotificationList/#", 2);
        f17413c.addURI(str, "MidwareAuthority", 3);
        f17413c.addURI(str, "NotificationFlags", 4);
        f17413c.addURI(str, "NotificationCollaboration", 5);
        f17413c.addURI(str, "ConnectDeviceInfo", 6);
        f17413c.addURI(str, "ClockState", 7);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        LogUtil.b("HwNotificationContentProvider", "enter HwNotificationContentProvider  onCreate");
        this.f17414a = new c(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Exception e2;
        String str3;
        String str4;
        try {
            this.d = this.f17414a.getReadableDatabase();
            int iMatch = f17413c.match(uri);
            String str5 = "NotificationList";
            if (iMatch == 1) {
                e(strArr, str, strArr2, str2);
            } else if (iMatch != 2) {
                if (iMatch == 3) {
                    str4 = "MidwareAuthority";
                } else if (iMatch == 4) {
                    str4 = "NotificationFlags";
                } else if (iMatch == 6) {
                    str4 = "ConnectDeviceInfo";
                } else if (iMatch == 7) {
                    str4 = "ClockState";
                } else {
                    throw new IllegalArgumentException("This is a unKnow Uri" + uri.toString());
                }
                str5 = str4;
            } else {
                try {
                    str3 = uri.getPathSegments().get(2);
                    try {
                        LogUtil.b("HwNotificationContentProvider", "query NotificationList/# name: ", str3);
                    } catch (Exception e3) {
                        e2 = e3;
                        LogUtil.d("HwNotificationContentProvider", "query NotificationList/# name exception: ", LogAnonymous.b(e2));
                    }
                } catch (Exception e4) {
                    e2 = e4;
                    str3 = "";
                }
                str = RecordAction.ACT_NAME_TAG + str3;
            }
            return this.d.query(str5, strArr, str, strArr2, null, null, str2);
        } catch (Exception e5) {
            LogUtil.d("HwNotificationContentProvider", "HwNotificationContentProvider query parse name exception: ", LogAnonymous.b(e5));
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        this.d = this.f17414a.getWritableDatabase();
        int iMatch = f17413c.match(uri);
        if (iMatch == 1) {
            long jInsert = this.d.insert("NotificationList", "name", contentValues);
            Uri uriWithAppendedPath = Uri.withAppendedPath(uri, "/" + jInsert);
            LogUtil.b("HwNotificationContentProvider", "TABLE_SUB_SWITCH_LIST inserted row id: ", Long.valueOf(jInsert), ",inserted row: ", contentValues.toString());
            if (!TextUtils.equals("connect_wear", contentValues.getAsString("name"))) {
                getContext().getContentResolver().notifyChange(uri, null);
            }
            return uriWithAppendedPath;
        }
        if (iMatch == 5) {
            getContext().getContentResolver().notifyChange(uri, null);
            LogUtil.b("HwNotificationContentProvider", "TABLE_COLLABORATION insert notifyChange!");
            return uri;
        }
        if (iMatch == 7) {
            LogUtil.b("HwNotificationContentProvider", "insert clock state");
            if (b()) {
                LogUtil.b("HwNotificationContentProvider", "insert ClockState table exist");
                try {
                    LogUtil.b("HwNotificationContentProvider", "insert clock state count: ", Long.valueOf(this.d.insert("ClockState", null, contentValues)));
                    return uri;
                } catch (SQLException unused) {
                    LogUtil.d("HwNotificationContentProvider", "update ClockState table exist update error");
                }
            } else {
                LogUtil.b("HwNotificationContentProvider", "insert ClockState table not exist");
                try {
                    this.d.execSQL("CREATE TABLE IF NOT EXISTS ClockState( deviceMac TEXT not null PRIMARY KEY,clockValue TEXT)");
                    LogUtil.b("HwNotificationContentProvider", "insert clock state count: ", Long.valueOf(this.d.insert("ClockState", null, contentValues)));
                    return uri;
                } catch (SQLException unused2) {
                    LogUtil.d("HwNotificationContentProvider", "update ClockState table not exist error");
                }
            }
            return uri;
        }
        throw new IllegalArgumentException("This is a unKnow Uri" + uri.toString());
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        Exception e2;
        String str2;
        this.d = this.f17414a.getWritableDatabase();
        int iMatch = f17413c.match(uri);
        String str3 = "";
        if (iMatch == 1) {
            d(null, str, strArr);
            int iDelete = this.d.delete("NotificationList", str, strArr);
            if (strArr != null && strArr.length > 0) {
                str3 = strArr[0];
            }
            LogUtil.b("HwNotificationContentProvider", "TABLE_SUB_SWITCH_LIST delete pkgName:", str3);
            getContext().getContentResolver().notifyChange(uri, null);
            return iDelete;
        }
        if (iMatch != 2) {
            return 0;
        }
        try {
            str2 = uri.getPathSegments().get(2);
            try {
                LogUtil.b("HwNotificationContentProvider", "delete NotificationList/# name" + str2);
            } catch (Exception e3) {
                e2 = e3;
                str3 = str2;
                LogUtil.d("HwNotificationContentProvider", "delete NotificationList/# exception: ", LogAnonymous.b(e2));
                str2 = str3;
            }
        } catch (Exception e4) {
            e2 = e4;
        }
        return this.d.delete("NotificationList", RecordAction.ACT_NAME_TAG + str2, strArr);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        boolean zBooleanValue;
        this.d = this.f17414a.getWritableDatabase();
        int iMatch = f17413c.match(uri);
        if (iMatch != 3) {
            if (iMatch == 4) {
                try {
                    boolean zContainsKey = contentValues.containsKey("isNotify");
                    LogUtil.b("HwNotificationContentProvider", "TABLE_NOTIFICATION_FLAGS update: values= ", contentValues.toString(), " isHarmonyOS30SendNotifyExist:", Boolean.valueOf(zContainsKey));
                    if (zContainsKey) {
                        Boolean asBoolean = contentValues.getAsBoolean("isNotify");
                        zBooleanValue = asBoolean.booleanValue();
                        LogUtil.b("HwNotificationContentProvider", "TABLE_NOTIFICATION_FLAGS update: isHarmonyOS30SendNotify= ", asBoolean);
                        contentValues.remove("isNotify");
                    } else {
                        zBooleanValue = false;
                    }
                    LogUtil.b("HwNotificationContentProvider", "TABLE_NOTIFICATION_FLAGS update: ContentValues= ", contentValues.toString());
                    this.d.update("NotificationFlags", contentValues, str, strArr);
                    if (zBooleanValue) {
                        c(strArr);
                    }
                    c(uri, strArr);
                } catch (SQLException e2) {
                    LogUtil.d("HwNotificationContentProvider", "TABLE_NOTIFICATION_FLAGS update exception: ", LogAnonymous.b(e2));
                }
            } else if (iMatch == 6) {
                if (!c("ConnectDeviceInfo", "isSupportNotify")) {
                    try {
                        this.d.execSQL(" DROP TABLE IF EXISTS ConnectDeviceInfo");
                        this.d.execSQL(" CREATE TABLE IF NOT EXISTS ConnectDeviceInfo ( serialIndex INTEGER  PRIMARY KEY  , DeviceType INTEGER  , isSupportNotify INTEGER  ) ");
                        this.d.execSQL("insert into ConnectDeviceInfo (serialIndex,DeviceType,isSupportNotify) select 1,-3,0 where not exists (select serialIndex,DeviceType,isSupportNotify from ConnectDeviceInfo where serialIndex=1)");
                        LogUtil.b("HwNotificationContentProvider", "update ConnectDeviceInfo table IS_NOT_EXIST but reCreated");
                    } catch (SQLException | StaleDataException | IllegalArgumentException e3) {
                        LogUtil.d("HwNotificationContentProvider", "update ConnectDeviceInfo table IS_NOT_EXIST SQLException: ", LogAnonymous.b(e3));
                    }
                }
                try {
                    int iUpdate = this.d.update("ConnectDeviceInfo", contentValues, str, strArr);
                    LogUtil.b("HwNotificationContentProvider", "TABLE_CONNECT_DEVICE_INFO update: values= ", contentValues.toString());
                    getContext().getContentResolver().notifyChange(uri, null);
                    LogUtil.b("HwNotificationContentProvider", "TABLE_CONNECT_DEVICE_INFO update notifyChange!");
                    return iUpdate;
                } catch (SQLException e4) {
                    LogUtil.d("HwNotificationContentProvider", "SqlUtil.TABLE_CONNECT_DEVICE_INFO update exception: ", LogAnonymous.b(e4));
                }
            } else if (iMatch == 7) {
                if (b()) {
                    LogUtil.b("HwNotificationContentProvider", "update ClockState table exist");
                    try {
                        return this.d.update("ClockState", contentValues, str, strArr);
                    } catch (SQLException unused) {
                        LogUtil.d("HwNotificationContentProvider", "update ClockState table exist update error");
                    }
                } else {
                    LogUtil.b("HwNotificationContentProvider", "update ClockState table not exist");
                    try {
                        this.d.execSQL("CREATE TABLE IF NOT EXISTS ClockState( deviceMac TEXT not null PRIMARY KEY,clockValue TEXT)");
                        this.d.insert("ClockState", null, contentValues);
                        return this.d.update("ClockState", contentValues, str, strArr);
                    } catch (SQLException unused2) {
                        LogUtil.d("HwNotificationContentProvider", "update ClockState table not exist error");
                    }
                }
            }
        } else if (c("MidwareAuthority", "value")) {
            LogUtil.b("HwNotificationContentProvider", "TABLE_MIDWARE update:TABLE_MIDWARE exist!");
            try {
                return this.d.update("MidwareAuthority", contentValues, str, strArr);
            } catch (SQLException e5) {
                LogUtil.d("HwNotificationContentProvider", "TABLE_MIDWARE update exception: ", LogAnonymous.b(e5));
            }
        } else {
            LogUtil.b("HwNotificationContentProvider", "TABLE_MIDWARE update:TABLE_MIDWARE not exist");
            try {
                this.d.execSQL(" CREATE TABLE IF NOT EXISTS MidwareAuthority ( value NVARCHAR(300)  NOT NULL  PRIMARY KEY  ) ");
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("value", "false");
                this.d.insert("MidwareAuthority", "value", contentValues2);
                return this.d.update("MidwareAuthority", contentValues, str, strArr);
            } catch (SQLException e6) {
                LogUtil.d("HwNotificationContentProvider", "TABLE_MIDWARE update exception: ", LogAnonymous.b(e6));
            }
        }
        return 0;
    }

    private boolean b() {
        boolean z;
        LogUtil.b("HwNotificationContentProvider", "isClockStateTableExist enter");
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = this.d.rawQuery("select count(*) as tableCount from sqlite_master where type ='table' and name = 'ClockState'", null);
                z = cursorRawQuery.moveToNext() && cursorRawQuery.getInt(0) > 0;
                try {
                    LogUtil.b("HwNotificationContentProvider", "isClockStateTableExist result:", Boolean.valueOf(z));
                    return z;
                } catch (Exception unused) {
                    LogUtil.d("HwNotificationContentProvider", "isClockStateTableExist error");
                    return z;
                }
            } catch (Exception unused2) {
                z = false;
            }
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }

    private void c(Uri uri, String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        String str = strArr[0];
        LogUtil.b("HwNotificationContentProvider", "TABLE_NOTIFICATION_FLAGS notifyAuthorizedChange selectionArg: ", str, " ", uri.getPath());
        if ("authorized".equals(str)) {
            getContext().getContentResolver().notifyChange(uri, null);
        }
    }

    private void c(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        String str = strArr[0];
        LogUtil.b("HwNotificationContentProvider", "TABLE_NOTIFICATION_FLAGS notifyNotificationCollaborationChange selectionArg: ", str);
        if ("authorized".equals(str)) {
            getContext().getContentResolver().notifyChange(Uri.parse(lsu.f40768c), null);
        }
    }

    private boolean c(String str, String str2) {
        boolean z;
        LogUtil.b("HwNotificationContentProvider", "Enter isTableExist,tableName: ", str, ",columnName: ", str2);
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = this.d.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
                boolean z2 = (cursorRawQuery == null || cursorRawQuery.getColumnIndex(str2) == -1) ? false : true;
                try {
                    LogUtil.b("HwNotificationContentProvider", "isTableExist, result: ", Boolean.valueOf(z2));
                    return z2;
                } catch (Exception e2) {
                    z = z2;
                    e = e2;
                    LogUtil.d("HwNotificationContentProvider", "isTableExist exception: ", LogAnonymous.b(e));
                    return z;
                }
            } finally {
                if (0 != 0) {
                    cursorRawQuery.close();
                }
            }
        } catch (Exception e3) {
            e = e3;
            z = false;
        }
    }

    private void d(String[] strArr, String str, String[] strArr2) {
        if (CommonUtil.bu()) {
            return;
        }
        if (str == null && strArr2 == null) {
            LogUtil.c("HwNotificationContentProvider", "printSelectionLog selection or selectionArgs is null");
            return;
        }
        StringBuilder sb = new StringBuilder(0);
        sb.append("selection:");
        sb.append(str);
        if (strArr2 != null) {
            for (String str2 : strArr2) {
                sb.append(" selectionArgs: ");
                sb.append(str2);
            }
        }
        if (strArr != null) {
            for (String str3 : strArr) {
                sb.append(" projections: ");
                sb.append(str3);
            }
        }
        LogUtil.b("HwNotificationContentProvider", "printQueryCheckLog: ", sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    private void e(String[] strArr, String str, String[] strArr2, String str2) {
        d(strArr, str, strArr2);
        if (CommonUtil.bu()) {
            return;
        }
        if (strArr2 == null || strArr2.length == 0) {
            LogUtil.c("HwNotificationContentProvider", "queryTableSubSwitchListCheck selectionArgs is null or length is 0.");
            return;
        }
        try {
            Cursor cursorQuery = this.d.query("NotificationList", strArr, str, strArr2, null, null, str2);
            if (cursorQuery == null) {
                LogUtil.e("HwNotificationContentProvider", "queryTableSubSwitchListCheck cursor is null");
                if (cursorQuery == null) {
                    return;
                }
            } else {
                try {
                    if (cursorQuery.getCount() == 0) {
                        LogUtil.e("HwNotificationContentProvider", "queryTableSubSwitchListCheck cursor is null");
                        if (cursorQuery == null) {
                            return;
                        }
                    } else {
                        while (cursorQuery.moveToNext()) {
                            Integer numA = lsu.a("name", cursorQuery, "HwNotificationContentProvider");
                            if (numA == null) {
                                LogUtil.e("HwNotificationContentProvider", "queryTableSubSwitchListCheck columnIndex is null");
                                if (cursorQuery == null) {
                                    return;
                                }
                            } else {
                                String string = cursorQuery.getString(numA.intValue());
                                LogUtil.b("HwNotificationContentProvider", "queryTableSubSwitchListCheck name: ", string, " selectionArgs: ", strArr2[0]);
                                if (TextUtils.equals(strArr2[0], string)) {
                                    LogUtil.b("HwNotificationContentProvider", "queryTableSubSwitchListCheck name is found");
                                    break;
                                }
                            }
                        }
                        if (cursorQuery == null) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            cursorQuery.close();
        } catch (StaleDataException | SQLiteException | IllegalArgumentException e2) {
            LogUtil.d("HwNotificationContentProvider", "queryTableSubSwitchListCheck Exception: ", LogAnonymous.b(e2));
        }
    }

    static class c extends SQLiteOpenHelper {
        c(Context context) {
            super(context, "notification.db", (SQLiteDatabase.CursorFactory) null, 4);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL(" CREATE TABLE IF NOT EXISTS NotificationList ( name NVARCHAR(300)  NOT NULL  PRIMARY KEY  ) ");
                ContentValues contentValues = new ContentValues();
                contentValues.put("name", "start");
                sQLiteDatabase.insert("NotificationList", "name", contentValues);
                sQLiteDatabase.execSQL(" CREATE TABLE IF NOT EXISTS MidwareAuthority ( value NVARCHAR(300)  NOT NULL  PRIMARY KEY  ) ");
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("value", "false");
                sQLiteDatabase.insert("MidwareAuthority", "value", contentValues2);
                sQLiteDatabase.execSQL(" CREATE TABLE IF NOT EXISTS NotificationFlags ( name TEXT  NOT NULL  PRIMARY KEY  , value INTEGER  ) ");
                sQLiteDatabase.execSQL("insert into NotificationFlags (name,value) select 'authorized',-1 where not exists (select name,value from NotificationFlags where name='authorized')");
                sQLiteDatabase.execSQL("insert into NotificationFlags (name,value) select 'is_MessageAlert',0 where not exists (select name,value from NotificationFlags where name='is_MessageAlert')");
                sQLiteDatabase.execSQL("insert into NotificationFlags (name,value) select 'is_Forbidden',-1 where not exists (select name,value from NotificationFlags where name='is_Forbidden')");
                sQLiteDatabase.execSQL(" CREATE TABLE IF NOT EXISTS ConnectDeviceInfo ( serialIndex INTEGER  PRIMARY KEY  , DeviceType INTEGER  , isSupportNotify INTEGER  ) ");
                sQLiteDatabase.execSQL("insert into ConnectDeviceInfo (serialIndex,DeviceType,isSupportNotify) select 1,-3,0 where not exists (select serialIndex,DeviceType,isSupportNotify from ConnectDeviceInfo where serialIndex=1)");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ClockState( deviceMac TEXT not null PRIMARY KEY,clockValue TEXT)");
                LogUtil.b("HwNotificationContentProvider", "DataBaseHelperNo onCreate");
            } catch (SQLException e) {
                LogUtil.d("HwNotificationContentProvider", "DataBaseHelperNo onCreate SQLException ", LogAnonymous.b(e));
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            LogUtil.b("HwNotificationContentProvider", "DataBaseHelperNo onUpgrade");
            LogUtil.b("HwNotificationContentProvider", "onUpgrade oldVersion=", Integer.valueOf(i), " newVersion=", Integer.valueOf(i2));
            if (i >= 4 || i2 != 4) {
                return;
            }
            try {
                sQLiteDatabase.execSQL(" CREATE TABLE IF NOT EXISTS NotificationFlags ( name TEXT  NOT NULL  PRIMARY KEY  , value INTEGER  ) ");
                sQLiteDatabase.execSQL("insert into NotificationFlags (name,value) select 'authorized',-1 where not exists (select name,value from NotificationFlags where name='authorized')");
                sQLiteDatabase.execSQL("insert into NotificationFlags (name,value) select 'is_MessageAlert',0 where not exists (select name,value from NotificationFlags where name='is_MessageAlert')");
                sQLiteDatabase.execSQL("insert into NotificationFlags (name,value) select 'is_Forbidden',-1 where not exists (select name,value from NotificationFlags where name='is_Forbidden')");
                sQLiteDatabase.execSQL(" CREATE TABLE IF NOT EXISTS ConnectDeviceInfo ( serialIndex INTEGER  PRIMARY KEY  , DeviceType INTEGER  , isSupportNotify INTEGER  ) ");
                sQLiteDatabase.execSQL("insert into ConnectDeviceInfo (serialIndex,DeviceType,isSupportNotify) select 1,-3,0 where not exists (select serialIndex,DeviceType,isSupportNotify from ConnectDeviceInfo where serialIndex=1)");
                LogUtil.b("HwNotificationContentProvider", "DataBaseHelperNo onUpgrade success");
            } catch (SQLException e) {
                LogUtil.d("HwNotificationContentProvider", "DataBaseHelperNo onUpgrade SQLException", LogAnonymous.b(e));
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            LogUtil.e("HwNotificationContentProvider", "HwNotificationContentProvider onDowngrade: nowVersion = ", Integer.valueOf(i2), ",lastVersion = ", Integer.valueOf(i));
        }
    }
}
