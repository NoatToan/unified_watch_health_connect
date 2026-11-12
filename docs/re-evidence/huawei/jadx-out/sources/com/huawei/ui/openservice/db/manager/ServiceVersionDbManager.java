package com.huawei.ui.openservice.db.manager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.openservice.db.model.OpenServiceVersion;
import com.huawei.ui.openservice.db.model.ServiceListConfig;
import com.huawei.ui.openservice.db.model.ServiceVersionTable;
import health.compact.a.HiDateUtil;

/* JADX INFO: loaded from: classes19.dex */
public class ServiceVersionDbManager {
    private static final String LOG_TAG = "Opera_ServiceDBManager";
    private OpenServiceDbCommon dbCommon;

    public ServiceVersionDbManager(Context context) {
        this.dbCommon = new OpenServiceDbCommon(context.getApplicationContext(), ServiceVersionTable.TABLE_NAME, ServiceVersionTable.getColumns());
    }

    public boolean insertOrUpdateVersionSync(OpenServiceVersion openServiceVersion) {
        return insertOrUpdateVersion(openServiceVersion);
    }

    private boolean insertOrUpdateVersion(OpenServiceVersion openServiceVersion) {
        boolean zUpdateServiceVersion;
        synchronized (this) {
            if (openServiceVersion != null) {
                if (openServiceVersion.getVersion() != null) {
                    if (queryVersion() == null) {
                        zUpdateServiceVersion = insertServiceVersion(openServiceVersion);
                    } else {
                        zUpdateServiceVersion = updateServiceVersion(openServiceVersion);
                    }
                    return zUpdateServiceVersion;
                }
            }
            return false;
        }
    }

    public OpenServiceVersion queryVersion() {
        return parseOpenServiceVersion(this.dbCommon.query("id =? ", new String[]{Integer.toString(1)}, null, null, null));
    }

    public boolean updateServiceVersion(OpenServiceVersion openServiceVersion) {
        if (openServiceVersion == null || openServiceVersion.getVersion() == null) {
            return false;
        }
        return this.dbCommon.update(buildOpenServiceVersionValues(openServiceVersion), "id =? ", new String[]{Integer.toString(1)}) > 0;
    }

    private boolean insertServiceVersion(OpenServiceVersion openServiceVersion) {
        return this.dbCommon.insert(buildOpenServiceVersionValues(openServiceVersion)) > 0;
    }

    public void refreshVersion(ServiceListConfig serviceListConfig) {
        LogUtil.a(LOG_TAG, "refreshVersion");
        String moduleVer = serviceListConfig.getModuleVer();
        OpenServiceVersion openServiceVersion = new OpenServiceVersion();
        openServiceVersion.setVersion(moduleVer);
        openServiceVersion.setDate(HiDateUtil.d(System.currentTimeMillis()));
        insertOrUpdateVersionSync(openServiceVersion);
    }

    private OpenServiceVersion parseOpenServiceVersion(Cursor cursor) {
        OpenServiceVersion openServiceVersion = null;
        if (cursor == null) {
            return null;
        }
        try {
            if (cursor.moveToNext()) {
                openServiceVersion = new OpenServiceVersion();
                openServiceVersion.setVersion(cursor.getString(cursor.getColumnIndex("version")));
                openServiceVersion.setDate(cursor.getInt(cursor.getColumnIndex("date")));
            }
            return openServiceVersion;
        } finally {
            cursor.close();
        }
    }

    private ContentValues buildOpenServiceVersionValues(OpenServiceVersion openServiceVersion) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("version", openServiceVersion.getVersion());
        contentValues.put("date", Integer.valueOf(openServiceVersion.getDate()));
        contentValues.put("modify_time", Long.valueOf(System.currentTimeMillis()));
        return contentValues;
    }
}
