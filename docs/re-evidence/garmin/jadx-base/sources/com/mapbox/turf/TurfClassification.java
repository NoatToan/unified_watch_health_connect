package com.mapbox.turf;

import com.mapbox.geojson.Point;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class TurfClassification {
    private TurfClassification() {
    }

    public static Point nearestPoint(Point point, List<Point> list) {
        if (list.isEmpty()) {
            return point;
        }
        Point point2 = list.get(0);
        double d14 = Double.POSITIVE_INFINITY;
        for (Point point3 : list) {
            double dDistance = TurfMeasurement.distance(point, point3);
            if (dDistance < d14) {
                point2 = point3;
                d14 = dDistance;
            }
        }
        return point2;
    }
}
