package com.xiaomi.fitness.eco.device.manager.export.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MODEL_SCALE_PREFIX", "", "MODEL_HMPACE_SCALE_PREFIX", "isHuaMiScale", "", "isScale", "eco-device-manager-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EcoProductModelExtKt {

    @NotNull
    private static final String MODEL_HMPACE_SCALE_PREFIX = "hmpace.scales";

    @NotNull
    private static final String MODEL_SCALE_PREFIX = "yunmai.scales";

    public static final boolean isHuaMiScale(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt__StringsJVMKt.startsWith$default(str, MODEL_HMPACE_SCALE_PREFIX, false, 2, null);
    }

    public static final boolean isScale(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt__StringsJVMKt.startsWith$default(str, MODEL_SCALE_PREFIX, false, 2, null) || isHuaMiScale(str);
    }
}
