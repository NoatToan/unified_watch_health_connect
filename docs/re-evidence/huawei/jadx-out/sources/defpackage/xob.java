package defpackage;

import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.wear.oversea.overseamanger.OverSeaMangerUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class xob {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile boolean f53222a = false;
    private static final String d = "WalletHiAnalytics";

    public static void d(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        LinkedHashMap<String, String> linkedHashMapE = e(linkedHashMap);
        if (f53222a && xnt.b()) {
            linkedHashMapE.put("log_type", "1");
            linkedHashMapE.put("eventHappenedTime", d());
            if (1 == i) {
                c(str, linkedHashMapE);
                return;
            } else {
                b(str, linkedHashMapE);
                return;
            }
        }
        xnd.b(d, "onOperationEventForChart Fail, cause Switch is closed or not hasInitAnalytics", false);
    }

    public static void e(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        LinkedHashMap<String, String> linkedHashMapE = e(linkedHashMap);
        if (f53222a && xnt.b()) {
            linkedHashMapE.put("log_type", "2");
            linkedHashMapE.put("eventHappenedTime", d());
            if (1 == i) {
                a(str, linkedHashMapE);
                return;
            } else {
                e(str, linkedHashMapE);
                return;
            }
        }
        xnd.b(d, "onOperationEventForVoc Fail, cause Switch is closed or not hasInitAnalytics", false);
    }

    private static void b(String str, LinkedHashMap<String, String> linkedHashMap) {
        HiAnalyticsInstance instanceByTag = HiAnalyticsManager.getInstanceByTag("hianalytics_for_health");
        if (instanceByTag == null || linkedHashMap == null) {
            return;
        }
        instanceByTag.setAppid("com.huawei.wallet");
        linkedHashMap.put("uid", c());
        instanceByTag.onEvent(1, str, linkedHashMap);
        xnd.b(d, "onDefaultOperationEventForChart health SUCCESS", false);
    }

    private static void e(String str, LinkedHashMap<String, String> linkedHashMap) {
        HiAnalyticsInstance instanceByTag = HiAnalyticsManager.getInstanceByTag("hianalytics_for_health");
        if (instanceByTag == null || linkedHashMap == null) {
            return;
        }
        instanceByTag.setAppid("com.huawei.wallet");
        linkedHashMap.put("uid", c());
        instanceByTag.onEvent(1, str, linkedHashMap);
        xnd.b(d, "onDefaultOperationEventForChart health SUCCESS", false);
    }

    private static void c(String str, LinkedHashMap<String, String> linkedHashMap) {
        HiAnalyticsInstance instanceByTag = HiAnalyticsManager.getInstanceByTag("hianalytics_no_udid");
        if (instanceByTag != null) {
            instanceByTag.onEvent(1, str, linkedHashMap);
            xnd.b(d, "onNoUDIDOperationEventForChart SUCCESS", false);
        }
    }

    private static void a(String str, LinkedHashMap<String, String> linkedHashMap) {
        HiAnalyticsInstance instanceByTag = HiAnalyticsManager.getInstanceByTag("hianalytics_no_udid");
        if (instanceByTag != null) {
            instanceByTag.onEvent(1, str, linkedHashMap);
            xnd.b(d, "onNoUDIDOperationEventForVoc SUCCESS", false);
        }
    }

    private static String d() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault()).format(new Date());
    }

    private static String c() {
        return OverSeaMangerUtil.a(xml.d()).b().o();
    }

    private static LinkedHashMap<String, String> e(LinkedHashMap linkedHashMap) {
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.put("real_device_model", OverSeaMangerUtil.a(xml.d()).b().i());
        linkedHashMap.put("real_app_package", OverSeaMangerUtil.a(xml.d()).b().c());
        linkedHashMap.put("real_device_info_soft_version", OverSeaMangerUtil.a(xml.d()).b().n());
        linkedHashMap.put("wear_wallet_sdk_version", xnk.b());
        return linkedHashMap;
    }
}
