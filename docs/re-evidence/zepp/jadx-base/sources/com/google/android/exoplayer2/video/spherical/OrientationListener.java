package com.google.android.exoplayer2.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import androidx.annotation.BinderThread;

/* JADX INFO: loaded from: classes3.dex */
final class OrientationListener implements SensorEventListener {
    private final float[] a = new float[16];
    private final float[] b = new float[16];
    private final float[] c = new float[16];
    private final float[] d = new float[3];
    private final Display e;
    private final Listener[] f;
    private boolean g;

    public interface Listener {
        void onOrientationChange(float[] deviceOrientationMatrix, float deviceRoll);
    }

    public OrientationListener(Display display, Listener... listeners) {
        this.e = display;
        this.f = listeners;
    }

    private float a(float[] matrix) {
        SensorManager.remapCoordinateSystem(matrix, 1, 131, this.b);
        SensorManager.getOrientation(this.b, this.d);
        return this.d[2];
    }

    private void b(float[] deviceOrientationMatrix, float roll) {
        for (Listener listener : this.f) {
            listener.onOrientationChange(deviceOrientationMatrix, roll);
        }
    }

    private void c(float[] matrix) {
        if (!this.g) {
            a.a(this.c, matrix);
            this.g = true;
        }
        float[] fArr = this.b;
        System.arraycopy(matrix, 0, fArr, 0, fArr.length);
        Matrix.multiplyMM(matrix, 0, this.b, 0, this.c, 0);
    }

    private void d(float[] matrix, int rotation) {
        if (rotation != 0) {
            int i = 130;
            int i2 = 129;
            if (rotation == 1) {
                i = 2;
            } else if (rotation == 2) {
                i = 129;
                i2 = 130;
            } else {
                if (rotation != 3) {
                    throw new IllegalStateException();
                }
                i2 = 1;
            }
            float[] fArr = this.b;
            System.arraycopy(matrix, 0, fArr, 0, fArr.length);
            SensorManager.remapCoordinateSystem(this.b, i, i2, matrix);
        }
    }

    private static void e(float[] matrix) {
        Matrix.rotateM(matrix, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    @Override // android.hardware.SensorEventListener
    @BinderThread
    public void onSensorChanged(SensorEvent event) {
        SensorManager.getRotationMatrixFromVector(this.a, event.values);
        d(this.a, this.e.getRotation());
        float fA = a(this.a);
        e(this.a);
        c(this.a);
        b(this.a, fA);
    }
}
