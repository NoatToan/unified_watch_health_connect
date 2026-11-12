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
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u001a\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u001a\b\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u0016\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u0016\u0010\t\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u0016\u0010\n\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u0016\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u000e\u0010\f\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001\u001a\u000e\u0010\r\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"HOST_REGION", "", "TAG", "getRegionHost", "HOST_OPERATION", "getHost", "getWatchUserLicenceHtmlUrlOnFirst", "locale", "model", "getWatchAgreementHtmlUrlOnFirst", "getWatchExperienceHtmlUrlOnFirst", "getAppPrivacyBriefUrl", "getThirdSharedListUrl", "getCollectPersonalUrl", "about_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AboutUrlsKt {

    @NotNull
    private static final String HOST_OPERATION = "https://%swatch.iot.mi.com";

    @NotNull
    private static final String HOST_REGION = "https://region.hlth.io.mi.com";

    @NotNull
    private static final String TAG = "AboutUrls";

    @NotNull
    public static final String getAppPrivacyBriefUrl(@NotNull String locale, @NotNull String model) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(model, "model");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/privacy/index.html?locale=%s&type=sport_healthy_privacy_abstract&model=%s", Arrays.copyOf(new Object[]{getHost(), locale, model}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public static final String getCollectPersonalUrl(@NotNull String locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/libai/collect-user-info.html?locale=%s", Arrays.copyOf(new Object[]{getHost(), locale}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
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

    @Nullable
    public static final String getRegionHost() {
        return HOST_REGION;
    }

    @NotNull
    public static final String getThirdSharedListUrl(@NotNull String locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/data_share_explain3/index.html?locale=%s", Arrays.copyOf(new Object[]{getHost(), locale}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public static final String getWatchAgreementHtmlUrlOnFirst(@NotNull String locale, @NotNull String model) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(model, "model");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/privacy/index.html?locale=%s&type=sport_healthy_privacy&model=%s", Arrays.copyOf(new Object[]{getHost(), locale, model}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public static final String getWatchExperienceHtmlUrlOnFirst(@NotNull String locale, @NotNull String model) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(model, "model");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/privacy/index.html?locale=%s&type=watch_user_exp_v3&model=%s", Arrays.copyOf(new Object[]{getHost(), locale, model}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public static final String getWatchUserLicenceHtmlUrlOnFirst(@NotNull String locale, @NotNull String model) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(model, "model");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/privacy/index.html?locale=%s&type=watch_user_license_v3&model=%s", Arrays.copyOf(new Object[]{getHost(), locale, model}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
