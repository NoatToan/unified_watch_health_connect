package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0004H&¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SyncDataCallback;", "T", "", "onData", "", "data", "(Ljava/lang/Object;)V", "onFinish", "error", "Lcom/xiaomi/hm/health/bt/error/HMDeviceError;", "onProgress", BroadcastsKt.SILENT_PUSHING_PROGRESS, "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", LifecycleConstantKt.ON_START, "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface SyncDataCallback<T> {
    void onData(@Nullable T data);

    void onFinish(@NotNull HMDeviceError error);

    void onProgress(@NotNull Progress progress);

    void onStart();
}
