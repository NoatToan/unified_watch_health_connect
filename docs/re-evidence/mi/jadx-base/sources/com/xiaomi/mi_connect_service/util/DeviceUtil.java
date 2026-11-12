package com.xiaomi.mi_connect_service.util;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnDeviceUtils;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes11.dex */
public class DeviceUtil {
    private static final String MI_WATCH_LAUNCHER_KEY = "ro.launcher.package";
    private static final String MI_WATCH_LAUNCHER_VALUE = "com.xiaomi.wearable";
    private static final String MI_WATCH_MODEL_KEY = "ro.product.model";
    private static final String MI_WATCH_MODEL_VALUE = "Mi Watch";
    private static final String TAG = "DeviceUtil";
    public static final String TV_CN_NAME = "dk_device_name";
    public static final String TV_GLOBAL_NAME = "device_name";
    private static BluetoothManager mBluetoothManager;
    private static Class<?> sMiuiSettingSystem;
    public static final int TV_DEVICE_BRAND = getTvDeviceBrand();
    public static final boolean IS_INTERNATIONAL_PHONE = isInternationalMiPhone();
    public static final int CURRENT_DEVICE_TYPE = getCurrentDeviceType();
    public static final boolean IS_TV_GO_ALWAYS_ON = isSupportTVGo();
    public static final boolean IS_SUPPORT_DUAL_BAND_WORK = isSupportDualBandWork();

    private static String getBluetoothName(Context context) {
        if (mBluetoothManager == null) {
            mBluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
        }
        BluetoothManager bluetoothManager = mBluetoothManager;
        if (bluetoothManager == null || bluetoothManager.getAdapter() == null) {
            LogUtil.e(TAG, "BT No Supported, use default name", new Object[0]);
            return null;
        }
        String name = mBluetoothManager.getAdapter().getName();
        LogUtil.v(TAG, "Get Bt name " + name, new Object[0]);
        return name;
    }

    public static int getCurrentDeviceType() {
        if (isMiPhone()) {
            return 1;
        }
        if (isMiTv() || isFengMiTV()) {
            return 2;
        }
        if (isXiaoAiTongXue()) {
            return 4;
        }
        return isMiWatch() ? 7 : 0;
    }

    private static String getDefaultDeviceName(Context context) {
        return Settings.Global.getString(context.getContentResolver(), "device_name");
    }

