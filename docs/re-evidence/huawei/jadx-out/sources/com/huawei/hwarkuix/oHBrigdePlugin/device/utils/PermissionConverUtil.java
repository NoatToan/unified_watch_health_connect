package com.huawei.hwarkuix.oHBrigdePlugin.device.utils;

import android.os.Build;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes37.dex */
public class PermissionConverUtil {
    private static final String ACCESS_BLUETOOTH = "ohos.permission.ACCESS_BLUETOOTH";
    private static final String ACCESS_UDID = "ohos.permission.sec.ACCESS_UDID";
    private static final String ACTIVITY_MOTION = "ohos.permission.ACTIVITY_MOTION";
    private static final String APPROXIMATELY_LOCATION = "ohos.permission.APPROXIMATELY_LOCATION";
    private static final String GET_INSTALLED_BUNDLE_LIST = "ohos.permission.GET_INSTALLED_BUNDLE_LIST";
    private static final String LOCATION = "ohos.permission.LOCATION";
    private static final String READ_CONTACTS = "ohos.permission.READ_CONTACTS";
    private static final String TAG = "PermissionConverUtil";
    private static final String WRITE_CALENDAR = "ohos.permission.WRITE_CALENDAR";

    public static PermissionUtil.PermissionType getPermissionType(String str) {
        LogUtil.a(TAG, "converPermission permissionType is ", str);
        str.hashCode();
        if (str.equals(ACCESS_BLUETOOTH)) {
            return getBLuePermission();
        }
        return null;
    }

    private static PermissionUtil.PermissionType getBLuePermission() {
        if (Build.VERSION.SDK_INT <= 30) {
            return PermissionUtil.PermissionType.LOCATION;
        }
        return PermissionUtil.PermissionType.SCAN;
    }
}
