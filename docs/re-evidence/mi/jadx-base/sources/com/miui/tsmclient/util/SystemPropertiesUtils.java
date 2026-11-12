package com.miui.tsmclient.util;

import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.ai.domain.mobileapp.adapter.ContextAdapter;
import com.xiaomi.fitness.motion.recognition.schedule.SceneRecogBroadcastReceiver;
import miuix.core.util.SystemProperties;

/* JADX INFO: loaded from: classes6.dex */
public class SystemPropertiesUtils {
    private static final String HYPER_OS_VERSION = "ro.mi.os.version.incremental";
    private static final String KEY_IPHONE_FILTER_ENABLE = "persist.nfc_cfg.filterenable";
    private static final String KEY_NFC_READER_STRATEGY_ENABLE = "persist.nfc_cfg.selectcard";
    private static final String MOD_DEVICE = "ro.product.mod_device";
    public static final int VALUE_IPHONE_FILTER_ENABLE_OFF = 0;
    public static final int VALUE_IPHONE_FILTER_ENABLE_ON = 1;
    public static final int VALUE_IPHONE_FILTER_ENABLE_UNSUPPORTED = -1;

    private SystemPropertiesUtils() {
    }

    public static String get(String str) {
        return SystemProperties.get(str);
    }

    public static boolean getBoolean(String str) {
        return SystemProperties.getBoolean(str, false);
    }

    public static String getHyperOSVersion() {
        return TextUtils.isEmpty(SystemProperties.get(HYPER_OS_VERSION)) ? "" : SystemProperties.get(HYPER_OS_VERSION);
    }

    public static int getIPhoneFilterEnable() {
        return SystemProperties.getInt(KEY_IPHONE_FILTER_ENABLE, -1);
    }

    public static String getMiuiHomePackageName() {
        return SystemProperties.get("ro.miui.product.home", ContextAdapter.MIUI_HOME_PACKAGE);
    }

    public static boolean isAlphaBuild() {
        return SystemProperties.get(MOD_DEVICE, "").endsWith("_alpha");
    }

    public static boolean isDevelopmentBuild() {
        String str = Build.VERSION.INCREMENTAL;
        return !TextUtils.isEmpty(str) && str.matches("\\d+(.\\d+){2,}(-internal)?");
    }

    public static boolean isGlobalBuild() {
        return SystemProperties.get(MOD_DEVICE, "").endsWith("_global");
    }

    private static boolean isHyperOSBuild() {
        return !TextUtils.isEmpty(SystemProperties.get(HYPER_OS_VERSION));
    }

    public static boolean isNeedShowMiuiNFC() {
        return SystemProperties.getInt("ro.vendor.nfc.wallet_fusion", 0) == 1;
    }

    public static boolean isStableBuild() {
        if (SceneRecogBroadcastReceiver.FROM_USER.equals(Build.TYPE)) {
            String str = Build.VERSION.INCREMENTAL;
            if (!TextUtils.isEmpty(str) && str.matches("^V(\\d+.)+([A-Z]+\\d{0,}.?)+(\\d+.?){0,}$")) {
                return true;
            }
        }
        return false;
    }

    public static void setIPhoneFilterEnable(boolean z) {
        SystemProperties.set(KEY_IPHONE_FILTER_ENABLE, z ? 1 : 0);
    }

    public static void setNfcReaderStrategyEnable(boolean z) {
        SystemProperties.set(KEY_NFC_READER_STRATEGY_ENABLE, z);
    }
}
