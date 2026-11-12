package com.xiaomi.fitness.about.widget;

import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0007J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005J\b\u0010\r\u001a\u00020\u0005H\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/about/widget/AboutUtil;", "", "<init>", "()V", "HOST_REGION", "", "HOST_OPERATION_STAGING", "HOST_OPERATION", "WORKOUT_SAFETY_PRECAUTION_AND_WARNING_PATTERN", "getUserSensitiveInfoUrlOnFirst", "locale", "model", "getWorkoutSafetyPrecautionAndWarningUrl", "getOperationHost", "getRegionStr", "region", "getRegionParamToReport", "about_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AboutUtil {

    @NotNull
    private static final String HOST_OPERATION = "https://%swatch.iot.mi.com";

    @NotNull
    private static final String HOST_OPERATION_STAGING = "https://st-watch.iot.mi.com";

    @NotNull
    private static final String WORKOUT_SAFETY_PRECAUTION_AND_WARNING_PATTERN = "%s/html/privacy/index.html?type=risk_tips&locale=%s";

    @NotNull
    public static final AboutUtil INSTANCE = new AboutUtil();

    @NotNull
    private static final String HOST_REGION = "https://region.hlth.io.mi.com";

    private AboutUtil() {
    }

    private final String getOperationHost() {
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isStaging()) {
            return HOST_OPERATION_STAGING;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str = String.format(HOST_OPERATION, Arrays.copyOf(new Object[]{getRegionStr(lowerCase)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private final String getRegionParamToReport(String region) {
        return Intrinsics.areEqual(region, "cn") ? "" : region;
    }

    private final String getRegionStr(String region) {
        if (Intrinsics.areEqual(region, "cn")) {
            return "";
        }
        return region + ".";
    }

    @JvmStatic
    @NotNull
    public static final String getUserSensitiveInfoUrlOnFirst(@NotNull String locale, @NotNull String model) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(model, "model");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/privacy/index.html?locale=%s&type=user_sensitive_info_v3&model=%s", Arrays.copyOf(new Object[]{HOST_REGION, locale, model}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final String getWorkoutSafetyPrecautionAndWarningUrl(@NotNull String locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(WORKOUT_SAFETY_PRECAUTION_AND_WARNING_PATTERN, Arrays.copyOf(new Object[]{getOperationHost(), locale}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
