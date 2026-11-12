package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.db.bean.EventMonitorRecord;
import com.huawei.operation.utils.CloudParamKeys;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mio {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f41720c = false;

    public static void c(DeviceInfo deviceInfo, String str, String str2, String str3, String str4) {
        String strA = DateFormatUtil.a(System.currentTimeMillis(), null, "yyyy-MM-dd HH:mm:ss.SSS", Locale.ENGLISH);
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(EventMonitorRecord.EVENT_ID, str);
        linkedHashMap.put("transType", str2);
        if (deviceInfo != null) {
            linkedHashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_BASE_VERSION, deviceInfo.getSoftVersion());
        } else {
            linkedHashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_BASE_VERSION, "");
            LogUtil.j("HwDeviceUpdateUtil", "uploadOtaEvent deviceInfo is null, eventId = ", str);
        }
        if (deviceInfo != null && ("050901".equals(str) || "050902".equals(str) || "050903".equals(str) || "050904".equals(str) || "050905".equals(str) || "050906".equals(str) || "050907".equals(str) || "050909".equals(str))) {
            linkedHashMap.put("targetVersion", nvd.i(BaseApplication.getContext(), deviceInfo.getDeviceIdentify()));
        } else {
            linkedHashMap.put("targetVersion", "");
        }
        linkedHashMap.put("errorCode", str3);
        linkedHashMap.put("timestamp", strA);
        linkedHashMap.put(CloudParamKeys.INFO, str4);
        cpj.d(new JSONObject(linkedHashMap).toString(), "", 1, deviceInfo);
    }

    public static boolean b(long j, long j2) {
        Calendar calendarB = b(j);
        Calendar calendarB2 = b(j2);
        return calendarB.get(1) == calendarB2.get(1) && calendarB.get(2) == calendarB2.get(2) && Math.abs(calendarB.get(5) - calendarB2.get(5)) < 1;
    }

    private static Calendar b(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        return calendar;
    }

    public static boolean d(int i, String str) {
        LogUtil.a("HwDeviceUpdateUtil", "isAlreadyCheck deviceId ", CommonUtil.n(str));
        boolean zD = nvd.d(nvd.b(BaseApplication.getContext(), str), i);
        LogUtil.a("HwDeviceUpdateUtil", "isAlreadyCheck = ", Boolean.valueOf(zD));
        return zD;
    }

    public static boolean c() {
        try {
            Object systemService = BaseApplication.getContext().getSystemService("activity");
            List<ActivityManager.RunningTaskInfo> runningTasks = systemService instanceof ActivityManager ? ((ActivityManager) systemService).getRunningTasks(10) : null;
            if (runningTasks != null && runningTasks.size() > 0) {
                for (int i = 0; i < runningTasks.size(); i++) {
                    if (runningTasks.get(i).topActivity != null && TextUtils.equals(runningTasks.get(i).topActivity.getPackageName(), BaseApplication.getContext().getPackageName()) && (TextUtils.equals(runningTasks.get(i).topActivity.getClassName(), "com.huawei.ui.device.activity.update.WearDeviceUpdateDialogActivity") || TextUtils.equals(runningTasks.get(i).topActivity.getClassName(), "com.huawei.ui.device.activity.pairing.DevicePairGuideActivity") || TextUtils.equals(runningTasks.get(i).topActivity.getClassName(), "com.huawei.ui.device.activity.update.UpdateVersionActivity") || TextUtils.equals(runningTasks.get(i).topActivity.getClassName(), "com.huawei.ui.device.activity.update.DeviceOtaActivity") || TextUtils.equals(runningTasks.get(i).topActivity.getClassName(), ComponentInfo.PluginWearAbility_A_3))) {
                        LogUtil.a("HwDeviceUpdateUtil", "band is showing ,current activity :", runningTasks.get(i).topActivity.getClassName());
                        return true;
                    }
                }
                return false;
            }
            LogUtil.j("HwDeviceUpdateUtil", "(runningTaskInfos == null) || (runningTaskInfos.size() <= 0)");
            return false;
        } catch (SecurityException unused) {
            LogUtil.e("HwDeviceUpdateUtil", "isBandShowing SecurityException");
        }
    }

    public static boolean g() {
        Object systemService = BaseApplication.getContext().getSystemService("activity");
        List<ActivityManager.RunningTaskInfo> runningTasks = systemService instanceof ActivityManager ? ((ActivityManager) systemService).getRunningTasks(10) : null;
        if (runningTasks == null || runningTasks.size() <= 0) {
            LogUtil.j("HwDeviceUpdateUtil", "(runningTaskInfos == null) || (runningTaskInfos.size() <= 0)");
            return true;
        }
        if (runningTasks.get(0).topActivity == null) {
            return true;
        }
        String packageName = runningTasks.get(0).topActivity.getPackageName();
        if (!TextUtils.equals(packageName, BaseApplication.getContext().getPackageName())) {
            return true;
        }
        if (!TextUtils.equals(packageName, "com.huawei.ui.device.activity.update.WearDeviceUpdateDialogActivity") && !TextUtils.equals(packageName, "com.huawei.ui.device.activity.pairing.DevicePairGuideActivity") && !TextUtils.equals(packageName, "com.huawei.ui.device.activity.update.UpdateVersionActivity") && !TextUtils.equals(packageName, "com.huawei.ui.device.activity.update.DeviceOtaActivity") && !TextUtils.equals(packageName, ComponentInfo.PluginWearAbility_A_3)) {
            return false;
        }
        LogUtil.a("HwDeviceUpdateUtil", "band is showing ,current activity :", packageName);
        return true;
    }

    public static void b(String str, boolean z) {
        String str2 = "update_key_band_new_version_flag";
        if (!TextUtils.isEmpty(str)) {
            str2 = nio.c(str) + "update_key_band_new_version_flag";
        }
        LogUtil.a("HwDeviceUpdateUtil", "refreshRestoreOtaFlag key:", str2, " isNeedInit ", Boolean.valueOf(z));
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1003), str2, String.valueOf(z), null);
    }

    public static boolean a(String str) {
        String str2 = "update_key_band_new_version_flag";
        if (!TextUtils.isEmpty(str)) {
            str2 = nio.c(str) + "update_key_band_new_version_flag";
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1003), str2);
        LogUtil.a("HwDeviceUpdateUtil", "isRestoreOtaFlag key:", str2, " isNeedInit ", strE);
        return Boolean.parseBoolean(strE);
    }

    public static boolean b(String str) {
        Date dateC;
        LogUtil.a("HwDeviceUpdateUtil", "isCheckInterval : lastTime = ", str);
        if (TextUtils.isEmpty(str) || (dateC = nvd.c(str)) == null) {
            return true;
        }
        return Math.abs(System.currentTimeMillis() - dateC.getTime()) > 43200000;
    }

    public static String c(String str) {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1003), str);
        LogUtil.a("HwDeviceUpdateUtil", "getLastStartedTime, lastTime ", strE);
        return strE;
    }

    public static void d(String str) {
        String strE = nvd.e();
        LogUtil.a("HwDeviceUpdateUtil", "setStartedTime, currentTimeMinutes ", strE);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1003), str, strE, null);
    }

    public static boolean e() {
        return f41720c;
    }

    public static void a(boolean z) {
        f41720c = z;
    }

    public static void a(String str, boolean z) {
        LogUtil.a("HwDeviceUpdateUtil", "setUpdateBand deviceId ", CommonUtil.n(str), " isUpdate ", Boolean.valueOf(z));
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1003), "is_auto_update_band" + nio.e(str), String.valueOf(z), null);
    }

    public static boolean e(String str) {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1003), "is_auto_update_band" + nio.e(str));
        LogUtil.a("HwDeviceUpdateUtil", "getUpdateBand deviceId ", CommonUtil.n(str), " updateResult ", strE);
        return Boolean.parseBoolean(strE);
    }

    public static boolean b() {
        Object systemService = BaseApplication.getContext().getSystemService("activity");
        List<ActivityManager.RunningTaskInfo> runningTasks = systemService instanceof ActivityManager ? ((ActivityManager) systemService).getRunningTasks(10) : null;
        if (runningTasks == null || runningTasks.size() <= 0) {
            LogUtil.j("HwDeviceUpdateUtil", "isBandTransferActivity (runningTaskInfos == null) || (runningTaskInfos.size() <= 0)");
            return false;
        }
        for (int i = 0; i < runningTasks.size(); i++) {
            if (runningTasks.get(i).topActivity != null && TextUtils.equals(runningTasks.get(i).topActivity.getPackageName(), BaseApplication.getContext().getPackageName()) && TextUtils.equals(runningTasks.get(0).topActivity.getClassName(), "com.huawei.ui.device.activity.update.DeviceOtaActivity")) {
                LogUtil.a("HwDeviceUpdateUtil", "isBandTransferActivity band is showing ,current activity :", runningTasks.get(0).topActivity.getClassName());
                return true;
            }
        }
        return false;
    }

    public static boolean a() {
        boolean zJ = j();
        LogUtil.a("HwDeviceUpdateUtil", "isMobileTraffic isWifiConnected = ", Boolean.valueOf(zJ));
        if (CommonUtil.bg()) {
            int iD = d();
            LogUtil.a("HwDeviceUpdateUtil", "isMobileTraffic wifiType = ", Integer.valueOf(iD));
            if (zJ && iD == 1) {
                return false;
            }
        } else if (zJ) {
            return false;
        }
        return true;
    }

    public static boolean j() {
        NetworkInfo activeNetworkInfo;
        LogUtil.a("HwDeviceUpdateUtil", "isWifiConnected");
        Object systemService = BaseApplication.getContext().getSystemService("connectivity");
        return (systemService instanceof ConnectivityManager) && (activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1;
    }

    public static int d() {
        try {
            Class<?> cls = Class.forName("com.huawei.android.net.wifi.WifiManagerCommonEx");
            Object objInvoke = cls.getMethod("getHwMeteredHint", Context.class).invoke(cls.newInstance(), BaseApplication.getContext());
            return (!(objInvoke instanceof Boolean) || ((Boolean) objInvoke).booleanValue()) ? 2 : 1;
        } catch (ClassNotFoundException unused) {
            LogUtil.e("HwDeviceUpdateUtil", "isMeteredWifi ClassNotFoundException");
            return 0;
        } catch (IllegalAccessException unused2) {
            LogUtil.e("HwDeviceUpdateUtil", "isMeteredWifi IllegalAccessException");
            return 0;
        } catch (IllegalArgumentException unused3) {
            LogUtil.e("HwDeviceUpdateUtil", "isMeteredWifi IllegalArgumentException");
            return 0;
        } catch (InstantiationException unused4) {
            LogUtil.e("HwDeviceUpdateUtil", "isMeteredWifi InstantiationException");
            return 0;
        } catch (NoSuchMethodException unused5) {
            LogUtil.e("HwDeviceUpdateUtil", "isMeteredWifi NoSuchMethodException");
            return 0;
        } catch (InvocationTargetException unused6) {
            LogUtil.e("HwDeviceUpdateUtil", "isMeteredWifi InvocationTargetException");
            return 0;
        }
    }
}
