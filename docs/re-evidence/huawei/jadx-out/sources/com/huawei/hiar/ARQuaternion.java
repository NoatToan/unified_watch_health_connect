package com.huawei.hiar;

import java.lang.reflect.Array;
import java.util.Locale;

/* JADX INFO: loaded from: classes33.dex */
class ARQuaternion {
    private static final int ARRAY_LENGTH = 4;
    private static final float FROM_MATRIX_VALUE = 0.5f;
    public static final ARQuaternion IDENTITY = new ARQuaternion();
    private static final int INDEX_W = 3;
    private static final int INDEX_X = 0;
    private static final int INDEX_Y = 1;
    private static final int INDEX_Z = 2;
    private static final int OFFSET_0 = 0;
    private static final int OFFSET_1 = 1;
    private static final int OFFSET_2 = 2;
    private static final double THETA_PRECISION = 0.001d;
    private static final float TO_MATRIX_VALUE = 2.0f;
    private static final int VECTOR_SIZE = 3;
    private float axisX = 0.0f;
    private float axisY = 0.0f;
    private float axisZ = 0.0f;
    private float axisW = 1.0f;

    public float[] zAxis() {
        return transformedAxis(2, 1.0f);
    }

    @Deprecated
    public float z() {
        return this.axisZ;
    }

    public float[] yAxis() {
        return transformedAxis(1, 1.0f);
    }

    @Deprecated
    public float y() {
        return this.axisY;
    }

    public float[] xAxis() {
        return transformedAxis(0, 1.0f);
    }

    @Deprecated
    public float x() {
        return this.axisX;
    }

    @Deprecated
    public float w() {
        return this.axisW;
    }

