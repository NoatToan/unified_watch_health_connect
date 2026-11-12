package ab;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import j20.x;

/* JADX INFO: loaded from: classes.dex */
public final class d implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f2430a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f2431b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f2432c = new float[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f2433d = new float[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Display f2434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a[] f2435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2436g;

    public interface a {
        void onOrientationChange(float[] fArr, float f14);
    }

    public d(Display display, a... aVarArr) {
        this.f2434e = display;
        this.f2435f = aVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i14) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i14;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f2430a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f2434e.getRotation();
        float[] fArr3 = this.f2431b;
        if (rotation != 0) {
            int i15 = 129;
            if (rotation != 1) {
                i14 = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        x.h();
                        return;
                    } else {
                        i15 = 130;
                        i14 = 1;
                    }
                }
            } else {
                i14 = 129;
                i15 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i15, i14, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f2433d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f14 = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z14 = this.f2436g;
        float[] fArr5 = this.f2432c;
        if (!z14) {
            c.a(fArr5, fArr2);
            this.f2436g = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        for (a aVar : this.f2435f) {
            aVar.onOrientationChange(fArr2, f14);
        }
    }
}
