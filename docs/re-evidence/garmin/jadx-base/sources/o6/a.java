package o6;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double[] f129436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2476a[] f129437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f129438c = true;

    /* JADX INFO: renamed from: o6.a$a, reason: collision with other inner class name */
    public static class C2476a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final double[] f129439s = new double[91];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double[] f129440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f129441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f129442c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final double f129443d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final double f129444e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final double f129445f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final double f129446g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final double f129447h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final double f129448i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final double f129449j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final double f129450k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final double f129451l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final double f129452m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final double f129453n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public double f129454o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public double f129455p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final boolean f129456q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final boolean f129457r;

        public C2476a(int i14, double d14, double d15, double d16, double d17, double d18, double d19) {
            int i15;
            int i16;
            double[] dArr;
            double d24 = d16;
            this.f129457r = false;
            double d25 = d18 - d24;
            double d26 = d19 - d17;
            if (i14 == 1) {
                this.f129456q = true;
            } else if (i14 == 4) {
                this.f129456q = d26 > 0.0d;
            } else if (i14 != 5) {
                this.f129456q = false;
            } else {
                this.f129456q = d26 < 0.0d;
            }
            this.f129442c = d14;
            this.f129443d = d15;
            double d27 = d15 - d14;
            double d28 = 1.0d / d27;
            this.f129448i = d28;
            if (3 == i14) {
                this.f129457r = true;
            }
            if (this.f129457r || Math.abs(d25) < 0.001d || Math.abs(d26) < 0.001d) {
                this.f129457r = true;
                this.f129444e = d24;
                this.f129445f = d18;
                this.f129446g = d17;
                this.f129447h = d19;
                double dHypot = Math.hypot(d26, d25);
                this.f129441b = dHypot;
                this.f129453n = dHypot * d28;
                this.f129451l = d25 / d27;
                this.f129452m = d26 / d27;
                return;
            }
            double[] dArr2 = new double[101];
            this.f129440a = dArr2;
            boolean z14 = this.f129456q;
            if (z14) {
                i16 = 1;
                i15 = -1;
            } else {
                i15 = 1;
                i16 = 1;
            }
            this.f129449j = ((double) i15) * d25;
            this.f129450k = ((double) (z14 ? i16 : -1)) * d26;
            this.f129451l = z14 ? d18 : d24;
            this.f129452m = z14 ? d17 : d19;
            double d29 = d17 - d19;
            double dHypot2 = 0.0d;
            double d34 = 0.0d;
            double d35 = 0.0d;
            int i17 = 0;
            while (true) {
                dArr = f129439s;
                if (i17 >= 91) {
                    break;
                }
                double d36 = d29;
                double radians = Math.toRadians((((double) i17) * 90.0d) / ((double) 90));
                double dSin = Math.sin(radians) * d25;
                double dCos = d36 * Math.cos(radians);
                if (i17 > 0) {
                    dHypot2 += Math.hypot(dSin - d34, dCos - d35);
                    dArr[i17] = dHypot2;
                }
                i17++;
                d35 = dCos;
                d34 = dSin;
                d29 = d36;
            }
            this.f129441b = dHypot2;
            for (int i18 = 0; i18 < 91; i18++) {
                dArr[i18] = dArr[i18] / dHypot2;
            }
            for (int i19 = 0; i19 < 101; i19++) {
                double d37 = ((double) i19) / ((double) 100);
                int iBinarySearch = Arrays.binarySearch(dArr, d37);
                if (iBinarySearch >= 0) {
                    dArr2[i19] = ((double) iBinarySearch) / ((double) 90);
                } else if (iBinarySearch == -1) {
                    dArr2[i19] = 0.0d;
                } else {
                    int i24 = -iBinarySearch;
                    int i25 = i24 - 2;
                    double d38 = dArr[i25];
                    dArr2[i19] = (((d37 - d38) / (dArr[i24 - 1] - d38)) + ((double) i25)) / ((double) 90);
                }
            }
            this.f129453n = this.f129441b * this.f129448i;
        }

        public final double a() {
            double d14 = this.f129449j * this.f129455p;
            double dHypot = this.f129453n / Math.hypot(d14, (-this.f129450k) * this.f129454o);
            return this.f129456q ? (-d14) * dHypot : d14 * dHypot;
        }

        public final double b() {
            double d14 = this.f129449j * this.f129455p;
            double d15 = (-this.f129450k) * this.f129454o;
            double dHypot = this.f129453n / Math.hypot(d14, d15);
            return this.f129456q ? (-d15) * dHypot : d15 * dHypot;
        }

        public final double c(double d14) {
            double d15 = (d14 - this.f129442c) * this.f129448i;
            double d16 = this.f129444e;
            return o2.c.b(this.f129445f, d16, d15, d16);
        }

        public final double d(double d14) {
            double d15 = (d14 - this.f129442c) * this.f129448i;
            double d16 = this.f129446g;
            return o2.c.b(this.f129447h, d16, d15, d16);
        }

        public final double e() {
            return (this.f129449j * this.f129454o) + this.f129451l;
        }

        public final double f() {
            return (this.f129450k * this.f129455p) + this.f129452m;
        }

        public final void g(double d14) {
            double d15 = (this.f129456q ? this.f129443d - d14 : d14 - this.f129442c) * this.f129448i;
            double dB = 0.0d;
            if (d15 > 0.0d) {
                dB = 1.0d;
                if (d15 < 1.0d) {
                    double[] dArr = this.f129440a;
                    double length = d15 * ((double) (dArr.length - 1));
                    int i14 = (int) length;
                    double d16 = dArr[i14];
                    dB = o2.c.b(dArr[i14 + 1], d16, length - ((double) i14), d16);
                }
            }
            double d17 = dB * 1.5707963267948966d;
            this.f129454o = Math.sin(d17);
            this.f129455p = Math.cos(d17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    public a(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f129436a = dArr;
        this.f129437b = new C2476a[dArr.length - 1];
        int i14 = 1;
        int i15 = 1;
        int i16 = 0;
        while (true) {
            C2476a[] c2476aArr = this.f129437b;
            if (i16 >= c2476aArr.length) {
                return;
            }
            int i17 = iArr[i16];
            int i18 = 3;
            if (i17 != 0) {
                if (i17 == 1) {
                    i14 = 1;
                    i18 = i14;
                } else {
                    if (i17 != 2) {
                        if (i17 != 3) {
                            i18 = 4;
                            if (i17 != 4) {
                                i18 = 5;
                                if (i17 != 5) {
                                    i18 = i15;
                                }
                            }
                        } else {
                            if (i14 != 1) {
                                i14 = 1;
                            }
                            i18 = i14;
                        }
                    }
                    i14 = 2;
                    i18 = i14;
                }
            }
            double d14 = dArr[i16];
            int i19 = i16 + 1;
            double d15 = dArr[i19];
            double[] dArr3 = dArr2[i16];
            double d16 = dArr3[0];
            double d17 = dArr3[1];
            double[] dArr4 = dArr2[i19];
            c2476aArr[i16] = new C2476a(i18, d14, d15, d16, d17, dArr4[0], dArr4[1]);
            i16 = i19;
            i15 = i18;
        }
    }

    @Override // o6.b
    public final double b(double d14) {
        boolean z14 = this.f129438c;
        C2476a[] c2476aArr = this.f129437b;
        if (z14) {
            C2476a c2476a = c2476aArr[0];
            double d15 = c2476a.f129442c;
            if (d14 < d15) {
                double d16 = d14 - d15;
                if (c2476a.f129457r) {
                    return (d16 * c2476aArr[0].f129451l) + c2476a.c(d15);
                }
                c2476a.g(d15);
                return (c2476aArr[0].a() * d16) + c2476aArr[0].e();
            }
            if (d14 > c2476aArr[c2476aArr.length - 1].f129443d) {
                double d17 = c2476aArr[c2476aArr.length - 1].f129443d;
                double d18 = d14 - d17;
                int length = c2476aArr.length - 1;
                return (d18 * c2476aArr[length].f129451l) + c2476aArr[length].c(d17);
            }
        } else {
            double d19 = c2476aArr[0].f129442c;
            if (d14 < d19) {
                d14 = d19;
            } else if (d14 > c2476aArr[c2476aArr.length - 1].f129443d) {
                d14 = c2476aArr[c2476aArr.length - 1].f129443d;
            }
        }
        for (int i14 = 0; i14 < c2476aArr.length; i14++) {
            C2476a c2476a2 = c2476aArr[i14];
            if (d14 <= c2476a2.f129443d) {
                if (c2476a2.f129457r) {
                    return c2476a2.c(d14);
                }
                c2476a2.g(d14);
                return c2476aArr[i14].e();
            }
        }
        return Double.NaN;
    }

    @Override // o6.b
    public final void c(double d14, double[] dArr) {
        boolean z14 = this.f129438c;
        C2476a[] c2476aArr = this.f129437b;
        if (z14) {
            C2476a c2476a = c2476aArr[0];
            double d15 = c2476a.f129442c;
            if (d14 < d15) {
                double d16 = d14 - d15;
                if (c2476a.f129457r) {
                    double dC = c2476a.c(d15);
                    C2476a c2476a2 = c2476aArr[0];
                    dArr[0] = (c2476a2.f129451l * d16) + dC;
                    dArr[1] = (d16 * c2476aArr[0].f129452m) + c2476a2.d(d15);
                    return;
                }
                c2476a.g(d15);
                dArr[0] = (c2476aArr[0].a() * d16) + c2476aArr[0].e();
                dArr[1] = (c2476aArr[0].b() * d16) + c2476aArr[0].f();
                return;
            }
            if (d14 > c2476aArr[c2476aArr.length - 1].f129443d) {
                double d17 = c2476aArr[c2476aArr.length - 1].f129443d;
                double d18 = d14 - d17;
                int length = c2476aArr.length - 1;
                C2476a c2476a3 = c2476aArr[length];
                if (c2476a3.f129457r) {
                    double dC2 = c2476a3.c(d17);
                    C2476a c2476a4 = c2476aArr[length];
                    dArr[0] = (c2476a4.f129451l * d18) + dC2;
                    dArr[1] = (d18 * c2476aArr[length].f129452m) + c2476a4.d(d17);
                    return;
                }
                c2476a3.g(d14);
                dArr[0] = (c2476aArr[length].a() * d18) + c2476aArr[length].e();
                dArr[1] = (c2476aArr[length].b() * d18) + c2476aArr[length].f();
                return;
            }
        } else {
            double d19 = c2476aArr[0].f129442c;
            if (d14 < d19) {
                d14 = d19;
            }
            if (d14 > c2476aArr[c2476aArr.length - 1].f129443d) {
                d14 = c2476aArr[c2476aArr.length - 1].f129443d;
            }
        }
        for (int i14 = 0; i14 < c2476aArr.length; i14++) {
            C2476a c2476a5 = c2476aArr[i14];
            if (d14 <= c2476a5.f129443d) {
                if (c2476a5.f129457r) {
                    dArr[0] = c2476a5.c(d14);
                    dArr[1] = c2476aArr[i14].d(d14);
                    return;
                } else {
                    c2476a5.g(d14);
                    dArr[0] = c2476aArr[i14].e();
                    dArr[1] = c2476aArr[i14].f();
                    return;
                }
            }
        }
    }

    @Override // o6.b
    public final void d(double d14, float[] fArr) {
        boolean z14 = this.f129438c;
        C2476a[] c2476aArr = this.f129437b;
        if (z14) {
            C2476a c2476a = c2476aArr[0];
            double d15 = c2476a.f129442c;
            if (d14 < d15) {
                double d16 = d14 - d15;
                if (c2476a.f129457r) {
                    double dC = c2476a.c(d15);
                    C2476a c2476a2 = c2476aArr[0];
                    fArr[0] = (float) ((c2476a2.f129451l * d16) + dC);
                    fArr[1] = (float) ((d16 * c2476aArr[0].f129452m) + c2476a2.d(d15));
                    return;
                }
                c2476a.g(d15);
                fArr[0] = (float) ((c2476aArr[0].a() * d16) + c2476aArr[0].e());
                fArr[1] = (float) ((c2476aArr[0].b() * d16) + c2476aArr[0].f());
                return;
            }
            if (d14 > c2476aArr[c2476aArr.length - 1].f129443d) {
                double d17 = c2476aArr[c2476aArr.length - 1].f129443d;
                double d18 = d14 - d17;
                int length = c2476aArr.length - 1;
                C2476a c2476a3 = c2476aArr[length];
                if (!c2476a3.f129457r) {
                    c2476a3.g(d14);
                    fArr[0] = (float) c2476aArr[length].e();
                    fArr[1] = (float) c2476aArr[length].f();
                    return;
                } else {
                    double dC2 = c2476a3.c(d17);
                    C2476a c2476a4 = c2476aArr[length];
                    fArr[0] = (float) ((c2476a4.f129451l * d18) + dC2);
                    fArr[1] = (float) ((d18 * c2476aArr[length].f129452m) + c2476a4.d(d17));
                    return;
                }
            }
        } else {
            double d19 = c2476aArr[0].f129442c;
            if (d14 < d19) {
                d14 = d19;
            } else if (d14 > c2476aArr[c2476aArr.length - 1].f129443d) {
                d14 = c2476aArr[c2476aArr.length - 1].f129443d;
            }
        }
        for (int i14 = 0; i14 < c2476aArr.length; i14++) {
            C2476a c2476a5 = c2476aArr[i14];
            if (d14 <= c2476a5.f129443d) {
                if (c2476a5.f129457r) {
                    fArr[0] = (float) c2476a5.c(d14);
                    fArr[1] = (float) c2476aArr[i14].d(d14);
                    return;
                } else {
                    c2476a5.g(d14);
                    fArr[0] = (float) c2476aArr[i14].e();
                    fArr[1] = (float) c2476aArr[i14].f();
                    return;
                }
            }
        }
    }

    @Override // o6.b
    public final void e(double d14, double[] dArr) {
        C2476a[] c2476aArr = this.f129437b;
        double d15 = c2476aArr[0].f129442c;
        if (d14 < d15) {
            d14 = d15;
        } else if (d14 > c2476aArr[c2476aArr.length - 1].f129443d) {
            d14 = c2476aArr[c2476aArr.length - 1].f129443d;
        }
        for (int i14 = 0; i14 < c2476aArr.length; i14++) {
            C2476a c2476a = c2476aArr[i14];
            if (d14 <= c2476a.f129443d) {
                if (c2476a.f129457r) {
                    dArr[0] = c2476a.f129451l;
                    dArr[1] = c2476a.f129452m;
                    return;
                } else {
                    c2476a.g(d14);
                    dArr[0] = c2476aArr[i14].a();
                    dArr[1] = c2476aArr[i14].b();
                    return;
                }
            }
        }
    }

    @Override // o6.b
    public final double[] f() {
        return this.f129436a;
    }
}
