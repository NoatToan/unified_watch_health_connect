package com.huawei.hms.findnetwork.util;

import android.content.Context;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.mlsdk.common.AgConnectInfo;

/* JADX INFO: loaded from: classes10.dex */
public class AgcParseUtil {
    private static AGConnectServicesConfig getAgcConfig() {
        return AGConnectServicesConfig.fromContext(AGConnectInstance.getInstance().getContext());
    }

    public static String getAppId() {
        return getAgcConfig().getString(AgConnectInfo.AgConnectKey.APPLICATION_ID);
    }

    public static String getPackageName() {
        return getAgcConfig().getString(AgConnectInfo.AgConnectKey.PACKAGE_NAME);
    }

    private static AGConnectServicesConfig getAgcConfig(Context context) {
        return AGConnectServicesConfig.fromContext(context);
    }

    public static String getAppId(Context context) {
        return context == null ? "" : getAgcConfig(context).getString(AgConnectInfo.AgConnectKey.APPLICATION_ID);
    }

    public static String getPackageName(Context context) {
        return context == null ? "" : getAgcConfig(context).getString(AgConnectInfo.AgConnectKey.PACKAGE_NAME);
    }

    public static String getRegion() {
        return getAgcConfig().getString("region");
    }
}
