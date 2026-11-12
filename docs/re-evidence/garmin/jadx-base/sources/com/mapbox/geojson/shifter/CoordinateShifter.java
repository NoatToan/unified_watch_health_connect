package com.mapbox.geojson.shifter;

import com.mapbox.geojson.Point;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface CoordinateShifter {
    List<Double> shiftLonLat(double d14, double d15);

    List<Double> shiftLonLatAlt(double d14, double d15, double d16);

    List<Double> unshiftPoint(Point point);

    List<Double> unshiftPoint(List<Double> list);
}
