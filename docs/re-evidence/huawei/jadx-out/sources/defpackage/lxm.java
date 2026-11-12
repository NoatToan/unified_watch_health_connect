package defpackage;

import android.database.Cursor;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.KeyValDbManager;

/* JADX INFO: loaded from: classes10.dex */
public class lxm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static lxm f41092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private lxg f41093b;

    private lxm(lxg lxgVar) {
        this.f41093b = lxgVar;
    }

    public static lxm b() {
        lxm lxmVar;
        synchronized (lxm.class) {
            if (f41092a == null) {
                f41092a = new lxm(lxg.c(BaseApplication.getContext()));
            }
            lxmVar = f41092a;
        }
        return lxmVar;
    }

    private String c() {
        return "LastSyncDetailTimeStampDB";
    }

    private long b(Cursor cursor) {
        return cursor.getLong(cursor.getColumnIndex("Time_Stamp"));
    }

    public long c(String str) {
        String strC = c();
        String strC2 = KeyValDbManager.d(BaseApplication.getContext()).c("user_id");
        Cursor cursorQueryStorageData = this.f41093b.queryStorageData(strC, 1, "Device_ID='" + strC2 + str + "'");
        long jB = 0;
        if (cursorQueryStorageData == null) {
            LogUtil.j("LastSyncDetailTimestampDb", "get lastTimestamp query error");
            return 0L;
        }
        if (cursorQueryStorageData.moveToNext()) {
            LogUtil.d("LastSyncDetailTimestampDb", "getLastTimestamp moveToNext() is not null");
            jB = b(cursorQueryStorageData);
        }
        cursorQueryStorageData.close();
        LogUtil.d("LastSyncDetailTimestampDb", "getLastTimestamp: ", Long.valueOf(jB));
        return jB;
    }
}
