package com.huami.bluetooth.profile.data;

import androidx.exifinterface.media.ExifInterface;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H&J\u0017\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH&¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/data/SyncDataCallback;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "onStart", "data", "onReceived", "(Ljava/lang/Object;)V", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "progress", "onProgress", "onCompleted", "Lcom/xiaomi/hm/health/bt/error/HMDeviceError;", "error", "onError", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface SyncDataCallback<T> {
    void onCompleted();

    void onError(@NotNull HMDeviceError error);

    void onProgress(@NotNull Progress progress);

    void onReceived(T data);

    void onStart();
}
