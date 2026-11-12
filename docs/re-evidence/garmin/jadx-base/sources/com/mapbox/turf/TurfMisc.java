package com.mapbox.turf;

import com.mapbox.geojson.Feature;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.Point;
import com.mapbox.turf.models.LineIntersectsResult;
import j20.x;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class TurfMisc {
    private static final String INDEX_KEY = "index";

    private TurfMisc() {
        throw new AssertionError("No Instances.");
    }

    public static List<Point> lineIntersect(LineString lineString, LineString lineString2) {
        ArrayList arrayList = new ArrayList();
        Point[] pointArr = (Point[]) lineString.coordinates().toArray(new Point[lineString.coordinates().size()]);
        Point[] pointArr2 = (Point[]) lineString2.coordinates().toArray(new Point[lineString2.coordinates().size()]);
        for (int i14 = 0; i14 < pointArr.length - 1; i14++) {
            int i15 = 0;
            while (i15 < pointArr2.length - 1) {
                double dLongitude = pointArr[i14].longitude();
                double dLatitude = pointArr[i14].latitude();
                int i16 = i14 + 1;
                double dLongitude2 = pointArr[i16].longitude();
                double dLatitude2 = pointArr[i16].latitude();
                double dLongitude3 = pointArr2[i15].longitude();
                double dLatitude3 = pointArr2[i15].latitude();
                i15++;
                LineIntersectsResult lineIntersectsResultLineIntersects = lineIntersects(dLongitude, dLatitude, dLongitude2, dLatitude2, dLongitude3, dLatitude3, pointArr2[i15].longitude(), pointArr2[i15].latitude());
                if (lineIntersectsResultLineIntersects != null) {
                    arrayList.add(Point.fromLngLat(lineIntersectsResultLineIntersects.horizontalIntersection().doubleValue(), lineIntersectsResultLineIntersects.verticalIntersection().doubleValue()));
                }
            }
        }
        return arrayList;
    }

    private static LineIntersectsResult lineIntersects(double d14, double d15, double d16, double d17, double d18, double d19, double d24, double d25) {
        LineIntersectsResult lineIntersectsResultBuild = LineIntersectsResult.builder().onLine1(false).onLine2(false).build();
        double d26 = d25 - d19;
        double d27 = d16 - d14;
        double d28 = d24 - d18;
        double d29 = d17 - d15;
        double d34 = (d26 * d27) - (d28 * d29);
        if (d34 == 0.0d) {
            if (lineIntersectsResultBuild.horizontalIntersection() == null || lineIntersectsResultBuild.verticalIntersection() == null) {
                return null;
            }
            return lineIntersectsResultBuild;
        }
        double d35 = d15 - d19;
        double d36 = d14 - d18;
        double d37 = ((d28 * d35) - (d26 * d36)) / d34;
        double d38 = ((d35 * d27) - (d36 * d29)) / d34;
        LineIntersectsResult lineIntersectsResultBuild2 = lineIntersectsResultBuild.toBuilder().horizontalIntersection(Double.valueOf((d27 * d37) + d14)).build().toBuilder().verticalIntersection(Double.valueOf((d29 * d37) + d15)).build();
        if (d37 >= 0.0d && d37 <= 1.0d) {
            lineIntersectsResultBuild2 = lineIntersectsResultBuild2.toBuilder().onLine1(true).build();
        }
        if (d38 >= 0.0d && d38 <= 1.0d) {
            lineIntersectsResultBuild2 = lineIntersectsResultBuild2.toBuilder().onLine2(true).build();
        }
        if (lineIntersectsResultBuild2.onLine1() && lineIntersectsResultBuild2.onLine2()) {
            return lineIntersectsResultBuild2;
        }
        return null;
    }

    public static LineString lineSlice(Point point, Point point2, LineString lineString) {
        List<Point> listCoordinates = lineString.coordinates();
        if (listCoordinates.size() < 2) {
            throw new TurfException("Turf lineSlice requires a LineString made up of at least 2 coordinates.");
        }
        if (point.equals(point2)) {
            throw new TurfException("Start and stop points in Turf lineSlice cannot equal each other.");
        }
        Feature featureNearestPointOnLine = nearestPointOnLine(point, listCoordinates);
        Feature featureNearestPointOnLine2 = nearestPointOnLine(point2, listCoordinates);
        ArrayList arrayList = new ArrayList();
        if (((Integer) featureNearestPointOnLine.getNumberProperty("index")).intValue() <= ((Integer) featureNearestPointOnLine2.getNumberProperty("index")).intValue()) {
            arrayList.add(featureNearestPointOnLine);
            arrayList.add(featureNearestPointOnLine2);
        } else {
            arrayList.add(featureNearestPointOnLine2);
            arrayList.add(featureNearestPointOnLine);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((Point) ((Feature) arrayList.get(0)).geometry());
        for (int iIntValue = ((Integer) ((Feature) arrayList.get(0)).getNumberProperty("index")).intValue() + 1; iIntValue < ((Integer) ((Feature) arrayList.get(1)).getNumberProperty("index")).intValue() + 1; iIntValue++) {
            arrayList2.add(listCoordinates.get(iIntValue));
        }
        arrayList2.add((Point) ((Feature) arrayList.get(1)).geometry());
        return LineString.fromLngLats(arrayList2);
    }

    public static LineString lineSliceAlong(LineString lineString, double d14, double d15, @TurfConstants.TurfUnitCriteria String str) {
        List<Point> listCoordinates = lineString.coordinates();
        if (listCoordinates.size() < 2) {
            throw new TurfException("Turf lineSlice requires a LineString Geometry made up of at least 2 coordinates. The LineString passed in only contains " + listCoordinates.size() + ".");
        }
        if (d14 == d15) {
            throw new TurfException("Start and stop distance in Turf lineSliceAlong cannot equal each other.");
        }
        ArrayList arrayList = new ArrayList(2);
        int i14 = 0;
        double dDistance = 0.0d;
        while (i14 < listCoordinates.size() && (d14 < dDistance || i14 != listCoordinates.size() - 1)) {
            if (dDistance > d14 && arrayList.size() == 0) {
                double d16 = d14 - dDistance;
                if (d16 == 0.0d) {
                    arrayList.add(listCoordinates.get(i14));
                    return LineString.fromLngLats(arrayList);
                }
                arrayList.add(TurfMeasurement.destination(listCoordinates.get(i14), d16, TurfMeasurement.bearing(listCoordinates.get(i14), listCoordinates.get(i14 - 1)) - 180.0d, str));
            }
            if (dDistance >= d15) {
                double d17 = d15 - dDistance;
                if (d17 == 0.0d) {
                    arrayList.add(listCoordinates.get(i14));
                    return LineString.fromLngLats(arrayList);
                }
                arrayList.add(TurfMeasurement.destination(listCoordinates.get(i14), d17, TurfMeasurement.bearing(listCoordinates.get(i14), listCoordinates.get(i14 - 1)) - 180.0d, str));
                return LineString.fromLngLats(arrayList);
            }
            if (dDistance >= d14) {
                arrayList.add(listCoordinates.get(i14));
            }
            if (i14 == listCoordinates.size() - 1) {
                return LineString.fromLngLats(arrayList);
            }
            Point point = listCoordinates.get(i14);
            i14++;
            dDistance += TurfMeasurement.distance(point, listCoordinates.get(i14), str);
        }
        if (dDistance >= d14) {
            return LineString.fromLngLats(arrayList);
        }
        throw new TurfException("Start position is beyond line");
    }

    public static Feature nearestPointOnLine(Point point, List<Point> list, @TurfConstants.TurfUnitCriteria String str) {
        Feature featureFromGeometry;
        Point point2 = point;
        if (list.size() < 2) {
            throw new TurfException("Turf nearestPointOnLine requires a List of Points made up of at least 2 coordinates.");
        }
        String str2 = str == null ? "kilometers" : str;
        Feature featureFromGeometry2 = Feature.fromGeometry(Point.fromLngLat(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY));
        featureFromGeometry2.addNumberProperty("dist", Double.valueOf(Double.POSITIVE_INFINITY));
        int i14 = 0;
        Feature feature = featureFromGeometry2;
        while (i14 < list.size() - 1) {
            Feature featureFromGeometry3 = Feature.fromGeometry(list.get(i14));
            int i15 = i14 + 1;
            Feature featureFromGeometry4 = Feature.fromGeometry(list.get(i15));
            featureFromGeometry3.addNumberProperty("dist", Double.valueOf(TurfMeasurement.distance(point2, (Point) featureFromGeometry3.geometry(), str2)));
            featureFromGeometry4.addNumberProperty("dist", Double.valueOf(TurfMeasurement.distance(point2, (Point) featureFromGeometry4.geometry(), str2)));
            double dMax = Math.max(featureFromGeometry3.properties().get("dist").getAsDouble(), featureFromGeometry4.properties().get("dist").getAsDouble());
            double dBearing = TurfMeasurement.bearing((Point) featureFromGeometry3.geometry(), (Point) featureFromGeometry4.geometry());
            Feature featureFromGeometry5 = Feature.fromGeometry(TurfMeasurement.destination(point2, dMax, dBearing + 90.0d, str2));
            point2 = point;
            Feature featureFromGeometry6 = Feature.fromGeometry(TurfMeasurement.destination(point2, dMax, dBearing - 90.0d, str2));
            LineIntersectsResult lineIntersectsResultLineIntersects = lineIntersects(((Point) featureFromGeometry5.geometry()).longitude(), ((Point) featureFromGeometry5.geometry()).latitude(), ((Point) featureFromGeometry6.geometry()).longitude(), ((Point) featureFromGeometry6.geometry()).latitude(), ((Point) featureFromGeometry3.geometry()).longitude(), ((Point) featureFromGeometry3.geometry()).latitude(), ((Point) featureFromGeometry4.geometry()).longitude(), ((Point) featureFromGeometry4.geometry()).latitude());
            if (lineIntersectsResultLineIntersects != null) {
                featureFromGeometry = Feature.fromGeometry(Point.fromLngLat(lineIntersectsResultLineIntersects.horizontalIntersection().doubleValue(), lineIntersectsResultLineIntersects.verticalIntersection().doubleValue()));
                featureFromGeometry.addNumberProperty("dist", Double.valueOf(TurfMeasurement.distance(point2, (Point) featureFromGeometry.geometry(), str2)));
            } else {
                featureFromGeometry = null;
            }
            if (((Double) featureFromGeometry3.getNumberProperty("dist")).doubleValue() < ((Double) feature.getNumberProperty("dist")).doubleValue()) {
                featureFromGeometry3.addNumberProperty("index", Integer.valueOf(i14));
                feature = featureFromGeometry3;
            }
            if (((Double) featureFromGeometry4.getNumberProperty("dist")).doubleValue() < ((Double) feature.getNumberProperty("dist")).doubleValue()) {
                featureFromGeometry4.addNumberProperty("index", Integer.valueOf(i14));
            } else {
                featureFromGeometry4 = feature;
            }
            if (featureFromGeometry == null || ((Double) featureFromGeometry.getNumberProperty("dist")).doubleValue() >= ((Double) featureFromGeometry4.getNumberProperty("dist")).doubleValue()) {
                feature = featureFromGeometry4;
            } else {
                featureFromGeometry.addNumberProperty("index", Integer.valueOf(i14));
                feature = featureFromGeometry;
            }
            i14 = i15;
        }
        return feature;
    }

    public static LineString lineSlice(Point point, Point point2, Feature feature) {
        if (feature.geometry() != null) {
            if (feature.geometry().type().equals("LineString")) {
                return lineSlice(point, point2, (LineString) feature.geometry());
            }
            throw new TurfException("input must be a LineString Feature or Geometry");
        }
        x.l("Feature.geometry() == null");
        return null;
    }

    public static LineString lineSliceAlong(Feature feature, double d14, double d15, @TurfConstants.TurfUnitCriteria String str) {
        if (feature.geometry() != null) {
            if (feature.geometry().type().equals("LineString")) {
                return lineSliceAlong((LineString) feature.geometry(), d14, d15, str);
            }
            throw new TurfException("input must be a LineString Feature or Geometry");
        }
        x.l("Feature.geometry() == null");
        return null;
    }

    public static Feature nearestPointOnLine(Point point, List<Point> list) {
        return nearestPointOnLine(point, list, null);
    }
}
