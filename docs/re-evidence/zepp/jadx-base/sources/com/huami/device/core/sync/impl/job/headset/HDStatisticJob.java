package com.huami.device.core.sync.impl.job.headset;

import com.huami.bluetooth.profile.gdsp.DeviceStatisticParser;
import com.huami.device.core.sync.api.exception.ConfigException;
import com.huami.device.core.sync.api.exception.DeviceConnectException;
import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.device.core.sync.api.type.JobType;
import com.huami.device.core.sync.impl.job.milible.BaseJob;
import com.huami.device.core.sync.impl.job.milible.callback.UniversalSyncCallback;
import com.xiaomi.hm.health.bt.device.MozartDevice;
import com.xiaomi.hm.health.bt.profile.gdsp.HMGDSPType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"Lcom/huami/device/core/sync/impl/job/headset/HDStatisticJob;", "Lcom/huami/device/core/sync/impl/job/milible/BaseJob;", "", "Lcom/xiaomi/hm/health/bt/device/MozartDevice;", "loadDevice", "Lcom/huami/device/core/sync/api/type/JobType;", "findType", "", "start", "<init>", "()V", "Companion", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public abstract class HDStatisticJob extends BaseJob<Object> {

    @NotNull
    private static final String tag = "HeadsetStatisticJob";

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
        return JobType.INSTANCE.getDEVICE_STATISTIC();
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob, com.huami.device.core.sync.api.type.SyncJob
    public void start() throws SyncException, InterruptedException, DeviceConnectException {
        super.start();
        sendStatus(createProgress(1));
        UniversalSyncCallback universalSyncCallback = new UniversalSyncCallback(this);
        loadDevice().syncData(loadStartTime(), HMGDSPType.PROTO, new DeviceStatisticParser(loadDevice().getMDeviceSource()), universalSyncCallback);
        Object objLoadResult = universalSyncCallback.loadResult(maxTime());
        if (objLoadResult == null) {
            objLoadResult = new Object();
        }
        onDataOut(objLoadResult);
        sendStatus(createProgress(100));
    }
}
