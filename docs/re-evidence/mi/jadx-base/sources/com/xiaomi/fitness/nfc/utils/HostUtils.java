package com.xiaomi.fitness.nfc.utils;

import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/nfc/utils/HostUtils;", "", "<init>", "()V", "sHost", "", "sHostStaging", "getOperationHost", "switchRegion", "region", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HostUtils {

    @NotNull
    public static final HostUtils INSTANCE = new HostUtils();

    @NotNull
    private static final String sHost = "https://%swatch.iot.mi.com";

    @NotNull
    private static final String sHostStaging = "http://st-watch.iot.mi.com";

    private HostUtils() {
    }

    @NotNull
    public final String getOperationHost() {
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isStaging()) {
            return sHostStaging;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(sHost, Arrays.copyOf(new Object[]{switchRegion(RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion())}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final String switchRegion(@NotNull String region) {
        Intrinsics.checkNotNullParameter(region, "region");
        if (Intrinsics.areEqual(region, "cn")) {
            return "";
        }
        return region + ".";
    }
}
