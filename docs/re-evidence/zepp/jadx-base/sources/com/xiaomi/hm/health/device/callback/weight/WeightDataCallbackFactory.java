package com.xiaomi.hm.health.device.callback.weight;

import com.huami.devicex.manager.BaseFlavorFactory;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.model.WeightSyncResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/callback/weight/WeightDataCallbackFactory;", "Lcom/huami/devicex/manager/BaseFlavorFactory;", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Lcom/xiaomi/hm/health/bt/model/WeightSyncResult;", "createMifit", "createZepp", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WeightDataCallbackFactory extends BaseFlavorFactory<HMCallback<WeightSyncResult>> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.devicex.manager.BaseFlavorFactory
    @NotNull
    public HMCallback<WeightSyncResult> createMifit() {
        return new MifitWeightDataSyncCallback();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.devicex.manager.BaseFlavorFactory
    @NotNull
    public HMCallback<WeightSyncResult> createZepp() {
        return new ZeppWeightDataSyncCallback();
    }
}
