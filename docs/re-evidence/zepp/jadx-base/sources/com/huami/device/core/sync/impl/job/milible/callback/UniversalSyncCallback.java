package com.huami.device.core.sync.impl.job.milible.callback;

import androidx.exifinterface.media.ExifInterface;
import com.huami.bluetooth.profile.data.SyncDataCallback;
import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.device.core.sync.impl.job.milible.BaseJob;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016J\u0017\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/huami/device/core/sync/impl/job/milible/callback/UniversalSyncCallback;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/bluetooth/profile/data/SyncDataCallback;", "", "onStart", "onCompleted", "Lcom/xiaomi/hm/health/bt/error/HMDeviceError;", "error", "onError", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "progress", "onProgress", "data", "onReceived", "(Ljava/lang/Object;)V", "", "maxAwaitTime", "loadResult", "(J)Ljava/lang/Object;", "Lcom/huami/device/core/sync/impl/job/milible/BaseJob;", "job", "Lcom/huami/device/core/sync/impl/job/milible/BaseJob;", "outData", "Ljava/lang/Object;", "Ljava/util/concurrent/CountDownLatch;", "countDownLatch", "Ljava/util/concurrent/CountDownLatch;", "syncError", "Lcom/xiaomi/hm/health/bt/error/HMDeviceError;", "<init>", "(Lcom/huami/device/core/sync/impl/job/milible/BaseJob;)V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class UniversalSyncCallback<T> implements SyncDataCallback<T> {

    @NotNull
    private final CountDownLatch countDownLatch = new CountDownLatch(1);

    @NotNull
    private final BaseJob<T> job;

    @Nullable
    private T outData;

    @Nullable
    private HMDeviceError syncError;

    public UniversalSyncCallback(@NotNull BaseJob<T> baseJob) {
        this.job = baseJob;
    }

    @Nullable
    public final T loadResult(long maxAwaitTime) throws SyncException, InterruptedException {
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

    @Override // com.huami.bluetooth.profile.data.SyncDataCallback
    public void onCompleted() {
        this.countDownLatch.countDown();
    }

    @Override // com.huami.bluetooth.profile.data.SyncDataCallback
    public void onError(@NotNull HMDeviceError error) {
        this.syncError = error;
        this.countDownLatch.countDown();
    }

    @Override // com.huami.bluetooth.profile.data.SyncDataCallback
    public void onProgress(@NotNull Progress progress) {
    }

    @Override // com.huami.bluetooth.profile.data.SyncDataCallback
    public void onReceived(T data) {
        this.outData = data;
        this.countDownLatch.countDown();
    }

    @Override // com.huami.bluetooth.profile.data.SyncDataCallback
    public void onStart() {
    }
}
