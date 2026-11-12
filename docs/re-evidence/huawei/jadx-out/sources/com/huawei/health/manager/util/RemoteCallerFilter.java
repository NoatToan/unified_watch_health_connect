package com.huawei.health.manager.util;

import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwauthutil.HsfSignValidator;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteCallerFilter {
    private static final String e = CommonUtil.af();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f8145a = Process.myPid();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f8146c = Process.myUid();

    private RemoteCallerFilter() {
    }

    public static boolean d() {
        if (b()) {
            return true;
        }
        PackageManager packageManager = BaseApplication.b().getPackageManager();
        if (packageManager == null) {
            LogUtil.j("Step_RemoteCallerFilter", "packageManager null not check");
            return false;
        }
        boolean zAu = CommonUtil.au();
        String[] packagesForUid = packageManager.getPackagesForUid(Binder.getCallingUid());
        if (packagesForUid == null) {
            LogUtil.a("Step_RemoteCallerFilter", "isRemoteCallValid packages is null");
            return false;
        }
        for (int i = 0; i < packagesForUid.length; i++) {
            if ("com.huawei.health".equals(packagesForUid[i])) {
                LogUtil.d("Step_RemoteCallerFilter", "the process belongs to mime,uid recognized failed,force ret true");
                return true;
            }
            if (zAu || CommonUtil.bd()) {
                if ("com.android.keyguard".equals(packagesForUid[i]) || "com.android.systemui".equals(packagesForUid[i]) || Constants.HW_INTELLIEGNT_PACKAGE.equals(packagesForUid[i]) || "com.huawei.android.launcher".equals(packagesForUid[i]) || "com.huawei.hiboard".equals(packagesForUid[i]) || "com.huawei.camera".equals(packagesForUid[i]) || e.equals(packagesForUid[i]) || "com.huawei.bone".equals(packagesForUid[i])) {
                    return true;
                }
                if ("com.hihonor.camera".equals(packagesForUid[i])) {
                    LogUtil.a("Step_RemoteCallerFilter", "this app is honor camera");
                    return true;
                }
            }
            if (HsfSignValidator.c(packagesForUid[i])) {
                LogUtil.d("Step_RemoteCallerFilter", "calling check true");
                return true;
            }
            if ("com.huawei.watch.home".equals(packagesForUid[i])) {
                LogUtil.d("Step_RemoteCallerFilter", "watch home apk calling check true");
                return true;
            }
        }
        LogUtil.j("Step_RemoteCallerFilter", "calling check false");
        return false;
    }

    private static boolean b() {
        if (Binder.getCallingPid() == f8145a) {
            LogUtil.d("Step_RemoteCallerFilter", "Binder.getCallingPid() equal MY_PID");
            return true;
        }
        if (Binder.getCallingUid() != f8146c) {
            return false;
        }
        LogUtil.d("Step_RemoteCallerFilter", "Binder.getCallingUid() equal MY_UID");
        return true;
    }

    public static boolean e() {
        if (b()) {
            return true;
        }
        if (BaseApplication.b().getPackageManager() != null) {
            return false;
        }
        LogUtil.j("Step_RemoteCallerFilter", "packageManager null not check");
        return false;
    }
}
