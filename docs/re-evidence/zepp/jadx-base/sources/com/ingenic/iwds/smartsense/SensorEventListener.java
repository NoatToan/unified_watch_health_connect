package com.ingenic.iwds.smartsense;

/* JADX INFO: loaded from: classes18.dex */
public interface SensorEventListener {
    void onAccuracyChanged(Sensor sensor, int i);

    void onSensorChanged(SensorEvent sensorEvent);
}
