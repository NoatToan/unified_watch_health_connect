package com.google.zxing.client.android;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.journeyapps.barcodescanner.camera.CameraManager;
import com.journeyapps.barcodescanner.camera.CameraSettings;

/* JADX INFO: loaded from: classes4.dex */
public final class AmbientLightManager implements SensorEventListener {
    private static final float f = 45.0f;
    private static final float g = 450.0f;
    private CameraManager a;
    private CameraSettings b;
    private Sensor c;
    private Context d;
    private Handler e = new Handler();

    public class a implements Runnable {
        public final /* synthetic */ boolean a;

        public a(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            AmbientLightManager.this.a.setTorch(this.a);
        }
    }

    public AmbientLightManager(Context context, CameraManager cameraManager, CameraSettings cameraSettings) {
        this.d = context;
        this.a = cameraManager;
        this.b = cameraSettings;
    }

    private void b(boolean z) {
        this.e.post(new a(z));
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float f2 = sensorEvent.values[0];
        if (this.a != null) {
            if (f2 <= 45.0f) {
                b(true);
            } else if (f2 >= g) {
                b(false);
            }
        }
    }

    public void start() {
        if (this.b.isAutoTorchEnabled()) {
            SensorManager sensorManager = (SensorManager) this.d.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.c = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    public void stop() {
        if (this.c != null) {
            ((SensorManager) this.d.getSystemService("sensor")).unregisterListener(this);
            this.c = null;
        }
    }
}
