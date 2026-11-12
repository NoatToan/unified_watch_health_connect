package com.huami.watch.companion.config;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huami.watch.companion.account.UserInfoManager;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.AppUtil;
import com.huami.watch.util.Box;
import com.huami.watch.util.I18nUtil;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public final class Config {
    private static final String a = "Config";
    public static String sBuildTime;
    public static String sFlavor;
    public static boolean sIsDebug;
    public static boolean sIsOversea;
    public static boolean sIsTestHosts;
    public static boolean sIsTestMode;
    public static boolean sIsTestModeBackDoorEnabled;

    private Config() {
    }

    private static boolean a() {
        return AppUtil.DEFAULT_CHANNEL.equalsIgnoreCase(sFlavor);
    }

    private static boolean b() {
        return "staging".equalsIgnoreCase(sFlavor);
    }

    public static void configAnalytics(Context context, boolean z) {
        Analytics.config(context, z, z);
    }

    public static void enableLogToFile(boolean z) {
        Log.LogLevel logLevel = Log.settings().getLogLevel();
        Log.LogLevel logLevel2 = Log.LogLevel.FILE_ONLY;
        boolean z2 = logLevel == logLevel2 || Log.settings().getLogLevel() == Log.LogLevel.FULL;
        Log.d(a, "Enable Log to File : " + z + ", Already is : " + z2, new Object[0]);
        if (z == z2) {
            return;
        }
        if (!z) {
            Log.settings().setLogLevel(isDebug() ? Log.LogLevel.CONSOLE_ONLY : Log.LogLevel.NONE);
            return;
        }
        Log.Settings settings = Log.settings();
        if (isDebug()) {
            logLevel2 = Log.LogLevel.FULL;
        }
        settings.setLogLevel(logLevel2);
    }

    public static boolean isBuildOversea() {
        return sIsOversea;
    }

    public static boolean isDebug() {
        return sIsDebug || isInner() || isTestMode();
    }

    public static boolean isDeviceOversea(@NonNull Device device) {
        boolean zIsOverseaEdition = DeviceUtil.isOverseaEdition(device);
        Log.d(a, "IsDeviceOversea : " + zIsOverseaEdition + ", " + device.address(), new Object[0]);
        return zIsOverseaEdition;
    }

    public static boolean isFlavorDev() {
        return "dev".equalsIgnoreCase(sFlavor);
    }

    public static boolean isInner() {
        return a() | b();
    }

    public static boolean isLocaleChina(@NonNull Context context) {
        String localeCountry = I18nUtil.getLocaleCountry(context);
        boolean z = "CN".equalsIgnoreCase(localeCountry) || "HK".equalsIgnoreCase(localeCountry) || "MO".equalsIgnoreCase(localeCountry) || "TW".equalsIgnoreCase(localeCountry);
        Log.d(a, "IsLocaleChina : " + z, new Object[0]);
        return z;
    }

    public static boolean isLocaleOversea(@NonNull Context context) {
        boolean z = I18nUtil.isOversea(context) || !I18nUtil.isZh(context);
        Log.d(a, "IsLocaleOversea : " + z, new Object[0]);
        return z;
    }

    public static boolean isLocaleUnitFahrenheit(@NonNull Context context) {
        return "US".equalsIgnoreCase(I18nUtil.getLocaleCountry(context));
    }

    public static boolean isLocaleUnitImperial(@NonNull Context context) {
        return "US".equalsIgnoreCase(I18nUtil.getLocaleCountry(context));
    }

    public static boolean isTestHosts() {
        return sIsTestHosts || Box.getTestHosts();
    }

    public static boolean isTestMode() {
        return sIsTestMode || (sIsTestModeBackDoorEnabled && Box.getTestMode());
    }

    public static boolean isTestModeBackDoor() {
        return sIsTestModeBackDoorEnabled;
    }

    public static boolean isUserCN(@NonNull Context context) {
        String country = UserInfoManager.get().getCountry();
        boolean zIsCN = !TextUtils.isEmpty(country) ? I18nUtil.isCN(country) : I18nUtil.isCN(context);
        Log.d(a, "Is User CN : " + zIsCN + ", Country : " + country, new Object[0]);
        return zIsCN;
    }

    public static boolean isUserEU(@NonNull Context context) {
        String country = UserInfoManager.get().getCountry();
        boolean zIsEU = !TextUtils.isEmpty(country) ? I18nUtil.isEU(country) : I18nUtil.isEU(context);
        Log.d(a, "Is User EU : " + zIsEU + ", Country : " + country, new Object[0]);
        return zIsEU;
    }

    public static boolean isUserKR(@NonNull Context context) {
        String country = UserInfoManager.get().getCountry();
        boolean zIsKR = !TextUtils.isEmpty(country) ? I18nUtil.isKR(country) : I18nUtil.isKR(context);
        Log.d(a, "Is User KR : " + zIsKR + ", Country : " + country, new Object[0]);
        return zIsKR;
    }

    public static boolean isUserOrBuildOversea(Context context) {
        return isUserOversea(context) || isBuildOversea();
    }

    public static boolean isUserOversea(@NonNull Context context) {
        String country = UserInfoManager.get().getCountry();
        boolean zIsOversea = !TextUtils.isEmpty(country) ? I18nUtil.isOversea(country) : isLocaleOversea(context);
        Log.d(a, "Is User Oversea : " + zIsOversea + ", Country : " + country, new Object[0]);
        return zIsOversea;
    }

    public static boolean isUserUS(@NonNull Context context) {
        String country = UserInfoManager.get().getCountry();
        boolean zIsUS = !TextUtils.isEmpty(country) ? I18nUtil.isUS(country) : I18nUtil.isUS(context);
        Log.d(a, "Is User US : " + zIsUS + ", Country : " + country, new Object[0]);
        return zIsUS;
    }

    public static void switchTestHosts() {
        Box.putTestHosts(!Box.getTestHosts());
    }

    public static boolean switchTestMode() {
        boolean z = !Box.getTestMode();
        Box.putTestMode(z);
        return z;
    }

    public static void configAnalytics(Context context, boolean z, boolean z2) {
        Analytics.config(context, z, z, z2, true, AppUtil.getMetaDataChannel(context));
    }
}
