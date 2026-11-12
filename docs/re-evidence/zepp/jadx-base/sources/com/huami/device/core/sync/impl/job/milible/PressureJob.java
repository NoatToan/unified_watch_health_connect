package com.huami.device.core.sync.impl.job.milible;

import com.huami.device.core.sync.api.exception.DeviceConnectException;
import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.device.core.sync.api.type.JobType;
import com.huami.device.core.sync.impl.job.milible.callback.PressureCallback;
import com.huami.device.core.sync.impl.job.milible.type.PressureType;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.gdsp.pressure.HMPressureData;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b'\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0014\u0010\t\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH&J\u001e\u0010\t\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/device/core/sync/impl/job/milible/PressureJob;", "Lcom/huami/device/core/sync/impl/job/milible/BaseJob;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/HMPressureData;", "Lcom/huami/device/core/sync/api/type/JobType;", "findType", "", "start", "outData", "onDataOut", "Ljava/util/Calendar;", "loadStartTime", "Lcom/huami/device/core/sync/impl/job/milible/type/PressureType;", "type", "", "tag", "Ljava/lang/String;", "<init>", "()V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public abstract class PressureJob extends BaseJob<List<? extends HMPressureData>> {

    @NotNull
    private final String tag = "SyncCenter-PressureJob";

    @Override // com.huami.device.core.sync.api.type.SyncJob
    @NotNull
    public JobType findType() {
        return JobType.INSTANCE.getPRESSURE();
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob
    @NotNull
    public final Calendar loadStartTime() {
        return Calendar.getInstance();
    }

    @NotNull
    public abstract Calendar loadStartTime(@NotNull PressureType type);

    public abstract void onDataOut(@NotNull PressureType type, @NotNull List<HMPressureData> outData);

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob
    public /* bridge */ /* synthetic */ void onDataOut(List<? extends HMPressureData> list) {
        onDataOut2((List<HMPressureData>) list);
    }

    /* JADX INFO: renamed from: onDataOut, reason: avoid collision after fix types in other method */
    public final void onDataOut2(@NotNull List<HMPressureData> outData) {
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob, com.huami.device.core.sync.api.type.SyncJob
    public void start() throws SyncException, DeviceConnectException {
        super.start();
        try {
            sendStatus(createProgress(1));
            PressureType pressureType = PressureType.ALL_DAY;
            PressureCallback pressureCallback = new PressureCallback(pressureType);
            loadProDevice().startSyncPressureDataAllDay(loadStartTime(pressureType), pressureCallback);
            onDataOut(pressureType, pressureCallback.loadOutData(maxTime()));
            sendStatus(createProgress(10));
            PressureType pressureType2 = PressureType.SINGLE;
            PressureCallback pressureCallback2 = new PressureCallback(pressureType2);
            loadProDevice().startSyncPressureDataSingle(loadStartTime(pressureType2), pressureCallback2);
            onDataOut(pressureType2, pressureCallback2.loadOutData(maxTime()));
            sendStatus(createProgress(90));
            sendStatus(createProgress(100));
        } catch (Exception e) {
            HMLog.w(this.tag, "同步压力数据错误", new Object[0]);
            onError(e);
            throw new SyncException("sync " + findType() + " error", e, 0, 4, null);
        }
    }
}
