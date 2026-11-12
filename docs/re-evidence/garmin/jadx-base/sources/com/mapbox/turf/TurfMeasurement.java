package com.mapbox.turf;

import com.airbnb.lottie.animation.keyframe.a;
import com.google.gson.JsonObject;
import com.mapbox.geojson.BoundingBox;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.GeoJson;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.GeometryCollection;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.MultiLineString;
import com.mapbox.geojson.MultiPoint;
import com.mapbox.geojson.MultiPolygon;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.Polygon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.e;
import tn.k;

/* JADX INFO: loaded from: classes3.dex */
public final class TurfMeasurement {
    public static double EARTH_RADIUS = 6378137.0d;

    private TurfMeasurement() {
        throw new AssertionError("No Instances.");
    }

    public static Point along(List<Point> list, double d14, @TurfConstants.TurfUnitCriteria String str) {
        int i14 = 0;
        double dDistance = 0.0d;
        while (i14 < list.size() && (d14 < dDistance || i14 != list.size() - 1)) {
            if (dDistance >= d14) {
                double d15 = d14 - dDistance;
                if (d15 == 0.0d) {
                    return list.get(i14);
                }
                return destination(list.get(i14), d15, bearing(list.get(i14), list.get(i14 - 1)) - 180.0d, str);
            }
            String str2 = str;
            Point point = list.get(i14);
            i14++;
            dDistance += distance(point, list.get(i14), str2);
            str = str2;
        }
        return (Point) a.c(1, list);
    }

    public static double area(FeatureCollection featureCollection) {
        List<Feature> listFeatures = featureCollection.features();
        double dArea = 0.0d;
        if (listFeatures != null) {
            Iterator<Feature> it = listFeatures.iterator();
            while (it.hasNext()) {
                dArea += area(it.next());
            }
        }
        return dArea;
    }

