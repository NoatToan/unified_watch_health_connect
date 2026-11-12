package com.huawei.hianalytics.framework;

import android.app.AppOpsManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Binder;
import com.huawei.hianalytics.core.log.HiLog;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r4.noteProxyOpNoThrow(r2, r3) != 0) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(Context context) {
        NetworkCapabilities networkCapabilities;
        HiLog.i("DeviceUtil", "check network available start");
        if (context == null) {
            HiLog.w("DeviceUtil", "Context is null");
            return false;
        }
        int callingPid = Binder.getCallingPid();
        int callingUid = Binder.getCallingUid();
        if (context.checkPermission("android.permission.ACCESS_NETWORK_STATE", callingPid, callingUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp("android.permission.ACCESS_NETWORK_STATE");
            if (strPermissionToOp != null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
                if (packagesForUid != null && packagesForUid.length != 0) {
                    String str = packagesForUid[0];
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    if (appOpsManager != null) {
                    }
                }
            }
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null) {
                    return (networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3) || networkCapabilities.hasTransport(7) || networkCapabilities.hasTransport(4)) && networkCapabilities.hasCapability(16);
                }
            } catch (Exception e) {
                HiLog.e("DeviceUtil", "cannot get network state:" + e);
            }
            return false;
        }
        HiLog.sw("DeviceUtil", "no network permission!");
        return false;
    }
}
