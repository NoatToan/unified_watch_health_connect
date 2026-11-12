package com.huawei.health.manager.reconnect;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes2.dex */
class ScanTimeUtil {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f8126b = 256000;

    private ScanTimeUtil() {
    }

    public static long e() {
        if (d(BaseApplication.getContext()) && !BaseApplication.isTv()) {
            long j = f8126b;
            if (j == 4000 || j == 1200000) {
                f8126b = 1200000L;
            } else {
                f8126b = 4000L;
            }
        } else {
            long j2 = f8126b;
            if (j2 == 0) {
                f8126b = 4000L;
            } else if (j2 < 256000) {
                f8126b = j2 * 2;
            } else {
                f8126b = 256000L;
            }
        }
        return f8126b;
    }

    public static void a() {
        f8126b = 0L;
    }

    private static boolean d(Context context) {
        try {
            context.getPackageManager().getApplicationInfo("com.huawei.iconnect", 0);
            ReleaseLogUtil.d("DEVMGR_ScanTimeUtil", "iconnect pkg exist.");
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.huawei.iconnect", 0);
            if (packageInfo != null) {
                int i = packageInfo.versionCode;
                LogUtil.a("ScanTimeUtil", "iconnect code: ", Integer.valueOf(i));
                if (i > 1) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            ReleaseLogUtil.a("DEVMGR_ScanTimeUtil", "iconnect pkg do not exist.");
            return false;
        }
    }
}
