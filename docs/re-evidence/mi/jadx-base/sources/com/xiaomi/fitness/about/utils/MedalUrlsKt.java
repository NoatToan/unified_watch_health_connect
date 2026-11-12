package com.xiaomi.fitness.about.utils;

import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u001a\b\u0010\u0006\u001a\u00020\u0001H\u0002\u001a\u0006\u0010\u0007\u001a\u00020\u0001\u001a\u0006\u0010\b\u001a\u00020\u0001\u001a\b\u0010\t\u001a\u0004\u0018\u00010\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"HOST_OPERATION", "", "HOST_OPERATION_STAGING", "HOST_SERVICE_QRCODE", "HOST_SERVICE_QRCODE_PLAY", "TAG", "getHost", "getMedalWallHtmlUrl", "getMedalInfoHtmlUrl", "getQRCodeDownloadHtmlUrl", "medal_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MedalUrlsKt {

    @NotNull
    private static final String HOST_OPERATION = "https://%swatch.iot.mi.com";

    @NotNull
    private static final String HOST_OPERATION_STAGING = "https://st-watch.iot.mi.com";

    @NotNull
    private static final String HOST_SERVICE_QRCODE = "https://hlth.io.mi.com/download?redir=mifitness";

    @NotNull
    private static final String HOST_SERVICE_QRCODE_PLAY = "https://region.hlth.io.mi.com/abroad_download?redir=mifitness";

    @NotNull
    private static final String TAG = "MedalUrls";

    private static final String getHost() {
        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Logger.i(TAG, "getHost: region = " + lowerCase + " AccountManager.getInstance().isStaging is " + AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isStaging());
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
    public static final String getMedalInfoHtmlUrl() {
        return getHost() + "/html/understand_the_medal/index.html";
    }

    @NotNull
    public static final String getMedalWallHtmlUrl() {
        return getHost() + "/libai/new-medal-wall.html?app_type=health";
    }

    @Nullable
    public static final String getQRCodeDownloadHtmlUrl() {
        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Logger.i(TAG, "getHost: region = " + lowerCase);
        if (Intrinsics.areEqual(lowerCase, "cn")) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(HOST_SERVICE_QRCODE, Arrays.copyOf(new Object[]{""}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format(HOST_SERVICE_QRCODE_PLAY, Arrays.copyOf(new Object[0], 0));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }
}
