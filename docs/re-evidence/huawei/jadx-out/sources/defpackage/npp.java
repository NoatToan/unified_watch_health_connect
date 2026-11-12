package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public class npp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SensorEventListener f43406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SensorManager f43407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Sensor f43408c;
    private volatile boolean d;
    private float e;

    public static npp c() {
        return c.f43412c;
    }

    private npp() {
    }

    public void b() {
        SensorManager sensorManager = (SensorManager) BaseApplication.b().getSystemService("sensor");
        this.f43407b = sensorManager;
        this.f43408c = sensorManager.getDefaultSensor(11);
        this.f43406a = new b(this);
    }

    public float e() {
        return this.e;
    }

    public void d(float f) {
        this.e = f;
    }

    public void a() {
        LogUtil.a("SensorUtil", "register");
        if (this.d) {
            return;
        }
        this.d = this.f43407b.registerListener(this.f43406a, this.f43408c, 2);
    }

    public void d() {
        LogUtil.a("SensorUtil", "unRegister");
        if (this.d) {
            this.f43407b.unregisterListener(this.f43406a, this.f43408c);
            this.d = false;
        }
    }

    static class b implements SensorEventListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<npp> f43410b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float[] f43409a = new float[9];
        private float[] e = new float[3];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f43411c = 0.0f;

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        b(npp nppVar) {
            this.f43410b = new WeakReference<>(nppVar);
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 11) {
                SensorManager.getRotationMatrixFromVector(this.f43409a, sensorEvent.values);
                SensorManager.getOrientation(this.f43409a, this.e);
                this.f43411c = (((float) Math.toDegrees(this.e[0])) + 360.0f) % 360.0f;
                this.f43410b.get().d(this.f43411c);
            }
        }
    }

    static class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final npp f43412c = new npp();
    }
}
