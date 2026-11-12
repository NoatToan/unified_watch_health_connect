package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class q2m implements SensorEventListener {
    public static final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f31021k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f31022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f31023b;
    public float c;
    public final a d;
    public SensorManager e;
    public long f;
    public int g;
    public long h;
    public int i;

    public interface a {
        void onShake();
    }

    static {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        j = timeUnit.convert(20L, TimeUnit.MILLISECONDS);
        f31021k = timeUnit.convert(3L, TimeUnit.SECONDS);
    }

    public q2m(a aVar, int i) {
        this.d = aVar;
        this.i = i;
    }

    public final boolean a(float f) {
        return Math.abs(f) > 13.042845f;
    }

    public final void b(long j2) {
        if (this.g >= this.i * 8) {
            d();
            this.d.onShake();
        }
        if (j2 - this.h > f31021k) {
            d();
        }
    }

    public final void c(long j2) {
        this.h = j2;
        this.g++;
    }

    public final void d() {
        this.g = 0;
        this.f31022a = 0.0f;
        this.f31023b = 0.0f;
        this.c = 0.0f;
    }

    public void e(SensorManager sensorManager) {
        sk1.c(sensorManager);
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        if (defaultSensor != null) {
            this.e = sensorManager;
            this.f = -1L;
            sensorManager.registerListener(this, defaultSensor, 2);
            this.h = 0L;
            d();
        }
    }

    public void f() {
        SensorManager sensorManager = this.e;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.e = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        long j2 = sensorEvent.timestamp;
        if (j2 - this.f < j) {
            return;
        }
        float[] fArr = sensorEvent.values;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2] - 9.80665f;
        this.f = j2;
        if (a(f) && this.f31022a * f <= 0.0f) {
            c(sensorEvent.timestamp);
            this.f31022a = f;
        } else if (a(f2) && this.f31023b * f2 <= 0.0f) {
            c(sensorEvent.timestamp);
            this.f31023b = f2;
        } else if (a(f3) && this.c * f3 <= 0.0f) {
            c(sensorEvent.timestamp);
            this.c = f3;
        }
        b(sensorEvent.timestamp);
    }
}
