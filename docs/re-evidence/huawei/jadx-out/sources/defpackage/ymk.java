package defpackage;

import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.nfc.PluginPayAdapter;
import com.huawei.operation.OpAnalyticsConstants;

/* JADX INFO: loaded from: classes20.dex */
public class ymk {
    public static String o(String str) {
        return yme.d(str, "getReservedness", "device_reservedness");
    }

    public static String b(String str) {
        return yme.d(str, "getCapability", "device_capability");
    }

    public static String e(String str) {
        return yme.d(str, "getBasicInfo", "device_basic_info");
    }

    public static String g(String str) {
        return yme.d(str, "getIdentify", "device_identify");
    }

    public static String m(String str) {
        return yme.d(str, "getWearEngineDeviceId", "device_wear_engine_device_id");
    }

    public static String k(String str) {
        return yme.d(str, "getSoftwareVersion", OpAnalyticsConstants.DEVICE_SOFT_VERSION);
    }

    public static boolean l(String str) {
        return yme.c(str, "getSupportOTA", "device_is_support_ota");
    }

    public static String i(String str) {
        return yme.d(str, "getExtra", "device_extra");
    }

    public static int h(String str) {
        return yme.d(str, "getP2pCapability", "device_p2p_capability", 2);
    }

    public static int j(String str) {
        return yme.d(str, "getMonitorCapability", "device_monitor_capability", 2);
    }

    public static int f(String str) {
        return yme.d(str, "getNotifyCapability", "device_notify_capability", 2);
    }

    public static int n(String str) {
        return yme.d(str, "getSensorCapability", "device_sensor_capability", 2);
    }

    public static String c(String str) {
        return yme.d(str, "getDeviceCategory", PluginPayAdapter.DEVICE_CATEGORY);
    }

    public static int d(String str) {
        if (ylk.d("powerMode")) {
            return yme.d(str, "getDeviceType", DeviceCategoryFragment.DEVICE_TYPE, -1);
        }
        return -1;
    }

    public static String a(String str) {
        return yme.d(str, "getDeviceFid", "device_fid");
    }
}
