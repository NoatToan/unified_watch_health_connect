package com.miui.tsmclient.util;

import android.content.Context;
import com.miui.tsmclient.common.net.request.BaseRequest;
import com.xiaomi.fitness.login.region.RegionManagerImpl;

/* JADX INFO: loaded from: classes6.dex */
public class CardEnvironmentConfig {
    private static IDeviceInfo sIDeviceInfo;

    private CardEnvironmentConfig() {
    }

    public static String getDefaultDevice() {
        Context context = EnvironmentConfig.getContext();
        if (context == null) {
            return null;
        }
        return context.getPackageName();
    }

    public static BaseRequest.RequestType getDefaultSecureType() {
        return EnvironmentConfig.isLoginAuth() ? BaseRequest.RequestType.SECURE : BaseRequest.RequestType.AUTH;
    }

    public static IDeviceInfo getDeviceInfo() {
        return sIDeviceInfo;
    }

    public static String getPrefKey(String str) {
        if (sIDeviceInfo == null) {
            return str;
        }
        return str + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + sIDeviceInfo.getDeviceId(EnvironmentConfig.getContext());
    }

    public static void setDeviceInfo(IDeviceInfo iDeviceInfo) {
        sIDeviceInfo = iDeviceInfo;
    }
}
