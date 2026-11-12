package com.huami.watch.crashmonitor;

import com.huami.watch.transport.httpsupport.transporter.http.URLCompleter;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;

/* JADX INFO: loaded from: classes16.dex */
public class Config {
    public static final String KEY_DETAIL = "details";
    public static final String KEY_MOBILE_ID = "mobileDeviceId";
    private static final String a = "https://watch.mi-ae.cn";

    public static String getBaseServer() {
        return a + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE;
    }

    public static String getUrlDropBoxCrash() {
        return getBaseServer() + "users/" + URLCompleter.URLSeat.USER_ID + "/mobileAppActivities?activityType=CRASH_INFO";
    }
}
