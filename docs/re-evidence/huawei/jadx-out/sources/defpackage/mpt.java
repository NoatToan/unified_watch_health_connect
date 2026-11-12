package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.DbManager;

/* JADX INFO: loaded from: classes11.dex */
public class mpt {
    public static void d(final String str, final int i) {
        LogUtil.a("BasicSyncStatusUtil", "enter updateSyncStatus with isToSync:", Integer.valueOf(i));
        ThreadPoolManager.c().execute(new Runnable() { // from class: mpt.1
            @Override // java.lang.Runnable
            public void run() {
                DbManager.a(BaseApplication.getContext(), String.valueOf(1000), "device_sync_table", 2, "deviceSyncKey varchar primary key ,deviceSyncValue hasDeviceValue varchar");
                String strB = ckg.b(str);
                ContentValues contentValues = new ContentValues();
                contentValues.put("deviceSyncKey", strB);
                contentValues.put("deviceSyncValue", Integer.valueOf(i));
                if (mpt.d("deviceSyncKey='syncStatus'")) {
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
        });
    }

    public static int b(String str) {
        LogUtil.a("BasicSyncStatusUtil", "querySyncStatus");
        Cursor cursorC = DbManager.c(BaseApplication.getContext(), String.valueOf(1000), "device_sync_table", 2, "deviceSyncKey='" + ckg.b(str) + "'");
        if (cursorC == null) {
            return 0;
        }
        if (cursorC.moveToFirst()) {
            int i = cursorC.getInt(cursorC.getColumnIndex("deviceSyncValue"));
            cursorC.close();
            LogUtil.a("BasicSyncStatusUtil", "querySyncStatus:", Integer.valueOf(i));
            return i;
        }
        cursorC.close();
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(String str) {
        LogUtil.a("BasicSyncStatusUtil", "enter isHaveSyncStatus");
        Cursor cursorC = DbManager.c(BaseApplication.getContext(), String.valueOf(1000), "device_sync_table", 2, str);
        boolean z = false;
        if (cursorC != null) {
            z = cursorC.getCount() > 0;
            cursorC.close();
        }
        LogUtil.a("BasicSyncStatusUtil", "isHaveSyncStatus:", Boolean.valueOf(z));
        return z;
    }
}
