package com.xiaomi.smarthome.library.bluetooth.utils;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import defpackage.trh;

/* JADX INFO: loaded from: classes2.dex */
public class BluetoothPermissionUtil {
    public static final String[] BLUETOOTH = {"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"};

    public static boolean canUseNewBluetoothPermission(Context context) {
        return Build.VERSION.SDK_INT >= 31 && context != null && context.getApplicationInfo() != null && context.getApplicationInfo().targetSdkVersion >= 31;
    }

    public static boolean checkBluetoothPermission(Context context) {
        return !canUseNewBluetoothPermission(context) || checkBluetoothPermissionGranted(context);
    }

    public static boolean checkBluetoothPermissionGranted(Context context) {
        return checkPermissionGroupGranted(context, BLUETOOTH);
    }

    private static boolean checkPermissionGroupGranted(Context context, String... strArr) {
        if (strArr == null) {
            return true;
        }
        for (String str : strArr) {
            if (!checkPermissions(context, str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkPermissions(Context context, String str) {
        if (context.getApplicationInfo().targetSdkVersion < 23) {
            return trh.a(context, str, Binder.getCallingPid(), Binder.getCallingUid(), context.getPackageName()) == 0;
        }
        return context.checkSelfPermission(str) == 0;
    }
}
