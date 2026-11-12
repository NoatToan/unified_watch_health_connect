package com.huawei.openalliance.ad;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes41.dex */
public class sa implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SensorManager f20245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Sensor f20246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f20247c;

    public interface a {
        void a(float f, float f2, float f3);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (1 == sensorEvent.sensor.getType()) {
            float f = sensorEvent.values[0];
            float f2 = sensorEvent.values[1];
            float f3 = sensorEvent.values[2];
            if (hw.a()) {
                hw.a("PhoneAccelerometerDetec", "onSensorChanged x: %s, y: %s, z: %s", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
            }
            a aVar = this.f20247c;
            if (aVar != null) {
                aVar.a(f, f2, f3);
            }
        }
    }

    public void b() {
        try {
            this.f20245a.unregisterListener(this, this.f20246b);
            this.f20247c = null;
        } catch (Throwable th) {
            hw.c("PhoneAccelerometerDetec", "unregister err: %s", th.getClass().getSimpleName());
        }
    }

    public void a(a aVar) {
        this.f20247c = aVar;
    }

    public void a() {
        Sensor sensor = this.f20246b;
        if (sensor != null) {
            try {
                this.f20245a.registerListener(this, sensor, 2);
            } catch (Throwable th) {
                hw.c("PhoneAccelerometerDetec", "registerListener exception: %s", th.getClass().getSimpleName());
            }
        }
    }

    public sa(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f20245a = sensorManager;
        this.f20246b = sensorManager.getDefaultSensor(1);
    }
}
