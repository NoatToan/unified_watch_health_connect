package com.huami.device.core.sync.api.worker;

import androidx.annotation.WorkerThread;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0004H&¨\u0006\u000b"}, d2 = {"Lcom/huami/device/core/sync/api/worker/Worker;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "onStart", "onSuccess", "", "e", "onError", "onTimeOut", "sync-center_release"}, k = 1, mv = {1, 5, 1})
@WorkerThread
public interface Worker {
    void onError(@NotNull Throwable e);

    void onStart(@NotNull HMBaseDevice device);

    void onSuccess();

    void onTimeOut();
}
