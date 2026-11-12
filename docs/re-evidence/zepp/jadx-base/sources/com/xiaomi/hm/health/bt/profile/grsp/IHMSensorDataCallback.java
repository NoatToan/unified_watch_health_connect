package com.xiaomi.hm.health.bt.profile.grsp;

/* JADX INFO: loaded from: classes18.dex */
public interface IHMSensorDataCallback {
    void onSensorData(SensorDataFragment dataFragment);

    void onSensorOriginData(byte[] data);

    void onSensorStart();

    void onSensorStop(boolean result);
}
