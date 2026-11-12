package health.compact.a;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessUtil {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f36627c;

    private ProcessUtil() {
    }

    public static void a() {
        List<ActivityManager.RunningAppProcessInfo> listD = d();
        if (listD == null) {
            return;
        }
        int iMyUid = Process.myUid();
        int iMyPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : listD) {
            if (runningAppProcessInfo.uid == iMyUid && runningAppProcessInfo.pid != iMyPid) {
                Process.killProcess(runningAppProcessInfo.pid);
            }
        }
    }

    public static boolean a(String str) {
        if (c().equals(str)) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> listD = d();
        if (listD == null) {
            return false;
        }
        int iMyUid = Process.myUid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : listD) {
            if (runningAppProcessInfo.uid == iMyUid && str.equals(runningAppProcessInfo.processName)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e() {
        List<ActivityManager.RunningAppProcessInfo> listD = d();
        if (listD == null) {
            return false;
        }
        int iMyUid = Process.myUid();
        String strD = BaseApplication.d();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : listD) {
            if (runningAppProcessInfo.uid == iMyUid && runningAppProcessInfo.importance == 100 && strD.equals(runningAppProcessInfo.processName)) {
                return true;
            }
        }
        return false;
    }

    public static boolean b() {
        return c().equals(BaseApplication.d());
    }

    public static String c() {
        if (TextUtils.isEmpty(f36627c)) {
            if (Build.VERSION.SDK_INT >= 28) {
                f36627c = BaseApplication.getProcessName();
            }
            if (TextUtils.isEmpty(f36627c)) {
                f36627c = c(Process.myPid());
            }
        }
        return f36627c;
    }

    public static String c(int i) {
        String strD = d(i);
        return TextUtils.isEmpty(strD) ? "" : strD;
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return BaseApplication.d();
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == ':') {
            return (BaseApplication.d() + str).intern();
        }
        if (cCharAt != '_' && cCharAt != '-') {
            return str;
        }
        return BaseApplication.d() + str;
    }

    private static String d(int i) {
        List<ActivityManager.RunningAppProcessInfo> listD = d();
        String str = null;
        if (listD == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : listD) {
            if (runningAppProcessInfo.pid == i) {
                str = runningAppProcessInfo.processName;
            }
        }
        return str;
    }

    private static List<ActivityManager.RunningAppProcessInfo> d() {
        ActivityManager activityManagerJ = CommonUtils.j();
        if (activityManagerJ != null) {
            return activityManagerJ.getRunningAppProcesses();
        }
        return null;
    }
}
