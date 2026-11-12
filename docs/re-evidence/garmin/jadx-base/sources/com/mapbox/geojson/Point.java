package com.mapbox.geojson;

import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.mapbox.geojson.shifter.CoordinateShifterManager;
import j20.x;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;
import u62.z;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class Point implements CoordinateContainer<List<Double>> {
    private static final String TYPE = "Point";
    private final BoundingBox bbox;
    private final List<Double> coordinates;
    private final String type;

    public Point(String str, BoundingBox boundingBox, List<Double> list) {
        if (str == null) {
            x.l("Null type");
            throw null;
        }
        this.type = str;
        this.bbox = boundingBox;
        if (list == null || list.size() == 0) {
            x.l("Null coordinates");
            throw null;
        }
        this.coordinates = list;
    }

    public static Point fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        return (Point) gsonBuilder.create().fromJson(str, Point.class);
    }

    public static Point fromLngLat(double[] dArr) {
        if (dArr.length == 2) {
            return fromLngLat(dArr[0], dArr[1]);
        }
        if (dArr.length > 2) {
            return fromLngLat(dArr[0], dArr[1], dArr[2]);
        }
        return null;
    }

    public static TypeAdapter<Point> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public double altitude() {
        if (coordinates().size() < 3) {
            return Double.NaN;
        }
        return coordinates().get(2).doubleValue();
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
        if (obj instanceof Point) {
            Point point = (Point) obj;
            if (this.type.equals(point.type()) && ((boundingBox = this.bbox) != null ? boundingBox.equals(point.bbox()) : point.bbox() == null) && this.coordinates.equals(point.coordinates())) {
                return true;
            }
        }
        return false;
    }

    public boolean hasAltitude() {
        return !Double.isNaN(altitude());
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        return ((iHashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003) ^ this.coordinates.hashCode();
    }

    public double latitude() {
        return coordinates().get(1).doubleValue();
    }

    public double longitude() {
        return coordinates().get(0).doubleValue();
    }

    @Override // com.mapbox.geojson.GeoJson
    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        return gsonBuilder.create().toJson(this);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("Point{type=");
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

    public static final class GsonTypeAdapter extends BaseGeometryTypeAdapter<Point, List<Double>> {
        public GsonTypeAdapter(Gson gson) {
            super(gson, new ListOfDoublesCoordinatesTypeAdapter());
        }

        @Override // com.mapbox.geojson.BaseGeometryTypeAdapter
        public CoordinateContainer<List<Double>> createCoordinateContainer(String str, BoundingBox boundingBox, List<Double> list) {
            if (str == null) {
                str = Point.TYPE;
            }
            return new Point(str, boundingBox, list);
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public Point read2(JsonReader jsonReader) {
            return (Point) readCoordinateContainer(jsonReader);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Point point) {
            writeCoordinateContainer(jsonWriter, point);
        }
    }

    @Override // com.mapbox.geojson.CoordinateContainer
    public List<Double> coordinates() {
        return this.coordinates;
    }

    public static Point fromLngLat(double d14, double d15, BoundingBox boundingBox) {
        return new Point(TYPE, boundingBox, CoordinateShifterManager.getCoordinateShifter().shiftLonLat(d14, d15));
    }

    public static Point fromLngLat(double d14, double d15, double d16) {
        return new Point(TYPE, null, CoordinateShifterManager.getCoordinateShifter().shiftLonLatAlt(d14, d15, d16));
    }

    public static Point fromLngLat(double d14, double d15, double d16, BoundingBox boundingBox) {
        return new Point(TYPE, boundingBox, CoordinateShifterManager.getCoordinateShifter().shiftLonLatAlt(d14, d15, d16));
    }

    public static Point fromLngLat(double d14, double d15) {
        return new Point(TYPE, null, CoordinateShifterManager.getCoordinateShifter().shiftLonLat(d14, d15));
    }
}
