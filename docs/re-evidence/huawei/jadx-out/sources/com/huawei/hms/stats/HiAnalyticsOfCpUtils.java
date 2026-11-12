package com.huawei.hms.stats;

import android.content.Context;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hms.utils.HMSBIInitializer;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class HiAnalyticsOfCpUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HiAnalyticsInstance f16465a;

    private static HiAnalyticsInstance a(Context context) {
        HiAnalyticsInstance analyticsInstance = HMSBIInitializer.getInstance(context).getAnalyticsInstance();
        f16465a = analyticsInstance;
        return analyticsInstance;
    }

    public static void onEvent(Context context, String str, String str2) {
        if (a(context) != null) {
            f16465a.onEvent(context, str, str2);
        }
    }

    public static void onReport(Context context, int i) {
        if (a(context) != null) {
            f16465a.onReport(i);
        }
    }

    public static void onStreamEvent(Context context, int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a(context) != null) {
            f16465a.onStreamEvent(i, str, linkedHashMap);
        }
    }

    public static void onEvent(Context context, int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a(context) != null) {
            f16465a.onEvent(i, str, linkedHashMap);
        }
    }
}
