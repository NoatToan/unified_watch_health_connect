package com.mi.health.course.util;

import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u001a\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001\u001a\u000e\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001\u001a\u000e\u0010\b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"HOST_OPERATION", "", "HOST_OPERATION_STAGING", "getOperationHost", "switchRegion", "region", "getCastScreenUrl", "locale", "getCourseVipAgreementUrl", "course_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WebViewUrlKt {

    @NotNull
    private static final String HOST_OPERATION = "https://%swatch.iot.mi.com";

    @NotNull
    private static final String HOST_OPERATION_STAGING = "https://st-watch.iot.mi.com";

    @NotNull
    public static final String getCastScreenUrl(@NotNull String locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/common-guide/index.html?type=screencast&locale=%s", Arrays.copyOf(new Object[]{getOperationHost(), locale}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public static final String getCourseVipAgreementUrl(@NotNull String locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/privacy/index.html?type=membership&model=app&locale=%s", Arrays.copyOf(new Object[]{getOperationHost(), locale}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public static final String getOperationHost() {
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isStaging()) {
            return HOST_OPERATION_STAGING;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(HOST_OPERATION, Arrays.copyOf(new Object[]{switchRegion(RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion())}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public static final String switchRegion(@NotNull String region) {
        Intrinsics.checkNotNullParameter(region, "region");
        if (Intrinsics.areEqual(region, "cn")) {
            return "";
        }
        return region + ".";
    }
}
