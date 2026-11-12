package com.xiaomi.hm.health.device.feature.sync.job.hub;

import com.huami.device.core.sync.api.type.SyncJob;
import com.huami.devicex.manager.BaseFlavorFactory;
import kotlin.Metadata;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/job/hub/SensorHubJobFactory;", "Lcom/huami/devicex/manager/BaseFlavorFactory;", "Lcom/huami/device/core/sync/api/type/SyncJob;", "createMifit", "createZepp", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class SensorHubJobFactory extends BaseFlavorFactory<SyncJob> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.devicex.manager.BaseFlavorFactory
    @NotNull
    public SyncJob createMifit() {
        return new MiFitSensorHubJob();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.devicex.manager.BaseFlavorFactory
    @NotNull
    public SyncJob createZepp() {
        return new ZeppSensorHubJob();
    }
}
