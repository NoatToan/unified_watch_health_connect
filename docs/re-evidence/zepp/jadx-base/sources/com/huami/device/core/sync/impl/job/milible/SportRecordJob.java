package com.huami.device.core.sync.impl.job.milible;

import com.huami.device.core.sync.api.exception.DeviceConnectException;
import com.huami.device.core.sync.api.type.JobType;
import com.huami.device.core.sync.impl.job.milible.callback.GpsDataSyncCallBack;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b'\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lcom/huami/device/core/sync/impl/job/milible/SportRecordJob;", "Lcom/huami/device/core/sync/impl/job/milible/BaseJob;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsRecord;", "Lcom/huami/device/core/sync/api/type/JobType;", "findType", "", "maxTime", "", "start", "<init>", "()V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public abstract class SportRecordJob extends BaseJob<List<? extends GpsRecord>> {
    @Override // com.huami.device.core.sync.api.type.SyncJob
    @NotNull
    public final JobType findType() {
        return JobType.INSTANCE.getSportRecords();
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob, com.huami.device.core.sync.api.type.SyncJob
    public long maxTime() {
        return 3600000L;
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob, com.huami.device.core.sync.api.type.SyncJob
    public void start() throws DeviceConnectException {
        super.start();
        sendStatus(createProgress(1));
        GpsDataSyncCallBack gpsDataSyncCallBack = new GpsDataSyncCallBack(this);
        getDevice().startSyncGpsData(loadStartTime(), gpsDataSyncCallBack);
        onDataOut(gpsDataSyncCallBack.loadResult(maxTime()));
        sendStatus(createProgress(100));
    }
}
