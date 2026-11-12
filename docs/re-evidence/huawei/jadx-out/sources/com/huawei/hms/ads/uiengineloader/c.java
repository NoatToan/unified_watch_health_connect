package com.huawei.hms.ads.uiengineloader;

import com.huawei.hms.ads.dynamic.DynamicModule;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f12905a = "LoaderHandler";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f12906b = 60000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f12907c = 10080000;

    private static int c(String str) {
        if (DynamicModule.getSpHandler() != null) {
            return DynamicModule.getSpHandler().getLoaderEngineInterval(str);
        }
        af.d(f12905a, "DynamicModule.spHandler is null");
        return f12907c;
    }

    private static int b(String str) {
        if (DynamicModule.getSpHandler() != null) {
            return DynamicModule.getSpHandler().getLoaderEngin2KitUpdate(str);
        }
        af.d(f12905a, "DynamicModule.spHandler is null");
        return 60000;
    }

    private static boolean a(String str, String str2) {
        if (DynamicModule.getCommonInter() != null) {
            return DynamicModule.getCommonInter().isTrustApp(str, str2);
        }
        af.d(f12905a, "DynamicModule.commonInter is null");
        return false;
    }

    private static boolean a(String str) {
        if (DynamicModule.getSpHandler() != null) {
            return DynamicModule.getSpHandler().getLoaderEngineUpdate(str);
        }
        af.d(f12905a, "DynamicModule.spHandler is null");
        return false;
    }

    private static void a(long j) {
        if (DynamicModule.getSpHandler() != null) {
            DynamicModule.getSpHandler().setKitloaderLastCheckTime(j);
        } else {
            af.d(f12905a, "DynamicModule.spHandler is null");
        }
    }

    public static void a(int i, Integer num, Integer num2) {
        if (DynamicModule.getCommonInter() == null) {
            af.d(f12905a, "DynamicModule commonInter is null");
            return;
        }
        DynamicModule.getCommonInter().saveReportPoint(i, num, num2);
        af.a(f12905a, "saveReportPoint type: " + i + " old: " + num + " new: " + num2);
    }

    private static long a() {
        if (DynamicModule.getSpHandler() != null) {
            return DynamicModule.getSpHandler().getKitloaderLastCheckTime();
        }
        af.d(f12905a, "DynamicModule.spHandler is null");
        return 0L;
    }
}
