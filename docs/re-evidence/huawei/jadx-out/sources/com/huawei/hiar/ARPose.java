package com.huawei.hiar;

import java.util.Locale;

/* JADX INFO: loaded from: classes33.dex */
public class ARPose {
    public static final ARPose IDENTITY = new ARPose(new float[]{0.0f, 0.0f, 0.0f}, ARQuaternion.IDENTITY);
    private static final int INDEX_W = 3;
    private static final int INDEX_X = 0;
    private static final int INDEX_Y = 1;
    private static final int INDEX_Z = 2;
    private static final int MATRIX_OFFSET_THREE = 3;
    private static final int MATRIX_OFFSET_TWO = 2;
    private static final int MATRIX_SIZE = 4;
    private static final float PRECISION_LIMIT = 0.001f;
    private static final int ROTATION_SIZE = 4;
    private static final int TRANSLATION_SIZE = 3;
    private final ARQuaternion quaternion;
    private final float[] translation;

    public float tz() {
        return this.translation[2];
    }

    public float ty() {
        return this.translation[1];
    }

    public float tx() {
        return this.translation[0];
    }

    public float[] transformPoint(float[] fArr) {
        float[] fArr2 = new float[3];
        transformPoint(fArr, 0, fArr2, 0);
        return fArr2;
    }

