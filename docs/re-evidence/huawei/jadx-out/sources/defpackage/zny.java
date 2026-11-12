package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicInteger;
import lib.android.paypal.com.magnessdk.log.a;
import lib.android.paypal.com.magnessdk.network.base.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
class zny extends c implements SensorEventListener {
    private static AtomicInteger d = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SensorManager f54371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Sensor f54372c;
    private JSONObject e;
    private int f;
    private JSONArray g;
    private long h = 0;
    private JSONArray i;
    private Handler j;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.j == null) {
            return;
        }
        d();
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.h <= 25 || this.g.length() >= 150) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(String.valueOf(sensorEvent.values[0]));
        jSONArray.put(String.valueOf(sensorEvent.values[1]));
        jSONArray.put(String.valueOf(sensorEvent.values[2]));
        jSONArray.put(jCurrentTimeMillis);
        this.g.put(jSONArray);
        this.h = jCurrentTimeMillis;
    }

    public JSONObject e() {
        if (this.f54372c == null) {
            return new JSONObject();
        }
        b(this.f54371b);
        h();
        return this.e;
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.c
    public void d() {
        e(this.f54371b);
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.c
    public void c() {
        this.e = new JSONObject();
        this.g = new JSONArray();
        this.i = new JSONArray();
        b();
    }

    private void h() {
        try {
            this.e.put(lib.android.paypal.com.magnessdk.c.a.SENSOR_PAYLOAD.toString(), this.g);
            this.i.put(this.e);
        } catch (JSONException e) {
            a.e(getClass(), 3, e);
        }
    }

    private void b(SensorManager sensorManager) {
        sensorManager.unregisterListener(this, this.f54372c);
        AtomicInteger atomicInteger = d;
        if (atomicInteger == null || atomicInteger.get() <= 0) {
            return;
        }
        d.getAndDecrement();
    }

    private void e(SensorManager sensorManager) {
        d(sensorManager);
    }

    private void d(SensorManager sensorManager) {
        AtomicInteger atomicInteger;
        try {
            if (this.f54372c == null || (atomicInteger = d) == null || atomicInteger.get() >= 120) {
                return;
            }
            sensorManager.registerListener(this, this.f54372c, 50000, this.j);
            d.getAndIncrement();
            JSONObject jSONObjectB = znp.b(this.e, znp.c(this.f54372c));
            this.e = jSONObjectB;
            if (this.f == 1) {
                jSONObjectB.put(lib.android.paypal.com.magnessdk.c.a.SENSOR_TYPE.toString(), lib.android.paypal.com.magnessdk.c.l.AC.toString());
            }
            if (this.f == 4) {
                this.e.put(lib.android.paypal.com.magnessdk.c.a.SENSOR_TYPE.toString(), lib.android.paypal.com.magnessdk.c.l.GY.toString());
            }
            if (this.f == 2) {
                this.e.put(lib.android.paypal.com.magnessdk.c.a.SENSOR_TYPE.toString(), lib.android.paypal.com.magnessdk.c.l.MG.toString());
            }
        } catch (JSONException e) {
            a.e(getClass(), 3, e);
        }
    }

    zny(Context context, Handler handler, int i) {
        this.j = handler;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f54371b = sensorManager;
        this.f = i;
        this.f54372c = sensorManager.getDefaultSensor(i);
    }
}
