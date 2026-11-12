package defpackage;

/* JADX INFO: loaded from: classes46.dex */
public class ytl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53862c;
    private double[] d;
    private double[] e;

    public void c(int i, double d, double d2, double d3, boolean z) {
        double d4;
        this.f53862c = i;
        double d5 = 0.0d;
        if (Math.abs(d - 0.0d) > 1.0E-5d) {
            d5 = (d2 * 2.0d) / d;
            d4 = (2.0d * d3) / d;
        } else {
            d4 = 0.0d;
        }
        double d6 = d5;
        double d7 = d4;
        double dA = a(this.f53862c, d6, d7, z);
        this.e = c(this.f53862c, d6, d7, z);
        int i2 = 0;
        while (true) {
            double[] dArr = this.e;
            if (i2 < dArr.length) {
                dArr[i2] = dArr[i2] * dA;
                i2++;
            } else {
                this.d = e(this.f53862c, d5, d4, z);
                return;
            }
        }
    }

    public void b(int i, double d, double d2, boolean z) {
        this.f53862c = i;
        double d3 = Math.abs(d - 0.0d) > 1.0E-5d ? (d2 * 2.0d) / d : 0.0d;
        double dE = e(this.f53862c, d3, z);
        this.e = b(this.f53862c, z);
        int i2 = 0;
        while (true) {
            double[] dArr = this.e;
            if (i2 < dArr.length) {
                dArr[i2] = dArr[i2] * dE;
                i2++;
            } else {
                this.d = a(this.f53862c, d3);
                return;
            }
        }
    }

    public double[] d() {
        return this.e;
    }

    public double[] c() {
        return this.d;
    }

    private double[] b(int i, boolean z) {
        if (i <= 3) {
            return new double[0];
        }
        int i2 = i + 1;
        double[] dArr = new double[i2];
        dArr[0] = 1.0d;
        double d = i;
        dArr[1] = d;
        for (int i3 = 2; i3 < (i / 2) + 1; i3++) {
            int i4 = i - i3;
            double d2 = (((double) (i4 + 1)) * dArr[i3 - 1]) / ((double) i3);
            dArr[i3] = d2;
            dArr[i4] = d2;
        }
        dArr[i - 1] = d;
        dArr[i] = 1.0d;
        if (!z) {
            for (int i5 = 1; i5 < i2; i5 += 2) {
                dArr[i5] = -dArr[i5];
            }
        }
        return dArr;
    }

    private double[] c(int i, double d, double d2, boolean z) {
        if (i <= 0) {
            return new double[0];
        }
        int i2 = i * 2;
        double[] dArr = new double[i2 + 1];
        if (z) {
            double[] dArrB = b(i, false);
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * 2;
                dArr[i4] = dArrB[i3];
                dArr[i4 + 1] = 0.0d;
            }
            dArr[i2] = dArrB[i];
            return dArr;
        }
        double dCos = Math.cos(((d2 - d) * 3.141592653589793d) / 2.0d);
        double dCos2 = Math.abs(dCos - 0.0d) > 1.0E-5d ? (Math.cos(((d2 + d) * 3.141592653589793d) / 2.0d) * (-2.0d)) / dCos : 0.0d;
        dArr[0] = 1.0d;
        dArr[1] = dCos2;
        dArr[2] = 1.0d;
        for (int i5 = 1; i5 < i; i5++) {
            int i6 = i5 * 2;
            int i7 = i6 + 2;
            dArr[i7] = dArr[i7] + dArr[i6];
            while (i6 > 1) {
                int i8 = i6 + 1;
                dArr[i8] = dArr[i8] + (dArr[i6] * dCos2) + dArr[i6 - 1];
                i6--;
            }
            double d3 = dArr[2];
            double d4 = dArr[1];
            dArr[2] = d3 + (dCos2 * d4) + 1.0d;
            dArr[1] = d4 + dCos2;
        }
        return dArr;
    }

    private double[] a(int i, double d) {
        if (i <= 2) {
            return new double[0];
        }
        int i2 = i * 2;
        double[] dArr = new double[i2];
        double d2 = 3.141592653589793d;
        double d3 = d * 3.141592653589793d;
        double dSin = Math.sin(d3);
        double dCos = Math.cos(d3);
        double d4 = 0.0d;
        int i3 = 0;
        while (i3 < i) {
            if (i > 0) {
                d4 = (((double) ((i3 * 2) + 1)) * d2) / ((double) i2);
            }
            double dSin2 = Math.sin(d4);
            double dCos2 = Math.cos(d4);
            double d5 = (dSin2 * dSin) + 1.0d;
            int i4 = i3 * 2;
            dArr[i4] = (-dCos) / d5;
            dArr[i4 + 1] = ((-dSin) * dCos2) / d5;
            i3++;
            i2 = i2;
            d2 = 3.141592653589793d;
        }
        double[] dArrB = b(dArr);
        int i5 = i + 1;
        double[] dArr2 = new double[i5];
        dArr2[0] = 1.0d;
        dArr2[1] = dArrB[0];
        dArr2[2] = dArrB[2];
        for (int i6 = 3; i6 < i5; i6++) {
            dArr2[i6] = dArrB[(i6 * 2) - 2];
        }
        return dArr2;
    }

    private double[] e(int i, double d, double d2, boolean z) {
        int i2 = i;
        if (i2 <= 2) {
            return new double[0];
        }
        double d3 = 3.141592653589793d;
        double dCos = Math.cos(((d2 + d) * 3.141592653589793d) / 2.0d);
        double d4 = ((d2 - d) * 3.141592653589793d) / 2.0d;
        double dSin = Math.sin(d4);
        double dCos2 = Math.cos(d4);
        double d5 = dSin * 2.0d * dCos2;
        int i3 = i2 * 2;
        double[] dArr = new double[i3];
        double[] dArr2 = new double[i3];
        double d6 = 0.0d;
        int i4 = 0;
        while (true) {
            if (i4 >= i2) {
                break;
            }
            if (i2 > 0) {
                d6 = (((double) ((i4 * 2) + 1)) * d3) / ((double) i3);
            }
            double dSin2 = Math.sin(d6);
            double dCos3 = Math.cos(d6);
            double d7 = (d5 * dSin2) + 1.0d;
            int i5 = i4 * 2;
            dArr[i5] = (((dCos2 * 2.0d) * dCos2) - 1.0d) / d7;
            int i6 = i5 + 1;
            dArr[i6] = (((z ? 1.0d : -1.0d) * d5) * dCos3) / d7;
            double d8 = -2.0d;
            dArr2[i5] = ((dCos * (-2.0d)) * ((dSin2 * dSin) + dCos2)) / d7;
            if (!z) {
                d8 = 2.0d;
            }
            dArr2[i6] = (((d8 * dCos) * dSin) * dCos3) / d7;
            i4++;
            i2 = i;
            dArr2 = dArr2;
            d3 = 3.141592653589793d;
        }
        double[] dArrA = a(dArr2, dArr);
        int i7 = i3 + 1;
        double[] dArr3 = new double[i7];
        dArr3[0] = 1.0d;
        dArr3[1] = dArrA[0];
        dArr3[2] = dArrA[2];
        for (int i8 = 3; i8 < i7; i8++) {
            dArr3[i8] = dArrA[(i8 * 2) - 2];
        }
        return dArr3;
    }

    private double[] b(double[] dArr) {
        if (dArr.length < 2) {
            return new double[0];
        }
        int length = dArr.length / 2;
        double[] dArr2 = new double[length * 2];
        for (int i = 0; i < length; i++) {
            for (int i2 = i; i2 > 0; i2--) {
                int i3 = i2 * 2;
                int i4 = i * 2;
                int i5 = (i2 - 1) * 2;
                int i6 = i4 + 1;
                int i7 = i5 + 1;
                dArr2[i3] = dArr2[i3] + ((dArr[i4] * dArr2[i5]) - (dArr[i6] * dArr2[i7]));
                int i8 = i3 + 1;
                dArr2[i8] = dArr2[i8] + (dArr[i4] * dArr2[i7]) + (dArr[i6] * dArr2[i5]);
            }
            int i9 = i * 2;
            dArr2[0] = dArr2[0] + dArr[i9];
            dArr2[1] = dArr2[1] + dArr[i9 + 1];
        }
        return dArr2;
    }

    private double e(int i, double d, boolean z) {
        if (i <= 2) {
            return 0.0d;
        }
        double d2 = d * 3.141592653589793d;
        double dSin = Math.sin(d2);
        double d3 = 3.141592653589793d / ((double) (i * 2));
        double dCos = 1.0d;
        for (int i2 = 0; i2 < i / 2; i2++) {
            dCos *= (Math.sin(((double) ((i2 * 2) + 1)) * d3) * dSin) + 1.0d;
        }
        double d4 = d2 / 2.0d;
        double dSin2 = z ? Math.sin(d4) : Math.cos(d4);
        if (i % 2 == 1) {
            dCos *= (z ? Math.cos(d4) : Math.sin(d4)) + dSin2;
        }
        return Math.pow(dSin2, i) / dCos;
    }

    private double a(int i, double d, double d2, boolean z) {
        double d3 = 3.141592653589793d;
        double dTan = Math.tan(((d2 - d) * 3.141592653589793d) / 2.0d);
        if (z) {
            dTan = 1.0d / dTan;
        }
        double d4 = 0.0d;
        double d5 = 1.0d;
        int i2 = 0;
        double d6 = 0.0d;
        while (i2 < i) {
            if (i != 0) {
                d6 = (((double) ((i2 * 2) + 1)) * d3) / ((double) (i * 2));
            }
            double dSin = Math.sin(d6) + dTan;
            double dCos = Math.cos(d6);
            double d7 = d5 * dSin;
            double d8 = (-d4) * dCos;
            d4 = (((d5 + d4) * (dSin - dCos)) - d7) - d8;
            i2++;
            d5 = d7 - d8;
            d3 = 3.141592653589793d;
        }
        return 1.0d / d5;
    }

    private double[] a(double[] dArr, double[] dArr2) {
        int length = dArr.length / 2;
        double[] dArr3 = new double[length * 4];
        dArr3[0] = dArr[0];
        dArr3[1] = dArr[1];
        dArr3[2] = dArr2[0];
        dArr3[3] = dArr2[1];
        for (int i = 1; i < length; i++) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            int i4 = i3 * 2;
            int i5 = (i2 - 1) * 2;
            int i6 = i5 + 1;
            dArr3[i4] = dArr3[i4] + ((dArr2[i2] * dArr3[i5]) - (dArr2[i3] * dArr3[i6]));
            int i7 = i4 + 1;
            dArr3[i7] = dArr3[i7] + (dArr2[i2] * dArr3[i6]) + (dArr2[i3] * dArr3[i5]);
            for (int i8 = i2; i8 > 1; i8--) {
                int i9 = i8 * 2;
                int i10 = (i8 - 1) * 2;
                int i11 = i10 + 1;
                int i12 = (i8 - 2) * 2;
                int i13 = i12 + 1;
                dArr3[i9] = dArr3[i9] + ((((dArr[i2] * dArr3[i10]) - (dArr[i3] * dArr3[i11])) + (dArr2[i2] * dArr3[i12])) - (dArr2[i3] * dArr3[i13]));
                int i14 = i9 + 1;
                dArr3[i14] = dArr3[i14] + (dArr[i2] * dArr3[i11]) + (dArr[i3] * dArr3[i10]) + (dArr2[i2] * dArr3[i13]) + (dArr2[i3] * dArr3[i12]);
            }
            double d = dArr3[2];
            double d2 = dArr[i2];
            double d3 = dArr3[0];
            double d4 = dArr[i3];
            double d5 = dArr3[1];
            dArr3[2] = d + ((d2 * d3) - (d4 * d5)) + dArr2[i2];
            dArr3[3] = dArr3[3] + (dArr[i2] * d5) + (dArr[i3] * d3) + dArr2[i3];
            dArr3[0] = d3 + dArr[i2];
            dArr3[1] = d5 + dArr[i3];
        }
        return dArr3;
    }
}
