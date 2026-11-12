package com.xiaomi.fitness.about.utils;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\b\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u0006\u0010\u0005\u001a\u00020\u0001\u001a\u0006\u0010\u0006\u001a\u00020\u0001\u001a\u0006\u0010\u0007\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"HOST_OPERATION", "", "HOST_OPERATION_STAGING", "TAG", "getHost", "getActivityHtmlUrlStaging", "getActivityHtmlUrl", "getWeeklyReportHtmlUrl", "mine_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MineHtmlUrlsKt {

    @NotNull
    private static final String HOST_OPERATION = "https://%swatch.iot.mi.com";

    @NotNull
    private static final String HOST_OPERATION_STAGING = "http://st-watch.iot.mi.com";

    @NotNull
    private static final String TAG = "DeviceWebUrls";

    @NotNull
    public static final String getActivityHtmlUrl() {
        return getHost() + "/activity/user_center.html";
    }

    @NotNull
    public static final String getActivityHtmlUrlStaging() {
        return "http://st-watch.iot.mi.com/activity/user_center.html";
    }

    private static final String getHost() {
        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Logger.i(TAG, "getHost: region = " + lowerCase);
        if (Intrinsics.areEqual(lowerCase, "cn")) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(HOST_OPERATION, Arrays.copyOf(new Object[]{""}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format(HOST_OPERATION, Arrays.copyOf(new Object[]{lowerCase + "."}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    @NotNull
    public static final String getWeeklyReportHtmlUrl() {
        return getHost() + "/libai/weekly-report.html#/report?app_type=health";
    }
}
