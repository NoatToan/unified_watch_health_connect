package com.mapbox.geojson;

import androidx.annotation.Keep;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.exception.GeoJsonException;
import com.mapbox.geojson.shifter.CoordinateShifterManager;
import com.mapbox.geojson.utils.GeoJsonUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
abstract class BaseCoordinatesTypeAdapter<T> extends TypeAdapter<T> {
    public Point readPoint(JsonReader jsonReader) {
        List<Double> pointList = readPointList(jsonReader);
        if (pointList == null || pointList.size() <= 1) {
            throw new GeoJsonException(" Point coordinates should be non-null double array");
        }
        return new Point("Point", null, pointList);
    }

    public List<Double> readPointList(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            throw null;
        }
        ArrayList arrayList = new ArrayList(3);
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(Double.valueOf(jsonReader.nextDouble()));
        }
        jsonReader.endArray();
        return arrayList.size() > 2 ? CoordinateShifterManager.getCoordinateShifter().shiftLonLatAlt(((Double) arrayList.get(0)).doubleValue(), ((Double) arrayList.get(1)).doubleValue(), ((Double) arrayList.get(2)).doubleValue()) : CoordinateShifterManager.getCoordinateShifter().shiftLonLat(((Double) arrayList.get(0)).doubleValue(), ((Double) arrayList.get(1)).doubleValue());
    }

    public void writePoint(JsonWriter jsonWriter, Point point) {
        if (point == null) {
            return;
        }
        writePointList(jsonWriter, point.coordinates());
    }

    public void writePointList(JsonWriter jsonWriter, List<Double> list) {
        if (list == null) {
            return;
        }
        jsonWriter.beginArray();
        List<Double> listUnshiftPoint = CoordinateShifterManager.getCoordinateShifter().unshiftPoint(list);
        jsonWriter.value(GeoJsonUtils.trim(listUnshiftPoint.get(0).doubleValue()));
        jsonWriter.value(GeoJsonUtils.trim(listUnshiftPoint.get(1).doubleValue()));
        if (list.size() > 2) {
            jsonWriter.value(listUnshiftPoint.get(2));
        }
        jsonWriter.endArray();
    }
}
