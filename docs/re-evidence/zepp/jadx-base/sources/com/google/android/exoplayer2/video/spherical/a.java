package com.google.android.exoplayer2.video.spherical;

import android.opengl.Matrix;
import com.google.android.exoplayer2.util.TimedValueQueue;

/* JADX INFO: loaded from: classes3.dex */
final class a {
    private final float[] a = new float[16];
    private final float[] b = new float[16];
    private final TimedValueQueue<float[]> c = new TimedValueQueue<>();
    private boolean d;

    public static void a(float[] recenterMatrix, float[] rotationMatrix) {
        Matrix.setIdentityM(recenterMatrix, 0);
        float fSqrt = (float) Math.sqrt((rotationMatrix[10] * rotationMatrix[10]) + (rotationMatrix[8] * rotationMatrix[8]));
        recenterMatrix[0] = rotationMatrix[10] / fSqrt;
        recenterMatrix[2] = rotationMatrix[8] / fSqrt;
        recenterMatrix[8] = (-rotationMatrix[8]) / fSqrt;
        recenterMatrix[10] = rotationMatrix[10] / fSqrt;
    }

    private static void b(float[] matrix, float[] angleAxis) {
        float f = angleAxis[0];
        float f2 = -angleAxis[1];
        float f3 = -angleAxis[2];
        float length = Matrix.length(f, f2, f3);
        if (length != 0.0f) {
            Matrix.setRotateM(matrix, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
        } else {
            Matrix.setIdentityM(matrix, 0);
        }
    }

    public boolean c(float[] matrix, long timestampUs) {
        float[] fArrPollFloor = this.c.pollFloor(timestampUs);
        if (fArrPollFloor == null) {
            return false;
        }
        b(this.b, fArrPollFloor);
        if (!this.d) {
            a(this.a, this.b);
            this.d = true;
        }
        Matrix.multiplyMM(matrix, 0, this.a, 0, this.b, 0);
        return true;
    }

    public void d() {
        this.c.clear();
        this.d = false;
    }

    public void e(long timestampUs, float[] angleAxis) {
        this.c.add(timestampUs, angleAxis);
    }
}
