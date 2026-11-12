package com.xiaomi.hm.health.device.feature.sync.strategy;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.core.sync.api.type.SyncJob;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/strategy/JobLoaderFilter;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", GoogleApiAvailabilityLight.a, "", "Lcom/huami/device/core/sync/api/type/SyncJob;", "jobs", "filter", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface JobLoaderFilter {
    @NotNull
    List<SyncJob> filter(@NotNull HMBaseDevice d, @NotNull List<? extends SyncJob> jobs);
}
