package defpackage;

import android.app.ActivityManager;
import android.os.Binder;
import com.huawei.android.app.ActivityManagerEx;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtils;
import health.compact.a.ProcessUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class fkt {
    public static void e(boolean z) {
        int iA = fhy.e().a();
        LogUtil.a("HWhealthLinkage_", "trackState = ", Integer.valueOf(iA));
        if (!z || iA == 1 || iA == 2) {
            d(z);
        }
    }

    public static void d(boolean z) {
        if (!cop.c()) {
            LogUtil.a("HWhealthLinkage_", "The device is not provided by Harmony.");
            return;
        }
        int iA = a(ProcessUtil.e(":PhoneService"));
        if (iA != 0) {
            ReleaseLogUtil.d("HWhealthLinkage_", "PhoneService set Processing ：", Boolean.valueOf(z));
            try {
                ActivityManagerEx.setProcessForeground(new Binder(), iA, z);
                LogUtil.a("HWhealthLinkage_", "setProcessForeground end.");
            } catch (Exception e) {
                LogUtil.e("HWhealthLinkage_", "setProcessForeground fail ", e.getMessage());
                xjt.v("setProcessForeground fail " + e.getMessage());
            }
        }
    }

    private static int a(String str) {
        List<ActivityManager.RunningAppProcessInfo> listB = b();
        int i = 0;
        if (listB == null) {
            LogUtil.a("HWhealthLinkage_", "processes is null");
            return 0;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : listB) {
            if (runningAppProcessInfo.processName.equals(str)) {
                i = runningAppProcessInfo.pid;
            }
        }
        return i;
    }

    private static List<ActivityManager.RunningAppProcessInfo> b() {
        ActivityManager activityManagerJ = CommonUtils.j();
        if (activityManagerJ != null) {
            return activityManagerJ.getRunningAppProcesses();
        }
        return null;
    }
}
