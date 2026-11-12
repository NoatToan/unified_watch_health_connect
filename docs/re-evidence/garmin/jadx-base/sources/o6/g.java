package o6;

/* JADX INFO: loaded from: classes.dex */
public class g extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double[] f129487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double[][] f129488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f129489c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double[] f129490d;

    public g(double[] dArr, double[][] dArr2) {
        int length = dArr2[0].length;
        this.f129490d = new double[length];
        this.f129487a = dArr;
        this.f129488b = dArr2;
        if (length <= 2) {
            return;
        }
        double d14 = 0.0d;
        int i14 = 0;
        while (true) {
            double d15 = d14;
            if (i14 >= dArr.length) {
                return;
            }
            double d16 = dArr2[i14][0];
            if (i14 > 0) {
                Math.hypot(d16 - d14, d16 - d15);
            }
            i14++;
            d14 = d16;
        }
    }

    @Override // o6.b
    public final double b(double d14) {
        double[] dArr = this.f129487a;
        int length = dArr.length;
        boolean z14 = this.f129489c;
        double[][] dArr2 = this.f129488b;
        if (z14) {
            double d15 = dArr[0];
            if (d14 <= d15) {
                return (g(d15) * (d14 - d15)) + dArr2[0][0];
            }
            int i14 = length - 1;
            double d16 = dArr[i14];
            if (d14 >= d16) {
                return (g(d16) * (d14 - d16)) + dArr2[i14][0];
            }
        } else {
            if (d14 <= dArr[0]) {
                return dArr2[0][0];
            }
            int i15 = length - 1;
            if (d14 >= dArr[i15]) {
                return dArr2[i15][0];
            }
        }
        int i16 = 0;
        while (i16 < length - 1) {
            double d17 = dArr[i16];
            if (d14 == d17) {
                return dArr2[i16][0];
            }
            int i17 = i16 + 1;
            double d18 = dArr[i17];
            if (d14 < d18) {
                double d19 = (d14 - d17) / (d18 - d17);
                return (dArr2[i17][0] * d19) + ((1.0d - d19) * dArr2[i16][0]);
            }
            i16 = i17;
        }
        return 0.0d;
    }

    @Override // o6.b
    public final void c(double d14, double[] dArr) {
        double[] dArr2 = this.f129487a;
        int length = dArr2.length;
        double[][] dArr3 = this.f129488b;
        int i14 = 0;
        int length2 = dArr3[0].length;
        if (this.f129489c) {
            double d15 = dArr2[0];
            double[] dArr4 = this.f129490d;
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
                double d19 = (d14 - d18) / (d17 - d18);
                while (i14 < length2) {
                    dArr[i14] = (dArr3[i25][i14] * d19) + ((1.0d - d19) * dArr3[i19][i14]);
                    i14++;
                }
                return;
            }
            i19 = i25;
        }
    }

    @Override // o6.b
    public final void d(double d14, float[] fArr) {
        double[] dArr = this.f129487a;
        int length = dArr.length;
        double[][] dArr2 = this.f129488b;
        int i14 = 0;
        int length2 = dArr2[0].length;
        if (this.f129489c) {
            double d15 = dArr[0];
            double[] dArr3 = this.f129490d;
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
                double d19 = (d14 - d18) / (d17 - d18);
                while (i14 < length2) {
                    fArr[i14] = (float) ((dArr2[i25][i14] * d19) + ((1.0d - d19) * dArr2[i19][i14]));
                    i14++;
                }
                return;
            }
            i19 = i25;
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000f A[PHI: r5
      0x000f: PHI (r5v6 double) = (r5v0 double), (r5v2 double) binds: [B:3:0x000d, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o6.b
    public final void e(double d14, double[] dArr) {
        double[] dArr2 = this.f129487a;
        int length = dArr2.length;
        double[][] dArr3 = this.f129488b;
        int length2 = dArr3[0].length;
        double d15 = dArr2[0];
        if (d14 <= d15) {
            d14 = d15;
        } else {
            d15 = dArr2[length - 1];
            if (d14 >= d15) {
                d14 = d15;
            }
        }
        int i14 = 0;
        while (i14 < length - 1) {
            int i15 = i14 + 1;
            double d16 = dArr2[i15];
            if (d14 <= d16) {
                double d17 = d16 - dArr2[i14];
                for (int i16 = 0; i16 < length2; i16++) {
                    dArr[i16] = (dArr3[i15][i16] - dArr3[i14][i16]) / d17;
                }
                return;
            }
            i14 = i15;
        }
    }

    @Override // o6.b
    public final double[] f() {
        return this.f129487a;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a A[PHI: r3
      0x000a: PHI (r3v6 double) = (r3v0 double), (r3v2 double) binds: [B:3:0x0008, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    public final double g(double d14) {
        double[] dArr = this.f129487a;
        int length = dArr.length;
        double d15 = dArr[0];
        if (d14 < d15) {
            d14 = d15;
        } else {
            d15 = dArr[length - 1];
            if (d14 >= d15) {
                d14 = d15;
            }
        }
        int i14 = 0;
        while (i14 < length - 1) {
            int i15 = i14 + 1;
            double d16 = dArr[i15];
            if (d14 <= d16) {
                double d17 = d16 - dArr[i14];
                double[][] dArr2 = this.f129488b;
                return (dArr2[i15][0] - dArr2[i14][0]) / d17;
            }
            i14 = i15;
        }
        return 0.0d;
    }
}
