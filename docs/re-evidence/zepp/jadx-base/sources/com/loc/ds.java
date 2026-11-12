package com.loc;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes18.dex */
public final class ds implements SensorEventListener {
    public SensorManager a;
    public Sensor b;
    public Sensor c;
    public Sensor d;
    private Context s;
    public boolean e = false;
    public double f = 0.0d;
    public float g = 0.0f;
    private float t = 1013.25f;
    private float u = 0.0f;
    public Handler h = new Handler();
    public double i = 0.0d;
    public double j = 0.0d;
    public double k = 0.0d;
    public double l = 0.0d;
    public double[] m = new double[3];
    public volatile double n = 0.0d;
    public long o = 0;
    public long p = 0;
    public final int q = 100;
    public final int r = 30;

    public ds(Context context) {
        this.s = null;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        try {
            this.s = context;
            if (this.a == null) {
                this.a = (SensorManager) context.getSystemService("sensor");
            }
            try {
                this.b = this.a.getDefaultSensor(6);
            } catch (Throwable unused) {
            }
            try {
                this.c = this.a.getDefaultSensor(11);
            } catch (Throwable unused2) {
            }
            try {
                this.d = this.a.getDefaultSensor(1);
            } catch (Throwable unused3) {
            }
        } catch (Throwable th) {
            ei.a(th, "AMapSensorManager", "<init>");
        }
    }

    public final void a() {
        SensorManager sensorManager = this.a;
        if (sensorManager == null || this.e) {
            return;
        }
        this.e = true;
        try {
            Sensor sensor = this.b;
            if (sensor != null) {
                sensorManager.registerListener(this, sensor, 3, this.h);
            }
        } catch (Throwable th) {
            ei.a(th, "AMapSensorManager", "registerListener mPressure");
        }
        try {
            Sensor sensor2 = this.c;
            if (sensor2 != null) {
                this.a.registerListener(this, sensor2, 3, this.h);
            }
        } catch (Throwable th2) {
            ei.a(th2, "AMapSensorManager", "registerListener mRotationVector");
        }
        try {
            Sensor sensor3 = this.d;
            if (sensor3 != null) {
                this.a.registerListener(this, sensor3, 3, this.h);
            }
        } catch (Throwable th3) {
            ei.a(th3, "AMapSensorManager", "registerListener mAcceleroMeterVector");
        }
    }

    public final void b() {
        SensorManager sensorManager = this.a;
        if (sensorManager == null || !this.e) {
            return;
        }
        this.e = false;
        try {
            Sensor sensor = this.b;
            if (sensor != null) {
                sensorManager.unregisterListener(this, sensor);
            }
        } catch (Throwable unused) {
        }
        try {
            Sensor sensor2 = this.c;
            if (sensor2 != null) {
                this.a.unregisterListener(this, sensor2);
            }
        } catch (Throwable unused2) {
        }
        try {
            Sensor sensor3 = this.d;
            if (sensor3 != null) {
                this.a.unregisterListener(this, sensor3);
            }
        } catch (Throwable unused3) {
        }
    }

    public final float c() {
        return this.u;
    }

    public final double d() {
        return this.l;
    }

    public final void e() {
        try {
            b();
            this.b = null;
            this.c = null;
            this.a = null;
            this.d = null;
            this.e = false;
        } catch (Throwable th) {
            ei.a(th, "AMapSensorManager", "destroy");
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent == null) {
            return;
        }
        try {
            int type = sensorEvent.sensor.getType();
            if (type != 1) {
                if (type == 6) {
                    try {
                        if (this.b != null) {
                            float[] fArr = (float[]) sensorEvent.values.clone();
                            this.g = fArr[0];
                            this.f = eo.a(SensorManager.getAltitude(this.t, fArr[0]));
                            return;
                        }
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                if (type != 11) {
                    return;
                }
                try {
                    if (this.c != null) {
                        float[] fArr2 = new float[9];
                        SensorManager.getRotationMatrixFromVector(fArr2, (float[]) sensorEvent.values.clone());
                        float[] fArr3 = new float[3];
                        SensorManager.getOrientation(fArr2, fArr3);
                        float degrees = (float) Math.toDegrees(fArr3[0]);
                        this.u = degrees;
                        if (degrees <= 0.0f) {
                            degrees += 360.0f;
                        }
                        this.u = (float) Math.floor(degrees);
                        return;
                    }
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            }
            if (this.d != null) {
                float[] fArr4 = (float[]) sensorEvent.values.clone();
                double[] dArr = this.m;
                dArr[0] = (dArr[0] * 0.800000011920929d) + ((double) (fArr4[0] * 0.19999999f));
                dArr[1] = (dArr[1] * 0.800000011920929d) + ((double) (fArr4[1] * 0.19999999f));
                dArr[2] = (dArr[2] * 0.800000011920929d) + ((double) (fArr4[2] * 0.19999999f));
                this.i = ((double) fArr4[0]) - dArr[0];
                this.j = ((double) fArr4[1]) - dArr[1];
                this.k = ((double) fArr4[2]) - dArr[2];
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.o >= 100) {
                    double d = this.i;
                    double d2 = this.j;
                    double d3 = (d * d) + (d2 * d2);
                    double d4 = this.k;
                    double dSqrt = Math.sqrt(d3 + (d4 * d4));
                    this.p++;
                    this.o = jCurrentTimeMillis;
                    this.n += dSqrt;
                    if (this.p >= 30) {
                        this.l = this.n / this.p;
                        this.n = 0.0d;
                        this.p = 0L;
                    }
                }
            }
        } catch (Throwable unused3) {
        }
    }
}
