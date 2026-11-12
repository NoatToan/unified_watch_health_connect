package com.huami.mifit.sportlib.devicekit;

/* JADX INFO: loaded from: classes11.dex */
public interface ISportDeviceCallback {
    void deviceServicePause(int i);

    void deviceServiceResume(int i);

    void deviceServiceStop(int i);

    String formatDeviceToString();

    boolean hasBaroMeter();

    void sendDataToDevice(String str);

    void sendPaceToDevice(int i, float f);

    void sportPause(int i);

    void sportResume(int i);

    void sportStart(int i);

    void sportStop(int i);
}
