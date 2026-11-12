package com.huami.device.core.sync.impl.woker;

import com.huami.device.core.sync.api.worker.AfterSyncWorkerApi;
import com.huami.device.core.sync.api.worker.Worker;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/huami/device/core/sync/impl/woker/AfterSyncWorkerApiImpl;", "Lcom/huami/device/core/sync/api/worker/AfterSyncWorkerApi;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "Lcom/huami/device/core/sync/api/worker/Worker;", "crateAfterJob", "<init>", "()V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public final class AfterSyncWorkerApiImpl implements AfterSyncWorkerApi {
    @Override // com.huami.device.core.sync.api.worker.AfterSyncWorkerApi
    @NotNull
    public List<Worker> crateAfterJob(@NotNull HMBaseDevice device) {
        HMLog.d("SyncCenter", "create after sync job default is empty.", new Object[0]);
        return CollectionsKt__CollectionsKt.emptyList();
    }
}
