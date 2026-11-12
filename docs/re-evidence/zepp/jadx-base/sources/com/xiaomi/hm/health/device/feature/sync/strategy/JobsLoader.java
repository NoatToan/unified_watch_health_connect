package com.xiaomi.hm.health.device.feature.sync.strategy;

import com.huami.device.core.sync.api.type.SyncJob;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/strategy/JobsLoader;", "", "", "Lcom/huami/device/core/sync/api/type/SyncJob;", "loadJobs", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface JobsLoader {
    @NotNull
    List<SyncJob> loadJobs();
}
