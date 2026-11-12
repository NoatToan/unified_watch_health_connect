package com.mapbox.turf;

import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.GeometryCollection;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.MultiLineString;
import com.mapbox.geojson.MultiPoint;
import com.mapbox.geojson.MultiPolygon;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.Polygon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class TurfMeta {
    private TurfMeta() {
    }

    private static List<Point> addCoordAll(List<Point> list, Feature feature, boolean z14) {
        return coordAllFromSingleGeometry(list, feature.geometry(), z14);
    }

    private static List<Point> coordAll(List<Point> list, MultiPolygon multiPolygon, boolean z14) {
        for (int i14 = 0; i14 < multiPolygon.coordinates().size(); i14++) {
            for (int i15 = 0; i15 < multiPolygon.coordinates().get(i14).size(); i15++) {
                for (int i16 = 0; i16 < multiPolygon.coordinates().get(i14).get(i15).size() - (z14 ? 1 : 0); i16++) {
                    list.add(multiPolygon.coordinates().get(i14).get(i15).get(i16));
                }
            }
        }
        return list;
    }

    private static List<Point> coordAllFromSingleGeometry(List<Point> list, Geometry geometry, boolean z14) {
        if (geometry instanceof Point) {
            list.add((Point) geometry);
            return list;
        }
        if (geometry instanceof MultiPoint) {
            list.addAll(((MultiPoint) geometry).coordinates());
            return list;
        }
        if (geometry instanceof LineString) {
            list.addAll(((LineString) geometry).coordinates());
            return list;
        }
        if (geometry instanceof MultiLineString) {
            coordAll(list, (MultiLineString) geometry);
            return list;
        }
        if (geometry instanceof Polygon) {
            coordAll(list, (Polygon) geometry, z14);
            return list;
        }
        if (geometry instanceof MultiPolygon) {
            coordAll(list, (MultiPolygon) geometry, z14);
            return list;
        }
        if (geometry instanceof GeometryCollection) {
            Iterator<Geometry> it = ((GeometryCollection) geometry).geometries().iterator();
            while (it.hasNext()) {
                coordAllFromSingleGeometry(list, it.next(), z14);
            }
        }
        return list;
    }

    public static Point getCoord(Feature feature) {
        if (feature.geometry() instanceof Point) {
            return (Point) feature.geometry();
        }
        throw new TurfException("A Feature with a Point geometry is required.");
    }

    private static List<Point> coordAll(List<Point> list, Point point) {
        list.add(point);
        return list;
    }

    public static List<Point> coordAll(MultiPoint multiPoint) {
        return coordAll(new ArrayList(), multiPoint);
    }

    private static List<Point> coordAll(List<Point> list, MultiPoint multiPoint) {
        list.addAll(multiPoint.coordinates());
        return list;
    }

    public static List<Point> coordAll(LineString lineString) {
        return coordAll(new ArrayList(), lineString);
    }

    private static List<Point> coordAll(List<Point> list, LineString lineString) {
        list.addAll(lineString.coordinates());
        return list;
    }

    public static List<Point> coordAll(Polygon polygon, boolean z14) {
        return coordAll(new ArrayList(), polygon, z14);
    }

    private static List<Point> coordAll(List<Point> list, Polygon polygon, boolean z14) {
        for (int i14 = 0; i14 < polygon.coordinates().size(); i14++) {
            for (int i15 = 0; i15 < polygon.coordinates().get(i14).size() - (z14 ? 1 : 0); i15++) {
                list.add(polygon.coordinates().get(i14).get(i15));
            }
        }
        return list;
    }

    public static List<Point> coordAll(MultiLineString multiLineString) {
        return coordAll(new ArrayList(), multiLineString);
    }

    private static List<Point> coordAll(List<Point> list, MultiLineString multiLineString) {
        for (int i14 = 0; i14 < multiLineString.coordinates().size(); i14++) {
            list.addAll(multiLineString.coordinates().get(i14));
        }
        return list;
    }

    public static List<Point> coordAll(MultiPolygon multiPolygon, boolean z14) {
        return coordAll(new ArrayList(), multiPolygon, z14);
    }

    public static List<Point> coordAll(Point point) {
        return coordAll(new ArrayList(), point);
    }

    public static List<Point> coordAll(Feature feature, boolean z14) {
        return addCoordAll(new ArrayList(), feature, z14);
    }

    public static List<Point> coordAll(FeatureCollection featureCollection, boolean z14) {
        ArrayList arrayList = new ArrayList();
        Iterator<Feature> it = featureCollection.features().iterator();
        while (it.hasNext()) {
            addCoordAll(arrayList, it.next(), z14);
        }
        return arrayList;
    }
}
