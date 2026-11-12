package com.huawei.health.ecologydevice.wifi.lib.db.dbtable;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.huawei.hwbasemgr.HwBaseManager;
import defpackage.etk;
import defpackage.eto;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class DeviceListManager extends HwBaseManager {
    private static volatile DeviceListManager d;
    private static final Object e = new Object();

    public DeviceListManager(Context context) {
        super(context);
        d();
        if (c()) {
            etk.d(false, "DeviceListManager", "check DB is Null");
        }
    }

    private void d() {
        etk.d(false, "DeviceListManager", "createTable | create new table: ", getTableFullName("WiFiDeviceList"));
        StringBuilder sb = new StringBuilder(16);
        sb.append("_id integer primary key autoincrement,productId text not null,deviceId text not null,deviceModel text,deviceTypeId text");
        etk.e(false, "DeviceListManager", "createTable | create new table sql = ", sb.toString());
        createStorageDataTable("WiFiDeviceList", 1, sb.toString());
        etk.d(false, "DeviceListManager", "createTable | create table end");
    }

    public static DeviceListManager c(Context context) {
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = new DeviceListManager(context);
                }
            }
        }
        return d;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 10034;
    }

    private boolean c() {
        etk.d(false, "DeviceListManager", "checkDBisNull");
        Cursor cursorQueryStorageData = queryStorageData("WiFiDeviceList", 1, null);
        if (cursorQueryStorageData == null) {
            return true;
        }
        cursorQueryStorageData.close();
        return false;
    }

    public eto a(String str) {
        eto etoVarB = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Cursor cursorRawQueryStorageData = rawQueryStorageData(1, "select * from " + getTableFullName("WiFiDeviceList") + " where deviceId = ?", new String[]{str});
        if (cursorRawQueryStorageData != null && cursorRawQueryStorageData.moveToNext()) {
            etoVarB = b(cursorRawQueryStorageData);
            etk.d(true, "DeviceListManager", etoVarB.toString());
        }
        if (cursorRawQueryStorageData != null) {
            cursorRawQueryStorageData.close();
        }
        return etoVarB;
    }

    private eto b(Cursor cursor) {
        eto etoVar = new eto();
        etoVar.d = cursor.getString(cursor.getColumnIndex("productId"));
        etoVar.e = cursor.getString(cursor.getColumnIndex("deviceModel"));
        etoVar.f33464a = cursor.getString(cursor.getColumnIndex("deviceTypeId"));
        etoVar.f33465c = cursor.getString(cursor.getColumnIndex("deviceId"));
        return etoVar;
    }

    public long d(List<eto> list) {
        long jInsertStorageData = 0;
        if (list != null && !list.isEmpty()) {
            etk.d(true, "DeviceListManager", "tables Size :", Integer.valueOf(list.size()));
            for (eto etoVar : list) {
                if (a(etoVar.f33465c) == null) {
                    jInsertStorageData = insertStorageData("WiFiDeviceList", 1, d(etoVar));
                } else {
                    etk.d(true, "DeviceListManager", "not insert proId:", etoVar.f33465c);
                }
            }
            etk.d(true, "DeviceListManager", "insert count:", Long.valueOf(jInsertStorageData));
        }
        return jInsertStorageData;
    }

    private ContentValues d(eto etoVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("productId", etoVar.d);
        contentValues.put("deviceId", etoVar.f33465c);
        contentValues.put("deviceModel", etoVar.e);
        contentValues.put("deviceTypeId", etoVar.f33464a);
        return contentValues;
    }
}
