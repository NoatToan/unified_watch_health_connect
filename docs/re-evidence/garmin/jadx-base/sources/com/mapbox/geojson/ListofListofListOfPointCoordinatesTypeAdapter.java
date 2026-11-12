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
class ListofListofListOfPointCoordinatesTypeAdapter extends BaseCoordinatesTypeAdapter<List<List<List<Point>>>> {
    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public List<List<List<Point>>> read2(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            throw null;
        }
        if (jsonReader.peek() != JsonToken.BEGIN_ARRAY) {
            throw new GeoJsonException("coordinates should be array of array of array of double");
        }
        jsonReader.beginArray();
        ArrayList arrayList = new ArrayList();
        while (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            ArrayList arrayList2 = new ArrayList();
            while (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                ArrayList arrayList3 = new ArrayList();
                while (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                    arrayList3.add(readPoint(jsonReader));
                }
                jsonReader.endArray();
                arrayList2.add(arrayList3);
            }
            jsonReader.endArray();
            arrayList.add(arrayList2);
        }
        jsonReader.endArray();
        return arrayList;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, List<List<List<Point>>> list) {
        if (list == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        for (List<List<Point>> list2 : list) {
            jsonWriter.beginArray();
            for (List<Point> list3 : list2) {
                jsonWriter.beginArray();
                Iterator<Point> it = list3.iterator();
                while (it.hasNext()) {
                    writePoint(jsonWriter, it.next());
                }
                jsonWriter.endArray();
            }
            jsonWriter.endArray();
        }
        jsonWriter.endArray();
    }
}
