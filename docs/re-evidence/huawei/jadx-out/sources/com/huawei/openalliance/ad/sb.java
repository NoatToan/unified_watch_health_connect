package com.huawei.openalliance.ad;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes41.dex */
public class sb implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SensorManager f20248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Sensor f20249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f20250c;
    private final float[] d;
    private float[] e = new float[3];

    public interface a {
        void a(double d, double d2, double d3);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 15) {
            SensorManager.getRotationMatrixFromVector(this.d, sensorEvent.values);
            SensorManager.getOrientation(this.d, this.e);
            double degrees = Math.toDegrees(this.e[0]);
            double degrees2 = Math.toDegrees(this.e[1]);
            double degrees3 = Math.toDegrees(this.e[2]);
            a aVar = this.f20250c;
            if (aVar != null) {
                aVar.a(degrees2, degrees3, degrees);
            }
        }
    }

    public void b() {
        try {
            this.f20248a.unregisterListener(this, this.f20249b);
            this.f20250c = null;
        } catch (Throwable th) {
            hw.c("RotateDetector", "unregister err: %s", th.getClass().getSimpleName());
        }
    }

    public void a(a aVar) {
        this.f20250c = aVar;
    }

    public void a() {
        try {
            this.f20248a.registerListener(this, this.f20249b, 3);
        } catch (Throwable th) {
            hw.c("RotateDetector", "registerListener exception: %s", th.getClass().getSimpleName());
        }
    }

    public sb(Context context) {
        float[] fArr = new float[16];
        this.d = fArr;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f20248a = sensorManager;
        this.f20249b = sensorManager.getDefaultSensor(15);
        fArr[0] = 1.0f;
        fArr[4] = 1.0f;
        fArr[8] = 1.0f;
        fArr[12] = 1.0f;
    }
}
