package com.mapbox.geojson;

import androidx.annotation.Keep;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class PointAsCoordinatesTypeAdapter extends BaseCoordinatesTypeAdapter<Point> {
    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public Point read2(JsonReader jsonReader) {
        return readPoint(jsonReader);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Point point) {
        writePoint(jsonWriter, point);
    }
}
