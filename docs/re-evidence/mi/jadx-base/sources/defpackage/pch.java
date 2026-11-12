package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class pch {
    public double[] c;
    public String d;
    public r7g e;
    public int f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f30245a = new float[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[] f30246b = new double[0];
    public double g = 6.283185307179586d;
    public boolean h = false;

    public void a(double d, float f) {
        int length = this.f30245a.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f30246b, d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f30246b = Arrays.copyOf(this.f30246b, length);
        this.f30245a = Arrays.copyOf(this.f30245a, length);
        this.c = new double[length];
        double[] dArr = this.f30246b;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f30246b[iBinarySearch] = d;
        this.f30245a[iBinarySearch] = f;
        this.h = false;
    }

    public double b(double d) {
        if (d <= 0.0d) {
            d = 1.0E-5d;
        } else if (d >= 1.0d) {
            d = 0.999999d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f30246b, d);
        if (iBinarySearch > 0 || iBinarySearch == 0) {
            return 0.0d;
        }
        int i = -iBinarySearch;
        int i2 = i - 1;
        float[] fArr = this.f30245a;
        float f = fArr[i2];
        int i3 = i - 2;
        float f2 = fArr[i3];
        double[] dArr = this.f30246b;
        double d2 = dArr[i2];
        double d3 = dArr[i3];
        double d4 = ((double) (f - f2)) / (d2 - d3);
        return (d * d4) + (((double) f2) - (d4 * d3));
    }

    public double c(double d) {
        if (d < 0.0d) {
            d = 0.0d;
        } else if (d > 1.0d) {
            d = 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f30246b, d);
        if (iBinarySearch > 0) {
            return 1.0d;
        }
        if (iBinarySearch == 0) {
            return 0.0d;
        }
        int i = -iBinarySearch;
        int i2 = i - 1;
        float[] fArr = this.f30245a;
        float f = fArr[i2];
        int i3 = i - 2;
        float f2 = fArr[i3];
        double[] dArr = this.f30246b;
        double d2 = dArr[i2];
        double d3 = dArr[i3];
        double d4 = ((double) (f - f2)) / (d2 - d3);
        return this.c[i3] + ((((double) f2) - (d4 * d3)) * (d - d3)) + ((d4 * ((d * d) - (d3 * d3))) / 2.0d);
    }

    public double d(double d, double d2, double d3) {
        double dC = d2 + c(d);
        double dB = b(d) + d3;
        switch (this.f) {
            case 1:
                return 0.0d;
            case 2:
                return dB * 4.0d * Math.signum((((dC * 4.0d) + 3.0d) % 4.0d) - 2.0d);
            case 3:
                return dB * 2.0d;
            case 4:
                return (-dB) * 2.0d;
            case 5:
                double d4 = this.g;
                return (-d4) * dB * Math.sin(d4 * dC);
            case 6:
                return dB * 4.0d * ((((dC * 4.0d) + 2.0d) % 4.0d) - 2.0d);
            case 7:
                return this.e.f(dC % 1.0d, 0);
            default:
                double d5 = this.g;
                return dB * d5 * Math.cos(d5 * dC);
        }
    }

    public double e(double d, double d2) {
        double dAbs;
        double dC = c(d) + d2;
        switch (this.f) {
            case 1:
                return Math.signum(0.5d - (dC % 1.0d));
            case 2:
                dAbs = Math.abs((((dC * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((dC * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((dC * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.g * (d2 + dC));
            case 6:
                double dAbs2 = 1.0d - Math.abs(((dC * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            case 7:
                return this.e.c(dC % 1.0d, 0);
            default:
                return Math.sin(this.g * dC);
        }
        return 1.0d - dAbs;
    }

    public void f() {
        double d = 0.0d;
        int i = 0;
        while (true) {
            float[] fArr = this.f30245a;
            if (i >= fArr.length) {
                break;
            }
            d += (double) fArr[i];
            i++;
        }
        double d2 = 0.0d;
        int i2 = 1;
        while (true) {
            float[] fArr2 = this.f30245a;
            if (i2 >= fArr2.length) {
                break;
            }
            int i3 = i2 - 1;
            float f = (fArr2[i3] + fArr2[i2]) / 2.0f;
            double[] dArr = this.f30246b;
            d2 += (dArr[i2] - dArr[i3]) * ((double) f);
            i2++;
        }
        int i4 = 0;
        while (true) {
            float[] fArr3 = this.f30245a;
            if (i4 >= fArr3.length) {
                break;
            }
            fArr3[i4] = (float) (((double) fArr3[i4]) * (d / d2));
            i4++;
        }
        this.c[0] = 0.0d;
        int i5 = 1;
        while (true) {
            float[] fArr4 = this.f30245a;
            if (i5 >= fArr4.length) {
                this.h = true;
                return;
            }
            int i6 = i5 - 1;
            float f2 = (fArr4[i6] + fArr4[i5]) / 2.0f;
            double[] dArr2 = this.f30246b;
            double d3 = dArr2[i5] - dArr2[i6];
            double[] dArr3 = this.c;
            dArr3[i5] = dArr3[i6] + (d3 * ((double) f2));
            i5++;
        }
    }

    public void g(int i, String str) {
        this.f = i;
        this.d = str;
        if (str != null) {
            this.e = r7g.i(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f30246b) + " period=" + Arrays.toString(this.f30245a);
    }
}
