package com.mapbox.geojson;

import androidx.annotation.Keep;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
class ListOfDoublesCoordinatesTypeAdapter extends BaseCoordinatesTypeAdapter<List<Double>> {
    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public List<Double> read2(JsonReader jsonReader) {
        return readPointList(jsonReader);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, List<Double> list) {
        writePointList(jsonWriter, list);
    }
}
