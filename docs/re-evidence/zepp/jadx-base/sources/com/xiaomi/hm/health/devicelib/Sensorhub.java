package com.xiaomi.hm.health.devicelib;

import android.content.ContentProviderClient;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.util.Log;

/* JADX INFO: loaded from: classes21.dex */
public class Sensorhub {
    private static final String d = "Sensorhub";
    private static final String e = "support_steps_provider";
    private static final String f = "com.miui.providers.steps";
    private static final Uri g = Uri.parse("content://com.miui.providers.steps/item");
    private SensorManager a;
    private final b b = new b();
    private final a c = new a();

    public class a implements SensorEventListener {
        public a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr = sensorEvent.values;
            Log.i(Sensorhub.d, "x:" + fArr[0] + ",y:" + fArr[1] + ",z:" + fArr[2]);
        }
    }

    public class b implements SensorEventListener {
        public b() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            Log.i(Sensorhub.d, "Step:" + String.valueOf(sensorEvent.values[0]));
        }
    }

    private static boolean a(Context context, String str) {
        try {
            Class<?> cls = Class.forName("miui.util.FeatureParser");
            return ((Boolean) cls.getMethod("getBoolean", String.class, Boolean.TYPE).invoke(cls, str, Boolean.FALSE)).booleanValue();
        } catch (IllegalArgumentException e2) {
            Log.i(d, "iAE:" + e2.getMessage());
            return false;
        } catch (Exception e3) {
            Log.i(d, "exception:" + e3.getMessage());
            return false;
        }
    }

    private static boolean b(Context context, Uri uri) {
        if (context == null || uri == null) {
            throw new IllegalArgumentException();
        }
        try {
            ContentProviderClient contentProviderClientAcquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(uri);
            boolean z = contentProviderClientAcquireContentProviderClient != null;
            if (contentProviderClientAcquireContentProviderClient != null) {
                contentProviderClientAcquireContentProviderClient.release();
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isSupportSensorHub(Context context) {
        if (a(context, e)) {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            return (sensorManager != null ? sensorManager.getDefaultSensor(18) : null) != null && b(context, g);
        }
        Log.i(d, "not support miui sensorhub!!!");
        return false;
    }

    public void disableSensor() {
        Log.i(d, "disableSensor");
        SensorManager sensorManager = this.a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.b);
            this.a.unregisterListener(this.c);
        }
    }

    public boolean enableSensor(Context context) {
        Log.i(d, "enableSensor");
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.a = sensorManager;
        if (sensorManager == null) {
            Log.i(d, "SensorManager is null!!!");
            return false;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(18);
        if (defaultSensor != null) {
            this.a.registerListener(this.b, defaultSensor, 2);
        } else {
            Log.i(d, "TYPE_STEP_DETECTOR is null!!!");
        }
        Sensor defaultSensor2 = this.a.getDefaultSensor(1);
        if (defaultSensor2 != null) {
            this.a.registerListener(this.c, defaultSensor2, 2);
        } else {
            Log.i(d, "TYPE_ACCELEROMETER is nulll!!!");
        }
        return true;
    }
}
