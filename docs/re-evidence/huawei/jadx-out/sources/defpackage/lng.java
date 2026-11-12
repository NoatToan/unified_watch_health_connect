package defpackage;

import health.compact.a.LogUtil;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class lng {
    public static void b() {
        e("85070001", 99999);
    }

    public static void i() {
        e("85070006", 0);
    }

    public static void b(int i) {
        e("85070006", i);
    }

    public static void d(int i) {
        e("85070006", i);
    }

    public static void a(int i) {
        e("85070004", i);
    }

    public static void d() {
        e("85070004", 1002113);
    }

    public static void e() {
        e("85070004", 0);
    }

    public static void c(int i) {
        e("85070002", i);
    }

    public static void a() {
        e("85070002", 0);
    }

    public static void e(int i) {
        e("85070003", i);
    }

    public static void n() {
        e("85070003", 0);
    }

    public static void k() {
        LogUtil.b("DeviceOpAnalyticsUtil", "wifiSendFileToDevice enter.");
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put("sendType", "1");
        e("87010001", (LinkedHashMap<String, String>) linkedHashMap);
    }

    public static void c() {
        LogUtil.b("DeviceOpAnalyticsUtil", "bluetoothSendFileToDevice enter.");
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put("sendType", "0");
        e("87010001", (LinkedHashMap<String, String>) linkedHashMap);
    }

    public static void j() {
        LogUtil.b("DeviceOpAnalyticsUtil", "wifiP2pLinkSuccess enter.");
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put("wifiConnectStatus", "1");
        e("87010001", (LinkedHashMap<String, String>) linkedHashMap);
    }

    public static void f() {
        LogUtil.b("DeviceOpAnalyticsUtil", "wifiP2pLinkFail enter.");
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put("wifiConnectStatus", "0");
        e("87010001", (LinkedHashMap<String, String>) linkedHashMap);
    }

    public static void b(long j) {
        LogUtil.b("DeviceOpAnalyticsUtil", "creatWifiGroupSuccess enter.");
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put("creatWifiTotalTime", String.valueOf(j));
        e("87010001", (LinkedHashMap<String, String>) linkedHashMap);
    }

    public static void h() {
        LogUtil.b("DeviceOpAnalyticsUtil", "wifiP2pCloseStatistic enter.");
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put("wifiClose", "1");
        e("87010001", (LinkedHashMap<String, String>) linkedHashMap);
    }

    public static void g() {
        LogUtil.b("DeviceOpAnalyticsUtil", "switchHeartRateDetection enter.");
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put("click", "1");
        e("80070006", (LinkedHashMap<String, String>) linkedHashMap);
    }

    public static void e(String str, LinkedHashMap<String, String> linkedHashMap) {
        c(str, linkedHashMap, false);
    }

    public static void c(String str, String str2) {
        xgx.d().wearLinkRiskEvent(str, str2);
    }

    private static void c(String str, LinkedHashMap<String, String> linkedHashMap, boolean z) {
        xgx.d().opEvent2nd(str, linkedHashMap, z);
    }

    private static void e(String str, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put("errorCode", Integer.toString(i));
        if (cop.e() && !xgx.d().noCloudVersion()) {
            c(str, linkedHashMap, true);
        } else {
            e(str, (LinkedHashMap<String, String>) linkedHashMap);
        }
    }
}
