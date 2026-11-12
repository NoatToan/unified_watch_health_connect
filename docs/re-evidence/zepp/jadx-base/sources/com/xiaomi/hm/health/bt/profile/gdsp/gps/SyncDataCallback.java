package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import androidx.exifinterface.media.ExifInterface;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0019\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH&¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SyncDataCallback;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "onStart", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "progress", "onProgress", "data", "onData", "(Ljava/lang/Object;)V", "Lcom/xiaomi/hm/health/bt/error/HMDeviceError;", "error", "onFinish", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface SyncDataCallback<T> {
    void onData(@Nullable T data);

    void onFinish(@NotNull HMDeviceError error);

    void onProgress(@NotNull Progress progress);

    void onStart();
}
