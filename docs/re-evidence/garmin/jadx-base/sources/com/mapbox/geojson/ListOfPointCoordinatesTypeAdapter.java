package com.mapbox.geojson;

import androidx.annotation.Keep;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.exception.GeoJsonException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
class ListOfPointCoordinatesTypeAdapter extends BaseCoordinatesTypeAdapter<List<Point>> {
    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public List<Point> read2(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            throw null;
        }
        if (jsonReader.peek() != JsonToken.BEGIN_ARRAY) {
            throw new GeoJsonException("coordinates should be non-null array of array of double");
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            arrayList.add(readPoint(jsonReader));
        }
        jsonReader.endArray();
        return arrayList;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, List<Point> list) {
        if (list == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        Iterator<Point> it = list.iterator();
        while (it.hasNext()) {
            writePoint(jsonWriter, it.next());
        }
        jsonWriter.endArray();
    }
}
