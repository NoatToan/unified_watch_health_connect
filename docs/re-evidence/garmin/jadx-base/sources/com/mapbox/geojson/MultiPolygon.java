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
public final class MultiPolygon implements CoordinateContainer<List<List<List<Point>>>> {
    private static final String TYPE = "MultiPolygon";
    private final BoundingBox bbox;
    private final List<List<List<Point>>> coordinates;
    private final String type;

    public MultiPolygon(String str, BoundingBox boundingBox, List<List<List<Point>>> list) {
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

    public static MultiPolygon fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        return (MultiPolygon) gsonBuilder.create().fromJson(str, MultiPolygon.class);
    }

    public static MultiPolygon fromLngLats(double[][][][] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (int i14 = 0; i14 < dArr.length; i14++) {
            ArrayList arrayList2 = new ArrayList(dArr[i14].length);
            for (int i15 = 0; i15 < dArr[i14].length; i15++) {
                ArrayList arrayList3 = new ArrayList(dArr[i14][i15].length);
                int i16 = 0;
                while (true) {
                    double[][] dArr2 = dArr[i14][i15];
                    if (i16 < dArr2.length) {
                        arrayList3.add(Point.fromLngLat(dArr2[i16]));
                        i16++;
                    }
                }
                arrayList2.add(arrayList3);
            }
            arrayList.add(arrayList2);
        }
        return new MultiPolygon(TYPE, null, arrayList);
    }

    public static MultiPolygon fromPolygon(Polygon polygon) {
        return new MultiPolygon(TYPE, null, Arrays.asList(polygon.coordinates()));
    }

    public static MultiPolygon fromPolygons(List<Polygon> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Polygon> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().coordinates());
        }
        return new MultiPolygon(TYPE, null, arrayList);
    }

    public static TypeAdapter<MultiPolygon> typeAdapter(Gson gson) {
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
        if (obj instanceof MultiPolygon) {
            MultiPolygon multiPolygon = (MultiPolygon) obj;
            if (this.type.equals(multiPolygon.type()) && ((boundingBox = this.bbox) != null ? boundingBox.equals(multiPolygon.bbox()) : multiPolygon.bbox() == null) && this.coordinates.equals(multiPolygon.coordinates())) {
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

    public List<Polygon> polygons() {
        List<List<List<Point>>> listCoordinates = coordinates();
        ArrayList arrayList = new ArrayList(listCoordinates.size());
        Iterator<List<List<Point>>> it = listCoordinates.iterator();
        while (it.hasNext()) {
            arrayList.add(Polygon.fromLngLats(it.next()));
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
        StringBuilder sb3 = new StringBuilder("Polygon{type=");
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

    public static final class GsonTypeAdapter extends BaseGeometryTypeAdapter<MultiPolygon, List<List<List<Point>>>> {
        public GsonTypeAdapter(Gson gson) {
            super(gson, new ListofListofListOfPointCoordinatesTypeAdapter());
        }

        @Override // com.mapbox.geojson.BaseGeometryTypeAdapter
        public CoordinateContainer<List<List<List<Point>>>> createCoordinateContainer(String str, BoundingBox boundingBox, List<List<List<Point>>> list) {
            if (str == null) {
                str = MultiPolygon.TYPE;
            }
            return new MultiPolygon(str, boundingBox, list);
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public MultiPolygon read2(JsonReader jsonReader) {
            return (MultiPolygon) readCoordinateContainer(jsonReader);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, MultiPolygon multiPolygon) {
            writeCoordinateContainer(jsonWriter, multiPolygon);
        }
    }

    @Override // com.mapbox.geojson.CoordinateContainer
    public List<List<List<Point>>> coordinates() {
        return this.coordinates;
    }

    public static MultiPolygon fromPolygon(Polygon polygon, BoundingBox boundingBox) {
        return new MultiPolygon(TYPE, boundingBox, Arrays.asList(polygon.coordinates()));
    }

    public static MultiPolygon fromPolygons(List<Polygon> list, BoundingBox boundingBox) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Polygon> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().coordinates());
        }
        return new MultiPolygon(TYPE, boundingBox, arrayList);
    }

    public static MultiPolygon fromLngLats(List<List<List<Point>>> list, BoundingBox boundingBox) {
        return new MultiPolygon(TYPE, boundingBox, list);
    }

    public static MultiPolygon fromLngLats(List<List<List<Point>>> list) {
        return new MultiPolygon(TYPE, null, list);
    }
}
