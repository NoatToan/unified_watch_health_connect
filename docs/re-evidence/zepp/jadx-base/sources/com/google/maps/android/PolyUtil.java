package com.google.maps.android;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* JADX INFO: loaded from: classes3.dex */
public class PolyUtil {
    private static final double a = 0.1d;

    private PolyUtil() {
    }

    private static void a(long j, StringBuffer stringBuffer) {
        long j2 = j << 1;
        if (j < 0) {
            j2 = ~j2;
        }
        while (j2 >= 32) {
            stringBuffer.append(Character.toChars((int) ((32 | (31 & j2)) + 63)));
            j2 >>= 5;
        }
        stringBuffer.append(Character.toChars((int) (j2 + 63)));
    }

    private static boolean b(double d, double d2, double d3, double d4, double d5, boolean z) {
        if ((d5 >= 0.0d && d5 >= d3) || ((d5 < 0.0d && d5 < d3) || d4 <= -1.5707963267948966d || d <= -1.5707963267948966d || d2 <= -1.5707963267948966d || d >= 1.5707963267948966d || d2 >= 1.5707963267948966d || d3 <= -3.141592653589793d)) {
            return false;
        }
        double d6 = (((d3 - d5) * d) + (d2 * d5)) / d3;
        if (d >= 0.0d && d2 >= 0.0d && d4 < d6) {
            return false;
        }
        if ((d <= 0.0d && d2 <= 0.0d && d4 >= d6) || d4 >= 1.5707963267948966d) {
            return true;
        }
        if (z) {
            if (Math.tan(d4) < g(d, d2, d3, d5)) {
                return false;
            }
        } else if (a.g(d4) < e(d, d2, d3, d5)) {
            return false;
        }
        return true;
    }

    private static boolean c(LatLng latLng, List<LatLng> list, boolean z, boolean z2, double d) {
        int size = list.size();
        if (size == 0) {
            return false;
        }
        double d2 = d / 6371009.0d;
        double dC = a.c(d2);
        double radians = Math.toRadians(latLng.latitude);
        double radians2 = Math.toRadians(latLng.longitude);
        LatLng latLng2 = list.get(z ? size - 1 : 0);
        double radians3 = Math.toRadians(latLng2.latitude);
        double radians4 = Math.toRadians(latLng2.longitude);
        if (z2) {
            double d3 = radians3;
            double d4 = radians4;
            for (LatLng latLng3 : list) {
                double radians5 = Math.toRadians(latLng3.latitude);
                double radians6 = Math.toRadians(latLng3.longitude);
                if (d(d3, d4, radians5, radians6, radians, radians2, dC)) {
                    return true;
                }
                d4 = radians6;
                d3 = radians5;
            }
            return false;
        }
        double d5 = radians - d2;
        double d6 = radians + d2;
        double dG = a.g(radians3);
        double dG2 = a.g(radians);
        double[] dArr = new double[3];
        Iterator<LatLng> it2 = list.iterator();
        while (it2.hasNext()) {
            LatLng next = it2.next();
            double d7 = d6;
            double radians7 = Math.toRadians(next.latitude);
            double dG3 = a.g(radians7);
            Iterator<LatLng> it3 = it2;
            double radians8 = Math.toRadians(next.longitude);
            if (Math.max(radians3, radians7) >= d5 && Math.min(radians3, radians7) <= d7) {
                double dK = a.k(radians8 - radians4, -3.141592653589793d, 3.141592653589793d);
                double dK2 = a.k(radians2 - radians4, -3.141592653589793d, 3.141592653589793d);
                dArr[0] = dK2;
                dArr[1] = dK2 + 6.283185307179586d;
                dArr[2] = dK2 - 6.283185307179586d;
                for (int i = 0; i < 3; i++) {
                    double d8 = dArr[i];
                    double d9 = dG3 - dG;
                    double d10 = (dK * dK) + (d9 * d9);
                    double dB = d10 > 0.0d ? a.b(((d8 * dK) + ((dG2 - dG) * d9)) / d10, 0.0d, 1.0d) : 0.0d;
                    if (a.d(radians, a.f(dG + (dB * d9)), d8 - (dB * dK)) < dC) {
                        return true;
                    }
                }
            }
            radians3 = radians7;
            radians4 = radians8;
            d6 = d7;
            dG = dG3;
            it2 = it3;
        }
        return false;
    }

