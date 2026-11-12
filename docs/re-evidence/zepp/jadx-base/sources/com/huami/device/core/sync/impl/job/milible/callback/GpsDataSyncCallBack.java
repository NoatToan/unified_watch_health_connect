package com.huami.device.core.sync.impl.job.milible.callback;

import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.device.core.sync.impl.job.milible.BaseJob;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u001b\u0012\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u000eR\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R&\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0014j\b\u0012\u0004\u0012\u00020\u0003`\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/huami/device/core/sync/impl/job/milible/callback/GpsDataSyncCallBack;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SyncDataCallback;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsRecord;", "data", "", "onData", "Lcom/xiaomi/hm/health/bt/error/HMDeviceError;", "error", "onFinish", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "progress", "onProgress", "onStart", "", "maxAwaitTime", "loadResult", "Lcom/huami/device/core/sync/impl/job/milible/BaseJob;", "job", "Lcom/huami/device/core/sync/impl/job/milible/BaseJob;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "outData", "Ljava/util/ArrayList;", "Ljava/util/concurrent/CountDownLatch;", "countDownLatch", "Ljava/util/concurrent/CountDownLatch;", "syncError", "Lcom/xiaomi/hm/health/bt/error/HMDeviceError;", "<init>", "(Lcom/huami/device/core/sync/impl/job/milible/BaseJob;)V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class GpsDataSyncCallBack implements SyncDataCallback<List<? extends GpsRecord>> {

    @NotNull
    private final BaseJob<List<GpsRecord>> job;

    @Nullable
    private HMDeviceError syncError;

    @NotNull
    private final ArrayList<GpsRecord> outData = new ArrayList<>();

    @NotNull
    private final CountDownLatch countDownLatch = new CountDownLatch(1);

    public GpsDataSyncCallBack(@NotNull BaseJob<List<GpsRecord>> baseJob) {
        this.job = baseJob;
    }

    @NotNull
    public final List<GpsRecord> loadResult(long maxAwaitTime) throws SyncException, InterruptedException {
        HMDeviceError hMDeviceError = this.syncError;
        boolean z = false;
        if (hMDeviceError != null && 2 == hMDeviceError.getError()) {
            z = true;
        }
        if (z) {
            this.job.onError(new Exception("error code --> 2"));
            throw new SyncException("sync " + this.job.findType() + " error", null, 2, 2, null);
        }
        this.countDownLatch.await(maxAwaitTime, TimeUnit.MILLISECONDS);
        HMDeviceError hMDeviceError2 = this.syncError;
        if (hMDeviceError2 == null || hMDeviceError2.isErrorNone()) {
            return this.outData;
        }
        this.job.onError(new Exception(Intrinsics.stringPlus("error code --> ", Integer.valueOf(hMDeviceError2.getError()))));
        throw new SyncException("sync " + this.job.findType() + " error", null, hMDeviceError2.getError(), 2, null);
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback
    public void onFinish(@NotNull HMDeviceError error) {
        this.syncError = error;
        this.countDownLatch.countDown();
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback
    public void onProgress(@NotNull Progress progress) {
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback
    public void onStart() {
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback
    public void onData(@Nullable List<? extends GpsRecord> data) {
        this.outData.clear();
        if (data != null) {
            this.outData.addAll(data);
        }
        this.countDownLatch.countDown();
    }
}
