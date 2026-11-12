package o6;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public class h extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double[] f129491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double[][] f129492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double[][] f129493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f129494d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double[] f129495e;

    public h(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f129495e = new double[length2];
        int i14 = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, i14, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, length2);
        for (int i15 = 0; i15 < length2; i15++) {
            int i16 = 0;
            while (i16 < i14) {
                int i17 = i16 + 1;
                double d14 = dArr[i17] - dArr[i16];
                double[] dArr5 = dArr3[i16];
                double d15 = (dArr2[i17][i15] - dArr2[i16][i15]) / d14;
                dArr5[i15] = d15;
                if (i16 == 0) {
                    dArr4[i16][i15] = d15;
                } else {
                    dArr4[i16][i15] = (dArr3[i16 - 1][i15] + d15) * 0.5d;
                }
                i16 = i17;
            }
            dArr4[i14][i15] = dArr3[length - 2][i15];
        }
        for (int i18 = 0; i18 < i14; i18++) {
            for (int i19 = 0; i19 < length2; i19++) {
                double d16 = dArr3[i18][i19];
                if (d16 == 0.0d) {
                    dArr4[i18][i19] = 0.0d;
                    dArr4[i18 + 1][i19] = 0.0d;
                } else {
                    double d17 = dArr4[i18][i19] / d16;
                    int i24 = i18 + 1;
                    double d18 = dArr4[i24][i19] / d16;
                    double dHypot = Math.hypot(d17, d18);
                    if (dHypot > 9.0d) {
                        double d19 = 3.0d / dHypot;
                        double[] dArr6 = dArr4[i18];
                        double[] dArr7 = dArr3[i18];
                        dArr6[i19] = d17 * d19 * dArr7[i19];
                        dArr4[i24][i19] = d19 * d18 * dArr7[i19];
                    }
                }
            }
        }
        this.f129491a = dArr;
        this.f129492b = dArr2;
        this.f129493c = dArr4;
    }

    public static double g(double d14, double d15, double d16, double d17, double d18, double d19) {
        double d24 = d15 * d15;
        double d25 = d15 * 6.0d;
        double d26 = 6.0d * d24 * d16;
        double d27 = (d26 + ((d25 * d17) + (((-6.0d) * d24) * d17))) - (d25 * d16);
        double d28 = 3.0d * d14;
        return (d14 * d18) + (((((d28 * d18) * d24) + (((d28 * d19) * d24) + d27)) - (((2.0d * d14) * d19) * d15)) - (((4.0d * d14) * d18) * d15));
    }

    public static double i(double d14, double d15, double d16, double d17, double d18, double d19) {
        double d24 = d15 * d15;
        double d25 = d24 * d15;
        double d26 = 3.0d * d24;
        double d27 = d25 * 2.0d * d16;
        double d28 = ((d27 + ((d26 * d17) + (((-2.0d) * d25) * d17))) - (d26 * d16)) + d16;
        double d29 = d14 * d19;
        double d34 = (d29 * d25) + d28;
        double d35 = d14 * d18;
        return (d35 * d15) + ((((d25 * d35) + d34) - (d29 * d24)) - (((d14 * 2.0d) * d18) * d24));
    }

    @Override // o6.b
    public final double b(double d14) {
        double d15;
        double d16;
        double dH;
        double[] dArr = this.f129491a;
        int length = dArr.length;
        boolean z14 = this.f129494d;
        double[][] dArr2 = this.f129492b;
        if (z14) {
            double d17 = dArr[0];
            if (d14 <= d17) {
                d15 = dArr2[0][0];
                d16 = d14 - d17;
                dH = h(d17);
            } else {
                int i14 = length - 1;
                double d18 = dArr[i14];
                if (d14 >= d18) {
                    d15 = dArr2[i14][0];
                    d16 = d14 - d18;
                    dH = h(d18);
                }
            }
            return (dH * d16) + d15;
        }
        if (d14 <= dArr[0]) {
            return dArr2[0][0];
        }
        int i15 = length - 1;
        if (d14 >= dArr[i15]) {
            return dArr2[i15][0];
        }
        int i16 = 0;
        while (i16 < length - 1) {
            double d19 = dArr[i16];
            if (d14 == d19) {
                return dArr2[i16][0];
            }
            int i17 = i16 + 1;
            double d24 = dArr[i17];
            if (d14 < d24) {
                double d25 = d24 - d19;
                double d26 = (d14 - d19) / d25;
                double d27 = dArr2[i16][0];
                double d28 = dArr2[i17][0];
                double[][] dArr3 = this.f129493c;
                return i(d25, d26, d27, d28, dArr3[i16][0], dArr3[i17][0]);
            }
            i16 = i17;
        }
        return 0.0d;
    }

    @Override // o6.b
    public final void c(double d14, double[] dArr) {
        double[] dArr2 = this.f129491a;
        int length = dArr2.length;
        double[][] dArr3 = this.f129492b;
        int i14 = 0;
        int length2 = dArr3[0].length;
        if (this.f129494d) {
            double d15 = dArr2[0];
            double[] dArr4 = this.f129495e;
            if (d14 <= d15) {
                e(d15, dArr4);
                for (int i15 = 0; i15 < length2; i15++) {
                    dArr[i15] = ((d14 - dArr2[0]) * dArr4[i15]) + dArr3[0][i15];
                }
                return;
            }
            int i16 = length - 1;
            double d16 = dArr2[i16];
            if (d14 >= d16) {
                e(d16, dArr4);
                while (i14 < length2) {
                    dArr[i14] = ((d14 - dArr2[i16]) * dArr4[i14]) + dArr3[i16][i14];
                    i14++;
                }
                return;
            }
        } else {
            if (d14 <= dArr2[0]) {
                for (int i17 = 0; i17 < length2; i17++) {
                    dArr[i17] = dArr3[0][i17];
                }
                return;
            }
            int i18 = length - 1;
            if (d14 >= dArr2[i18]) {
                while (i14 < length2) {
                    dArr[i14] = dArr3[i18][i14];
                    i14++;
                }
                return;
            }
        }
        int i19 = 0;
        while (i19 < length - 1) {
            if (d14 == dArr2[i19]) {
                for (int i24 = 0; i24 < length2; i24++) {
                    dArr[i24] = dArr3[i19][i24];
                }
            }
            int i25 = i19 + 1;
            double d17 = dArr2[i25];
            if (d14 < d17) {
                double d18 = dArr2[i19];
                double d19 = d17 - d18;
                double d24 = (d14 - d18) / d19;
                while (i14 < length2) {
                    double d25 = dArr3[i19][i14];
                    double d26 = dArr3[i25][i14];
                    double[][] dArr5 = this.f129493c;
                    dArr[i14] = i(d19, d24, d25, d26, dArr5[i19][i14], dArr5[i25][i14]);
                    i14++;
                }
                return;
            }
            i19 = i25;
        }
    }

    @Override // o6.b
    public final void d(double d14, float[] fArr) {
        double[] dArr = this.f129491a;
        int length = dArr.length;
        double[][] dArr2 = this.f129492b;
        int i14 = 0;
        int length2 = dArr2[0].length;
        if (this.f129494d) {
            double d15 = dArr[0];
            double[] dArr3 = this.f129495e;
            if (d14 <= d15) {
                e(d15, dArr3);
                for (int i15 = 0; i15 < length2; i15++) {
                    fArr[i15] = (float) (((d14 - dArr[0]) * dArr3[i15]) + dArr2[0][i15]);
                }
                return;
            }
            int i16 = length - 1;
            double d16 = dArr[i16];
            if (d14 >= d16) {
                e(d16, dArr3);
                while (i14 < length2) {
                    fArr[i14] = (float) (((d14 - dArr[i16]) * dArr3[i14]) + dArr2[i16][i14]);
                    i14++;
                }
                return;
            }
        } else {
            if (d14 <= dArr[0]) {
                for (int i17 = 0; i17 < length2; i17++) {
                    fArr[i17] = (float) dArr2[0][i17];
                }
                return;
            }
            int i18 = length - 1;
            if (d14 >= dArr[i18]) {
                while (i14 < length2) {
                    fArr[i14] = (float) dArr2[i18][i14];
                    i14++;
                }
                return;
            }
        }
        int i19 = 0;
        while (i19 < length - 1) {
            if (d14 == dArr[i19]) {
                for (int i24 = 0; i24 < length2; i24++) {
                    fArr[i24] = (float) dArr2[i19][i24];
                }
            }
            int i25 = i19 + 1;
            double d17 = dArr[i25];
            if (d14 < d17) {
                double d18 = dArr[i19];
                double d19 = d17 - d18;
                double d24 = (d14 - d18) / d19;
                while (i14 < length2) {
                    double d25 = dArr2[i19][i14];
                    double d26 = dArr2[i25][i14];
                    double[][] dArr4 = this.f129493c;
                    fArr[i14] = (float) i(d19, d24, d25, d26, dArr4[i19][i14], dArr4[i25][i14]);
                    i14++;
                }
                return;
            }
            i19 = i25;
        }
    }

    @Override // o6.b
    public final void e(double d14, double[] dArr) {
        double[] dArr2 = this.f129491a;
        int length = dArr2.length;
        double[][] dArr3 = this.f129492b;
        int length2 = dArr3[0].length;
        double d15 = dArr2[0];
        if (d14 > d15) {
            d15 = dArr2[length - 1];
            if (d14 < d15) {
                d15 = d14;
            }
        }
        int i14 = 0;
        while (i14 < length - 1) {
            int i15 = i14 + 1;
            double d16 = dArr2[i15];
            if (d15 <= d16) {
                double d17 = dArr2[i14];
                double d18 = d16 - d17;
                double d19 = (d15 - d17) / d18;
                for (int i16 = 0; i16 < length2; i16++) {
                    double d24 = dArr3[i14][i16];
                    double d25 = dArr3[i15][i16];
                    double[][] dArr4 = this.f129493c;
                    dArr[i16] = g(d18, d19, d24, d25, dArr4[i14][i16], dArr4[i15][i16]) / d18;
                }
                return;
            }
            i14 = i15;
        }
    }

    @Override // o6.b
    public final double[] f() {
        return this.f129491a;
    }

    public final double h(double d14) {
        double[] dArr = this.f129491a;
        int length = dArr.length;
        double d15 = dArr[0];
        if (d14 >= d15) {
            d15 = dArr[length - 1];
            if (d14 < d15) {
                d15 = d14;
            }
        }
        int i14 = 0;
        while (i14 < length - 1) {
            int i15 = i14 + 1;
            double d16 = dArr[i15];
            if (d15 <= d16) {
                double d17 = dArr[i14];
                double d18 = d16 - d17;
                double d19 = (d15 - d17) / d18;
                double[][] dArr2 = this.f129492b;
                double d24 = dArr2[i14][0];
                double d25 = dArr2[i15][0];
                double[][] dArr3 = this.f129493c;
                return g(d18, d19, d24, d25, dArr3[i14][0], dArr3[i15][0]) / d18;
            }
            i14 = i15;
        }
        return 0.0d;
    }
}
