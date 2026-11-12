package com.huami.device.core.sync.impl.job.headset;

import com.huami.device.core.sync.api.exception.ConfigException;
import com.huami.device.core.sync.api.exception.DeviceConnectException;
import com.huami.device.core.sync.api.type.JobType;
import com.huami.device.core.sync.impl.job.milible.BaseJob;
import com.huami.device.core.sync.impl.job.milible.callback.GpsDataSyncCallBack;
import com.xiaomi.hm.health.bt.device.MozartDevice;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u0000 \f2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\r"}, d2 = {"Lcom/huami/device/core/sync/impl/job/headset/HDSportRecordJob;", "Lcom/huami/device/core/sync/impl/job/milible/BaseJob;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsRecord;", "Lcom/xiaomi/hm/health/bt/device/MozartDevice;", "loadDevice", "Lcom/huami/device/core/sync/api/type/JobType;", "findType", "", "start", "<init>", "()V", "Companion", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public abstract class HDSportRecordJob extends BaseJob<List<? extends GpsRecord>> {

    @NotNull
    private static final String tag = "HDSportRecordJob";

    private final MozartDevice loadDevice() throws ConfigException {
        try {
            return (MozartDevice) getDevice();
        } catch (Exception unused) {
            throw new ConfigException("device error", null, 2, null);
        }
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    @NotNull
    public JobType findType() {
        return JobType.INSTANCE.getSportRecords();
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob, com.huami.device.core.sync.api.type.SyncJob
    public void start() throws DeviceConnectException {
        super.start();
        sendStatus(createProgress(1));
        GpsDataSyncCallBack gpsDataSyncCallBack = new GpsDataSyncCallBack(this);
        loadDevice().startSyncGpsData(loadStartTime(), gpsDataSyncCallBack);
        onDataOut(gpsDataSyncCallBack.loadResult(maxTime()));
        sendStatus(createProgress(100));
    }
}
