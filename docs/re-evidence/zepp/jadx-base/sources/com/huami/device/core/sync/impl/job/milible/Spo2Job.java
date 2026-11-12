package com.huami.device.core.sync.impl.job.milible;

import com.huami.device.core.sync.api.type.JobType;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2Data;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/huami/device/core/sync/impl/job/milible/Spo2Job;", "Lcom/huami/device/core/sync/impl/job/milible/BaseJob;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "Lcom/huami/device/core/sync/api/type/JobType;", "findType", "<init>", "()V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public abstract class Spo2Job extends BaseJob<List<? extends Spo2Data>> {
    @Override // com.huami.device.core.sync.api.type.SyncJob
    @NotNull
    public JobType findType() {
        return JobType.INSTANCE.getSPO2();
    }
}
