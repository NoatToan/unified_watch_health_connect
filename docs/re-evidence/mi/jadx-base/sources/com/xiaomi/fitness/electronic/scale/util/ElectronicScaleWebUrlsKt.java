package com.xiaomi.fitness.electronic.scale.util;

import com.xiaomi.fitness.common.utils.LocaleUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\b\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HOST_OPERATION", "", "TAG", "getHost", "getUserGuideUrl", "model", "electronic-scale_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ElectronicScaleWebUrlsKt {

    @NotNull
    private static final String HOST_OPERATION = "https://res.eco.mi.com";

    @NotNull
    private static final String TAG = "ElectronicScaleWebUrls.kt";

    private static final String getHost() {
        return "https://res.eco.mi.com";
    }

    @NotNull
    public static final String getUserGuideUrl(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return getHost() + "/html/guidance/index.html?model=" + model + "&locale=" + LocaleUtil.getCurrentLocale();
    }
}
