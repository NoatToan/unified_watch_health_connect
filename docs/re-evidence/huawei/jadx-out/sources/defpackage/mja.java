package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.DbManager;
import health.compact.a.EnvironmentInfo;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class mja {
    public static void b(String str, int i) {
        ReleaseLogUtil.d("SyncStatusUtil", "enter updateSyncStatus with isToSync:", Integer.valueOf(i));
        DbManager.a(BaseApplication.getContext(), String.valueOf(1000), "device_sync_table", 2, "deviceSyncKey varchar primary key ,deviceSyncValue hasDeviceValue varchar");
        String strB = ckg.b(str);
        ContentValues contentValues = new ContentValues();
        contentValues.put("deviceSyncKey", strB);
        contentValues.put("deviceSyncValue", Integer.valueOf(i));
        if (a("deviceSyncKey='syncStatus'")) {
            DbManager.d dVar = new DbManager.d();
            dVar.b(BaseApplication.getContext());
            dVar.c(String.valueOf(1000));
            dVar.b("device_sync_table");
            dVar.e(2);
            DbManager.d(dVar, contentValues, "deviceSyncKey='syncStatus'");
            return;
        }
        DbManager.c(BaseApplication.getContext(), String.valueOf(1000), "device_sync_table", 2, contentValues);
    }

    public static int b(String str) {
        LogUtil.a("SyncStatusUtil", "querySyncStatus");
        Cursor cursorC = DbManager.c(BaseApplication.getContext(), String.valueOf(1000), "device_sync_table", 2, "deviceSyncKey='" + ckg.b(str) + "'");
        if (cursorC == null) {
            return 0;
        }
        if (cursorC.moveToFirst()) {
            int i = cursorC.getInt(cursorC.getColumnIndex("deviceSyncValue"));
            cursorC.close();
            LogUtil.a("SyncStatusUtil", "querySyncStatus:", Integer.valueOf(i));
            return i;
        }
        cursorC.close();
        return 0;
    }

    private static boolean a(String str) {
        LogUtil.a("SyncStatusUtil", "enter isHaveSyncStatus");
        Cursor cursorC = DbManager.c(BaseApplication.getContext(), String.valueOf(1000), "device_sync_table", 2, str);
        boolean z = false;
        if (cursorC != null) {
            z = cursorC.getCount() > 0;
            cursorC.close();
        }
        LogUtil.a("SyncStatusUtil", "isHaveSyncStatus:", Boolean.valueOf(z));
        return z;
    }

    public static void b() {
        if (EnvironmentInfo.g()) {
            try {
                Thread.sleep(BaseApplication.isRunningForeground() ? 50L : 100L);
            } catch (InterruptedException e) {
                ReleaseLogUtil.a("R_SyncStatusUtil", "threadSleep InterruptedException :", ExceptionUtils.c(e));
            }
        }
    }
}
