package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.maps.model.LatLng;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.util.a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class aq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static double f2216a = 3.141592653589793d;
    private static boolean d = false;
    private static final double[] e = {25.575374d, 120.391111d};
    private static final double[] f = {21.405235d, 121.649046d};
    private static final List<LatLng> g = new ArrayList(Arrays.asList(new LatLng(23.379947d, 119.757001d), new LatLng(24.983296d, 120.474496d), new LatLng(25.518722d, 121.359866d), new LatLng(25.41329d, 122.443582d), new LatLng(24.862708d, 122.288354d), new LatLng(24.461292d, 122.188319d), new LatLng(21.584761d, 120.968923d), new LatLng(21.830837d, 120.654445d)));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static double f2217b = 6378245.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static double f2218c = 0.006693421622965943d;

    public static LatLng a(Context context, LatLng latLng) {
        if (context == null) {
            return null;
        }
        if (!du.a(latLng.latitude, latLng.longitude)) {
            return latLng;
        }
        DPoint dPointA = a(DPoint.obtain(latLng.longitude, latLng.latitude), d);
        LatLng latLng2 = new LatLng(dPointA.y, dPointA.x, false);
        dPointA.recycle();
        return latLng2;
    }

    private static DPoint a(DPoint dPoint, boolean z) {
        try {
            if (!du.a(dPoint.y, dPoint.x)) {
                return dPoint;
            }
            double[] dArrA = new double[2];
            if (!z) {
                dArrA = a.a(dPoint.x, dPoint.y);
            }
            dPoint.recycle();
            return DPoint.obtain(dArrA[0], dArrA[1]);
        } catch (Throwable unused) {
            return dPoint;
        }
    }

    public static LatLng b(Context context, LatLng latLng) {
        try {
            if (!du.a(latLng.latitude, latLng.longitude)) {
                return latLng;
            }
            DPoint dPointC = c(latLng.longitude, latLng.latitude);
            LatLng latLngA = a(context, new LatLng(dPointC.y, dPointC.x, false));
            dPointC.recycle();
            return latLngA;
        } catch (Throwable th) {
            th.printStackTrace();
            return latLng;
        }
    }

    private static double a(double d2, double d3) {
        return (Math.cos(d3 / 100000.0d) * (d2 / 18000.0d)) + (Math.sin(d2 / 100000.0d) * (d3 / 9000.0d));
    }

    private static double b(double d2, double d3) {
        return (Math.sin(d3 / 100000.0d) * (d2 / 18000.0d)) + (Math.cos(d2 / 100000.0d) * (d3 / 9000.0d));
    }

    private static DPoint c(double d2, double d3) {
        double d4 = ((long) (d2 * 100000.0d)) % 36000000;
        double d5 = ((long) (d3 * 100000.0d)) % 36000000;
        double d6 = (int) ((-a(d4, d5)) + d4);
        double d7 = (int) ((-b(d4, d5)) + d5);
        double d8 = (int) ((-a(d6, d7)) + d4 + ((double) (d4 > 0.0d ? 1 : -1)));
        return DPoint.obtain(d8 / 100000.0d, ((double) ((int) (((-b(d8, d7)) + d5) + ((double) (d5 > 0.0d ? 1 : -1))))) / 100000.0d);
    }

    public static LatLng a(LatLng latLng) {
        if (latLng != null) {
            try {
                if (du.a(latLng.latitude, latLng.longitude)) {
                    DPoint dPointE = e(latLng.longitude, latLng.latitude);
                    LatLng latLng2 = new LatLng(dPointE.y, dPointE.x, false);
                    dPointE.recycle();
                    return latLng2;
                }
                if (f(latLng.latitude, latLng.longitude)) {
                    DPoint dPointE2 = e(latLng.longitude, latLng.latitude);
                    return g(dPointE2.y, dPointE2.x);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return latLng;
    }

    private static double a(double d2) {
        return Math.sin(d2 * 3000.0d * (f2216a / 180.0d)) * 2.0E-5d;
    }

    private static double b(double d2) {
        return Math.cos(d2 * 3000.0d * (f2216a / 180.0d)) * 3.0E-6d;
    }

    private static DPoint d(double d2, double d3) {
        DPoint dPointObtain = DPoint.obtain();
        double dCos = Math.cos(b(d2) + Math.atan2(d3, d2));
        double dA = a(d3);
        double d4 = (d2 * d2) + (d3 * d3);
        double dSqrt = Math.sqrt(d4);
        double dSin = Math.sin(b(d2) + Math.atan2(d3, d2));
        double dA2 = a(d3);
        double dSqrt2 = Math.sqrt(d4);
        dPointObtain.x = c((dCos * (dA + dSqrt)) + 0.0065d);
        dPointObtain.y = c((dSin * (dA2 + dSqrt2)) + 0.006d);
        return dPointObtain;
    }

    private static double c(double d2) {
        return new BigDecimal(d2).setScale(8, 4).doubleValue();
    }

    private static DPoint e(double d2, double d3) {
        DPoint dPointA = null;
        double d4 = 0.006401062d;
        double d5 = 0.0060424805d;
        for (int i = 0; i < 2; i++) {
            dPointA = a(d2, d3, d4, d5);
            d4 = d2 - dPointA.x;
            d5 = d3 - dPointA.y;
        }
        return dPointA;
    }

    private static DPoint a(double d2, double d3, double d4, double d5) {
        DPoint dPointObtain = DPoint.obtain();
        double d6 = d2 - d4;
        double d7 = d3 - d5;
        DPoint dPointD = d(d6, d7);
        dPointObtain.x = c((d2 + d6) - dPointD.x);
        dPointObtain.y = c((d3 + d7) - dPointD.y);
        return dPointObtain;
    }

    private static boolean f(double d2, double d3) {
        return eb.a(new LatLng(d2, d3), g);
    }

    private static LatLng g(double d2, double d3) {
        LatLng latLngH = h(d2, d3);
        return new LatLng((d2 * 2.0d) - latLngH.latitude, (d3 * 2.0d) - latLngH.longitude);
    }

    private static LatLng h(double d2, double d3) {
        double d4 = d3 - 105.0d;
        double d5 = d2 - 35.0d;
        double dI = i(d4, d5);
        double dJ = j(d4, d5);
        double d6 = (d2 / 180.0d) * f2216a;
        double dSin = Math.sin(d6);
        double d7 = 1.0d - ((f2218c * dSin) * dSin);
        double dSqrt = Math.sqrt(d7);
        double d8 = f2217b;
        return new LatLng(d2 + ((dI * 180.0d) / ((((1.0d - f2218c) * d8) / (d7 * dSqrt)) * f2216a)), d3 + ((dJ * 180.0d) / (((d8 / dSqrt) * Math.cos(d6)) * f2216a)));
    }

    private static double i(double d2, double d3) {
        double d4 = d2 * 2.0d;
        double dSqrt = Math.sqrt(Math.abs(d2));
        return (d4 - 100.0d) + (d3 * 3.0d) + (d3 * 0.2d * d3) + (0.1d * d2 * d3) + (dSqrt * 0.2d) + ((((Math.sin((6.0d * d2) * f2216a) * 20.0d) + (Math.sin(f2216a * d4) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(f2216a * d3) * 20.0d) + (Math.sin((d3 / 3.0d) * f2216a) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d3 / 12.0d) * f2216a) * 160.0d) + (Math.sin((f2216a * d3) / 30.0d) * 320.0d)) * 2.0d) / 3.0d);
    }

    private static double j(double d2, double d3) {
        double d4 = d2 * 0.1d;
        double dSqrt = Math.sqrt(Math.abs(d2));
        double dSin = (((Math.sin((6.0d * d2) * f2216a) * 20.0d) + (Math.sin((d2 * 2.0d) * f2216a) * 20.0d)) * 2.0d) / 3.0d;
        return d2 + 300.0d + (d3 * 2.0d) + (d4 * d2) + (d4 * d3) + (dSqrt * 0.1d) + dSin + ((((Math.sin(f2216a * d2) * 20.0d) + (Math.sin((d2 / 3.0d) * f2216a) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d2 / 12.0d) * f2216a) * 150.0d) + (Math.sin((d2 / 30.0d) * f2216a) * 300.0d)) * 2.0d) / 3.0d);
    }
}
