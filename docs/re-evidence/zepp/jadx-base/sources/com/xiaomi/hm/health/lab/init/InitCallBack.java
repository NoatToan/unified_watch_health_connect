package com.xiaomi.hm.health.lab.init;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;

/* JADX INFO: loaded from: classes21.dex */
public interface InitCallBack {
    long getBehaviorTagEndTime();

    @Nullable
    String getBoundDeviceName(@NonNull HMDeviceType hMDeviceType);

    @NonNull
    HMDeviceSource getBoundDeviceSource(@NonNull HMDeviceType hMDeviceType);

    @Nullable
    HMBaseDevice getDevice(@NonNull HMDeviceType hMDeviceType);

    String getTime(Context context, long j, long j2);

    long getUploadOffsetTime();

    String getUploadUrlPackageName();

    String getUserId();

    boolean hasBound(@NonNull HMDeviceType hMDeviceType);

    boolean hasBoundWatch();

    boolean isBluetoothEnable();

    boolean isSupportEarbudSleep();

    boolean keepNmeaLog();

    void registerEventListener(boolean z);

    boolean showHelpNote();

    boolean supportHeadsetSleep();

    boolean supportNmeaTagging(HMDeviceType hMDeviceType);

    boolean supportShoeMars();

    boolean supportSwimTagging(@NonNull HMDeviceType hMDeviceType);

    boolean supportTagTimeOffset();

    boolean supportTemperatureTagging();
}
