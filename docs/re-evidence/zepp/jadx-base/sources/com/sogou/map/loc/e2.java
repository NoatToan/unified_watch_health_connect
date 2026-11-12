package com.sogou.map.loc;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: loaded from: classes18.dex */
final class e2 implements SensorEventListener {
    private /* synthetic */ d2 a;

    public e2(d2 d2Var) {
        this.a = d2Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() != 6) {
            return;
        }
        try {
            float[] fArr = (float[]) sensorEvent.values.clone();
            this.a.p = d2.a(fArr[0]);
        } catch (Throwable unused) {
        }
    }
}
