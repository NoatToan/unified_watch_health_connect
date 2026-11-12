package com.huami.device.core.sync.impl.job.milible;

import com.huami.device.core.sync.api.exception.DeviceConnectException;
import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.device.core.sync.api.type.JobType;
import com.xiaomi.hm.health.bt.profile.gdsp.hr.HMHrData;
import com.xiaomi.hm.health.bt.profile.gdsp.hr.IHMHrDataCallback;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b'\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/device/core/sync/impl/job/milible/HrJob;", "Lcom/huami/device/core/sync/impl/job/milible/BaseJob;", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/hr/HMHrData;", "Lcom/huami/device/core/sync/api/type/JobType;", "findType", "", "start", "<init>", "()V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public abstract class HrJob extends BaseJob<ArrayList<HMHrData>> {
    @Override // com.huami.device.core.sync.api.type.SyncJob
    @NotNull
    public final JobType findType() {
        return JobType.INSTANCE.getHR();
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob, com.huami.device.core.sync.api.type.SyncJob
    public void start() throws SyncException, InterruptedException, DeviceConnectException {
        super.start();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        loadProDevice().startSyncHrData(loadStartTime(), new IHMHrDataCallback() { // from class: com.huami.device.core.sync.impl.job.milible.HrJob.start.1
            @Override // com.xiaomi.hm.health.bt.profile.gdsp.hr.IHMHrDataCallback
            public void onHrData(@Nullable ArrayList<HMHrData> data) {
                if (data != null) {
                    HrJob.this.onDataOut(data);
                }
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.hr.IHMHrDataCallback
            public void onHrStart() {
                HrJob hrJob = HrJob.this;
                hrJob.sendStatus(hrJob.createProgress(0));
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.hr.IHMHrDataCallback
            public void onHrStop(boolean result) {
                if (!result) {
                    HrJob.this.onError(new Exception("stop then error."));
                }
                booleanRef.element = result;
                countDownLatch.countDown();
            }
        });
        countDownLatch.await(maxTime(), TimeUnit.MILLISECONDS);
        if (booleanRef.element) {
            sendStatus(createProgress(100));
            return;
        }
        throw new SyncException("sync " + findType() + " error", null, 0, 6, null);
    }
}
