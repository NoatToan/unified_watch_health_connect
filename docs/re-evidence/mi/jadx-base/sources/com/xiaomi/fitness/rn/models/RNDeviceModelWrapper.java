package com.xiaomi.fitness.rn.models;

import com.xiaomi.fitness.rn.export.RNDeviceModel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fitness/rn/models/RNDeviceModelWrapper;", "Lcom/xiaomi/fitness/rn/export/RNDeviceModel;", "Lcom/xiaomi/fitness/rn/models/RNDeviceModelInternal;", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RNDeviceModelWrapper extends RNDeviceModel, RNDeviceModelInternal {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean isOwner(@NotNull RNDeviceModelWrapper rNDeviceModelWrapper) {
            return RNDeviceModel.DefaultImpls.isOwner(rNDeviceModelWrapper);
        }
    }
}
