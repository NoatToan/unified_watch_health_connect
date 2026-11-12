package com.mapbox.geojson;

import androidx.annotation.Keep;
import com.garmin.android.gncs.NotificationConstants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.gson.BoundingBoxTypeAdapter;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import j20.x;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;
import u62.z;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class FeatureCollection implements GeoJson {
    private static final String TYPE = "FeatureCollection";

    @JsonAdapter(BoundingBoxTypeAdapter.class)
    private final BoundingBox bbox;
    private final List<Feature> features;
    private final String type;

    public static final class GsonTypeAdapter extends TypeAdapter<FeatureCollection> {
        private volatile TypeAdapter<BoundingBox> boundingBoxAdapter;
        private final Gson gson;
        private volatile TypeAdapter<List<Feature>> listFeatureAdapter;
        private volatile TypeAdapter<String> stringAdapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public FeatureCollection read2(JsonReader jsonReader) throws IOException {
            String str = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            BoundingBox boundingBox = null;
            List<Feature> list = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    strNextName.getClass();
                    switch (strNextName) {
                        case "features":
                            TypeAdapter<List<Feature>> adapter = this.listFeatureAdapter;
                            if (adapter == null) {
                                adapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, Feature.class));
                                this.listFeatureAdapter = adapter;
                            }
                            list = adapter.read2(jsonReader);
                            break;
                        case "bbox":
                            TypeAdapter<BoundingBox> adapter2 = this.boundingBoxAdapter;
                            if (adapter2 == null) {
                                adapter2 = this.gson.getAdapter(BoundingBox.class);
                                this.boundingBoxAdapter = adapter2;
                            }
                            boundingBox = adapter2.read2(jsonReader);
                            break;
                        case "type":
                            TypeAdapter<String> adapter3 = this.stringAdapter;
                            if (adapter3 == null) {
                                adapter3 = this.gson.getAdapter(String.class);
                                this.stringAdapter = adapter3;
                            }
                            str = adapter3.read2(jsonReader);
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
            return new FeatureCollection(str, boundingBox, list);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, FeatureCollection featureCollection) {
            if (featureCollection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name(NotificationConstants.KEY_DATA_MIME_TYPE);
            if (featureCollection.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter = this.stringAdapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.stringAdapter = adapter;
                }
                adapter.write(jsonWriter, featureCollection.type());
            }
            jsonWriter.name("bbox");
            if (featureCollection.bbox() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<BoundingBox> adapter2 = this.boundingBoxAdapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(BoundingBox.class);
                    this.boundingBoxAdapter = adapter2;
                }
                adapter2.write(jsonWriter, featureCollection.bbox());
            }
            jsonWriter.name("features");
            if (featureCollection.features() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Feature>> adapter3 = this.listFeatureAdapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Feature.class));
                    this.listFeatureAdapter = adapter3;
                }
                adapter3.write(jsonWriter, featureCollection.features());
            }
            jsonWriter.endObject();
        }
    }

    public FeatureCollection(String str, BoundingBox boundingBox, List<Feature> list) {
        if (str == null) {
            x.l("Null type");
            throw null;
        }
        this.type = str;
        this.bbox = boundingBox;
        this.features = list;
    }

    public static FeatureCollection fromFeature(Feature feature) {
        return new FeatureCollection(TYPE, null, Arrays.asList(feature));
    }

    public static FeatureCollection fromFeatures(Feature[] featureArr) {
        return new FeatureCollection(TYPE, null, Arrays.asList(featureArr));
    }

    public static FeatureCollection fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapterFactory(GeometryAdapterFactory.create());
        return (FeatureCollection) gsonBuilder.create().fromJson(str, FeatureCollection.class);
    }

    public static TypeAdapter<FeatureCollection> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    @Override // com.mapbox.geojson.GeoJson
    public BoundingBox bbox() {
        return this.bbox;
    }

    public boolean equals(Object obj) {
        BoundingBox boundingBox;
        List<Feature> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FeatureCollection) {
            FeatureCollection featureCollection = (FeatureCollection) obj;
            if (this.type.equals(featureCollection.type()) && ((boundingBox = this.bbox) != null ? boundingBox.equals(featureCollection.bbox()) : featureCollection.bbox() == null) && ((list = this.features) != null ? list.equals(featureCollection.features()) : featureCollection.features() == null)) {
                return true;
            }
        }
        return false;
    }

    public List<Feature> features() {
        return this.features;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        int iHashCode2 = (iHashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003;
        List<Feature> list = this.features;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // com.mapbox.geojson.GeoJson
    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapterFactory(GeometryAdapterFactory.create());
        return gsonBuilder.create().toJson(this);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("FeatureCollection{type=");
        sb3.append(this.type);
        sb3.append(", bbox=");
        sb3.append(this.bbox);
        sb3.append(", features=");
        return z.c(sb3, this.features, StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // com.mapbox.geojson.GeoJson
    public String type() {
        return this.type;
    }

    public static FeatureCollection fromFeatures(List<Feature> list) {
        return new FeatureCollection(TYPE, null, list);
    }

    public static FeatureCollection fromFeatures(Feature[] featureArr, BoundingBox boundingBox) {
        return new FeatureCollection(TYPE, boundingBox, Arrays.asList(featureArr));
    }

    public static FeatureCollection fromFeatures(List<Feature> list, BoundingBox boundingBox) {
        return new FeatureCollection(TYPE, boundingBox, list);
    }

    public static FeatureCollection fromFeature(Feature feature, BoundingBox boundingBox) {
        return new FeatureCollection(TYPE, boundingBox, Arrays.asList(feature));
    }
}
