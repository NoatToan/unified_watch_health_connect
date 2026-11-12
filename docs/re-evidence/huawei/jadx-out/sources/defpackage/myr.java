package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.CursorWindowAllocationException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.KeyValDbManager;

/* JADX INFO: loaded from: classes11.dex */
public class myr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static myr f42699c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HwBaseManager f42700b;

    private myr(HwBaseManager hwBaseManager) {
        this.f42700b = hwBaseManager;
        b();
    }

    public static myr b(HwBaseManager hwBaseManager) {
        myr myrVar;
        synchronized (myr.class) {
            if (f42699c == null) {
                f42699c = new myr(hwBaseManager);
            }
            myrVar = f42699c;
        }
        return myrVar;
    }

    public long e() {
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("user_id");
        long jE = 0;
        try {
            Cursor cursorQueryStorageData = this.f42700b.queryStorageData("heartRateRaiseRemindAlarmTime", 1, "Device_ID='" + strC + myo.b() + "' OR Device_ID='" + myo.b() + "'");
            if (cursorQueryStorageData == null) {
                LogUtil.j("HeartRateRemindAlarmTimeDb", "get lastTimeStamp query error");
                return 0L;
            }
            if (cursorQueryStorageData.moveToNext()) {
                LogUtil.d("HeartRateRemindAlarmTimeDb", "getLastTimeStamp moveToNext() is not null");
                jE = e(cursorQueryStorageData);
            }
            cursorQueryStorageData.close();
            LogUtil.d("HeartRateRemindAlarmTimeDb", "getLastTimeStamp is ", Long.valueOf(jE));
            return jE;
        } catch (CursorWindowAllocationException e) {
            LogUtil.e("HeartRateRemindAlarmTimeDb", "getLastTimeStamp CursorWindowAllocationException:", ExceptionUtils.c(e));
            return 0L;
        }
    }

    public void c(long j) {
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("user_id");
        try {
            Cursor cursorQueryStorageData = this.f42700b.queryStorageData("heartRateRaiseRemindAlarmTime", 1, "Device_ID='" + strC + myo.b() + "'");
            if (cursorQueryStorageData != null) {
                if (cursorQueryStorageData.moveToNext()) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("Time_Stamp", Long.valueOf(j));
                    this.f42700b.updateStorageData("heartRateRaiseRemindAlarmTime", 1, contentValues, "Device_ID='" + strC + myo.b() + "'");
                    LogUtil.a("HeartRateRemindAlarmTimeDb", "setLastTimeStamp update ", Long.valueOf(j));
                } else {
                    this.f42700b.insertStorageData("heartRateRaiseRemindAlarmTime", 1, a(j, strC + myo.b()));
                    LogUtil.a("HeartRateRemindAlarmTimeDb", "setLastTimeStamp new ", Long.valueOf(j));
                }
                cursorQueryStorageData.close();
            }
            this.f42700b.deleteStorageData("heartRateRaiseRemindAlarmTime", 1, "Device_ID='" + myo.b() + "'");
        } catch (CursorWindowAllocationException e) {
            LogUtil.e("HeartRateRemindAlarmTimeDb", "setLastTimeStamp CursorWindowAllocationException:", ExceptionUtils.c(e));
        }
    }

    private long e(Cursor cursor) {
        return cursor.getLong(cursor.getColumnIndex("Time_Stamp"));
    }

    private ContentValues a(long j, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("Device_ID", str);
        contentValues.put("Time_Stamp", Long.valueOf(j));
        return contentValues;
    }

    private void b() {
        this.f42700b.createStorageDataTable("heartRateRaiseRemindAlarmTime", 1, c());
    }

    private String c() {
        StringBuffer stringBuffer = new StringBuffer(0);
        stringBuffer.append("_id integer primary key autoincrement,Device_ID NVARCHAR(300) not null,Time_Stamp integer not null");
        return String.valueOf(stringBuffer);
    }
}
