package com.xiaomi.smarthome.framework.plugin.rn.nativemodule.sensor;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnPluginLog;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class SensorHelper {
    public static final String INTERVAL_GAME = "game";
    public static final String INTERVAL_NORMAL = "normal";
    public static final String INTERVAL_UI = "ui";
    private static final String TAG = "SensorHelper";
    private Map<Sensor, SensorEventListener> mListeners = new ConcurrentHashMap();
    private SensorManager mSensorManager;

    public SensorHelper(Context context) {
        this.mSensorManager = (SensorManager) context.getSystemService("sensor");
    }

    public int convertInterval(String str) {
        str.hashCode();
        switch (str) {
            case "normal":
                return 3;
            case "ui":
                return 2;
            case "game":
                return 1;
            default:
                RnPluginLog.e(TAG, "convertInterval,Illegal parameter:" + str);
                return 3;
        }
    }

    public Sensor registerSensorEventListener(int i, SensorEventListener sensorEventListener, String str) {
        return registerSensorEventListener(this.mSensorManager.getDefaultSensor(i), sensorEventListener, convertInterval(str));
    }

    public void release() {
        Iterator<SensorEventListener> it = this.mListeners.values().iterator();
        while (it.hasNext()) {
            this.mSensorManager.unregisterListener(it.next());
        }
        this.mListeners.clear();
    }

    public void unRegisterSensorEventListener(Sensor sensor) {
        if (sensor == null || !this.mListeners.containsKey(sensor)) {
            return;
        }
        this.mSensorManager.unregisterListener(this.mListeners.get(sensor));
    }

    private Sensor registerSensorEventListener(Sensor sensor, SensorEventListener sensorEventListener, int i) {
        if (sensor != null) {
            this.mSensorManager.registerListener(sensorEventListener, sensor, i);
            this.mListeners.put(sensor, sensorEventListener);
        }
        return sensor;
    }
}
