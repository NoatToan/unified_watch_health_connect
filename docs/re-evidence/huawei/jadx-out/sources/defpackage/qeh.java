package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.jsoperation.JsUtil;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes15.dex */
public class qeh {
    public static boolean c(long j) {
        Date date = new Date(System.currentTimeMillis());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(11);
        LogUtil.a("CoreSleepNotifyUtil", "indexHour: ", Integer.valueOf(i));
        boolean z = false;
        boolean z2 = i < 0 || i >= 7;
        if (j < ltb.c(System.currentTimeMillis()) - 14400000) {
            ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepNotifyUtil", "pushSleepNotifyMessage sleep endTime too early! endTime = ", Long.valueOf(j));
        } else {
            z = z2;
        }
        ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepNotifyUtil", "isTimeToNotify is", Boolean.valueOf(z));
        return z;
    }

    public static boolean c(int i, int i2, String str, qeb qebVar) {
        String strB;
        long jC = qebVar.c();
        long jB = qebVar.b();
        double dDoubleValue = new BigDecimal(jC).subtract(new BigDecimal(jB)).doubleValue() / 3600000.0d;
        boolean z = false;
        boolean z2 = dDoubleValue > 3.0d;
        LogUtil.a("CoreSleepNotifyUtil", "saveCoreSleepData notify enter,the last data's fallAsleepTime :", Long.valueOf(jB), "wakeTime :", Long.valueOf(jC), "duration :", Double.valueOf(dDoubleValue));
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("user_id");
        if (!TextUtils.isEmpty(str)) {
            LogUtil.a("CoreSleepNotifyUtil", "deviceUUid :", CommonUtil.n(str));
            strB = lsp.b(com.huawei.haf.application.BaseApplication.b(), strC + str + "downWakeupTime");
        } else {
            strB = lsp.b(com.huawei.haf.application.BaseApplication.b(), strC + "downWakeupTime");
        }
        if (SharedPreferenceManager.d(String.valueOf(10024), strB, 0L) == jC) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_CoreSleepNotifyUtil", "spWakeupTime equals wakeTime");
            return false;
        }
        if (VersionControlUtil.isSupportSleepManagement()) {
            ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepNotifyUtil", "shouldSendSleepNotify isShouldNotify is ", Boolean.valueOf(z2), ", insertCode is ", Integer.valueOf(i), ", SleepMgmtAlgorithmCode is ", Integer.valueOf(i2));
            if (z2 && i == 0 && c(jC) && i2 == 0) {
                z = true;
            }
            if (z) {
                SharedPreferenceManager.c(String.valueOf(10024), strB, jC);
            }
            return z;
        }
        ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepNotifyUtil", "shouldSendSleepNotify isShouldNotify is ", Boolean.valueOf(z2), " insertCode is", Integer.valueOf(i));
        return z2 && i == 0 && c(jC);
    }

    public static void c(qeb qebVar) {
        Intent intent = new Intent("com.huawei.health.track.broadcast");
        intent.putExtra("fallAsleepTime", qebVar.b());
        intent.putExtra("wakeTime", qebVar.c());
        intent.putExtra(JsUtil.SCORE, qebVar.a());
        intent.putExtra("command_type", "com.huawei.health.sync.coresleep");
        BroadcastManagerUtil.e(BaseApplication.getContext(), intent);
        ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepNotifyUtil", "sendSleepBroadcast end");
    }
}
