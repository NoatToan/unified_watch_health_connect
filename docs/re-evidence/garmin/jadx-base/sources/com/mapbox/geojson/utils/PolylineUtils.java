package com.mapbox.geojson.utils;

import com.mapbox.geojson.Point;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PolylineUtils {
    private static final boolean SIMPLIFY_DEFAULT_HIGHEST_QUALITY = false;
    private static final double SIMPLIFY_DEFAULT_TOLERANCE = 1.0d;

    private PolylineUtils() {
    }

    public static List<Point> decode(String str, int i14) {
        int i15;
        int i16;
        int length = str.length();
        double dPow = Math.pow(10.0d, i14);
        ArrayList arrayList = new ArrayList((length + 1) / 2);
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i24 = 0;
        while (i17 < length) {
            int i25 = 1;
            int i26 = 0;
            int i27 = 1;
            while (true) {
                i15 = i17 + 1;
                int iCharAt = str.charAt(i17) - '@';
                i27 += iCharAt << i26;
                i26 += 5;
                if (iCharAt < 31) {
                    break;
                }
                i17 = i15;
            }
            int i28 = ((i27 & 1) != 0 ? ~(i27 >> 1) : i27 >> 1) + i19;
            int i29 = 0;
            while (true) {
                i16 = i15 + 1;
                int iCharAt2 = str.charAt(i15) - '@';
                i25 += iCharAt2 << i29;
                i29 += 5;
                if (iCharAt2 < 31) {
                    break;
                }
                i15 = i16;
            }
            i24 += (i25 & 1) != 0 ? ~(i25 >> 1) : i25 >> 1;
            arrayList.add(Point.fromLngLat(((double) i24) / dPow, ((double) i28) / dPow));
            i18++;
            i19 = i28;
            i17 = i16;
        }
        return arrayList.subList(0, i18);
    }

    public static String encode(List<Point> list, int i14) {
        StringBuilder sb3 = new StringBuilder();
        double dPow = Math.pow(10.0d, i14);
        long j8 = 0;
        long j14 = 0;
        for (Point point : list) {
            long jRound = Math.round(point.latitude() * dPow);
            long jRound2 = Math.round(point.longitude() * dPow);
            encode(jRound - j8, sb3);
            encode(jRound2 - j14, sb3);
            j8 = jRound;
            j14 = jRound2;
        }
        return sb3.toString();
    }

    private static double getSqDist(Point point, Point point2) {
        double dLongitude = point.longitude() - point2.longitude();
        double dLatitude = point.latitude() - point2.latitude();
        return (dLatitude * dLatitude) + (dLongitude * dLongitude);
    }

    private static double getSqSegDist(Point point, Point point2, Point point3) {
        double dLongitude = point2.longitude();
        double dLatitude = point2.latitude();
        double dLongitude2 = point3.longitude() - dLongitude;
        double dLatitude2 = point3.latitude() - dLatitude;
        if (dLongitude2 != 0.0d || dLatitude2 != 0.0d) {
            double dLatitude3 = (((point.latitude() - dLatitude) * dLatitude2) + ((point.longitude() - dLongitude) * dLongitude2)) / ((dLatitude2 * dLatitude2) + (dLongitude2 * dLongitude2));
            if (dLatitude3 > 1.0d) {
                dLongitude = point3.longitude();
                dLatitude = point3.latitude();
            } else if (dLatitude3 > 0.0d) {
                dLongitude += dLongitude2 * dLatitude3;
                dLatitude += dLatitude2 * dLatitude3;
            }
        }
        double dLongitude3 = point.longitude() - dLongitude;
        double dLatitude4 = point.latitude() - dLatitude;
        return (dLatitude4 * dLatitude4) + (dLongitude3 * dLongitude3);
    }

    @Deprecated
    public static List<Point> simplify(List<Point> list, double d14, boolean z14) {
        if (list.size() <= 2) {
            return list;
        }
        double d15 = d14 * d14;
        if (!z14) {
            list = simplifyRadialDist(list, d15);
        }
        return simplifyDouglasPeucker(list, d15);
    }

    private static List<Point> simplifyDouglasPeucker(List<Point> list, double d14) {
        int size = list.size() - 1;
        ArrayList arrayList = new ArrayList();
        arrayList.add(list.get(0));
        arrayList.addAll(simplifyDpStep(list, 0, size, d14, arrayList));
        arrayList.add(list.get(size));
        return arrayList;
    }

    private static List<Point> simplifyDpStep(List<Point> list, int i14, int i15, double d14, List<Point> list2) {
        ArrayList arrayList = new ArrayList();
        int i16 = 0;
        double d15 = d14;
        for (int i17 = i14 + 1; i17 < i15; i17++) {
            double sqSegDist = getSqSegDist(list.get(i17), list.get(i14), list.get(i15));
            if (sqSegDist > d15) {
                i16 = i17;
                d15 = sqSegDist;
            }
        }
        if (d15 > d14) {
            if (i16 - i14 > 1) {
                arrayList.addAll(simplifyDpStep(list, i14, i16, d14, list2));
            }
            arrayList.add(list.get(i16));
            if (i15 - i16 > 1) {
                arrayList.addAll(simplifyDpStep(list, i16, i15, d14, list2));
            }
        }
        return arrayList;
    }

    private static List<Point> simplifyRadialDist(List<Point> list, double d14) {
        Point point = list.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(point);
        int size = list.size();
        Point point2 = null;
        for (int i14 = 1; i14 < size; i14++) {
            point2 = list.get(i14);
            if (getSqDist(point2, point) > d14) {
                arrayList.add(point2);
                point = point2;
            }
        }
        if (!point.equals(point2)) {
            arrayList.add(point2);
        }
        return arrayList;
    }

    @Deprecated
    public static List<Point> simplify(List<Point> list, double d14) {
        return simplify(list, d14, false);
    }

    @Deprecated
    public static List<Point> simplify(List<Point> list, boolean z14) {
        return simplify(list, 1.0d, z14);
    }

    @Deprecated
    public static List<Point> simplify(List<Point> list) {
        return simplify(list, 1.0d, false);
    }

    private static void encode(long j8, StringBuilder sb3) {
        long j14 = j8 << 1;
        if (j8 < 0) {
            j14 = ~j14;
        }
        while (j14 >= 32) {
            sb3.append(Character.toChars((int) ((32 | (31 & j14)) + 63)));
            j14 >>= 5;
        }
        sb3.append(Character.toChars((int) (j14 + 63)));
    }
}
