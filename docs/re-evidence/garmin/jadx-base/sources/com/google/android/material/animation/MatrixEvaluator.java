package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import j20.x;

/* JADX INFO: loaded from: classes14.dex */
public class MatrixEvaluator implements TypeEvaluator<Matrix> {
    private final float[] tempStartValues = new float[9];
    private final float[] tempEndValues = new float[9];
    private final Matrix tempMatrix = new Matrix();

    @Override // android.animation.TypeEvaluator
    public Matrix evaluate(float f14, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.tempStartValues);
        matrix2.getValues(this.tempEndValues);
        for (int i14 = 0; i14 < 9; i14++) {
            float[] fArr = this.tempEndValues;
            float f15 = fArr[i14];
            float f16 = this.tempStartValues[i14];
            fArr[i14] = x.a(f15, f16, f14, f16);
        }
        this.tempMatrix.setValues(this.tempEndValues);
        return this.tempMatrix;
    }
}
