package com.huawei.hwdevice.phoneprocess.mgr.exercise;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.KeyValDbManager;

/* JADX INFO: loaded from: classes10.dex */
public class LastSyncTimestampDb {
    private static final String COLUMN_DEVICE_ID = "Device_ID";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_TIMESTAMP = "Time_Stamp";
    private static final String DB_BAD_MESSAGE = "database disk image is malformed";
    private static final String END_SQL = "'";
    private static final String EQUALS_SQL = "='";
    public static final String TABLE_ID = "HWExerciseAdviceManagerDB";
    private static final String TAG = "HWExerciseAdviceManagerDB";
    private static final String USER_ID = "user_id";

    private String getCreateSqlCmd() {
        StringBuffer stringBuffer = new StringBuffer(0);
        stringBuffer.append("_id integer primary key autoincrement,Device_ID NVARCHAR(300) not null,Time_Stamp integer not null");
        return String.valueOf(stringBuffer);
    }

    private String getCurrentDataTableId() {
        return "HWExerciseAdviceManagerDB";
    }

    public void createDbTable(HwExerciseAdviceManager hwExerciseAdviceManager) {
        if (hwExerciseAdviceManager == null) {
            LogUtil.j("HWExerciseAdviceManagerDB", "createDbTable manager is null");
            return;
        }
        String currentDataTableId = getCurrentDataTableId();
        if (hwExerciseAdviceManager.createStorageDataTable(currentDataTableId, 1, getCreateSqlCmd()) != 0) {
            resetDataBase(hwExerciseAdviceManager, currentDataTableId);
        }
    }

    private void resetDataBase(HwExerciseAdviceManager hwExerciseAdviceManager, String str) {
        LogUtil.j("HWExerciseAdviceManagerDB", "database is bad.");
        if (!hwExerciseAdviceManager.deleteDatabase()) {
            LogUtil.j("HWExerciseAdviceManagerDB", "data base error.");
        } else {
            hwExerciseAdviceManager.createStorageDataTable(str, 1, getCreateSqlCmd());
        }
    }

