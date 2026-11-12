package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes7.dex */
public class exz {
    public static final double[] d = {18.5d, 23.9d, 28.0d};
    private static final double[][] i = {new double[]{23.0d, 26.0d, 28.0d}, new double[]{15.0d, 17.0d, 19.0d}};
    private static final double[][] f = {new double[]{27.0d, 28.0d, 29.0d}, new double[]{16.0d, 17.0d, 19.0d}};
    private static final double[][] p = {new double[]{15.7d, 16.1d, 16.7d, 17.3d, 18.05d, 18.7d, 19.4d, 20.0d, 20.25d, 20.6d, 20.7d, 21.0d}, new double[]{16.45d, 17.05d, 17.65d, 18.25d, 18.9d, 19.35d, 19.75d, 20.2d, 20.55d, 20.9d, 21.3d, 22.0d}};
    private static final double[] bg = {2.12d, 96.33d};
    private static final double[] ck = {10.59d, 137.61d};
    private static final double[] ab = {10.59d, 137.61d};
    private static final double[] bz = {0.05d, 8.97d};
    private static final double[] ao = {0.25d, 22.87d};
    private static final double[] ce = {0.297d, 10.01d};
    private static final double[] as = {0.9775d, 21.0375d};
    private static final double[] ad = {0.0d, 10.0d};
    private static final double[] bi = {0.0d, 42.0d};
    private static final double[] m = {50.0d, 100.0d};
    private static final double[] q = {0.0d, 9.0d};
    private static final double[] s = {0.0d, 5.0d};
    private static final double[] n = {10.0d, 55.0d};
    private static final double[] o = {10.0d, 60.0d};
    private static final double[] l = {17.0d, 32.0d};
    private static final double[] j = {17.0d, 31.0d};
    private static final double[] ai = {3.0d, 60.0d};
    private static final double[] ay = {10.07d, 130.89d};
    private static final double[] bp = {4.25935d, 77.35545d};
    private static final double[] bl = {4.28d, 15.0d};
    private static final double[] ci = {1.0d, 34.0d};
    private static final double[] bw = {25.0d, 80.0d};
    private static final double[] bh = {2.12d, 96.33d};
    private static final double[] x = {0.61d, 4.24d};
    private static final double[] e = {244.78d, 6127.56d};
    private static final double[] al = {1.0d, 300.0d};
    private static final double[] cj = {0.4d, 1.5d};
    private static final double[] bb = {0.0d, 99.0d};
    private static final double[] k = {18.5d, 24.9d, 30.0d};
    private static final double[][] h = {new double[]{13.3d, 16.6d, 17.9d}, new double[]{13.5d, 17.2d, 19.0d}, new double[]{13.6d, 18.0d, 20.0d}, new double[]{13.8d, 18.7d, 21.1d}, new double[]{14.0d, 19.4d, 22.2d}, new double[]{14.3d, 20.1d, 23.3d}, new double[]{14.5d, 20.9d, 24.4d}, new double[]{14.9d, 21.7d, 25.5d}, new double[]{15.4d, 22.5d, 26.3d}, new double[]{15.9d, 23.0d, 26.8d}, new double[]{16.3d, 23.4d, 27.3d}, new double[]{16.7d, 23.8d, 27.7d}};
    private static final double[][] g = {new double[]{12.9d, 16.4d, 17.8d}, new double[]{13.0d, 17.0d, 18.8d}, new double[]{13.1d, 17.9d, 19.7d}, new double[]{13.2d, 18.8d, 20.7d}, new double[]{13.4d, 19.8d, 21.8d}, new double[]{13.8d, 20.8d, 23.0d}, new double[]{14.2d, 21.7d, 24.2d}, new double[]{14.8d, 22.4d, 25.3d}, new double[]{15.3d, 22.9d, 26.1d}, new double[]{16.1d, 23.3d, 26.8d}, new double[]{16.5d, 23.7d, 27.3d}, new double[]{16.7d, 23.9d, 27.7d}};
    private static final double[][] z = {new double[]{12.0d, 15.0d, 18.0d, 21.0d, 18.0d, 20.0d, 22.0d}, new double[]{13.0d, 15.0d, 10.0d, 10.0d, 10.0d, 12.0d, 14.0d}};
    private static final double[][] ag = {new double[]{24.0d, 28.0d, 32.0d, 34.0d, 28.0d, 32.0d, 34.0d}, new double[]{22.0d, 28.0d, 25.0d, 20.0d, 20.0d, 22.0d, 24.0d}};
    private static final double[][] aa = {new double[]{33.0d, 36.0d, 38.0d, 37.0d, 33.0d, 37.0d, 39.0d}, new double[]{31.0d, 36.0d, 35.0d, 30.0d, 25.0d, 27.0d, 29.0d}};
    private static final double[][] ae = {new double[]{12.0d, 15.0d, 18.0d, 21.0d, 20.0d, 21.0d, 22.0d}, new double[]{13.0d, 15.0d, 10.0d, 10.0d, 10.0d, 11.0d, 13.0d}};
    private static final double[][] af = {new double[]{24.0d, 28.0d, 32.0d, 34.0d, 34.0d, 35.0d, 36.0d}, new double[]{22.0d, 28.0d, 25.0d, 20.0d, 20.0d, 21.0d, 22.0d, 24.0d}};
    private static final double[][] ac = {new double[]{33.0d, 36.0d, 38.0d, 37.0d, 39.0d, 40.0d, 41.0d}, new double[]{31.0d, 36.0d, 35.0d, 30.0d, 26.0d, 27.0d, 29.0d}};
    private static final double[][] au = {new double[]{0.717d, 0.688d, 0.646d, 0.631d, 0.73d, 0.7d, 0.68d}, new double[]{0.728d, 0.685d, 0.725d, 0.745d, 0.81d, 0.79d, 0.77d}};
    private static final double[] ax = {21.9d, 32.9d, 36.5d};
    private static final double[] at = {34.7d, 37.5d, 42.5d};
    private static final double[] av = {38.5d, 44.0d, 49.4d};
    private static final double[] aw = {46.5d, 52.4d, 59.4d};
    private static final double[][] cf = {new double[]{7.3d, 10.3d, 15.4d, 21.0d, 21.6d}, new double[]{7.3d, 10.0d, 9.5d, 9.7d, 11.7d}};
    private static final double[][] by = {new double[]{19.5d, 24.0d, 33.3d, 34.0d, 34.9d}, new double[]{22.8d, 28.7d, 30.3d, 23.7d, 18.7d}};
    private static final double[][] aq = {new double[]{19.5d, 22.1d, 25.3d, 28.3d, 28.4d}, new double[]{15.5d, 16.9d, 14.6d, 11.6d, 15.0d}};
    private static final double[][] ar = {new double[]{30.3d, 33.9d, 39.6d, 36.8d, 37.3d}, new double[]{32.2d, 37.3d, 37.6d, 27.6d, 22.6d}};
    private static final double[][] bu = {new double[]{5.7d, 8.8d, 14.4d, 22.0d, 17.5d}, new double[]{5.0d, 8.8d, 9.3d, 12.1d, 14.0d}};
    private static final double[][] bv = {new double[]{19.7d, 24.6d, 34.5d, 37.0d, 30.0d}, new double[]{22.9d, 30.1d, 33.5d, 32.6d, 27.0d}};
    private static final double[][] cg = {new double[]{0.03906d, 0.03744d, 0.03519d, 0.034291d, 0.0442d, 0.0424d, 0.0411d}, new double[]{0.0396d, 0.03726d, 0.03951d, 0.04059d, 0.049d, 0.0478d, 0.0466d}};
    private static final double[][] ap = {new double[]{0.12152d, 0.11648d, 0.10948d, 0.10668d, 0.12155d, 0.1166d, 0.11303d}, new double[]{0.1232d, 0.11592d, 0.12292d, 0.12628d, 0.13475d, 0.13145d, 0.12815d}};
    private static final double[][] cb = {new double[]{0.11284d, 0.10816d, 0.10166d, 0.9906d}, new double[]{0.1144d, 0.10764d, 0.11414d, 0.11726d}};
    private static final double[][] ca = {new double[]{0.11041d, 0.10588d, 0.10285d}, new double[]{0.12251d, 0.11949d, 0.11646d}};
    private static final double[][][] bx = {new double[][]{new double[]{0.83d, 1.03d}, new double[]{0.99d, 1.21d}, new double[]{1.23d, 1.46d}}, new double[][]{new double[]{0.86d, 1.05d}, new double[]{0.96d, 1.16d}, new double[]{1.0d, 1.53d}}};
    private static final double[][] bk = {new double[]{0.434d, 0.416d, 0.391d, 0.381d, 0.442d, 0.424d, 0.411d}, new double[]{0.44d, 0.414d, 0.439d, 0.451d, 0.49d, 0.478d, 0.466d}};
    private static final double[] bj = {16.0d, 18.9d, 22.1d};
    private static final double[] bm = {20.6d, 23.7d, 30.3d};
    private static final double[] bn = {21.2d, 24.8d, 29.6d};
    private static final double[] bo = {26.6d, 34.6d, 43.2d};
    private static final double[][] bd = {new double[]{4.395d, 4.705d, 4.816d, 5.434d, 5.525d}, new double[]{4.224d, 4.839d, 5.656d, 6.78d, 7.102d}};
    private static final double[][] bf = {new double[]{5.338d, 5.837d, 6.247d, 6.853d, 6.531d}, new double[]{5.834d, 6.661d, 7.733d, 8.784d, 8.558d}};
    private static final double[] cd = {5.0d, 10.0d, 15.0d};
    private static final double[] cc = {4.5d, 9.5d, 14.5d};
    private static final double[][] bt = {new double[]{47.61d, 45.3d, 42.52d, 42.04d, 41.0d}, new double[]{48.44d, 44.62d, 46.32d, 48.79d, 47.23d}};
    private static final double[][] br = {new double[]{65.59d, 63.55d, 59.59d, 57.47d, 55.94d}, new double[]{66.47d, 63.63d, 68.12d, 68.64d, 70.0d}};
    private static final double[][] bs = {new double[]{47.61d, 45.3d, 42.52d, 42.04d, 45.0d}, new double[]{48.44d, 44.62d, 46.32d, 48.79d, 50.0d}};
    private static final double[][] bq = {new double[]{65.59d, 63.55d, 59.59d, 57.47d, 60.0d}, new double[]{66.47d, 63.63d, 68.12d, 68.64d, 65.0d}};
    private static final double[][] ba = {new double[]{12.66d, 12.04d, 11.36d, 11.23d, 12.9162d, 11.2316d, 7.64d}, new double[]{12.86d, 11.86d, 12.37d, 13.14d, 18.5976d, 17.2668d, 16.0936d}};
    private static final double[][] az = {new double[]{17.52d, 16.8d, 15.83d, 15.36d, 21.3418d, 19.6124d, 19.064d}, new double[]{17.75d, 16.9d, 18.21d, 18.52d, 24.8824d, 23.7532d, 21.0344d}};
    private static final double[] be = {16.0d, 20.0d};
    private static final double[] ak = {0.724d, 0.986d, 1.248d, 1.566d, 2.067d, 2.87d};
    private static final double[] am = {1.083d, 1.393d, 1.78d, 2.561d, 3.084d, 3.43d};
    private static final double[] aj = {0.719d, 0.955d, 1.252d, 1.678d, 2.078d};
    private static final double[] an = {1.041d, 1.399d, 2.026d, 2.444d, 2.834d};
    private static final double[] r = {1.526d, 1.862d, 2.122d};
    private static final double[] t = {2.074d, 2.538d, 2.878d};
    private static final double[] v = {2.236d, 2.545d, 2.87d};
    private static final double[] y = {2.764d, 3.054d, 3.43d};
    private static final double[] u = {1.8d, 2.2d, 2.5d};
    private static final double[] w = {2.5d, 2.9d, 3.2d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double[][] f33660a = {new double[]{26.993d, 22.03d, 18.978d, 18.568d, 20.266d, 19.268d, 18.038d}, new double[]{26.298d, 21.65d, 20.007d, 19.928d, 21.305d, 20.7d, 20.161d}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final double[][] f33661b = {new double[]{35.337d, 29.606d, 25.275d, 23.733d, 22.816d, 21.582d, 20.026d}, new double[]{34.955d, 29.189d, 26.788d, 25.624d, 23.929d, 23.032d, 21.269d}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final double[][] f33662c = {new double[]{1210.0d, 1170.0d, 1110.0d, 1010.0d}, new double[]{1550.0d, 1500.0d, 1350.0d, 1220.0d}};
    private static final double[] ah = {55.0d, 85.0d, 100.0d};
    private static final double[] ch = {0.85d, 0.9d};
    private static final double[] bc = {29.0d, 59.0d, 79.0d};

    public static int a(int i2) {
        if (i2 >= 6 && i2 <= 8) {
            return 0;
        }
        if (i2 >= 9 && i2 <= 11) {
            return 1;
        }
        if (i2 < 12 || i2 > 14) {
            return (i2 < 15 || i2 > 17) ? 4 : 3;
        }
        return 2;
    }

    public static int b(int i2) {
        if (i2 <= 39) {
            return 0;
        }
        return i2 <= 59 ? 1 : 2;
    }

    public static int b(int i2, int i3) {
        if (i2 == 1) {
            if (i3 == 1) {
                return 1;
            }
            if (i3 != 2) {
                return i3 != 3 ? 0 : 3;
            }
            return 2;
        }
        if (i2 == 2) {
            if (i3 == 1) {
                return 4;
            }
            if (i3 != 2) {
                return i3 != 3 ? 0 : 6;
            }
            return 5;
        }
        if (i2 != 3 && i2 != 4) {
            return 0;
        }
        if (i3 == 1) {
            return 7;
        }
        if (i3 != 2) {
            return i3 != 3 ? 0 : 9;
        }
        return 8;
    }

    public static int c(double d2) {
        if (d2 < 160.0d) {
            return 0;
        }
        return d2 < 170.0d ? 1 : 2;
    }

    public static boolean c(int i2) {
        return i2 < 18 && i2 >= 6;
    }

    public static int d(int i2) {
        if (i2 >= 6 && i2 <= 7) {
            return 0;
        }
        if (i2 == 8) {
            return 1;
        }
        if (i2 == 9) {
            return 2;
        }
        if (i2 == 10) {
            return 3;
        }
        if (i2 == 11) {
            return 4;
        }
        if (i2 == 12) {
            return 5;
        }
        if (i2 == 13) {
            return 6;
        }
        if (i2 == 14) {
            return 7;
        }
        if (i2 == 15) {
            return 8;
        }
        if (i2 == 16) {
            return 9;
        }
        return i2 == 17 ? 10 : 11;
    }

    public static int e(byte b2) {
        return b2 == 0 ? 0 : 1;
    }

    public static int e(int i2) {
        if (i2 >= 6 && i2 <= 8) {
            return 0;
        }
        if (i2 >= 9 && i2 <= 11) {
            return 1;
        }
        if (i2 >= 12 && i2 <= 14) {
            return 2;
        }
        if (i2 >= 15 && i2 <= 17) {
            return 3;
        }
        if (i2 < 18 || i2 > 39) {
            return (i2 < 40 || i2 > 59) ? 6 : 5;
        }
        return 4;
    }

    private static int f(int i2) {
        if (i2 <= 29) {
            return 0;
        }
        if (i2 <= 49) {
            return 1;
        }
        return i2 <= 69 ? 2 : 3;
    }

    public static int g(double d2) {
        if (d2 < 60.0d) {
            return 0;
        }
        return d2 <= 75.0d ? 1 : 2;
    }

    private static int h(double d2) {
        if (d2 < 150.0d) {
            return 0;
        }
        return d2 < 160.0d ? 1 : 2;
    }

    public static int j(double d2) {
        if (d2 < 45.0d) {
            return 0;
        }
        return d2 <= 60.0d ? 1 : 2;
    }

    private static int o(double d2) {
        return CommonUtil.b(String.valueOf(new BigDecimal(d2).setScale(0, 4)), 10);
    }

    private static int c(double d2, double d3, double d4, double d5, double d6) {
        double dAbs = Math.abs(d2 - d3);
        if (dAbs != 0.0d) {
            d4 = ((Math.abs(d5 - d3) / dAbs) * (d4 - d6)) + d6;
        }
        return o(d4);
    }

    private static int a(double d2, double d3, double d4, double d5, double d6) {
        int iC = c(d2, d3, d4, d5, d6);
        int iO = o(3270.3333333333335d);
        int iO2 = o(3144.3333333333335d);
        if (iC > iO2 && iC < iO) {
            return o(iO2);
        }
        int iO3 = o(3396.3333333333335d);
        if (iC > iO && iC < iO3) {
            return o(iO3);
        }
        int iO4 = o(6729.666666666667d);
        int iO5 = o(6603.666666666667d);
        if (iC > iO5 && iC < iO4) {
            return o(iO5);
        }
        int iO6 = o(6855.666666666667d);
        return (iC <= iO4 || iC >= iO6) ? iC : o(iO6);
    }

    private static int b(double d2, double d3, double d4, double d5, double d6) {
        int iC = c(d2, d3, d4, d5, d6);
        int iO = o(2400.0d);
        int iO2 = o(2300.0d);
        if (iC > iO2 && iC < iO) {
            return o(iO2);
        }
        if (iC > iO && iC < 2500.0d) {
            return o(2500.0d);
        }
        int iO3 = o(4900.0d);
        if (iC > iO3 && iC < 5000.0d) {
            return o(iO3);
        }
        int iO4 = o(5100.0d);
        double d7 = iC;
        if (d7 > 5000.0d && iC < iO4) {
            return o(iO4);
        }
        int iO5 = o(7600.0d);
        if (d7 > 7500.0d && iC < iO5) {
            return o(7500.0d);
        }
        int iO6 = o(7700.0d);
        return (iC <= iO5 || iC >= iO6) ? iC : o(iO6);
    }

    private static double n(double d2) {
        return UnitUtil.d(d2, 0);
    }

    public static double b(double d2) {
        return UnitUtil.d(d2, 1);
    }

    public static boolean d(double d2, double d3) {
        return Math.abs(d2 - d3) < 1.0E-6d;
    }

    private static String l(double d2) {
        return UnitUtil.e(d2, 1, 0);
    }

    public static String e(double d2) {
        return UnitUtil.e(d2, 1, 1);
    }

    public static int c(double[] dArr, double d2) {
        if (d2 < dArr[0]) {
            return 1;
        }
        return d2 <= dArr[1] ? 2 : 3;
    }

    public static int e(double[] dArr, double[] dArr2, double d2, int i2) {
        double dMin;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9 = dArr[0];
        double d10 = dArr[1];
        double d11 = dArr2[0];
        double d12 = dArr2[1];
        double d13 = UnitUtil.d(d2, i2);
        double d14 = 3270.3333333333335d;
        if (d13 < d11) {
            d3 = 0.0d;
            dMin = Math.max(d13, d9);
            d10 = d11;
        } else {
            if (d13 <= d12) {
                d4 = 6729.666666666667d;
                d5 = d11;
                d6 = d12;
                d7 = d13;
                d8 = 3270.3333333333335d;
            } else {
                d14 = 10000.0d;
                dMin = Math.min(d13, d10);
                d9 = d12;
                d3 = 6729.666666666667d;
            }
            return a(d6, d5, d4, d7, d8);
        }
        d5 = d9;
        d6 = d10;
        d8 = d3;
        d7 = dMin;
        d4 = d14;
        return a(d6, d5, d4, d7, d8);
    }

    private static double[] k(double d2) {
        return new double[]{b(0.85d * d2), b(d2 * 1.15d)};
    }

    private static double[] d(double d2, byte b2, int i2) {
        double[] dArr = bx[e(b2)][b(i2)];
        return new double[]{b(dArr[0] * d2), b(d2 * dArr[1])};
    }

    public static double e(double d2, double d3, double d4, double d5, double d6) {
        double dB = b(d2);
        double dB2 = b(d3);
        return (((dB - dB2) - b(d4)) - b(d5)) - b(d6);
    }

    public static double d(double d2, double d3, double d4, double d5, double d6) {
        double dB = b(d2);
        double dB2 = b(d3);
        return (((dB - dB2) - b(d4)) - b(d5)) - b(d6);
    }

    public static double c(double d2, int i2) {
        if (i2 <= 0) {
            return 0.0d;
        }
        return UnitUtil.d(d2 / Math.pow(((double) i2) / 100.0d, 2.0d), 1);
    }

    public static double e(double d2, double d3) {
        return UnitUtil.d((UnitUtil.d(d3, 2) * d2) / 100.0d, 2);
    }

    public static double c(double d2, double d3) {
        return UnitUtil.d((UnitUtil.d(d3, 2) * d2) / 100.0d, 2);
    }

    public static double a(double d2, double d3) {
        double dB = b(c(d2, d3));
        double dB2 = b(d3 - dB);
        LogUtil.a("HealthStandard", "getFatFreeMass fatRate ", Double.valueOf(d2), " weight ", Double.valueOf(d3), " fatMass ", Double.valueOf(dB), " fatFreeMass ", Double.valueOf(dB2));
        return dB2;
    }

    public static double e(double d2, double d3, double d4, double d5, int i2) {
        double[] dArrT = t();
        double dMin = Math.min(Math.max((d(d2, d3, d4, d5) / d2) * 100.0d, dArrT[0]), dArrT[1]);
        if (Double.isInfinite(dMin) || Double.isNaN(dMin)) {
            LogUtil.e("HealthStandard", "getProteinPercentage proteinPercentage is Infinity or NaN");
            return 0.0d;
        }
        return b(dMin);
    }

    public static double d(double d2, double d3, double d4, double d5) {
        double d6 = UnitUtil.d(d2, 2);
        double dE = e(d3, d2);
        double dC = c(d4, d2);
        double d7 = UnitUtil.d(d5, 2);
        double d8 = ((d6 - dE) - dC) - d7;
        LogUtil.a("HealthStandard", "getProtein weight ", Double.valueOf(d2), " calculateWeight ", Double.valueOf(d6), " totalBodyWater ", Double.valueOf(d3), " waterContent ", Double.valueOf(dE), " fatRate ", Double.valueOf(d4), " fatMass ", Double.valueOf(dC), " boneMineralContent ", Double.valueOf(d5), " calculateBoneMineralContent ", Double.valueOf(d7), " protein ", Double.valueOf(d8));
        return UnitUtil.d(d8, 2);
    }

    public static double e(byte b2, int i2, int i3) {
        if (e(b2) != 0) {
            return b(i[e(b2)][b(i2)]);
        }
        if (i3 == 0) {
            return b(f[e(b2)][b(i2)]);
        }
        return b(i[e(b2)][b(i2)]);
    }

    public static double d(byte b2, int i2, int i3) {
        return b(Math.pow(((double) i2) / 100.0d, 2.0d) * p[e(b2)][d(i3)]);
    }

    public static double[] c(boolean z2) {
        if (z2) {
            double[] dArr = o;
            return new double[]{b(dArr[0]), b(dArr[1])};
        }
        double[] dArr2 = n;
        return new double[]{b(dArr2[0]), b(dArr2[1])};
    }

    public static double[] a(byte b2) {
        if (e(b2) == 0) {
            double[] dArr = j;
            return new double[]{b(dArr[0]), b(dArr[1])};
        }
        double[] dArr2 = l;
        return new double[]{b(dArr2[0]), b(dArr2[1])};
    }

    public static double[] e(boolean z2, byte b2, int i2) {
        double[] dArr;
        if (z2) {
            dArr = k;
        } else if (i2 >= 6 && i2 <= 17) {
            if (e(b2) == 0) {
                dArr = g[i2 - 6];
            } else {
                dArr = h[i2 - 6];
            }
        } else {
            dArr = d;
        }
        return new double[]{b(dArr[0]), b(dArr[1]), b(dArr[2])};
    }

    public static int b(double d2, boolean z2, byte b2, int i2) {
        double dB = b(d2);
        double[] dArrE = e(z2, b2, i2);
        if (dB < dArrE[0]) {
            return 1;
        }
        if (dB <= dArrE[1]) {
            return 2;
        }
        return dB < dArrE[2] ? 3 : 4;
    }

    public static double[] h() {
        double[] dArr = ai;
        return new double[]{b(dArr[0]), b(dArr[1])};
    }

    public static double[] b(byte b2, int i2, int i3) {
        if (e(b2) != 0) {
            LogUtil.a("HealthStandard", "getGenderIndex != 0, user the user scale");
            return new double[]{b(z[e(b2)][e(i2)]), b(ag[e(b2)][e(i2)]), b(aa[e(b2)][e(i2)])};
        }
        if (i3 == 0) {
            return new double[]{b(ae[e(b2)][e(i2)]), b(af[e(b2)][e(i2)]), b(ac[e(b2)][e(i2)])};
        }
        return new double[]{b(z[e(b2)][e(i2)]), b(ag[e(b2)][e(i2)]), b(aa[e(b2)][e(i2)])};
    }

    public static String[] a(byte b2, int i2, int i3) {
        double[] dArrB = b(b2, i2, i3);
        return new String[]{e(dArrB[0]), e(dArrB[1]), e(dArrB[2])};
    }

    public static int c(byte b2, int i2, double d2, int i3) {
        double dB = b(d2);
        double[] dArrB = b(b2, i2, i3);
        if (dB < dArrB[0]) {
            return 1;
        }
        if (dB <= dArrB[1]) {
            return 2;
        }
        return dB <= dArrB[2] ? 3 : 4;
    }

    public static int b(byte b2, int i2, double d2, int i3) {
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double[] dArrH = h();
        double[] dArrB = b(b2, i2, i3);
        double d9 = dArrH[0];
        double d10 = dArrH[1];
        double d11 = dArrB[0];
        double d12 = dArrB[1];
        double d13 = dArrB[2];
        double dB = b(d2);
        double d14 = 2400.0d;
        if (dB < d11) {
            dB = Math.max(dB, d9);
            d3 = 0.0d;
        } else {
            double d15 = 5000.0d;
            if (dB <= d12) {
                d10 = d12;
            } else {
                d14 = 7600.0d;
                if (dB <= d13) {
                    d11 = d13;
                    d3 = 5000.0d;
                    d9 = d12;
                } else {
                    dB = Math.min(dB, d10);
                    d15 = 10000.0d;
                    d11 = d13;
                }
            }
            d4 = d15;
            d5 = d10;
            d6 = d11;
            d7 = dB;
            d8 = d14;
            return b(d5, d6, d4, d7, d8);
        }
        d8 = d3;
        d6 = d9;
        d5 = d11;
        d7 = dB;
        d4 = d14;
        return b(d5, d6, d4, d7, d8);
    }

    public static double[] k() {
        double[] dArr = ay;
        return new double[]{b(dArr[0]), b(dArr[1])};
    }

    public static double[] e(byte b2, int i2, int i3, int i4) {
        double d2;
        double d3;
        double d4;
        if (e(b2) == 0) {
            double d5 = d(b2, i3, i2) * au[e(b2)][e(i2)];
            return new double[]{b(0.85d * d5), b(d5 * 1.15d)};
        }
        if (i4 != 0) {
            double d6 = d(b2, i3, i2) * au[e(b2)][e(i2)];
            d3 = 0.85d * d6;
            d4 = d6 * 1.15d;
        } else {
            if (b2 == 0) {
                d2 = ax[h(i3)];
            } else {
                d2 = av[c(i3)];
            }
            d3 = d2;
            if (b2 == 0) {
                d4 = at[h(i3)];
            } else {
                d4 = aw[c(i3)];
            }
        }
        return new double[]{b(d3), b(d4)};
    }

    public static int c(byte b2, int i2, int i3, double d2, int i4) {
        return c(e(b2, i2, i3, i4), b(d2));
    }

    public static int b(byte b2, int i2, int i3, double d2, int i4) {
        return e(k(), e(b2, i2, i3, i4), b(d2), 1);
    }

    public static double[] g() {
        double[] dArr = ab;
        return new double[]{b(dArr[0]), b(dArr[1])};
    }

    public static double[] c(byte b2, int i2, int i3, int i4) {
        double[] dArrE = e(b2, i2, i3, i4);
        double[] dArrC = c(b2, i3, i2);
        return new double[]{b(dArrE[0] + dArrC[0]), b(dArrE[1] + dArrC[1])};
    }

    public static int a(byte b2, int i2, int i3, double d2, int i4) {
        return c(c(b2, i2, i3, i4), b(d2));
    }

    public static int d(byte b2, int i2, int i3, double d2, int i4) {
        return e(g(), c(b2, i2, i3, i4), b(d2), 1);
    }

    public static double[] j(byte b2, int i2) {
        return new double[]{b(cf[e(b2)][a(i2)]), b(by[e(b2)][a(i2)])};
    }

    public static int f(byte b2, double d2, int i2) {
        return c(j(b2, i2), b(d2));
    }

    public static double[] c(byte b2, int i2) {
        return new double[]{b(aq[e(b2)][a(i2)]), b(ar[e(b2)][a(i2)])};
    }

    public static int e(byte b2, double d2, int i2) {
        return c(c(b2, i2), b(d2));
    }

    public static double[] i(byte b2, int i2) {
        return new double[]{b(bu[e(b2)][a(i2)]), b(bv[e(b2)][a(i2)])};
    }

    public static int g(byte b2, double d2, int i2) {
        return c(i(b2, i2), b(d2));
    }

    public static double[] v() {
        double[] dArr = ce;
        return new double[]{b(dArr[0]), b(dArr[1])};
    }

    public static double[] i(byte b2, int i2, int i3) {
        return k((d(b2, i3, i2) * cg[e(b2)][e(i2)]) - ((i2 < 6 || i2 > 17) ? 0.18d : 0.162d));
    }

    public static int e(byte b2, int i2, int i3, double d2) {
        return c(i(b2, i2, i3), b(d2));
    }

    public static double[] m() {
        double[] dArr = as;
        return new double[]{b(dArr[0]), b(dArr[1])};
    }

    public static double[] f(byte b2, int i2, int i3) {
        return k((d(b2, i3, i2) * ap[e(b2)][e(i2)]) - ((i2 < 6 || i2 > 17) ? 0.495d : 0.504d));
    }

    public static int c(byte b2, int i2, int i3, double d2) {
        return c(f(b2, i2, i3), b(d2));
    }

    public static double[] j(byte b2, int i2, int i3) {
        if (i2 >= 6 && i2 <= 17) {
            return k((d(b2, i3, i2) * cb[e(b2)][a(i2)]) - 0.468d);
        }
        return d((d(b2, i3, i2) * ca[e(b2)][b(i2)]) - 0.4583d, b2, i2);
    }

    public static int b(byte b2, int i2, int i3, double d2) {
        return c(j(b2, i2, i3), b(d2));
    }

    public static double[] q() {
        double[] dArr = bp;
        return new double[]{b(dArr[0]), b(dArr[1])};
    }

    public static double[] d(byte b2, int i2, int i3, int i4) {
        double d2;
        double d3;
        double d4;
        if (e(b2) == 0) {
            double d5 = (d(b2, i3, i2) * bk[e(b2)][e(i2)]) - 1.8d;
            double d6 = 0.85d * d5;
            double d7 = d5 * 1.15d;
            LogUtil.a("HealthStandard", "getSkeletalMuscleValue gender is female low = ", Double.valueOf(d6), ", high = ", Double.valueOf(d7));
            return new double[]{b(d6), b(d7)};
        }
        if (i4 != 0) {
            double d8 = (d(b2, i3, i2) * bk[e(b2)][e(i2)]) - 1.8d;
            d3 = 0.85d * d8;
            d4 = d8 * 1.15d;
        } else {
            if (b2 == 0) {
                d2 = bj[h(i3)];
            } else {
                d2 = bn[c(i3)];
            }
            d3 = d2;
            if (b2 == 0) {
                d4 = bm[h(i3)];
            } else {
                d4 = bo[c(i3)];
            }
        }
        LogUtil.a("HealthStandard", "getSkeletalMuscleValue gender is male low = ", Double.valueOf(d3), ", high = ", Double.valueOf(d4));
        return new double[]{b(d3), b(d4)};
    }

    public static int e(byte b2, int i2, int i3, double d2, int i4) {
        return c(d(b2, i2, i3, i4), b(d2));
    }

    public static int f(byte b2, int i2, int i3, double d2, int i4) {
        return e(q(), d(b2, i2, i3, i4), b(d2), 1);
    }

    public static double[] p() {
        double[] dArr = bl;
        return new double[]{b(dArr[0]), b(dArr[1])};
    }

    public static double[] d(byte b2, int i2) {
        return new double[]{b(bd[e(b2)][a(i2)]), b(bf[e(b2)][a(i2)])};
    }

    public static int c(byte b2, double d2, int i2) {
        return c(d(b2, i2), b(d2));
    }

    public static int a(byte b2, double d2, int i2) {
        return e(p(), d(b2, i2), b(d2), 1);
    }

    public static double[] w() {
        double[] dArr = ci;
        return new double[]{b(dArr[0]), b(dArr[1])};
    }

    public static double[] z() {
        double[] dArr = cd;
        return new double[]{b(dArr[0]), b(dArr[1]), b(dArr[2])};
    }

    public static String[] u() {
        double[] dArrZ = z();
        return new String[]{e(dArrZ[0]), e(dArrZ[1]), e(dArrZ[2])};
    }

    public static int i(double d2) {
        double[] dArrZ = z();
        double d3 = dArrZ[0];
        double d4 = dArrZ[1];
        double d5 = dArrZ[2];
        double dB = b(d2);
        if (dB < d3) {
            return 1;
        }
        if (dB < d4) {
            return 2;
        }
        return dB < d5 ? 3 : 4;
    }

    public static int f(double d2) {
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double[] dArrW = w();
        double[] dArrZ = z();
        double d9 = dArrW[0];
        double d10 = dArrW[1];
        double d11 = dArrZ[0];
        double d12 = dArrZ[1];
        double d13 = dArrZ[2];
        double dB = b(d2);
        double d14 = 2400.0d;
        if (dB < d11) {
            dB = Math.max(dB, d9);
            d3 = 0.0d;
        } else {
            double d15 = 5000.0d;
            if (dB < d12) {
                d10 = d12;
            } else {
                d14 = 7600.0d;
                if (dB < d13) {
                    d11 = d13;
                    d3 = 5000.0d;
                    d9 = d12;
                } else {
                    dB = Math.min(dB, d10);
                    d15 = 10000.0d;
                    d11 = d13;
                }
            }
            d4 = d15;
            d5 = d10;
            d6 = d11;
            d7 = dB;
            d8 = d14;
            return b(d5, d6, d4, d7, d8);
        }
        d8 = d3;
        d6 = d9;
        d5 = d11;
        d7 = dB;
        d4 = d14;
        return b(d5, d6, d4, d7, d8);
    }

    public static double[] y() {
        double[] dArr = bw;
        return new double[]{b(dArr[0]), b(dArr[1])};
    }

    public static double[] h(byte b2, int i2) {
        return new double[]{b(bt[e(b2)][a(i2)]), b(br[e(b2)][a(i2)])};
    }

    public static String[] b(byte b2, int i2) {
        double[] dArrH = h(b2, i2);
        return new String[]{e(dArrH[0]), e(dArrH[1])};
    }

    public static int b(byte b2, double d2, int i2) {
        return c(h(b2, i2), b(d2));
    }

    public static int d(byte b2, double d2, int i2) {
        return e(y(), h(b2, i2), b(d2), 1);
    }

    public static double[] t() {
        double[] dArr = bh;
        return new double[]{b(dArr[0]), b(dArr[1])};
    }

    public static double[] e(byte b2, int i2) {
        return new double[]{b(ba[e(b2)][e(i2)]), b(az[e(b2)][e(i2)])};
    }

    public static String[] a(byte b2, int i2) {
        double[] dArrE = e(b2, i2);
        return new String[]{e(dArrE[0]), e(dArrE[1])};
    }

    public static int a(byte b2, int i2, double d2) {
        return c(e(b2, i2), b(d2));
    }

    public static int d(byte b2, int i2, double d2) {
        return e(new double[]{t()[0], 35.0d}, e(b2, i2), b(d2), 1);
    }

    public static double[] b() {
        double[] dArr = x;
        return new double[]{b(dArr[0]), b(dArr[1])};
    }

    public static double[] c(byte b2, int i2, int i3) {
        double d2;
        double d3;
        double d4 = d(b2, i2, i3);
        if (i3 < 6 || i3 > 17) {
            if (b2 == 0) {
                d2 = r[j(d4)];
            } else {
                d2 = v[g(d4)];
            }
            if (b2 == 0) {
                d3 = t[j(d4)];
            } else {
                d3 = y[g(d4)];
            }
        } else {
            if (b2 == 0) {
                d2 = aj[j(d4)];
            } else {
                d2 = ak[g(d4)];
            }
            if (b2 == 0) {
                d3 = an[j(d4)];
            } else {
                d3 = am[g(d4)];
            }
        }
        return new double[]{UnitUtil.d(d2, 2), UnitUtil.d(d3, 2)};
    }

    public static String[] b(byte b2, int i2, int i3, int i4) {
        double[] dArrC = c(b2, i2, i4);
        return new String[]{UnitUtil.e(UnitUtil.d(dArrC[0], i3), 1, i3), UnitUtil.e(UnitUtil.d(dArrC[1], i3), 1, i3)};
    }

    public static int c(fae faeVar) {
        return c(c(faeVar.c(), faeVar.d(), faeVar.b()), UnitUtil.d(faeVar.a(), faeVar.e()));
    }

    public static int e(fae faeVar) {
        return e(b(), c(faeVar.c(), faeVar.d(), faeVar.b()), UnitUtil.d(faeVar.a(), faeVar.e()), faeVar.e());
    }

    public static double[] d() {
        double[] dArr = e;
        return new double[]{n(dArr[0]), n(dArr[1])};
    }

    public static double[] e(byte b2, int i2, double d2, int i3) {
        double d3;
        double d4;
        if (i3 == 0) {
            double d5 = f33662c[e(b2)][f(i2)];
            d3 = d5 * 0.9d;
            d4 = d5 * 1.1d;
        } else {
            d3 = f33660a[e(b2)][e(i2)] * d2;
            d4 = f33661b[e(b2)][e(i2)] * d2;
        }
        return new double[]{n(d3), n(d4)};
    }

    public static String[] d(byte b2, int i2, double d2, int i3) {
        double[] dArrE = e(b2, i2, d2, i3);
        return new String[]{l(dArrE[0]), l(dArrE[1])};
    }

    public static int b(byte b2, int i2, double d2, double d3, int i3) {
        return c(e(b2, i2, d2, i3), n(d3));
    }

    public static int a(byte b2, int i2, double d2, double d3, int i3) {
        return e(new double[]{d()[0], 2500.0d}, e(b2, i2, d2, i3), n(d3), 1);
    }

    public static double[] j() {
        double[] dArr = al;
        return new double[]{n(dArr[0]), n(dArr[1])};
    }

    public static double[] i() {
        double[] dArr = ah;
        return new double[]{n(dArr[0]), n(dArr[1]), n(dArr[2])};
    }

    public static int a(double d2) {
        double dN = n(d2);
        double[] dArrI = i();
        if (dN <= dArrI[0]) {
            return 1;
        }
        if (dN <= dArrI[1]) {
            return 2;
        }
        return dN <= dArrI[2] ? 3 : 4;
    }

    public static double[] ad() {
        double[] dArr = cj;
        return new double[]{UnitUtil.d(dArr[0], 2), UnitUtil.d(dArr[1], 2)};
    }

    public static double[] b(byte b2) {
        return new double[]{UnitUtil.d(ch[e(b2)], 2)};
    }

    public static int c(byte b2, double d2) {
        return UnitUtil.d(d2, 2) < b(b2)[0] ? 1 : 2;
    }

    public static double[] l() {
        double[] dArr = bb;
        return new double[]{n(dArr[0]), n(dArr[1])};
    }

    public static double[] o() {
        double[] dArr = bc;
        return new double[]{n(dArr[0]), n(dArr[1]), n(dArr[2])};
    }

    public static int d(double d2) {
        double dN = n(d2);
        double[] dArrO = o();
        if (dN <= dArrO[0]) {
            return 1;
        }
        if (dN <= dArrO[1]) {
            return 2;
        }
        return dN <= dArrO[2] ? 3 : 4;
    }

    public static double[] r() {
        double[] dArr = bg;
        return new double[]{b(dArr[0]), b(dArr[1])};
    }

    public static double[] x() {
        double[] dArr = bz;
        return new double[]{b(dArr[0]), b(dArr[1])};
    }

    public static double[] n() {
        double[] dArr = ao;
        return new double[]{b(dArr[0]), b(dArr[1])};
    }

    public static double[] f() {
        double[] dArr = ad;
        return new double[]{n(dArr[0]), n(dArr[1])};
    }

    public static double[] s() {
        double[] dArr = bi;
        return new double[]{n(dArr[0]), n(dArr[1])};
    }

    public static double[] c() {
        double[] dArr = m;
        return new double[]{n(dArr[0]), n(dArr[1])};
    }

    public static double[] e() {
        double[] dArr = q;
        return new double[]{n(dArr[0]), n(dArr[1])};
    }

    public static double[] a() {
        double[] dArr = s;
        return new double[]{n(dArr[0]), n(dArr[1])};
    }

    public static int a(byte b2, int i2, double d2, int i3) {
        double dB = b(d2);
        double[] dArrB = b(b2, i2, i3);
        if (dB < dArrB[0]) {
            return 1;
        }
        return dB <= b((dArrB[1] + dArrB[2]) / 2.0d) ? 2 : 3;
    }

    public static int b(int i2, double d2) {
        int iB = CommonUtil.b(String.valueOf(new BigDecimal(d2).setScale(0, 4)), 10);
        int i3 = 1;
        if (iB != 1) {
            i3 = 2;
            if (iB != 2) {
                i3 = 3;
                if (iB != 3) {
                    if (iB != 4) {
                        return iB != 5 ? 0 : 5;
                    }
                    return i2 == 0 ? 5 : 4;
                }
            }
        }
        return i3;
    }
}
