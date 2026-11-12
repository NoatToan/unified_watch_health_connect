package com.amap.api.mapcore.util;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;
import com.amap.api.maps.model.Marker;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements SensorEventListener {
    private SensorManager a;
    private Sensor b;
    private float d;
    private Context e;
    private IAMapDelegate f;
    private Marker g;
    private long c = 0;
    private boolean h = true;

    public y(Context context, IAMapDelegate iAMapDelegate) {
        this.e = context.getApplicationContext();
        this.f = iAMapDelegate;
        try {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            this.a = sensorManager;
            if (sensorManager != null) {
                this.b = sensorManager.getDefaultSensor(3);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        try {
            if (System.currentTimeMillis() - this.c < 100) {
                return;
            }
            if (this.f.getGLMapEngine() == null || this.f.getGLMapEngine().getAnimateionsCount() <= 0) {
                eq.a().a(new Runnable() { // from class: com.amap.api.mapcore.util.y.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (sensorEvent.sensor.getType() != 3) {
                            return;
                        }
                        float fA = (sensorEvent.values[0] + y.a(y.this.e)) % 360.0f;
                        if (fA > 180.0f) {
                            fA -= 360.0f;
                        } else if (fA < -180.0f) {
                            fA += 360.0f;
                        }
                        if (Math.abs(y.this.d - fA) >= 3.0f) {
                            y yVar = y.this;
                            if (Float.isNaN(fA)) {
                                fA = 0.0f;
                            }
                            yVar.d = fA;
                            if (y.this.g != null) {
                                try {
                                    if (y.this.h) {
                                        y.this.f.moveCamera(af.c(y.this.d));
                                        y.this.g.setRotateAngle(-y.this.d);
                                    } else {
                                        y.this.g.setRotateAngle(360.0f - y.this.d);
                                    }
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                            }
                            y.this.c = System.currentTimeMillis();
                        }
                    }
                });
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void b() {
        Sensor sensor;
        SensorManager sensorManager = this.a;
        if (sensorManager == null || (sensor = this.b) == null) {
            return;
        }
        sensorManager.unregisterListener(this, sensor);
    }

    public final void a() {
        Sensor sensor;
        SensorManager sensorManager = this.a;
        if (sensorManager == null || (sensor = this.b) == null) {
            return;
        }
        sensorManager.registerListener(this, sensor, 3);
    }

    public final void a(Marker marker) {
        this.g = marker;
    }

    public final void a(boolean z) {
        this.h = z;
    }

    public static int a(Context context) {
        WindowManager windowManager;
        if (context == null || (windowManager = (WindowManager) context.getSystemService("window")) == null) {
            return 0;
        }
        try {
            int rotation = windowManager.getDefaultDisplay().getRotation();
            if (rotation == 1) {
                return 90;
            }
            if (rotation != 2) {
                return rotation != 3 ? 0 : -90;
            }
            return 180;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