    public float[] transformedAxis(int i, float f) {
        float[] fArr = new float[3];
        getTransformedAxis(i, f, fArr, 0);
        return fArr;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "[x:%.3f, y:%.3f, z:%.3f, w:%.3f]", Float.valueOf(this.axisX), Float.valueOf(this.axisY), Float.valueOf(this.axisZ), Float.valueOf(this.axisW));
    }

    public void toMatrix(float[] fArr, int i, int i2) {
        if (fArr == null || i < 0 || fArr.length < i + 16) {
            throw new IllegalArgumentException();
        }
        float f = this.axisX;
        float f2 = this.axisY;
        float f3 = this.axisZ;
        float f4 = this.axisW;
        float f5 = (f * f) + (f2 * f2) + (f3 * f3) + (f4 * f4);
        float f6 = f5 > 0.0f ? 2.0f / f5 : 0.0f;
        float f7 = f2 * f6;
        float f8 = f3 * f6;
        float f9 = f4 * f7;
        float f10 = f4 * f8;
        float f11 = f * f7;
        float f12 = f * f8;
        float f13 = f7 * f2;
        float f14 = f3 * f8;
        fArr[i] = 1.0f - (f13 + f14);
        fArr[i + i2] = f11 - f10;
        int i3 = i2 * 2;
        fArr[i + i3] = f12 + f9;
        int i4 = i + 1;
        fArr[i4] = f11 + f10;
        float f15 = f6 * f;
        float f16 = f * f15;
        fArr[i4 + i2] = 1.0f - (f14 + f16);
        float f17 = f4 * f15;
        float f18 = f2 * f8;
        fArr[i4 + i3] = f18 - f17;
        int i5 = i + 2;
        fArr[i5] = f12 - f9;
        fArr[i5 + i2] = f18 + f17;
        fArr[i5 + i3] = 1.0f - (f16 + f13);
    }

    public void setValues(float[] fArr) {
        if (fArr == null || fArr.length < 4) {
            throw new IllegalArgumentException();
        }
        setValues(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    public final void setValues(float f, float f2, float f3, float f4) {
        this.axisX = f;
        this.axisY = f2;
        this.axisZ = f3;
        this.axisW = f4;
    }

    public ARQuaternion inverse() {
        return new ARQuaternion(-this.axisX, -this.axisY, -this.axisZ, this.axisW);
    }

    public float getZ() {
        return this.axisZ;
    }

    public float getY() {
        return this.axisY;
    }

    public float getX() {
        return this.axisX;
    }

    public float getW() {
        return this.axisW;
    }

    public void getValues(float[] fArr, int i) {
        if (fArr == null || i < 0 || fArr.length < i + 4) {
            throw new IllegalArgumentException();
        }
        fArr[i] = this.axisX;
        fArr[i + 1] = this.axisY;
        fArr[i + 2] = this.axisZ;
        fArr[i + 3] = this.axisW;
    }

    public void getTransformedAxis(int i, float f, float[] fArr, int i2) {
        if (i < 0 || i > 2 || fArr == null) {
            throw new IllegalArgumentException();
        }
        if (i2 < 0 || fArr.length <= i2 + 2) {
            throw new IllegalArgumentException();
        }
        float[] fArr2 = {0.0f, 0.0f, 0.0f};
        fArr2[i] = f;
        rotateVector(this, fArr2, 0, fArr, i2);
    }

    public ARQuaternion compose(ARQuaternion aRQuaternion) {
        if (aRQuaternion == null) {
            throw new IllegalArgumentException();
        }
        ARQuaternion aRQuaternion2 = new ARQuaternion();
        multiplyQuaternions(this, aRQuaternion, aRQuaternion2);
        return aRQuaternion2;
    }

    public static void rotateVector(ARQuaternion aRQuaternion, float[] fArr, int i, float[] fArr2, int i2) {
        int i3;
        int i4;
        if (aRQuaternion == null || fArr == null || i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 < 0 || fArr.length <= (i3 = i + 2) || fArr2.length <= (i4 = i2 + 2)) {
            throw new IllegalArgumentException();
        }
        float f = fArr[i];
        float f2 = fArr[i + 1];
        float f3 = fArr[i3];
        float x = aRQuaternion.getX();
        float y = aRQuaternion.getY();
        float z = aRQuaternion.getZ();
        float w = aRQuaternion.getW();
        float f4 = ((w * f) + (y * f3)) - (z * f2);
        float f5 = ((w * f2) + (z * f)) - (x * f3);
        float f6 = ((w * f3) + (x * f2)) - (y * f);
        float f7 = -x;
        float f8 = ((f * f7) - (f2 * y)) - (f3 * z);
        float f9 = -z;
        float f10 = -y;
        fArr2[i2] = (((f4 * w) + (f8 * f7)) + (f5 * f9)) - (f6 * f10);
        fArr2[i2 + 1] = (((f5 * w) + (f8 * f10)) + (f6 * f7)) - (f4 * f9);
        fArr2[i4] = (((f6 * w) + (f8 * f9)) + (f4 * f10)) - (f5 * f7);
    }

    private void normalizeInPlace() {
        float f = this.axisX;
        float f2 = this.axisY;
        float f3 = this.axisZ;
        float f4 = this.axisW;
        float fSqrt = (float) (1.0d / Math.sqrt((((f * f) + (f2 * f2)) + (f3 * f3)) + (f4 * f4)));
        this.axisX *= fSqrt;
        this.axisY *= fSqrt;
        this.axisZ *= fSqrt;
        this.axisW *= fSqrt;
    }

    private static void multiplyQuaternions(ARQuaternion aRQuaternion, ARQuaternion aRQuaternion2, ARQuaternion aRQuaternion3) {
        float f = aRQuaternion.axisX;
        float f2 = aRQuaternion2.axisW;
        float f3 = aRQuaternion.axisY;
        float f4 = aRQuaternion2.axisZ;
        float f5 = aRQuaternion.axisZ;
        float f6 = aRQuaternion2.axisY;
        float f7 = aRQuaternion.axisW;
        aRQuaternion3.axisX = (((f * f2) + (f3 * f4)) - (f5 * f6)) + (aRQuaternion2.axisX * f7);
        float f8 = aRQuaternion.axisX;
        float f9 = -f8;
        float f10 = aRQuaternion2.axisX;
        aRQuaternion3.axisY = (f9 * f4) + (f3 * f2) + (f5 * f10) + (f6 * f7);
        float f11 = aRQuaternion2.axisY;
        float f12 = aRQuaternion.axisY;
        aRQuaternion3.axisZ = ((f8 * f11) - (f12 * f10)) + (f5 * f2) + (f4 * f7);
        aRQuaternion3.axisW = (((f9 * f10) - (f12 * f11)) - (aRQuaternion.axisZ * aRQuaternion2.axisZ)) + (f7 * f2);
    }

    public static ARQuaternion makeInterpolated(ARQuaternion aRQuaternion, ARQuaternion aRQuaternion2, float f) {
        if (aRQuaternion == null || aRQuaternion2 == null || f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException();
        }
        ARQuaternion aRQuaternion3 = new ARQuaternion(aRQuaternion2);
        float f2 = aRQuaternion.axisX;
        float f3 = aRQuaternion2.axisX;
        float f4 = aRQuaternion.axisY;
        float f5 = aRQuaternion2.axisY;
        float f6 = aRQuaternion.axisZ;
        float f7 = aRQuaternion2.axisZ;
        float f8 = aRQuaternion.axisW;
        float f9 = aRQuaternion2.axisW;
        float f10 = (f2 * f3) + (f4 * f5) + (f6 * f7) + (f8 * f9);
        if (f10 < 0.0f) {
            f10 = -f10;
            aRQuaternion3.axisX = -f3;
            aRQuaternion3.axisY = -f5;
            aRQuaternion3.axisZ = -f7;
            aRQuaternion3.axisW = -f9;
        }
        float fAcos = (float) Math.acos(f10);
        float fSqrt = (float) Math.sqrt(1.0f - (f10 * f10));
        float fSin = 1.0f - f;
        if (Math.abs(fSqrt) > THETA_PRECISION) {
            fSin = ((float) Math.sin(fSin * fAcos)) / fSqrt;
            f = ((float) Math.sin(f * fAcos)) / fSqrt;
        }
        return doQuaternionWeightedSum(aRQuaternion, fSin, aRQuaternion3, f);
    }

    public static ARQuaternion fromMatrix(float[] fArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (fArr == null || fArr.length - 1 < (i5 = (i3 = i + 2) + (i4 = i2 * 2))) {
            throw new IllegalArgumentException();
        }
        float[][] fArr2 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 3, 3);
        float[] fArr3 = fArr2[0];
        fArr3[0] = fArr[i];
        fArr3[1] = fArr[i + i2];
        fArr3[2] = fArr[i + i4];
        float[] fArr4 = fArr2[1];
        int i6 = i + 1;
        fArr4[0] = fArr[i6];
        fArr4[1] = fArr[i6 + i2];
        fArr4[2] = fArr[i6 + i4];
        float[] fArr5 = fArr2[2];
        fArr5[0] = fArr[i3];
        fArr5[1] = fArr[i3 + i2];
        float f = fArr[i5];
        fArr5[2] = f;
        return new ARQuaternion(Math.copySign(((float) Math.sqrt(Math.max(0.0f, ((fArr3[0] + 1.0f) - fArr4[1]) - f))) * 0.5f, fArr2[2][1] - fArr2[1][2]), Math.copySign(((float) Math.sqrt(Math.max(0.0f, ((1.0f - fArr2[0][0]) + fArr2[1][1]) - fArr2[2][2]))) * 0.5f, fArr2[0][2] - fArr2[2][0]), Math.copySign(((float) Math.sqrt(Math.max(0.0f, ((1.0f - fArr2[0][0]) - fArr2[1][1]) + fArr2[2][2]))) * 0.5f, fArr2[1][0] - fArr2[0][1]), ((float) Math.sqrt(Math.max(0.0f, fArr2[0][0] + 1.0f + fArr2[1][1] + fArr2[2][2]))) * 0.5f);
    }

    private static ARQuaternion doQuaternionWeightedSum(ARQuaternion aRQuaternion, float f, ARQuaternion aRQuaternion2, float f2) {
        ARQuaternion aRQuaternion3 = new ARQuaternion();
        aRQuaternion3.axisX = (aRQuaternion.axisX * f) + (aRQuaternion2.axisX * f2);
        aRQuaternion3.axisY = (aRQuaternion.axisY * f) + (aRQuaternion2.axisY * f2);
        aRQuaternion3.axisZ = (aRQuaternion.axisZ * f) + (aRQuaternion2.axisZ * f2);
        aRQuaternion3.axisW = (f * aRQuaternion.axisW) + (f2 * aRQuaternion2.axisW);
        aRQuaternion3.normalizeInPlace();
        return aRQuaternion3;
    }

    ARQuaternion(float[] fArr) {
        if (fArr == null || fArr.length < 4) {
            throw new IllegalArgumentException();
        }
        setValues(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    ARQuaternion(ARQuaternion aRQuaternion) {
        if (aRQuaternion == null) {
            throw new IllegalArgumentException();
        }
        setValues(aRQuaternion.axisX, aRQuaternion.axisY, aRQuaternion.axisZ, aRQuaternion.axisW);
    }

    ARQuaternion(float f, float f2, float f3, float f4) {
        setValues(f, f2, f3, f4);
    }

    ARQuaternion() {
        setValues(0.0f, 0.0f, 0.0f, 1.0f);
    }
}
