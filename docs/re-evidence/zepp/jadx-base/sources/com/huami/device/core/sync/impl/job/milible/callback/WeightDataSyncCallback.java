package com.huami.device.core.sync.impl.job.milible.callback;

import com.huami.device.core.sync.impl.job.weight.BaseWeightJob;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.model.WeightSyncResult;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/huami/device/core/sync/impl/job/milible/callback/WeightDataSyncCallback;", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Lcom/xiaomi/hm/health/bt/model/WeightSyncResult;", "", "onStart", "t", "onData", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "progress", "onProgress", "", "result", "onFinish", "", "maxAwaitTime", "loadResult", "Lcom/huami/device/core/sync/impl/job/weight/BaseWeightJob;", "job", "Lcom/huami/device/core/sync/impl/job/weight/BaseWeightJob;", "", "tag", "Ljava/lang/String;", "Ljava/util/concurrent/CountDownLatch;", "countDownLatch", "Ljava/util/concurrent/CountDownLatch;", "dataOut", "Lcom/xiaomi/hm/health/bt/model/WeightSyncResult;", "<init>", "(Lcom/huami/device/core/sync/impl/job/weight/BaseWeightJob;)V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public final class WeightDataSyncCallback extends HMCallback<WeightSyncResult> {

    @Nullable
    private WeightSyncResult dataOut;

    @NotNull
    private final BaseWeightJob<WeightSyncResult> job;

    @NotNull
    private final String tag = "SyncCenter-WeightData";

    @NotNull
    private final CountDownLatch countDownLatch = new CountDownLatch(2);

    public WeightDataSyncCallback(@NotNull BaseWeightJob<WeightSyncResult> baseWeightJob) {
        this.job = baseWeightJob;
    }

    @Nullable
    public final WeightSyncResult loadResult(long maxAwaitTime) {
        this.countDownLatch.await(maxAwaitTime, TimeUnit.MILLISECONDS);
        return this.dataOut;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onFinish(boolean result) {
        super.onFinish(result);
        if (!result) {
            HMLog.e(this.tag, "同步出错", new Object[0]);
        }
        this.countDownLatch.countDown();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onProgress(@Nullable Progress progress) {
        super.onProgress(progress);
        if (progress == null) {
            return;
        }
        this.job.onProgress(progress);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onStart() {
        super.onStart();
        this.countDownLatch.countDown();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onData(@Nullable WeightSyncResult t) {
        super.onData(t);
        this.dataOut = t;
    }
}
