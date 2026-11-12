package com.mapbox.geojson;

import androidx.annotation.Keep;
import com.garmin.android.gncs.NotificationConstants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import j20.x;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;
import u62.z;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class GeometryCollection implements Geometry {
    private static final String TYPE = "GeometryCollection";
    private final BoundingBox bbox;
    private final List<Geometry> geometries;
    private final String type;

    public static final class GsonTypeAdapter extends TypeAdapter<GeometryCollection> {
        private volatile TypeAdapter<BoundingBox> boundingBoxTypeAdapter;
        private final Gson gson;
        private volatile TypeAdapter<List<Geometry>> listGeometryAdapter;
        private volatile TypeAdapter<String> stringTypeAdapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public GeometryCollection read2(JsonReader jsonReader) throws IOException {
            String str = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            BoundingBox boundingBox = null;
            List<Geometry> list = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    strNextName.getClass();
                    switch (strNextName) {
                        case "bbox":
                            TypeAdapter<BoundingBox> adapter = this.boundingBoxTypeAdapter;
                            if (adapter == null) {
                                adapter = this.gson.getAdapter(BoundingBox.class);
                                this.boundingBoxTypeAdapter = adapter;
                            }
                            boundingBox = adapter.read2(jsonReader);
                            break;
                        case "type":
                            TypeAdapter<String> adapter2 = this.stringTypeAdapter;
                            if (adapter2 == null) {
                                adapter2 = this.gson.getAdapter(String.class);
                                this.stringTypeAdapter = adapter2;
                            }
                            str = adapter2.read2(jsonReader);
                            break;
                        case "geometries":
                            TypeAdapter<List<Geometry>> adapter3 = this.listGeometryAdapter;
                            if (adapter3 == null) {
                                adapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Geometry.class));
                                this.listGeometryAdapter = adapter3;
                            }
                            list = adapter3.read2(jsonReader);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                } else {
                    jsonReader.nextNull();
                }
            }
            jsonReader.endObject();
            if (str == null) {
                str = GeometryCollection.TYPE;
            }
            return new GeometryCollection(str, boundingBox, list);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, GeometryCollection geometryCollection) {
            if (geometryCollection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name(NotificationConstants.KEY_DATA_MIME_TYPE);
            if (geometryCollection.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter = this.stringTypeAdapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.stringTypeAdapter = adapter;
                }
                adapter.write(jsonWriter, geometryCollection.type());
            }
            jsonWriter.name("bbox");
            if (geometryCollection.bbox() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<BoundingBox> adapter2 = this.boundingBoxTypeAdapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(BoundingBox.class);
                    this.boundingBoxTypeAdapter = adapter2;
                }
                adapter2.write(jsonWriter, geometryCollection.bbox());
            }
            jsonWriter.name("geometries");
            if (geometryCollection.geometries() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Geometry>> adapter3 = this.listGeometryAdapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Geometry.class));
                    this.listGeometryAdapter = adapter3;
                }
                adapter3.write(jsonWriter, geometryCollection.geometries());
            }
            jsonWriter.endObject();
        }
    }

    public GeometryCollection(String str, BoundingBox boundingBox, List<Geometry> list) {
        if (str == null) {
            x.l("Null type");
            throw null;
        }
        this.type = str;
        this.bbox = boundingBox;
        if (list != null) {
            this.geometries = list;
        } else {
            x.l("Null geometries");
            throw null;
        }
    }

    public static GeometryCollection fromGeometries(List<Geometry> list) {
        return new GeometryCollection(TYPE, null, list);
    }

    public static GeometryCollection fromGeometry(Geometry geometry) {
        return new GeometryCollection(TYPE, null, Arrays.asList(geometry));
    }

    public static GeometryCollection fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapterFactory(GeometryAdapterFactory.create());
        return (GeometryCollection) gsonBuilder.create().fromJson(str, GeometryCollection.class);
    }

    public static TypeAdapter<GeometryCollection> typeAdapter(Gson gson) {
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
        if (obj instanceof GeometryCollection) {
            GeometryCollection geometryCollection = (GeometryCollection) obj;
            if (this.type.equals(geometryCollection.type()) && ((boundingBox = this.bbox) != null ? boundingBox.equals(geometryCollection.bbox()) : geometryCollection.bbox() == null) && this.geometries.equals(geometryCollection.geometries())) {
                return true;
            }
        }
        return false;
    }

    public List<Geometry> geometries() {
        return this.geometries;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        return ((iHashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003) ^ this.geometries.hashCode();
    }

    @Override // com.mapbox.geojson.GeoJson
    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapterFactory(GeometryAdapterFactory.create());
        return gsonBuilder.create().toJson(this);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("GeometryCollection{type=");
        sb3.append(this.type);
        sb3.append(", bbox=");
        sb3.append(this.bbox);
        sb3.append(", geometries=");
        return z.c(sb3, this.geometries, StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // com.mapbox.geojson.GeoJson
    public String type() {
        return this.type;
    }

    public static GeometryCollection fromGeometries(List<Geometry> list, BoundingBox boundingBox) {
        return new GeometryCollection(TYPE, boundingBox, list);
    }

    public static GeometryCollection fromGeometry(Geometry geometry, BoundingBox boundingBox) {
        return new GeometryCollection(TYPE, boundingBox, Arrays.asList(geometry));
    }
}
