package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class t4i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static double f34305a = 3.141592653589793d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static double f34306b = 6378245.0d;
    public static double c = 0.006693421622965943d;

    public static s2b a(double d, double d2) {
        s2b s2bVarD = d(d, d2);
        return new s2b((d * 2.0d) - s2bVarD.a(), (d2 * 2.0d) - s2bVarD.b());
    }

    public static s2b b(double d, double d2) {
        if (c(d, d2)) {
            return new s2b(d, d2);
        }
        double d3 = d2 - 105.0d;
        double d4 = d - 35.0d;
        double dE = e(d3, d4);
        double dF = f(d3, d4);
        double d5 = (d / 180.0d) * f34305a;
        double dSin = Math.sin(d5);
        double d6 = 1.0d - ((c * dSin) * dSin);
        double dSqrt = Math.sqrt(d6);
        double d7 = f34306b;
        return new s2b(d + ((dE * 180.0d) / ((((1.0d - c) * d7) / (d6 * dSqrt)) * f34305a)), d2 + ((dF * 180.0d) / (((d7 / dSqrt) * Math.cos(d5)) * f34305a)));
    }

    public static boolean c(double d, double d2) {
        return d2 < 72.004d || d2 > 137.8347d || d < 0.8293d || d > 55.8271d;
    }

    public static s2b d(double d, double d2) {
        if (c(d, d2)) {
            return new s2b(d, d2);
        }
        double d3 = d2 - 105.0d;
        double d4 = d - 35.0d;
        double dE = e(d3, d4);
        double dF = f(d3, d4);
        double d5 = (d / 180.0d) * f34305a;
        double dSin = Math.sin(d5);
        double d6 = 1.0d - ((c * dSin) * dSin);
        double dSqrt = Math.sqrt(d6);
        double d7 = f34306b;
        return new s2b(d + ((dE * 180.0d) / ((((1.0d - c) * d7) / (d6 * dSqrt)) * f34305a)), d2 + ((dF * 180.0d) / (((d7 / dSqrt) * Math.cos(d5)) * f34305a)));
    }

    public static double e(double d, double d2) {
        double d3 = d * 2.0d;
        return (-100.0d) + d3 + (d2 * 3.0d) + (d2 * 0.2d * d2) + (0.1d * d * d2) + (Math.sqrt(Math.abs(d)) * 0.2d) + ((((Math.sin((d * 6.0d) * f34305a) * 20.0d) + (Math.sin(d3 * f34305a) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(f34305a * d2) * 20.0d) + (Math.sin((d2 / 3.0d) * f34305a) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d2 / 12.0d) * f34305a) * 160.0d) + (Math.sin((d2 * f34305a) / 30.0d) * 320.0d)) * 2.0d) / 3.0d);
    }

    public static double f(double d, double d2) {
        double d3 = d * 0.1d;
        return d + 300.0d + (d2 * 2.0d) + (d3 * d) + (d3 * d2) + (Math.sqrt(Math.abs(d)) * 0.1d) + ((((Math.sin((6.0d * d) * f34305a) * 20.0d) + (Math.sin((d * 2.0d) * f34305a) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(f34305a * d) * 20.0d) + (Math.sin((d / 3.0d) * f34305a) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d / 12.0d) * f34305a) * 150.0d) + (Math.sin((d / 30.0d) * f34305a) * 300.0d)) * 2.0d) / 3.0d);
    }
}
