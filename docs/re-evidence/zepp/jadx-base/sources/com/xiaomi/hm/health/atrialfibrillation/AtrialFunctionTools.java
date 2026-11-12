package com.xiaomi.hm.health.atrialfibrillation;

import com.xiaomi.hm.health.device.health.device.AtrialManagerKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/atrialfibrillation/AtrialFunctionTools;", "", "", "shouldShowAfb", "isSupportAfb", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AtrialFunctionTools {

    @NotNull
    public static final AtrialFunctionTools INSTANCE = new AtrialFunctionTools();

    private AtrialFunctionTools() {
    }

    public final boolean isSupportAfb() {
        return AtrialManagerKt.isSupportAtrialFib$default(null, 1, null);
    }

    public final boolean shouldShowAfb() {
        return AtrialManagerKt.isShowAtrialFib();
    }
}
