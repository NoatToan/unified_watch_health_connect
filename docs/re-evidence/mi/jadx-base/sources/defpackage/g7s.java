package defpackage;

import android.content.Context;
import com.amap.api.maps.model.LatLng;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.util.a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class g7s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f18697a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static double f18698b = 3.141592653589793d;
    public static final double[] c = {25.575374d, 120.391111d};
    public static final double[] d = {21.405235d, 121.649046d};
    public static final List<LatLng> e = new ArrayList(Arrays.asList(new LatLng(23.379947d, 119.757001d), new LatLng(24.983296d, 120.474496d), new LatLng(25.518722d, 121.359866d), new LatLng(25.41329d, 122.443582d), new LatLng(24.862708d, 122.288354d), new LatLng(24.461292d, 122.188319d), new LatLng(21.584761d, 120.968923d), new LatLng(21.830837d, 120.654445d)));
    public static double f = 6378245.0d;
    public static double g = 0.006693421622965943d;

    public static double a(double d2) {
        return Math.sin(d2 * 3000.0d * (f18698b / 180.0d)) * 2.0E-5d;
    }

    public static double b(double d2, double d3) {
        return (Math.cos(d3 / 100000.0d) * (d2 / 18000.0d)) + (Math.sin(d2 / 100000.0d) * (d3 / 9000.0d));
    }

    public static LatLng c(Context context, LatLng latLng) {
        if (context == null) {
            return null;
        }
        if (!wls.a(latLng.latitude, latLng.longitude)) {
            return latLng;
        }
        DPoint dPointF = f(DPoint.obtain(latLng.longitude, latLng.latitude), f18697a);
        LatLng latLng2 = new LatLng(dPointF.y, dPointF.x, false);
        dPointF.recycle();
        return latLng2;
    }

    public static LatLng d(LatLng latLng) {
        if (latLng != null) {
            try {
                if (wls.a(latLng.latitude, latLng.longitude)) {
                    DPoint dPointM = m(latLng.longitude, latLng.latitude);
                    LatLng latLng2 = new LatLng(dPointM.y, dPointM.x, false);
                    dPointM.recycle();
                    return latLng2;
                }
                if (!n(latLng.latitude, latLng.longitude)) {
                    return latLng;
                }
                DPoint dPointM2 = m(latLng.longitude, latLng.latitude);
                return o(dPointM2.y, dPointM2.x);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return latLng;
    }

    public static DPoint e(double d2, double d3, double d4, double d5) {
        DPoint dPointObtain = DPoint.obtain();
        double d6 = d2 - d4;
        double d7 = d3 - d5;
        DPoint dPointL = l(d6, d7);
        dPointObtain.x = j((d2 + d6) - dPointL.x);
        dPointObtain.y = j((d3 + d7) - dPointL.y);
        return dPointObtain;
    }

    public static DPoint f(DPoint dPoint, boolean z) {
        try {
            if (!wls.a(dPoint.y, dPoint.x)) {
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

    public static double g(double d2) {
        return Math.cos(d2 * 3000.0d * (f18698b / 180.0d)) * 3.0E-6d;
    }

    public static double h(double d2, double d3) {
        return (Math.sin(d3 / 100000.0d) * (d2 / 18000.0d)) + (Math.cos(d2 / 100000.0d) * (d3 / 9000.0d));
    }

    public static LatLng i(Context context, LatLng latLng) {
        try {
            if (!wls.a(latLng.latitude, latLng.longitude)) {
                return latLng;
            }
            DPoint dPointK = k(latLng.longitude, latLng.latitude);
            LatLng latLngC = c(context, new LatLng(dPointK.y, dPointK.x, false));
            dPointK.recycle();
            return latLngC;
        } catch (Throwable th) {
            th.printStackTrace();
            return latLng;
        }
    }

    public static double j(double d2) {
        return new BigDecimal(d2).setScale(8, 4).doubleValue();
    }

    public static DPoint k(double d2, double d3) {
        double d4 = ((long) (d2 * 100000.0d)) % 36000000;
        double d5 = ((long) (d3 * 100000.0d)) % 36000000;
        double d6 = (int) ((-b(d4, d5)) + d4);
        double d7 = (int) ((-h(d4, d5)) + d5);
        double d8 = (int) ((-b(d6, d7)) + d4 + ((double) (d4 > 0.0d ? 1 : -1)));
        return DPoint.obtain(d8 / 100000.0d, ((double) ((int) (((-h(d8, d7)) + d5) + ((double) (d5 > 0.0d ? 1 : -1))))) / 100000.0d);
    }

    public static DPoint l(double d2, double d3) {
        DPoint dPointObtain = DPoint.obtain();
        double d4 = (d2 * d2) + (d3 * d3);
        double dCos = (Math.cos(g(d2) + Math.atan2(d3, d2)) * (a(d3) + Math.sqrt(d4))) + 0.0065d;
        double dSin = (Math.sin(g(d2) + Math.atan2(d3, d2)) * (a(d3) + Math.sqrt(d4))) + 0.006d;
        dPointObtain.x = j(dCos);
        dPointObtain.y = j(dSin);
        return dPointObtain;
    }

    public static DPoint m(double d2, double d3) {
        DPoint dPointE = null;
        double d4 = 0.006401062d;
        double d5 = 0.0060424805d;
        for (int i = 0; i < 2; i++) {
            dPointE = e(d2, d3, d4, d5);
            d4 = d2 - dPointE.x;
            d5 = d3 - dPointE.y;
        }
        return dPointE;
    }

    public static boolean n(double d2, double d3) {
        return zns.N(new LatLng(d2, d3), e);
    }

    public static LatLng o(double d2, double d3) {
        LatLng latLngP = p(d2, d3);
        return new LatLng((d2 * 2.0d) - latLngP.latitude, (d3 * 2.0d) - latLngP.longitude);
    }

    public static LatLng p(double d2, double d3) {
        double d4 = d3 - 105.0d;
        double d5 = d2 - 35.0d;
        double dQ = q(d4, d5);
        double dR = r(d4, d5);
        double d6 = (d2 / 180.0d) * f18698b;
        double dSin = Math.sin(d6);
        double d7 = 1.0d - ((g * dSin) * dSin);
        double dSqrt = Math.sqrt(d7);
        double d8 = f;
        return new LatLng(d2 + ((dQ * 180.0d) / ((((1.0d - g) * d8) / (d7 * dSqrt)) * f18698b)), d3 + ((dR * 180.0d) / (((d8 / dSqrt) * Math.cos(d6)) * f18698b)));
    }

    public static double q(double d2, double d3) {
        double d4 = d2 * 2.0d;
        return (-100.0d) + d4 + (d3 * 3.0d) + (d3 * 0.2d * d3) + (0.1d * d2 * d3) + (Math.sqrt(Math.abs(d2)) * 0.2d) + ((((Math.sin((d2 * 6.0d) * f18698b) * 20.0d) + (Math.sin(d4 * f18698b) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(f18698b * d3) * 20.0d) + (Math.sin((d3 / 3.0d) * f18698b) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d3 / 12.0d) * f18698b) * 160.0d) + (Math.sin((d3 * f18698b) / 30.0d) * 320.0d)) * 2.0d) / 3.0d);
    }

    public static double r(double d2, double d3) {
        double d4 = d2 * 0.1d;
        return d2 + 300.0d + (d3 * 2.0d) + (d4 * d2) + (d4 * d3) + (Math.sqrt(Math.abs(d2)) * 0.1d) + ((((Math.sin((6.0d * d2) * f18698b) * 20.0d) + (Math.sin((d2 * 2.0d) * f18698b) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(f18698b * d2) * 20.0d) + (Math.sin((d2 / 3.0d) * f18698b) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d2 / 12.0d) * f18698b) * 150.0d) + (Math.sin((d2 / 30.0d) * f18698b) * 300.0d)) * 2.0d) / 3.0d);
    }
}
