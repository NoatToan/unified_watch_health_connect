package com.miui.tsmclient.util;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.mipay.sdk.util.NavBarUtils;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardInfoFactory;
import com.tsmclient.smartcard.Coder;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.p56;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceUtils {
    private static final int DEFAULT_MULTI_DISPLAY = -1;
    private static final int DEFAULT_ROTATION = -1;
    private static final String HIDE_GESTURE_LINE = "hide_gesture_line";
    private static final int SUPPORTED_MULTI_DISPLAY = 0;
    private static final int SUPPORTED_ROTATION = 0;
    private static final int UNSUPPORTED_MULTI_DISPLAY = 1;
    private static final int UNSUPPORTED_ROTATION = 1;
    private static final String USE_GESTURE_VERSION_THREE = "use_gesture_version_three";
    private static Boolean sFlipDevice;
    private static final String DEVICE_J18 = "cetus";
    private static final String[] DEVICES_NARROW_WIDTH_SCREEN = {DEVICE_J18};
    private static final String[] NOT_SUPPORT_DEPRECATED_TURN_SCREEN_ON = {DEVICE_J18};
    private static final String[] IS_FOD_DEVICE_MODELS = {"ursa", "equuleus", "tucana"};
    private static int sMultiDisplayType = -1;
    private static int sRotationType = -1;

    public static String getAndroidVersion() {
        return Build.VERSION.RELEASE;
    }

    public static int getAppVersionCode(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static String getAppVersionName(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static String getDeviceFirmwareVersion(CardInfo cardInfo) {
        return getPeripheralInfo(cardInfo).getDeviceFirmwareVersion();
    }

    public static String getDeviceId(Context context, CardInfo cardInfo) {
        String deviceId = getPeripheralInfo(cardInfo).getDeviceId(context);
        if (!TextUtils.isEmpty(deviceId) && !deviceId.startsWith(Constants.PREFIX_VAID)) {
            deviceId = Coder.hashDeviceInfo(deviceId);
        }
        return deviceId == null ? "" : deviceId;
    }

    public static String getDeviceLanguage6393() {
        return Locale.getDefault().getISO3Language();
    }

    public static String getDeviceModel(CardInfo cardInfo) {
        return getPeripheralInfo(cardInfo).getDeviceModel();
    }

    public static String getHyperOSRomType() {
        return Versions.getHyperOSRomType();
    }

    public static String getHyperOSVersion() {
        return Versions.getHyperOSVersion();
    }

    public static String getMIUIRomType(CardInfo cardInfo) {
        return Versions.getRomType();
    }

    public static int getNavigationBarHeight(Context context) {
        if (!hasNavigationBar(context)) {
            return 0;
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", PluginPackageConstant.RN_DIR_A);
        int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
        LogUtils.d("DeviceUtils", "getNavigationBarHeight = " + dimensionPixelSize);
        return dimensionPixelSize;
    }

    private static IDeviceInfo getPeripheralInfo(CardInfo cardInfo) {
        if (cardInfo == null) {
            cardInfo = CardInfoFactory.makeCardInfo(CardInfo.CARD_TYPE_DUMMY, null);
        }
        return cardInfo.getDeviceInfo();
    }

    public static String getRomVersion() {
        return Versions.getRomVersion();
    }

    public static List<String> getSIMNumber(CardInfo cardInfo) {
        return getPeripheralInfo(cardInfo).getSIMNumber();
    }

    public static boolean hasNavigationBar(Context context) {
        if (!isGestureNavBar(context)) {
            return true;
        }
        if (isSupportGestureLine(context)) {
            return isEnableGestureLine(context);
        }
        return false;
    }

    public static boolean isDeprecatedTurnScreenOnUnavailable() {
        if (Build.VERSION.SDK_INT > 26) {
            String deviceModel = getDeviceModel(null);
            int i = 0;
            while (true) {
                String[] strArr = NOT_SUPPORT_DEPRECATED_TURN_SCREEN_ON;
                if (i >= strArr.length) {
                    break;
                }
                if (strArr[i].equals(deviceModel)) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public static boolean isDeviceJ18() {
        return TextUtils.equals(getDeviceModel(null), DEVICE_J18);
    }

    public static boolean isEnableGestureLine(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), HIDE_GESTURE_LINE, 0) == 0;
    }

    public static boolean isFlipDevice() {
        Boolean bool = sFlipDevice;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Object objInvoke = ReflectUtil.getMethod(ReflectUtil.getClassFromName("miui.util.MiuiMultiDisplayTypeInfo"), "isFlipDevice", new Class[0]).invoke(null, new Object[0]);
            if (objInvoke instanceof Boolean) {
                sFlipDevice = (Boolean) objInvoke;
            }
        } catch (Exception e) {
            LogUtils.e("get isFlipDevice failed", e);
            sFlipDevice = Boolean.FALSE;
        }
        return sFlipDevice.booleanValue();
    }

    public static boolean isFlipDeviceNormalScreen(Context context) {
        return isFlipDevice() && !p56.c(context);
    }

    public static boolean isFlipDeviceTinyScreen(Context context) {
        return isFlipDevice() && p56.c(context);
    }

    public static boolean isFodDevice() {
        return SystemPropertiesUtils.getBoolean("ro.hardware.fp.fod") || Arrays.asList(IS_FOD_DEVICE_MODELS).contains(getDeviceModel(null));
    }

    public static boolean isFoldDevice() {
        if (sMultiDisplayType == -1) {
            int iA = p56.a(EnvironmentConfig.getContext());
            if (iA == 3 || iA == 5) {
                sMultiDisplayType = 0;
            } else {
                sMultiDisplayType = 1;
            }
        }
        return sMultiDisplayType == 0;
    }

    public static boolean isGestureNavBar(Context context) {
        if (context != null) {
            try {
                Object objInvoke = ReflectUtil.getMethod(ReflectUtil.getClassFromName("android.provider.MiuiSettings$Global"), "getBoolean", ContentResolver.class, String.class).invoke(null, context.getContentResolver(), NavBarUtils.FORCE_FSG_NAV_BAR);
                if (objInvoke instanceof Boolean) {
                    return ((Boolean) objInvoke).booleanValue();
                }
            } catch (Exception e) {
                LogUtils.e("get gesture navigation bar failed", e);
            }
        }
        return false;
    }

    public static boolean isLargeScreenModel(Context context) {
        return context.getResources().getConfiguration().smallestScreenWidthDp > 600;
    }

    public static boolean isNarrowWidthScreen(Context context) {
        String deviceModel = getDeviceModel(null);
        int i = 0;
        while (true) {
            String[] strArr = DEVICES_NARROW_WIDTH_SCREEN;
            if (i >= strArr.length) {
                return false;
            }
            if (TextUtils.equals(strArr[i], deviceModel)) {
                return !isLargeScreenModel(context);
            }
            i++;
        }
    }

    public static boolean isNightMode(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static boolean isSupportAppRotation() {
        if (sRotationType == -1) {
            if (!isFoldDevice() || isDeviceJ18()) {
                sRotationType = 1;
            } else {
                sRotationType = 0;
            }
        }
        return sRotationType == 0;
    }

    public static boolean isSupportGestureLine(Context context) {
        try {
            Method declaredMethod = Class.forName("android.provider.MiuiSettings$Global").getDeclaredMethod("getBoolean", ContentResolver.class, String.class);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(null, context.getContentResolver(), USE_GESTURE_VERSION_THREE)).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void setWindowSecure(Activity activity, boolean z) {
        if (activity == null) {
            return;
        }
        if (z) {
            activity.getWindow().addFlags(8192);
        } else {
            activity.getWindow().clearFlags(8192);
        }
    }

    public static int getAppVersionCode(Context context) {
        return getAppVersionCode(context, context.getPackageName());
    }

    public static String getAppVersionName(Context context) {
        return getAppVersionName(context, context.getPackageName());
    }
}
