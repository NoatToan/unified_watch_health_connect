package com.google.android.exoplayer2.device;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface DeviceListener {
    void onDeviceInfoChanged(DeviceInfo deviceInfo);

    void onDeviceVolumeChanged(int volume, boolean muted);
}
