package com.ximalaya.ting.android.opensdk.httputil.httpswitch;

import com.xmlywind.sdk.common.mta.PointType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class ConfigDetail {
    public String LOG_COMPRESS_TIMER;
    public String LOSE_CON_INIT_DUR;
    public String VERSION = "default";
    public String DOMAIN_MAX_IP_NUMBER = "3";
    public String IS_UDPDNS_SERVER = "";
    public String UDPDNS_SERVER_API = "";
    public String HTTPDNS_LOG_SAMPLE_RATE = "50";
    public String HTTPDNS_SWITCH = "";
    public String SCHEDULE_SPEED_INTERVAL = "3600000";
    public String SCHEDULE_LOG_INTERVAL = "3600000";
    public String SCHEDULE_TIMER_INTERVAL = "3600000";
    public String IP_OVERDUE_DELAY = "3600000";
    public String IS_MY_HTTP_SERVER = "";
    public ArrayList<String> HTTPDNS_SERVER_API = new ArrayList<>();
    public String IS_DNSPOD_SERVER = "";
    public String DNSPOD_SERVER_API = "";
    public String DNSPOD_ID = null;
    public String DNSPOD_KEY = null;
    public String IS_SORT = "";
    public String SPEEDTEST_PLUGIN_NUM = PointType.DOWNLOAD_TRACKING;
    public String PRIORITY_PLUGIN_NUM = PointType.WIND_COMMON;
    public String SUCCESSNUM_PLUGIN_NUM = "10";
    public String ERRNUM_PLUGIN_NUM = "10";
    public String SUCCESSTIME_PLUGIN_NUM = "10";
    public ArrayList<String> DOMAIN_SUPPORT_LIST = new ArrayList<>();
    public Map<String, DomainDetail> DOMAIN_DETAILS = new HashMap();
    public String IP_CHECK_RETRY_INTERVAL = "300000";
    public String ERROR_LOG_SWITCH = "1";
    public String RETRY_IP_NUMBER = "1";
    public String SPEED_TEST_SWITCH = "0";
    public String RETRY_COUNT_PER_REQUEST = "1";

    public String toString() {
        return "ConfigDetail{VERSION='" + this.VERSION + "', DOMAIN_MAX_IP_NUMBER='" + this.DOMAIN_MAX_IP_NUMBER + "', IS_UDPDNS_SERVER='" + this.IS_UDPDNS_SERVER + "', UDPDNS_SERVER_API='" + this.UDPDNS_SERVER_API + "', HTTPDNS_LOG_SAMPLE_RATE='" + this.HTTPDNS_LOG_SAMPLE_RATE + "', HTTPDNS_SWITCH='" + this.HTTPDNS_SWITCH + "', SCHEDULE_SPEED_INTERVAL='" + this.SCHEDULE_SPEED_INTERVAL + "', SCHEDULE_LOG_INTERVAL='" + this.SCHEDULE_LOG_INTERVAL + "', SCHEDULE_TIMER_INTERVAL='" + this.SCHEDULE_TIMER_INTERVAL + "', IP_OVERDUE_DELAY='" + this.IP_OVERDUE_DELAY + "', IS_MY_HTTP_SERVER='" + this.IS_MY_HTTP_SERVER + "', HTTPDNS_SERVER_API=" + this.HTTPDNS_SERVER_API + ", IS_DNSPOD_SERVER='" + this.IS_DNSPOD_SERVER + "', DNSPOD_SERVER_API='" + this.DNSPOD_SERVER_API + "', DNSPOD_ID='" + this.DNSPOD_ID + "', DNSPOD_KEY='" + this.DNSPOD_KEY + "', IS_SORT='" + this.IS_SORT + "', SPEEDTEST_PLUGIN_NUM='" + this.SPEEDTEST_PLUGIN_NUM + "', PRIORITY_PLUGIN_NUM='" + this.PRIORITY_PLUGIN_NUM + "', SUCCESSNUM_PLUGIN_NUM='" + this.SUCCESSNUM_PLUGIN_NUM + "', ERRNUM_PLUGIN_NUM='" + this.ERRNUM_PLUGIN_NUM + "', SUCCESSTIME_PLUGIN_NUM='" + this.SUCCESSTIME_PLUGIN_NUM + "', DOMAIN_SUPPORT_LIST=" + this.DOMAIN_SUPPORT_LIST + ", DOMAIN_DETAILS=" + this.DOMAIN_DETAILS + ", IP_CHECK_RETRY_INTERVAL='" + this.IP_CHECK_RETRY_INTERVAL + "', ERROR_LOG_SWITCH='" + this.ERROR_LOG_SWITCH + "', RETRY_IP_NUMBER='" + this.RETRY_IP_NUMBER + "', SPEED_TEST_SWITCH='" + this.SPEED_TEST_SWITCH + "', RETRY_COUNT_PER_REQUEST='" + this.RETRY_COUNT_PER_REQUEST + "', LOSE_CON_INIT_DUR='" + this.LOSE_CON_INIT_DUR + "'}";
    }
}
