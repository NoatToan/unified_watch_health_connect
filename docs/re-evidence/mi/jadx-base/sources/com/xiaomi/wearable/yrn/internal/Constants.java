package com.xiaomi.wearable.yrn.internal;

import com.xiaomi.smarthome.setting.ServerSetting;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/wearable/yrn/internal/Constants;", "", "<init>", "()V", "PAGE_ROUTER_DOMAIN", "", "BUNDLE_REQUEST_PATH", "BUNDLE_REQUEST_TEST_HOST", "BUNDLE_REQUEST_PROD_HOST", "REGION_PREFIX_MAP", "", "getBundleRequestUrl", "envType", "regionCode", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Constants {

    @NotNull
    private static final String BUNDLE_REQUEST_PATH = "/skytree/atlas/getBundle";

    @NotNull
    private static final String BUNDLE_REQUEST_PROD_HOST = "atlas.nr.mi.com";

    @NotNull
    private static final String BUNDLE_REQUEST_TEST_HOST = "atlas.test.nr.mi.com";

    @NotNull
    public static final String PAGE_ROUTER_DOMAIN = "https://m.xiaomi.com/";

    @NotNull
    public static final Constants INSTANCE = new Constants();

    @NotNull
    private static final Map<String, String> REGION_PREFIX_MAP = MapsKt__MapsKt.mapOf(TuplesKt.to("cn", ""), TuplesKt.to("sg", "sg"), TuplesKt.to("de", "eu"), TuplesKt.to("us", "sg"), TuplesKt.to("i2", "in"), TuplesKt.to("ru", "ru"));

    private Constants() {
    }

    @NotNull
    public final String getBundleRequestUrl(@Nullable String envType, @NotNull String regionCode) {
        Intrinsics.checkNotNullParameter(regionCode, "regionCode");
        String str = "";
        if (regionCode.length() == 0) {
            return "";
        }
        boolean z = (Intrinsics.areEqual(ServerSetting.SERVER_ENV_PREVIEW, envType) || Intrinsics.areEqual("staging", envType)) ? false : true;
        String str2 = REGION_PREFIX_MAP.get(regionCode);
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() != 0) {
            str = str2 + "-";
        }
        String str3 = z ? BUNDLE_REQUEST_PROD_HOST : BUNDLE_REQUEST_TEST_HOST;
        return (z ? com.miui.tsmclient.util.Constants.URI_SCHEME : "http") + "://" + str + str3 + BUNDLE_REQUEST_PATH;
    }
}
