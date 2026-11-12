package com.huami.device.core.sync.impl.job.hub.callback;

import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.device.core.sync.impl.job.hub.SensorHubJob;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.error.HMDeviceSyncDataError;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001e\u0010\u000e\u001a\u00020\u00022\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\nH\u0016J\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000fR\u0019\u0010\u0012\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR2\u0010 \u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u001ej\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b`\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/huami/device/core/sync/impl/job/hub/callback/SensorHubDtaSyncCallback;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/IHMActivityDataCallback;", "", "onSyncStart", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "progress", "onSyncProgress", "Lcom/xiaomi/hm/health/bt/error/HMDeviceSyncDataError;", "error", "onSyncFinish", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/ActivityDataFragment;", "", "dataFragmentList", "onSyncStop", "", "loadResult", "Lcom/huami/device/core/sync/impl/job/hub/SensorHubJob;", "hub", "Lcom/huami/device/core/sync/impl/job/hub/SensorHubJob;", "getHub", "()Lcom/huami/device/core/sync/impl/job/hub/SensorHubJob;", "", "tag", "Ljava/lang/String;", "Ljava/util/concurrent/CountDownLatch;", "countDownLatch", "Ljava/util/concurrent/CountDownLatch;", "syncError", "Lcom/xiaomi/hm/health/bt/error/HMDeviceSyncDataError;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "dataOut", "Ljava/util/ArrayList;", "<init>", "(Lcom/huami/device/core/sync/impl/job/hub/SensorHubJob;)V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class SensorHubDtaSyncCallback implements IHMActivityDataCallback {

    @NotNull
    private final SensorHubJob hub;

    @Nullable
    private HMDeviceSyncDataError syncError;

    @NotNull
    private final String tag = "SyncCenter-SensorHubDtaSyncCallback";

    @NotNull
    private final CountDownLatch countDownLatch = new CountDownLatch(2);

    @NotNull
    private final ArrayList<ActivityDataFragment<Object>> dataOut = new ArrayList<>();

    public SensorHubDtaSyncCallback(@NotNull SensorHubJob sensorHubJob) {
        this.hub = sensorHubJob;
    }

    @NotNull
    public final SensorHubJob getHub() {
        return this.hub;
    }

    @NotNull
    public final List<ActivityDataFragment<Object>> loadResult() throws SyncException, InterruptedException {
        this.countDownLatch.await(600000L, TimeUnit.MILLISECONDS);
        HMDeviceSyncDataError hMDeviceSyncDataError = this.syncError;
        if (hMDeviceSyncDataError == null || hMDeviceSyncDataError.isErrorNone()) {
            return this.dataOut;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("error code ");
        HMDeviceSyncDataError hMDeviceSyncDataError2 = this.syncError;
        sb.append(hMDeviceSyncDataError2 == null ? null : Integer.valueOf(hMDeviceSyncDataError2.getError()));
        sb.append(" has lost = ");
        HMDeviceSyncDataError hMDeviceSyncDataError3 = this.syncError;
        sb.append(hMDeviceSyncDataError3 != null ? Boolean.valueOf(hMDeviceSyncDataError3.isLosePackageHappened()) : null);
        throw new SyncException(sb.toString(), null, 0, 6, null);
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
    public void onSyncFinish(@Nullable HMDeviceSyncDataError error) {
        this.syncError = error;
        this.countDownLatch.countDown();
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
    public void onSyncProgress(@Nullable Progress progress) {
        if (progress == null) {
            return;
        }
        getHub().sendStatus(getHub().createProgress(progress.getPercent()));
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
    public void onSyncStart() {
        HMLog.d(this.tag, "start", new Object[0]);
        this.countDownLatch.countDown();
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
    public void onSyncStop(@Nullable List<ActivityDataFragment<Object>> dataFragmentList) {
        this.dataOut.clear();
        if (dataFragmentList == null) {
            return;
        }
        this.dataOut.addAll(dataFragmentList);
    }
}
