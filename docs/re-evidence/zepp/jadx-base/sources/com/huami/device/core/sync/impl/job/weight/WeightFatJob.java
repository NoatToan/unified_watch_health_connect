package com.huami.device.core.sync.impl.job.weight;

import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.device.core.sync.api.type.JobType;
import com.huami.device.core.sync.impl.job.milible.callback.WeightDataSyncCallback;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.WeightSyncResult;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import kotlin.Metadata;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/huami/device/core/sync/impl/job/weight/WeightFatJob;", "Lcom/huami/device/core/sync/impl/job/weight/BaseWeightJob;", "Lcom/xiaomi/hm/health/bt/model/WeightSyncResult;", "Lcom/huami/device/core/sync/api/type/JobType;", "findType", "", "start", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "progress", "onProgress", "", "tag", "Ljava/lang/String;", "<init>", "()V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public abstract class WeightFatJob extends BaseWeightJob<WeightSyncResult> {

    @NotNull
    private final String tag = "SyncCenter-WeightFatJob";

    @Override // com.huami.device.core.sync.api.type.SyncJob
    @NotNull
    public JobType findType() {
        return JobType.INSTANCE.getWEIGHT_FAT();
    }

    @Override // com.huami.device.core.sync.impl.job.weight.BaseWeightJob
    public void onProgress(@NotNull Progress progress) {
        sendStatus(createProgress(progress.getPercent()));
    }

    @Override // com.huami.device.core.sync.impl.job.weight.BaseWeightJob, com.huami.device.core.sync.api.type.SyncJob
    public void start() throws SyncException {
        super.start();
        WeightDataSyncCallback weightDataSyncCallback = new WeightDataSyncCallback(this);
        try {
            if (getDevice$sync_center_release().getDeviceType() == HMDeviceType.WEIGHT) {
                getDevice$sync_center_release().startSyncData(getUuid(), weightDataSyncCallback);
                WeightSyncResult weightSyncResultLoadResult = weightDataSyncCallback.loadResult(maxTime());
                if (weightSyncResultLoadResult == null) {
                    weightSyncResultLoadResult = new WeightSyncResult();
                }
                onFinish(weightSyncResultLoadResult);
            }
        } catch (Exception e) {
            HMLog.w(this.tag, "同步错误", new Object[0]);
            throw new SyncException("sync " + findType() + " error", e, 0, 4, null);
        }
    }
}
