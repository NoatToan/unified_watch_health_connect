package defpackage;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public abstract class gep {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static float f18903k = 6.2831855f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hd5 f18904a;
    public int e;
    public String f;
    public long i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18905b = 0;
    public int[] c = new int[10];
    public float[][] d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);
    public float[] g = new float[3];
    public boolean h = false;
    public float j = Float.NaN;

    public static class a {
        public static void a(int[] iArr, float[][] fArr, int i, int i2) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = iArr2[i3 - 1];
                int i5 = i3 - 2;
                int i6 = iArr2[i5];
                if (i4 < i6) {
                    int iB = b(iArr, fArr, i4, i6);
                    iArr2[i5] = iB - 1;
                    iArr2[i3 - 1] = i4;
                    int i7 = i3 + 1;
                    iArr2[i3] = i6;
                    i3 += 2;
                    iArr2[i7] = iB + 1;
                } else {
                    i3 = i5;
                }
            }
        }

        public static int b(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            c(iArr, fArr, i4, i2);
            return i4;
        }

        public static void c(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float[] fArr2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = fArr2;
        }
    }

    public float a(float f) {
        float fAbs;
        switch (this.f18905b) {
            case 1:
                return Math.signum(f * f18903k);
            case 2:
                fAbs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f * f18903k);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f * f18903k);
        }
        return 1.0f - fAbs;
    }

    public void b(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.c;
        int i3 = this.e;
        iArr[i3] = i;
        float[] fArr = this.d[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.f18905b = Math.max(this.f18905b, i2);
        this.e++;
    }

    public void c(long j) {
        this.i = j;
    }

    public void d(String str) {
        this.f = str;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    public void e(int i) {
        int i2 = this.e;
        if (i2 == 0) {
            System.err.println("Error no points added to " + this.f);
            return;
        }
        a.a(this.c, this.d, 0, i2 - 1);
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int[] iArr = this.c;
            if (i3 >= iArr.length) {
                break;
            }
            if (iArr[i3] != iArr[i3 - 1]) {
                i4++;
            }
            i3++;
        }
        if (i4 == 0) {
            i4 = 1;
        }
        double[] dArr = new double[i4];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i4, 3);
        int i5 = 0;
        for (int i6 = 0; i6 < this.e; i6++) {
            if (i6 > 0) {
                int[] iArr2 = this.c;
                if (iArr2[i6] != iArr2[i6 - 1]) {
                    dArr[i5] = ((double) this.c[i6]) * 0.01d;
                    double[] dArr3 = dArr2[i5];
                    float[] fArr = this.d[i6];
                    dArr3[0] = fArr[0];
                    dArr3[1] = fArr[1];
                    dArr3[2] = fArr[2];
                    i5++;
                }
            } else {
                dArr[i5] = ((double) this.c[i6]) * 0.01d;
                double[] dArr4 = dArr2[i5];
                float[] fArr2 = this.d[i6];
                dArr4[0] = fArr2[0];
                dArr4[1] = fArr2[1];
                dArr4[2] = fArr2[2];
                i5++;
            }
        }
        this.f18904a = hd5.a(i, dArr, dArr2);
    }

    public String toString() {
        String str = this.f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.e; i++) {
            str = str + "[" + this.c[i] + " , " + decimalFormat.format(this.d[i]) + "] ";
        }
        return str;
    }
}
