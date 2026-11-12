package com.huami.device.core.sync.impl.job.milible;

import com.huami.device.core.sync.api.type.JobType;
import com.huami.device.core.sync.api.type.SyncJob;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/huami/device/core/sync/impl/job/milible/ZeppCoachJob;", "Lcom/huami/device/core/sync/api/type/SyncJob;", "Lcom/huami/device/core/sync/api/type/JobType;", "findType", "", "maxTime", "<init>", "()V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public abstract class ZeppCoachJob implements SyncJob {
    @Override // com.huami.device.core.sync.api.type.SyncJob
    @NotNull
    public JobType findType() {
        return JobType.INSTANCE.getZeppCoach();
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    public long maxTime() {
        return 30000L;
    }
}
