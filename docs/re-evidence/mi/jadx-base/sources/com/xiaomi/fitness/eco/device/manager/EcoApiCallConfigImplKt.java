package com.xiaomi.fitness.eco.device.manager;

import com.xiaomi.eco.EcoApiCallConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"newInstance", "Lcom/xiaomi/eco/EcoApiCallConfig;", "Lcom/xiaomi/eco/EcoApiCallConfig$Companion;", "eco-device-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EcoApiCallConfigImplKt {
    @NotNull
    public static final EcoApiCallConfig newInstance(@NotNull EcoApiCallConfig.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return new EcoApiCallConfigImpl();
    }
}
