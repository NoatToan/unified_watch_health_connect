package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.huawei.nfc.PluginPayAdapter;
import com.huawei.wearengine.monitor.MonitorItem;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class ylk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f53620a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, Integer> f53621b = null;
    private static volatile int d = -1;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f53621b = concurrentHashMap;
        concurrentHashMap.put("device_get_bonded_device_ex", 2);
        f53621b.put("p2p_send_extra", 2);
        f53621b.put("p2p_get_device_app_version_code", 4);
        f53621b.put("device_get_hi_link_device_id", 2);
        f53621b.put(MonitorItem.MONITOR_CHARGE_STATUS.getName(), 2);
        f53621b.put(MonitorItem.MONITOR_ITEM_LOW_POWER.getName(), 2);
        f53621b.put(MonitorItem.MONITOR_POWER_STATUS.getName(), 2);
        f53621b.put(MonitorItem.MONITOR_ITEM_SLEEP.getName(), 2);
        f53621b.put(MonitorItem.MONITOR_ITEM_SPORT.getName(), 2);
        f53621b.put(MonitorItem.MONITOR_ITEM_WEAR.getName(), 2);
        f53621b.put(MonitorItem.MONITOR_ITEM_HEART_RATE_ALARM.getName(), 2);
        f53621b.put("monitor_query", 2);
        f53621b.put("notify_notify", 2);
        f53621b.put("sensor", 2);
        f53621b.put("auth_pre_start_auth", 2);
        f53621b.put("p2p_cancel_file_transfer", 5);
        f53621b.put("wear_user_status", 6);
        f53621b.put("motion_sensor", 6);
        f53621b.put("device_get_all_bonded_device", 6);
        f53621b.put("is_support_ota", 7);
        f53621b.put("device_get_common_device", 8);
        f53621b.put("set_frequency_type", 8);
        f53621b.put("p2p_send_file_transfer_way_report", 9);
        f53621b.put("query_device_capability", 10);
        f53621b.put(PluginPayAdapter.KEY_DEVICE_INFO_SN, 12);
        f53621b.put("powerMode", 13);
        f53621b.put("deviceFid", 14);
    }

    public static void b(int i) {
        d = i;
    }

    public static int d() {
        if (f53620a != 0) {
            return f53620a;
        }
        f53620a = e();
        return f53620a;
    }

    public static boolean d(String str) {
        yis.a("ApiLevelUtil", "isServiceSupport apiName:" + str);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int iIntValue = f53621b.get(str) == null ? 0 : f53621b.get(str).intValue();
        if (iIntValue == 0) {
            yis.d("ApiLevelUtil", "isServiceSupport inputApiLevel is null");
            return false;
        }
        yis.a("ApiLevelUtil", "isServiceSupport serviceApiLevel: " + d + ", minSupportApiLevel:" + iIntValue);
        return d >= iIntValue;
    }

    private static int e() {
        Context contextE = ylx.e();
        PackageManager packageManager = contextE.getPackageManager();
        if (packageManager == null) {
            yis.d("ApiLevelUtil", "getMetaDataApiLevel PackageManager is null");
            return 0;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(contextE.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                int i = applicationInfo.metaData.getInt("com.huawei.wearengine.sdk.api_level");
                yis.a("ApiLevelUtil", "getMetaDataApiLevel apiLevel:" + i);
                return i;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            yis.c("ApiLevelUtil", "getMetaDataApiLevel PackageManager.NameNotFoundException");
        }
        return 0;
    }
}