    private static String getMiPhoneName(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        if (sMiuiSettingSystem == null) {
            sMiuiSettingSystem = Class.forName("android.provider.MiuiSettings$System");
        }
        String str = (String) sMiuiSettingSystem.getMethod("getDeviceName", Context.class).invoke(sMiuiSettingSystem, context);
        LogUtil.v(TAG, "Get Phone name " + str, new Object[0]);
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0025  */
    /* JADX WARN: Code duplicated, block: B:17:0x002a  */
    public static String getName(Context context) {
        String defaultDeviceName;
        int i = CURRENT_DEVICE_TYPE;
        if (i == 0) {
            defaultDeviceName = getDefaultDeviceName(context);
        } else if (i == 1) {
            try {
                defaultDeviceName = getMiPhoneName(context);
            } catch (Exception e) {
                e.printStackTrace();
                if (context.getPackageManager().hasSystemFeature("android.hardware.bluetooth")) {
                    defaultDeviceName = getBluetoothName(context);
                } else {
                    defaultDeviceName = null;
                }
            }
        } else if (i == 2) {
            defaultDeviceName = getTVName(context);
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.bluetooth")) {
            defaultDeviceName = getBluetoothName(context);
        } else {
            defaultDeviceName = null;
        }
        return defaultDeviceName != null ? defaultDeviceName : "unknown";
    }

    private static String getTVName(Context context) {
        return TV_DEVICE_BRAND < 3 ? Settings.Global.getString(context.getContentResolver(), "device_name") : Settings.System.getString(context.getContentResolver(), TV_CN_NAME);
    }

    private static int getTvDeviceBrand() {
        if (isFengMiTV()) {
            return 1;
        }
        return isInternationalMiTV() ? 2 : 3;
    }

    private static boolean isFengMiTV() {
        String systemProperty = PropertyUtils.getSystemProperty("ro.miot.model");
        LogUtil.d(TAG, "platform type property: " + systemProperty, new Object[0]);
        return systemProperty != null && systemProperty.contains("fengmi.projector");
    }

    private static boolean isInternationalMiPhone() {
        String systemProperty = PropertyUtils.getSystemProperty("ro.product.mod_device");
        if (systemProperty != null) {
            return systemProperty.contains("_global");
        }
        return false;
    }

    private static synchronized boolean isInternationalMiTV() {
        boolean z;
        try {
            String systemProperty = PropertyUtils.getSystemProperty("ro.mitv.product.overseas");
            String systemProperty2 = PropertyUtils.getSystemProperty("ro.boot.region");
            LogUtil.d(TAG, "is oversea: " + systemProperty, new Object[0]);
            LogUtil.d(TAG, "region: " + systemProperty2, new Object[0]);
            z = true;
            if (!TextUtils.equals(systemProperty, "true") && (TextUtils.equals(systemProperty, "false") || TextUtils.equals("", systemProperty2) || TextUtils.equals("cn", systemProperty2))) {
                z = false;
            }
            LogUtil.e(TAG, "is international: " + z, new Object[0]);
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    private static boolean isMiBox(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("mbx") || lowerCase.contains("stb");
    }

    public static boolean isMiPhone() {
        return !TextUtils.isEmpty(PropertyUtils.getSystemProperty("ro.miui.ui.version.code"));
    }

    public static boolean isMiTv() {
        String systemProperty = PropertyUtils.getSystemProperty("ro.build.characteristics");
        LogUtil.d(TAG, "platform type property: " + systemProperty, new Object[0]);
        return systemProperty != null && (systemProperty.contains(RnDeviceUtils.CATEGORY_TV) || isMiBox(systemProperty));
    }

    public static boolean isMiWatch() {
        String systemProperty = PropertyUtils.getSystemProperty(MI_WATCH_MODEL_KEY, "");
        String systemProperty2 = PropertyUtils.getSystemProperty(MI_WATCH_LAUNCHER_KEY, "");
        return systemProperty != null && systemProperty2 != null && systemProperty.equals(MI_WATCH_MODEL_VALUE) && systemProperty2.equals("com.xiaomi.wearable");
    }

    private static boolean isSupportDualBandWork() {
        String systemProperty = PropertyUtils.getSystemProperty("ro.hardware.wlan.dbs");
        LogUtil.i(TAG, "isSupportDualBandWork: " + systemProperty, new Object[0]);
        if (TextUtils.isEmpty(systemProperty)) {
            return true;
        }
        int iIntValue = Integer.valueOf(systemProperty).intValue();
        LogUtil.i(TAG, "isSupportDualBandWork: value = " + iIntValue, new Object[0]);
        return iIntValue > 0;
    }

    public static boolean isSupportTVGo() {
        if (CURRENT_DEVICE_TYPE == 2) {
            String systemProperty = PropertyUtils.getSystemProperty("wlan.miplay.p2pgo");
            String systemProperty2 = PropertyUtils.getSystemProperty("wlan.miplay.p2pgo.alwayson");
            LogUtil.e(TAG, "isSupportTVGo: " + systemProperty + ", " + systemProperty2, new Object[0]);
            if (systemProperty != null && systemProperty.equals("1") && systemProperty2 != null && systemProperty2.equals("1")) {
                return true;
            }
        }
        return false;
    }

    public static boolean isXiaoAiTongXue() {
        String systemProperty = PropertyUtils.getSystemProperty("ro.product.brand");
        return systemProperty != null && systemProperty.contains("XiaoAiTongXue");
    }
}
