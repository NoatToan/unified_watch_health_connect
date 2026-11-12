package health.compact.a;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class AliveStatusMgr {
    private AliveStatusMgr() {
    }

    public static void e(Context context) {
        c(context);
    }

    public static long d(Context context) {
        AliveStatusRecord aliveStatusRecordA = a(context);
        if (aliveStatusRecordA == null || aliveStatusRecordA.c()) {
            com.huawei.hwlogsmodel.LogUtil.a("Step_AliveStatusMgr", "acquireLastAliveStatusRecord is null or aliveStatusRecord.isValidTime().");
            return 0L;
        }
        return aliveStatusRecordA.e();
    }

    private static AliveStatusRecord a(Context context) {
        return AliveStatusRecord.d(context);
    }

    private static void c(Context context) {
        AliveStatusRecord.b(context);
    }

    public static void b(Context context) {
        AliveStatusRecord.c(context);
    }
}
