package defpackage;

import android.app.ActivityManager;
import android.os.Binder;
import com.huawei.android.app.ActivityManagerEx;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.ProcessUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nfl {
    public static void e(boolean z) {
        if (!CommonUtil.bc()) {
            LogUtil.a("ProcessManagerUtil", "The device is not provided by Harmony.");
            return;
        }
        int iA = a(ProcessUtil.e(":PhoneService"));
        if (iA != 0) {
            ReleaseLogUtil.d("R_ProcessManagerUtil", "PhoneService set Processing: ", Boolean.valueOf(z));
            try {
                ActivityManagerEx.setProcessForeground(new Binder(), iA, z);
            } catch (Exception e) {
                LogUtil.e("ProcessManagerUtil", "setProcessForeground fail ", e.getMessage());
            }
        }
    }

    private static int a(String str) {
        List<ActivityManager.RunningAppProcessInfo> listC = c();
        int i = 0;
        if (listC == null) {
            LogUtil.a("ProcessManagerUtil", "processes is null");
            return 0;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : listC) {
            if (runningAppProcessInfo.processName.equals(str)) {
                i = runningAppProcessInfo.pid;
            }
        }
        return i;
    }

    private static List<ActivityManager.RunningAppProcessInfo> c() {
        ActivityManager activityManagerJ = CommonUtils.j();
        if (activityManagerJ != null) {
            return activityManagerJ.getRunningAppProcesses();
        }
        return null;
    }
}
