package com.huami.mifit.sportlib.defpractice;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.huami.mifit.sportlib.core.GPSDataController;
import com.huami.mifit.sportlib.devicekit.ISportDeviceCallback;

/* JADX INFO: loaded from: classes11.dex */
public class DefDeviceClient implements ISportDeviceCallback {
    private static volatile DefDeviceClient i;
    private final String a = "DefDeviceClient";
    private Context b;
    private boolean c;
    private SensorManager d;
    private Sensor e;
    private Sensor f;
    private b g;
    private a h;

    public class a implements SensorEventListener {
        public a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
            Log.i("DefDeviceClient", "onAccuracyChanged:" + sensor.getName() + ",accuracy:" + i);
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            GPSDataController.getInstance().sendPressureData(sensorEvent.values[0]);
        }
    }

    public class b implements SensorEventListener {
        private static final int e = 1000;
        private static final int f = 512;
        private int a = 0;
        private int b = 0;
        private long c = 0;

        public b() {
        }

        public void a() {
            int i = this.b;
            int i2 = this.a;
            if (i < i2) {
                this.b = i2;
                GPSDataController.getInstance().sendStepData(43, this.b, -1, 0, 0, 2);
            }
            this.a = 0;
            this.b = 0;
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
            Log.i("DefDeviceClient", "onAccuracyChanged:" + sensor.getName() + ",accuracy:" + i);
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 18) {
                int i = (int) sensorEvent.values[0];
                this.a += i;
                if (System.currentTimeMillis() - this.c > 1000) {
                    this.c = System.currentTimeMillis();
                    Log.i("DefDeviceClient", "StepSensorDetector newStep:" + i + ",total:" + this.a);
                    int i2 = this.a;
                    if (i2 - this.b <= 512) {
                        this.b = i2;
                        GPSDataController.getInstance().sendStepData(43, this.b, -1, 0, 0, 2);
                        return;
                    }
                    Log.i("DefDeviceClient", "PhoneStepSensor exception!, sensorStep:" + this.a + ",ToAlgoSteps:" + this.b);
                    a();
                    DefDeviceClient.this.d.unregisterListener(this);
                    DefDeviceClient.this.g = null;
                }
            }
        }
    }

    private DefDeviceClient() {
    }

    private Boolean c() {
        if (Build.VERSION.SDK_INT >= 29) {
            return Boolean.valueOf(ContextCompat.checkSelfPermission(this.b, "android.permission.ACTIVITY_RECOGNITION") == 0);
        }
        return Boolean.TRUE;
    }

    private void d() {
        if (c().booleanValue()) {
            SensorManager sensorManager = (SensorManager) this.b.getSystemService("sensor");
            this.d = sensorManager;
            if (sensorManager == null) {
                Log.i("DefDeviceClient", "SensorManager is null!!!");
                return;
            }
            if (this.g == null) {
                this.g = new b();
            }
            Sensor defaultSensor = this.d.getDefaultSensor(18);
            this.e = defaultSensor;
            if (defaultSensor != null) {
                this.d.registerListener(this.g, defaultSensor, 2);
            } else {
                Log.i("DefDeviceClient", "TYPE_STEP_DETECTOR is null!!!");
            }
            if (this.h == null) {
                this.h = new a();
            }
            Sensor defaultSensor2 = this.d.getDefaultSensor(6);
            this.f = defaultSensor2;
            if (defaultSensor2 != null) {
                this.c = true;
                this.d.registerListener(this.h, defaultSensor2, 2);
            } else {
                this.c = false;
                Log.i("DefDeviceClient", "TYPE_PRESSURE is nulll!!!");
            }
        }
    }

    private void e() {
        b bVar = this.g;
        if (bVar != null) {
            bVar.a();
        }
        SensorManager sensorManager = this.d;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.g);
            this.d.unregisterListener(this.h);
        }
    }

    public static DefDeviceClient getInstance() {
        if (i == null) {
            synchronized (DefDeviceClient.class) {
                if (i == null) {
                    i = new DefDeviceClient();
                }
            }
        }
        return i;
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void deviceServicePause(int i2) {
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void deviceServiceResume(int i2) {
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void deviceServiceStop(int i2) {
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public String formatDeviceToString() {
        return "SmartPhone";
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public boolean hasBaroMeter() {
        return this.c;
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void sendDataToDevice(String str) {
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void sendPaceToDevice(int i2, float f) {
    }

    public void setContext(Context context) {
        this.b = context;
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void sportPause(int i2) {
        e();
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void sportResume(int i2) {
        d();
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void sportStart(int i2) {
        d();
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void sportStop(int i2) {
        e();
    }
}
