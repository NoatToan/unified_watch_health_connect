package com.google.maps.android;

import com.airbnb.lottie.animation.keyframe.a;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import o2.c;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public class PolyUtil {
    public static final double DEFAULT_TOLERANCE = 0.1d;

    private PolyUtil() {
    }

    public static boolean containsLocation(double d14, double d15, List<LatLng> list, boolean z14) {
        int size = list.size();
        boolean z15 = false;
        if (size == 0) {
            return false;
        }
        double radians = Math.toRadians(d14);
        double radians2 = Math.toRadians(d15);
        LatLng latLng = list.get(size - 1);
        double radians3 = Math.toRadians(latLng.latitude);
        double radians4 = Math.toRadians(latLng.longitude);
        int i14 = 0;
        double d16 = radians3;
        for (LatLng latLng2 : list) {
            double dWrap = MathUtil.wrap(radians2 - radians4, -3.141592653589793d, 3.141592653589793d);
            if (radians == d16 && dWrap == 0.0d) {
                return true;
            }
            boolean z16 = z15;
            double radians5 = Math.toRadians(latLng2.latitude);
            double radians6 = Math.toRadians(latLng2.longitude);
            if (intersects(d16, radians5, MathUtil.wrap(radians6 - radians4, -3.141592653589793d, 3.141592653589793d), radians, dWrap, z14)) {
                i14++;
            }
            d16 = radians5;
            z15 = z16;
            radians4 = radians6;
        }
        boolean z17 = z15;
        if ((i14 & 1) != 0) {
            return true;
        }
        return z17;
    }

    public static List<LatLng> decode(String str) {
        int i14;
        int i15;
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < length) {
            int i19 = 1;
            int i24 = 0;
            int i25 = 1;
            while (true) {
                i14 = i16 + 1;
                int iCharAt = str.charAt(i16) - '@';
                i25 += iCharAt << i24;
                i24 += 5;
                if (iCharAt < 31) {
                    break;
                }
                i16 = i14;
            }
            int i26 = ((i25 & 1) != 0 ? ~(i25 >> 1) : i25 >> 1) + i17;
            int i27 = 0;
            while (true) {
                i15 = i14 + 1;
                int iCharAt2 = str.charAt(i14) - '@';
                i19 += iCharAt2 << i27;
                i27 += 5;
                if (iCharAt2 < 31) {
                    break;
                }
                i14 = i15;
            }
            i18 += (i19 & 1) != 0 ? ~(i19 >> 1) : i19 >> 1;
            arrayList.add(new LatLng(((double) i26) * 1.0E-5d, ((double) i18) * 1.0E-5d));
            i17 = i26;
            i16 = i15;
        }
        return arrayList;
    }

    public static double distanceToLine(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        if (latLng2.equals(latLng3)) {
            return SphericalUtil.computeDistanceBetween(latLng3, latLng);
        }
        double radians = Math.toRadians(latLng.latitude);
        double radians2 = Math.toRadians(latLng.longitude);
        double radians3 = Math.toRadians(latLng2.latitude);
        double radians4 = Math.toRadians(latLng2.longitude);
        double radians5 = Math.toRadians(latLng3.latitude);
        double radians6 = Math.toRadians(latLng3.longitude);
        double dCos = Math.cos(radians3);
        double d14 = radians5 - radians3;
        double d15 = (radians6 - radians4) * dCos;
        double d16 = ((((radians2 - radians4) * dCos) * d15) + ((radians - radians3) * d14)) / ((d15 * d15) + (d14 * d14));
        if (d16 <= 0.0d) {
            return SphericalUtil.computeDistanceBetween(latLng, latLng2);
        }
        if (d16 >= 1.0d) {
            return SphericalUtil.computeDistanceBetween(latLng, latLng3);
        }
        double d17 = latLng2.latitude;
        double dB = c.b(latLng3.latitude, d17, d16, d17);
        double d18 = latLng2.longitude;
        return SphericalUtil.computeDistanceBetween(latLng, new LatLng(dB, c.b(latLng3.longitude, d18, d16, d18)));
    }

    public static String encode(List<LatLng> list) {
        StringBuffer stringBuffer = new StringBuffer();
        long j8 = 0;
        long j14 = 0;
        for (LatLng latLng : list) {
            long jRound = Math.round(latLng.latitude * 100000.0d);
            long jRound2 = Math.round(latLng.longitude * 100000.0d);
            encode(jRound - j8, stringBuffer);
            encode(jRound2 - j14, stringBuffer);
            j8 = jRound;
            j14 = jRound2;
        }
        return stringBuffer.toString();
    }

    private static boolean intersects(double d14, double d15, double d16, double d17, double d18, boolean z14) {
        if ((d18 >= 0.0d && d18 >= d16) || ((d18 < 0.0d && d18 < d16) || d17 <= -1.5707963267948966d || d14 <= -1.5707963267948966d || d15 <= -1.5707963267948966d || d14 >= 1.5707963267948966d || d15 >= 1.5707963267948966d || d16 <= -3.141592653589793d)) {
            return false;
        }
        double d19 = ((d15 * d18) + ((d16 - d18) * d14)) / d16;
        if (d14 >= 0.0d && d15 >= 0.0d && d17 < d19) {
            return false;
        }
        if ((d14 <= 0.0d && d15 <= 0.0d && d17 >= d19) || d17 >= 1.5707963267948966d) {
            return true;
        }
        if (z14) {
            return Math.tan(d17) >= tanLatGC(d14, d15, d16, d18);
        }
        return MathUtil.mercator(d17) >= mercatorLatRhumb(d14, d15, d16, d18);
    }

    public static boolean isClosedPolygon(List<LatLng> list) {
        return list.get(0).equals((LatLng) a.c(1, list));
    }

    public static boolean isLocationOnEdge(LatLng latLng, List<LatLng> list, boolean z14, double d14) {
        return isLocationOnEdgeOrPath(latLng, list, true, z14, d14);
    }

    private static boolean isLocationOnEdgeOrPath(LatLng latLng, List<LatLng> list, boolean z14, boolean z15, double d14) {
        return locationIndexOnEdgeOrPath(latLng, list, z14, z15, d14) >= 0;
    }

    public static boolean isLocationOnPath(LatLng latLng, List<LatLng> list, boolean z14, double d14) {
        return isLocationOnEdgeOrPath(latLng, list, false, z14, d14);
    }

    private static boolean isOnSegmentGC(double d14, double d15, double d16, double d17, double d18, double d19, double d24) {
        double dHavDistance = MathUtil.havDistance(d14, d18, d15 - d19);
        if (dHavDistance <= d24) {
            return true;
        }
        double dHavDistance2 = MathUtil.havDistance(d16, d18, d17 - d19);
        if (dHavDistance2 <= d24) {
            return true;
        }
        double dHavFromSin = MathUtil.havFromSin(MathUtil.sinFromHav(dHavDistance) * sinDeltaBearing(d14, d15, d16, d17, d18, d19));
        if (dHavFromSin > d24) {
            return false;
        }
        double dHavDistance3 = MathUtil.havDistance(d14, d16, d15 - d17);
        double d25 = ((1.0d - (dHavDistance3 * 2.0d)) * dHavFromSin) + dHavDistance3;
        if (dHavDistance <= d25 && dHavDistance2 <= d25) {
            if (dHavDistance3 < 0.74d) {
                return true;
            }
            double d26 = 1.0d - (2.0d * dHavFromSin);
            if (MathUtil.sinSumFromHav((dHavDistance - dHavFromSin) / d26, (dHavDistance2 - dHavFromSin) / d26) > 0.0d) {
                return true;
            }
        }
        return false;
    }

    public static int locationIndexOnEdgeOrPath(LatLng latLng, List<LatLng> list, boolean z14, boolean z15, double d14) {
        int i14;
        double d15;
        int size = list.size();
        int i15 = -1;
        if (size == 0) {
            return -1;
        }
        double d16 = d14 / 6371009.0d;
        double dHav = MathUtil.hav(d16);
        double radians = Math.toRadians(latLng.latitude);
        double radians2 = Math.toRadians(latLng.longitude);
        int i16 = 0;
        LatLng latLng2 = list.get(z14 ? size - 1 : 0);
        double radians3 = Math.toRadians(latLng2.latitude);
        double radians4 = Math.toRadians(latLng2.longitude);
        if (z15) {
            int i17 = 0;
            double d17 = radians3;
            double d18 = radians4;
            for (LatLng latLng3 : list) {
                double radians5 = Math.toRadians(latLng3.latitude);
                double radians6 = Math.toRadians(latLng3.longitude);
                if (isOnSegmentGC(d17, d18, radians5, radians6, radians, radians2, dHav)) {
                    return Math.max(0, i17 - 1);
                }
                i17++;
                d17 = radians5;
                d18 = radians6;
            }
        } else {
            double d19 = radians - d16;
            double d24 = d16 + radians;
            double dMercator = MathUtil.mercator(radians3);
            double dMercator2 = MathUtil.mercator(radians);
            Iterator<LatLng> it = list.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                LatLng next = it.next();
                int i19 = i15;
                double d25 = d24;
                double radians7 = Math.toRadians(next.latitude);
                double dMercator3 = MathUtil.mercator(radians7);
                int i24 = i16;
                Iterator<LatLng> it3 = it;
                double radians8 = Math.toRadians(next.longitude);
                if (Math.max(radians3, radians7) < d19 || Math.min(radians3, radians7) > d25) {
                    i14 = i24;
                    d15 = radians;
                } else {
                    double dWrap = MathUtil.wrap(radians8 - radians4, -3.141592653589793d, 3.141592653589793d);
                    double dWrap2 = MathUtil.wrap(radians2 - radians4, -3.141592653589793d, 3.141592653589793d);
                    double[] dArr = new double[3];
                    dArr[i24] = dWrap2;
                    dArr[1] = dWrap2 + 6.283185307179586d;
                    dArr[2] = dWrap2 - 6.283185307179586d;
                    int i25 = i24;
                    while (i25 < 3) {
                        double d26 = dArr[i25];
                        double d27 = dMercator3 - dMercator;
                        double d28 = (d27 * d27) + (dWrap * dWrap);
                        double dClamp = d28 > 0.0d ? MathUtil.clamp((((dMercator2 - dMercator) * d27) + (d26 * dWrap)) / d28, 0.0d, 1.0d) : 0.0d;
                        double d29 = radians;
                        if (MathUtil.havDistance(d29, MathUtil.inverseMercator((dClamp * d27) + dMercator), d26 - (dClamp * dWrap)) < dHav) {
                            return Math.max(i24, i18 - 1);
                        }
                        i25++;
                        radians = d29;
                    }
                    d15 = radians;
                    i14 = i24;
                }
                i18++;
                i16 = i14;
                radians4 = radians8;
                radians3 = radians7;
                i15 = i19;
                d24 = d25;
                dMercator = dMercator3;
                it = it3;
                radians = d15;
            }
        }
        return i15;
    }

    public static int locationIndexOnPath(LatLng latLng, List<LatLng> list, boolean z14, double d14) {
        return locationIndexOnEdgeOrPath(latLng, list, false, z14, d14);
    }

    private static double mercatorLatRhumb(double d14, double d15, double d16, double d17) {
        return ((MathUtil.mercator(d15) * d17) + ((d16 - d17) * MathUtil.mercator(d14))) / d16;
    }

    public static List<LatLng> simplify(List<LatLng> list, double d14) {
        LatLng latLng;
        int size = list.size();
        int i14 = 1;
        if (size < 1) {
            h.s("Polyline must have at least 1 point");
            return null;
        }
        if (d14 <= 0.0d) {
            h.s("Tolerance must be greater than zero");
            return null;
        }
        boolean zIsClosedPolygon = isClosedPolygon(list);
        if (zIsClosedPolygon) {
            latLng = (LatLng) a.c(1, list);
            list.remove(list.size() - 1);
            list.add(new LatLng(latLng.latitude + 1.0E-11d, latLng.longitude + 1.0E-11d));
        } else {
            latLng = null;
        }
        Stack stack = new Stack();
        double[] dArr = new double[size];
        int i15 = 0;
        dArr[0] = 1.0d;
        int i16 = size - 1;
        dArr[i16] = 1.0d;
        if (size > 2) {
            stack.push(new int[]{0, i16});
            int i17 = 0;
            while (stack.size() > 0) {
                int[] iArr = (int[]) stack.pop();
                int i18 = iArr[0] + i14;
                double d15 = 0.0d;
                while (i18 < iArr[i14]) {
                    int i19 = i14;
                    double dDistanceToLine = distanceToLine(list.get(i18), list.get(iArr[0]), list.get(iArr[i19]));
                    if (dDistanceToLine > d15) {
                        i17 = i18;
                        d15 = dDistanceToLine;
                    }
                    i18++;
                    i14 = i19;
                }
                int i24 = i14;
                if (d15 > d14) {
                    dArr[i17] = d15;
                    stack.push(new int[]{iArr[0], i17});
                    stack.push(new int[]{i17, iArr[i24]});
                }
                i14 = i24;
            }
        }
        if (zIsClosedPolygon) {
            list.remove(list.size() - 1);
            list.add(latLng);
        }
        ArrayList arrayList = new ArrayList();
        for (LatLng latLng2 : list) {
            if (dArr[i15] != 0.0d) {
                arrayList.add(latLng2);
            }
            i15++;
        }
        return arrayList;
    }

    private static double sinDeltaBearing(double d14, double d15, double d16, double d17, double d18, double d19) {
        double dSin = Math.sin(d14);
        double dCos = Math.cos(d16);
        double dCos2 = Math.cos(d18);
        double d24 = d19 - d15;
        double d25 = d17 - d15;
        double dSin2 = Math.sin(d24) * dCos2;
        double dSin3 = Math.sin(d25) * dCos;
        double d26 = dSin * 2.0d;
        double dHav = (dCos2 * d26 * MathUtil.hav(d24)) + Math.sin(d18 - d14);
        double dHav2 = (d26 * dCos * MathUtil.hav(d25)) + Math.sin(d16 - d14);
        double d27 = ((dHav2 * dHav2) + (dSin3 * dSin3)) * ((dHav * dHav) + (dSin2 * dSin2));
        if (d27 <= 0.0d) {
            return 1.0d;
        }
        return ((dSin2 * dHav2) - (dHav * dSin3)) / Math.sqrt(d27);
    }

    private static double tanLatGC(double d14, double d15, double d16, double d17) {
        return ((Math.sin(d17) * Math.tan(d15)) + (Math.sin(d16 - d17) * Math.tan(d14))) / Math.sin(d16);
    }

    public static boolean isLocationOnEdge(LatLng latLng, List<LatLng> list, boolean z14) {
        return isLocationOnEdge(latLng, list, z14, 0.1d);
    }

    public static boolean isLocationOnPath(LatLng latLng, List<LatLng> list, boolean z14) {
        return isLocationOnPath(latLng, list, z14, 0.1d);
    }

    public static int locationIndexOnPath(LatLng latLng, List<LatLng> list, boolean z14) {
        return locationIndexOnPath(latLng, list, z14, 0.1d);
    }

    private static void encode(long j8, StringBuffer stringBuffer) {
        long j14 = j8 << 1;
        if (j8 < 0) {
            j14 = ~j14;
        }
        while (j14 >= 32) {
            stringBuffer.append(Character.toChars((int) ((32 | (31 & j14)) + 63)));
            j14 >>= 5;
        }
        stringBuffer.append(Character.toChars((int) (j14 + 63)));
    }

    public static boolean containsLocation(LatLng latLng, List<LatLng> list, boolean z14) {
        return containsLocation(latLng.latitude, latLng.longitude, list, z14);
    }
}