    public static double[] bbox(Geometry geometry) {
        if (geometry instanceof Point) {
            return bbox((Point) geometry);
        }
        if (geometry instanceof MultiPoint) {
            return bbox((MultiPoint) geometry);
        }
        if (geometry instanceof LineString) {
            return bbox((LineString) geometry);
        }
        if (geometry instanceof MultiLineString) {
            return bbox((MultiLineString) geometry);
        }
        if (geometry instanceof Polygon) {
            return bbox((Polygon) geometry);
        }
        if (geometry instanceof MultiPolygon) {
            return bbox((MultiPolygon) geometry);
        }
        if (!(geometry instanceof GeometryCollection)) {
            k.o(geometry.getClass(), "Unknown geometry class: ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Geometry> it = ((GeometryCollection) geometry).geometries().iterator();
        while (it.hasNext()) {
            double[] dArrBbox = bbox(it.next());
            arrayList.add(Point.fromLngLat(dArrBbox[0], dArrBbox[1]));
            arrayList.add(Point.fromLngLat(dArrBbox[2], dArrBbox[1]));
            arrayList.add(Point.fromLngLat(dArrBbox[2], dArrBbox[3]));
            arrayList.add(Point.fromLngLat(dArrBbox[0], dArrBbox[3]));
        }
        return bbox(MultiPoint.fromLngLats(arrayList));
    }

    private static double[] bboxCalculator(List<Point> list) {
        double[] dArr = {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY};
        for (Point point : list) {
            if (dArr[0] > point.longitude()) {
                dArr[0] = point.longitude();
            }
            if (dArr[1] > point.latitude()) {
                dArr[1] = point.latitude();
            }
            if (dArr[2] < point.longitude()) {
                dArr[2] = point.longitude();
            }
            if (dArr[3] < point.latitude()) {
                dArr[3] = point.latitude();
            }
        }
        return dArr;
    }

    public static Feature bboxPolygon(BoundingBox boundingBox, JsonObject jsonObject, String str) {
        return Feature.fromGeometry(Polygon.fromLngLats((List<List<Point>>) Collections.singletonList(Arrays.asList(Point.fromLngLat(boundingBox.west(), boundingBox.south()), Point.fromLngLat(boundingBox.east(), boundingBox.south()), Point.fromLngLat(boundingBox.east(), boundingBox.north()), Point.fromLngLat(boundingBox.west(), boundingBox.north()), Point.fromLngLat(boundingBox.west(), boundingBox.south())))), jsonObject, str);
    }

    public static double bearing(Point point, Point point2) {
        double dDegreesToRadians = TurfConversion.degreesToRadians(point.longitude());
        double dDegreesToRadians2 = TurfConversion.degreesToRadians(point2.longitude());
        double dDegreesToRadians3 = TurfConversion.degreesToRadians(point.latitude());
        double dDegreesToRadians4 = TurfConversion.degreesToRadians(point2.latitude());
        double d14 = dDegreesToRadians2 - dDegreesToRadians;
        return TurfConversion.radiansToDegrees(Math.atan2(Math.cos(dDegreesToRadians4) * Math.sin(d14), (Math.sin(dDegreesToRadians4) * Math.cos(dDegreesToRadians3)) - (Math.cos(d14) * (Math.cos(dDegreesToRadians4) * Math.sin(dDegreesToRadians3)))));
    }

    private static double calculateArea(Geometry geometry) {
        if (geometry instanceof Polygon) {
            return polygonArea(((Polygon) geometry).coordinates());
        }
        double dPolygonArea = 0.0d;
        if (geometry instanceof MultiPolygon) {
            List<List<List<Point>>> listCoordinates = ((MultiPolygon) geometry).coordinates();
            for (int i14 = 0; i14 < listCoordinates.size(); i14++) {
                dPolygonArea += polygonArea(listCoordinates.get(i14));
            }
        }
        return dPolygonArea;
    }

    public static Feature center(FeatureCollection featureCollection, JsonObject jsonObject, String str) {
        double[] dArrBbox = bbox(featureCollection);
        return Feature.fromGeometry(Point.fromLngLat((dArrBbox[0] + dArrBbox[2]) / 2.0d, (dArrBbox[1] + dArrBbox[3]) / 2.0d), jsonObject, str);
    }

    public static Point destination(Point point, double d14, double d15, @TurfConstants.TurfUnitCriteria String str) {
        double dDegreesToRadians = TurfConversion.degreesToRadians(point.longitude());
        double dDegreesToRadians2 = TurfConversion.degreesToRadians(point.latitude());
        double dDegreesToRadians3 = TurfConversion.degreesToRadians(d15);
        double dLengthToRadians = TurfConversion.lengthToRadians(d14, str);
        double dAsin = Math.asin((Math.cos(dDegreesToRadians3) * Math.sin(dLengthToRadians) * Math.cos(dDegreesToRadians2)) + (Math.cos(dLengthToRadians) * Math.sin(dDegreesToRadians2)));
        return Point.fromLngLat(TurfConversion.radiansToDegrees(Math.atan2(Math.cos(dDegreesToRadians2) * Math.sin(dLengthToRadians) * Math.sin(dDegreesToRadians3), Math.cos(dLengthToRadians) - (Math.sin(dAsin) * Math.sin(dDegreesToRadians2))) + dDegreesToRadians), TurfConversion.radiansToDegrees(dAsin));
    }

    public static double distance(Point point, Point point2, @TurfConstants.TurfUnitCriteria String str) {
        double dDegreesToRadians = TurfConversion.degreesToRadians(point2.latitude() - point.latitude());
        double dDegreesToRadians2 = TurfConversion.degreesToRadians(point2.longitude() - point.longitude());
        double dDegreesToRadians3 = TurfConversion.degreesToRadians(point.latitude());
        double dDegreesToRadians4 = TurfConversion.degreesToRadians(point2.latitude());
        double dCos = (Math.cos(dDegreesToRadians4) * Math.cos(dDegreesToRadians3) * Math.pow(Math.sin(dDegreesToRadians2 / 2.0d), 2.0d)) + Math.pow(Math.sin(dDegreesToRadians / 2.0d), 2.0d);
        return TurfConversion.radiansToLength(Math.atan2(Math.sqrt(dCos), Math.sqrt(1.0d - dCos)) * 2.0d, str);
    }

    public static Polygon envelope(GeoJson geoJson) {
        return (Polygon) bboxPolygon(bbox(geoJson)).geometry();
    }

    public static double length(MultiPolygon multiPolygon, @TurfConstants.TurfUnitCriteria String str) {
        Iterator<List<List<Point>>> it = multiPolygon.coordinates().iterator();
        double length = 0.0d;
        while (it.hasNext()) {
            Iterator<List<Point>> it3 = it.next().iterator();
            while (it3.hasNext()) {
                length += length(it3.next(), str);
            }
        }
        return length;
    }

    public static Point midpoint(Point point, Point point2) {
        return destination(point, distance(point, point2, TurfConstants.UNIT_MILES) / 2.0d, bearing(point, point2), TurfConstants.UNIT_MILES);
    }

    private static double polygonArea(List<List<Point>> list) {
        if (list.size() <= 0) {
            return 0.0d;
        }
        double dAbs = Math.abs(ringArea(list.get(0))) + 0.0d;
        for (int i14 = 1; i14 < list.size(); i14++) {
            dAbs -= Math.abs(ringArea(list.get(i14)));
        }
        return dAbs;
    }

    private static double rad(double d14) {
        return (d14 * 3.141592653589793d) / 180.0d;
    }

    private static double ringArea(List<Point> list) {
        int i14;
        int i15;
        int size = list.size();
        double dSin = 0.0d;
        if (size <= 2) {
            return 0.0d;
        }
        for (int i16 = 0; i16 < size; i16++) {
            int i17 = size - 2;
            if (i16 == i17) {
                i14 = size - 1;
                i15 = 0;
            } else {
                i17 = size - 1;
                if (i16 == i17) {
                    i15 = 1;
                    i14 = 0;
                } else {
                    i14 = i16 + 1;
                    i15 = i16 + 2;
                    i17 = i16;
                }
            }
            Point point = list.get(i17);
            dSin += Math.sin(rad(list.get(i14).latitude())) * (rad(list.get(i15).longitude()) - rad(point.longitude()));
        }
        double d14 = EARTH_RADIUS;
        return ((dSin * d14) * d14) / 2.0d;
    }

    public static BoundingBox square(BoundingBox boundingBox) {
        if (distance(boundingBox.southwest(), Point.fromLngLat(boundingBox.east(), boundingBox.south())) >= distance(Point.fromLngLat(boundingBox.west(), boundingBox.south()), Point.fromLngLat(boundingBox.west(), boundingBox.north()))) {
            double dNorth = (boundingBox.north() + boundingBox.south()) / 2.0d;
            return BoundingBox.fromLngLats(boundingBox.west(), dNorth - ((boundingBox.east() - boundingBox.west()) / 2.0d), boundingBox.east(), ((boundingBox.east() - boundingBox.west()) / 2.0d) + dNorth);
        }
        double dEast = (boundingBox.east() + boundingBox.west()) / 2.0d;
        return BoundingBox.fromLngLats(dEast - ((boundingBox.north() - boundingBox.south()) / 2.0d), boundingBox.south(), ((boundingBox.north() - boundingBox.south()) / 2.0d) + dEast, boundingBox.north());
    }

    public static double area(Feature feature) {
        if (feature.geometry() != null) {
            return area(feature.geometry());
        }
        return 0.0d;
    }

    public static Feature center(Feature feature) {
        return center(FeatureCollection.fromFeature(feature), (JsonObject) null, (String) null);
    }

    public static double area(Geometry geometry) {
        return calculateArea(geometry);
    }

    public static Feature center(Feature feature, JsonObject jsonObject, String str) {
        return center(FeatureCollection.fromFeature(feature), jsonObject, str);
    }

    public static Feature center(FeatureCollection featureCollection) {
        return center(featureCollection, (JsonObject) null, (String) null);
    }

    public static double length(MultiLineString multiLineString, @TurfConstants.TurfUnitCriteria String str) {
        Iterator<List<Point>> it = multiLineString.coordinates().iterator();
        double length = 0.0d;
        while (it.hasNext()) {
            length += length(it.next(), str);
        }
        return length;
    }

    public static double length(Polygon polygon, @TurfConstants.TurfUnitCriteria String str) {
        Iterator<List<Point>> it = polygon.coordinates().iterator();
        double length = 0.0d;
        while (it.hasNext()) {
            length += length(it.next(), str);
        }
        return length;
    }

    public static double length(LineString lineString, @TurfConstants.TurfUnitCriteria String str) {
        return length(lineString.coordinates(), str);
    }

    public static double length(List<Point> list, String str) {
        Point point = list.get(0);
        double dDistance = 0.0d;
        int i14 = 1;
        while (i14 < list.size()) {
            Point point2 = list.get(i14);
            dDistance += distance(point, point2, str);
            i14++;
            point = point2;
        }
        return dDistance;
    }

    public static Feature bboxPolygon(BoundingBox boundingBox) {
        return bboxPolygon(boundingBox, (JsonObject) null, (String) null);
    }

    public static Feature bboxPolygon(double[] dArr) {
        return bboxPolygon(dArr, (JsonObject) null, (String) null);
    }

    public static Feature bboxPolygon(double[] dArr, JsonObject jsonObject, String str) {
        return Feature.fromGeometry(Polygon.fromLngLats((List<List<Point>>) Collections.singletonList(Arrays.asList(Point.fromLngLat(dArr[0], dArr[1]), Point.fromLngLat(dArr[2], dArr[1]), Point.fromLngLat(dArr[2], dArr[3]), Point.fromLngLat(dArr[0], dArr[3]), Point.fromLngLat(dArr[0], dArr[1])))), jsonObject, str);
    }

    public static double distance(Point point, Point point2) {
        return distance(point, point2, "kilometers");
    }

    public static Point along(LineString lineString, double d14, @TurfConstants.TurfUnitCriteria String str) {
        return along(lineString.coordinates(), d14, str);
    }

    public static double[] bbox(LineString lineString) {
        return bboxCalculator(TurfMeta.coordAll(lineString));
    }

    public static double[] bbox(MultiPoint multiPoint) {
        return bboxCalculator(TurfMeta.coordAll(multiPoint));
    }

    public static double[] bbox(Polygon polygon) {
        return bboxCalculator(TurfMeta.coordAll(polygon, false));
    }

    public static double[] bbox(MultiLineString multiLineString) {
        return bboxCalculator(TurfMeta.coordAll(multiLineString));
    }

    public static double[] bbox(MultiPolygon multiPolygon) {
        return bboxCalculator(TurfMeta.coordAll(multiPolygon, false));
    }

    public static double[] bbox(GeoJson geoJson) {
        BoundingBox boundingBoxBbox = geoJson.bbox();
        if (boundingBoxBbox != null) {
            return new double[]{boundingBoxBbox.west(), boundingBoxBbox.south(), boundingBoxBbox.east(), boundingBoxBbox.north()};
        }
        if (geoJson instanceof Geometry) {
            return bbox((Geometry) geoJson);
        }
        if (geoJson instanceof FeatureCollection) {
            return bbox((FeatureCollection) geoJson);
        }
        if (geoJson instanceof Feature) {
            return bbox((Feature) geoJson);
        }
        e.w("bbox type not supported for GeoJson instance");
        return null;
    }

    public static double[] bbox(FeatureCollection featureCollection) {
        return bboxCalculator(TurfMeta.coordAll(featureCollection, false));
    }

    public static double[] bbox(Feature feature) {
        return bboxCalculator(TurfMeta.coordAll(feature, false));
    }

    public static double[] bbox(Point point) {
        return bboxCalculator(TurfMeta.coordAll(point));
    }
}
