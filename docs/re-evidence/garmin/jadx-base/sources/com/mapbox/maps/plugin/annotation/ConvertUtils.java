package com.mapbox.maps.plugin.annotation;

import com.google.gson.JsonArray;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MercatorCoordinate;
import com.mapbox.maps.Projection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rJ\u0016\u0010\u000e\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rJ\u001e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bJ\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b¨\u0006\u0016"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/ConvertUtils;", "", "()V", "calculateMercatorCoordinateShift", "Lcom/mapbox/maps/MercatorCoordinate;", "startPoint", "Lcom/mapbox/geojson/Point;", "endPoint", "zoomLevel", "", "convertDoubleArray", "Lcom/google/gson/JsonArray;", "value", "", "convertStringArray", "shiftPointWithMercatorCoordinate", "point", "shiftMercatorCoordinate", "toDoubleArray", "jsonArray", "toStringArray", "", "plugin-annotation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ConvertUtils {
    public static final ConvertUtils INSTANCE = new ConvertUtils();

    private ConvertUtils() {
    }

    public final MercatorCoordinate calculateMercatorCoordinateShift(Point startPoint, Point endPoint, double zoomLevel) {
        startPoint.getClass();
        endPoint.getClass();
        MercatorCoordinate mercatorCoordinateProject = Projection.project(startPoint, zoomLevel);
        MercatorCoordinate mercatorCoordinateProject2 = Projection.project(endPoint, zoomLevel);
        return new MercatorCoordinate(mercatorCoordinateProject2.getX() - mercatorCoordinateProject.getX(), mercatorCoordinateProject2.getY() - mercatorCoordinateProject.getY());
    }

    public final JsonArray convertDoubleArray(List<? extends Object> value) {
        JsonArray jsonArray = new JsonArray();
        if (value != null) {
            Iterator<? extends Object> it = value.iterator();
            while (it.hasNext()) {
                jsonArray.add(Double.valueOf(Double.parseDouble(it.next().toString())));
            }
        }
        return jsonArray;
    }

    public final JsonArray convertStringArray(List<? extends Object> value) {
        JsonArray jsonArray = new JsonArray();
        if (value != null) {
            Iterator<? extends Object> it = value.iterator();
            while (it.hasNext()) {
                jsonArray.add(it.next().toString());
            }
        }
        return jsonArray;
    }

    public final Point shiftPointWithMercatorCoordinate(Point point, MercatorCoordinate shiftMercatorCoordinate, double zoomLevel) {
        point.getClass();
        shiftMercatorCoordinate.getClass();
        MercatorCoordinate mercatorCoordinateProject = Projection.project(point, zoomLevel);
        Point pointUnproject = Projection.unproject(new MercatorCoordinate(shiftMercatorCoordinate.getX() + mercatorCoordinateProject.getX(), shiftMercatorCoordinate.getY() + mercatorCoordinateProject.getY()), zoomLevel);
        pointUnproject.getClass();
        return pointUnproject;
    }

    public final List<Double> toDoubleArray(JsonArray jsonArray) {
        ArrayList arrayList = new ArrayList();
        if (jsonArray != null) {
            int size = jsonArray.size();
            for (int i14 = 0; i14 < size; i14++) {
                arrayList.set(i14, Double.valueOf(jsonArray.get(i14).getAsDouble()));
            }
        }
        return arrayList;
    }

    public final List<String> toStringArray(JsonArray jsonArray) {
        ArrayList arrayList = new ArrayList();
        if (jsonArray != null) {
            int size = jsonArray.size();
            for (int i14 = 0; i14 < size; i14++) {
                String asString = jsonArray.get(i14).getAsString();
                asString.getClass();
                arrayList.set(i14, asString);
            }
        }
        return arrayList;
    }
}
