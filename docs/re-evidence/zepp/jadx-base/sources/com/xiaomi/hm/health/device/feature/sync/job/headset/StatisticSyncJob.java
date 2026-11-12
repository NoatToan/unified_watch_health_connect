package com.xiaomi.hm.health.device.feature.sync.job.headset;

import com.huami.device.core.sync.api.exception.DeviceConnectException;
import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.device.core.sync.impl.job.headset.HDStatisticJob;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.service.DeviceStatisticWrapper;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Calendar;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0014\u0010\f\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/job/headset/StatisticSyncJob;", "Lcom/huami/device/core/sync/impl/job/headset/HDStatisticJob;", "", "start", "Ljava/util/Calendar;", "loadStartTime", "", "outData", "onDataOut", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.EXCEPTION, "onError", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class StatisticSyncJob extends HDStatisticJob {

    @NotNull
    private static final String TAG = "SyncJob-StatisticSyncJob";

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob
    @NotNull
    public Calendar loadStartTime() {
        return Calendar.getInstance();
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob
    public void onDataOut(@NotNull Object outData) {
        DeviceStatisticWrapper.handleHdStatistic(outData, getDevice());
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob
    public void onError(@NotNull Exception exception) {
        HMLog.e(TAG, exception);
    }

    @Override // com.huami.device.core.sync.impl.job.headset.HDStatisticJob, com.huami.device.core.sync.impl.job.milible.BaseJob, com.huami.device.core.sync.api.type.SyncJob
    public void start() throws SyncException, InterruptedException, DeviceConnectException {
        DeviceStatisticWrapper.setIsRunning(true);
        super.start();
    }
}
