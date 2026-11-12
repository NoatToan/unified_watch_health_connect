package com.ximalaya.ting.android.opensdk.httputil.httpswitch;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes22.dex */
public class DnsConfig {
    public static boolean enableDnsPod = true;
    public static boolean enableSinaHttpDns = true;
    public static boolean enableUdpDns = true;
    public static ArrayList<String> SINA_HTTPDNS_SERVER_API = new ArrayList<>();
    public static String DNSPOD_SERVER_API = "";
    public static String UDPDNS_SERVER_API = "";
    public static boolean ERROR_LOG_SWITCH = true;
    public static int timer_interval = 3600000;
    public static int retry_interval = 300000;
    public static int ip_retry_num = 1;
    public static int domain_max_ip_number = 1;
    public static int retry_count_per_request = 1;
    public static int lose_con_init_dur = 60000;
    public static boolean enableSpeedTest = false;
    public static int log_compress_timer = 0;
}
