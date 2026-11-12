package com.mapbox.turf;

import com.google.gson.JsonObject;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.MultiLineString;
import com.mapbox.geojson.MultiPoint;
import com.mapbox.geojson.MultiPolygon;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.Polygon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class TurfConversion {
    private static final Map<String, Double> FACTORS;

    static {
        HashMap map = new HashMap();
        FACTORS = map;
        map.put(TurfConstants.UNIT_MILES, Double.valueOf(3960.0d));
        map.put(TurfConstants.UNIT_NAUTICAL_MILES, Double.valueOf(3441.145d));
        map.put(TurfConstants.UNIT_DEGREES, Double.valueOf(57.2957795d));
        map.put(TurfConstants.UNIT_RADIANS, Double.valueOf(1.0d));
        map.put(TurfConstants.UNIT_INCHES, Double.valueOf(2.509056E8d));
        map.put(TurfConstants.UNIT_YARDS, Double.valueOf(6969600.0d));
        Double dValueOf = Double.valueOf(6373000.0d);
        map.put(TurfConstants.UNIT_METERS, dValueOf);
        Double dValueOf2 = Double.valueOf(6.373E8d);
        map.put(TurfConstants.UNIT_CENTIMETERS, dValueOf2);
        Double dValueOf3 = Double.valueOf(6373.0d);
        map.put("kilometers", dValueOf3);
        map.put(TurfConstants.UNIT_FEET, Double.valueOf(2.090879265E7d));
        map.put(TurfConstants.UNIT_CENTIMETRES, dValueOf2);
        map.put(TurfConstants.UNIT_METRES, dValueOf);
        map.put(TurfConstants.UNIT_KILOMETRES, dValueOf3);
    }

    private TurfConversion() {
    }

    public static FeatureCollection combine(FeatureCollection featureCollection) {
        if (featureCollection.features() == null) {
            throw new TurfException("Your FeatureCollection is null.");
        }
        if (featureCollection.features().size() == 0) {
            throw new TurfException("Your FeatureCollection doesn't have any Feature objects in it.");
        }
        ArrayList arrayList = new ArrayList(0);
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        Iterator<Feature> it = featureCollection.features().iterator();
        while (it.hasNext()) {
            Geometry geometry = it.next().geometry();
            boolean z14 = geometry instanceof Point;
            if (!z14 && !(geometry instanceof MultiPoint)) {
                boolean z15 = geometry instanceof LineString;
                if (!z15 && !(geometry instanceof MultiLineString)) {
                    boolean z16 = geometry instanceof Polygon;
                    if (z16 || (geometry instanceof MultiPolygon)) {
                        if (z16) {
                            arrayList3.add((Polygon) geometry);
                        } else {
                            arrayList3.addAll(((MultiPolygon) geometry).polygons());
                        }
                    }
                } else if (z15) {
                    arrayList2.add((LineString) geometry);
                } else {
                    arrayList2.addAll(((MultiLineString) geometry).lineStrings());
                }
            } else if (z14) {
                arrayList.add((Point) geometry);
            } else {
                arrayList.addAll(((MultiPoint) geometry).coordinates());
            }
        }
        ArrayList arrayList4 = new ArrayList(0);
        if (!arrayList.isEmpty()) {
            arrayList4.add(Feature.fromGeometry(MultiPoint.fromLngLats(arrayList)));
        }
        if (!arrayList2.isEmpty()) {
            arrayList4.add(Feature.fromGeometry(MultiLineString.fromLineStrings(arrayList2)));
        }
        if (!arrayList3.isEmpty()) {
            arrayList4.add(Feature.fromGeometry(MultiPolygon.fromPolygons(arrayList3)));
        }
        return arrayList4.isEmpty() ? featureCollection : FeatureCollection.fromFeatures(arrayList4);
    }

    public static double convertLength(double d14, @TurfConstants.TurfUnitCriteria String str, @TurfConstants.TurfUnitCriteria String str2) {
        if (str2 == null) {
            str2 = "kilometers";
        }
        return radiansToLength(lengthToRadians(d14, str), str2);
    }

    private static Feature coordsToLine(List<List<Point>> list, JsonObject jsonObject) {
        if (list.size() > 1) {
            return Feature.fromGeometry(MultiLineString.fromLngLats(list), jsonObject);
        }
        if (list.size() == 1) {
            return Feature.fromGeometry(LineString.fromLngLats(list.get(0)), jsonObject);
        }
        return null;
    }

    public static double degreesToRadians(double d14) {
        return ((d14 % 360.0d) * 3.141592653589793d) / 180.0d;
    }

    public static FeatureCollection explode(FeatureCollection featureCollection) {
        ArrayList arrayList = new ArrayList();
        Iterator<Point> it = TurfMeta.coordAll(featureCollection, true).iterator();
        while (it.hasNext()) {
            arrayList.add(Feature.fromGeometry(it.next()));
        }
        return FeatureCollection.fromFeatures(arrayList);
    }

    public static double lengthToDegrees(double d14, @TurfConstants.TurfUnitCriteria String str) {
        return radiansToDegrees(lengthToRadians(d14, str));
    }

    public static double lengthToRadians(double d14, @TurfConstants.TurfUnitCriteria String str) {
        return d14 / FACTORS.get(str).doubleValue();
    }

    public static FeatureCollection multiPolygonToLine(Feature feature, JsonObject jsonObject) {
        Geometry geometry = feature.geometry();
        if (!(geometry instanceof MultiPolygon)) {
            throw new TurfException("Feature's geometry must be MultiPolygon");
        }
        MultiPolygon multiPolygon = (MultiPolygon) geometry;
        if (jsonObject == null) {
            jsonObject = feature.type().equals("Feature") ? feature.properties() : new JsonObject();
        }
        return polygonToLine(multiPolygon, jsonObject);
    }

    public static Feature polygonToLine(Feature feature, JsonObject jsonObject) {
        Geometry geometry = feature.geometry();
        if (!(geometry instanceof Polygon)) {
            throw new TurfException("Feature's geometry must be Polygon");
        }
        Polygon polygon = (Polygon) geometry;
        if (jsonObject == null) {
            jsonObject = feature.type().equals("Feature") ? feature.properties() : new JsonObject();
        }
        return polygonToLine(polygon, jsonObject);
    }

    public static double radiansToDegrees(double d14) {
        return ((d14 % 6.283185307179586d) * 180.0d) / 3.141592653589793d;
    }

    public static double radiansToLength(double d14, @TurfConstants.TurfUnitCriteria String str) {
        return FACTORS.get(str).doubleValue() * d14;
    }

    public static double convertLength(double d14, @TurfConstants.TurfUnitCriteria String str) {
        return convertLength(d14, str, "kilometers");
    }

    public static double lengthToRadians(double d14) {
        return lengthToRadians(d14, "kilometers");
    }

    public static double radiansToLength(double d14) {
        return radiansToLength(d14, "kilometers");
    }

    public static FeatureCollection explode(Feature feature) {
        ArrayList arrayList = new ArrayList();
        Iterator<Point> it = TurfMeta.coordAll(feature, true).iterator();
        while (it.hasNext()) {
            arrayList.add(Feature.fromGeometry(it.next()));
        }
        return FeatureCollection.fromFeatures(arrayList);
    }

    public static FeatureCollection multiPolygonToLine(Feature feature) {
        return multiPolygonToLine(feature, null);
    }

    public static Feature polygonToLine(Feature feature) {
        return polygonToLine(feature, (JsonObject) null);
    }

    public static Feature polygonToLine(Polygon polygon) {
        return polygonToLine(polygon, (JsonObject) null);
    }

    public static FeatureCollection polygonToLine(MultiPolygon multiPolygon) {
        return polygonToLine(multiPolygon, (JsonObject) null);
    }

    public static Feature polygonToLine(Polygon polygon, JsonObject jsonObject) {
        return coordsToLine(polygon.coordinates(), jsonObject);
    }

    public static FeatureCollection polygonToLine(MultiPolygon multiPolygon, JsonObject jsonObject) {
        List<List<List<Point>>> listCoordinates = multiPolygon.coordinates();
        ArrayList arrayList = new ArrayList();
        Iterator<List<List<Point>>> it = listCoordinates.iterator();
        while (it.hasNext()) {
            arrayList.add(coordsToLine(it.next(), jsonObject));
        }
        return FeatureCollection.fromFeatures(arrayList);
    }
}