    public static boolean containsLocation(LatLng latLng, List<LatLng> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return false;
        }
        double radians = Math.toRadians(latLng.latitude);
        double radians2 = Math.toRadians(latLng.longitude);
        LatLng latLng2 = list.get(size - 1);
        double radians3 = Math.toRadians(latLng2.latitude);
        double radians4 = Math.toRadians(latLng2.longitude);
        double d = radians3;
        int i = 0;
        for (LatLng latLng3 : list) {
            double dK = a.k(radians2 - radians4, -3.141592653589793d, 3.141592653589793d);
            if (radians == d && dK == 0.0d) {
                return true;
            }
            double radians5 = Math.toRadians(latLng3.latitude);
            double radians6 = Math.toRadians(latLng3.longitude);
            if (b(d, radians5, a.k(radians6 - radians4, -3.141592653589793d, 3.141592653589793d), radians, dK, z)) {
                i++;
            }
            d = radians5;
            radians4 = radians6;
        }
        return (i & 1) != 0;
    }

    private static boolean d(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8 = a.d(d, d5, d2 - d6);
        if (d8 <= d7) {
            return true;
        }
        double d9 = a.d(d3, d5, d4 - d6);
        if (d9 <= d7) {
            return true;
        }
        double dE = a.e(a.i(d8) * f(d, d2, d3, d4, d5, d6));
        if (dE > d7) {
            return false;
        }
        double d10 = a.d(d, d3, d2 - d4);
        double d11 = ((1.0d - (d10 * 2.0d)) * dE) + d10;
        if (d8 > d11 || d9 > d11) {
            return false;
        }
        if (d10 < 0.74d) {
            return true;
        }
        double d12 = 1.0d - (2.0d * dE);
        return a.j((d8 - dE) / d12, (d9 - dE) / d12) > 0.0d;
    }

    public static List<LatLng> decode(String str) {
        int i;
        int i2;
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < length) {
            int i6 = 1;
            int i7 = 0;
            while (true) {
                i = i3 + 1;
                int iCharAt = (str.charAt(i3) - '?') - 1;
                i6 += iCharAt << i7;
                i7 += 5;
                if (iCharAt < 31) {
                    break;
                }
                i3 = i;
            }
            int i8 = ((i6 & 1) != 0 ? ~(i6 >> 1) : i6 >> 1) + i4;
            int i9 = 1;
            int i10 = 0;
            while (true) {
                i2 = i + 1;
                int iCharAt2 = (str.charAt(i) - '?') - 1;
                i9 += iCharAt2 << i10;
                i10 += 5;
                if (iCharAt2 < 31) {
                    break;
                }
                i = i2;
            }
            int i11 = i9 & 1;
            int i12 = i9 >> 1;
            if (i11 != 0) {
                i12 = ~i12;
            }
            i5 += i12;
            arrayList.add(new LatLng(((double) i8) * 1.0E-5d, ((double) i5) * 1.0E-5d));
            i4 = i8;
            i3 = i2;
        }
        return arrayList;
    }

    public static double distanceToLine(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        if (latLng2.equals(latLng3)) {
            SphericalUtil.computeDistanceBetween(latLng3, latLng);
        }
        double radians = Math.toRadians(latLng.latitude);
        double radians2 = Math.toRadians(latLng.longitude);
        double radians3 = Math.toRadians(latLng2.latitude);
        double radians4 = Math.toRadians(latLng2.longitude);
        double radians5 = Math.toRadians(latLng3.latitude) - radians3;
        double radians6 = Math.toRadians(latLng3.longitude) - radians4;
        double d = (((radians - radians3) * radians5) + ((radians2 - radians4) * radians6)) / ((radians5 * radians5) + (radians6 * radians6));
        if (d <= 0.0d) {
            return SphericalUtil.computeDistanceBetween(latLng, latLng2);
        }
        return d >= 1.0d ? SphericalUtil.computeDistanceBetween(latLng, latLng3) : SphericalUtil.computeDistanceBetween(new LatLng(latLng.latitude - latLng2.latitude, latLng.longitude - latLng2.longitude), new LatLng((latLng3.latitude - latLng2.latitude) * d, d * (latLng3.longitude - latLng2.longitude)));
    }

    private static double e(double d, double d2, double d3, double d4) {
        return ((a.g(d) * (d3 - d4)) + (a.g(d2) * d4)) / d3;
    }

    public static String encode(List<LatLng> list) {
        StringBuffer stringBuffer = new StringBuffer();
        long j = 0;
        long j2 = 0;
        for (LatLng latLng : list) {
            long jRound = Math.round(latLng.latitude * 100000.0d);
            long jRound2 = Math.round(latLng.longitude * 100000.0d);
            a(jRound - j, stringBuffer);
            a(jRound2 - j2, stringBuffer);
            j = jRound;
            j2 = jRound2;
        }
        return stringBuffer.toString();
    }

    private static double f(double d, double d2, double d3, double d4, double d5, double d6) {
        double dSin = Math.sin(d);
        double dCos = Math.cos(d3);
        double dCos2 = Math.cos(d5);
        double d7 = d6 - d2;
        double d8 = d4 - d2;
        double dSin2 = Math.sin(d7) * dCos2;
        double dSin3 = Math.sin(d8) * dCos;
        double d9 = dSin * 2.0d;
        double dSin4 = Math.sin(d5 - d) + (dCos2 * d9 * a.c(d7));
        double dSin5 = Math.sin(d3 - d) + (d9 * dCos * a.c(d8));
        double d10 = ((dSin2 * dSin2) + (dSin4 * dSin4)) * ((dSin3 * dSin3) + (dSin5 * dSin5));
        if (d10 <= 0.0d) {
            return 1.0d;
        }
        return ((dSin2 * dSin5) - (dSin4 * dSin3)) / Math.sqrt(d10);
    }

    private static double g(double d, double d2, double d3, double d4) {
        return ((Math.tan(d) * Math.sin(d3 - d4)) + (Math.tan(d2) * Math.sin(d4))) / Math.sin(d3);
    }

    public static boolean isClosedPolygon(List<LatLng> list) {
        return list.get(0).equals(list.get(list.size() - 1));
    }

    public static boolean isLocationOnEdge(LatLng latLng, List<LatLng> list, boolean z, double d) {
        return c(latLng, list, true, z, d);
    }

    public static boolean isLocationOnPath(LatLng latLng, List<LatLng> list, boolean z, double d) {
        return c(latLng, list, false, z, d);
    }

    public static List<LatLng> simplify(List<LatLng> list, double d) {
        int size = list.size();
        if (size < 1) {
            throw new IllegalArgumentException("Polyline must have at least 1 point");
        }
        double d2 = 0.0d;
        if (d <= 0.0d) {
            throw new IllegalArgumentException("Tolerance must be greater than zero");
        }
        boolean zIsClosedPolygon = isClosedPolygon(list);
        LatLng latLng = null;
        if (zIsClosedPolygon) {
            latLng = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(new LatLng(latLng.latitude + 1.0E-11d, latLng.longitude + 1.0E-11d));
        }
        Stack stack = new Stack();
        double[] dArr = new double[size];
        int i = 0;
        dArr[0] = 1.0d;
        int i2 = size - 1;
        dArr[i2] = 1.0d;
        if (size > 2) {
            stack.push(new int[]{0, i2});
            int i3 = 0;
            while (stack.size() > 0) {
                int[] iArr = (int[]) stack.pop();
                double d3 = d2;
                for (int i4 = iArr[0] + 1; i4 < iArr[1]; i4++) {
                    double dDistanceToLine = distanceToLine(list.get(i4), list.get(iArr[0]), list.get(iArr[1]));
                    if (dDistanceToLine > d3) {
                        d3 = dDistanceToLine;
                        i3 = i4;
                    }
                }
                if (d3 > d) {
                    dArr[i3] = d3;
                    stack.push(new int[]{iArr[0], i3});
                    stack.push(new int[]{i3, iArr[1]});
                }
                d2 = 0.0d;
            }
        }
        if (zIsClosedPolygon) {
            list.remove(list.size() - 1);
            list.add(latLng);
        }
        ArrayList arrayList = new ArrayList();
        for (LatLng latLng2 : list) {
            if (dArr[i] != 0.0d) {
                arrayList.add(latLng2);
            }
            i++;
        }
        return arrayList;
    }

    public static boolean isLocationOnEdge(LatLng latLng, List<LatLng> list, boolean z) {
        return isLocationOnEdge(latLng, list, z, 0.1d);
    }

    public static boolean isLocationOnPath(LatLng latLng, List<LatLng> list, boolean z) {
        return isLocationOnPath(latLng, list, z, 0.1d);
    }
}
