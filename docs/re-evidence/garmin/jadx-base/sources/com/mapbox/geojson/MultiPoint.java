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
import java.util.List;
import org.apache.commons.text.StringSubstitutor;
import u62.z;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class MultiPoint implements CoordinateContainer<List<Point>> {
    private static final String TYPE = "MultiPoint";
    private final BoundingBox bbox;
    private final List<Point> coordinates;
    private final String type;

    public MultiPoint(String str, BoundingBox boundingBox, List<Point> list) {
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

    public static MultiPoint fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        return (MultiPoint) gsonBuilder.create().fromJson(str, MultiPoint.class);
    }

    public static MultiPoint fromLngLats(double[][] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double[] dArr2 : dArr) {
            arrayList.add(Point.fromLngLat(dArr2));
        }
        return new MultiPoint(TYPE, null, arrayList);
    }

    public static TypeAdapter<MultiPoint> typeAdapter(Gson gson) {
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
        if (obj instanceof MultiPoint) {
            MultiPoint multiPoint = (MultiPoint) obj;
            if (this.type.equals(multiPoint.type()) && ((boundingBox = this.bbox) != null ? boundingBox.equals(multiPoint.bbox()) : multiPoint.bbox() == null) && this.coordinates.equals(multiPoint.coordinates())) {
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

    @Override // com.mapbox.geojson.GeoJson
    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        return gsonBuilder.create().toJson(this);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("MultiPoint{type=");
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

    public static final class GsonTypeAdapter extends BaseGeometryTypeAdapter<MultiPoint, List<Point>> {
        public GsonTypeAdapter(Gson gson) {
            super(gson, new ListOfPointCoordinatesTypeAdapter());
        }

        @Override // com.mapbox.geojson.BaseGeometryTypeAdapter
        public CoordinateContainer<List<Point>> createCoordinateContainer(String str, BoundingBox boundingBox, List<Point> list) {
            if (str == null) {
                str = MultiPoint.TYPE;
            }
            return new MultiPoint(str, boundingBox, list);
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public MultiPoint read2(JsonReader jsonReader) {
            return (MultiPoint) readCoordinateContainer(jsonReader);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, MultiPoint multiPoint) {
            writeCoordinateContainer(jsonWriter, multiPoint);
        }
    }

    @Override // com.mapbox.geojson.CoordinateContainer
    public List<Point> coordinates() {
        return this.coordinates;
    }

    public static MultiPoint fromLngLats(List<Point> list, BoundingBox boundingBox) {
        return new MultiPoint(TYPE, boundingBox, list);
    }

    public static MultiPoint fromLngLats(List<Point> list) {
        return new MultiPoint(TYPE, null, list);
    }
}
