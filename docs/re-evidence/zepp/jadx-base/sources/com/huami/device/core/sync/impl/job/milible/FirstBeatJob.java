package com.huami.device.core.sync.impl.job.milible;

import com.huami.device.core.sync.api.exception.DeviceConnectException;
import com.huami.device.core.sync.api.type.JobType;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.BleFirstbeatData;
import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.IHMFirstbeatDataCallback;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H&R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/device/core/sync/impl/job/milible/FirstBeatJob;", "Lcom/huami/device/core/sync/impl/job/milible/BaseJob;", "Lcom/xiaomi/hm/health/bt/profile/smartwatch/firstbeat/BleFirstbeatData;", "Lcom/huami/device/core/sync/api/type/JobType;", "findType", "", "start", "Ljava/util/Calendar;", "loadEndTime", "", "tag", "Ljava/lang/String;", "syncJob$delegate", "Lkotlin/Lazy;", "getSyncJob", "()Lcom/huami/device/core/sync/impl/job/milible/BaseJob;", "syncJob", "<init>", "()V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public abstract class FirstBeatJob extends BaseJob<BleFirstbeatData> {

    @NotNull
    private final String tag = "SyncCenter-FirstBeatJob";

    /* JADX INFO: renamed from: syncJob$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy syncJob = LazyKt__LazyJVMKt.lazy(new Function0<FirstBeatJob>() { // from class: com.huami.device.core.sync.impl.job.milible.FirstBeatJob$syncJob$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final FirstBeatJob invoke() {
            return this.this$0;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseJob<BleFirstbeatData> getSyncJob() {
        return (BaseJob) this.syncJob.getValue();
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    @NotNull
    public final JobType findType() {
        return JobType.INSTANCE.getFIRST_BEAT();
    }

    @NotNull
    public abstract Calendar loadEndTime();

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob, com.huami.device.core.sync.api.type.SyncJob
    public void start() throws InterruptedException, DeviceConnectException {
        super.start();
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        loadProDevice().startSyncFirstbeatData(loadStartTime(), loadEndTime(), new IHMFirstbeatDataCallback() { // from class: com.huami.device.core.sync.impl.job.milible.FirstBeatJob.start.1
            @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
            public void onData(@Nullable List<GpsRecord> records) {
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
            public void onFinish(boolean ret) {
                if (!ret) {
                    HMLog.w(FirstBeatJob.this.tag, "sync first beat data finished.", new Object[0]);
                }
                countDownLatch.countDown();
            }

            @Override // com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.IHMFirstbeatDataCallback
            public void onFirstbeatData(@Nullable BleFirstbeatData data) {
                if (data != null) {
                    FirstBeatJob.this.getSyncJob().onDataOut(data);
                }
                if (data == null) {
                    HMLog.w(FirstBeatJob.this.tag, "first beat data is empty!", new Object[0]);
                }
                countDownLatch.countDown();
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
            public void onProgress(@Nullable Progress progress) {
                if (progress == null) {
                    return;
                }
                FirstBeatJob firstBeatJob = FirstBeatJob.this;
                firstBeatJob.sendStatus(firstBeatJob.createProgress(progress.getPercent()));
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
            public void onStart() {
                FirstBeatJob firstBeatJob = FirstBeatJob.this;
                firstBeatJob.sendStatus(firstBeatJob.createProgress(0));
                countDownLatch.countDown();
            }
        });
        countDownLatch.await(maxTime(), TimeUnit.MILLISECONDS);
    }
}
