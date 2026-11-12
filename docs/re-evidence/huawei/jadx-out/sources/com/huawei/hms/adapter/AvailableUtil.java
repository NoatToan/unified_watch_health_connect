package com.huawei.hms.adapter;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.AndroidException;
import com.huawei.hms.adapter.ui.UpdateAdapter;
import com.huawei.hms.common.HmsCheckedState;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.AgHmsUpdateState;

/* JADX INFO: loaded from: classes3.dex */
public class AvailableUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f12701a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f12702b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f12703c = false;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f12704a;

        a(Context context) {
            this.f12704a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.i("AvailableUtil", "enter asyncCheckHmsV3UpdateInfo");
            if (AvailableUtil.isInstallerLibExist(this.f12704a)) {
                UpdateAdapter.invokeMethod("com.huawei.hms.adapter.ui.InstallerAdapter", "checkHmsUpdateInfo", new Object[]{this.f12704a});
                HMSLog.i("AvailableUtil", "quit asyncCheckHmsV3UpdateInfo");
            } else {
                AgHmsUpdateState.getInstance().setCheckedState(HmsCheckedState.NOT_NEED_UPDATE);
                HMSLog.e("AvailableUtil", "asyncCheckHmsV3UpdateInfo installer is not exist");
            }
        }
    }

    public static void asyncCheckHmsUpdateInfo(Context context) {
        if (HmsCheckedState.UNCHECKED != AgHmsUpdateState.getInstance().getCheckedState()) {
            HMSLog.i("AvailableUtil", "asyncCheckHmsUpdateInfo, not need to check");
        } else {
            new Thread(new a(context), "Thread-asyncCheckHmsV3UpdateInfo").start();
        }
    }

    public static boolean isInstallerLibExist(Context context) {
        Bundle bundle;
        Object obj;
        boolean z;
        if (f12702b) {
            HMSLog.i("AvailableUtil", "installerInit exist: " + f12703c);
            return f12703c;
        }
        synchronized (f12701a) {
            if (!f12702b) {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    HMSLog.e("AvailableUtil", "In isAvailableLibExist, Failed to get 'PackageManager' instance.");
                    try {
                        Class.forName("com.huawei.hms.update.manager.UpdateManager");
                        z = true;
                    } catch (ClassNotFoundException unused) {
                        HMSLog.e("AvailableUtil", "In isInstallerLibExist, Failed to find class UpdateManager.");
                        z = false;
                    }
                } else {
                    try {
                        ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
                        if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || (obj = bundle.get("availableHMSCoreInstaller")) == null || !String.valueOf(obj).equalsIgnoreCase("yes")) {
                            z = false;
                        } else {
                            HMSLog.i("AvailableUtil", "available exist: true");
                            z = true;
                        }
                    } catch (AndroidException unused2) {
                        HMSLog.e("AvailableUtil", "In isInstallerLibExist, Failed to read meta data for the availableHMSCoreInstaller.");
                    } catch (RuntimeException e) {
                        HMSLog.e("AvailableUtil", "In isInstallerLibExist, Failed to read meta data for the availableHMSCoreInstaller.", e);
                    }
                }
                f12703c = z;
                f12702b = true;
            }
        }
        HMSLog.i("AvailableUtil", "available exist: " + f12703c);
        return f12703c;
    }
}
