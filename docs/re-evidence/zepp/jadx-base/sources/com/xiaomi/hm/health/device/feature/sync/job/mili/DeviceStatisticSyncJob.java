package com.xiaomi.hm.health.device.feature.sync.job.mili;

import com.huami.device.core.sync.api.exception.DeviceConnectException;
import com.huami.device.core.sync.api.type.JobType;
import com.huami.device.core.sync.impl.job.milible.BaseJob;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.service.DeviceStatisticV2Collector;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u00032\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/job/mili/DeviceStatisticSyncJob;", "Lcom/huami/device/core/sync/impl/job/milible/BaseJob;", "", "", "start", "Lcom/huami/device/core/sync/api/type/JobType;", "findType", "Ljava/util/Calendar;", "loadStartTime", "outData", "onDataOut", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.EXCEPTION, "onError", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceStatisticSyncJob extends BaseJob<Object> {

    @NotNull
    private static final String TAG = "DeviceStatisticSyncJob";

    @Override // com.huami.device.core.sync.api.type.SyncJob
    @NotNull
    public JobType findType() {
        return JobType.INSTANCE.getDEVICE_STATISTIC();
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob
    @NotNull
    public Calendar loadStartTime() {
        return Calendar.getInstance();
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob
    public void onDataOut(@NotNull Object outData) {
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob
    public void onError(@NotNull final Exception exception) {
        HMLog.info(TAG, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.DeviceStatisticSyncJob.onError.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "sync failed: " + exception;
            }
        });
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob, com.huami.device.core.sync.api.type.SyncJob
    public void start() throws DeviceConnectException {
        super.start();
        sendStatus(createProgress(1));
        DeviceStatisticV2Collector.syncStatisticData(getDevice());
        sendStatus(createProgress(100));
    }
}
