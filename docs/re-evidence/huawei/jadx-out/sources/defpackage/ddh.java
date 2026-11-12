package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes6.dex */
public class ddh {
    private static double e(double d, double d2, double d3, double d4) {
        return d * 0.5d * d2 * d3 * d4 * d4;
    }

    public static double a(double d, int i, double d2) {
        return e(d, e(d2, i), Math.atan(d2 / 10000.0d));
    }

    public static double e(double d, int i) {
        LogUtil.a("SlopeToPower", "calculationSpeedBySlope ratio is: ", Double.valueOf(d), "; rpm is :" + i);
        return (((double) i) / (((Math.max(0.0d, d) * 0.0338d) / 10.0d) + 3.333d)) / 3.6d;
    }

    public static double e(double d, double d2, double d3) {
        ReleaseLogUtil.d("R_SlopeToPower", "translateSlopeToPower: ", Double.valueOf(d2), "  degree:", Double.valueOf(d3));
        if (d <= 0.0d) {
            ReleaseLogUtil.e("R_SlopeToPower", "isWeightValid");
            return 0.0d;
        }
        if (d2 <= 0.0d) {
            return 0.0d;
        }
        double d4 = d + 8.0d;
        double dA = a(0.005d, d4, d3);
        LogUtil.a("SlopeToPower", "frictional is ", Double.valueOf(dA));
        double dE = e(0.63d, 1.226d, 0.65d, d2);
        LogUtil.a("SlopeToPower", "windResistance is ", Double.valueOf(dE));
        double dA2 = a(d4, d3, dA, dE, 0.95d);
        LogUtil.a("SlopeToPower", "drivingForce is ", Double.valueOf(dA2));
        double dMax = Math.max(dA2 * d2, 1.0d);
        ReleaseLogUtil.e("R_SlopeToPower", "translateSlopeToPower: ", Double.valueOf(dMax));
        return dMax;
    }

    private static double a(double d, double d2, double d3, double d4, double d5) {
        if (d5 <= 0.0d || d5 > 1.0d) {
            ReleaseLogUtil.e("R_SlopeToPower", "efficiency is invalids: ", Double.valueOf(d5));
            d5 = 0.95d;
        }
        return ((((d * 9.8d) * Math.sin(d2)) + d3) + d4) / d5;
    }

    private static double a(double d, double d2, double d3) {
        return d * d2 * 9.8d * Math.cos(d3);
    }
}
