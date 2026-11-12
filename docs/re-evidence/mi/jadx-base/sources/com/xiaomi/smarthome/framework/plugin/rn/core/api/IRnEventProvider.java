package com.xiaomi.smarthome.framework.plugin.rn.core.api;

import android.hardware.SensorEvent;

/* JADX INFO: loaded from: classes2.dex */
public interface IRnEventProvider {
    void sendAccelerometerEvent(SensorEvent sensorEvent);

    void sendAudioPlayerFinishedEvent(String str);

    void sendAudioPlayerStartEvent(String str);

    void sendAudioPlayerUpdateEvent(String str, int i);

    void sendColorSchemeChangedEvent(String str);

    void sendCompressEvent(double d);

    void sendDownloadProgressEvent(String str, String str2, long j, long j2);

    void sendGyroscopeEvent(SensorEvent sensorEvent);

    void sendLicenseRevokeEvent();

    void sendShakeEvent();

    void sendUploadProgressEvent(String str, String str2, long j, long j2);

    void sendVolumeChangeEvent(double d);
}
