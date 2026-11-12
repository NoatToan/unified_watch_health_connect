package com.mapbox.geojson;

import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import j20.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;
import u62.z;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class MultiLineString implements CoordinateContainer<List<List<Point>>> {
    private static final String TYPE = "MultiLineString";
    private final BoundingBox bbox;
    private final List<List<Point>> coordinates;
    private final String type;

    public MultiLineString(String str, BoundingBox boundingBox, List<List<Point>> list) {
        if (str == null) {
            x.l("Null type");
            throw null;
        }
        this.type = str;
        this.bbox = boundingBox;
        if (list != null) {
            this.coordinates = list;
        } else {
            x.l("Null coordinates");
            throw null;
        }
    }

    public static MultiLineString fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        return (MultiLineString) gsonBuilder.create().fromJson(str, MultiLineString.class);
    }

    public static MultiLineString fromLineString(LineString lineString) {
        return new MultiLineString(TYPE, null, Arrays.asList(lineString.coordinates()));
    }

    public static MultiLineString fromLineStrings(List<LineString> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<LineString> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().coordinates());
        }
        return new MultiLineString(TYPE, null, arrayList);
    }

    public static MultiLineString fromLngLats(double[][][] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (int i14 = 0; i14 < dArr.length; i14++) {
            ArrayList arrayList2 = new ArrayList(dArr[i14].length);
            int i15 = 0;
            while (true) {
                double[][] dArr2 = dArr[i14];
                if (i15 < dArr2.length) {
                    arrayList2.add(Point.fromLngLat(dArr2[i15]));
                    i15++;
                }
            }
            arrayList.add(arrayList2);
        }
        return new MultiLineString(TYPE, null, arrayList);
    }

    public static TypeAdapter<MultiLineString> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    @Override // com.mapbox.geojson.GeoJson
    public BoundingBox bbox() {
        return this.bbox;
    }

    public boolean equals(Object obj) {
        BoundingBox boundingBox;
        if (obj == this) {
            return true;
        }
        if (obj instanceof MultiLineString) {
            MultiLineString multiLineString = (MultiLineString) obj;
            if (this.type.equals(multiLineString.type()) && ((boundingBox = this.bbox) != null ? boundingBox.equals(multiLineString.bbox()) : multiLineString.bbox() == null) && this.coordinates.equals(multiLineString.coordinates())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        return ((iHashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003) ^ this.coordinates.hashCode();
    }

    public List<LineString> lineStrings() {
        List<List<Point>> listCoordinates = coordinates();
        ArrayList arrayList = new ArrayList(listCoordinates.size());
        Iterator<List<Point>> it = listCoordinates.iterator();
        while (it.hasNext()) {
            arrayList.add(LineString.fromLngLats(it.next()));
        }
        return arrayList;
    }

    @Override // com.mapbox.geojson.GeoJson
    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        return gsonBuilder.create().toJson(this);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("MultiLineString{type=");
        sb3.append(this.type);
        sb3.append(", bbox=");
        sb3.append(this.bbox);
        sb3.append(", coordinates=");
        return z.c(sb3, this.coordinates, StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // com.mapbox.geojson.GeoJson
    public String type() {
        return this.type;
    }

    public static final class GsonTypeAdapter extends BaseGeometryTypeAdapter<MultiLineString, List<List<Point>>> {
        public GsonTypeAdapter(Gson gson) {
            super(gson, new ListOfListOfPointCoordinatesTypeAdapter());
        }

        @Override // com.mapbox.geojson.BaseGeometryTypeAdapter
        public CoordinateContainer<List<List<Point>>> createCoordinateContainer(String str, BoundingBox boundingBox, List<List<Point>> list) {
            if (str == null) {
                str = MultiLineString.TYPE;
            }
            return new MultiLineString(str, boundingBox, list);
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public MultiLineString read2(JsonReader jsonReader) {
            return (MultiLineString) readCoordinateContainer(jsonReader);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, MultiLineString multiLineString) {
            writeCoordinateContainer(jsonWriter, multiLineString);
        }
    }

    @Override // com.mapbox.geojson.CoordinateContainer
    public List<List<Point>> coordinates() {
        return this.coordinates;
    }

    public static MultiLineString fromLineString(LineString lineString, BoundingBox boundingBox) {
        return new MultiLineString(TYPE, boundingBox, Arrays.asList(lineString.coordinates()));
    }

    public static MultiLineString fromLineStrings(List<LineString> list, BoundingBox boundingBox) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<LineString> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().coordinates());
        }
        return new MultiLineString(TYPE, boundingBox, arrayList);
    }

    public static MultiLineString fromLngLats(List<List<Point>> list, BoundingBox boundingBox) {
        return new MultiLineString(TYPE, boundingBox, list);
    }

    public static MultiLineString fromLngLats(List<List<Point>> list) {
        return new MultiLineString(TYPE, null, list);
    }
}
