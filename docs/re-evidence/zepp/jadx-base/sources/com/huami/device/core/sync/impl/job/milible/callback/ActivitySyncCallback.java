package com.huami.device.core.sync.impl.job.milible.callback;

import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.device.core.sync.impl.job.milible.BaseJob;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.error.HMDeviceSyncDataError;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\u0012¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001e\u0010\u000e\u001a\u00020\u00022\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\nH\u0016J\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0010\u001a\u00020\u000fR(\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR2\u0010\u001f\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u001dj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b`\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/huami/device/core/sync/impl/job/milible/callback/ActivitySyncCallback;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/IHMActivityDataCallback;", "", "onSyncStart", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "progress", "onSyncProgress", "Lcom/xiaomi/hm/health/bt/error/HMDeviceSyncDataError;", "error", "onSyncFinish", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/ActivityDataFragment;", "", "dataFragmentList", "onSyncStop", "", "maxAwaitTime", "loadOutData", "Lcom/huami/device/core/sync/impl/job/milible/BaseJob;", "job", "Lcom/huami/device/core/sync/impl/job/milible/BaseJob;", "", "tag", "Ljava/lang/String;", "jobError", "Lcom/xiaomi/hm/health/bt/error/HMDeviceSyncDataError;", "Ljava/util/concurrent/CountDownLatch;", "countDownLatch", "Ljava/util/concurrent/CountDownLatch;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "outData", "Ljava/util/ArrayList;", "<init>", "(Lcom/huami/device/core/sync/impl/job/milible/BaseJob;)V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class ActivitySyncCallback implements IHMActivityDataCallback {

    @NotNull
    private final BaseJob<List<ActivityDataFragment<Object>>> job;

    @Nullable
    private HMDeviceSyncDataError jobError;

    @NotNull
    private final String tag = "SyncCenter-ActivitySyncCallback";

    @NotNull
    private final CountDownLatch countDownLatch = new CountDownLatch(2);

    @NotNull
    private final ArrayList<ActivityDataFragment<Object>> outData = new ArrayList<>();

    public ActivitySyncCallback(@NotNull BaseJob<List<ActivityDataFragment<Object>>> baseJob) {
        this.job = baseJob;
    }

    @NotNull
    public final List<ActivityDataFragment<Object>> loadOutData(long maxAwaitTime) throws SyncException, InterruptedException {
        this.countDownLatch.await(maxAwaitTime, TimeUnit.MILLISECONDS);
        HMDeviceSyncDataError hMDeviceSyncDataError = this.jobError;
        if (hMDeviceSyncDataError == null || hMDeviceSyncDataError.isErrorNone()) {
            return this.outData;
        }
        BaseJob<List<ActivityDataFragment<Object>>> baseJob = this.job;
        baseJob.sendStatus(baseJob.createErrorProgress(new Exception(Intrinsics.stringPlus("error code ", Integer.valueOf(hMDeviceSyncDataError.getError()))), hMDeviceSyncDataError.getError()));
        throw new SyncException("sync " + this.job.findType() + " error", null, hMDeviceSyncDataError.getError());
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
    public void onSyncFinish(@Nullable HMDeviceSyncDataError error) {
        this.jobError = error;
        this.countDownLatch.countDown();
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
    public void onSyncProgress(@Nullable Progress progress) {
        String str = this.tag;
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtil.SPACE);
        sb.append(this.job.findType());
        sb.append(" progress -> ");
        sb.append(progress == null ? null : Integer.valueOf(progress.getPercent()));
        HMLog.d(str, sb.toString(), new Object[0]);
        if (progress == null) {
            return;
        }
        BaseJob<List<ActivityDataFragment<Object>>> baseJob = this.job;
        baseJob.sendStatus(baseJob.createProgress(progress.getPercent()));
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
    public void onSyncStart() {
        BaseJob<List<ActivityDataFragment<Object>>> baseJob = this.job;
        baseJob.sendStatus(baseJob.createProgress(1));
        this.countDownLatch.countDown();
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
    public void onSyncStop(@Nullable List<ActivityDataFragment<Object>> dataFragmentList) {
        if (dataFragmentList == null) {
            return;
        }
        this.outData.addAll(dataFragmentList);
    }
}
