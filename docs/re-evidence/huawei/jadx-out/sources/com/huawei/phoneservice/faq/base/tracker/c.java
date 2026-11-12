package com.huawei.phoneservice.faq.base.tracker;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.process.HiAnalyticsConfig;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hianalytics.util.HiAnalyticTools;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import com.huawei.phoneservice.faq.base.util.g;
import com.huawei.phoneservice.faq.base.util.i;
import com.huawei.phoneservice.faq.base.util.k;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes13.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f21573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f21574b;
    private static WeakReference<Context> d;
    private static boolean e;

    /* JADX INFO: renamed from: com.huawei.phoneservice.faq.base.tracker.c$c, reason: collision with other inner class name */
    public static class C0255c {
        private LinkedHashMap<String, String> e = new LinkedHashMap<>();

        public C0255c d(String str) {
            if (!k.b(str)) {
                this.e.put("url", str);
            }
            return this;
        }

        public C0255c e(String str) {
            this.e.put("type", str);
            return this;
        }

        public C0255c b(String str) {
            if (!k.b(str)) {
                this.e.put("title", str);
            }
            return this;
        }

        public C0255c b() {
            this.e.put("result", "succeed");
            return this;
        }

        public C0255c a(String str) {
            if (!k.b(str)) {
                this.e.put("operation", str);
            }
            return this;
        }

        public C0255c c(String str) {
            if (!k.b(str)) {
                this.e.put("className", str);
            }
            return this;
        }

        public LinkedHashMap<String, String> c() {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(this.e);
            if (linkedHashMap.isEmpty()) {
                g.c("HiAnalyticsUtils", "map is null while building map");
            }
            return linkedHashMap;
        }

        public C0255c d(String str, String str2) {
            if (!k.b(str) && !k.b(str2)) {
                this.e.put(str, str2);
            }
            return this;
        }
    }

    public static void e(String str, String str2, String str3) {
        e(TrackConstants$Events.SDK_API, new C0255c().e("sdk_webapi").d("resCode", str).d("reason", str2).d(str3).c());
    }

    public static void e(String str, LinkedHashMap<String, String> linkedHashMap) {
        if (d()) {
            g.c("HiAnalyticsUtils", "FAQ_DISABLE_HA_REPORT is set to true. Do not report.");
            return;
        }
        WeakReference<Context> weakReference = d;
        if (weakReference == null || weakReference.get() == null) {
            g.c("HiAnalyticsUtils", "mContext is null, please init() before trackEvent()");
            return;
        }
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            g.c("HiAnalyticsUtils", "param:map is null");
            return;
        }
        if (k.b(str)) {
            g.c("HiAnalyticsUtils", "Cannot get type");
            return;
        }
        HiAnalyticsInstance instanceByTag = HiAnalyticsManager.getInstanceByTag("hiCare");
        if (instanceByTag == null) {
            return;
        }
        linkedHashMap.put("hostApk", f21574b);
        instanceByTag.onStreamEvent(1, str, linkedHashMap);
        if (!f21573a || e) {
            instanceByTag.onReport(1);
            g.e("HiAnalyticsUtils", "onReport");
        }
    }

    public static boolean c() {
        return HiAnalyticsManager.getInstanceByTag("hiCare") != null;
    }

    public static boolean d() {
        return "true".equals(i.d().getSdk(FaqConstants.FAQ_DISABLE_HA_REPORT));
    }

    public static void c(Context context, String str, boolean z, boolean z2) {
        if (d()) {
            g.c("HiAnalyticsUtils", "FAQ_DISABLE_HA_REPORT is set to true. Do not init.");
            return;
        }
        f21573a = z;
        e = z2;
        if (!z || z2) {
            HiAnalyticTools.enableLog(context);
        }
        if (!TextUtils.isEmpty(str) && !c()) {
            new HiAnalyticsInstance.Builder(context).setMaintConf(new HiAnalyticsConfig.Builder().setCollectURL(str).build()).create("hiCare");
        }
        g.c("HiAnalyticsUtils", "hiAnalyticUrl:%s", str);
        f21574b = context.getPackageName();
        d = new WeakReference<>(context);
    }
}
