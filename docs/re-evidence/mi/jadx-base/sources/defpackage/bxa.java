package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public class bxa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static double f4695a = 3.141592653589793d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static double f4696b = 52.35987755982988d;
    public static double c = 6378245.0d;
    public static double d = 0.006693421622965943d;

    public static double[] a(double d2, double d3) {
        double dSqrt = Math.sqrt((d3 * d3) + (d2 * d2)) + (Math.sin(f4696b * d2) * 2.0E-5d);
        double dAtan2 = Math.atan2(d2, d3) + (Math.cos(d3 * f4696b) * 3.0E-6d);
        return new double[]{(dSqrt * Math.sin(dAtan2)) + 0.006d, (Math.cos(dAtan2) * dSqrt) + 0.0065d};
    }

    public static double[] b(double d2, double d3) {
        double[] dArrE = e(d2, d3);
        return new double[]{(d2 * 2.0d) - dArrE[0], (d3 * 2.0d) - dArrE[1]};
    }

    public static double[] c(double d2, double d3) {
        if (d(d2, d3)) {
            return new double[]{d2, d3};
        }
        double d4 = d3 - 105.0d;
        double d5 = d2 - 35.0d;
        double dF = f(d4, d5);
        double dG = g(d4, d5);
        double d6 = (d2 / 180.0d) * f4695a;
        double dSin = Math.sin(d6);
        double d7 = 1.0d - ((d * dSin) * dSin);
        double dSqrt = Math.sqrt(d7);
        double d8 = c;
        return new double[]{d2 + ((dF * 180.0d) / ((((1.0d - d) * d8) / (d7 * dSqrt)) * f4695a)), d3 + ((dG * 180.0d) / (((d8 / dSqrt) * Math.cos(d6)) * f4695a))};
    }

    public static boolean d(double d2, double d3) {
        return d3 < 72.004d || d3 > 137.8347d || d2 < 0.8293d || d2 > 55.8271d;
    }

    public static double[] e(double d2, double d3) {
        if (d(d2, d3)) {
            return new double[]{d2, d3};
        }
        double d4 = d3 - 105.0d;
        double d5 = d2 - 35.0d;
        double dF = f(d4, d5);
        double dG = g(d4, d5);
        double d6 = (d2 / 180.0d) * f4695a;
        double dSin = Math.sin(d6);
        double d7 = 1.0d - ((d * dSin) * dSin);
        double dSqrt = Math.sqrt(d7);
        double d8 = c;
        return new double[]{d2 + ((dF * 180.0d) / ((((1.0d - d) * d8) / (d7 * dSqrt)) * f4695a)), d3 + ((dG * 180.0d) / (((d8 / dSqrt) * Math.cos(d6)) * f4695a))};
    }

    public static double f(double d2, double d3) {
        double d4 = d2 * 2.0d;
        return (-100.0d) + d4 + (d3 * 3.0d) + (d3 * 0.2d * d3) + (0.1d * d2 * d3) + (Math.sqrt(Math.abs(d2)) * 0.2d) + ((((Math.sin((d2 * 6.0d) * f4695a) * 20.0d) + (Math.sin(d4 * f4695a) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(f4695a * d3) * 20.0d) + (Math.sin((d3 / 3.0d) * f4695a) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d3 / 12.0d) * f4695a) * 160.0d) + (Math.sin((d3 * f4695a) / 30.0d) * 320.0d)) * 2.0d) / 3.0d);
    }

    public static double g(double d2, double d3) {
        double d4 = d2 * 0.1d;
        return d2 + 300.0d + (d3 * 2.0d) + (d4 * d2) + (d4 * d3) + (Math.sqrt(Math.abs(d2)) * 0.1d) + ((((Math.sin((6.0d * d2) * f4695a) * 20.0d) + (Math.sin((d2 * 2.0d) * f4695a) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(f4695a * d2) * 20.0d) + (Math.sin((d2 / 3.0d) * f4695a) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d2 / 12.0d) * f4695a) * 150.0d) + (Math.sin((d2 / 30.0d) * f4695a) * 300.0d)) * 2.0d) / 3.0d);
    }
}
