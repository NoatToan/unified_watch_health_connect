package com.huami.device.core.sync.impl.job.milible;

import com.huami.device.core.sync.api.exception.DeviceConnectException;
import com.huami.device.core.sync.api.type.JobType;
import com.huami.device.core.sync.impl.job.milible.callback.ActivitySyncCallback;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b'\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/huami/device/core/sync/impl/job/milible/ActivityJob;", "Lcom/huami/device/core/sync/impl/job/milible/BaseJob;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/ActivityDataFragment;", "", "", "maxTime", "Lcom/huami/device/core/sync/api/type/JobType;", "findType", "", "start", "", "tag", "Ljava/lang/String;", "<init>", "()V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public abstract class ActivityJob extends BaseJob<List<? extends ActivityDataFragment<Object>>> {

    @NotNull
    private final String tag = "SyncCenter-ActivityTask";

    @Override // com.huami.device.core.sync.api.type.SyncJob
    @NotNull
    public final JobType findType() {
        return JobType.INSTANCE.getActivities();
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob, com.huami.device.core.sync.api.type.SyncJob
    public long maxTime() {
        return 3600000L;
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob, com.huami.device.core.sync.api.type.SyncJob
    public void start() throws DeviceConnectException {
        super.start();
        HMLog.d(this.tag, Intrinsics.stringPlus("开始同步活动数据----", findType()), new Object[0]);
        ActivitySyncCallback activitySyncCallback = new ActivitySyncCallback(this);
        getDevice().startSyncData(loadStartTime(), activitySyncCallback);
        onDataOut(activitySyncCallback.loadOutData(maxTime()));
    }
}