    public ContentValues getContentValues(long j, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_DEVICE_ID, str);
        contentValues.put(COLUMN_TIMESTAMP, Long.valueOf(j));
        return contentValues;
    }

    private long getAndFillDataTable(Cursor cursor) {
        return cursor.getLong(cursor.getColumnIndex(COLUMN_TIMESTAMP));
    }

    public long getLastTimestamp(HwExerciseAdviceManager hwExerciseAdviceManager) {
        long andFillDataTable = 0;
        if (hwExerciseAdviceManager == null) {
            LogUtil.j("HWExerciseAdviceManagerDB", "getLastTimestamp manager is null");
            return 0L;
        }
        Cursor cursor = null;
        try {
            Cursor cursorQueryStorageData = hwExerciseAdviceManager.queryStorageData(getCurrentDataTableId(), 1, "Device_ID='" + KeyValDbManager.d(BaseApplication.getContext()).c("user_id") + hwExerciseAdviceManager.getCurrentDeviceId() + "' OR Device_ID='" + hwExerciseAdviceManager.getCurrentDeviceId() + END_SQL);
            if (cursorQueryStorageData == null) {
                LogUtil.j("HWExerciseAdviceManagerDB", "get lastTimeStamp query error");
                return 0L;
            }
            if (cursorQueryStorageData.moveToNext()) {
                LogUtil.d("HWExerciseAdviceManagerDB", "getLastTimeStamp moveToNext() is not null");
                andFillDataTable = getAndFillDataTable(cursorQueryStorageData);
            }
            cursorQueryStorageData.close();
            LogUtil.d("HWExerciseAdviceManagerDB", "getLastTimestamp: ", Long.valueOf(andFillDataTable));
            return andFillDataTable;
        } catch (SQLiteDatabaseCorruptException e) {
            if (0 != 0) {
                cursor.close();
            }
            if (e.toString().equals(DB_BAD_MESSAGE)) {
                resetDataBase(hwExerciseAdviceManager, getCurrentDataTableId());
            }
            return 0L;
        }
    }

    public long getLastTimestamp(HwExerciseAdviceManager hwExerciseAdviceManager, String str) {
        long andFillDataTable = 0;
        if (hwExerciseAdviceManager == null) {
            LogUtil.j("HWExerciseAdviceManagerDB", "getLastTimestamp manager is null");
            return 0L;
        }
        Cursor cursorQueryStorageData = hwExerciseAdviceManager.queryStorageData(getCurrentDataTableId(), 1, "Device_ID='" + KeyValDbManager.d(BaseApplication.getContext()).c("user_id") + str + "' OR Device_ID='" + str + END_SQL);
        if (cursorQueryStorageData == null) {
            LogUtil.j("HWExerciseAdviceManagerDB", "getLastTimestamp query error");
            return 0L;
        }
        if (cursorQueryStorageData.moveToNext()) {
            LogUtil.d("HWExerciseAdviceManagerDB", "getLastTimestamp moveToNext() is not null");
            andFillDataTable = getAndFillDataTable(cursorQueryStorageData);
        }
        cursorQueryStorageData.close();
        LogUtil.d("HWExerciseAdviceManagerDB", "getLastTimestamp: ", Long.valueOf(andFillDataTable));
        return andFillDataTable;
    }

    public void setLastTimestamp(HwExerciseAdviceManager hwExerciseAdviceManager, long j) {
        if (hwExerciseAdviceManager == null) {
            LogUtil.j("HWExerciseAdviceManagerDB", "setLastTimestamp manager is null");
            return;
        }
        String currentDataTableId = getCurrentDataTableId();
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("user_id");
        Cursor cursorQueryStorageData = hwExerciseAdviceManager.queryStorageData(currentDataTableId, 1, "Device_ID='" + strC + hwExerciseAdviceManager.getCurrentDeviceId() + END_SQL);
        if (cursorQueryStorageData != null) {
            if (cursorQueryStorageData.moveToNext()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(COLUMN_TIMESTAMP, Long.valueOf(j));
                hwExerciseAdviceManager.updateStorageData(currentDataTableId, 1, contentValues, "Device_ID='" + strC + hwExerciseAdviceManager.getCurrentDeviceId() + END_SQL);
                LogUtil.d("HWExerciseAdviceManagerDB", "setLastTimestamp update");
            } else {
                hwExerciseAdviceManager.insertStorageData(currentDataTableId, 1, getContentValues(j, strC + hwExerciseAdviceManager.getCurrentDeviceId()));
                LogUtil.d("HWExerciseAdviceManagerDB", "setLastTimestamp new");
            }
            cursorQueryStorageData.close();
        }
        hwExerciseAdviceManager.deleteStorageData(currentDataTableId, 1, "Device_ID='" + hwExerciseAdviceManager.getCurrentDeviceId() + END_SQL);
    }

    public void setLastTimestamp(HwExerciseAdviceManager hwExerciseAdviceManager, String str, long j) {
        if (hwExerciseAdviceManager == null) {
            LogUtil.j("HWExerciseAdviceManagerDB", "setLastTimestamp manager is null");
            return;
        }
        String currentDataTableId = getCurrentDataTableId();
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("user_id");
        Cursor cursorQueryStorageData = hwExerciseAdviceManager.queryStorageData(currentDataTableId, 1, "Device_ID='" + strC + str + END_SQL);
        if (cursorQueryStorageData != null) {
            if (cursorQueryStorageData.moveToNext()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(COLUMN_TIMESTAMP, Long.valueOf(j));
                hwExerciseAdviceManager.updateStorageData(currentDataTableId, 1, contentValues, "Device_ID='" + strC + str + END_SQL);
                LogUtil.d("HWExerciseAdviceManagerDB", "setLastTimestamp update");
            } else {
                hwExerciseAdviceManager.insertStorageData(currentDataTableId, 1, getContentValues(j, strC + str));
                LogUtil.d("HWExerciseAdviceManagerDB", "setLastTimestamp new");
            }
            cursorQueryStorageData.close();
        }
        hwExerciseAdviceManager.deleteStorageData(currentDataTableId, 1, "Device_ID='" + str + END_SQL);
    }
}
