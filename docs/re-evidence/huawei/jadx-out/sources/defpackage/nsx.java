package defpackage;

import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwauthutil.HsfSignValidator;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes39.dex */
public class nsx {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f43628c = BaseApplication.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f43626a = Process.myUid();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f43627b = Process.myPid();

    private static boolean a() {
        if (Binder.getCallingPid() == f43627b) {
            LogUtil.a("SMART_SmartRemoteFilter", "Binder.getCallingPid() == MY_PID");
            return true;
        }
        if (Binder.getCallingUid() != f43626a) {
            return false;
        }
        LogUtil.a("SMART_SmartRemoteFilter", "Binder.getCallingUid() == MY_UID");
        return true;
    }

    public static boolean b() {
        if (a()) {
            return true;
        }
        PackageManager packageManager = BaseApplication.b().getPackageManager();
        if (packageManager == null) {
            LogUtil.a("SMART_SmartRemoteFilter", "packageManager null not check");
            return false;
        }
        boolean zAu = CommonUtil.au();
        String[] packagesForUid = packageManager.getPackagesForUid(Binder.getCallingUid());
        if (packagesForUid == null) {
            LogUtil.a("SMART_SmartRemoteFilter", "packages null not check ");
            return false;
        }
        for (String str : packagesForUid) {
            if (f43628c.equals(str)) {
                LogUtil.a("SMART_SmartRemoteFilter", "the process belongs to mime,uid recognized failed,force ret true");
                return true;
            }
            if (zAu) {
                if ("com.android.keyguard".equals(str) || "com.android.systemui".equals(str)) {
                    LogUtil.a("SMART_SmartRemoteFilter", "the process belongs to mime,uid true ", str);
                    return true;
                }
                if (Constants.HW_INTELLIEGNT_PACKAGE.equals(str) || "com.huawei.android.launcher".equals(str)) {
                    LogUtil.a("SMART_SmartRemoteFilter", "the INTELLIGENT_PACKAGE belongs to mime,uid true ", str);
                    return true;
                }
                if ("com.huawei.hiboard".equals(str) || "com.huawei.bone".equals(str)) {
                    LogUtil.a("SMART_SmartRemoteFilter", "the INTELLIGENT_PACKAGE belongs to mime,uid true ", str);
                    return true;
                }
                if (!"com.android.gallery3d".equals(str) && !"com.huawei.camera".equals(str)) {
                    return false;
                }
                LogUtil.a("SMART_SmartRemoteFilter", "the INTELLIGENT_PACKAGE belongs to mime,uid true ", str);
                return true;
            }
            if (HsfSignValidator.c(str)) {
                LogUtil.a("SMART_SmartRemoteFilter", "calling check true");
                return true;
            }
        }
        LogUtil.a("SMART_SmartRemoteFilter", "calling check false");
        return false;
    }
}
