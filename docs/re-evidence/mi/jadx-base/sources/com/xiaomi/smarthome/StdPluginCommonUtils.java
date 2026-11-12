package com.xiaomi.smarthome;

import com.tencent.mmkv.MMKV;
import com.xiaomi.fitness.login.region.RegionManagerImpl;

/* JADX INFO: loaded from: classes4.dex */
public class StdPluginCommonUtils {
    public static final int HOMEPAGE_TYPE_CUSTOM_PLUGIN = 1;
    public static final int HOMEPAGE_TYPE_STD_PLUGIN = 0;
    public static final String LAUNCH_CONFIG_ID = "std.plugin.launch_config";

    public static int getHomePageType(String str, String str2) {
        return MMKV.G(LAUNCH_CONFIG_ID, 2).f(getLaunchConfigKey(str, str2), 0);
    }

    private static String getLaunchConfigKey(String str, String str2) {
        return "prefer.custom.plugin_" + str + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + str2;
    }

    public static boolean isPreferCustomPlugin(String str, String str2) {
        return MMKV.G(LAUNCH_CONFIG_ID, 2).f(getLaunchConfigKey(str, str2), 0) == 1;
    }

    public static void setHomePageType(String str, String str2, int i) {
        MMKV.G(LAUNCH_CONFIG_ID, 2).r(getLaunchConfigKey(str, str2), i);
    }
}
