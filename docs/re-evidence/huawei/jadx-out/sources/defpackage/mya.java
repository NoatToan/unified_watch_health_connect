package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class mya {
    private String c() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("_id integer primary key autoincrement,Device_ID NVARCHAR(300) not null,TimeStamp integer not null");
        return String.valueOf(sb);
    }

    private String e() {
        return "HWStressManagerDB";
    }

    public void b(mxz mxzVar) {
        if (mxzVar != null) {
            String strE = e();
            if (mxzVar.createStorageDataTable(strE, 1, c()) != 0) {
                if (!mxzVar.deleteDatabase()) {
                    LogUtil.j("StressLastSyncTimeStoreDb", "data base error.");
                } else {
                    mxzVar.createStorageDataTable(strE, 1, c());
                }
            }
        }
    }

    private ContentValues d(long j, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("Device_ID", str);
        contentValues.put("TimeStamp", Long.valueOf(j));
        return contentValues;
    }

    private long c(Cursor cursor) {
        return cursor.getLong(cursor.getColumnIndex("TimeStamp"));
    }

    public long a(mxz mxzVar) {
        Cursor cursorQueryStorageData;
        if (mxzVar != null) {
            cursorQueryStorageData = mxzVar.queryStorageData(e(), 1, "Device_ID='" + mxzVar.a() + "'");
        } else {
            cursorQueryStorageData = null;
        }
        long jC = 0;
        if (cursorQueryStorageData == null) {
            LogUtil.j("StressLastSyncTimeStoreDb", "getLastTimestamp query error");
            return 0L;
        }
        if (cursorQueryStorageData.moveToNext()) {
            LogUtil.d("StressLastSyncTimeStoreDb", "getLastTimestamp cursor.moveToNext() is not null");
            jC = c(cursorQueryStorageData);
        }
        cursorQueryStorageData.close();
        LogUtil.d("StressLastSyncTimeStoreDb", "getLastTimestamp = ", Long.valueOf(jC));
        return jC;
    }

    public void d(mxz mxzVar, long j) {
        if (mxzVar == null) {
            LogUtil.j("StressLastSyncTimeStoreDb", "hwStressManager is null");
            return;
        }
        String strE = e();
        Cursor cursorQueryStorageData = mxzVar.queryStorageData(strE, 1, "Device_ID='" + mxzVar.a() + "'");
        if (cursorQueryStorageData == null) {
            LogUtil.j("StressLastSyncTimeStoreDb", "setLastTimestamp query error");
            return;
        }
        if (cursorQueryStorageData.moveToNext()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("TimeStamp", Long.valueOf(j));
            mxzVar.updateStorageData(strE, 1, contentValues, "Device_ID='" + mxzVar.a() + "'");
            LogUtil.d("StressLastSyncTimeStoreDb", "setLastTimestamp update");
        } else {
            mxzVar.insertStorageData(strE, 1, d(j, mxzVar.a()));
            LogUtil.d("StressLastSyncTimeStoreDb", "setLastTimestamp new");
        }
        cursorQueryStorageData.close();
    }
}
