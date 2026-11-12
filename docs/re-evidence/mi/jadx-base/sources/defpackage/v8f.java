package defpackage;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes5.dex */
public class v8f implements TypeEvaluator<Matrix> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f36614a = new float[9];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f36615b = new float[9];
    public final Matrix c = new Matrix();

    public Matrix a(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f36614a);
        matrix2.getValues(this.f36615b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f36615b;
            float f2 = fArr[i];
            float f3 = this.f36614a[i];
            fArr[i] = f3 + ((f2 - f3) * f);
        }
        this.c.setValues(this.f36615b);
        return this.c;
    }
}
