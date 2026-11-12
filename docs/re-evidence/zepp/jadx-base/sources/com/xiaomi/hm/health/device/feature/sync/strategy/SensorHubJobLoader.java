package com.xiaomi.hm.health.device.feature.sync.strategy;

import com.huami.device.core.sync.api.type.SyncJob;
import com.xiaomi.hm.health.device.feature.sync.job.hub.SensorHubJobFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/strategy/SensorHubJobLoader;", "Lcom/xiaomi/hm/health/device/feature/sync/strategy/JobsLoader;", "", "Lcom/huami/device/core/sync/api/type/SyncJob;", "loadJobs", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class SensorHubJobLoader implements JobsLoader {
    @Override // com.xiaomi.hm.health.device.feature.sync.strategy.JobsLoader
    @NotNull
    public List<SyncJob> loadJobs() {
        return CollectionsKt__CollectionsKt.arrayListOf(new SensorHubJobFactory().create());
    }
}
