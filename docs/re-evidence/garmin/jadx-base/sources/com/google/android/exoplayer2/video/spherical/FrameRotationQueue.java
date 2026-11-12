package com.google.android.exoplayer2.video.spherical;

import android.opengl.Matrix;
import com.google.android.exoplayer2.util.TimedValueQueue;

/* JADX INFO: loaded from: classes14.dex */
final class FrameRotationQueue {
    private boolean recenterMatrixComputed;
    private final float[] recenterMatrix = new float[16];
    private final float[] rotationMatrix = new float[16];
    private final TimedValueQueue<float[]> rotations = new TimedValueQueue<>();

    public static void computeRecenterMatrix(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f14 = fArr2[10];
        float f15 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f15 * f15) + (f14 * f14));
        float f16 = fArr2[10];
        fArr[0] = f16 / fSqrt;
        float f17 = fArr2[8];
        fArr[2] = f17 / fSqrt;
        fArr[8] = (-f17) / fSqrt;
        fArr[10] = f16 / fSqrt;
    }

    private static void getRotationMatrixFromAngleAxis(float[] fArr, float[] fArr2) {
        float f14 = fArr2[0];
        float f15 = -fArr2[1];
        float f16 = -fArr2[2];
        float length = Matrix.length(f14, f15, f16);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f14 / length, f15 / length, f16 / length);
        } else {
            Matrix.setIdentityM(fArr, 0);
        }
    }

    public boolean pollRotationMatrix(float[] fArr, long j8) {
        float[] fArrPollFloor = this.rotations.pollFloor(j8);
        if (fArrPollFloor == null) {
            return false;
        }
        getRotationMatrixFromAngleAxis(this.rotationMatrix, fArrPollFloor);
        if (!this.recenterMatrixComputed) {
            computeRecenterMatrix(this.recenterMatrix, this.rotationMatrix);
            this.recenterMatrixComputed = true;
        }
        Matrix.multiplyMM(fArr, 0, this.recenterMatrix, 0, this.rotationMatrix, 0);
        return true;
    }

    public void reset() {
        this.rotations.clear();
        this.recenterMatrixComputed = false;
    }

    public void setRotation(long j8, float[] fArr) {
        this.rotations.add(j8, fArr);
    }
}
