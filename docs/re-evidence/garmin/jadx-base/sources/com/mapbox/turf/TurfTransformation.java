package com.mapbox.turf;

import com.mapbox.geojson.Point;
import com.mapbox.geojson.Polygon;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class TurfTransformation {
    private static final int DEFAULT_STEPS = 64;
    private static final boolean SIMPLIFY_DEFAULT_HIGH_QUALITY = false;
    private static final double SIMPLIFY_DEFAULT_TOLERANCE = 1.0d;

    private TurfTransformation() {
    }

    public static Polygon circle(Point point, double d14, int i14, @TurfConstants.TurfUnitCriteria String str) {
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < i14; i15++) {
            arrayList.add(TurfMeasurement.destination(point, d14, (((double) i15) * 360.0d) / ((double) i14), str));
        }
        if (arrayList.size() > 0) {
            arrayList.add((Point) arrayList.get(0));
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(arrayList);
        return Polygon.fromLngLats(arrayList2);
    }

    public static List<Point> simplify(List<Point> list, double d14, boolean z14) {
        if (list.size() <= 2) {
            return list;
        }
        double d15 = d14 * d14;
        if (!z14) {
            list = simplifyRadial(list, d15);
        }
        return simplifyDouglasPeucker(list, d15);
    }

    private static List<Point> simplifyDouglasPeucker(List<Point> list, double d14) {
        if (list.size() <= 2) {
            return list;
        }
        int size = list.size() - 1;
        ArrayList arrayList = new ArrayList();
        arrayList.add(list.get(0));
        simplifyDouglasPeuckerStep(list, 0, size, d14, arrayList);
        arrayList.add(list.get(size));
        return arrayList;
    }

    private static void simplifyDouglasPeuckerStep(List<Point> list, int i14, int i15, double d14, List<Point> list2) {
        int i16 = 0;
        double d15 = d14;
        for (int i17 = i14 + 1; i17 < i15; i17++) {
            double dSquaredSegmentDistance = squaredSegmentDistance(list.get(i17), list.get(i14), list.get(i15));
            if (dSquaredSegmentDistance > d15) {
                i16 = i17;
                d15 = dSquaredSegmentDistance;
            }
        }
        if (d15 > d14) {
            if (i16 - i14 > 1) {
                simplifyDouglasPeuckerStep(list, i14, i16, d14, list2);
            }
            int i18 = i16;
            list2.add(list.get(i18));
            if (i15 - i18 > 1) {
                simplifyDouglasPeuckerStep(list, i18, i15, d14, list2);
            }
        }
    }

    private static List<Point> simplifyRadial(List<Point> list, double d14) {
        if (list.size() <= 2) {
            return list;
        }
        Point point = list.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(point);
        Point point2 = list.get(1);
        for (int i14 = 1; i14 < list.size(); i14++) {
            point2 = list.get(i14);
            if (squaredDistance(point2, point) > d14) {
                arrayList.add(point2);
                point = point2;
            }
        }
        if (point != point2) {
            arrayList.add(point2);
        }
        return arrayList;
    }

    private static double squaredDistance(Point point, Point point2) {
        double dLongitude = point2.longitude() - point.longitude();
        double dLatitude = point2.latitude() - point.latitude();
        return (dLatitude * dLatitude) + (dLongitude * dLongitude);
    }

    private static double squaredSegmentDistance(Point point, Point point2, Point point3) {
        double dLatitude = point2.latitude();
        double dLongitude = point2.longitude();
        double dLatitude2 = point3.latitude() - dLatitude;
        double dLongitude2 = point3.longitude() - dLongitude;
        if (dLatitude2 != 0.0d || dLongitude2 != 0.0d) {
            double dLongitude3 = (((point.longitude() - dLongitude) * dLongitude2) + ((point.latitude() - dLatitude) * dLatitude2)) / ((dLongitude2 * dLongitude2) + (dLatitude2 * dLatitude2));
            if (dLongitude3 > 1.0d) {
                dLatitude = point3.latitude();
                dLongitude = point3.longitude();
            } else if (dLongitude3 > 0.0d) {
                dLatitude += dLatitude2 * dLongitude3;
                dLongitude += dLongitude2 * dLongitude3;
            }
        }
        double dLatitude3 = point.latitude() - dLatitude;
        double dLongitude4 = point.longitude() - dLongitude;
        return (dLongitude4 * dLongitude4) + (dLatitude3 * dLatitude3);
    }

    public static List<Point> simplify(List<Point> list, double d14) {
        return simplify(list, d14, false);
    }

    public static List<Point> simplify(List<Point> list, boolean z14) {
        return simplify(list, 1.0d, z14);
    }

    public static List<Point> simplify(List<Point> list) {
        return simplify(list, 1.0d, false);
    }

    public static Polygon circle(Point point, double d14, @TurfConstants.TurfUnitCriteria String str) {
        return circle(point, d14, 64, str);
    }

    public static Polygon circle(Point point, double d14) {
        return circle(point, d14, 64, "kilometers");
    }
}
