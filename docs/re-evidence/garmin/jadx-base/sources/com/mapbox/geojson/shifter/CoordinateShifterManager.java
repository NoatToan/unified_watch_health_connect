package com.mapbox.geojson.shifter;

import com.mapbox.geojson.Point;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class CoordinateShifterManager {
    private static final CoordinateShifter DEFAULT;
    private static volatile CoordinateShifter coordinateShifter;

    static {
        CoordinateShifter coordinateShifter2 = new CoordinateShifter() { // from class: com.mapbox.geojson.shifter.CoordinateShifterManager.1
            @Override // com.mapbox.geojson.shifter.CoordinateShifter
            public List<Double> shiftLonLat(double d14, double d15) {
                return Arrays.asList(Double.valueOf(d14), Double.valueOf(d15));
            }

            @Override // com.mapbox.geojson.shifter.CoordinateShifter
            public List<Double> shiftLonLatAlt(double d14, double d15, double d16) {
                return Double.isNaN(d16) ? Arrays.asList(Double.valueOf(d14), Double.valueOf(d15)) : Arrays.asList(Double.valueOf(d14), Double.valueOf(d15), Double.valueOf(d16));
            }

            @Override // com.mapbox.geojson.shifter.CoordinateShifter
            public List<Double> unshiftPoint(Point point) {
                return point.coordinates();
            }

            @Override // com.mapbox.geojson.shifter.CoordinateShifter
            public List<Double> unshiftPoint(List<Double> list) {
                return list;
            }
        };
        DEFAULT = coordinateShifter2;
        coordinateShifter = coordinateShifter2;
    }

    public static CoordinateShifter getCoordinateShifter() {
        return coordinateShifter;
    }

    public static boolean isUsingDefaultShifter() {
        return coordinateShifter == DEFAULT;
    }

    public static void setCoordinateShifter(CoordinateShifter coordinateShifter2) {
        if (coordinateShifter2 == null) {
            coordinateShifter2 = DEFAULT;
        }
        coordinateShifter = coordinateShifter2;
    }
}
