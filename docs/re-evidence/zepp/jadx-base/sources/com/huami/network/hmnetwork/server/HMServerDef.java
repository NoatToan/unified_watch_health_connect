package com.huami.network.hmnetwork.server;

import android.text.TextUtils;
import com.huami.network.hmnetwork.httpdns.HMHttpDnsManager;
import com.huami.nfc.web.PayHeaderKt;

/* JADX INFO: loaded from: classes6.dex */
public class HMServerDef {
    public static final String RESPONSE_FORMAT = ".json";
    private static final String b = "https://api-watch.huami.com/";
    private static final String c = "https://api-watch-staging.huami.com/";
    private static final String d = "https://circle.huami.com/index.html#";
    private static String e;
    private static final String a = "https://api-mifit.huami.com/";
    public static String[] HOST_COMMON = {a, PayHeaderKt.WEB_API_BASE_URL_STAGING, "https://mifit-test.mi-ae.cn/"};
    private static boolean f = false;

    private static String a() {
        if (TextUtils.isEmpty(e) || b(e)) {
            e = a;
        }
        return e;
    }

    private static boolean b(String str) {
        return a.equals(str);
    }

    public static String getHost() {
        return HMHttpDnsManager.getHttpDnsUrlBySrc(getOriHost());
    }

    public static String getOriHost() {
        return f ? a() : a;
    }

    public static String getOriWatchHost() {
        return isProductUrl() ? b : c;
    }

    public static String getRestfulCircleUrl(String str, String str2) {
        return d + String.format("page=%s&id=%s", str, str2);
    }

    public static String getRestfulUrl(String str, Object... objArr) {
        return getUrl(String.format(str, objArr));
    }

    public static String getRestfulWatchUrl(String str, Object... objArr) {
        return HMHttpDnsManager.getHttpDnsUrlBySrc(getOriWatchHost()) + String.format(str, objArr);
    }

    public static String getRunningUrl(String str) {
        return getUrl(str);
    }

    public static String getUrl(String str) {
        String host = getHost();
        if (TextUtils.isEmpty(host)) {
            throw new IllegalArgumentException();
        }
        return host + str;
    }

    public static boolean isProductUrl() {
        return b(getOriHost());
    }

    public static boolean isThirdUrl(String str) {
        String srcByHttpDnsUrl = HMHttpDnsManager.getSrcByHttpDnsUrl(str);
        return TextUtils.isEmpty(srcByHttpDnsUrl) || !srcByHttpDnsUrl.startsWith(getOriHost());
    }

    public static void setTestHost(String str) {
        f = true;
        e = str;
    }
}
