package ab;

import android.opengl.Matrix;
import fa.v;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f2426a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f2427b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v<float[]> f2428c = new v<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2429d;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f14 = fArr2[10];
        float f15 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f15 * f15) + (f14 * f14));
        float f16 = fArr2[10] / fSqrt;
        fArr[0] = f16;
        float f17 = fArr2[8];
        fArr[2] = f17 / fSqrt;
        fArr[8] = (-f17) / fSqrt;
        fArr[10] = f16;
    }
}
