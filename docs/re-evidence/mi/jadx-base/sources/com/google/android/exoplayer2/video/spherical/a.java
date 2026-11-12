package com.google.android.exoplayer2.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import defpackage.joa;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f8468a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f8469b = new float[16];
    public final float[] c = new float[16];
    public final float[] d = new float[3];
    public final Display e;
    public final InterfaceC0208a[] f;
    public boolean g;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.spherical.a$a, reason: collision with other inner class name */
    public interface InterfaceC0208a {
        void a(float[] fArr, float f);
    }

    public a(Display display, InterfaceC0208a... interfaceC0208aArr) {
        this.e = display;
        this.f = interfaceC0208aArr;
    }

    public static void e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    public final float a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f8469b);
        SensorManager.getOrientation(this.f8469b, this.d);
        return this.d[2];
    }

    public final void b(float[] fArr, float f) {
        for (InterfaceC0208a interfaceC0208a : this.f) {
            interfaceC0208a.a(fArr, f);
        }
    }

    public final void c(float[] fArr) {
        if (!this.g) {
            joa.a(this.c, fArr);
            this.g = true;
        }
        float[] fArr2 = this.f8469b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f8469b, 0, this.c, 0);
    }

    public final void d(float[] fArr, int i) {
        if (i != 0) {
            int i2 = 129;
            int i3 = 1;
            if (i == 1) {
                i3 = 129;
                i2 = 2;
            } else if (i == 2) {
                i3 = 130;
            } else {
                if (i != 3) {
                    throw new IllegalStateException();
                }
                i2 = 130;
            }
            float[] fArr2 = this.f8469b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f8469b, i2, i3, fArr);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f8468a, sensorEvent.values);
        d(this.f8468a, this.e.getRotation());
        float fA = a(this.f8468a);
        e(this.f8468a);
        c(this.f8468a);
        b(this.f8468a, fA);
    }
}