    public void transformPoint(float[] fArr, int i, float[] fArr2, int i2) {
        rotateVector(fArr, i, fArr2, i2);
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = i3 + i2;
            fArr2[i4] = fArr2[i4] + this.translation[i3];
        }
    }

    public String toString() {
        Locale locale = Locale.ENGLISH;
        float[] fArr = this.translation;
        return String.format(locale, "ARPose t:[x:%.3f, y:%.3f, z:%.3f], ARPose q:[x:%.2f, y:%.2f, z:%.2f, w:%.2f]", Float.valueOf(fArr[0]), Float.valueOf(fArr[1]), Float.valueOf(fArr[2]), Float.valueOf(this.quaternion.getX()), Float.valueOf(this.quaternion.getY()), Float.valueOf(this.quaternion.getZ()), Float.valueOf(this.quaternion.getW()));
    }

    public void toMatrix(float[] fArr, int i) {
        if (fArr == null || i < 0 || fArr.length < i + 16) {
            throw new IllegalArgumentException();
        }
        this.quaternion.toMatrix(fArr, i, 4);
        float[] fArr2 = this.translation;
        fArr[i + 12] = fArr2[0];
        fArr[i + 13] = fArr2[1];
        fArr[i + 14] = fArr2[2];
        fArr[i + 3] = 0.0f;
        fArr[i + 7] = 0.0f;
        fArr[i + 11] = 0.0f;
        fArr[i + 15] = 1.0f;
    }

    public void rotateVector(float[] fArr, int i, float[] fArr2, int i2) {
        if (fArr == null || fArr2 == null || i < 0) {
            throw new IllegalArgumentException();
        }
        if (fArr.length < i + 3 || i2 < 0 || fArr2.length < i2 + 3) {
            throw new IllegalArgumentException();
        }
        ARQuaternion.rotateVector(this.quaternion, fArr, i, fArr2, i2);
    }

    public float qz() {
        return this.quaternion.getZ();
    }

    public float qy() {
        return this.quaternion.getY();
    }

    public float qx() {
        return this.quaternion.getX();
    }

    public float qw() {
        return this.quaternion.getW();
    }

    public ARPose inverse() {
        float[] fArr = new float[3];
        ARQuaternion aRQuaternionInverse = this.quaternion.inverse();
        ARQuaternion.rotateVector(aRQuaternionInverse, this.translation, 0, fArr, 0);
        fArr[0] = -fArr[0];
        fArr[1] = -fArr[1];
        fArr[2] = -fArr[2];
        return new ARPose(fArr, aRQuaternionInverse);
    }

    public float[] getZAxis() {
        return getTransformedAxis(2, 1.0f);
    }

    public float[] getYAxis() {
        return getTransformedAxis(1, 1.0f);
    }

    public float[] getXAxis() {
        return getTransformedAxis(0, 1.0f);
    }

    public void getTranslation(float[] fArr, int i) {
        if (fArr == null || i < 0 || fArr.length < i + 3) {
            throw new IllegalArgumentException();
        }
        System.arraycopy(this.translation, 0, fArr, i, 3);
    }

    public float[] getTransformedAxis(int i, float f) {
        float[] fArr = new float[3];
        getTransformedAxis(i, f, fArr, 0);
        return fArr;
    }

    public void getTransformedAxis(int i, float f, float[] fArr, int i2) {
        if (i < 0 || i > 2 || fArr == null || i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (fArr.length < i2 + 3) {
            throw new IllegalArgumentException();
        }
        this.quaternion.getTransformedAxis(i, f, fArr, i2);
    }

    public void getRotationQuaternion(float[] fArr, int i) {
        if (fArr == null || i < 0 || fArr.length < i + 4) {
            throw new IllegalArgumentException();
        }
        this.quaternion.getValues(fArr, i);
    }

    ARQuaternion getQuaternion() {
        return this.quaternion;
    }

    public ARPose extractTranslation() {
        return new ARPose(this.translation, IDENTITY.quaternion);
    }

    public ARPose extractRotation() {
        return new ARPose(IDENTITY.translation, this.quaternion);
    }

    public ARPose compose(ARPose aRPose) {
        float[] fArr = new float[3];
        ARQuaternion.rotateVector(this.quaternion, aRPose.translation, 0, fArr, 0);
        float f = fArr[0];
        float[] fArr2 = this.translation;
        fArr[0] = f + fArr2[0];
        fArr[1] = fArr[1] + fArr2[1];
        fArr[2] = fArr[2] + fArr2[2];
        return new ARPose(fArr, this.quaternion.compose(aRPose.quaternion));
    }

    public static ARPose makeTranslation(float[] fArr) {
        if (fArr == null || fArr.length < 3) {
            throw new IllegalArgumentException();
        }
        return makeTranslation(fArr[0], fArr[1], fArr[2]);
    }

    public static ARPose makeTranslation(float f, float f2, float f3) {
        return new ARPose(new float[]{f, f2, f3}, IDENTITY.quaternion);
    }

    public static ARPose makeRotation(float[] fArr) {
        if (fArr == null || fArr.length < 4) {
            throw new IllegalArgumentException();
        }
        return makeRotation(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    public static ARPose makeRotation(float f, float f2, float f3, float f4) {
        return new ARPose(IDENTITY.translation, new ARQuaternion(f, f2, f3, f4));
    }

    public static ARPose makeInterpolated(ARPose aRPose, ARPose aRPose2, float f) {
        if (f > 1.0f || f < 0.0f) {
            throw new IllegalArgumentException();
        }
        if (f - 0.0f < 0.001f) {
            return aRPose;
        }
        float f2 = 1.0f - f;
        if (f2 < 0.001f) {
            return aRPose2;
        }
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = (aRPose.translation[i] * f2) + (aRPose2.translation[i] * f);
        }
        return new ARPose(fArr, ARQuaternion.makeInterpolated(aRPose.quaternion, aRPose2.quaternion, f));
    }

    public ARPose(float[] fArr, float[] fArr2) {
        if (fArr == null || fArr.length < 3 || fArr2 == null || fArr2.length < 4) {
            throw new IllegalArgumentException();
        }
        this.quaternion = new ARQuaternion(fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
        this.translation = new float[]{fArr[0], fArr[1], fArr[2]};
    }

    private ARPose(float[] fArr, ARQuaternion aRQuaternion) {
        this.translation = fArr;
        this.quaternion = aRQuaternion;
    }

    private ARPose(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.quaternion = new ARQuaternion(f4, f5, f6, f7);
        this.translation = new float[]{f, f2, f3};
    }
}
