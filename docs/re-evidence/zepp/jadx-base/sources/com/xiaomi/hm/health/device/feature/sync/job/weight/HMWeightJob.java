package com.xiaomi.hm.health.device.feature.sync.job.weight;

import com.huami.account.HMLoginManager;
import com.huami.device.core.sync.impl.job.weight.WeightFatJob;
import com.xiaomi.hm.health.bt.model.WeightSyncResult;
import com.xiaomi.hm.health.device.callback.weight.WeightDataCallbackFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/job/weight/HMWeightJob;", "Lcom/huami/device/core/sync/impl/job/weight/WeightFatJob;", "", "loadDeviceUid", "Lcom/xiaomi/hm/health/bt/model/WeightSyncResult;", "outData", "", "onFinish", "maxTime", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HMWeightJob extends WeightFatJob {
    @Override // com.huami.device.core.sync.impl.job.weight.BaseWeightJob
    public long loadDeviceUid() {
        return HMLoginManager.getMiIdIfExistsOrHuamiID();
    }

    @Override // com.huami.device.core.sync.impl.job.weight.BaseWeightJob, com.huami.device.core.sync.api.type.SyncJob
    public long maxTime() {
        return 60000L;
    }

    @Override // com.huami.device.core.sync.impl.job.weight.BaseWeightJob
    public void onFinish(@NotNull WeightSyncResult outData) {
        new WeightDataCallbackFactory().create().onData(outData);
    }
}
