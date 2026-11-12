package com.xiaomi.smarthome.framework.plugin.rn.nativemodule.sensor;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes2.dex */
public class CompassSensor {
    private Sensor mAccelerometerSensor;
    private OnCompassChangeListener mListener;
    private Sensor mMagneticSensorSensor;
    private SensorHelper mSensorHelper;
    private SensorEventListener mSensorListener;

    public interface OnCompassChangeListener {
        void onCompassChanged(double d);
    }

    public class SensorListener implements SensorEventListener {
        float[] accelerometerValues = new float[3];
        float[] magneticValues = new float[3];

        public SensorListener() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                this.accelerometerValues = (float[]) sensorEvent.values.clone();
            } else if (sensorEvent.sensor.getType() == 2) {
                this.magneticValues = (float[]) sensorEvent.values.clone();
            }
            float[] fArr = new float[9];
            float[] fArr2 = new float[3];
            SensorManager.getRotationMatrix(fArr, null, this.accelerometerValues, this.magneticValues);
            SensorManager.getOrientation(fArr, fArr2);
            double degrees = Math.toDegrees(fArr2[0]);
            if (CompassSensor.this.mListener != null) {
                CompassSensor.this.mListener.onCompassChanged(degrees);
            }
        }
    }

    public CompassSensor(SensorHelper sensorHelper, OnCompassChangeListener onCompassChangeListener) {
        this.mSensorHelper = sensorHelper;
        this.mListener = onCompassChangeListener;
    }

    public void registerListener(String str) {
        SensorListener sensorListener = new SensorListener();
        this.mSensorListener = sensorListener;
        this.mAccelerometerSensor = this.mSensorHelper.registerSensorEventListener(1, sensorListener, str);
        this.mMagneticSensorSensor = this.mSensorHelper.registerSensorEventListener(2, this.mSensorListener, str);
    }

    public void unRegisterListener() {
        this.mSensorHelper.unRegisterSensorEventListener(this.mAccelerometerSensor);
        this.mSensorHelper.unRegisterSensorEventListener(this.mMagneticSensorSensor);
    }
}
