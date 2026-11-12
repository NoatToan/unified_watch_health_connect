package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.preference.PreferenceManager;
import com.mi.health.qrcode.camera.FrontLightMode;

/* JADX INFO: loaded from: classes5.dex */
public final class b71 implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f3874a = 45.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f3875b = 100.0f;
    public final Context c;
    public eh3 d;
    public Sensor e;

    public b71(Context context) {
        this.c = context;
    }

    public void a(float f) {
        this.f3875b = f;
    }

    public void b(float f) {
        this.f3874a = f;
    }

    public void c(eh3 eh3Var) {
        this.d = eh3Var;
        if (FrontLightMode.readPref(PreferenceManager.getDefaultSharedPreferences(this.c)) == FrontLightMode.AUTO) {
            SensorManager sensorManager = (SensorManager) this.c.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.e = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    public void d() {
        if (this.e != null) {
            ((SensorManager) this.c.getSystemService("sensor")).unregisterListener(this);
            this.d = null;
            this.e = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float f = sensorEvent.values[0];
        eh3 eh3Var = this.d;
        if (eh3Var != null) {
            if (f <= this.f3874a) {
                eh3Var.k(true, f);
            } else if (f >= this.f3875b) {
                eh3Var.k(false, f);
            }
        }
    }
}
