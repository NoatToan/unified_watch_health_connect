package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes11.dex */
public class mws implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Sensor f42583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile SensorManager f42584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f42585c;
    private volatile int d;
    private final AtomicLong e;
    private volatile int f;
    private volatile int g;
    private final float h;
    private final float j;

    static class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final mws f42586c = new mws();
    }

    private int c(int i) {
        if (i < -100) {
            return -100;
        }
        if (i > 100) {
            return 100;
        }
        return i;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    private mws() {
        this.d = 0;
        this.g = 0;
        this.f = 0;
        this.f42585c = 0.5555556f;
        this.j = 1.1111112f;
        this.h = 0.5555556f;
        this.e = new AtomicLong(0L);
    }

    public static mws a() {
        return c.f42586c;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent == null || sensorEvent.values == null) {
            LogUtil.j("SensorTool", "Invalid sensor event or values");
            return;
        }
        if (sensorEvent.sensor.getType() != 11) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.e.compareAndSet(0L, jCurrentTimeMillis)) {
            long j = this.e.get();
            if (jCurrentTimeMillis - j < 4500 || !this.e.compareAndSet(j, jCurrentTimeMillis)) {
                return;
            }
        }
        float[] fArr = new float[9];
        float[] fArr2 = new float[3];
        SensorManager.getRotationMatrixFromVector(fArr, sensorEvent.values);
        SensorManager.getOrientation(fArr, fArr2);
        int degrees = (int) (Math.toDegrees(fArr2[1]) * 1.1111111640930176d);
        int degrees2 = (int) (Math.toDegrees(fArr2[2]) * 0.5555555820465088d);
        int degrees3 = (int) (Math.toDegrees(fArr2[0]) * 0.5555555820465088d);
        this.d = c(degrees);
        this.g = c(degrees2);
        this.f = c(degrees3);
    }

    public void e() {
        LogUtil.a("SensorTool", "querySensorData enter");
        if (this.f42584b != null) {
            LogUtil.j("SensorTool", "Sensor already registered or manager not null, stopping previous.");
            j();
        }
        this.e.set(0L);
        try {
            this.f42584b = (SensorManager) BaseApplication.b().getSystemService("sensor");
            if (this.f42584b == null) {
                LogUtil.e("SensorTool", "SensorManager is null");
                return;
            }
            this.f42583a = this.f42584b.getDefaultSensor(11);
            if (this.f42583a == null) {
                LogUtil.e("SensorTool", "Rotation sensor is not available");
            } else {
                if (this.f42584b.registerListener(this, this.f42583a, 2)) {
                    return;
                }
                LogUtil.e("SensorTool", "Failed to register sensor listener");
                f();
            }
        } catch (Exception e) {
            LogUtil.e("SensorTool", "Error in querySensorData: " + e.getMessage());
            f();
        }
    }

    public void j() {
        LogUtil.a("SensorTool", "stopSensorData enter");
        if (this.f42584b != null && this.f42583a != null) {
            this.f42584b.unregisterListener(this, this.f42583a);
        }
        f();
    }

    private void f() {
        this.f42584b = null;
        this.f42583a = null;
        this.d = 0;
        this.g = 0;
        this.f = 0;
    }

    public int d() {
        return this.d;
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.f;
    }
}
