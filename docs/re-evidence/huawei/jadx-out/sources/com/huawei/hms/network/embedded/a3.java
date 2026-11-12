package com.huawei.hms.network.embedded;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.framework.common.hianalytics.InitReport;
import com.huawei.hms.network.inner.api.NetworkReceiver;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes34.dex */
public class a3 {
    public static final String APP_NAME = "app_name";
    public static final String EVENT_ID = "sysevent";
    public static final String EVENT_TYPE = "sysevent_type";
    public static final String EVENT_VALUE = "sysevent_value";
    public static final String NETSWITCH_EVENT = "netswitch";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f14553a = "SysEventData";

    public static void reportSysEvent(Long l, String str, String str2) {
        if (HianalyticsHelper.getInstance().isEnableReport(ContextHolder.getAppContext())) {
            InitReport.reportWhenInit(new a(l, str, str2));
        }
    }

    public static void reportNetSwitch(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
        if (NetworkUtil.isConnectTypeChange(networkInfo, networkInfo2)) {
            reportSysEvent(Long.valueOf(System.currentTimeMillis()), NETSWITCH_EVENT, NetworkUtil.getPrimaryNetworkType(networkInfo) + Constants.LINK + NetworkUtil.getPrimaryNetworkType(networkInfo2));
        }
    }

    public static void init() {
        l4.b().a(new b());
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Long f14554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f14555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f14556c;

        @Override // java.lang.Runnable
        public void run() {
            a3.b(this.f14554a, this.f14555b, this.f14556c);
        }

        public a(Long l, String str, String str2) {
            this.f14554a = l;
            this.f14555b = str;
            this.f14556c = str2;
        }
    }

    public static class b implements NetworkReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NetworkInfo f14557a = NetworkUtil.getNetworkInfo(ContextHolder.getAppContext());

        @Override // com.huawei.hms.network.inner.api.NetworkReceiver
        public void onReceiveMsg(Context context, Intent intent) {
            NetworkInfo networkInfo = NetworkUtil.getNetworkInfo(context);
            if (networkInfo == null) {
                Logger.v(a3.f14553a, "Get NetworkInfo failed");
            } else {
                Logger.v(a3.f14553a, "networkInfo: %s", networkInfo);
                a3.reportNetSwitch(this.f14557a, networkInfo);
            }
        }
    }

    public static void b(Long l, String str, String str2) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("sdk_type", "UxPP");
        linkedHashMap.put(HianalyticsBaseData.SDK_NAME, "networkkit");
        linkedHashMap.put("sdk_version", "8.0.1.320");
        linkedHashMap.put("time", l + "");
        linkedHashMap.put(EVENT_TYPE, str);
        linkedHashMap.put(EVENT_VALUE, str2);
        linkedHashMap.put("app_name", ContextHolder.getAppContext() != null ? ContextHolder.getAppContext().getPackageName() : "null context");
        HianalyticsHelper.getInstance().onEvent(linkedHashMap, EVENT_ID);
        Logger.v(f14553a, "%s", linkedHashMap);
    }
}
