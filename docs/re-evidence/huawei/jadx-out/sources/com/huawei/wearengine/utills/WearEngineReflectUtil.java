package com.huawei.wearengine.utills;

import android.content.ContentValues;
import android.content.Context;
import com.huawei.health.device.api.PluginDeviceApi;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.lmf;
import health.compact.a.DeviceUtil;
import health.compact.a.GRSManager;
import health.compact.a.KeyValDbManager;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class WearEngineReflectUtil {
    private static final int ERROR = -1;
    private static final int ERROR_LEVEL = 3;
    private static final int INFO_LEVEL = 1;
    private static final String TAG = "WearEngine_WearEngineReflectUtil";
    private static final String USER_ID = "user_id";
    private static final int WARN_LEVEL = 2;

    private WearEngineReflectUtil() {
    }

    public static String getUserId(Context context) {
        LogUtil.a(TAG, "getUserId entry!");
        String strC = KeyValDbManager.d(context).c("user_id");
        LogUtil.a(TAG, "getUserId userId:", strC);
        return strC;
    }

    public static boolean isAuthorizedInHealth(Context context) {
        LogUtil.a(TAG, "isAuthorizedInHealth entry!");
        boolean z = Boolean.parseBoolean(KeyValDbManager.d(context).c("key_wether_to_auth"));
        LogUtil.a(TAG, "isAuthorizedInHealth isAuthorized: ", Boolean.valueOf(z));
        return z;
    }

    public static boolean getHasDeviceDbInfo() {
        LogUtil.a(TAG, "getHasDeviceDbInfo entry!");
        return DeviceUtil.b() || getHasNonWearableDevice();
    }

    public static boolean getHasWearableDeviceDbInfo() {
        LogUtil.a(TAG, "getHasWearableDeviceDbInfo entry!");
        return DeviceUtil.b();
    }

    private static boolean getHasNonWearableDevice() {
        ArrayList<ContentValues> bondedDevice = ((PluginDeviceApi) Services.b("PluginDevice", PluginDeviceApi.class)).getBondedDevice();
        return bondedDevice != null && bondedDevice.size() > 0;
    }

    public static int biAnalyticsSetEvent(Context context, String str, Map<String, Object> map, int i) {
        LogUtil.a(TAG, "biAnalyticsSetEvent entry!");
        if (context == null || str == null || map == null) {
            LogUtil.a(TAG, "biAnalyticsSetEvent param error!");
            return -1;
        }
        return lmf.d().c(context, str, map, i);
    }

    public static String getGrsUrl(Context context) {
        return GRSManager.c(context).getNoCheckUrl("domainScopeOauth", "");
    }

    public static void log(int i, String str, Object[] objArr) {
        if (i == 1) {
            LogUtil.a(str, objArr);
        } else if (i == 2) {
            LogUtil.j(str, objArr);
        } else {
            if (i != 3) {
                return;
            }
            LogUtil.e(str, objArr);
        }
    }
}
