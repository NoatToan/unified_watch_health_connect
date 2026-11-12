package com.huami.device.core.sync.impl.job.milible;

import com.huami.device.core.sync.api.exception.DeviceConnectException;
import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.device.core.sync.api.type.JobType;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.pai.HMPaiData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b'\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/huami/device/core/sync/impl/job/milible/PaiJob;", "Lcom/huami/device/core/sync/impl/job/milible/BaseJob;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pai/HMPaiData;", "Lcom/huami/device/core/sync/api/type/JobType;", "findType", "", "start", "", "tag", "Ljava/lang/String;", "<init>", "()V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public abstract class PaiJob extends BaseJob<List<? extends HMPaiData>> {

    @NotNull
    private final String tag = "SyncCenter-PaiJob";

    @Override // com.huami.device.core.sync.api.type.SyncJob
    @NotNull
    public final JobType findType() {
        return JobType.INSTANCE.getPAI();
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob, com.huami.device.core.sync.api.type.SyncJob
    public void start() throws SyncException, InterruptedException, DeviceConnectException {
        super.start();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final ArrayList arrayList = new ArrayList();
        sendStatus(createProgress(1));
        loadProDevice().startSyncPaiData(loadStartTime(), new HMCallback<ArrayList<HMPaiData>>() { // from class: com.huami.device.core.sync.impl.job.milible.PaiJob.start.1
            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(@Nullable ArrayList<HMPaiData> t) {
                super.onFinish(t);
                if (t != null) {
                    arrayList.addAll(t);
                }
                countDownLatch.countDown();
            }
        });
        countDownLatch.await(maxTime(), TimeUnit.MILLISECONDS);
        sendStatus(createProgress(100));
        try {
            onDataOut(arrayList);
        } catch (Exception e) {
            throw new SyncException("sync " + findType() + " out data error", e, 0, 4, null);
        }
    }
}
