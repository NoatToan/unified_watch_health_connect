package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class mri {
    public static boolean d(Context context) {
        int i;
        if (context == null) {
            return false;
        }
        String lowerCase = Build.BRAND.toLowerCase(Locale.ENGLISH);
        if (!lowerCase.contains("oppo") && !lowerCase.contains("oneplus")) {
            return false;
        }
        try {
            i = context.getPackageManager().getPackageInfo("com.coloros.calendar", 0).versionCode;
            try {
                LogUtil.a("CalendarPermissionUtils", "oppo versionCode is", Integer.valueOf(i));
            } catch (PackageManager.NameNotFoundException unused) {
                LogUtil.j("CalendarPermissionUtils", "can not find oppo new calendar app");
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            i = 0;
        }
        return i >= 7001000 && !b(context);
    }

    private static boolean b(Context context) {
        boolean z = false;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.coloros.calendar", 128);
            ApplicationInfo applicationInfo2 = context.getPackageManager().getApplicationInfo("com.android.providers.calendar", 128);
            if (applicationInfo != null && applicationInfo2 != null) {
                if (applicationInfo.metaData.getBoolean("mergeVersion") && applicationInfo2.metaData.getBoolean("mergeVersion") && Settings.System.getInt(context.getContentResolver(), "key_calendar_migration", 0) == 1) {
                    z = true;
                }
                LogUtil.a("CalendarPermissionUtils", "oppo is isMigratedVersion or not", Boolean.valueOf(z));
                return z;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    public static DeviceInfo a() {
        DeviceInfo next;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "CalendarPermissionUtils");
        if (deviceList.size() == 0) {
            LogUtil.j("CalendarPermissionUtils", "getContactedDeviceMac: the object of HwDeviceMgr is null. ");
            return null;
        }
        if (deviceList.size() <= 0) {
            next = null;
            break;
        }
        Iterator<DeviceInfo> it = deviceList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (eel.d(next.getProductType()));
        if (next != null) {
            return next;
        }
        LogUtil.j("CalendarPermissionUtils", "getContactedDeviceMac: the object of DeviceInfo is null. ");
        return null;
    }

    public static boolean d() {
        DeviceCapability deviceCapability;
        DeviceInfo deviceInfoA = a();
        if (deviceInfoA == null) {
            return false;
        }
        if (deviceInfoA.getSportVersion() == 1) {
            return true;
        }
        if (deviceInfoA.getSportVersion() == 0) {
            return false;
        }
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(1, deviceInfoA.getDeviceIdentify(), "CalendarPermissionUtils");
        if (mapQueryDeviceCapability != null) {
            LogUtil.j("CalendarPermissionUtils", "filter deviceCapabilityMap is null");
            deviceCapability = mapQueryDeviceCapability.get(deviceInfoA.getDeviceIdentify());
        } else {
            deviceCapability = null;
        }
        return deviceCapability != null && deviceCapability.isSupportSmartWatchVersionStatus();
    }

    public static boolean e() {
        DeviceInfo deviceInfoA = a();
        return deviceInfoA != null && d() && deviceInfoA.getPowerSaveModel() == 0;
    }

    public static boolean h() {
        return eey.d(a(), 184);
    }

    private static boolean f() {
        return a("android.permission.WRITE_CALENDAR");
    }

    private static boolean j() {
        return a("android.permission.READ_CALENDAR");
    }

    public static boolean b() {
        return f() && j();
    }

    public static String d(String str, boolean z) {
        if (z) {
            return "calendar_sync_smart_" + mtr.e(str);
        }
        return "calendar_sync_" + mtr.e(str);
    }

    public static void e(boolean z) {
        LogUtil.a("CalendarPermissionUtils", "setSyncAllCalendarFlag() in isFlag = ", Boolean.valueOf(z));
        SharedPreferenceManager.a("calendar_module", "key_calendar_all", z);
    }

    public static boolean c() {
        return SharedPreferenceManager.b("calendar_module", "key_calendar_all", false);
    }

    private static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("CalendarPermissionUtils", "isPermissionGranted: permission is null or empty.");
            return false;
        }
        Context context = BaseApplication.getContext();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            return packageManager.checkPermission(str, context.getPackageName()) == 0;
        }
        LogUtil.j("CalendarPermissionUtils", "isPermissionGranted: packageManager is null or empty.");
        return false;
    }
}
