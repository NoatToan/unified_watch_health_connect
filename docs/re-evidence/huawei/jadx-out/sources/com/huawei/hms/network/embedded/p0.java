package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.network.NetworkKit;

/* JADX INFO: loaded from: classes34.dex */
public class p0 extends HianalyticsBaseData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f15161a = "HttpDnsHianalyticsData";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f15162b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f15163c = "sdk_version";
    public static final String d = "httpdns";
    public static final String e = "trace_id";
    public static final String f = "trigger_type";
    public static final String g = "dns_sync_query";
    public static final String h = "dns_network_change";
    public static final String i = "dns_init";
    public static final String j = "dns_server_name";
    public static final String k = "localdns_value";
    public static final String l = "httpdns_value";
    public static final String m = "network_type";
    public static final String n = "httpdns_time";
    public static final String o = "localdns_time";
    public static final String p = "dns_server_ips";

    public static void a() {
        synchronized (p0.class) {
            if (!f15162b) {
                try {
                    String option = NetworkKit.getInstance().getOption("core_ha_tag");
                    if (!option.isEmpty()) {
                        HianalyticsHelper.getInstance().setHaTag(option);
                    }
                } catch (NoSuchMethodError unused) {
                    Logger.w(f15161a, "sdk version is too low,ha tag cannot be found");
                }
                f15162b = true;
            }
        }
    }

    public p0() {
        put("sdk_version", "8.0.1.320");
        put("dns_subtype", d);
    }
}
