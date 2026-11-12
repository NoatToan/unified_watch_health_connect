package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.amap.api.maps.model.Marker;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;

/* JADX INFO: loaded from: classes4.dex */
public final class r5s implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SensorManager f32219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Sensor f32220b;
    public Sensor c;
    public Sensor d;
    public Context e;
    public IAMapDelegate f;
    public Marker g;
    public float h;
    public float[] i = new float[3];
    public float[] j = new float[3];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f32221k = new float[3];
    public float[] l = new float[9];
    public boolean m = true;
    public int n = 0;

    public r5s(Context context, IAMapDelegate iAMapDelegate) {
        this.e = context.getApplicationContext();
        this.f = iAMapDelegate;
        try {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            this.f32219a = sensorManager;
            if (sensorManager != null && j()) {
                this.f32220b = this.f32219a.getDefaultSensor(3);
            } else {
                this.c = this.f32219a.getDefaultSensor(1);
                this.d = this.f32219a.getDefaultSensor(2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final float a(float f) {
        return g(f);
    }

    public final float b(float[] fArr, float[] fArr2) {
        if (!SensorManager.getRotationMatrix(this.l, null, fArr, fArr2)) {
            return 0.0f;
        }
        SensorManager.getOrientation(this.l, this.f32221k);
        float[] fArr3 = this.f32221k;
        fArr3[0] = (float) Math.toDegrees(fArr3[0]);
        return this.f32221k[0];
    }

    public final void c() {
        Sensor sensor;
        Sensor sensor2;
        SensorManager sensorManager = this.f32219a;
        if (sensorManager != null && (sensor2 = this.f32220b) != null) {
            sensorManager.registerListener(this, sensor2, 2);
        }
        SensorManager sensorManager2 = this.f32219a;
        if (sensorManager2 == null || (sensor = this.c) == null || this.d == null) {
            return;
        }
        sensorManager2.registerListener(this, sensor, 2);
        this.f32219a.registerListener(this, this.d, 2);
    }

    public final void d(int i) {
        this.n = i;
    }

    public final void e(Marker marker) {
        this.g = marker;
    }

    public final void f(boolean z) {
        this.m = z;
    }

    public final float g(float f) {
        float fK = (f + k()) % 360.0f;
        if (fK > 180.0f) {
            fK -= 360.0f;
        } else if (fK < -180.0f) {
            fK += 360.0f;
        }
        if (Float.isNaN(fK)) {
            return 0.0f;
        }
        return fK;
    }

    public final void h() {
        Sensor sensor;
        Sensor sensor2;
        SensorManager sensorManager = this.f32219a;
        if (sensorManager != null && (sensor2 = this.f32220b) != null) {
            sensorManager.unregisterListener(this, sensor2);
        }
        SensorManager sensorManager2 = this.f32219a;
        if (sensorManager2 == null || (sensor = this.c) == null || this.d == null) {
            return;
        }
        sensorManager2.unregisterListener(this, sensor);
        this.f32219a.unregisterListener(this, this.d);
    }

    public final void i(float f) {
        Marker marker = this.g;
        if (marker != null) {
            try {
                if (!this.m) {
                    marker.setRotateAngle(360.0f - f);
                } else {
                    this.f.moveCamera(a7s.q(f));
                    this.g.setRotateAngle(-f);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final boolean j() {
        SensorManager sensorManager = this.f32219a;
        if (sensorManager == null) {
            return false;
        }
        for (Sensor sensor : sensorManager.getSensorList(-1)) {
            int type = sensor.getType();
            sensor.getStringType();
            if (type == 3) {
                return true;
            }
        }
        return false;
    }

    public final int k() {
        try {
            int i = this.n;
            if (i == 1) {
                return 90;
            }
            if (i != 2) {
                return i != 3 ? 0 : -90;
            }
            return 180;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        try {
            if (this.f.getGLMapEngine() == null || this.f.getGLMapEngine().getAnimateionsCount() <= 0) {
                int type = sensorEvent.sensor.getType();
                if (type == 3) {
                    float f = sensorEvent.values[0];
                    float fA = a(f);
                    if (Math.abs(this.h - f) < 3.0f) {
                        return;
                    }
                    this.h = fA;
                    i(fA);
                    return;
                }
                if (type == 1) {
                    this.i = (float[]) sensorEvent.values.clone();
                } else if (type == 2) {
                    this.j = (float[]) sensorEvent.values.clone();
                }
                float fB = b(this.i, this.j);
                if (Math.abs(this.h - fB) < 3.0f) {
                    return;
                }
                this.h = fB;
                i(fB);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
