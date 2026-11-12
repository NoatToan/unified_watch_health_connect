package com.huami.device.core.sync.impl.job.shoes;

import com.huami.device.core.sync.api.exception.ConfigException;
import com.huami.device.core.sync.api.exception.DeviceConnectException;
import com.huami.device.core.sync.api.type.JobType;
import com.huami.device.core.sync.impl.job.milible.BaseJob;
import com.huami.device.core.sync.impl.job.milible.callback.ActivitySyncCallback;
import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import com.xiaomi.hm.health.bt.device.HMNormandyDevice;
import com.xiaomi.hm.health.bt.device.HMShoesDevice;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b'\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u001a\u0010\f\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002J$\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&R\u0016\u0010\u0010\u001a\u00020\u00058B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/device/core/sync/impl/job/shoes/ShoesActivitiesJob;", "Lcom/huami/device/core/sync/impl/job/milible/BaseJob;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/ActivityDataFragment;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseBleDevice;", "loadDevice", "Lcom/huami/device/core/sync/api/type/JobType;", "findType", "", "start", "outData", "onDataOut", "device", "getShoesDevice", "()Lcom/xiaomi/hm/health/bt/device/HMBaseBleDevice;", "shoesDevice", "<init>", "()V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public abstract class ShoesActivitiesJob extends BaseJob<List<? extends ActivityDataFragment<Object>>> {
    private final HMBaseBleDevice getShoesDevice() {
        return loadDevice();
    }

    private final HMBaseBleDevice loadDevice() throws ConfigException {
        if (getDevice() instanceof HMBaseBleDevice) {
            return (HMBaseBleDevice) getDevice();
        }
        throw new ConfigException("跑鞋任务配置错", null, 2, null);
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    @NotNull
    public JobType findType() {
        return JobType.INSTANCE.getActivities();
    }

    public abstract void onDataOut(@NotNull HMBaseBleDevice device, @NotNull List<ActivityDataFragment<Object>> outData);

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob
    public /* bridge */ /* synthetic */ void onDataOut(List<? extends ActivityDataFragment<Object>> list) {
        onDataOut2((List<ActivityDataFragment<Object>>) list);
    }

    /* JADX INFO: renamed from: onDataOut, reason: avoid collision after fix types in other method */
    public final void onDataOut2(@NotNull List<ActivityDataFragment<Object>> outData) {
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob, com.huami.device.core.sync.api.type.SyncJob
    public void start() throws IllegalAccessException, DeviceConnectException {
        super.start();
        ActivitySyncCallback activitySyncCallback = new ActivitySyncCallback(this);
        if (!(getShoesDevice() instanceof HMShoesDevice) && !(getShoesDevice() instanceof HMNormandyDevice)) {
            throw new IllegalAccessException("设备类型不匹配");
        }
        getShoesDevice().startSyncData(loadStartTime(), activitySyncCallback);
        onDataOut(getShoesDevice(), activitySyncCallback.loadOutData(maxTime()));
    }
}
