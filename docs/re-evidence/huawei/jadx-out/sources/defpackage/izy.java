package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class izy {
    public static jpg b(jpi jpiVar) {
        return new jpg(jpiVar.i(), jpiVar.h());
    }

    public static jpg e(jpg jpgVar) {
        jpg jpgVarD = d(jpgVar);
        return new jpg(jpgVar.d + jpgVarD.d, jpgVar.f38787a + jpgVarD.f38787a);
    }

    public static List<jpg> e(List<jpg> list) {
        if (njy.e(list)) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<jpg> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(e(it.next()));
        }
        return arrayList;
    }

    public static jpg b(jpg jpgVar) {
        jpg jpgVarD = d(jpgVar);
        return new jpg(jpgVar.d - jpgVarD.d, jpgVar.f38787a - jpgVarD.f38787a);
    }

    private static jpg d(jpg jpgVar) {
        double dA = a(jpgVar.f38787a - 105.0d, jpgVar.d - 35.0d);
        double dB = b(jpgVar.f38787a - 105.0d, jpgVar.d - 35.0d);
        double d = (jpgVar.d / 180.0d) * 3.141592653589793d;
        double dSin = Math.sin(d);
        double d2 = 1.0d - ((0.006693421622965943d * dSin) * dSin);
        double dSqrt = Math.sqrt(d2);
        return new jpg((dA * 180.0d) / ((6335552.717000426d / (d2 * dSqrt)) * 3.141592653589793d), (dB * 180.0d) / (((6378245.0d / dSqrt) * Math.cos(d)) * 3.141592653589793d));
    }

    public static jpg e(double[] dArr) {
        double[] dArrD = d(dArr);
        return new jpg(dArr[0] - dArrD[0], dArr[1] - dArrD[1]);
    }

    private static double[] d(double[] dArr) {
        double dA = a(dArr[1] - 105.0d, dArr[0] - 35.0d);
        double dB = b(dArr[1] - 105.0d, dArr[0] - 35.0d);
        double d = (dArr[0] / 180.0d) * 3.141592653589793d;
        double dSin = Math.sin(d);
        double d2 = 1.0d - ((0.006693421622965943d * dSin) * dSin);
        double dSqrt = Math.sqrt(d2);
        return new double[]{(dA * 180.0d) / ((6335552.717000426d / (d2 * dSqrt)) * 3.141592653589793d), (dB * 180.0d) / (((6378245.0d / dSqrt) * Math.cos(d)) * 3.141592653589793d)};
    }

    private static double a(double d, double d2) {
        double d3 = d * 2.0d;
        double dSqrt = Math.sqrt(Math.abs(d));
        double d4 = d2 * 3.141592653589793d;
        return (d3 - 100.0d) + (d2 * 3.0d) + (d2 * 0.2d * d2) + (0.1d * d * d2) + (dSqrt * 0.2d) + ((((Math.sin((6.0d * d) * 3.141592653589793d) * 20.0d) + (Math.sin(d3 * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(d4) * 20.0d) + (Math.sin((d2 / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d2 / 12.0d) * 3.141592653589793d) * 160.0d) + (Math.sin(d4 / 30.0d) * 320.0d)) * 2.0d) / 3.0d);
    }

    private static double b(double d, double d2) {
        double d3 = d * 0.1d;
        double dSqrt = Math.sqrt(Math.abs(d));
        double dSin = (((Math.sin((6.0d * d) * 3.141592653589793d) * 20.0d) + (Math.sin((d * 2.0d) * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d;
        return d + 300.0d + (d2 * 2.0d) + (d3 * d) + (d3 * d2) + (dSqrt * 0.1d) + dSin + ((((Math.sin(d * 3.141592653589793d) * 20.0d) + (Math.sin((d / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d / 12.0d) * 3.141592653589793d) * 150.0d) + (Math.sin((d / 30.0d) * 3.141592653589793d) * 300.0d)) * 2.0d) / 3.0d);
    }
}
