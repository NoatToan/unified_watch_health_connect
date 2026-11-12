package com.miui.tsmclient.util;

import android.content.Context;
import defpackage.ni4;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class PermissionUtils {
    public static final String[] LOCATION_PERMISSIONS = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    public static final String[] READ_PHONE_PERMISSIONS = {"android.permission.READ_PHONE_STATE", "android.permission.READ_PHONE_NUMBERS"};
    public static final String READ_PRIVILEGED_PHONE_STATE_PERMISSION = "android.permission.READ_PRIVILEGED_PHONE_STATE";
    public static final String[] READ_PRIVILEGED_PHONE_PERMISSIONS = {READ_PRIVILEGED_PHONE_STATE_PERMISSION};

    private PermissionUtils() {
    }

    public static boolean isAllGranted(Map<String, PermissionLauncher.PermissionResult> map) {
        for (Map.Entry<String, PermissionLauncher.PermissionResult> entry : map.entrySet()) {
            if (entry == null || entry.getValue() == null || !entry.getValue().isGranted()) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAllPermanentDenied(Map<String, PermissionLauncher.PermissionResult> map) {
        for (Map.Entry<String, PermissionLauncher.PermissionResult> entry : map.entrySet()) {
            if (entry == null || entry.getValue() == null || entry.getValue().isGranted() || entry.getValue().isProvisionalDenied() || entry.getValue().isDeniedAndAskNoMore()) {
                return false;
            }
        }
        return true;
    }

    public static boolean isGranted(Map<String, PermissionLauncher.PermissionResult> map) {
        for (Map.Entry<String, PermissionLauncher.PermissionResult> entry : map.entrySet()) {
            if (entry != null && entry.getValue() != null && entry.getValue().isGranted()) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAllGranted(Context context, String[] strArr) {
        if (context == null) {
            return false;
        }
        for (String str : strArr) {
            if (ni4.a(context, str) == -1) {
                return false;
            }
        }
        return true;
    }
}
