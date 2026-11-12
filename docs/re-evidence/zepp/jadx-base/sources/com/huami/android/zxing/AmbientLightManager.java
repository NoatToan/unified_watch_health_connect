package com.huami.android.zxing;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.huami.android.zxing.camera.CameraManager;

/* JADX INFO: loaded from: classes5.dex */
public final class AmbientLightManager implements SensorEventListener {
    private static final float d = 45.0f;
    private static final float e = 450.0f;
    private final Context a;
    private CameraManager b;
    private Sensor c;

    public AmbientLightManager(Context context) {
        this.a = context;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float f = sensorEvent.values[0];
        CameraManager cameraManager = this.b;
        if (cameraManager != null) {
            if (f <= 45.0f) {
                cameraManager.setTorch(true);
            } else if (f >= e) {
                cameraManager.setTorch(false);
            }
        }
    }

    public void start(CameraManager cameraManager) {
        this.b = cameraManager;
    }

    public void stop() {
        if (this.c != null) {
            ((SensorManager) this.a.getSystemService("sensor")).unregisterListener(this);
            this.b = null;
            this.c = null;
        }
    }
}
