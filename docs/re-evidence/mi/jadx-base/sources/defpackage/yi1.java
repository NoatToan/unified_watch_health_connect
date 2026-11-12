package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class yi1 extends hd5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double[] f40199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a[] f40200b;
    public boolean c = true;

    public static class a {
        public static double[] s = new double[91];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double[] f40201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f40202b;
        public double c;
        public double d;
        public double e;
        public double f;
        public double g;
        public double h;
        public double i;
        public double j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public double f40203k;
        public double l;
        public double m;
        public double n;
        public double o;
        public double p;
        public boolean q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f40204r;

        public a(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            this.f40204r = false;
            this.q = i == 1;
            this.c = d;
            this.d = d2;
            this.i = 1.0d / (d2 - d);
            if (3 == i) {
                this.f40204r = true;
            }
            double d7 = d5 - d3;
            double d8 = d6 - d4;
            if (!this.f40204r && Math.abs(d7) >= 0.001d && Math.abs(d8) >= 0.001d) {
                this.f40201a = new double[101];
                boolean z = this.q;
                this.j = d7 * ((double) (z ? -1 : 1));
                this.f40203k = d8 * ((double) (z ? 1 : -1));
                this.l = z ? d5 : d3;
                this.m = z ? d4 : d6;
                a(d3, d4, d5, d6);
                this.n = this.f40202b * this.i;
                return;
            }
            this.f40204r = true;
            this.e = d3;
            this.f = d5;
            this.g = d4;
            this.h = d6;
            double dHypot = Math.hypot(d8, d7);
            this.f40202b = dHypot;
            this.n = dHypot * this.i;
            double d9 = this.d;
            double d10 = this.c;
            this.l = d7 / (d9 - d10);
            this.m = d8 / (d9 - d10);
        }

        public final void a(double d, double d2, double d3, double d4) {
            double dHypot;
            double d5 = d3 - d;
            double d6 = d2 - d4;
            int i = 0;
            double d7 = 0.0d;
            double d8 = 0.0d;
            double d9 = 0.0d;
            while (true) {
                double[] dArr = s;
                if (i >= dArr.length) {
                    break;
                }
                double d10 = d7;
                double radians = Math.toRadians((((double) i) * 90.0d) / ((double) (dArr.length - 1)));
                double dSin = Math.sin(radians) * d5;
                double dCos = Math.cos(radians) * d6;
                if (i > 0) {
                    dHypot = Math.hypot(dSin - d8, dCos - d9) + d10;
                    s[i] = dHypot;
                } else {
                    dHypot = d10;
                }
                i++;
                d9 = dCos;
                d7 = dHypot;
                d8 = dSin;
            }
            double d11 = d7;
            this.f40202b = d11;
            int i2 = 0;
            while (true) {
                double[] dArr2 = s;
                if (i2 >= dArr2.length) {
                    break;
                }
                dArr2[i2] = dArr2[i2] / d11;
                i2++;
            }
            int i3 = 0;
            while (true) {
                double[] dArr3 = this.f40201a;
                if (i3 >= dArr3.length) {
                    return;
                }
                double length = ((double) i3) / ((double) (dArr3.length - 1));
                int iBinarySearch = Arrays.binarySearch(s, length);
                if (iBinarySearch >= 0) {
                    this.f40201a[i3] = ((double) iBinarySearch) / ((double) (s.length - 1));
                } else if (iBinarySearch == -1) {
                    this.f40201a[i3] = 0.0d;
                } else {
                    int i4 = -iBinarySearch;
                    int i5 = i4 - 2;
                    double[] dArr4 = s;
                    double d12 = dArr4[i5];
                    this.f40201a[i3] = (((double) i5) + ((length - d12) / (dArr4[i4 - 1] - d12))) / ((double) (dArr4.length - 1));
                }
                i3++;
            }
        }

        public double b() {
            double d = this.j * this.p;
            double dHypot = this.n / Math.hypot(d, (-this.f40203k) * this.o);
            if (this.q) {
                d = -d;
            }
            return d * dHypot;
        }

        public double c() {
            double d = this.j * this.p;
            double d2 = (-this.f40203k) * this.o;
            double dHypot = this.n / Math.hypot(d, d2);
            return this.q ? (-d2) * dHypot : d2 * dHypot;
        }

        public double d(double d) {
            return this.l;
        }

        public double e(double d) {
            return this.m;
        }

        public double f(double d) {
            double d2 = (d - this.c) * this.i;
            double d3 = this.e;
            return d3 + (d2 * (this.f - d3));
        }

        public double g(double d) {
            double d2 = (d - this.c) * this.i;
            double d3 = this.g;
            return d3 + (d2 * (this.h - d3));
        }

        public double h() {
            return this.l + (this.j * this.o);
        }

        public double i() {
            return this.m + (this.f40203k * this.p);
        }

        public double j(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f40201a;
            double length = d * ((double) (dArr.length - 1));
            int i = (int) length;
            double d2 = length - ((double) i);
            double d3 = dArr[i];
            return d3 + (d2 * (dArr[i + 1] - d3));
        }

        public void k(double d) {
            double dJ = j((this.q ? this.d - d : d - this.c) * this.i) * 1.5707963267948966d;
            this.o = Math.sin(dJ);
            this.p = Math.cos(dJ);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    public yi1(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f40199a = dArr;
        this.f40200b = new a[dArr.length - 1];
        int i = 1;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            a[] aVarArr = this.f40200b;
            if (i3 >= aVarArr.length) {
                return;
            }
            int i4 = iArr[i3];
            if (i4 == 0) {
                i2 = 3;
            } else if (i4 == 1) {
                i = 1;
                i2 = i;
            } else {
                if (i4 != 2) {
                    if (i4 == 3) {
                        if (i != 1) {
                            i = 1;
                        }
                        i2 = i;
                    }
                }
                i = 2;
                i2 = i;
            }
            double d = dArr[i3];
            int i5 = i3 + 1;
            double d2 = dArr[i5];
            double[] dArr3 = dArr2[i3];
            double d3 = dArr3[0];
            double d4 = dArr3[1];
            double[] dArr4 = dArr2[i5];
            aVarArr[i3] = new a(i2, d, d2, d3, d4, dArr4[0], dArr4[1]);
            i3 = i5;
        }
    }

    @Override // defpackage.hd5
    public double c(double d, int i) {
        double dG;
        double dE;
        double dI;
        double dC;
        double dG2;
        double dE2;
        int i2 = 0;
        if (this.c) {
            a[] aVarArr = this.f40200b;
            a aVar = aVarArr[0];
            double d2 = aVar.c;
            if (d < d2) {
                double d3 = d - d2;
                if (aVar.f40204r) {
                    if (i == 0) {
                        dG2 = aVar.f(d2);
                        dE2 = this.f40200b[0].d(d2);
                    } else {
                        dG2 = aVar.g(d2);
                        dE2 = this.f40200b[0].e(d2);
                    }
                    return dG2 + (d3 * dE2);
                }
                aVar.k(d2);
                if (i == 0) {
                    dI = this.f40200b[0].h();
                    dC = this.f40200b[0].b();
                } else {
                    dI = this.f40200b[0].i();
                    dC = this.f40200b[0].c();
                }
                return dI + (d3 * dC);
            }
            if (d > aVarArr[aVarArr.length - 1].d) {
                double d4 = aVarArr[aVarArr.length - 1].d;
                double d5 = d - d4;
                int length = aVarArr.length - 1;
                if (i == 0) {
                    dG = aVarArr[length].f(d4);
                    dE = this.f40200b[length].d(d4);
                } else {
                    dG = aVarArr[length].g(d4);
                    dE = this.f40200b[length].e(d4);
                }
                return dG + (d5 * dE);
            }
        } else {
            a[] aVarArr2 = this.f40200b;
            double d6 = aVarArr2[0].c;
            if (d < d6) {
                d = d6;
            } else if (d > aVarArr2[aVarArr2.length - 1].d) {
                d = aVarArr2[aVarArr2.length - 1].d;
            }
        }
        while (true) {
            a[] aVarArr3 = this.f40200b;
            if (i2 >= aVarArr3.length) {
                return Double.NaN;
            }
            a aVar2 = aVarArr3[i2];
            if (d <= aVar2.d) {
                if (aVar2.f40204r) {
                    return i == 0 ? aVar2.f(d) : aVar2.g(d);
                }
                aVar2.k(d);
                return i == 0 ? this.f40200b[i2].h() : this.f40200b[i2].i();
            }
            i2++;
        }
    }

    @Override // defpackage.hd5
    public void d(double d, double[] dArr) {
        if (this.c) {
            a[] aVarArr = this.f40200b;
            a aVar = aVarArr[0];
            double d2 = aVar.c;
            if (d < d2) {
                double d3 = d - d2;
                if (aVar.f40204r) {
                    dArr[0] = aVar.f(d2) + (this.f40200b[0].d(d2) * d3);
                    dArr[1] = this.f40200b[0].g(d2) + (d3 * this.f40200b[0].e(d2));
                    return;
                } else {
                    aVar.k(d2);
                    dArr[0] = this.f40200b[0].h() + (this.f40200b[0].b() * d3);
                    dArr[1] = this.f40200b[0].i() + (d3 * this.f40200b[0].c());
                    return;
                }
            }
            if (d > aVarArr[aVarArr.length - 1].d) {
                double d4 = aVarArr[aVarArr.length - 1].d;
                double d5 = d - d4;
                int length = aVarArr.length - 1;
                a aVar2 = aVarArr[length];
                if (aVar2.f40204r) {
                    dArr[0] = aVar2.f(d4) + (this.f40200b[length].d(d4) * d5);
                    dArr[1] = this.f40200b[length].g(d4) + (d5 * this.f40200b[length].e(d4));
                    return;
                } else {
                    aVar2.k(d);
                    dArr[0] = this.f40200b[length].h() + (this.f40200b[length].b() * d5);
                    dArr[1] = this.f40200b[length].i() + (d5 * this.f40200b[length].c());
                    return;
                }
            }
        } else {
            a[] aVarArr2 = this.f40200b;
            double d6 = aVarArr2[0].c;
            if (d < d6) {
                d = d6;
            }
            if (d > aVarArr2[aVarArr2.length - 1].d) {
                d = aVarArr2[aVarArr2.length - 1].d;
            }
        }
        int i = 0;
        while (true) {
            a[] aVarArr3 = this.f40200b;
            if (i >= aVarArr3.length) {
                return;
            }
            a aVar3 = aVarArr3[i];
            if (d <= aVar3.d) {
                if (aVar3.f40204r) {
                    dArr[0] = aVar3.f(d);
                    dArr[1] = this.f40200b[i].g(d);
                    return;
                } else {
                    aVar3.k(d);
                    dArr[0] = this.f40200b[i].h();
                    dArr[1] = this.f40200b[i].i();
                    return;
                }
            }
            i++;
        }
    }

    @Override // defpackage.hd5
    public void e(double d, float[] fArr) {
        if (this.c) {
            a[] aVarArr = this.f40200b;
            a aVar = aVarArr[0];
            double d2 = aVar.c;
            if (d < d2) {
                double d3 = d - d2;
                if (aVar.f40204r) {
                    fArr[0] = (float) (aVar.f(d2) + (this.f40200b[0].d(d2) * d3));
                    fArr[1] = (float) (this.f40200b[0].g(d2) + (d3 * this.f40200b[0].e(d2)));
                    return;
                } else {
                    aVar.k(d2);
                    fArr[0] = (float) (this.f40200b[0].h() + (this.f40200b[0].b() * d3));
                    fArr[1] = (float) (this.f40200b[0].i() + (d3 * this.f40200b[0].c()));
                    return;
                }
            }
            if (d > aVarArr[aVarArr.length - 1].d) {
                double d4 = aVarArr[aVarArr.length - 1].d;
                double d5 = d - d4;
                int length = aVarArr.length - 1;
                a aVar2 = aVarArr[length];
                if (aVar2.f40204r) {
                    fArr[0] = (float) (aVar2.f(d4) + (this.f40200b[length].d(d4) * d5));
                    fArr[1] = (float) (this.f40200b[length].g(d4) + (d5 * this.f40200b[length].e(d4)));
                    return;
                } else {
                    aVar2.k(d);
                    fArr[0] = (float) this.f40200b[length].h();
                    fArr[1] = (float) this.f40200b[length].i();
                    return;
                }
            }
        } else {
            a[] aVarArr2 = this.f40200b;
            double d6 = aVarArr2[0].c;
            if (d < d6) {
                d = d6;
            } else if (d > aVarArr2[aVarArr2.length - 1].d) {
                d = aVarArr2[aVarArr2.length - 1].d;
            }
        }
        int i = 0;
        while (true) {
            a[] aVarArr3 = this.f40200b;
            if (i >= aVarArr3.length) {
                return;
            }
            a aVar3 = aVarArr3[i];
            if (d <= aVar3.d) {
                if (aVar3.f40204r) {
                    fArr[0] = (float) aVar3.f(d);
                    fArr[1] = (float) this.f40200b[i].g(d);
                    return;
                } else {
                    aVar3.k(d);
                    fArr[0] = (float) this.f40200b[i].h();
                    fArr[1] = (float) this.f40200b[i].i();
                    return;
                }
            }
            i++;
        }
    }

    @Override // defpackage.hd5
    public double f(double d, int i) {
        a[] aVarArr = this.f40200b;
        int i2 = 0;
        double d2 = aVarArr[0].c;
        if (d < d2) {
            d = d2;
        }
        if (d > aVarArr[aVarArr.length - 1].d) {
            d = aVarArr[aVarArr.length - 1].d;
        }
        while (true) {
            a[] aVarArr2 = this.f40200b;
            if (i2 >= aVarArr2.length) {
                return Double.NaN;
            }
            a aVar = aVarArr2[i2];
            if (d <= aVar.d) {
                if (aVar.f40204r) {
                    return i == 0 ? aVar.d(d) : aVar.e(d);
                }
                aVar.k(d);
                return i == 0 ? this.f40200b[i2].b() : this.f40200b[i2].c();
            }
            i2++;
        }
    }

    @Override // defpackage.hd5
    public void g(double d, double[] dArr) {
        a[] aVarArr = this.f40200b;
        double d2 = aVarArr[0].c;
        if (d < d2) {
            d = d2;
        } else if (d > aVarArr[aVarArr.length - 1].d) {
            d = aVarArr[aVarArr.length - 1].d;
        }
        int i = 0;
        while (true) {
            a[] aVarArr2 = this.f40200b;
            if (i >= aVarArr2.length) {
                return;
            }
            a aVar = aVarArr2[i];
            if (d <= aVar.d) {
                if (aVar.f40204r) {
                    dArr[0] = aVar.d(d);
                    dArr[1] = this.f40200b[i].e(d);
                    return;
                } else {
                    aVar.k(d);
                    dArr[0] = this.f40200b[i].b();
                    dArr[1] = this.f40200b[i].c();
                    return;
                }
            }
            i++;
        }
    }

    @Override // defpackage.hd5
    public double[] h() {
        return this.f40199a;
    }
}
