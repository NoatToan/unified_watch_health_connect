package com.mapbox.turf;

import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.MultiPolygon;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.Polygon;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class TurfJoins {
    private TurfJoins() {
    }

    private static boolean inRing(Point point, List<Point> list) {
        int size = list.size() - 1;
        boolean z14 = false;
        for (int i14 = 0; i14 < list.size(); i14++) {
            double dLongitude = list.get(i14).longitude();
            double dLatitude = list.get(i14).latitude();
            double dLongitude2 = list.get(size).longitude();
            double dLatitude2 = list.get(size).latitude();
            if ((dLatitude > point.latitude()) != (dLatitude2 > point.latitude())) {
                if (point.longitude() < (((point.latitude() - dLatitude) * (dLongitude2 - dLongitude)) / (dLatitude2 - dLatitude)) + dLongitude) {
                    z14 = !z14;
                }
            }
            size = i14;
        }
        return z14;
    }

    public static boolean inside(Point point, MultiPolygon multiPolygon) {
        List<List<List<Point>>> listCoordinates = multiPolygon.coordinates();
        boolean z14 = false;
        for (int i14 = 0; i14 < listCoordinates.size() && !z14; i14++) {
            if (inRing(point, listCoordinates.get(i14).get(0))) {
                boolean z15 = false;
                for (int i15 = 1; i15 < listCoordinates.get(i14).size() && !z15; i15++) {
                    if (inRing(point, listCoordinates.get(i14).get(i15))) {
                        z15 = true;
                    }
                }
                if (!z15) {
                    z14 = true;
                }
            }
        }
        return z14;
    }

    public static FeatureCollection pointsWithinPolygon(FeatureCollection featureCollection, FeatureCollection featureCollection2) {
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < featureCollection2.features().size(); i14++) {
            for (int i15 = 0; i15 < featureCollection.features().size(); i15++) {
                Point point = (Point) featureCollection.features().get(i15).geometry();
                if (inside(point, (Polygon) featureCollection2.features().get(i14).geometry())) {
                    arrayList.add(Feature.fromGeometry(point));
                }
            }
        }
        return FeatureCollection.fromFeatures(arrayList);
    }

    public static boolean inside(Point point, Polygon polygon) {
        List<List<Point>> listCoordinates = polygon.coordinates();
        ArrayList arrayList = new ArrayList();
        arrayList.add(listCoordinates);
        return inside(point, MultiPolygon.fromLngLats(arrayList));
    }
}
