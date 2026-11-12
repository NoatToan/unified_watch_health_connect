package defpackage;

/* JADX INFO: loaded from: classes10.dex */
public class iyy {
    public static float d(float[] fArr, float[] fArr2) {
        int length;
        if (fArr == null || (length = fArr.length) == 1) {
            return 0.0f;
        }
        float f = length;
        float fE = (float) (((double) (iyv.e(fArr) * f)) - Math.pow(iyv.b(fArr), 2.0d));
        if (fE == 0.0f) {
            return 0.0f;
        }
        return ((f * iyv.c(fArr, fArr2)) - (iyv.b(fArr) * iyv.b(fArr2))) / fE;
    }

    public static float d(float[] fArr, float[] fArr2, float f) {
        int length;
        if (fArr == null || (length = fArr.length) == 1 || length == 0) {
            return 1.0f;
        }
        float f2 = length;
        return (iyv.b(fArr2) / f2) - ((f * iyv.b(fArr)) / f2);
    }
}
